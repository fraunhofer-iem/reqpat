/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.rmf.presentation.image;

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
 * @see de.fraunhofer.iem.reqpat.rmf.presentation.image.ImagePresentationServiceFactory
 * @model kind="package"
 * @generated
 */
public interface ImagePresentationServicePackage extends EPackage {
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
		 * {@link de.fraunhofer.iem.reqpat.rmf.presentation.image.impl.ImagePresentationServiceConfigurationImpl
		 * <em>Configuration</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see de.fraunhofer.iem.reqpat.rmf.presentation.image.impl.ImagePresentationServiceConfigurationImpl
		 * @see de.fraunhofer.iem.reqpat.rmf.presentation.image.impl.ImagePresentationServicePackageImpl#getImagePresentationServiceConfiguration()
		 * @generated
		 */
		EClass IMAGE_PRESENTATION_SERVICE_CONFIGURATION = eINSTANCE
				.getImagePresentationServiceConfiguration();

	}

	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "ImagePresentationService";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://de.fraunhofer.iem.reqpat.rmf.presentation.image";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "de.fraunhofer.iem.reqpat.rmf.presentation.image";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	ImagePresentationServicePackage eINSTANCE = de.fraunhofer.iem.reqpat.rmf.presentation.image.impl.ImagePresentationServicePackageImpl
			.init();

	/**
	 * The meta object id for the '
	 * {@link de.fraunhofer.iem.reqpat.rmf.presentation.image.impl.ImagePresentationServiceConfigurationImpl
	 * <em>Configuration</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see de.fraunhofer.iem.reqpat.rmf.presentation.image.impl.ImagePresentationServiceConfigurationImpl
	 * @see de.fraunhofer.iem.reqpat.rmf.presentation.image.impl.ImagePresentationServicePackageImpl#getImagePresentationServiceConfiguration()
	 * @generated
	 */
	int IMAGE_PRESENTATION_SERVICE_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRESENTATION_SERVICE_CONFIGURATION__DATATYPE = ConfigurationPackage.PROR_PRESENTATION_CONFIGURATION__DATATYPE;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IMAGE_PRESENTATION_SERVICE_CONFIGURATION_FEATURE_COUNT = ConfigurationPackage.PROR_PRESENTATION_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '
	 * {@link de.fraunhofer.iem.reqpat.rmf.presentation.image.ImagePresentationServiceConfiguration
	 * <em>Configuration</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see de.fraunhofer.iem.reqpat.rmf.presentation.image.ImagePresentationServiceConfiguration
	 * @generated
	 */
	EClass getImagePresentationServiceConfiguration();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ImagePresentationServiceFactory getImagePresentationServiceFactory();

} // ImagePresentationServicePackage
