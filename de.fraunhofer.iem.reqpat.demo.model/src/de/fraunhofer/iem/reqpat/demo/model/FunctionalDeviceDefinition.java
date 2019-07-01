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
 * A representation of the model object '<em><b>Functional Device Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.reqpat.demo.model.FunctionalDeviceDefinition#getFunctionalDevice <em>Functional Device</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.reqpat.demo.model.DemoModelPackage#getFunctionalDeviceDefinition()
 * @model
 * @generated
 */
public interface FunctionalDeviceDefinition extends RequirementPattern {
	/**
	 * Returns the value of the '<em><b>Functional Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functional Device</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Device</em>' containment reference.
	 * @see #setFunctionalDevice(FunctionalDevice)
	 * @see de.fraunhofer.iem.reqpat.demo.model.DemoModelPackage#getFunctionalDeviceDefinition_FunctionalDevice()
	 * @model containment="true"
	 * @generated
	 */
	FunctionalDevice getFunctionalDevice();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.reqpat.demo.model.FunctionalDeviceDefinition#getFunctionalDevice <em>Functional Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functional Device</em>' containment reference.
	 * @see #getFunctionalDevice()
	 * @generated
	 */
	void setFunctionalDevice(FunctionalDevice value);

} // FunctionalDeviceDefinition
