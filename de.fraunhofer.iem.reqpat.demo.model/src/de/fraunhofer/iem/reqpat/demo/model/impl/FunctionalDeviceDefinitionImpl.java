/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.demo.model.impl;

import de.fraunhofer.iem.reqpat.core.model.impl.RequirementPatternImpl;

import de.fraunhofer.iem.reqpat.demo.model.DemoModelPackage;
import de.fraunhofer.iem.reqpat.demo.model.FunctionalDevice;
import de.fraunhofer.iem.reqpat.demo.model.FunctionalDeviceDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Device Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.reqpat.demo.model.impl.FunctionalDeviceDefinitionImpl#getFunctionalDevice <em>Functional Device</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionalDeviceDefinitionImpl extends RequirementPatternImpl implements FunctionalDeviceDefinition {
	/**
	 * The cached value of the '{@link #getFunctionalDevice() <em>Functional Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalDevice()
	 * @generated
	 * @ordered
	 */
	protected FunctionalDevice functionalDevice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalDeviceDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DemoModelPackage.Literals.FUNCTIONAL_DEVICE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalDevice getFunctionalDevice() {
		return functionalDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctionalDevice(FunctionalDevice newFunctionalDevice, NotificationChain msgs) {
		FunctionalDevice oldFunctionalDevice = functionalDevice;
		functionalDevice = newFunctionalDevice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DemoModelPackage.FUNCTIONAL_DEVICE_DEFINITION__FUNCTIONAL_DEVICE, oldFunctionalDevice, newFunctionalDevice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionalDevice(FunctionalDevice newFunctionalDevice) {
		if (newFunctionalDevice != functionalDevice) {
			NotificationChain msgs = null;
			if (functionalDevice != null)
				msgs = ((InternalEObject)functionalDevice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DemoModelPackage.FUNCTIONAL_DEVICE_DEFINITION__FUNCTIONAL_DEVICE, null, msgs);
			if (newFunctionalDevice != null)
				msgs = ((InternalEObject)newFunctionalDevice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DemoModelPackage.FUNCTIONAL_DEVICE_DEFINITION__FUNCTIONAL_DEVICE, null, msgs);
			msgs = basicSetFunctionalDevice(newFunctionalDevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemoModelPackage.FUNCTIONAL_DEVICE_DEFINITION__FUNCTIONAL_DEVICE, newFunctionalDevice, newFunctionalDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DemoModelPackage.FUNCTIONAL_DEVICE_DEFINITION__FUNCTIONAL_DEVICE:
				return basicSetFunctionalDevice(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DemoModelPackage.FUNCTIONAL_DEVICE_DEFINITION__FUNCTIONAL_DEVICE:
				return getFunctionalDevice();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DemoModelPackage.FUNCTIONAL_DEVICE_DEFINITION__FUNCTIONAL_DEVICE:
				setFunctionalDevice((FunctionalDevice)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DemoModelPackage.FUNCTIONAL_DEVICE_DEFINITION__FUNCTIONAL_DEVICE:
				setFunctionalDevice((FunctionalDevice)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DemoModelPackage.FUNCTIONAL_DEVICE_DEFINITION__FUNCTIONAL_DEVICE:
				return functionalDevice != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionalDeviceDefinitionImpl
