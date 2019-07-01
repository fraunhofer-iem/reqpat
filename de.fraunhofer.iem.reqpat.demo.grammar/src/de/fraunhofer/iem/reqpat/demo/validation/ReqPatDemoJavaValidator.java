package de.fraunhofer.iem.reqpat.demo.validation;

import java.text.MessageFormat;
import java.util.Hashtable;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;

import de.fraunhofer.iem.reqpat.core.model.Specification;
import de.fraunhofer.iem.reqpat.demo.model.AnalysisFunction;
import de.fraunhofer.iem.reqpat.demo.model.AnalysisFunctionDefinition;
import de.fraunhofer.iem.reqpat.demo.model.AnalysisFunctionPurpose;
import de.fraunhofer.iem.reqpat.demo.model.DemoModelPackage;
import de.fraunhofer.iem.reqpat.demo.model.FunctionalDevice;
import de.fraunhofer.iem.reqpat.demo.model.IncomingInformationDefinition;
import de.fraunhofer.iem.reqpat.demo.model.Information;
import de.fraunhofer.iem.reqpat.demo.model.InformationCreation;
import de.fraunhofer.iem.reqpat.demo.model.InformationUsage;
import de.fraunhofer.iem.reqpat.demo.model.NamedElement;
import de.fraunhofer.iem.reqpat.demo.model.OutgoingInformationDefinition;
import de.fraunhofer.iem.reqpat.demo.model.SubAnalysisFunctionDefinition;

/**
 * 
 * @author Frederik Knust, $LastChangedBy: fkl $
 * @version $Rev: 180 $, $Date: 2015-08-20 10:15:33 +0200 (Do, 20 Aug 2015) $
 */
public class ReqPatDemoJavaValidator extends AbstractReqPatDemoJavaValidator {

	public static final String ANALYSIS_FUNCTION_NOT_FOUND = "Unable to find function! Define it first using the pattern "
			+ "\"The function NAME is a subfunction of...\" or \"The top-level function...\".";

	public static final String FUNCTIONAL_DEVICE_NOT_FOUND = "Unable to find functional device! Define it first using the following pattern: "
			+ "\"The functional device NAME...\".";

	public static final String INFORMATION_NOT_FOUND = "Unable to find information! Define it first using the following pattern: "
			+ "\"The following information is (received by | sent from) the function NAME...\".";

	public static final String NAME_NOT_UNIQUE = "There already exists {0} with the name {1}.";

	public static final String ANALYSIS_FUNCTION_IS_SELFPARENT = "The function {0} cannot be a subfunction of itself!";

	public static final String ANALYSIS_FUNCTION = "a function";

	public static final String FUNCTIONAL_DEVICE = "a functional device";

	public static final String INFORMATION = "an information";

	@Check
	public void checkAnalysisFunctionPurpose(AnalysisFunctionPurpose afPurpose) {
		if (afPurpose.getAnalysisFunction() == null
				|| afPurpose.getAnalysisFunction().getName() == null
				|| afPurpose.getAnalysisFunction().getName().length() == 0) {
			error(ANALYSIS_FUNCTION_NOT_FOUND,
					DemoModelPackage.Literals.ANALYSIS_FUNCTION_PURPOSE__ANALYSIS_FUNCTION);
		}
	}

	@Check
	public void checkIncomingInformationDefinition(
			IncomingInformationDefinition def) {

		// check if a valid analysis function is referenced
		if (def.getAnalysisFunction() == null
				|| def.getAnalysisFunction().getName() == null
				|| def.getAnalysisFunction().getName().length() == 0) {
			error(ANALYSIS_FUNCTION_NOT_FOUND,
					DemoModelPackage.Literals.INCOMING_INFORMATION_DEFINITION__ANALYSIS_FUNCTION);
		}

		// check if a valid functional device is referenced
		if (def.getFunctionalDevice() != null
				&& (def.getFunctionalDevice().getName() == null || def
						.getFunctionalDevice().getName().length() == 0)) {
			error(FUNCTIONAL_DEVICE_NOT_FOUND,
					DemoModelPackage.Literals.INCOMING_INFORMATION_DEFINITION__FUNCTIONAL_DEVICE);
		}
	}

	@Check
	public void checkInformationCreation(InformationCreation informationCreation) {
		if (informationCreation.getAnalysisFunction() == null
				|| informationCreation.getAnalysisFunction().getName() == null
				|| informationCreation.getAnalysisFunction().getName().length() == 0) {

			error(ANALYSIS_FUNCTION_NOT_FOUND,
					DemoModelPackage.Literals.INFORMATION_CREATION__ANALYSIS_FUNCTION);
		}

		for (Information information : informationCreation.getInformationList()) {
			if (information.getName() == null
					|| information.getName().length() == 0) {
				error(INFORMATION_NOT_FOUND,
						DemoModelPackage.Literals.INFORMATION_CREATION__INFORMATION_LIST,
						informationCreation.getInformationList().indexOf(
								information));
			}
		}
	}

