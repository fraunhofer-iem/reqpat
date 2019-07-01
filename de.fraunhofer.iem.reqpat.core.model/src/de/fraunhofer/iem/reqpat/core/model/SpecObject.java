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
 * A representation of the model object '<em><b>Spec Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.reqpat.core.model.SpecObject#getId <em>Id</em>}</li>
 *   <li>{@link de.fraunhofer.iem.reqpat.core.model.SpecObject#getParentSpecObject <em>Parent Spec Object</em>}</li>
 *   <li>{@link de.fraunhofer.iem.reqpat.core.model.SpecObject#getParent <em>Parent</em>}</li>
 *   <li>{@link de.fraunhofer.iem.reqpat.core.model.SpecObject#getSpecification <em>Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.reqpat.core.model.CoreModelPackage#getSpecObject()
 * @model abstract="true"
 * @generated
 */
public interface SpecObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.fraunhofer.iem.reqpat.core.model.CoreModelPackage#getSpecObject_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.reqpat.core.model.SpecObject#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Parent Spec Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Spec Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Spec Object</em>' reference.
	 * @see de.fraunhofer.iem.reqpat.core.model.CoreModelPackage#getSpecObject_ParentSpecObject()
	 * @model transient="true" changeable="false" derived="true"
	 * @generated
	 */
	SpecObject getParentSpecObject();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' attribute.
	 * @see #setParent(String)
	 * @see de.fraunhofer.iem.reqpat.core.model.CoreModelPackage#getSpecObject_Parent()
	 * @model
	 * @generated
	 */
	String getParent();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.reqpat.core.model.SpecObject#getParent <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' attribute.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(String value);

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.fraunhofer.iem.reqpat.core.model.Specification#getSpecObjects <em>Spec Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' container reference.
	 * @see #setSpecification(Specification)
	 * @see de.fraunhofer.iem.reqpat.core.model.CoreModelPackage#getSpecObject_Specification()
	 * @see de.fraunhofer.iem.reqpat.core.model.Specification#getSpecObjects
	 * @model opposite="specObjects" transient="false"
	 * @generated
	 */
	Specification getSpecification();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.reqpat.core.model.SpecObject#getSpecification <em>Specification</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' container reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(Specification value);

} // SpecObject
