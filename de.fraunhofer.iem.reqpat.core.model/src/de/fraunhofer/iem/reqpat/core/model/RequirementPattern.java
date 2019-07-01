/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.core.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.reqpat.core.model.RequirementPattern#getSpecObject <em>Spec Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.reqpat.core.model.CoreModelPackage#getRequirementPattern()
 * @model abstract="true"
 * @generated
 */
public interface RequirementPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Spec Object</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.fraunhofer.iem.reqpat.core.model.RequirementPatternSpecObject#getRequirementPatterns <em>Requirement Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Object</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Object</em>' container reference.
	 * @see #setSpecObject(RequirementPatternSpecObject)
	 * @see de.fraunhofer.iem.reqpat.core.model.CoreModelPackage#getRequirementPattern_SpecObject()
	 * @see de.fraunhofer.iem.reqpat.core.model.RequirementPatternSpecObject#getRequirementPatterns
	 * @model opposite="requirementPatterns" transient="false"
	 * @generated
	 */
	RequirementPatternSpecObject getSpecObject();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.reqpat.core.model.RequirementPattern#getSpecObject <em>Spec Object</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec Object</em>' container reference.
	 * @see #getSpecObject()
	 * @generated
	 */
	void setSpecObject(RequirementPatternSpecObject value);

} // RequirementPattern
