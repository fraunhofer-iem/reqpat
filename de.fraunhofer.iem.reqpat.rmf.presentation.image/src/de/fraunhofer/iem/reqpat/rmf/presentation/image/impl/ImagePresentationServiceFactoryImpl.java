/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.rmf.presentation.image.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.fraunhofer.iem.reqpat.rmf.presentation.image.ImagePresentationServiceConfiguration;
import de.fraunhofer.iem.reqpat.rmf.presentation.image.ImagePresentationServiceFactory;
import de.fraunhofer.iem.reqpat.rmf.presentation.image.ImagePresentationServicePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class ImagePresentationServiceFactoryImpl extends EFactoryImpl implements
		ImagePresentationServiceFactory {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ImagePresentationServicePackage getPackage() {
		return ImagePresentationServicePackage.eINSTANCE;
	}

	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static ImagePresentationServiceFactory init() {
		try {
			ImagePresentationServiceFactory theImagePresentationServiceFactory = (ImagePresentationServiceFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://ipt.fraunhofer.de/imagepresentationservice");
			if (theImagePresentationServiceFactory != null) {
				return theImagePresentationServiceFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ImagePresentationServiceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public ImagePresentationServiceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ImagePresentationServicePackage.IMAGE_PRESENTATION_SERVICE_CONFIGURATION:
			return createImagePresentationServiceConfiguration();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ImagePresentationServiceConfiguration createImagePresentationServiceConfiguration() {
		ImagePresentationServiceConfigurationImpl imagePresentationServiceConfiguration = new ImagePresentationServiceConfigurationImpl();
		return imagePresentationServiceConfiguration;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ImagePresentationServicePackage getImagePresentationServicePackage() {
		return (ImagePresentationServicePackage) getEPackage();
	}

} // ImagePresentationServiceFactoryImpl
