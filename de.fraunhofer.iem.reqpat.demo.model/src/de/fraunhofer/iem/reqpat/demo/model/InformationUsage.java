/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.demo.model;

import de.fraunhofer.iem.reqpat.core.model.RequirementPattern;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.reqpat.demo.model.InformationUsage#getAnalysisFunction <em>Analysis Function</em>}</li>
 *   <li>{@link de.fraunhofer.iem.reqpat.demo.model.InformationUsage#getInformationList <em>Information List</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.reqpat.demo.model.DemoModelPackage#getInformationUsage()
 * @model
 * @generated
 */
public interface InformationUsage extends RequirementPattern {
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
	 * @see de.fraunhofer.iem.reqpat.demo.model.DemoModelPackage#getInformationUsage_AnalysisFunction()
	 * @model
	 * @generated
	 */
	AnalysisFunction getAnalysisFunction();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.reqpat.demo.model.InformationUsage#getAnalysisFunction <em>Analysis Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analysis Function</em>' reference.
	 * @see #getAnalysisFunction()
	 * @generated
	 */
	void setAnalysisFunction(AnalysisFunction value);

	/**
	 * Returns the value of the '<em><b>Information List</b></em>' reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.reqpat.demo.model.Information}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Information List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information List</em>' reference list.
	 * @see de.fraunhofer.iem.reqpat.demo.model.DemoModelPackage#getInformationUsage_InformationList()
	 * @model
	 * @generated
	 */
	EList<Information> getInformationList();

} // InformationUsage
