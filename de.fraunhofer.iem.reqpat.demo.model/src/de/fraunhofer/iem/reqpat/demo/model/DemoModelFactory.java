/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.demo.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.iem.reqpat.demo.model.DemoModelPackage
 * @generated
 */
public interface DemoModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DemoModelFactory eINSTANCE = de.fraunhofer.iem.reqpat.demo.model.impl.DemoModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Functional Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Device</em>'.
	 * @generated
	 */
	FunctionalDevice createFunctionalDevice();

	/**
	 * Returns a new object of class '<em>Analysis Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analysis Function</em>'.
	 * @generated
	 */
	AnalysisFunction createAnalysisFunction();

	/**
	 * Returns a new object of class '<em>Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information</em>'.
	 * @generated
	 */
	Information createInformation();

	/**
	 * Returns a new object of class '<em>Functional Device Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Device Definition</em>'.
	 * @generated
	 */
	FunctionalDeviceDefinition createFunctionalDeviceDefinition();

	/**
	 * Returns a new object of class '<em>Analysis Function Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analysis Function Definition</em>'.
	 * @generated
	 */
	AnalysisFunctionDefinition createAnalysisFunctionDefinition();

	/**
	 * Returns a new object of class '<em>Sub Analysis Function Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Analysis Function Definition</em>'.
	 * @generated
	 */
	SubAnalysisFunctionDefinition createSubAnalysisFunctionDefinition();

	/**
	 * Returns a new object of class '<em>Incoming Information Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Incoming Information Definition</em>'.
	 * @generated
	 */
	IncomingInformationDefinition createIncomingInformationDefinition();

	/**
	 * Returns a new object of class '<em>Outgoing Information Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Outgoing Information Definition</em>'.
	 * @generated
	 */
	OutgoingInformationDefinition createOutgoingInformationDefinition();

	/**
	 * Returns a new object of class '<em>Information Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information Usage</em>'.
	 * @generated
	 */
	InformationUsage createInformationUsage();

	/**
	 * Returns a new object of class '<em>Information Creation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information Creation</em>'.
	 * @generated
	 */
	InformationCreation createInformationCreation();

	/**
	 * Returns a new object of class '<em>Analysis Function Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analysis Function Purpose</em>'.
	 * @generated
	 */
	AnalysisFunctionPurpose createAnalysisFunctionPurpose();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DemoModelPackage getDemoModelPackage();

} //DemoModelFactory
