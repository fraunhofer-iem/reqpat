/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.core.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Free Text Spec Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.reqpat.core.model.FreeTextSpecObject#getFreeText <em>Free Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.fraunhofer.iem.reqpat.core.model.CoreModelPackage#getFreeTextSpecObject()
 * @model
 * @generated
 */
public interface FreeTextSpecObject extends SpecObject {
	/**
	 * Returns the value of the '<em><b>Free Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Free Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Free Text</em>' attribute.
	 * @see #setFreeText(String)
	 * @see de.fraunhofer.iem.reqpat.core.model.CoreModelPackage#getFreeTextSpecObject_FreeText()
	 * @model
	 * @generated
	 */
	String getFreeText();

	/**
	 * Sets the value of the '{@link de.fraunhofer.iem.reqpat.core.model.FreeTextSpecObject#getFreeText <em>Free Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free Text</em>' attribute.
	 * @see #getFreeText()
	 * @generated
	 */
	void setFreeText(String value);

} // FreeTextSpecObject
