/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.demo.model.impl;

import de.fraunhofer.iem.reqpat.demo.model.AnalysisFunction;
import de.fraunhofer.iem.reqpat.demo.model.DemoModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.reqpat.demo.model.impl.AnalysisFunctionImpl#getParentAnalysisFunction <em>Parent Analysis Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnalysisFunctionImpl extends FunctionImpl implements AnalysisFunction {
	/**
	 * The cached value of the '{@link #getParentAnalysisFunction() <em>Parent Analysis Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentAnalysisFunction()
	 * @generated
	 * @ordered
	 */
	protected AnalysisFunction parentAnalysisFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DemoModelPackage.Literals.ANALYSIS_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisFunction getParentAnalysisFunction() {
		if (parentAnalysisFunction != null && parentAnalysisFunction.eIsProxy()) {
			InternalEObject oldParentAnalysisFunction = (InternalEObject)parentAnalysisFunction;
			parentAnalysisFunction = (AnalysisFunction)eResolveProxy(oldParentAnalysisFunction);
			if (parentAnalysisFunction != oldParentAnalysisFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DemoModelPackage.ANALYSIS_FUNCTION__PARENT_ANALYSIS_FUNCTION, oldParentAnalysisFunction, parentAnalysisFunction));
			}
		}
		return parentAnalysisFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisFunction basicGetParentAnalysisFunction() {
		return parentAnalysisFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAnalysisFunction(AnalysisFunction newParentAnalysisFunction) {
		AnalysisFunction oldParentAnalysisFunction = parentAnalysisFunction;
		parentAnalysisFunction = newParentAnalysisFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemoModelPackage.ANALYSIS_FUNCTION__PARENT_ANALYSIS_FUNCTION, oldParentAnalysisFunction, parentAnalysisFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DemoModelPackage.ANALYSIS_FUNCTION__PARENT_ANALYSIS_FUNCTION:
				if (resolve) return getParentAnalysisFunction();
				return basicGetParentAnalysisFunction();
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
			case DemoModelPackage.ANALYSIS_FUNCTION__PARENT_ANALYSIS_FUNCTION:
				setParentAnalysisFunction((AnalysisFunction)newValue);
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
			case DemoModelPackage.ANALYSIS_FUNCTION__PARENT_ANALYSIS_FUNCTION:
				setParentAnalysisFunction((AnalysisFunction)null);
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
			case DemoModelPackage.ANALYSIS_FUNCTION__PARENT_ANALYSIS_FUNCTION:
				return parentAnalysisFunction != null;
		}
		return super.eIsSet(featureID);
	}

} //AnalysisFunctionImpl
