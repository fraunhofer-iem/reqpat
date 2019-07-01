/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.demo.model;

import de.fraunhofer.iem.reqpat.core.model.RequirementPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis Function Purpose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.reqpat.demo.model.AnalysisFunctionPurpose#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link de.fraunhofer.iem.reqpat.demo.model.AnalysisFunctionPurpose#getAnalysisFunction <em>Analysis Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.reqpat.demo.model.DemoModelPackage#getAnalysisFunctionPurpose()
 * @model
 * @generated
 */
public interface AnalysisFunctionPurpose extends RequirementPattern {
	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(String)
	 * @see de.fraunhofer.iem.reqpat.demo.model.DemoModelPackage#getAnalysisFunctionPurpose_Purpose()
	 * @model
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.reqpat.demo.model.AnalysisFunctionPurpose#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

	/**
	 * Returns the value of the '<em><b>Analysis Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analysis Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis Function</em>' reference.
	 * @see #setAnalysisFunction(AnalysisFunction)
	 * @see de.fraunhofer.iem.reqpat.demo.model.DemoModelPackage#getAnalysisFunctionPurpose_AnalysisFunction()
	 * @model
	 * @generated
	 */
	AnalysisFunction getAnalysisFunction();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.reqpat.demo.model.AnalysisFunctionPurpose#getAnalysisFunction <em>Analysis Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analysis Function</em>' reference.
	 * @see #getAnalysisFunction()
	 * @generated
	 */
	void setAnalysisFunction(AnalysisFunction value);

} // AnalysisFunctionPurpose
