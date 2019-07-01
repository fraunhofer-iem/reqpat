/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.core.model;

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
 * @see de.fraunhofer.iem.reqpat.core.model.CoreModelFactory
 * @model kind="package"
 * @generated
 */
public interface CoreModelPackage extends EPackage {
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
	String eNS_URI = "http://de.fraunhofer.iem.reqpat.core.model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.fraunhofer.iem.reqpat.core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoreModelPackage eINSTANCE = de.fraunhofer.iem.reqpat.core.model.impl.CoreModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.reqpat.core.model.impl.SpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.reqpat.core.model.impl.SpecificationImpl
	 * @see de.fraunhofer.iem.reqpat.core.model.impl.CoreModelPackageImpl#getSpecification()
	 * @generated
	 */
	int SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Spec Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__SPEC_OBJECTS = 0;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.reqpat.core.model.impl.SpecObjectImpl <em>Spec Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.reqpat.core.model.impl.SpecObjectImpl
	 * @see de.fraunhofer.iem.reqpat.core.model.impl.CoreModelPackageImpl#getSpecObject()
	 * @generated
	 */
	int SPEC_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT__ID = 0;

	/**
	 * The feature id for the '<em><b>Parent Spec Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT__PARENT_SPEC_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT__PARENT = 2;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT__SPECIFICATION = 3;

	/**
	 * The number of structural features of the '<em>Spec Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.reqpat.core.model.impl.RequirementPatternSpecObjectImpl <em>Requirement Pattern Spec Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.reqpat.core.model.impl.RequirementPatternSpecObjectImpl
	 * @see de.fraunhofer.iem.reqpat.core.model.impl.CoreModelPackageImpl#getRequirementPatternSpecObject()
	 * @generated
	 */
	int REQUIREMENT_PATTERN_SPEC_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PATTERN_SPEC_OBJECT__ID = SPEC_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Parent Spec Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PATTERN_SPEC_OBJECT__PARENT_SPEC_OBJECT = SPEC_OBJECT__PARENT_SPEC_OBJECT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PATTERN_SPEC_OBJECT__PARENT = SPEC_OBJECT__PARENT;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PATTERN_SPEC_OBJECT__SPECIFICATION = SPEC_OBJECT__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Requirement Patterns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PATTERN_SPEC_OBJECT__REQUIREMENT_PATTERNS = SPEC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Requirement Pattern Spec Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PATTERN_SPEC_OBJECT_FEATURE_COUNT = SPEC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.reqpat.core.model.impl.HeadingSpecObjectImpl <em>Heading Spec Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.reqpat.core.model.impl.HeadingSpecObjectImpl
	 * @see de.fraunhofer.iem.reqpat.core.model.impl.CoreModelPackageImpl#getHeadingSpecObject()
	 * @generated
	 */
	int HEADING_SPEC_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_SPEC_OBJECT__ID = SPEC_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Parent Spec Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_SPEC_OBJECT__PARENT_SPEC_OBJECT = SPEC_OBJECT__PARENT_SPEC_OBJECT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_SPEC_OBJECT__PARENT = SPEC_OBJECT__PARENT;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_SPEC_OBJECT__SPECIFICATION = SPEC_OBJECT__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_SPEC_OBJECT__TEXT = SPEC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Heading Spec Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_SPEC_OBJECT_FEATURE_COUNT = SPEC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.reqpat.core.model.impl.RequirementPatternImpl <em>Requirement Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.reqpat.core.model.impl.RequirementPatternImpl
	 * @see de.fraunhofer.iem.reqpat.core.model.impl.CoreModelPackageImpl#getRequirementPattern()
	 * @generated
	 */
	int REQUIREMENT_PATTERN = 4;

