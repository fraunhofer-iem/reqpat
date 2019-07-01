/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.fraunhofer.iem.reqpat.core.model.impl;

import de.fraunhofer.iem.reqpat.core.model.CoreModelPackage;
import de.fraunhofer.iem.reqpat.core.model.SpecObject;

import de.fraunhofer.iem.reqpat.core.model.Specification;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Spec Object</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.fraunhofer.iem.reqpat.core.model.impl.SpecObjectImpl#getId <em>
 * Id</em>}</li>
 * <li>
 * {@link de.fraunhofer.iem.reqpat.core.model.impl.SpecObjectImpl#getParentSpecObject
 * <em>Parent Spec Object</em>}</li>
 * <li>{@link de.fraunhofer.iem.reqpat.core.model.impl.SpecObjectImpl#getParent
 * <em>Parent</em>}</li>
 * <li>
 * {@link de.fraunhofer.iem.reqpat.core.model.impl.SpecObjectImpl#getSpecification
 * <em>Specification</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class SpecObjectImpl extends EObjectImpl implements SpecObject {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParentSpecObject()
	 * <em>Parent Spec Object</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getParentSpecObject()
	 * @generated
	 * @ordered
	 */
	protected SpecObject parentSpecObject;

	/**
	 * The default value of the '{@link #getParent() <em>Parent</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected String parent = PARENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected SpecObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreModelPackage.Literals.SPEC_OBJECT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CoreModelPackage.SPEC_OBJECT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public SpecObject getParentSpecObject() {
		// manual code: set the parent SpecObject if it is null
		updateParentSpecObject();

		if (parentSpecObject != null && parentSpecObject.eIsProxy()) {
			InternalEObject oldParentSpecObject = (InternalEObject) parentSpecObject;
			parentSpecObject = (SpecObject) eResolveProxy(oldParentSpecObject);
			if (parentSpecObject != oldParentSpecObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CoreModelPackage.SPEC_OBJECT__PARENT_SPEC_OBJECT,
							oldParentSpecObject, parentSpecObject));
			}
		}
		return parentSpecObject;
	}

	private void updateParentSpecObject() {
		if (basicGetParentSpecObject() == null && getParent() != null
				&& getParent().length() > 0 && getSpecification() != null) {
			String parent = getParent();
			for (SpecObject so : getSpecification().getSpecObjects()) {
				if (parent.equals(so.getId())) {
					parentSpecObject = so;
					break;
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SpecObject basicGetParentSpecObject() {
		return parentSpecObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setParent(String newParent) {
		String oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CoreModelPackage.SPEC_OBJECT__PARENT, oldParent, parent));

		// manual code: reset parent SpecObject
		parentSpecObject = null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Specification getSpecification() {
		if (eContainerFeatureID() != CoreModelPackage.SPEC_OBJECT__SPECIFICATION)
			return null;
		return (Specification) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSpecification(
			Specification newSpecification, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSpecification,
				CoreModelPackage.SPEC_OBJECT__SPECIFICATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSpecification(Specification newSpecification) {
		if (newSpecification != eInternalContainer()
				|| (eContainerFeatureID() != CoreModelPackage.SPEC_OBJECT__SPECIFICATION && newSpecification != null)) {
			if (EcoreUtil.isAncestor(this, newSpecification))
				throw new IllegalArgumentException(
						"Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject) newSpecification).eInverseAdd(this,
						CoreModelPackage.SPECIFICATION__SPEC_OBJECTS,
						Specification.class, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CoreModelPackage.SPEC_OBJECT__SPECIFICATION,
					newSpecification, newSpecification));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CoreModelPackage.SPEC_OBJECT__SPECIFICATION:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSpecification((Specification) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CoreModelPackage.SPEC_OBJECT__SPECIFICATION:
			return basicSetSpecification(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case CoreModelPackage.SPEC_OBJECT__SPECIFICATION:
			return eInternalContainer().eInverseRemove(this,
					CoreModelPackage.SPECIFICATION__SPEC_OBJECTS,
					Specification.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CoreModelPackage.SPEC_OBJECT__ID:
			return getId();
		case CoreModelPackage.SPEC_OBJECT__PARENT_SPEC_OBJECT:
			if (resolve)
				return getParentSpecObject();
			return basicGetParentSpecObject();
		case CoreModelPackage.SPEC_OBJECT__PARENT:
			return getParent();
		case CoreModelPackage.SPEC_OBJECT__SPECIFICATION:
			return getSpecification();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CoreModelPackage.SPEC_OBJECT__ID:
			setId((String) newValue);
			return;
		case CoreModelPackage.SPEC_OBJECT__PARENT:
			setParent((String) newValue);
			return;
		case CoreModelPackage.SPEC_OBJECT__SPECIFICATION:
			setSpecification((Specification) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CoreModelPackage.SPEC_OBJECT__ID:
			setId(ID_EDEFAULT);
			return;
		case CoreModelPackage.SPEC_OBJECT__PARENT:
			setParent(PARENT_EDEFAULT);
			return;
		case CoreModelPackage.SPEC_OBJECT__SPECIFICATION:
			setSpecification((Specification) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CoreModelPackage.SPEC_OBJECT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case CoreModelPackage.SPEC_OBJECT__PARENT_SPEC_OBJECT:
			return parentSpecObject != null;
		case CoreModelPackage.SPEC_OBJECT__PARENT:
			return PARENT_EDEFAULT == null ? parent != null : !PARENT_EDEFAULT
					.equals(parent);
		case CoreModelPackage.SPEC_OBJECT__SPECIFICATION:
			return getSpecification() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", parent: ");
		result.append(parent);
		result.append(')');
		return result.toString();
	}

} // SpecObjectImpl
