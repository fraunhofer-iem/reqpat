/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.core.model.impl;

import de.fraunhofer.iem.reqpat.core.model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoreModelFactoryImpl extends EFactoryImpl implements CoreModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoreModelFactory init() {
		try {
			CoreModelFactory theCoreModelFactory = (CoreModelFactory)EPackage.Registry.INSTANCE.getEFactory("http://de.fraunhofer.iem.reqpat.core.model"); 
			if (theCoreModelFactory != null) {
				return theCoreModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoreModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CoreModelPackage.SPECIFICATION: return createSpecification();
			case CoreModelPackage.REQUIREMENT_PATTERN_SPEC_OBJECT: return createRequirementPatternSpecObject();
			case CoreModelPackage.HEADING_SPEC_OBJECT: return createHeadingSpecObject();
			case CoreModelPackage.FREE_TEXT_SPEC_OBJECT: return createFreeTextSpecObject();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification createSpecification() {
		SpecificationImpl specification = new SpecificationImpl();
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementPatternSpecObject createRequirementPatternSpecObject() {
		RequirementPatternSpecObjectImpl requirementPatternSpecObject = new RequirementPatternSpecObjectImpl();
		return requirementPatternSpecObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeadingSpecObject createHeadingSpecObject() {
		HeadingSpecObjectImpl headingSpecObject = new HeadingSpecObjectImpl();
		return headingSpecObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreeTextSpecObject createFreeTextSpecObject() {
		FreeTextSpecObjectImpl freeTextSpecObject = new FreeTextSpecObjectImpl();
		return freeTextSpecObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreModelPackage getCoreModelPackage() {
		return (CoreModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CoreModelPackage getPackage() {
		return CoreModelPackage.eINSTANCE;
	}

} //CoreModelFactoryImpl
