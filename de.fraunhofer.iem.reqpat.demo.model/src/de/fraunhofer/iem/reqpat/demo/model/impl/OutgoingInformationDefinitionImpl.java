/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.demo.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.fraunhofer.iem.reqpat.core.model.impl.RequirementPatternImpl;
import de.fraunhofer.iem.reqpat.demo.model.AnalysisFunction;
import de.fraunhofer.iem.reqpat.demo.model.DemoModelPackage;
import de.fraunhofer.iem.reqpat.demo.model.FunctionalDevice;
import de.fraunhofer.iem.reqpat.demo.model.Information;
import de.fraunhofer.iem.reqpat.demo.model.OutgoingInformationDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outgoing Information Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.reqpat.demo.model.impl.OutgoingInformationDefinitionImpl#getAnalysisFunction <em>Analysis Function</em>}</li>
 *   <li>{@link de.fraunhofer.iem.reqpat.demo.model.impl.OutgoingInformationDefinitionImpl#getFunctionalDevice <em>Functional Device</em>}</li>
 *   <li>{@link de.fraunhofer.iem.reqpat.demo.model.impl.OutgoingInformationDefinitionImpl#getInformationList <em>Information List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutgoingInformationDefinitionImpl extends RequirementPatternImpl implements OutgoingInformationDefinition {
	/**
	 * The cached value of the '{@link #getAnalysisFunction() <em>Analysis Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysisFunction()
	 * @generated
	 * @ordered
	 */
	protected AnalysisFunction analysisFunction;

	/**
	 * The cached value of the '{@link #getFunctionalDevice() <em>Functional Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalDevice()
	 * @generated
	 * @ordered
	 */
	protected FunctionalDevice functionalDevice;

	/**
	 * The cached value of the '{@link #getInformationList() <em>Information List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationList()
	 * @generated
	 * @ordered
	 */
	protected EList<Information> informationList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutgoingInformationDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DemoModelPackage.Literals.OUTGOING_INFORMATION_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisFunction getAnalysisFunction() {
		if (analysisFunction != null && analysisFunction.eIsProxy()) {
			InternalEObject oldAnalysisFunction = (InternalEObject)analysisFunction;
			analysisFunction = (AnalysisFunction)eResolveProxy(oldAnalysisFunction);
			if (analysisFunction != oldAnalysisFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DemoModelPackage.OUTGOING_INFORMATION_DEFINITION__ANALYSIS_FUNCTION, oldAnalysisFunction, analysisFunction));
			}
		}
		return analysisFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisFunction basicGetAnalysisFunction() {
		return analysisFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnalysisFunction(AnalysisFunction newAnalysisFunction) {
		AnalysisFunction oldAnalysisFunction = analysisFunction;
		analysisFunction = newAnalysisFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemoModelPackage.OUTGOING_INFORMATION_DEFINITION__ANALYSIS_FUNCTION, oldAnalysisFunction, analysisFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalDevice getFunctionalDevice() {
		if (functionalDevice != null && functionalDevice.eIsProxy()) {
			InternalEObject oldFunctionalDevice = (InternalEObject)functionalDevice;
			functionalDevice = (FunctionalDevice)eResolveProxy(oldFunctionalDevice);
			if (functionalDevice != oldFunctionalDevice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DemoModelPackage.OUTGOING_INFORMATION_DEFINITION__FUNCTIONAL_DEVICE, oldFunctionalDevice, functionalDevice));
			}
		}
		return functionalDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalDevice basicGetFunctionalDevice() {
		return functionalDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionalDevice(FunctionalDevice newFunctionalDevice) {
		FunctionalDevice oldFunctionalDevice = functionalDevice;
		functionalDevice = newFunctionalDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemoModelPackage.OUTGOING_INFORMATION_DEFINITION__FUNCTIONAL_DEVICE, oldFunctionalDevice, functionalDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Information> getInformationList() {
		if (informationList == null) {
			informationList = new EObjectContainmentEList<Information>(Information.class, this, DemoModelPackage.OUTGOING_INFORMATION_DEFINITION__INFORMATION_LIST);
		}
		return informationList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DemoModelPackage.OUTGOING_INFORMATION_DEFINITION__INFORMATION_LIST:
				return ((InternalEList<?>)getInformationList()).basicRemove(otherEnd, msgs);
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
			case DemoModelPackage.OUTGOING_INFORMATION_DEFINITION__ANALYSIS_FUNCTION:
				if (resolve) return getAnalysisFunction();
				return basicGetAnalysisFunction();
			case DemoModelPackage.OUTGOING_INFORMATION_DEFINITION__FUNCTIONAL_DEVICE:
				if (resolve) return getFunctionalDevice();
				return basicGetFunctionalDevice();
			case DemoModelPackage.OUTGOING_INFORMATION_DEFINITION__INFORMATION_LIST:
				return getInformationList();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DemoModelPackage.OUTGOING_INFORMATION_DEFINITION__ANALYSIS_FUNCTION:
				setAnalysisFunction((AnalysisFunction)newValue);
				return;
			case DemoModelPackage.OUTGOING_INFORMATION_DEFINITION__FUNCTIONAL_DEVICE:
				setFunctionalDevice((FunctionalDevice)newValue);
				return;
			case DemoModelPackage.OUTGOING_INFORMATION_DEFINITION__INFORMATION_LIST:
				getInformationList().clear();
				getInformationList().addAll((Collection<? extends Information>)newValue);
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
			case DemoModelPackage.OUTGOING_INFORMATION_DEFINITION__ANALYSIS_FUNCTION:
				setAnalysisFunction((AnalysisFunction)null);
				return;
			case DemoModelPackage.OUTGOING_INFORMATION_DEFINITION__FUNCTIONAL_DEVICE:
				setFunctionalDevice((FunctionalDevice)null);
				return;
			case DemoModelPackage.OUTGOING_INFORMATION_DEFINITION__INFORMATION_LIST:
				getInformationList().clear();
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
			case DemoModelPackage.OUTGOING_INFORMATION_DEFINITION__ANALYSIS_FUNCTION:
				return analysisFunction != null;
			case DemoModelPackage.OUTGOING_INFORMATION_DEFINITION__FUNCTIONAL_DEVICE:
				return functionalDevice != null;
			case DemoModelPackage.OUTGOING_INFORMATION_DEFINITION__INFORMATION_LIST:
				return informationList != null && !informationList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OutgoingInformationDefinitionImpl
