/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.core.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Pattern Spec Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.reqpat.core.model.RequirementPatternSpecObject#getRequirementPatterns <em>Requirement Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.reqpat.core.model.CoreModelPackage#getRequirementPatternSpecObject()
 * @model
 * @generated
 */
public interface RequirementPatternSpecObject extends SpecObject {
	/**
	 * Returns the value of the '<em><b>Requirement Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.reqpat.core.model.RequirementPattern}.
	 * It is bidirectional and its opposite is '{@link de.fraunhofer.iem.reqpat.core.model.RequirementPattern#getSpecObject <em>Spec Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement Patterns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Patterns</em>' containment reference list.
	 * @see de.fraunhofer.iem.reqpat.core.model.CoreModelPackage#getRequirementPatternSpecObject_RequirementPatterns()
	 * @see de.fraunhofer.iem.reqpat.core.model.RequirementPattern#getSpecObject
	 * @model opposite="specObject" containment="true"
	 * @generated
	 */
	EList<RequirementPattern> getRequirementPatterns();

} // RequirementPatternSpecObject