	/**
	 * The feature id for the '<em><b>Spec Object</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PATTERN__SPEC_OBJECT = 0;

	/**
	 * The number of structural features of the '<em>Requirement Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PATTERN_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.fraunhofer.iem.reqpat.core.model.impl.FreeTextSpecObjectImpl <em>Free Text Spec Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.fraunhofer.iem.reqpat.core.model.impl.FreeTextSpecObjectImpl
	 * @see de.fraunhofer.iem.reqpat.core.model.impl.CoreModelPackageImpl#getFreeTextSpecObject()
	 * @generated
	 */
	int FREE_TEXT_SPEC_OBJECT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_SPEC_OBJECT__ID = SPEC_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Parent Spec Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_SPEC_OBJECT__PARENT_SPEC_OBJECT = SPEC_OBJECT__PARENT_SPEC_OBJECT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_SPEC_OBJECT__PARENT = SPEC_OBJECT__PARENT;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_SPEC_OBJECT__SPECIFICATION = SPEC_OBJECT__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Free Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_SPEC_OBJECT__FREE_TEXT = SPEC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Free Text Spec Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_TEXT_SPEC_OBJECT_FEATURE_COUNT = SPEC_OBJECT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.reqpat.core.model.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see de.fraunhofer.iem.reqpat.core.model.Specification
	 * @generated
	 */
	EClass getSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.reqpat.core.model.Specification#getSpecObjects <em>Spec Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spec Objects</em>'.
	 * @see de.fraunhofer.iem.reqpat.core.model.Specification#getSpecObjects()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_SpecObjects();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.reqpat.core.model.SpecObject <em>Spec Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Object</em>'.
	 * @see de.fraunhofer.iem.reqpat.core.model.SpecObject
	 * @generated
	 */
	EClass getSpecObject();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.reqpat.core.model.SpecObject#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.fraunhofer.iem.reqpat.core.model.SpecObject#getId()
	 * @see #getSpecObject()
	 * @generated
	 */
	EAttribute getSpecObject_Id();

	/**
	 * Returns the meta object for the reference '{@link de.fraunhofer.iem.reqpat.core.model.SpecObject#getParentSpecObject <em>Parent Spec Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Spec Object</em>'.
	 * @see de.fraunhofer.iem.reqpat.core.model.SpecObject#getParentSpecObject()
	 * @see #getSpecObject()
	 * @generated
	 */
	EReference getSpecObject_ParentSpecObject();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.reqpat.core.model.SpecObject#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent</em>'.
	 * @see de.fraunhofer.iem.reqpat.core.model.SpecObject#getParent()
	 * @see #getSpecObject()
	 * @generated
	 */
	EAttribute getSpecObject_Parent();

	/**
	 * Returns the meta object for the container reference '{@link de.fraunhofer.iem.reqpat.core.model.SpecObject#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Specification</em>'.
	 * @see de.fraunhofer.iem.reqpat.core.model.SpecObject#getSpecification()
	 * @see #getSpecObject()
	 * @generated
	 */
	EReference getSpecObject_Specification();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.reqpat.core.model.RequirementPatternSpecObject <em>Requirement Pattern Spec Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Pattern Spec Object</em>'.
	 * @see de.fraunhofer.iem.reqpat.core.model.RequirementPatternSpecObject
	 * @generated
	 */
	EClass getRequirementPatternSpecObject();

	/**
	 * Returns the meta object for the containment reference list '{@link de.fraunhofer.iem.reqpat.core.model.RequirementPatternSpecObject#getRequirementPatterns <em>Requirement Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement Patterns</em>'.
	 * @see de.fraunhofer.iem.reqpat.core.model.RequirementPatternSpecObject#getRequirementPatterns()
	 * @see #getRequirementPatternSpecObject()
	 * @generated
	 */
	EReference getRequirementPatternSpecObject_RequirementPatterns();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.reqpat.core.model.HeadingSpecObject <em>Heading Spec Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heading Spec Object</em>'.
	 * @see de.fraunhofer.iem.reqpat.core.model.HeadingSpecObject
	 * @generated
	 */
	EClass getHeadingSpecObject();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.reqpat.core.model.HeadingSpecObject#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.fraunhofer.iem.reqpat.core.model.HeadingSpecObject#getText()
	 * @see #getHeadingSpecObject()
	 * @generated
	 */
	EAttribute getHeadingSpecObject_Text();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.reqpat.core.model.RequirementPattern <em>Requirement Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Pattern</em>'.
	 * @see de.fraunhofer.iem.reqpat.core.model.RequirementPattern
	 * @generated
	 */
	EClass getRequirementPattern();

	/**
	 * Returns the meta object for the container reference '{@link de.fraunhofer.iem.reqpat.core.model.RequirementPattern#getSpecObject <em>Spec Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Spec Object</em>'.
	 * @see de.fraunhofer.iem.reqpat.core.model.RequirementPattern#getSpecObject()
	 * @see #getRequirementPattern()
	 * @generated
	 */
	EReference getRequirementPattern_SpecObject();

	/**
	 * Returns the meta object for class '{@link de.fraunhofer.iem.reqpat.core.model.FreeTextSpecObject <em>Free Text Spec Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Free Text Spec Object</em>'.
	 * @see de.fraunhofer.iem.reqpat.core.model.FreeTextSpecObject
	 * @generated
	 */
	EClass getFreeTextSpecObject();

