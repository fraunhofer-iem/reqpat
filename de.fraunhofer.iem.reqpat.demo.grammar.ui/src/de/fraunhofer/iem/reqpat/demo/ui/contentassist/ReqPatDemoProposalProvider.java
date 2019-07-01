package de.fraunhofer.iem.reqpat.demo.ui.contentassist;

import java.text.MessageFormat;
import java.util.HashSet;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import de.fraunhofer.iem.reqpat.core.model.HeadingSpecObject;
import de.fraunhofer.iem.reqpat.core.model.RequirementPatternSpecObject;
import de.fraunhofer.iem.reqpat.core.model.SpecObject;
import de.fraunhofer.iem.reqpat.demo.model.AnalysisFunction;
import de.fraunhofer.iem.reqpat.demo.model.Function;
import de.fraunhofer.iem.reqpat.demo.model.FunctionalDevice;

/**
 * see
 * http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on
 * how to customize content assistant
 * 
 * @author Frederik Knust, $LastChangedBy: fkl $
 * @version $Rev: 101 $, $Date: 2015-01-05 13:47:36 +0100 (Mo, 05 Jan 2015) $
 */
public class ReqPatDemoProposalProvider extends
		AbstractReqPatDemoProposalProvider {

	private enum Chapter {
		ExternalElements, Subfunctions, InputsAndOutputs, Default
	}

	private static final String EXTERNALELEMENTS = "external elements";
	private static final String SUBFUNCTIONS = "subfunctions";
	private static final String INPUTS_AND_OUTPUTS = "inputs & outputs";

	private static final String ANALYSIS_FUNCTION_DEFINITION = "The top-level function is called {0}.";
	private static final String ANALYSIS_FUNCTION_PURPOSE = "The function {0} has the following purpose: \"PURPOSE\".";
	private static final String SUBFUNCTION_DEFINITION = "The function {0} is a subfunction of the function {1}.";
	private static final String INPUT_DEFINITION = "The following information is received by the function {0} from the functional device FUNCTIONALDEVICE: INFORMATIONLIST.";
	private static final String OUTPUT_DEFINITION = "The following information is sent from the function {0} to the functional device FUNCTIONALDEVICE: INFORMATIONLIST.";
	private static final String INPUT_DEFINITION2 = "The following information is received by the function {0}: INFORMATIONLIST.";
	private static final String OUTPUT_DEFINITION2 = "The following information is sent from the function {0}: INFORMATIONLIST.";
	private static final String INFORMATION_USAGE = "The following information is used by the function {0}: INFORMATIONLIST.";
	private static final String INFORMATION_CREATION = "The following information is created by the function {0}: INFORMATIONLIST.";
	private static final String FUNCTIONAL_DEVICE_DEFINTION = "The functional device FUNCTIONALDEVICE has the following purpose: \"PURPOSE\".";

	private HashSet<String> analysisFunctions = new HashSet<String>();
	private HashSet<String> devices = new HashSet<String>();

	/**
	 * Add a proposal to the content-assist pop up.
	 * 
	 * @param proposal
	 *            The proposal to add.
	 * @param context
	 * @param acceptor
	 */
	private void addProposal(String proposal, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		acceptor.accept(createCompletionProposal(proposal, context));
	}

	@Override
	public void completeReqPatSO_RequirementPatterns(EObject model,
			Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		super.completeReqPatSO_RequirementPatterns(model, assignment, context,
				acceptor);

		if (context.getPreviousModel() instanceof RequirementPatternSpecObject) {
			SpecObject specObject = (SpecObject) context.getPreviousModel();

			String name = null;
			String parent = null;
			Chapter chapter = Chapter.Default;

			// update list of function names
			updateFunctionNames(model);

			while (specObject.getParentSpecObject() != null) {
				boolean foundChapter = false;
				SpecObject parentSpecObject = specObject.getParentSpecObject();

				if (parentSpecObject instanceof HeadingSpecObject) {
					String heading = ((HeadingSpecObject) parentSpecObject)
							.getText();

					if (heading != null && heading.length() > 0) {
						heading = heading.trim();

						if (chapter == Chapter.Default) {
							if (heading.toLowerCase().equals(SUBFUNCTIONS)) {
								chapter = Chapter.Subfunctions;
								foundChapter = true;
							} else if (heading.toLowerCase().equals(
									INPUTS_AND_OUTPUTS)) {
								chapter = Chapter.InputsAndOutputs;
								foundChapter = true;
							} else if (heading.toLowerCase().equals(
									EXTERNALELEMENTS)) {
								chapter = Chapter.ExternalElements;
								break; // stop here
							}
						}

						if (!foundChapter) {
							heading = heading.replace(" ", "")
									.replace("\"", "");
							if (name == null) {
								/*
								 * The chapter's caption does not match any
								 * predefined structure, so assume its the name
								 * of the system.
								 */
								name = heading;
							} else if (parent == null
									&& analysisFunctions.contains(heading)) {
								/*
								 * A name has already been found, so assume that
								 * the next name is the name of the parent.
								 */
								parent = heading;
								break; // stop here
							}
						}
					}
				}

				specObject = parentSpecObject;
			}

			switch (chapter) {
			case Subfunctions: {
				addProposal(MessageFormat.format(SUBFUNCTION_DEFINITION,
						name != null ? name : "NAME", parent != null ? parent
								: "PARENTANALYSISFUNCTION"), context, acceptor);
				addProposal(MessageFormat.format(ANALYSIS_FUNCTION_PURPOSE,
						name != null ? name : "NAME"), context, acceptor);
				break;
			}
			case InputsAndOutputs: {
				if (parent == null) {
					// top level analysis function
					addProposal(MessageFormat.format(INPUT_DEFINITION2,
							name != null ? name : "ANALYSISFUNCTION"), context,
							acceptor);
					addProposal(MessageFormat.format(INPUT_DEFINITION,
							name != null ? name : "ANALYSISFUNCTION"), context,
							acceptor);
					addProposal(MessageFormat.format(OUTPUT_DEFINITION,
							name != null ? name : "ANALYSISFUNCTION"), context,
							acceptor);
					addProposal(MessageFormat.format(OUTPUT_DEFINITION2,
							name != null ? name : "ANALYSISFUNCTION"), context,
							acceptor);
				} else {
					// sub-analysis function
					addProposal(MessageFormat.format(INFORMATION_USAGE,
							name != null ? name : "ANALYSISFUNCTION"), context,
							acceptor);
					addProposal(MessageFormat.format(INFORMATION_CREATION,
							name != null ? name : "ANALYSISFUNCTION"), context,
							acceptor);
				}
				break;
			}
			case ExternalElements: {
				addProposal(FUNCTIONAL_DEVICE_DEFINTION, context, acceptor);
				break;
			}
			default: {
				if (name != null) {
					addProposal(MessageFormat.format(
							ANALYSIS_FUNCTION_DEFINITION, name), context,
							acceptor);
					addProposal(MessageFormat.format(ANALYSIS_FUNCTION_PURPOSE,
							name), context, acceptor);
				}
			}
			}
		}
	}

	/**
	 * Find all functions in the model containing the given EObject.
	 * 
	 * @param src
	 */
	private void updateFunctionNames(EObject src) {
		analysisFunctions.clear();
		devices.clear();

		TreeIterator<EObject> it = src.eResource().getAllContents();
		while (it.hasNext()) {
			EObject eObj = it.next();
			if (eObj instanceof Function) {
				String name = ((Function) eObj).getName();
				if (eObj instanceof AnalysisFunction) {
					analysisFunctions.add(name);
				} else if (eObj instanceof FunctionalDevice) {
					devices.add(name);
				}
			}
		}
	}
}
