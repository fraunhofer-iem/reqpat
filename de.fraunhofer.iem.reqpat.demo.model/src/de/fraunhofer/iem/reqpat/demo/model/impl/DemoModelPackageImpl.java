/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.demo.model.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.fraunhofer.iem.reqpat.core.model.CoreModelPackage;
import de.fraunhofer.iem.reqpat.demo.model.AnalysisFunction;
import de.fraunhofer.iem.reqpat.demo.model.AnalysisFunctionDefinition;
import de.fraunhofer.iem.reqpat.demo.model.AnalysisFunctionPurpose;
import de.fraunhofer.iem.reqpat.demo.model.DemoModelFactory;
import de.fraunhofer.iem.reqpat.demo.model.DemoModelPackage;
import de.fraunhofer.iem.reqpat.demo.model.Function;
import de.fraunhofer.iem.reqpat.demo.model.FunctionalDevice;
import de.fraunhofer.iem.reqpat.demo.model.FunctionalDeviceDefinition;
import de.fraunhofer.iem.reqpat.demo.model.IncomingInformationDefinition;
import de.fraunhofer.iem.reqpat.demo.model.Information;
import de.fraunhofer.iem.reqpat.demo.model.InformationCreation;
import de.fraunhofer.iem.reqpat.demo.model.InformationUsage;
import de.fraunhofer.iem.reqpat.demo.model.NamedElement;
import de.fraunhofer.iem.reqpat.demo.model.OutgoingInformationDefinition;
import de.fraunhofer.iem.reqpat.demo.model.SubAnalysisFunctionDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DemoModelPackageImpl extends EPackageImpl implements DemoModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalDeviceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisFunctionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalDeviceDefinitionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisFunctionDefinitionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subAnalysisFunctionDefinitionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incomingInformationDefinitionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outgoingInformationDefinitionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationUsageEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationCreationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisFunctionPurposeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.fraunhofer.iem.reqpat.demo.model.DemoModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DemoModelPackageImpl() {
		super(eNS_URI, DemoModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DemoModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DemoModelPackage init() {
		if (isInited) return (DemoModelPackage)EPackage.Registry.INSTANCE.getEPackage(DemoModelPackage.eNS_URI);

		// Obtain or create and register package
		DemoModelPackageImpl theDemoModelPackage = (DemoModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DemoModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DemoModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CoreModelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDemoModelPackage.createPackageContents();

		// Initialize created meta-data
		theDemoModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDemoModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DemoModelPackage.eNS_URI, theDemoModelPackage);
		return theDemoModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalDevice() {
		return functionalDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionalDevice_Purpose() {
		return (EAttribute)functionalDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalysisFunction() {
		return analysisFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisFunction_ParentAnalysisFunction() {
		return (EReference)analysisFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformation() {
		return informationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalDeviceDefinition() {
		return functionalDeviceDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionalDeviceDefinition_FunctionalDevice() {
		return (EReference)functionalDeviceDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalysisFunctionDefinition() {
		return analysisFunctionDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisFunctionDefinition_AnalysisFunction() {
		return (EReference)analysisFunctionDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubAnalysisFunctionDefinition() {
		return subAnalysisFunctionDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubAnalysisFunctionDefinition_AnalysisFunction() {
		return (EReference)subAnalysisFunctionDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncomingInformationDefinition() {
		return incomingInformationDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncomingInformationDefinition_FunctionalDevice() {
		return (EReference)incomingInformationDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncomingInformationDefinition_AnalysisFunction() {
		return (EReference)incomingInformationDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIncomingInformationDefinition_InformationList() {
		return (EReference)incomingInformationDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutgoingInformationDefinition() {
		return outgoingInformationDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutgoingInformationDefinition_AnalysisFunction() {
		return (EReference)outgoingInformationDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutgoingInformationDefinition_FunctionalDevice() {
		return (EReference)outgoingInformationDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutgoingInformationDefinition_InformationList() {
		return (EReference)outgoingInformationDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationUsage() {
		return informationUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationUsage_AnalysisFunction() {
		return (EReference)informationUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationUsage_InformationList() {
		return (EReference)informationUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationCreation() {
		return informationCreationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationCreation_AnalysisFunction() {
		return (EReference)informationCreationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationCreation_InformationList() {
		return (EReference)informationCreationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalysisFunctionPurpose() {
		return analysisFunctionPurposeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalysisFunctionPurpose_Purpose() {
		return (EAttribute)analysisFunctionPurposeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysisFunctionPurpose_AnalysisFunction() {
		return (EReference)analysisFunctionPurposeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DemoModelFactory getDemoModelFactory() {
		return (DemoModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		functionalDeviceEClass = createEClass(FUNCTIONAL_DEVICE);
		createEAttribute(functionalDeviceEClass, FUNCTIONAL_DEVICE__PURPOSE);

		analysisFunctionEClass = createEClass(ANALYSIS_FUNCTION);
		createEReference(analysisFunctionEClass, ANALYSIS_FUNCTION__PARENT_ANALYSIS_FUNCTION);

		informationEClass = createEClass(INFORMATION);

		functionalDeviceDefinitionEClass = createEClass(FUNCTIONAL_DEVICE_DEFINITION);
		createEReference(functionalDeviceDefinitionEClass, FUNCTIONAL_DEVICE_DEFINITION__FUNCTIONAL_DEVICE);

		analysisFunctionDefinitionEClass = createEClass(ANALYSIS_FUNCTION_DEFINITION);
		createEReference(analysisFunctionDefinitionEClass, ANALYSIS_FUNCTION_DEFINITION__ANALYSIS_FUNCTION);

		subAnalysisFunctionDefinitionEClass = createEClass(SUB_ANALYSIS_FUNCTION_DEFINITION);
		createEReference(subAnalysisFunctionDefinitionEClass, SUB_ANALYSIS_FUNCTION_DEFINITION__ANALYSIS_FUNCTION);

		incomingInformationDefinitionEClass = createEClass(INCOMING_INFORMATION_DEFINITION);
		createEReference(incomingInformationDefinitionEClass, INCOMING_INFORMATION_DEFINITION__FUNCTIONAL_DEVICE);
		createEReference(incomingInformationDefinitionEClass, INCOMING_INFORMATION_DEFINITION__ANALYSIS_FUNCTION);
		createEReference(incomingInformationDefinitionEClass, INCOMING_INFORMATION_DEFINITION__INFORMATION_LIST);

		outgoingInformationDefinitionEClass = createEClass(OUTGOING_INFORMATION_DEFINITION);
		createEReference(outgoingInformationDefinitionEClass, OUTGOING_INFORMATION_DEFINITION__ANALYSIS_FUNCTION);
		createEReference(outgoingInformationDefinitionEClass, OUTGOING_INFORMATION_DEFINITION__FUNCTIONAL_DEVICE);
		createEReference(outgoingInformationDefinitionEClass, OUTGOING_INFORMATION_DEFINITION__INFORMATION_LIST);

		informationUsageEClass = createEClass(INFORMATION_USAGE);
		createEReference(informationUsageEClass, INFORMATION_USAGE__ANALYSIS_FUNCTION);
		createEReference(informationUsageEClass, INFORMATION_USAGE__INFORMATION_LIST);

		informationCreationEClass = createEClass(INFORMATION_CREATION);
		createEReference(informationCreationEClass, INFORMATION_CREATION__ANALYSIS_FUNCTION);
		createEReference(informationCreationEClass, INFORMATION_CREATION__INFORMATION_LIST);

		functionEClass = createEClass(FUNCTION);

		analysisFunctionPurposeEClass = createEClass(ANALYSIS_FUNCTION_PURPOSE);
		createEAttribute(analysisFunctionPurposeEClass, ANALYSIS_FUNCTION_PURPOSE__PURPOSE);
		createEReference(analysisFunctionPurposeEClass, ANALYSIS_FUNCTION_PURPOSE__ANALYSIS_FUNCTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CoreModelPackage theCoreModelPackage = (CoreModelPackage)EPackage.Registry.INSTANCE.getEPackage(CoreModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		functionalDeviceEClass.getESuperTypes().add(this.getFunction());
		analysisFunctionEClass.getESuperTypes().add(this.getFunction());
		informationEClass.getESuperTypes().add(this.getNamedElement());
		functionalDeviceDefinitionEClass.getESuperTypes().add(theCoreModelPackage.getRequirementPattern());
		analysisFunctionDefinitionEClass.getESuperTypes().add(theCoreModelPackage.getRequirementPattern());
		subAnalysisFunctionDefinitionEClass.getESuperTypes().add(theCoreModelPackage.getRequirementPattern());
		incomingInformationDefinitionEClass.getESuperTypes().add(theCoreModelPackage.getRequirementPattern());
		outgoingInformationDefinitionEClass.getESuperTypes().add(theCoreModelPackage.getRequirementPattern());
		informationUsageEClass.getESuperTypes().add(theCoreModelPackage.getRequirementPattern());
		informationCreationEClass.getESuperTypes().add(theCoreModelPackage.getRequirementPattern());
		functionEClass.getESuperTypes().add(this.getNamedElement());
		analysisFunctionPurposeEClass.getESuperTypes().add(theCoreModelPackage.getRequirementPattern());

		// Initialize classes and features; add operations and parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalDeviceEClass, FunctionalDevice.class, "FunctionalDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionalDevice_Purpose(), ecorePackage.getEString(), "purpose", null, 0, 1, FunctionalDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analysisFunctionEClass, AnalysisFunction.class, "AnalysisFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalysisFunction_ParentAnalysisFunction(), this.getAnalysisFunction(), null, "parentAnalysisFunction", null, 0, 1, AnalysisFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(informationEClass, Information.class, "Information", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionalDeviceDefinitionEClass, FunctionalDeviceDefinition.class, "FunctionalDeviceDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionalDeviceDefinition_FunctionalDevice(), this.getFunctionalDevice(), null, "functionalDevice", null, 0, 1, FunctionalDeviceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analysisFunctionDefinitionEClass, AnalysisFunctionDefinition.class, "AnalysisFunctionDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalysisFunctionDefinition_AnalysisFunction(), this.getAnalysisFunction(), null, "analysisFunction", null, 0, 1, AnalysisFunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subAnalysisFunctionDefinitionEClass, SubAnalysisFunctionDefinition.class, "SubAnalysisFunctionDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubAnalysisFunctionDefinition_AnalysisFunction(), this.getAnalysisFunction(), null, "analysisFunction", null, 0, 1, SubAnalysisFunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(incomingInformationDefinitionEClass, IncomingInformationDefinition.class, "IncomingInformationDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIncomingInformationDefinition_FunctionalDevice(), this.getFunctionalDevice(), null, "functionalDevice", null, 0, 1, IncomingInformationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIncomingInformationDefinition_AnalysisFunction(), this.getAnalysisFunction(), null, "analysisFunction", null, 0, 1, IncomingInformationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIncomingInformationDefinition_InformationList(), this.getInformation(), null, "informationList", null, 0, -1, IncomingInformationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outgoingInformationDefinitionEClass, OutgoingInformationDefinition.class, "OutgoingInformationDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutgoingInformationDefinition_AnalysisFunction(), this.getAnalysisFunction(), null, "analysisFunction", null, 0, 1, OutgoingInformationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutgoingInformationDefinition_FunctionalDevice(), this.getFunctionalDevice(), null, "functionalDevice", null, 0, 1, OutgoingInformationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutgoingInformationDefinition_InformationList(), this.getInformation(), null, "informationList", null, 0, -1, OutgoingInformationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(informationUsageEClass, InformationUsage.class, "InformationUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInformationUsage_AnalysisFunction(), this.getAnalysisFunction(), null, "analysisFunction", null, 0, 1, InformationUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInformationUsage_InformationList(), this.getInformation(), null, "informationList", null, 0, -1, InformationUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(informationCreationEClass, InformationCreation.class, "InformationCreation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInformationCreation_AnalysisFunction(), this.getAnalysisFunction(), null, "analysisFunction", null, 0, 1, InformationCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInformationCreation_InformationList(), this.getInformation(), null, "informationList", null, 0, -1, InformationCreation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(analysisFunctionPurposeEClass, AnalysisFunctionPurpose.class, "AnalysisFunctionPurpose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnalysisFunctionPurpose_Purpose(), ecorePackage.getEString(), "purpose", null, 0, 1, AnalysisFunctionPurpose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysisFunctionPurpose_AnalysisFunction(), this.getAnalysisFunction(), null, "analysisFunction", null, 0, 1, AnalysisFunctionPurpose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DemoModelPackageImpl