	/**
	 * Returns the meta object for the attribute '{@link de.fraunhofer.iem.reqpat.core.model.FreeTextSpecObject#getFreeText <em>Free Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Free Text</em>'.
	 * @see de.fraunhofer.iem.reqpat.core.model.FreeTextSpecObject#getFreeText()
	 * @see #getFreeTextSpecObject()
	 * @generated
	 */
	EAttribute getFreeTextSpecObject_FreeText();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreModelFactory getCoreModelFactory();

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
		 * The meta object literal for the '{@link de.fraunhofer.iem.reqpat.core.model.impl.SpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.reqpat.core.model.impl.SpecificationImpl
		 * @see de.fraunhofer.iem.reqpat.core.model.impl.CoreModelPackageImpl#getSpecification()
		 * @generated
		 */
		EClass SPECIFICATION = eINSTANCE.getSpecification();

		/**
		 * The meta object literal for the '<em><b>Spec Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__SPEC_OBJECTS = eINSTANCE.getSpecification_SpecObjects();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.reqpat.core.model.impl.SpecObjectImpl <em>Spec Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.reqpat.core.model.impl.SpecObjectImpl
		 * @see de.fraunhofer.iem.reqpat.core.model.impl.CoreModelPackageImpl#getSpecObject()
		 * @generated
		 */
		EClass SPEC_OBJECT = eINSTANCE.getSpecObject();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_OBJECT__ID = eINSTANCE.getSpecObject_Id();

		/**
		 * The meta object literal for the '<em><b>Parent Spec Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_OBJECT__PARENT_SPEC_OBJECT = eINSTANCE.getSpecObject_ParentSpecObject();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_OBJECT__PARENT = eINSTANCE.getSpecObject_Parent();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_OBJECT__SPECIFICATION = eINSTANCE.getSpecObject_Specification();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.reqpat.core.model.impl.RequirementPatternSpecObjectImpl <em>Requirement Pattern Spec Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.reqpat.core.model.impl.RequirementPatternSpecObjectImpl
		 * @see de.fraunhofer.iem.reqpat.core.model.impl.CoreModelPackageImpl#getRequirementPatternSpecObject()
		 * @generated
		 */
		EClass REQUIREMENT_PATTERN_SPEC_OBJECT = eINSTANCE.getRequirementPatternSpecObject();

		/**
		 * The meta object literal for the '<em><b>Requirement Patterns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_PATTERN_SPEC_OBJECT__REQUIREMENT_PATTERNS = eINSTANCE.getRequirementPatternSpecObject_RequirementPatterns();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.reqpat.core.model.impl.HeadingSpecObjectImpl <em>Heading Spec Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.reqpat.core.model.impl.HeadingSpecObjectImpl
		 * @see de.fraunhofer.iem.reqpat.core.model.impl.CoreModelPackageImpl#getHeadingSpecObject()
		 * @generated
		 */
		EClass HEADING_SPEC_OBJECT = eINSTANCE.getHeadingSpecObject();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADING_SPEC_OBJECT__TEXT = eINSTANCE.getHeadingSpecObject_Text();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.reqpat.core.model.impl.RequirementPatternImpl <em>Requirement Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.reqpat.core.model.impl.RequirementPatternImpl
		 * @see de.fraunhofer.iem.reqpat.core.model.impl.CoreModelPackageImpl#getRequirementPattern()
		 * @generated
		 */
		EClass REQUIREMENT_PATTERN = eINSTANCE.getRequirementPattern();

		/**
		 * The meta object literal for the '<em><b>Spec Object</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_PATTERN__SPEC_OBJECT = eINSTANCE.getRequirementPattern_SpecObject();

		/**
		 * The meta object literal for the '{@link de.fraunhofer.iem.reqpat.core.model.impl.FreeTextSpecObjectImpl <em>Free Text Spec Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.fraunhofer.iem.reqpat.core.model.impl.FreeTextSpecObjectImpl
		 * @see de.fraunhofer.iem.reqpat.core.model.impl.CoreModelPackageImpl#getFreeTextSpecObject()
		 * @generated
		 */
		EClass FREE_TEXT_SPEC_OBJECT = eINSTANCE.getFreeTextSpecObject();

		/**
		 * The meta object literal for the '<em><b>Free Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREE_TEXT_SPEC_OBJECT__FREE_TEXT = eINSTANCE.getFreeTextSpecObject_FreeText();

	}

} //CoreModelPackage
