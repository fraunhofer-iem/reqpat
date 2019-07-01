package de.fraunhofer.iem.reqpat.demo.grammar.tests

import de.fraunhofer.iem.reqpat.core.model.Specification
import de.fraunhofer.iem.reqpat.demo.grammar.tests.provider.ReqPatDemoInjectorProvider
import de.fraunhofer.iem.reqpat.demo.model.AnalysisFunctionPurpose
import de.fraunhofer.iem.reqpat.demo.model.DemoModelPackage
import org.eclipse.xtext.junit4.InjectWith
import com.itemis.xtext.testing.XtextRunner2
import com.itemis.xtext.testing.XtextTest
import org.junit.BeforeClass
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*
import de.fraunhofer.iem.reqpat.demo.model.AnalysisFunction
import de.fraunhofer.iem.reqpat.demo.model.FunctionalDevice
import de.fraunhofer.iem.reqpat.demo.model.IncomingInformationDefinition
import de.fraunhofer.iem.reqpat.demo.model.OutgoingInformationDefinition
import de.fraunhofer.iem.reqpat.demo.model.InformationUsage
import de.fraunhofer.iem.reqpat.demo.model.InformationCreation
import org.junit.Before
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

/**
 * @author Frederik Knust
 */
@RunWith(typeof(XtextRunner2))
@InjectWith(typeof(ReqPatDemoInjectorProvider))
class ValidModelTest extends XtextTest {
	
	val purposeWithLinebreak = "this Purpose contains 
	a linebreak which should show up";
	
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
//		ignoreFormattingDifferences();
		suppressSerialization();
	}
	
	@Test
	def void testValidModel() {
		testFile("valid.reqpatDemo");
		
		var specification =  modelRoot as Specification;
		
		// get main analysis function
		val analysisFunction = specification.eAllContents.filter(typeof(AnalysisFunction)).findFirst(af | af.name == "AnalysisFunction1");
		assertNotNull(analysisFunction);
		
		// check if the linebreak is set correctly
		val afp = specification.eAllContents.filter(typeof(AnalysisFunctionPurpose)).findFirst(afp | afp.analysisFunction == analysisFunction);
		assertNotNull(afp);
		assertEquals(purposeWithLinebreak, afp.purpose);
		
		// get sub-analysis function & check if it has the correct parent
		val subAnalysisFunction = specification.eAllContents.filter(typeof(AnalysisFunction)).findFirst(af | af.name == "theSubAnalysisFunction1");
		assertNotNull(subAnalysisFunction);
		assertNotNull(subAnalysisFunction.parentAnalysisFunction);
		assertEquals(analysisFunction, subAnalysisFunction.parentAnalysisFunction);
				
		// get functional device & check its purpose
		val functionalDevice = specification.eAllContents.filter(typeof(FunctionalDevice)).findFirst(fd | fd.name == "theFunctionalDevice1");
		assertNotNull(functionalDevice);
		assertEquals("the functional device purpose", functionalDevice.purpose);
		
		// check outgoing information definition
		val outgoingInformationDefinition = specification.eAllContents.filter(typeof(OutgoingInformationDefinition)).findFirst(oid | true);
		assertNotNull(outgoingInformationDefinition);
		assertEquals(analysisFunction, outgoingInformationDefinition.analysisFunction);
		assertEquals(functionalDevice, outgoingInformationDefinition.functionalDevice);
		assertTrue(outgoingInformationDefinition.informationList.exists(i | i.name == "Info1"));
		assertTrue(outgoingInformationDefinition.informationList.exists(i | i.name == "Info2"));
		
		// check incoming information definition
		val incomingInformationDefinition = specification.eAllContents.filter(typeof(IncomingInformationDefinition)).findFirst(iid | true);
		assertNotNull(incomingInformationDefinition);
		assertEquals(analysisFunction, incomingInformationDefinition.analysisFunction);
		assertEquals(functionalDevice, incomingInformationDefinition.functionalDevice);
		assertTrue(incomingInformationDefinition.informationList.exists(i | i.name == "Info3"));
		assertTrue(incomingInformationDefinition.informationList.exists(i | i.name == "Info4"));
		
		// check information usage
		val informationUsage = specification.eAllContents.filter(typeof(InformationUsage)).findFirst(iu | true);
		assertNotNull(informationUsage);
		assertEquals(subAnalysisFunction, informationUsage.analysisFunction);
		assertTrue(informationUsage.informationList.exists(i | i.name == "Info1"));
		
		// check information creation
		val informationCreation = specification.eAllContents.filter(typeof(InformationCreation)).findFirst(ic | true);
		assertNotNull(informationCreation);
		assertEquals(subAnalysisFunction, informationCreation.analysisFunction);
		assertTrue(informationCreation.informationList.exists(i | i.name == "Info2"));
	}
	
}