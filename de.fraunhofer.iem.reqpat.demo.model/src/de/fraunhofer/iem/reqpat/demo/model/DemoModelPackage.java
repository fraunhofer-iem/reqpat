/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.demo.model;

import de.fraunhofer.iem.reqpat.core.model.CoreModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.fraunhofer.iem.reqpat.demo.model.DemoModelFactory
 * @model kind="package"
 * @generated
 */
public interface DemoModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de.fraunhofer.iem.reqpat.demo.model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.fraunhofer.iem.reqpat.demo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DemoModelPackage eINSTANCE = de.fraunhofer.iem.reqpat.demo.model.impl.DemoModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.reqpat.demo.model.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.reqpat.demo.model.impl.NamedElementImpl
	 * @see de.fraunhofer.iem.reqpat.demo.model.impl.DemoModelPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.reqpat.demo.model.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.reqpat.demo.model.impl.FunctionImpl
	 * @see de.fraunhofer.iem.reqpat.demo.model.impl.DemoModelPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.reqpat.demo.model.impl.FunctionalDeviceImpl <em>Functional Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.reqpat.demo.model.impl.FunctionalDeviceImpl
	 * @see de.fraunhofer.iem.reqpat.demo.model.impl.DemoModelPackageImpl#getFunctionalDevice()
	 * @generated
	 */
	int FUNCTIONAL_DEVICE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DEVICE__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DEVICE__PURPOSE = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Functional Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DEVICE_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.reqpat.demo.model.impl.AnalysisFunctionImpl <em>Analysis Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.reqpat.demo.model.impl.AnalysisFunctionImpl
	 * @see de.fraunhofer.iem.reqpat.demo.model.impl.DemoModelPackageImpl#getAnalysisFunction()
	 * @generated
	 */
	int ANALYSIS_FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Parent Analysis Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION__PARENT_ANALYSIS_FUNCTION = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Analysis Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.reqpat.demo.model.impl.InformationImpl <em>Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.reqpat.demo.model.impl.InformationImpl
	 * @see de.fraunhofer.iem.reqpat.demo.model.impl.DemoModelPackageImpl#getInformation()
	 * @generated
	 */
	int INFORMATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.reqpat.demo.model.impl.FunctionalDeviceDefinitionImpl <em>Functional Device Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.reqpat.demo.model.impl.FunctionalDeviceDefinitionImpl
	 * @see de.fraunhofer.iem.reqpat.demo.model.impl.DemoModelPackageImpl#getFunctionalDeviceDefinition()
	 * @generated
	 */
	int FUNCTIONAL_DEVICE_DEFINITION = 4;

	/**
	 * The feature id for the '<em><b>Spec Object</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DEVICE_DEFINITION__SPEC_OBJECT = CoreModelPackage.REQUIREMENT_PATTERN__SPEC_OBJECT;

	/**
	 * The feature id for the '<em><b>Functional Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DEVICE_DEFINITION__FUNCTIONAL_DEVICE = CoreModelPackage.REQUIREMENT_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Functional Device Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_DEVICE_DEFINITION_FEATURE_COUNT = CoreModelPackage.REQUIREMENT_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.reqpat.demo.model.impl.AnalysisFunctionDefinitionImpl <em>Analysis Function Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.reqpat.demo.model.impl.AnalysisFunctionDefinitionImpl
	 * @see de.fraunhofer.iem.reqpat.demo.model.impl.DemoModelPackageImpl#getAnalysisFunctionDefinition()
	 * @generated
	 */
	int ANALYSIS_FUNCTION_DEFINITION = 5;

	/**
	 * The feature id for the '<em><b>Spec Object</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_DEFINITION__SPEC_OBJECT = CoreModelPackage.REQUIREMENT_PATTERN__SPEC_OBJECT;

	/**
	 * The feature id for the '<em><b>Analysis Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_DEFINITION__ANALYSIS_FUNCTION = CoreModelPackage.REQUIREMENT_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Analysis Function Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_DEFINITION_FEATURE_COUNT = CoreModelPackage.REQUIREMENT_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.reqpat.demo.model.impl.SubAnalysisFunctionDefinitionImpl <em>Sub Analysis Function Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.reqpat.demo.model.impl.SubAnalysisFunctionDefinitionImpl
	 * @see de.fraunhofer.iem.reqpat.demo.model.impl.DemoModelPackageImpl#getSubAnalysisFunctionDefinition()
	 * @generated
	 */
	int SUB_ANALYSIS_FUNCTION_DEFINITION = 6;

	/**
	 * The feature id for the '<em><b>Spec Object</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ANALYSIS_FUNCTION_DEFINITION__SPEC_OBJECT = CoreModelPackage.REQUIREMENT_PATTERN__SPEC_OBJECT;

	/**
	 * The feature id for the '<em><b>Analysis Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ANALYSIS_FUNCTION_DEFINITION__ANALYSIS_FUNCTION = CoreModelPackage.REQUIREMENT_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sub Analysis Function Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ANALYSIS_FUNCTION_DEFINITION_FEATURE_COUNT = CoreModelPackage.REQUIREMENT_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.reqpat.demo.model.impl.IncomingInformationDefinitionImpl <em>Incoming Information Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.reqpat.demo.model.impl.IncomingInformationDefinitionImpl
	 * @see de.fraunhofer.iem.reqpat.demo.model.impl.DemoModelPackageImpl#getIncomingInformationDefinition()
	 * @generated
	 */
	int INCOMING_INFORMATION_DEFINITION = 7;

	/**
	 * The feature id for the '<em><b>Spec Object</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_INFORMATION_DEFINITION__SPEC_OBJECT = CoreModelPackage.REQUIREMENT_PATTERN__SPEC_OBJECT;

	/**
	 * The feature id for the '<em><b>Functional Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_INFORMATION_DEFINITION__FUNCTIONAL_DEVICE = CoreModelPackage.REQUIREMENT_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Analysis Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_INFORMATION_DEFINITION__ANALYSIS_FUNCTION = CoreModelPackage.REQUIREMENT_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Information List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_INFORMATION_DEFINITION__INFORMATION_LIST = CoreModelPackage.REQUIREMENT_PATTERN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Incoming Information Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOMING_INFORMATION_DEFINITION_FEATURE_COUNT = CoreModelPackage.REQUIREMENT_PATTERN_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.reqpat.demo.model.impl.OutgoingInformationDefinitionImpl <em>Outgoing Information Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.reqpat.demo.model.impl.OutgoingInformationDefinitionImpl
	 * @see de.fraunhofer.iem.reqpat.demo.model.impl.DemoModelPackageImpl#getOutgoingInformationDefinition()
	 * @generated
	 */
	int OUTGOING_INFORMATION_DEFINITION = 8;

	/**
	 * The feature id for the '<em><b>Spec Object</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_INFORMATION_DEFINITION__SPEC_OBJECT = CoreModelPackage.REQUIREMENT_PATTERN__SPEC_OBJECT;

	/**
	 * The feature id for the '<em><b>Analysis Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_INFORMATION_DEFINITION__ANALYSIS_FUNCTION = CoreModelPackage.REQUIREMENT_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Functional Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_INFORMATION_DEFINITION__FUNCTIONAL_DEVICE = CoreModelPackage.REQUIREMENT_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Information List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_INFORMATION_DEFINITION__INFORMATION_LIST = CoreModelPackage.REQUIREMENT_PATTERN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Outgoing Information Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTGOING_INFORMATION_DEFINITION_FEATURE_COUNT = CoreModelPackage.REQUIREMENT_PATTERN_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.reqpat.demo.model.impl.InformationUsageImpl <em>Information Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.reqpat.demo.model.impl.InformationUsageImpl
	 * @see de.fraunhofer.iem.reqpat.demo.model.impl.DemoModelPackageImpl#getInformationUsage()
	 * @generated
	 */
	int INFORMATION_USAGE = 9;

	/**
	 * The feature id for the '<em><b>Spec Object</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_USAGE__SPEC_OBJECT = CoreModelPackage.REQUIREMENT_PATTERN__SPEC_OBJECT;

	/**
	 * The feature id for the '<em><b>Analysis Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_USAGE__ANALYSIS_FUNCTION = CoreModelPackage.REQUIREMENT_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Information List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_USAGE__INFORMATION_LIST = CoreModelPackage.REQUIREMENT_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Information Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_USAGE_FEATURE_COUNT = CoreModelPackage.REQUIREMENT_PATTERN_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.reqpat.demo.model.impl.InformationCreationImpl <em>Information Creation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.reqpat.demo.model.impl.InformationCreationImpl
	 * @see de.fraunhofer.iem.reqpat.demo.model.impl.DemoModelPackageImpl#getInformationCreation()
	 * @generated
	 */
	int INFORMATION_CREATION = 10;

	/**
	 * The feature id for the '<em><b>Spec Object</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_CREATION__SPEC_OBJECT = CoreModelPackage.REQUIREMENT_PATTERN__SPEC_OBJECT;

	/**
	 * The feature id for the '<em><b>Analysis Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_CREATION__ANALYSIS_FUNCTION = CoreModelPackage.REQUIREMENT_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Information List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_CREATION__INFORMATION_LIST = CoreModelPackage.REQUIREMENT_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Information Creation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_CREATION_FEATURE_COUNT = CoreModelPackage.REQUIREMENT_PATTERN_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.reqpat.demo.model.impl.AnalysisFunctionPurposeImpl <em>Analysis Function Purpose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.reqpat.demo.model.impl.AnalysisFunctionPurposeImpl
	 * @see de.fraunhofer.iem.reqpat.demo.model.impl.DemoModelPackageImpl#getAnalysisFunctionPurpose()
	 * @generated
	 */
	int ANALYSIS_FUNCTION_PURPOSE = 12;

	/**
	 * The feature id for the '<em><b>Spec Object</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_PURPOSE__SPEC_OBJECT = CoreModelPackage.REQUIREMENT_PATTERN__SPEC_OBJECT;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_PURPOSE__PURPOSE = CoreModelPackage.REQUIREMENT_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Analysis Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_PURPOSE__ANALYSIS_FUNCTION = CoreModelPackage.REQUIREMENT_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Analysis Function Purpose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FUNCTION_PURPOSE_FEATURE_COUNT = CoreModelPackage.REQUIREMENT_PATTERN_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.reqpat.demo.model.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see de.fraunhofer.iem.reqpat.demo.model.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.reqpat.demo.model.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.fraunhofer.iem.reqpat.demo.model.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.reqpat.demo.model.FunctionalDevice <em>Functional Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Device</em>'.
	 * @see de.fraunhofer.iem.reqpat.demo.model.FunctionalDevice
	 * @generated
	 */
	EClass getFunctionalDevice();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.reqpat.demo.model.FunctionalDevice#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see de.fraunhofer.iem.reqpat.demo.model.FunctionalDevice#getPurpose()
	 * @see #getFunctionalDevice()
	 * @generated
	 */
	EAttribute getFunctionalDevice_Purpose();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.reqpat.demo.model.AnalysisFunction <em>Analysis Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis Function</em>'.
	 * @see de.fraunhofer.iem.reqpat.demo.model.AnalysisFunction
	 * @generated
	 */
	EClass getAnalysisFunction();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.reqpat.demo.model.AnalysisFunction#getParentAnalysisFunction <em>Parent Analysis Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Analysis Function</em>'.
	 * @see de.fraunhofer.iem.reqpat.demo.model.AnalysisFunction#getParentAnalysisFunction()
	 * @see #getAnalysisFunction()
	 * @generated
	 */
	EReference getAnalysisFunction_ParentAnalysisFunction();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.reqpat.demo.model.Information <em>Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information</em>'.
	 * @see de.fraunhofer.iem.reqpat.demo.model.Information
	 * @generated
	 */
	EClass getInformation();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.reqpat.demo.model.FunctionalDeviceDefinition <em>Functional Device Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Device Definition</em>'.
	 * @see de.fraunhofer.iem.reqpat.demo.model.FunctionalDeviceDefinition
	 * @generated
	 */
	EClass getFunctionalDeviceDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.reqpat.demo.model.FunctionalDeviceDefinition#getFunctionalDevice <em>Functional Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Functional Device</em>'.
	 * @see de.fraunhofer.iem.reqpat.demo.model.FunctionalDeviceDefinition#getFunctionalDevice()
	 * @see #getFunctionalDeviceDefinition()
	 * @generated
	 */
	EReference getFunctionalDeviceDefinition_FunctionalDevice();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.reqpat.demo.model.AnalysisFunctionDefinition <em>Analysis Function Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis Function Definition</em>'.
	 * @see de.fraunhofer.iem.reqpat.demo.model.AnalysisFunctionDefinition
	 * @generated
	 */
	EClass getAnalysisFunctionDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.reqpat.demo.model.AnalysisFunctionDefinition#getAnalysisFunction <em>Analysis Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Analysis Function</em>'.
	 * @see de.fraunhofer.iem.reqpat.demo.model.AnalysisFunctionDefinition#getAnalysisFunction()
	 * @see #getAnalysisFunctionDefinition()
	 * @generated
	 */
	EReference getAnalysisFunctionDefinition_AnalysisFunction();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.reqpat.demo.model.SubAnalysisFunctionDefinition <em>Sub Analysis Function Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Analysis Function Definition</em>'.
	 * @see de.fraunhofer.iem.reqpat.demo.model.SubAnalysisFunctionDefinition
	 * @generated
	 */
	EClass getSubAnalysisFunctionDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link de.fraunhofer.iem.reqpat.demo.model.SubAnalysisFunctionDefinition#getAnalysisFunction <em>Analysis Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Analysis Function</em>'.
	 * @see de.fraunhofer.iem.reqpat.demo.model.SubAnalysisFunctionDefinition#getAnalysisFunction()
	 * @see #getSubAnalysisFunctionDefinition()
	 * @generated
	 */
	EReference getSubAnalysisFunctionDefinition_AnalysisFunction();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.reqpat.demo.model.IncomingInformationDefinition <em>Incoming Information Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incoming Information Definition</em>'.
	 * @see de.fraunhofer.iem.reqpat.demo.model.IncomingInformationDefinition
	 * @generated
	 */
	EClass getIncomingInformationDefinition();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.reqpat.demo.model.IncomingInformationDefinition#getFunctionalDevice <em>Functional Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Functional Device</em>'.
	 * @see de.fraunhofer.iem.reqpat.demo.model.IncomingInformationDefinition#getFunctionalDevice()
	 * @see #getIncomingInformationDefinition()
	 * @generated
	 */
	EReference getIncomingInformationDefinition_FunctionalDevice();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.reqpat.demo.model.IncomingInformationDefinition#getAnalysisFunction <em>Analysis Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Analysis Function</em>'.
	 * @see de.fraunhofer.iem.reqpat.demo.model.IncomingInformationDefinition#getAnalysisFunction()
	 * @see #getIncomingInformationDefinition()
	 * @generated
	 */
	EReference getIncomingInformationDefinition_AnalysisFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.reqpat.demo.model.IncomingInformationDefinition#getInformationList <em>Information List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Information List</em>'.
	 * @see de.fraunhofer.iem.reqpat.demo.model.IncomingInformationDefinition#getInformationList()
	 * @see #getIncomingInformationDefinition()
	 * @generated
	 */
	EReference getIncomingInformationDefinition_InformationList();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.reqpat.demo.model.OutgoingInformationDefinition <em>Outgoing Information Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outgoing Information Definition</em>'.
	 * @see de.fraunhofer.iem.reqpat.demo.model.OutgoingInformationDefinition
	 * @generated
	 */
	EClass getOutgoingInformationDefinition();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.reqpat.demo.model.OutgoingInformationDefinition#getAnalysisFunction <em>Analysis Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Analysis Function</em>'.
	 * @see de.fraunhofer.iem.reqpat.demo.model.OutgoingInformationDefinition#getAnalysisFunction()
	 * @see #getOutgoingInformationDefinition()
	 * @generated
	 */
	EReference getOutgoingInformationDefinition_AnalysisFunction();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.reqpat.demo.model.OutgoingInformationDefinition#getFunctionalDevice <em>Functional Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Functional Device</em>'.
	 * @see de.fraunhofer.iem.reqpat.demo.model.OutgoingInformationDefinition#getFunctionalDevice()
	 * @see #getOutgoingInformationDefinition()
	 * @generated
	 */
	EReference getOutgoingInformationDefinition_FunctionalDevice();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.reqpat.demo.model.OutgoingInformationDefinition#getInformationList <em>Information List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Information List</em>'.
	 * @see de.fraunhofer.iem.reqpat.demo.model.OutgoingInformationDefinition#getInformationList()
	 * @see #getOutgoingInformationDefinition()
	 * @generated
	 */
	EReference getOutgoingInformationDefinition_InformationList();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.reqpat.demo.model.InformationUsage <em>Information Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Usage</em>'.
	 * @see de.fraunhofer.iem.reqpat.demo.model.InformationUsage
	 * @generated
	 */
	EClass getInformationUsage();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.reqpat.demo.model.InformationUsage#getAnalysisFunction <em>Analysis Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Analysis Function</em>'.
	 * @see de.fraunhofer.iem.reqpat.demo.model.InformationUsage#getAnalysisFunction()
	 * @see #getInformationUsage()
	 * @generated
	 */
	EReference getInformationUsage_AnalysisFunction();

	/**
	 * Returns the meta object for the reference list '{@link de.fraunhofer.iem.reqpat.demo.model.InformationUsage#getInformationList <em>Information List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Information List</em>'.
	 * @see de.fraunhofer.iem.reqpat.demo.model.InformationUsage#getInformationList()
	 * @see #getInformationUsage()
	 * @generated
	 */
	EReference getInformationUsage_InformationList();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.reqpat.demo.model.InformationCreation <em>Information Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Creation</em>'.
	 * @see de.fraunhofer.iem.reqpat.demo.model.InformationCreation
	 * @generated
	 */
	EClass getInformationCreation();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.reqpat.demo.model.InformationCreation#getAnalysisFunction <em>Analysis Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Analysis Function</em>'.
	 * @see de.fraunhofer.iem.reqpat.demo.model.InformationCreation#getAnalysisFunction()
	 * @see #getInformationCreation()
	 * @generated
	 */
	EReference getInformationCreation_AnalysisFunction();

	/**
	 * Returns the meta object for the reference list '{@link de.fraunhofer.iem.reqpat.demo.model.InformationCreation#getInformationList <em>Information List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Information List</em>'.
	 * @see de.fraunhofer.iem.reqpat.demo.model.InformationCreation#getInformationList()
	 * @see #getInformationCreation()
	 * @generated
	 */
	EReference getInformationCreation_InformationList();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.reqpat.demo.model.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see de.fraunhofer.iem.reqpat.demo.model.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.reqpat.demo.model.AnalysisFunctionPurpose <em>Analysis Function Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis Function Purpose</em>'.
	 * @see de.fraunhofer.iem.reqpat.demo.model.AnalysisFunctionPurpose
	 * @generated
	 */
	EClass getAnalysisFunctionPurpose();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.reqpat.demo.model.AnalysisFunctionPurpose#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see de.fraunhofer.iem.reqpat.demo.model.AnalysisFunctionPurpose#getPurpose()
	 * @see #getAnalysisFunctionPurpose()
	 * @generated
	 */
	EAttribute getAnalysisFunctionPurpose_Purpose();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.reqpat.demo.model.AnalysisFunctionPurpose#getAnalysisFunction <em>Analysis Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Analysis Function</em>'.
	 * @see de.fraunhofer.iem.reqpat.demo.model.AnalysisFunctionPurpose#getAnalysisFunction()
	 * @see #getAnalysisFunctionPurpose()
	 * @generated
	 */
	EReference getAnalysisFunctionPurpose_AnalysisFunction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DemoModelFactory getDemoModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.reqpat.demo.model.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.reqpat.demo.model.impl.NamedElementImpl
		 * @see de.fraunhofer.iem.reqpat.demo.model.impl.DemoModelPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.reqpat.demo.model.impl.FunctionalDeviceImpl <em>Functional Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.reqpat.demo.model.impl.FunctionalDeviceImpl
		 * @see de.fraunhofer.iem.reqpat.demo.model.impl.DemoModelPackageImpl#getFunctionalDevice()
		 * @generated
		 */
		EClass FUNCTIONAL_DEVICE = eINSTANCE.getFunctionalDevice();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_DEVICE__PURPOSE = eINSTANCE.getFunctionalDevice_Purpose();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.reqpat.demo.model.impl.AnalysisFunctionImpl <em>Analysis Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.reqpat.demo.model.impl.AnalysisFunctionImpl
		 * @see de.fraunhofer.iem.reqpat.demo.model.impl.DemoModelPackageImpl#getAnalysisFunction()
		 * @generated
		 */
		EClass ANALYSIS_FUNCTION = eINSTANCE.getAnalysisFunction();

		/**
		 * The meta object literal for the '<em><b>Parent Analysis Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_FUNCTION__PARENT_ANALYSIS_FUNCTION = eINSTANCE.getAnalysisFunction_ParentAnalysisFunction();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.reqpat.demo.model.impl.InformationImpl <em>Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.reqpat.demo.model.impl.InformationImpl
		 * @see de.fraunhofer.iem.reqpat.demo.model.impl.DemoModelPackageImpl#getInformation()
		 * @generated
		 */
		EClass INFORMATION = eINSTANCE.getInformation();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.reqpat.demo.model.impl.FunctionalDeviceDefinitionImpl <em>Functional Device Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.reqpat.demo.model.impl.FunctionalDeviceDefinitionImpl
		 * @see de.fraunhofer.iem.reqpat.demo.model.impl.DemoModelPackageImpl#getFunctionalDeviceDefinition()
		 * @generated
		 */
		EClass FUNCTIONAL_DEVICE_DEFINITION = eINSTANCE.getFunctionalDeviceDefinition();

		/**
		 * The meta object literal for the '<em><b>Functional Device</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_DEVICE_DEFINITION__FUNCTIONAL_DEVICE = eINSTANCE.getFunctionalDeviceDefinition_FunctionalDevice();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.reqpat.demo.model.impl.AnalysisFunctionDefinitionImpl <em>Analysis Function Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.reqpat.demo.model.impl.AnalysisFunctionDefinitionImpl
		 * @see de.fraunhofer.iem.reqpat.demo.model.impl.DemoModelPackageImpl#getAnalysisFunctionDefinition()
		 * @generated
		 */
		EClass ANALYSIS_FUNCTION_DEFINITION = eINSTANCE.getAnalysisFunctionDefinition();

		/**
		 * The meta object literal for the '<em><b>Analysis Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_FUNCTION_DEFINITION__ANALYSIS_FUNCTION = eINSTANCE.getAnalysisFunctionDefinition_AnalysisFunction();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.reqpat.demo.model.impl.SubAnalysisFunctionDefinitionImpl <em>Sub Analysis Function Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.reqpat.demo.model.impl.SubAnalysisFunctionDefinitionImpl
		 * @see de.fraunhofer.iem.reqpat.demo.model.impl.DemoModelPackageImpl#getSubAnalysisFunctionDefinition()
		 * @generated
		 */
		EClass SUB_ANALYSIS_FUNCTION_DEFINITION = eINSTANCE.getSubAnalysisFunctionDefinition();

		/**
		 * The meta object literal for the '<em><b>Analysis Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_ANALYSIS_FUNCTION_DEFINITION__ANALYSIS_FUNCTION = eINSTANCE.getSubAnalysisFunctionDefinition_AnalysisFunction();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.reqpat.demo.model.impl.IncomingInformationDefinitionImpl <em>Incoming Information Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.reqpat.demo.model.impl.IncomingInformationDefinitionImpl
		 * @see de.fraunhofer.iem.reqpat.demo.model.impl.DemoModelPackageImpl#getIncomingInformationDefinition()
		 * @generated
		 */
		EClass INCOMING_INFORMATION_DEFINITION = eINSTANCE.getIncomingInformationDefinition();

		/**
		 * The meta object literal for the '<em><b>Functional Device</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCOMING_INFORMATION_DEFINITION__FUNCTIONAL_DEVICE = eINSTANCE.getIncomingInformationDefinition_FunctionalDevice();

		/**
		 * The meta object literal for the '<em><b>Analysis Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCOMING_INFORMATION_DEFINITION__ANALYSIS_FUNCTION = eINSTANCE.getIncomingInformationDefinition_AnalysisFunction();

		/**
		 * The meta object literal for the '<em><b>Information List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCOMING_INFORMATION_DEFINITION__INFORMATION_LIST = eINSTANCE.getIncomingInformationDefinition_InformationList();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.reqpat.demo.model.impl.OutgoingInformationDefinitionImpl <em>Outgoing Information Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.reqpat.demo.model.impl.OutgoingInformationDefinitionImpl
		 * @see de.fraunhofer.iem.reqpat.demo.model.impl.DemoModelPackageImpl#getOutgoingInformationDefinition()
		 * @generated
		 */
		EClass OUTGOING_INFORMATION_DEFINITION = eINSTANCE.getOutgoingInformationDefinition();

		/**
		 * The meta object literal for the '<em><b>Analysis Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTGOING_INFORMATION_DEFINITION__ANALYSIS_FUNCTION = eINSTANCE.getOutgoingInformationDefinition_AnalysisFunction();

		/**
		 * The meta object literal for the '<em><b>Functional Device</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTGOING_INFORMATION_DEFINITION__FUNCTIONAL_DEVICE = eINSTANCE.getOutgoingInformationDefinition_FunctionalDevice();

		/**
		 * The meta object literal for the '<em><b>Information List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTGOING_INFORMATION_DEFINITION__INFORMATION_LIST = eINSTANCE.getOutgoingInformationDefinition_InformationList();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.reqpat.demo.model.impl.InformationUsageImpl <em>Information Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.reqpat.demo.model.impl.InformationUsageImpl
		 * @see de.fraunhofer.iem.reqpat.demo.model.impl.DemoModelPackageImpl#getInformationUsage()
		 * @generated
		 */
		EClass INFORMATION_USAGE = eINSTANCE.getInformationUsage();

		/**
		 * The meta object literal for the '<em><b>Analysis Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_USAGE__ANALYSIS_FUNCTION = eINSTANCE.getInformationUsage_AnalysisFunction();

		/**
		 * The meta object literal for the '<em><b>Information List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_USAGE__INFORMATION_LIST = eINSTANCE.getInformationUsage_InformationList();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.reqpat.demo.model.impl.InformationCreationImpl <em>Information Creation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.reqpat.demo.model.impl.InformationCreationImpl
		 * @see de.fraunhofer.iem.reqpat.demo.model.impl.DemoModelPackageImpl#getInformationCreation()
		 * @generated
		 */
		EClass INFORMATION_CREATION = eINSTANCE.getInformationCreation();

		/**
		 * The meta object literal for the '<em><b>Analysis Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_CREATION__ANALYSIS_FUNCTION = eINSTANCE.getInformationCreation_AnalysisFunction();

		/**
		 * The meta object literal for the '<em><b>Information List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMATION_CREATION__INFORMATION_LIST = eINSTANCE.getInformationCreation_InformationList();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.reqpat.demo.model.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.reqpat.demo.model.impl.FunctionImpl
		 * @see de.fraunhofer.iem.reqpat.demo.model.impl.DemoModelPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.reqpat.demo.model.impl.AnalysisFunctionPurposeImpl <em>Analysis Function Purpose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.reqpat.demo.model.impl.AnalysisFunctionPurposeImpl
		 * @see de.fraunhofer.iem.reqpat.demo.model.impl.DemoModelPackageImpl#getAnalysisFunctionPurpose()
		 * @generated
		 */
		EClass ANALYSIS_FUNCTION_PURPOSE = eINSTANCE.getAnalysisFunctionPurpose();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS_FUNCTION_PURPOSE__PURPOSE = eINSTANCE.getAnalysisFunctionPurpose_Purpose();

		/**
		 * The meta object literal for the '<em><b>Analysis Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS_FUNCTION_PURPOSE__ANALYSIS_FUNCTION = eINSTANCE.getAnalysisFunctionPurpose_AnalysisFunction();

	}

} //DemoModelPackage
