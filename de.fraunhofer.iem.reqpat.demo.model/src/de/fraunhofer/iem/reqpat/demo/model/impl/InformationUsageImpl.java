/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.demo.model.impl;

import de.fraunhofer.iem.reqpat.core.model.impl.RequirementPatternImpl;

import de.fraunhofer.iem.reqpat.demo.model.AnalysisFunction;
import de.fraunhofer.iem.reqpat.demo.model.DemoModelPackage;
import de.fraunhofer.iem.reqpat.demo.model.Information;
import de.fraunhofer.iem.reqpat.demo.model.InformationUsage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.reqpat.demo.model.impl.InformationUsageImpl#getAnalysisFunction <em>Analysis Function</em>}</li>
 *   <li>{@link de.fraunhofer.iem.reqpat.demo.model.impl.InformationUsageImpl#getInformationList <em>Information List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InformationUsageImpl extends RequirementPatternImpl implements InformationUsage {
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
	 * The cached value of the '{@link #getInformationList() <em>Information List</em>}' reference list.
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
	protected InformationUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DemoModelPackage.Literals.INFORMATION_USAGE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DemoModelPackage.INFORMATION_USAGE__ANALYSIS_FUNCTION, oldAnalysisFunction, analysisFunction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DemoModelPackage.INFORMATION_USAGE__ANALYSIS_FUNCTION, oldAnalysisFunction, analysisFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Information> getInformationList() {
		if (informationList == null) {
			informationList = new EObjectResolvingEList<Information>(Information.class, this, DemoModelPackage.INFORMATION_USAGE__INFORMATION_LIST);
		}
		return informationList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DemoModelPackage.INFORMATION_USAGE__ANALYSIS_FUNCTION:
				if (resolve) return getAnalysisFunction();
				return basicGetAnalysisFunction();
			case DemoModelPackage.INFORMATION_USAGE__INFORMATION_LIST:
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
			case DemoModelPackage.INFORMATION_USAGE__ANALYSIS_FUNCTION:
				setAnalysisFunction((AnalysisFunction)newValue);
				return;
			case DemoModelPackage.INFORMATION_USAGE__INFORMATION_LIST:
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
			case DemoModelPackage.INFORMATION_USAGE__ANALYSIS_FUNCTION:
				setAnalysisFunction((AnalysisFunction)null);
				return;
			case DemoModelPackage.INFORMATION_USAGE__INFORMATION_LIST:
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
			case DemoModelPackage.INFORMATION_USAGE__ANALYSIS_FUNCTION:
				return analysisFunction != null;
			case DemoModelPackage.INFORMATION_USAGE__INFORMATION_LIST:
				return informationList != null && !informationList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InformationUsageImpl
