package de.fraunhofer.iem.reqpat.demo.grammar.tests

import de.fraunhofer.iem.reqpat.demo.grammar.tests.provider.ReqPatDemoInjectorProvider
import de.fraunhofer.iem.reqpat.demo.model.DemoModelPackage
import de.fraunhofer.iem.reqpat.demo.validation.ReqPatDemoJavaValidator
import java.text.MessageFormat
import org.eclipse.xtext.junit4.InjectWith
import com.itemis.xtext.testing.XtextRunner2
import com.itemis.xtext.testing.XtextTest
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

/**
 * @author Frederik Knust
 */
@RunWith(typeof(XtextRunner2))
@InjectWith(typeof(ReqPatDemoInjectorProvider))
class ValidationTest extends XtextTest {
	
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
	
	@Before
	def void prepareTest() {
		suppressSerialization();
	}
	
	@Test
	def void testMissingDefinitions() {
		val issues = testFile("unresolvedReferences.reqpatDemo");
		
		assertConstraints(
			issues.errorsOnly
			.inLine(2)
			.oneOfThemContains(ReqPatDemoJavaValidator::ANALYSIS_FUNCTION_NOT_FOUND)
		);
		
		assertConstraints(
			issues.errorsOnly
			.inLine(6)
			.oneOfThemContains(ReqPatDemoJavaValidator::ANALYSIS_FUNCTION_NOT_FOUND)
		);
		
		assertConstraints(
			issues.errorsOnly
			.inLine(8)
			.oneOfThemContains(ReqPatDemoJavaValidator::ANALYSIS_FUNCTION_NOT_FOUND)
			.oneOfThemContains(ReqPatDemoJavaValidator::FUNCTIONAL_DEVICE_NOT_FOUND)
		);
		
		assertConstraints(
			issues.errorsOnly
			.inLine(9)
			.oneOfThemContains(ReqPatDemoJavaValidator::ANALYSIS_FUNCTION_NOT_FOUND)
			.oneOfThemContains(ReqPatDemoJavaValidator::FUNCTIONAL_DEVICE_NOT_FOUND)
		);
		
		assertConstraints(
			issues.errorsOnly
			.inLine(10)
			.oneOfThemContains(ReqPatDemoJavaValidator::ANALYSIS_FUNCTION_NOT_FOUND)
			.oneOfThemContains(ReqPatDemoJavaValidator::INFORMATION_NOT_FOUND)
		);
		
		assertConstraints(
			issues.errorsOnly
			.inLine(11)
			.oneOfThemContains(ReqPatDemoJavaValidator::ANALYSIS_FUNCTION_NOT_FOUND)
			.oneOfThemContains(ReqPatDemoJavaValidator::INFORMATION_NOT_FOUND)
		);
	}
	
	@Test
	def void testDuplicateNames() {
		val issues = testFile("duplicateNames.reqpatDemo");
		
		assertConstraints(
			issues.errorsOnly
			.inLine(2)
			.allOfThemContain(MessageFormat::format(
				ReqPatDemoJavaValidator::NAME_NOT_UNIQUE,
				ReqPatDemoJavaValidator::ANALYSIS_FUNCTION,
				"AnalysisFunction"
			))
		);
		
		assertConstraints(
			issues.errorsOnly
			.inLine(5)
			.allOfThemContain(MessageFormat::format(
				ReqPatDemoJavaValidator::NAME_NOT_UNIQUE,
				ReqPatDemoJavaValidator::ANALYSIS_FUNCTION,
				"theSubAnalysisFunction"
			))
		);
		
		assertConstraints(
			issues.errorsOnly
			.inLine(6)
			.allOfThemContain(MessageFormat::format(
				ReqPatDemoJavaValidator::NAME_NOT_UNIQUE,
				ReqPatDemoJavaValidator::FUNCTIONAL_DEVICE,
				"theFunctionalDevice"
			))
		);
		
		assertConstraints(
			issues.errorsOnly
			.inLine(7)
			.allOfThemContain(MessageFormat::format(
				ReqPatDemoJavaValidator::NAME_NOT_UNIQUE,
				ReqPatDemoJavaValidator::INFORMATION,
				"Info1"
			))
		);
		
		assertConstraints(
			issues.errorsOnly
			.inLine(8)
			.allOfThemContain(MessageFormat::format(
				ReqPatDemoJavaValidator::NAME_NOT_UNIQUE,
				ReqPatDemoJavaValidator::FUNCTIONAL_DEVICE,
				"theFunctionalDevice"
			))
		);
	}
	
}