/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.core.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.reqpat.core.model.Specification#getSpecObjects <em>Spec Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.reqpat.core.model.CoreModelPackage#getSpecification()
 * @model
 * @generated
 */
public interface Specification extends EObject {
	/**
	 * Returns the value of the '<em><b>Spec Objects</b></em>' containment reference list.
	 * The list contents are of type {@link de.fraunhofer.iem.reqpat.core.model.SpecObject}.
	 * It is bidirectional and its opposite is '{@link de.fraunhofer.iem.reqpat.core.model.SpecObject#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Objects</em>' containment reference list.
	 * @see de.fraunhofer.iem.reqpat.core.model.CoreModelPackage#getSpecification_SpecObjects()
	 * @see de.fraunhofer.iem.reqpat.core.model.SpecObject#getSpecification
	 * @model opposite="specification" containment="true"
	 * @generated
	 */
	EList<SpecObject> getSpecObjects();

} // Specification
