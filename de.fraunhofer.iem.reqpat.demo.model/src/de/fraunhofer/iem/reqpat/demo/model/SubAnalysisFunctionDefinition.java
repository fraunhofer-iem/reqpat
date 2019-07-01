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
 * A representation of the model object '<em><b>Sub Analysis Function Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.reqpat.demo.model.SubAnalysisFunctionDefinition#getAnalysisFunction <em>Analysis Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.reqpat.demo.model.DemoModelPackage#getSubAnalysisFunctionDefinition()
 * @model
 * @generated
 */
public interface SubAnalysisFunctionDefinition extends RequirementPattern {
	/**
	 * Returns the value of the '<em><b>Analysis Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analysis Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis Function</em>' containment reference.
	 * @see #setAnalysisFunction(AnalysisFunction)
	 * @see de.fraunhofer.iem.reqpat.demo.model.DemoModelPackage#getSubAnalysisFunctionDefinition_AnalysisFunction()
	 * @model containment="true"
	 * @generated
	 */
	AnalysisFunction getAnalysisFunction();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.reqpat.demo.model.SubAnalysisFunctionDefinition#getAnalysisFunction <em>Analysis Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analysis Function</em>' containment reference.
	 * @see #getAnalysisFunction()
	 * @generated
	 */
	void setAnalysisFunction(AnalysisFunction value);

} // SubAnalysisFunctionDefinition
