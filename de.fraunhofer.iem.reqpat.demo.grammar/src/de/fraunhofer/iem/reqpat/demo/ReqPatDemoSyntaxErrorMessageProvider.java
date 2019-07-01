package de.fraunhofer.iem.reqpat.demo;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.diagnostics.Diagnostic;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.parser.antlr.SyntaxErrorMessageProvider;

import de.fraunhofer.iem.reqpat.core.model.RequirementPattern;
import de.fraunhofer.iem.reqpat.core.model.RequirementPatternSpecObject;
import de.fraunhofer.iem.reqpat.demo.model.NamedElement;

/**
 * 
 * @author Markus Fockel, $LastChangedBy: fkl $
 * @version $Rev: 46 $, $Date: 2013-07-23 17:51:55 +0200 (Di, 23 Jul 2013) $
 */
public class ReqPatDemoSyntaxErrorMessageProvider extends
		SyntaxErrorMessageProvider {
	// ReqPatSO errors
	private static final String NOVIABLEALTERNATIVE = "no viable alternative at input ";

	private static final String REQUIREDLOOPDIDNOTMATCHANYTHING = "required (...)+ loop did not match anything at input ";
	private static final String REQPAT_REQUIREDLOOPDIDNOTMATCHANYTHING = "No requirement pattern detected after the text ";

	// NamedElement errors
	private static final String EXTRANEOUSINPUT = "extraneous input ";
	private static final String RULE_ID = "RULE_ID";
	private static final String REQPAT_EXTRANEOUSINPUT = "Invalid character {0} for element name. Allowed characters: A-Z, a-z, 0-9, - and _. The name has to begin with a letter (A-Z or a-z)!";
	private static final String RULE_STRING = "RULE_STRING";
	private static final String REQPAT_STRINGDELIMITERS = "quotation marks";

	private SyntaxErrorMessage createSyntaxErrorMessage(String msg) {
		return new SyntaxErrorMessage(msg, Diagnostic.SYNTAX_DIAGNOSTIC);
	}

	@Override
	public SyntaxErrorMessage getSyntaxErrorMessage(IParserErrorContext context) {
		EObject obj = context.getCurrentContext();
		String defaultMessage = context.getDefaultMessage();

		if (obj != null) {
			if (obj instanceof RequirementPatternSpecObject) {
				if (defaultMessage.startsWith(REQUIREDLOOPDIDNOTMATCHANYTHING)) {
					String input = defaultMessage
							.substring(REQUIREDLOOPDIDNOTMATCHANYTHING.length());
					return createSyntaxErrorMessage(REQPAT_REQUIREDLOOPDIDNOTMATCHANYTHING
							+ input + '.');
				} else if (defaultMessage.startsWith(NOVIABLEALTERNATIVE)) {
					String input = defaultMessage.substring(NOVIABLEALTERNATIVE
							.length());
					return createSyntaxErrorMessage(REQPAT_REQUIREDLOOPDIDNOTMATCHANYTHING
							+ input + '.');
				}
			} else if (obj instanceof NamedElement
					|| obj instanceof RequirementPattern) {
				if (defaultMessage.startsWith(EXTRANEOUSINPUT)
						&& defaultMessage.endsWith(RULE_ID)) {
					String temp = defaultMessage.substring(EXTRANEOUSINPUT
							.length());
					int fromIndex = temp.indexOf('\'');
					String input = "";
					if (fromIndex > -1) {
						input = temp.substring(fromIndex,
								temp.indexOf('\'', fromIndex + 1) + 1);
					}
					return createSyntaxErrorMessage(REQPAT_EXTRANEOUSINPUT
							.replace("{0}", input));
				} else if (defaultMessage.contains(RULE_STRING)) {
					return createSyntaxErrorMessage(defaultMessage.replace(
							RULE_STRING, REQPAT_STRINGDELIMITERS));
				}
			}
		}
		// System.out.println(defaultMessage);
		return super.getSyntaxErrorMessage(context);
	}
}