	@Check
	public void checkInformationUsage(InformationUsage informationUsage) {
		if (informationUsage.getAnalysisFunction() == null
				|| informationUsage.getAnalysisFunction().getName() == null
				|| informationUsage.getAnalysisFunction().getName().length() == 0) {

			error(ANALYSIS_FUNCTION_NOT_FOUND,
					DemoModelPackage.Literals.INFORMATION_USAGE__ANALYSIS_FUNCTION);
		}

		for (Information information : informationUsage.getInformationList()) {
			if (information.getName() == null
					|| information.getName().length() == 0) {
				error(INFORMATION_NOT_FOUND,
						DemoModelPackage.Literals.INFORMATION_USAGE__INFORMATION_LIST,
						informationUsage.getInformationList().indexOf(
								information));
			}
		}
	}

	@Check
	public void checkNameUniqueness(Specification specification) {
		TreeIterator<EObject> it = specification.eAllContents();

		Map<String, EObject> names = new Hashtable<String, EObject>();

		while (it.hasNext()) {
			EObject next = it.next();

			if (next instanceof NamedElement) {
				String name = ((NamedElement) next).getName();

				if (names.containsKey(name)) {
					EObject previousDefinition = names.get(name);

					String previousDefinitionType = "";

					if (previousDefinition instanceof AnalysisFunction) {
						previousDefinitionType = ANALYSIS_FUNCTION;
					} else if (previousDefinition instanceof FunctionalDevice) {
						previousDefinitionType = FUNCTIONAL_DEVICE;
					} else if (previousDefinition instanceof Information) {
						previousDefinitionType = INFORMATION;
					}

					int index = 0;
					EStructuralFeature feature = null;

					if (next instanceof AnalysisFunction) {
						EObject container = next.eContainer();

						if (container instanceof AnalysisFunctionDefinition) {
							feature = DemoModelPackage.Literals.ANALYSIS_FUNCTION_DEFINITION__ANALYSIS_FUNCTION;
						} else if (container instanceof SubAnalysisFunctionDefinition) {
							feature = DemoModelPackage.Literals.SUB_ANALYSIS_FUNCTION_DEFINITION__ANALYSIS_FUNCTION;
						}
					} else if (next instanceof FunctionalDevice) {
						feature = DemoModelPackage.Literals.FUNCTIONAL_DEVICE_DEFINITION__FUNCTIONAL_DEVICE;
					} else if (next instanceof Information) {
						EObject container = next.eContainer();

						if (container instanceof IncomingInformationDefinition) {
							feature = DemoModelPackage.Literals.INCOMING_INFORMATION_DEFINITION__INFORMATION_LIST;
							index = ((IncomingInformationDefinition) container)
									.getInformationList().indexOf(next);
						} else if (container instanceof OutgoingInformationDefinition) {
							feature = DemoModelPackage.Literals.OUTGOING_INFORMATION_DEFINITION__INFORMATION_LIST;
							index = ((OutgoingInformationDefinition) container)
									.getInformationList().indexOf(next);
						}
					}

					if (feature != null) {
						error(MessageFormat.format(NAME_NOT_UNIQUE,
								previousDefinitionType, name),
								next.eContainer(), feature, index);
					} else {
						System.out
								.println(MessageFormat
										.format("Unable to find matching EStructuralFeature for name collision with name ''{0}''.",
												name));
					}
				} else {
					names.put(name, next);
				}
			}
		}
	}

	@Check
	public void checkOutgoingInformationDefinition(
			OutgoingInformationDefinition def) {

		// check if a valid analysis function is referenced
		if (def.getAnalysisFunction() == null
				|| def.getAnalysisFunction().getName() == null
				|| def.getAnalysisFunction().getName().length() == 0) {
			error(ANALYSIS_FUNCTION_NOT_FOUND,
					DemoModelPackage.Literals.OUTGOING_INFORMATION_DEFINITION__ANALYSIS_FUNCTION);
		}

		// check if a valid functional device is referenced
		if (def.getFunctionalDevice() != null
				&& (def.getFunctionalDevice().getName() == null || def
						.getFunctionalDevice().getName().length() == 0)) {
			error(FUNCTIONAL_DEVICE_NOT_FOUND,
					DemoModelPackage.Literals.OUTGOING_INFORMATION_DEFINITION__FUNCTIONAL_DEVICE);
		}
	}

	@Check
	public void checkSubAnalysisFunctionDefinition(
			SubAnalysisFunctionDefinition def) {
		if (def.getAnalysisFunction() == null)
			return;

		// Existing analysis function?
		AnalysisFunction analysisFunction = def.getAnalysisFunction();
		if (analysisFunction.getParentAnalysisFunction() == null
				|| analysisFunction.getParentAnalysisFunction().getName() == null
				|| analysisFunction.getParentAnalysisFunction().getName()
						.length() == 0) {
			error(ANALYSIS_FUNCTION_NOT_FOUND,
					analysisFunction,
					DemoModelPackage.Literals.ANALYSIS_FUNCTION__PARENT_ANALYSIS_FUNCTION,
					0);
		} else {
			// Analysis function cannot be a parent of itself!
			if (analysisFunction == analysisFunction
					.getParentAnalysisFunction()) {
				error(MessageFormat.format(ANALYSIS_FUNCTION_IS_SELFPARENT,
						analysisFunction.getName()),
						analysisFunction.getParentAnalysisFunction(),
						DemoModelPackage.Literals.ANALYSIS_FUNCTION__PARENT_ANALYSIS_FUNCTION,
						0);
			}
		}
	}

}
