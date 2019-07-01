package de.fraunhofer.iem.reqpat.demo.ui.documentation;

import java.text.MessageFormat;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;

import de.fraunhofer.iem.reqpat.demo.model.AnalysisFunction;
import de.fraunhofer.iem.reqpat.demo.model.AnalysisFunctionPurpose;
import de.fraunhofer.iem.reqpat.demo.model.FunctionalDevice;
import de.fraunhofer.iem.reqpat.demo.model.IncomingInformationDefinition;
import de.fraunhofer.iem.reqpat.demo.model.Information;
import de.fraunhofer.iem.reqpat.demo.model.OutgoingInformationDefinition;

/**
 * 
 * @author Frederik Knust, $LastChangedBy: fkl $
 * @version $Rev: 128 $, $Date: 2015-01-14 10:21:20 +0100 (Mi, 14 Jan 2015) $
 */
public class ReqPatDemoDocumentationProvider implements
		IEObjectDocumentationProvider {

	private static final String PURPOSE_ANALYSIS_FUNCTION = "<p>The purpose of the function <b>{0}</b> is: <b>{1}</b>.</p>";

	private static final String SUB_ANALYSIS_FUNCTION = "<p>The function <b>{0}</b> is a sub-function of the function <b>{1}</b>.</p>";

	private static final String PURPOSE_FUNCTIONAL_DEVICE = "<p>The purpose of the functional device <b>{0}</b> is: <b>{1}</b>.</p>";

	private static final String INCOMING_INFORMATION = "<p>The information <b>{0}</b> is received by the function <b>{1}</b> from the functional device <b>{2}</b>.</p>";

	private static final String OUTGOING_INFORMATION = "<p>The information <b>{0}</b> is sent from the function <b>{1}</b> to the functional device <b>{2}</b>.</p>";

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.xtext.documentation.IEObjectDocumentationProvider#
	 * getDocumentation(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public String getDocumentation(EObject o) {
		StringBuilder sb = new StringBuilder();

		if (o instanceof AnalysisFunction) {
			AnalysisFunction analysisFunction = (AnalysisFunction) o;

			// check if the analysis function is a sub analysis function
			if (analysisFunction.getParentAnalysisFunction() == null) {
				sb.append("<i>A function describes the functionalities of the \"system under development\" on the analysis level.</i>");

				String purpose = getPurpose(analysisFunction);
				if (purpose != null && purpose.length() > 0) {
					sb.append(MessageFormat.format(PURPOSE_ANALYSIS_FUNCTION,
							analysisFunction.getName(), purpose));
				}
			} else {
				sb.append("<i>A sub-function describes a subset of the functionalities of its parent function in more detail.</i>");
				sb.append(MessageFormat.format(SUB_ANALYSIS_FUNCTION,
						analysisFunction.getName(), analysisFunction
								.getParentAnalysisFunction().getName()));

				String purpose = getPurpose(analysisFunction);
				if (purpose != null && purpose.length() > 0) {
					sb.append(MessageFormat.format(PURPOSE_ANALYSIS_FUNCTION,
							analysisFunction.getName(), purpose));
				}
			}
		} else if (o instanceof FunctionalDevice) {
			FunctionalDevice functionalDevice = (FunctionalDevice) o;

			sb.append("<i>A functional device represents an external sensor or actuator that communicates with a function.</i>");
			sb.append(MessageFormat.format(PURPOSE_FUNCTIONAL_DEVICE,
					functionalDevice.getName(), functionalDevice.getPurpose()));
		} else if (o instanceof Information) {
			Information information = (Information) o;

			sb.append("<i>Abstract information that is exchanged between a function and a functional device.</i>");

			if (information.eContainer() instanceof IncomingInformationDefinition) {
				IncomingInformationDefinition incomingInformationDefinition = (IncomingInformationDefinition) information
						.eContainer();

				sb.append(MessageFormat.format(
						INCOMING_INFORMATION,
						information.getName(),
						incomingInformationDefinition.getAnalysisFunction() != null ? incomingInformationDefinition
								.getAnalysisFunction().getName() : "UNDEFINED",
						incomingInformationDefinition.getFunctionalDevice() != null ? incomingInformationDefinition
								.getFunctionalDevice().getName() : "UNDEFINED"));
			} else if (information.eContainer() instanceof OutgoingInformationDefinition) {
				OutgoingInformationDefinition outgoingInformationDefinition = (OutgoingInformationDefinition) information
						.eContainer();

				sb.append(MessageFormat.format(
						OUTGOING_INFORMATION,
						information.getName(),
						outgoingInformationDefinition.getAnalysisFunction() != null ? outgoingInformationDefinition
								.getAnalysisFunction().getName() : "UNDEFINED",
						outgoingInformationDefinition.getFunctionalDevice() != null ? outgoingInformationDefinition
								.getFunctionalDevice().getName() : "UNDEFINED"));
			}
		}

		return sb.length() > 0 ? sb.toString() : null;
	}

	private String getPurpose(AnalysisFunction func) {
		Resource resource = func.eResource();
		if (resource != null) {
			TreeIterator<EObject> it = resource.getAllContents();
			while (it.hasNext()) {
				EObject obj = it.next();
				if (obj instanceof AnalysisFunctionPurpose
						&& func == ((AnalysisFunctionPurpose) obj)
								.getAnalysisFunction()) {
					return ((AnalysisFunctionPurpose) obj).getPurpose();
				}
			}
		}
		return null;
	}

}
