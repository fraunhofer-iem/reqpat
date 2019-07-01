/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.core.model.impl;

import de.fraunhofer.iem.reqpat.core.model.CoreModelFactory;
import de.fraunhofer.iem.reqpat.core.model.CoreModelPackage;
import de.fraunhofer.iem.reqpat.core.model.FreeTextSpecObject;
import de.fraunhofer.iem.reqpat.core.model.HeadingSpecObject;
import de.fraunhofer.iem.reqpat.core.model.RequirementPattern;
import de.fraunhofer.iem.reqpat.core.model.RequirementPatternSpecObject;
import de.fraunhofer.iem.reqpat.core.model.SpecObject;
import de.fraunhofer.iem.reqpat.core.model.Specification;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoreModelPackageImpl extends EPackageImpl implements CoreModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementPatternSpecObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headingSpecObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freeTextSpecObjectEClass = null;

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
	 * @see de.fraunhofer.iem.reqpat.core.model.CoreModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CoreModelPackageImpl() {
		super(eNS_URI, CoreModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CoreModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CoreModelPackage init() {
		if (isInited) return (CoreModelPackage)EPackage.Registry.INSTANCE.getEPackage(CoreModelPackage.eNS_URI);

		// Obtain or create and register package
		CoreModelPackageImpl theCoreModelPackage = (CoreModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CoreModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CoreModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCoreModelPackage.createPackageContents();

		// Initialize created meta-data
		theCoreModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCoreModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CoreModelPackage.eNS_URI, theCoreModelPackage);
		return theCoreModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecification() {
		return specificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_SpecObjects() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecObject() {
		return specObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecObject_Id() {
		return (EAttribute)specObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecObject_ParentSpecObject() {
		return (EReference)specObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecObject_Parent() {
		return (EAttribute)specObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecObject_Specification() {
		return (EReference)specObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementPatternSpecObject() {
		return requirementPatternSpecObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementPatternSpecObject_RequirementPatterns() {
		return (EReference)requirementPatternSpecObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeadingSpecObject() {
		return headingSpecObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeadingSpecObject_Text() {
		return (EAttribute)headingSpecObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementPattern() {
		return requirementPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementPattern_SpecObject() {
		return (EReference)requirementPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFreeTextSpecObject() {
		return freeTextSpecObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFreeTextSpecObject_FreeText() {
		return (EAttribute)freeTextSpecObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreModelFactory getCoreModelFactory() {
		return (CoreModelFactory)getEFactoryInstance();
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
		specificationEClass = createEClass(SPECIFICATION);
		createEReference(specificationEClass, SPECIFICATION__SPEC_OBJECTS);

		specObjectEClass = createEClass(SPEC_OBJECT);
		createEAttribute(specObjectEClass, SPEC_OBJECT__ID);
		createEReference(specObjectEClass, SPEC_OBJECT__PARENT_SPEC_OBJECT);
		createEAttribute(specObjectEClass, SPEC_OBJECT__PARENT);
		createEReference(specObjectEClass, SPEC_OBJECT__SPECIFICATION);

		requirementPatternSpecObjectEClass = createEClass(REQUIREMENT_PATTERN_SPEC_OBJECT);
		createEReference(requirementPatternSpecObjectEClass, REQUIREMENT_PATTERN_SPEC_OBJECT__REQUIREMENT_PATTERNS);

		headingSpecObjectEClass = createEClass(HEADING_SPEC_OBJECT);
		createEAttribute(headingSpecObjectEClass, HEADING_SPEC_OBJECT__TEXT);

		requirementPatternEClass = createEClass(REQUIREMENT_PATTERN);
		createEReference(requirementPatternEClass, REQUIREMENT_PATTERN__SPEC_OBJECT);

		freeTextSpecObjectEClass = createEClass(FREE_TEXT_SPEC_OBJECT);
		createEAttribute(freeTextSpecObjectEClass, FREE_TEXT_SPEC_OBJECT__FREE_TEXT);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		requirementPatternSpecObjectEClass.getESuperTypes().add(this.getSpecObject());
		headingSpecObjectEClass.getESuperTypes().add(this.getSpecObject());
		freeTextSpecObjectEClass.getESuperTypes().add(this.getSpecObject());

		// Initialize classes and features; add operations and parameters
		initEClass(specificationEClass, Specification.class, "Specification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecification_SpecObjects(), this.getSpecObject(), this.getSpecObject_Specification(), "specObjects", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specObjectEClass, SpecObject.class, "SpecObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpecObject_Id(), ecorePackage.getEString(), "id", null, 0, 1, SpecObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecObject_ParentSpecObject(), this.getSpecObject(), null, "parentSpecObject", null, 0, 1, SpecObject.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecObject_Parent(), ecorePackage.getEString(), "parent", null, 0, 1, SpecObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecObject_Specification(), this.getSpecification(), this.getSpecification_SpecObjects(), "specification", null, 0, 1, SpecObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementPatternSpecObjectEClass, RequirementPatternSpecObject.class, "RequirementPatternSpecObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirementPatternSpecObject_RequirementPatterns(), this.getRequirementPattern(), this.getRequirementPattern_SpecObject(), "requirementPatterns", null, 0, -1, RequirementPatternSpecObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(headingSpecObjectEClass, HeadingSpecObject.class, "HeadingSpecObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeadingSpecObject_Text(), ecorePackage.getEString(), "text", null, 0, 1, HeadingSpecObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementPatternEClass, RequirementPattern.class, "RequirementPattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirementPattern_SpecObject(), this.getRequirementPatternSpecObject(), this.getRequirementPatternSpecObject_RequirementPatterns(), "specObject", null, 0, 1, RequirementPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(freeTextSpecObjectEClass, FreeTextSpecObject.class, "FreeTextSpecObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFreeTextSpecObject_FreeText(), ecorePackage.getEString(), "freeText", null, 0, 1, FreeTextSpecObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CoreModelPackageImpl
