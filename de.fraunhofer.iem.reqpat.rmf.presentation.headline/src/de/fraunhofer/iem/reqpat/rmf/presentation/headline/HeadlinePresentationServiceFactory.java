/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.rmf.presentation.headline;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see de.fraunhofer.iem.reqpat.rmf.presentation.headline.HeadlinePresentationServicePackage
 * @generated
 */
public interface HeadlinePresentationServiceFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	HeadlinePresentationServiceFactory eINSTANCE = de.fraunhofer.iem.reqpat.rmf.presentation.headline.impl.HeadlinePresentationServiceFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Configuration</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Configuration</em>'.
	 * @generated
	 */
	HeadlinePresentationServiceConfiguration createHeadlinePresentationServiceConfiguration();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	HeadlinePresentationServicePackage getHeadlinePresentationServicePackage();

} // HeadlinePresentationServiceFactory
