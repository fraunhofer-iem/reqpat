/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.core.model.impl;

import de.fraunhofer.iem.reqpat.core.model.CoreModelPackage;
import de.fraunhofer.iem.reqpat.core.model.RequirementPattern;
import de.fraunhofer.iem.reqpat.core.model.RequirementPatternSpecObject;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.reqpat.core.model.impl.RequirementPatternImpl#getSpecObject <em>Spec Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RequirementPatternImpl extends EObjectImpl implements RequirementPattern {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreModelPackage.Literals.REQUIREMENT_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementPatternSpecObject getSpecObject() {
		if (eContainerFeatureID() != CoreModelPackage.REQUIREMENT_PATTERN__SPEC_OBJECT) return null;
		return (RequirementPatternSpecObject)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecObject(RequirementPatternSpecObject newSpecObject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSpecObject, CoreModelPackage.REQUIREMENT_PATTERN__SPEC_OBJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecObject(RequirementPatternSpecObject newSpecObject) {
		if (newSpecObject != eInternalContainer() || (eContainerFeatureID() != CoreModelPackage.REQUIREMENT_PATTERN__SPEC_OBJECT && newSpecObject != null)) {
			if (EcoreUtil.isAncestor(this, newSpecObject))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSpecObject != null)
				msgs = ((InternalEObject)newSpecObject).eInverseAdd(this, CoreModelPackage.REQUIREMENT_PATTERN_SPEC_OBJECT__REQUIREMENT_PATTERNS, RequirementPatternSpecObject.class, msgs);
			msgs = basicSetSpecObject(newSpecObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CoreModelPackage.REQUIREMENT_PATTERN__SPEC_OBJECT, newSpecObject, newSpecObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoreModelPackage.REQUIREMENT_PATTERN__SPEC_OBJECT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSpecObject((RequirementPatternSpecObject)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoreModelPackage.REQUIREMENT_PATTERN__SPEC_OBJECT:
				return basicSetSpecObject(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CoreModelPackage.REQUIREMENT_PATTERN__SPEC_OBJECT:
				return eInternalContainer().eInverseRemove(this, CoreModelPackage.REQUIREMENT_PATTERN_SPEC_OBJECT__REQUIREMENT_PATTERNS, RequirementPatternSpecObject.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoreModelPackage.REQUIREMENT_PATTERN__SPEC_OBJECT:
				return getSpecObject();
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
			case CoreModelPackage.REQUIREMENT_PATTERN__SPEC_OBJECT:
				setSpecObject((RequirementPatternSpecObject)newValue);
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
			case CoreModelPackage.REQUIREMENT_PATTERN__SPEC_OBJECT:
				setSpecObject((RequirementPatternSpecObject)null);
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
			case CoreModelPackage.REQUIREMENT_PATTERN__SPEC_OBJECT:
				return getSpecObject() != null;
		}
		return super.eIsSet(featureID);
	}

} //RequirementPatternImpl
