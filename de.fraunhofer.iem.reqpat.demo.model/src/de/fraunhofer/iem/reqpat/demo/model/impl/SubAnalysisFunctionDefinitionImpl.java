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
import de.fraunhofer.iem.reqpat.demo.model.SubAnalysisFunctionDefinition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Analysis Function Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.reqpat.demo.model.impl.SubAnalysisFunctionDefinitionImpl#getAnalysisFunction <em>Analysis Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubAnalysisFunctionDefinitionImpl extends RequirementPatternImpl implements SubAnalysisFunctionDefinition {
	/**
	 * The cached value of the '{@link #getAnalysisFunction() <em>Analysis Function</em>}' containment reference.
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
	protected SubAnalysisFunctionDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DemoModelPackage.Literals.SUB_ANALYSIS_FUNCTION_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisFunction getAnalysisFunction() {
		return analysisFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnalysisFunction(AnalysisFunction newAnalysisFunction, NotificationChain msgs) {
		AnalysisFunction oldAnalysisFunction = analysisFunction;
		analysisFunction = newAnalysisFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DemoModelPackage.SUB_ANALYSIS_FUNCTION_DEFINITION__ANALYSIS_FUNCTION, oldAnalysisFunction, newAnalysisFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnalysisFunction(AnalysisFunction newAnalysisFunction) {
		if (newAnalysisFunction != analysisFunction) {
			NotificationChain msgs = null;
			if (analysisFunction != null)
				msgs = ((InternalEObject)analysisFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DemoModelPackage.SUB_ANALYSIS_FUNCTION_DEFINITION__ANALYSIS_FUNCTION, null, msgs);
			if (newAnalysisFunction != null)
				msgs = ((InternalEObject)newAnalysisFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DemoModelPackage.SUB_ANALYSIS_FUNCTION_DEFINITION__ANALYSIS_FUNCTION, null, msgs);
			msgs = basicSetAnalysisFunction(newAnalysisFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DemoModelPackage.SUB_ANALYSIS_FUNCTION_DEFINITION__ANALYSIS_FUNCTION, newAnalysisFunction, newAnalysisFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DemoModelPackage.SUB_ANALYSIS_FUNCTION_DEFINITION__ANALYSIS_FUNCTION:
				return basicSetAnalysisFunction(null, msgs);
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
			case DemoModelPackage.SUB_ANALYSIS_FUNCTION_DEFINITION__ANALYSIS_FUNCTION:
				return getAnalysisFunction();
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
			case DemoModelPackage.SUB_ANALYSIS_FUNCTION_DEFINITION__ANALYSIS_FUNCTION:
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
			case DemoModelPackage.SUB_ANALYSIS_FUNCTION_DEFINITION__ANALYSIS_FUNCTION:
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
			case DemoModelPackage.SUB_ANALYSIS_FUNCTION_DEFINITION__ANALYSIS_FUNCTION:
				return analysisFunction != null;
		}
		return super.eIsSet(featureID);
	}

} //SubAnalysisFunctionDefinitionImpl
