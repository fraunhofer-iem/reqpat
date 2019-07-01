/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.demo.model.impl;

import de.fraunhofer.iem.reqpat.core.model.impl.RequirementPatternImpl;

import de.fraunhofer.iem.reqpat.demo.model.AnalysisFunction;
import de.fraunhofer.iem.reqpat.demo.model.AnalysisFunctionPurpose;
import de.fraunhofer.iem.reqpat.demo.model.DemoModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis Function Purpose</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.reqpat.demo.model.impl.AnalysisFunctionPurposeImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link de.fraunhofer.iem.reqpat.demo.model.impl.AnalysisFunctionPurposeImpl#getAnalysisFunction <em>Analysis Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnalysisFunctionPurposeImpl extends RequirementPatternImpl implements AnalysisFunctionPurpose {
	/**
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected String purpose = PURPOSE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisFunctionPurposeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DemoModelPackage.Literals.ANALYSIS_FUNCTION_PURPOSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(String newPurpose) {
		String oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemoModelPackage.ANALYSIS_FUNCTION_PURPOSE__PURPOSE, oldPurpose, purpose));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DemoModelPackage.ANALYSIS_FUNCTION_PURPOSE__ANALYSIS_FUNCTION, oldAnalysisFunction, analysisFunction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DemoModelPackage.ANALYSIS_FUNCTION_PURPOSE__ANALYSIS_FUNCTION, oldAnalysisFunction, analysisFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DemoModelPackage.ANALYSIS_FUNCTION_PURPOSE__PURPOSE:
				return getPurpose();
			case DemoModelPackage.ANALYSIS_FUNCTION_PURPOSE__ANALYSIS_FUNCTION:
				if (resolve) return getAnalysisFunction();
				return basicGetAnalysisFunction();
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
			case DemoModelPackage.ANALYSIS_FUNCTION_PURPOSE__PURPOSE:
				setPurpose((String)newValue);
				return;
			case DemoModelPackage.ANALYSIS_FUNCTION_PURPOSE__ANALYSIS_FUNCTION:
				setAnalysisFunction((AnalysisFunction)newValue);
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
			case DemoModelPackage.ANALYSIS_FUNCTION_PURPOSE__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
				return;
			case DemoModelPackage.ANALYSIS_FUNCTION_PURPOSE__ANALYSIS_FUNCTION:
				setAnalysisFunction((AnalysisFunction)null);
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
			case DemoModelPackage.ANALYSIS_FUNCTION_PURPOSE__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
			case DemoModelPackage.ANALYSIS_FUNCTION_PURPOSE__ANALYSIS_FUNCTION:
				return analysisFunction != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (purpose: ");
		result.append(purpose);
		result.append(')');
		return result.toString();
	}

} //AnalysisFunctionPurposeImpl
