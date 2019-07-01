/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.core.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.iem.reqpat.core.model.CoreModelPackage
 * @generated
 */
public interface CoreModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoreModelFactory eINSTANCE = de.fraunhofer.iem.reqpat.core.model.impl.CoreModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specification</em>'.
	 * @generated
	 */
	Specification createSpecification();

	/**
	 * Returns a new object of class '<em>Requirement Pattern Spec Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement Pattern Spec Object</em>'.
	 * @generated
	 */
	RequirementPatternSpecObject createRequirementPatternSpecObject();

	/**
	 * Returns a new object of class '<em>Heading Spec Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Heading Spec Object</em>'.
	 * @generated
	 */
	HeadingSpecObject createHeadingSpecObject();

	/**
	 * Returns a new object of class '<em>Free Text Spec Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Free Text Spec Object</em>'.
	 * @generated
	 */
	FreeTextSpecObject createFreeTextSpecObject();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CoreModelPackage getCoreModelPackage();

} //CoreModelFactory
