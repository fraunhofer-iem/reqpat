/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.rmf.presentation.headline.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.fraunhofer.iem.reqpat.rmf.presentation.headline.HeadlinePresentationServiceConfiguration;
import de.fraunhofer.iem.reqpat.rmf.presentation.headline.HeadlinePresentationServiceFactory;
import de.fraunhofer.iem.reqpat.rmf.presentation.headline.HeadlinePresentationServicePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class HeadlinePresentationServiceFactoryImpl extends EFactoryImpl
		implements HeadlinePresentationServiceFactory {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HeadlinePresentationServicePackage getPackage() {
		return HeadlinePresentationServicePackage.eINSTANCE;
	}

	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static HeadlinePresentationServiceFactory init() {
		try {
			HeadlinePresentationServiceFactory theHeadlinePresentationServiceFactory = (HeadlinePresentationServiceFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://de.fraunhofer.ipt.em.swt.isae.headlinepresentationservice");
			if (theHeadlinePresentationServiceFactory != null) {
				return theHeadlinePresentationServiceFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HeadlinePresentationServiceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public HeadlinePresentationServiceFactoryImpl() {
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
		case HeadlinePresentationServicePackage.HEADLINE_PRESENTATION_SERVICE_CONFIGURATION:
			return createHeadlinePresentationServiceConfiguration();
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
	public HeadlinePresentationServiceConfiguration createHeadlinePresentationServiceConfiguration() {
		HeadlinePresentationServiceConfigurationImpl headlinePresentationServiceConfiguration = new HeadlinePresentationServiceConfigurationImpl();
		return headlinePresentationServiceConfiguration;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public HeadlinePresentationServicePackage getHeadlinePresentationServicePackage() {
		return (HeadlinePresentationServicePackage) getEPackage();
	}

} // HeadlinePresentationServiceFactoryImpl
