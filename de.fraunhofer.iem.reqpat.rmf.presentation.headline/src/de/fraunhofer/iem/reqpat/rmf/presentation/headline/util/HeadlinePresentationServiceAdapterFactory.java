/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.rmf.presentation.headline.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;

import de.fraunhofer.iem.reqpat.rmf.presentation.headline.HeadlinePresentationServiceConfiguration;
import de.fraunhofer.iem.reqpat.rmf.presentation.headline.HeadlinePresentationServicePackage;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * 
 * @see de.fraunhofer.iem.reqpat.rmf.presentation.headline.HeadlinePresentationServicePackage
 * @generated
 */
public class HeadlinePresentationServiceAdapterFactory extends
		AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static HeadlinePresentationServicePackage modelPackage;

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected HeadlinePresentationServiceSwitch<Adapter> modelSwitch = new HeadlinePresentationServiceSwitch<Adapter>() {
		@Override
		public Adapter caseHeadlinePresentationServiceConfiguration(
				HeadlinePresentationServiceConfiguration object) {
			return createHeadlinePresentationServiceConfigurationAdapter();
		}

		@Override
		public Adapter caseProrPresentationConfiguration(
				ProrPresentationConfiguration object) {
			return createProrPresentationConfigurationAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public HeadlinePresentationServiceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HeadlinePresentationServicePackage.eINSTANCE;
		}
	}

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This
	 * default implementation returns null. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link de.fraunhofer.iem.reqpat.rmf.presentation.headline.HeadlinePresentationServiceConfiguration
	 * <em>Configuration</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see de.fraunhofer.iem.reqpat.rmf.presentation.headline.HeadlinePresentationServiceConfiguration
	 * @generated
	 */
	public Adapter createHeadlinePresentationServiceConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link configuration.ProrPresentationConfiguration
	 * <em>Pror Presentation Configuration</em>}'. <!-- begin-user-doc --> This
	 * default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases
	 * anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see configuration.ProrPresentationConfiguration
	 * @generated
	 */
	public Adapter createProrPresentationConfigurationAdapter() {
		return null;
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc --> This implementation returns <code>true</code> if
	 * the object is either the model's package or is an instance object of the
	 * model. <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

} // HeadlinePresentationServiceAdapterFactory
