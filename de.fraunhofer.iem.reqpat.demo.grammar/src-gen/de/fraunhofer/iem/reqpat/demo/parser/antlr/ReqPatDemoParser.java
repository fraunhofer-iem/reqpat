/*
 * generated by Xtext
 */
package de.fraunhofer.iem.reqpat.demo.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import de.fraunhofer.iem.reqpat.demo.services.ReqPatDemoGrammarAccess;

public class ReqPatDemoParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ReqPatDemoGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected de.fraunhofer.iem.reqpat.demo.parser.antlr.internal.InternalReqPatDemoParser createParser(XtextTokenStream stream) {
		return new de.fraunhofer.iem.reqpat.demo.parser.antlr.internal.InternalReqPatDemoParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Root";
	}
	
	public ReqPatDemoGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ReqPatDemoGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}