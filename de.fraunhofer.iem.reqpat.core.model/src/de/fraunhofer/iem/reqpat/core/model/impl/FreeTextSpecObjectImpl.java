/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.core.model.impl;

import de.fraunhofer.iem.reqpat.core.model.CoreModelPackage;
import de.fraunhofer.iem.reqpat.core.model.FreeTextSpecObject;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Free Text Spec Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.reqpat.core.model.impl.FreeTextSpecObjectImpl#getFreeText <em>Free Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FreeTextSpecObjectImpl extends SpecObjectImpl implements FreeTextSpecObject {
	/**
	 * The default value of the '{@link #getFreeText() <em>Free Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreeText()
	 * @generated
	 * @ordered
	 */
	protected static final String FREE_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFreeText() <em>Free Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFreeText()
	 * @generated
	 * @ordered
	 */
	protected String freeText = FREE_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FreeTextSpecObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreModelPackage.Literals.FREE_TEXT_SPEC_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFreeText() {
		return freeText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFreeText(String newFreeText) {
		String oldFreeText = freeText;
		freeText = newFreeText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.FREE_TEXT_SPEC_OBJECT__FREE_TEXT, oldFreeText, freeText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoreModelPackage.FREE_TEXT_SPEC_OBJECT__FREE_TEXT:
				return getFreeText();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CoreModelPackage.FREE_TEXT_SPEC_OBJECT__FREE_TEXT:
				setFreeText((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CoreModelPackage.FREE_TEXT_SPEC_OBJECT__FREE_TEXT:
				setFreeText(FREE_TEXT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CoreModelPackage.FREE_TEXT_SPEC_OBJECT__FREE_TEXT:
				return FREE_TEXT_EDEFAULT == null ? freeText != null : !FREE_TEXT_EDEFAULT.equals(freeText);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (freeText: ");
		result.append(freeText);
		result.append(')');
		return result.toString();
	}

} //FreeTextSpecObjectImpl
