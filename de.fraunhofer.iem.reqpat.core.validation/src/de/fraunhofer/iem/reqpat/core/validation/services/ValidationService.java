package de.fraunhofer.iem.reqpat.core.validation.services;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xtext.diagnostics.AbstractDiagnostic;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.validation.AbstractValidationDiagnostic;

import com.google.inject.Inject;

import de.fraunhofer.iem.reqpat.core.interfaces.IMarker;
import de.fraunhofer.iem.reqpat.core.interfaces.IReqPatResource;
import de.fraunhofer.iem.reqpat.core.interfaces.IValidationService;
import de.fraunhofer.iem.reqpat.core.interfaces.IValidatorService;
import de.fraunhofer.iem.reqpat.core.model.Specification;
import de.fraunhofer.iem.reqpat.core.validation.Activator;
import de.fraunhofer.iem.reqpat.core.validation.util.Marker;

/**
 * 
 * @author Markus Fockel, $LastChangedBy: fkl $
 * @version $Rev: 93 $, $Date: 2014-05-05 17:47:54 +0200 (Mo, 05 Mai 2014) $
 */
public class ValidationService implements IValidationService {
	private static final String PARAMDELIMITERLEFT = "\\[";
	private static final String PARAMDELIMITERRIGHT = "\\]";
	private static final String SPECOBJECTDELIMITERLEFT = "\\{";
	private static final String SPECOBJECTDELIMITERRIGHT = "\\}";

	private static final String RPPREFIX = SPECOBJECTDELIMITERLEFT
			+ PARAMDELIMITERLEFT + "RP" + PARAMDELIMITERRIGHT
			+ PARAMDELIMITERLEFT;

	private final Pattern rpPattern = Pattern.compile(RPPREFIX + "("
			+ PARAMDELIMITERLEFT + "[^" + PARAMDELIMITERRIGHT + "]*"
			+ PARAMDELIMITERRIGHT + ")+([^" + SPECOBJECTDELIMITERRIGHT + "]*)"
			+ SPECOBJECTDELIMITERRIGHT);

	private Set<IValidatorService> validators;

	/**
	 * Setter for the extended checks which will be performed after the regular
	 * checks.
	 * 
	 * @param validators
	 *            the extended checks
	 */
	@Inject(optional = true)
	public void setValidators(Set<IValidatorService> validators) {
		this.validators = validators;
	}

	@Override
	public List<IMarker> validate(final IReqPatResource reqPatResource,
			final int errorLevel) {
		final List<IMarker> markers = new ArrayList<IMarker>();

		IRunnableWithProgress op = new IRunnableWithProgress() {
			@Override
			public void run(IProgressMonitor monitor)
					throws InvocationTargetException, InterruptedException {
				int nrOfTasks = 3;
				if (errorLevel >= ERRORLEVEL_NOCOMPLEX) {
					nrOfTasks += 3;
				}
				if (errorLevel >= ERRORLEVEL_ALL) {
					nrOfTasks += 1;
				}

				/*
				 * Add the tasks of the extended checks to the number of total
				 * tasks.
				 */
				if (validators != null) {
					int amountOfExtraTasks = 0;

					for (IValidatorService checkExtension : validators)
						amountOfExtraTasks += checkExtension.getNumberOfTasks();

					nrOfTasks += amountOfExtraTasks;
				}

				monitor.beginTask("Validating requirements...", nrOfTasks);

				monitor.subTask("Initializing...");

				if (reqPatResource == null) {
					throw new IllegalStateException(
							"Requirement resource is null.");
				}

				XtextResource resource = reqPatResource.asXtextResource();
				if (resource == null) {
					throw new IllegalStateException(
							"The Xtext resource has no requirements.");
				}

				if (resource.getContents() == null
						|| resource.getContents().size() == 0)
					return;

				EObject objRoot = resource.getContents().get(0);
				if (objRoot == null || !(objRoot instanceof Specification)) {
					return;
				}
				Specification specification = (Specification) objRoot;
				monitor.worked(1);

				monitor.subTask("Validating...");

				/*
				 * Run the Diagnostician before checking for errors, as it finds
				 * linking errors that would otherwise be unnoticed until the
				 * second call of checkDocument().
				 */
				Diagnostician.INSTANCE.validate(specification);
				monitor.worked(1);

				// check for missing quotes
				checkQuotes(reqPatResource, markers);
				monitor.worked(1);

				if (errorLevel >= ERRORLEVEL_NOCOMPLEX) {
					checkResourceErrors(resource, reqPatResource, markers);
					monitor.worked(1);

					checkResourceWarnings(resource, reqPatResource, markers);
					monitor.worked(1);

					/*
					 * Validate the model to get custom errors and warnings.
					 */
					checkXtextCustomValidation(specification, reqPatResource,
							markers);
					monitor.worked(1);
				}

				/*
				 * Run the extended checks.
				 */
				if (validators != null) {
					for (IValidatorService checkExtension : validators) {
						checkExtension.performExtendedChecks(reqPatResource,
								errorLevel, monitor, markers);
					}
				}

				monitor.done();
			}

		};
		try {
			long before = System.currentTimeMillis();

			new ProgressMonitorDialog(PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getShell())
					.run(false, true, op);

			long timeConsumed = System.currentTimeMillis() - before;
			System.out.println("Time for validation: " + timeConsumed + "ms");
		} catch (InvocationTargetException e) {
			Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
					e.getMessage(), e);

			StatusManager.getManager().handle(status, StatusManager.BLOCK);
		} catch (InterruptedException e) {
			Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
					e.getMessage(), e);

