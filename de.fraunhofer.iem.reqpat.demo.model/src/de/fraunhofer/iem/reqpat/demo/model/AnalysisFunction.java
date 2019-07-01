/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.demo.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.reqpat.demo.model.AnalysisFunction#getParentAnalysisFunction <em>Parent Analysis Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.reqpat.demo.model.DemoModelPackage#getAnalysisFunction()
 * @model
 * @generated
 */
public interface AnalysisFunction extends Function {
	/**
	 * Returns the value of the '<em><b>Parent Analysis Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Analysis Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Analysis Function</em>' reference.
	 * @see #setParentAnalysisFunction(AnalysisFunction)
	 * @see de.fraunhofer.iem.reqpat.demo.model.DemoModelPackage#getAnalysisFunction_ParentAnalysisFunction()
	 * @model
	 * @generated
	 */
	AnalysisFunction getParentAnalysisFunction();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.reqpat.demo.model.AnalysisFunction#getParentAnalysisFunction <em>Parent Analysis Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Analysis Function</em>' reference.
	 * @see #getParentAnalysisFunction()
	 * @generated
	 */
	void setParentAnalysisFunction(AnalysisFunction value);

} // AnalysisFunction
