/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.rmf.presentation.headline;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see de.fraunhofer.iem.reqpat.rmf.presentation.headline.HeadlinePresentationServiceFactory
 * @model kind="package"
 * @generated
 */
public interface HeadlinePresentationServicePackage extends EPackage {
	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '
		 * {@link de.fraunhofer.iem.reqpat.rmf.presentation.headline.impl.HeadlinePresentationServiceConfigurationImpl
		 * <em>Configuration</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see de.fraunhofer.iem.reqpat.rmf.presentation.headline.impl.HeadlinePresentationServiceConfigurationImpl
		 * @see de.fraunhofer.iem.reqpat.rmf.presentation.headline.impl.HeadlinePresentationServicePackageImpl#getHeadlinePresentationServiceConfiguration()
		 * @generated
		 */
		EClass HEADLINE_PRESENTATION_SERVICE_CONFIGURATION = eINSTANCE
				.getHeadlinePresentationServiceConfiguration();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute HEADLINE_PRESENTATION_SERVICE_CONFIGURATION__SIZE = eINSTANCE
				.getHeadlinePresentationServiceConfiguration_Size();

	}

	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "HeadlinePresentationService";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://de.fraunhofer.iem.reqpat.rmf.presentation.headline";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "de.fraunhofer.iem.reqpat.rmf.presentation.headline";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	HeadlinePresentationServicePackage eINSTANCE = de.fraunhofer.iem.reqpat.rmf.presentation.headline.impl.HeadlinePresentationServicePackageImpl
			.init();

	/**
	 * The meta object id for the '
	 * {@link de.fraunhofer.iem.reqpat.rmf.presentation.headline.impl.HeadlinePresentationServiceConfigurationImpl
	 * <em>Configuration</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see de.fraunhofer.iem.reqpat.rmf.presentation.headline.impl.HeadlinePresentationServiceConfigurationImpl
	 * @see de.fraunhofer.iem.reqpat.rmf.presentation.headline.impl.HeadlinePresentationServicePackageImpl#getHeadlinePresentationServiceConfiguration()
	 * @generated
	 */
	int HEADLINE_PRESENTATION_SERVICE_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int HEADLINE_PRESENTATION_SERVICE_CONFIGURATION__DATATYPE = ConfigurationPackage.PROR_PRESENTATION_CONFIGURATION__DATATYPE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int HEADLINE_PRESENTATION_SERVICE_CONFIGURATION__SIZE = ConfigurationPackage.PROR_PRESENTATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int HEADLINE_PRESENTATION_SERVICE_CONFIGURATION_FEATURE_COUNT = ConfigurationPackage.PROR_PRESENTATION_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '
	 * {@link de.fraunhofer.iem.reqpat.rmf.presentation.headline.HeadlinePresentationServiceConfiguration
	 * <em>Configuration</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see de.fraunhofer.iem.reqpat.rmf.presentation.headline.HeadlinePresentationServiceConfiguration
	 * @generated
	 */
	EClass getHeadlinePresentationServiceConfiguration();

	/**
	 * Returns the meta object for the attribute '
	 * {@link de.fraunhofer.iem.reqpat.rmf.presentation.headline.HeadlinePresentationServiceConfiguration#getSize
	 * <em>Size</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see de.fraunhofer.iem.reqpat.rmf.presentation.headline.HeadlinePresentationServiceConfiguration#getSize()
	 * @see #getHeadlinePresentationServiceConfiguration()
	 * @generated
	 */
	EAttribute getHeadlinePresentationServiceConfiguration_Size();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HeadlinePresentationServiceFactory getHeadlinePresentationServiceFactory();

} // HeadlinePresentationServicePackage
