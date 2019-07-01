package de.fraunhofer.iem.reqpat.demo.grammar.tests

import de.fraunhofer.iem.reqpat.demo.grammar.tests.provider.ReqPatDemoInjectorProvider
import de.fraunhofer.iem.reqpat.demo.model.DemoModelPackage
import org.eclipse.xtext.junit4.InjectWith
import com.itemis.xtext.testing.XtextRunner2
import com.itemis.xtext.testing.XtextTest
import org.junit.BeforeClass
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

/**
 * @author Frederik Knust
 */
@RunWith(typeof(XtextRunner2))
@InjectWith(typeof(ReqPatDemoInjectorProvider))
class ParserAndLexerTest extends XtextTest {
	
	@BeforeClass
	def static void registerEcorePackages() {
		var resourceSet = new ResourceSetImpl();

		var nsURI = DemoModelPackage::eINSTANCE
				.getNsURI();

		if (!resourceSet.getPackageRegistry().containsKey(nsURI)) {
			resourceSet.getPackageRegistry().put(
				nsURI,
				DemoModelPackage::eINSTANCE);
		}
	}
	
	new() {
		super("TestData");
	}
	
	@Test
	def void id() {
		testTerminal("ABC123", "ID");
		testTerminal("theFunctionalDevice", "ID");
		testTerminal("TheFunctionalDevice", "ID");
		testTerminal("TheFunctionalDevice1", "ID")
		testTerminal("theAnalysisFunction", "ID");
		testTerminal("theAnalysisFunction1", "ID");
		testTerminal("theAnalysisFunction1A", "ID");
		testTerminal("TheAnalysisFunction", "ID");
		testTerminal("TheAnalysisFunction1", "ID");
		testTerminal("TheAnalysisFunction1A", "ID");
		testTerminal("has", "ID");
		testTerminal("is", "ID");
		testTerminal("from", "ID");
		testTerminal("to", "ID");
		testTerminal("RPAnalysisFunction", "ID");
		
		
		/*
		 * These values are hidden by the core grammar.
		 */
		testNotTerminal("RP", "ID");
		testNotTerminal("H", "ID");
		
		/*
		 * IDs may not start with a number.
		 */
		testNotTerminal("123ABC", "ID");
	}
	
	@Test
	def void purpose() {
		testTerminal("\"this is an arbitrary purpose\"", "STRING");
		testTerminal("\"Another arbitrary purpose\"", "STRING");
		testTerminal("\"The purpose.\"", "STRING");
		
		testNotTerminal("\"The \"purpose.\"", "STRING");
	}
	
	@Test
	def void testAnalysisFunctionDefParserRule() {
		testParserRule("The top-level analysis function is called ABC123" , "AnalysisFunctionDef");
		
		testParserRuleErrors("The top-level analysis function is called 123ABC", "AnalysisFunctionDef", "Invalid character");
		testParserRuleErrors("The top-level analysis function is called \"123ABC", "AnalysisFunctionDef", "EOF");
		testParserRuleErrors("The top-level analysis function is called ABC123.", "AnalysisFunctionDef", "EOF");
	}
	
	@Test
	def void testTheAnalysisFunctionParserRule() {
		testParserRule("The analysis function ABC123 has the following purpose: \"an arbitrary purpose\"", "TheAnalysisFunction");
	}
	
	@Test
	def void testAnalysisFunctionPurpParserRule() {
		testParserRule("ABC123 has the following purpose: \"an arbitrary purpose\"", "AnalysisFunctionPurp");
	}
	
	@Test
	def void testSubAnalysisFunctionDefParserRule() {
		testParserRule("ABC123 is a subfunction of the analysis function ParentAnalysisFunction", "SubAnalysisFunctionDef");
	}
	
	@Test
	def void testTheFollowingInformationParserRule() {
		testParserRule("The following information is received by the analysis function theAnalysisFunction from the functional device theFunctionalDevice: Info1, Info2", "TheFollowingInformation");
		testParserRule("The following information is sent from the analysis function theAnalysisFunction to the functional device theFunctionalDevice: Info1, Info2", "TheFollowingInformation");
		testParserRule("The following information is used by the analysis function theAnalysisFunction: Info1, Info2", "TheFollowingInformation");
		testParserRule("The following information is created by the analysis function theAnalysisFunction: Info1, Info2", "TheFollowingInformation");
	}
	
	@Test
	def void testIncomingInformationDefParserRule() {
		testParserRule("is received by the analysis function theAnalysisFunction from the functional device theFunctionalDevice: Info1, Info2", "IncomingInformationDef");
	}
	
	@Test
	def void testOutgoingInformationDefParserRule() {
		testParserRule("is sent from the analysis function theAnalysisFunction to the functional device theFunctionalDevice: Info1, Info2", "OutgoingInformationDef");
	}
	
	@Test
	def void testInformationUsageParserRule() {
		testParserRule("is used by the analysis function theAnalysisFunction: Info1, Info2", "InformationUsage");
	}
	
	@Test
	def void testInformationCreationParserRule() {
		testParserRule("is created by the analysis function theAnalysisFunction: Info1, Info2", "InformationCreation");
	}
	
}