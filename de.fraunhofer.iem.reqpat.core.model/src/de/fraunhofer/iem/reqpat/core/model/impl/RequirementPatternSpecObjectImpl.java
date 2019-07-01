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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Pattern Spec Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.reqpat.core.model.impl.RequirementPatternSpecObjectImpl#getRequirementPatterns <em>Requirement Patterns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequirementPatternSpecObjectImpl extends SpecObjectImpl implements RequirementPatternSpecObject {
	/**
	 * The cached value of the '{@link #getRequirementPatterns() <em>Requirement Patterns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementPatterns()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementPattern> requirementPatterns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementPatternSpecObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreModelPackage.Literals.REQUIREMENT_PATTERN_SPEC_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequirementPattern> getRequirementPatterns() {
		if (requirementPatterns == null) {
			requirementPatterns = new EObjectContainmentWithInverseEList<RequirementPattern>(RequirementPattern.class, this, CoreModelPackage.REQUIREMENT_PATTERN_SPEC_OBJECT__REQUIREMENT_PATTERNS, CoreModelPackage.REQUIREMENT_PATTERN__SPEC_OBJECT);
		}
		return requirementPatterns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CoreModelPackage.REQUIREMENT_PATTERN_SPEC_OBJECT__REQUIREMENT_PATTERNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequirementPatterns()).basicAdd(otherEnd, msgs);
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
			case CoreModelPackage.REQUIREMENT_PATTERN_SPEC_OBJECT__REQUIREMENT_PATTERNS:
				return ((InternalEList<?>)getRequirementPatterns()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoreModelPackage.REQUIREMENT_PATTERN_SPEC_OBJECT__REQUIREMENT_PATTERNS:
				return getRequirementPatterns();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CoreModelPackage.REQUIREMENT_PATTERN_SPEC_OBJECT__REQUIREMENT_PATTERNS:
				getRequirementPatterns().clear();
				getRequirementPatterns().addAll((Collection<? extends RequirementPattern>)newValue);
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
			case CoreModelPackage.REQUIREMENT_PATTERN_SPEC_OBJECT__REQUIREMENT_PATTERNS:
				getRequirementPatterns().clear();
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
			case CoreModelPackage.REQUIREMENT_PATTERN_SPEC_OBJECT__REQUIREMENT_PATTERNS:
				return requirementPatterns != null && !requirementPatterns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RequirementPatternSpecObjectImpl
