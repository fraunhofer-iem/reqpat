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
 * A representation of the model object '<em><b>Demo Requirement Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.reqpat.demo.model.DemoRequirementPattern#getSystemName <em>System Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.reqpat.demo.model.DemoModelPackage#getDemoRequirementPattern()
 * @model
 * @generated
 */
public interface DemoRequirementPattern extends RequirementPattern {
	/**
	 * Returns the value of the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Name</em>' attribute.
	 * @see #setSystemName(String)
	 * @see de.fraunhofer.iem.reqpat.demo.model.DemoModelPackage#getDemoRequirementPattern_SystemName()
	 * @model
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.reqpat.demo.model.DemoRequirementPattern#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

} // DemoRequirementPattern
