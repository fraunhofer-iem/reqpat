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
 * A representation of the model object '<em><b>Incoming Information Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.reqpat.demo.model.IncomingInformationDefinition#getFunctionalDevice <em>Functional Device</em>}</li>
 *   <li>{@link de.fraunhofer.iem.reqpat.demo.model.IncomingInformationDefinition#getAnalysisFunction <em>Analysis Function</em>}</li>
 *   <li>{@link de.fraunhofer.iem.reqpat.demo.model.IncomingInformationDefinition#getInformationList <em>Information List</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.reqpat.demo.model.DemoModelPackage#getIncomingInformationDefinition()
 * @model
 * @generated
 */
public interface IncomingInformationDefinition extends RequirementPattern {
	/**
	 * Returns the value of the '<em><b>Functional Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functional Device</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Device</em>' reference.
	 * @see #setFunctionalDevice(FunctionalDevice)
	 * @see de.fraunhofer.iem.reqpat.demo.model.DemoModelPackage#getIncomingInformationDefinition_FunctionalDevice()
	 * @model
	 * @generated
	 */
	FunctionalDevice getFunctionalDevice();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.reqpat.demo.model.IncomingInformationDefinition#getFunctionalDevice <em>Functional Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functional Device</em>' reference.
	 * @see #getFunctionalDevice()
	 * @generated
	 */
	void setFunctionalDevice(FunctionalDevice value);

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
	 * @see de.fraunhofer.iem.reqpat.demo.model.DemoModelPackage#getIncomingInformationDefinition_AnalysisFunction()
	 * @model
	 * @generated
	 */
	AnalysisFunction getAnalysisFunction();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.reqpat.demo.model.IncomingInformationDefinition#getAnalysisFunction <em>Analysis Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analysis Function</em>' reference.
	 * @see #getAnalysisFunction()
	 * @generated
	 */
	void setAnalysisFunction(AnalysisFunction value);

	/**
	 * Returns the value of the '<em><b>Information List</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.reqpat.demo.model.Information}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Information List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information List</em>' containment reference list.
	 * @see de.fraunhofer.iem.reqpat.demo.model.DemoModelPackage#getIncomingInformationDefinition_InformationList()
	 * @model containment="true"
	 * @generated
	 */
	EList<Information> getInformationList();

} // IncomingInformationDefinition