			StatusManager.getManager().handle(status, StatusManager.BLOCK);
		}

		return markers;
	}

	/**
	 * This method check whether each "opening" quote has a corresponding
	 * "closing" quote.
	 * 
	 * @param requirementResource
	 *            The requirement resource containing the requirements.
	 * @param markers
	 *            Found problems are added to this list of markers.
	 */
	private void checkQuotes(IReqPatResource requirementResource,
			List<IMarker> markers) {
		String requirements = requirementResource.asString();
		Matcher matcher = rpPattern.matcher(requirements);

		/*
		 * Check if there are no missing closing quotes.
		 */
		while (matcher.find()) {
			int grpNr = matcher.groupCount();
			if (grpNr > 0) {
				String reqText = matcher.group(grpNr);
				if (reqText != null && reqText.length() > 0) {
					// double quotes
					int cnt = 0;
					int curIndex = reqText.indexOf('"');
					while (curIndex > -1) {
						cnt++;
						curIndex = reqText.indexOf('"', curIndex + 1);
					}

					if (cnt % 2 != 0) {
						String location = requirementResource
								.getSpecObjectIdForOffset(matcher.start(grpNr));
						createMarker(markers, Marker.Severity.ERROR,
								"Missing closing \" (double quote).", location);
					}

					// single quotes
					// cnt = 0;
					// curIndex = reqText.indexOf('\'');
					// while (curIndex > -1) {
					// cnt++;
					// curIndex = reqText.indexOf('\'', curIndex + 1);
					// }
					//
					// if (cnt % 2 != 0) {
					// String location = requirementResource
					// .getSpecObjectIdForOffset(matcher.start(grpNr));
					// createMarker(markers, Marker.Severity.ERROR,
					// "Missing closing \' (single quote).", location);
					// }
				}
			}
		}
	}

	/**
	 * This method checks for errors in the Xtext resource.
	 * 
	 * @param resource
	 *            The xText resource.
	 * @param requirementResource
	 *            The requirement resource containing the requirements.
	 * @param markers
	 *            Found problems are added to this list of markers.
	 */
	private void checkResourceErrors(XtextResource resource,
			IReqPatResource requirementResource, List<IMarker> markers) {
		List<Diagnostic> errors = resource.getErrors();

		for (Diagnostic error : errors) {
			String identifier = null;

			if (error instanceof AbstractDiagnostic) {
				int offset = ((AbstractDiagnostic) error).getOffset();

				identifier = requirementResource
						.getSpecObjectIdForOffset(offset);
			}

			createMarker(markers, Marker.Severity.ERROR, error.getMessage(),
					identifier);
		}
	}

	/**
	 * This method checks for warnings in the xText resource.
	 * 
	 * @param resource
	 *            The xText resource.
	 * @param requirementResource
	 *            The requirement resource containing the requirements.
	 * @param markers
	 *            Found problems are added to this list of markers.
	 */
	private void checkResourceWarnings(XtextResource resource,
			IReqPatResource requirementResource, List<IMarker> markers) {
		List<Diagnostic> warnings = resource.getWarnings();

		for (Diagnostic warning : warnings) {
			String identifier = null;

			if (warning instanceof AbstractDiagnostic) {
				int offset = ((AbstractDiagnostic) warning).getOffset();

				identifier = requirementResource
						.getSpecObjectIdForOffset(offset);
			}

			createMarker(markers, Marker.Severity.WARNING,
					warning.getMessage(), identifier);
		}
	}

	/**
	 * This method runs the Diagnostician to check for custom rules.
	 * 
	 * @param specification
	 *            The root element of the requirements model.
	 * @param requirementResource
	 *            The requirement resource containing the requirements.
	 * @param markers
	 *            Found problems are added to this list of markers.
	 */
	private void checkXtextCustomValidation(Specification specification,
			IReqPatResource requirementResource, List<IMarker> markers) {
		org.eclipse.emf.common.util.Diagnostic diagnostic = Diagnostician.INSTANCE
				.validate(specification);

		if (diagnostic != null) {
			List<org.eclipse.emf.common.util.Diagnostic> children = diagnostic
					.getChildren();

			if (children != null) {
				for (org.eclipse.emf.common.util.Diagnostic child : children) {
					String identifier = null;

					if (child instanceof AbstractValidationDiagnostic) {
						/*
						 * The custom errors are attached to the actual model
						 * elements and not to the nodes. So the node has to be
						 * fetched first to get the total offset and the error
						 * location.
						 */
						EObject source = ((AbstractValidationDiagnostic) child)
								.getSourceEObject();

						INode node = NodeModelUtils.getNode(source);

						if (node != null) {
							identifier = requirementResource
									.getSpecObjectIdForOffset(node
											.getTotalOffset());
						}
					}

					if (identifier != null) {
						Marker.Severity severity = Marker.Severity.WARNING;

						switch (child.getSeverity()) {
						case org.eclipse.emf.common.util.Diagnostic.ERROR:
							severity = Marker.Severity.ERROR;
							break;
						case org.eclipse.emf.common.util.Diagnostic.WARNING:
							severity = Marker.Severity.WARNING;
							break;
						}

						createMarker(markers, severity, child.getMessage(),
								identifier);
					}
				}
			}
		}
	}

	/**
	 * Creates and adds a marker to the markers list.
	 * 
	 * @param markers
	 *            The markers list.
	 * @param severity
	 *            The severity of the problem (error or warning).
	 * @param message
	 *            The problem description.
	 * @param location
	 *            The location (id) of the problem.
	 */
	private static void createMarker(List<IMarker> markers,
			Marker.Severity severity, String message, String location) {
		IMarker marker = new Marker(location, message, severity);

		markers.add(marker);
	}

}
