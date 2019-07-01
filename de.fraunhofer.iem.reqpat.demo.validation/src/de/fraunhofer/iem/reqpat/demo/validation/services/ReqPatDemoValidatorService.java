package de.fraunhofer.iem.reqpat.demo.validation.services;

import java.text.MessageFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import de.fraunhofer.iem.reqpat.core.interfaces.IMarker;
import de.fraunhofer.iem.reqpat.core.interfaces.IMarker.Severity;
import de.fraunhofer.iem.reqpat.core.interfaces.IReqPatResource;
import de.fraunhofer.iem.reqpat.core.interfaces.IValidationService;
import de.fraunhofer.iem.reqpat.core.interfaces.IValidatorService;
import de.fraunhofer.iem.reqpat.core.model.FreeTextSpecObject;
import de.fraunhofer.iem.reqpat.core.model.SpecObject;
import de.fraunhofer.iem.reqpat.core.model.Specification;
import de.fraunhofer.iem.reqpat.core.validation.util.Marker;
import de.fraunhofer.iem.reqpat.demo.model.NamedElement;

/**
 * 
 * @author Frederik Knust, $LastChangedBy: fkl $
 * @version $Rev: 93 $, $Date: 2014-05-05 17:47:54 +0200 (Mo, 05 Mai 2014) $
 */
public class ReqPatDemoValidatorService implements IValidatorService {
	private static final int NOOFTASKS = 1;

	private static final Pattern variablePattern = Pattern
			.compile("'([^' ]+)'");

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

	/**
	 * This method fetches all variables (NamedElements) from the requirements
	 * model.
	 * 
	 * @param root
	 *            The requirements model root.
	 * @return A set of Strings containing all named elements.
	 */
	private static Set<String> getVariables(Specification root) {
		Set<String> variables = new HashSet<String>();

		if (root == null)
			return variables;

		TreeIterator<EObject> treeIterator = root.eAllContents();

		while (treeIterator.hasNext()) {
			EObject eObject = treeIterator.next();

			if (eObject instanceof NamedElement) {
				variables.add(((NamedElement) eObject).getName());
			}
		}

		return variables;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.fraunhofer.iem.reqpat.core.interfaces.IValidatorService#getNumberOfTasks
	 * ()
	 */
	@Override
	public int getNumberOfTasks() {
		return NOOFTASKS;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.fraunhofer.iem.reqpat.core.interfaces.IValidatorService#
	 * performExtendedChecks
	 * (de.fraunhofer.iem.reqpat.core.interfaces.IReqPatResource, int,
	 * org.eclipse.core.runtime.IProgressMonitor, java.util.List)
	 */
	@Override
	public void performExtendedChecks(IReqPatResource reqPatResource,
			int errorLevel, IProgressMonitor monitor, List<IMarker> markers) {
		Assert.isNotNull(reqPatResource);
		Assert.isNotNull(monitor);
		Assert.isNotNull(markers);

		if (errorLevel < IValidationService.ERRORLEVEL_NOCOMPLEX) {
			monitor.worked(NOOFTASKS);
			return;
		}

		performFreeTextChecks(reqPatResource, monitor, markers);
	}

	private void performFreeTextChecks(IReqPatResource reqPatResource,
			IProgressMonitor monitor, List<IMarker> markers) {
		/*
		 * Check if there is an error in the requirement definition.
		 */
		for (IMarker marker : markers) {
			if (marker.getSeverity() == Severity.ERROR) {
				createMarker(
						markers,
						Severity.WARNING,
						"The free text requirements have not been checked, as there are errors in the requirement definitions.",
						null);

				monitor.worked(1);
				return;
			}
		}

		monitor.subTask("Checking variable references in free text requirements...");

		if (reqPatResource.asXtextResource().getContents().isEmpty()) {
			monitor.worked(1);
			return;
		}

		EObject eObject = reqPatResource.asXtextResource().getContents().get(0);

		if (!(eObject instanceof Specification)) {
			throw new RuntimeException("Model is not of type 'Specification'.");
		}

		Specification specification = (Specification) eObject;

		Set<String> variables = getVariables(specification);

		for (SpecObject specObject : specification.getSpecObjects()) {
			if (!(specObject instanceof FreeTextSpecObject))
				continue;

			FreeTextSpecObject freeTextSpecObject = (FreeTextSpecObject) specObject;
			if (freeTextSpecObject.getFreeText() == null)
				continue;

			Matcher matcher = variablePattern.matcher(freeTextSpecObject
					.getFreeText());

			/*
			 * Check if the variables are defined somewhere else in the
			 * document.
			 */
			while (matcher.find()) {
				String variable = matcher.group(1);

				if (variable != null && variable.length() > 0) {
					if (!variables.contains(variable)) {

						createMarker(
								markers,
								IMarker.Severity.WARNING,
								MessageFormat
										.format("Couldn''t resolve reference to ''{0}''.",
												variable),
								freeTextSpecObject.getId());
					}
				}
			}
		}

		monitor.worked(1);
	}
}
