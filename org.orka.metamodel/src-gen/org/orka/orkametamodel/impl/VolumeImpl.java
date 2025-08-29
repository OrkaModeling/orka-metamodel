/**
 */
package org.orka.orkametamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.orka.orkametamodel.MetamodelPackage;
import org.orka.orkametamodel.PersistentVolume;
import org.orka.orkametamodel.Volume;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Volume</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.orka.orkametamodel.impl.VolumeImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.VolumeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.VolumeImpl#getMountPath <em>Mount Path</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.VolumeImpl#getSubPath <em>Sub Path</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.VolumeImpl#getPersistentvolume <em>Persistentvolume</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VolumeImpl extends MinimalEObjectImpl.Container implements Volume {
	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<org.orka.orkametamodel.Container> container;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMountPath() <em>Mount Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountPath()
	 * @generated
	 * @ordered
	 */
	protected static final String MOUNT_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMountPath() <em>Mount Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountPath()
	 * @generated
	 * @ordered
	 */
	protected String mountPath = MOUNT_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubPath() <em>Sub Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPath()
	 * @generated
	 * @ordered
	 */
	protected static final String SUB_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubPath() <em>Sub Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPath()
	 * @generated
	 * @ordered
	 */
	protected String subPath = SUB_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPersistentvolume() <em>Persistentvolume</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistentvolume()
	 * @generated
	 * @ordered
	 */
	protected PersistentVolume persistentvolume;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.VOLUME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.orka.orkametamodel.Container> getContainer() {
		if (container == null) {
			container = new EObjectWithInverseResolvingEList.ManyInverse<org.orka.orkametamodel.Container>(
					org.orka.orkametamodel.Container.class, this, MetamodelPackage.VOLUME__CONTAINER,
					MetamodelPackage.CONTAINER__VOLUMES);
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.VOLUME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMountPath() {
		return mountPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMountPath(String newMountPath) {
		String oldMountPath = mountPath;
		mountPath = newMountPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.VOLUME__MOUNT_PATH, oldMountPath,
					mountPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubPath() {
		return subPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubPath(String newSubPath) {
		String oldSubPath = subPath;
		subPath = newSubPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.VOLUME__SUB_PATH, oldSubPath,
					subPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistentVolume getPersistentvolume() {
		if (persistentvolume != null && persistentvolume.eIsProxy()) {
			InternalEObject oldPersistentvolume = (InternalEObject) persistentvolume;
			persistentvolume = (PersistentVolume) eResolveProxy(oldPersistentvolume);
			if (persistentvolume != oldPersistentvolume) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.VOLUME__PERSISTENTVOLUME,
							oldPersistentvolume, persistentvolume));
			}
		}
		return persistentvolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistentVolume basicGetPersistentvolume() {
		return persistentvolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersistentvolume(PersistentVolume newPersistentvolume, NotificationChain msgs) {
		PersistentVolume oldPersistentvolume = persistentvolume;
		persistentvolume = newPersistentvolume;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.VOLUME__PERSISTENTVOLUME, oldPersistentvolume, newPersistentvolume);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistentvolume(PersistentVolume newPersistentvolume) {
		if (newPersistentvolume != persistentvolume) {
			NotificationChain msgs = null;
			if (persistentvolume != null)
				msgs = ((InternalEObject) persistentvolume).eInverseRemove(this,
						MetamodelPackage.PERSISTENT_VOLUME__VOLUME, PersistentVolume.class, msgs);
			if (newPersistentvolume != null)
				msgs = ((InternalEObject) newPersistentvolume).eInverseAdd(this,
						MetamodelPackage.PERSISTENT_VOLUME__VOLUME, PersistentVolume.class, msgs);
			msgs = basicSetPersistentvolume(newPersistentvolume, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.VOLUME__PERSISTENTVOLUME,
					newPersistentvolume, newPersistentvolume));
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
		case MetamodelPackage.VOLUME__CONTAINER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getContainer()).basicAdd(otherEnd, msgs);
		case MetamodelPackage.VOLUME__PERSISTENTVOLUME:
			if (persistentvolume != null)
				msgs = ((InternalEObject) persistentvolume).eInverseRemove(this,
						MetamodelPackage.PERSISTENT_VOLUME__VOLUME, PersistentVolume.class, msgs);
			return basicSetPersistentvolume((PersistentVolume) otherEnd, msgs);
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
		case MetamodelPackage.VOLUME__CONTAINER:
			return ((InternalEList<?>) getContainer()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.VOLUME__PERSISTENTVOLUME:
			return basicSetPersistentvolume(null, msgs);
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
		case MetamodelPackage.VOLUME__CONTAINER:
			return getContainer();
		case MetamodelPackage.VOLUME__NAME:
			return getName();
		case MetamodelPackage.VOLUME__MOUNT_PATH:
			return getMountPath();
		case MetamodelPackage.VOLUME__SUB_PATH:
			return getSubPath();
		case MetamodelPackage.VOLUME__PERSISTENTVOLUME:
			if (resolve)
				return getPersistentvolume();
			return basicGetPersistentvolume();
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
		case MetamodelPackage.VOLUME__CONTAINER:
			getContainer().clear();
			getContainer().addAll((Collection<? extends org.orka.orkametamodel.Container>) newValue);
			return;
		case MetamodelPackage.VOLUME__NAME:
			setName((String) newValue);
			return;
		case MetamodelPackage.VOLUME__MOUNT_PATH:
			setMountPath((String) newValue);
			return;
		case MetamodelPackage.VOLUME__SUB_PATH:
			setSubPath((String) newValue);
			return;
		case MetamodelPackage.VOLUME__PERSISTENTVOLUME:
			setPersistentvolume((PersistentVolume) newValue);
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
		case MetamodelPackage.VOLUME__CONTAINER:
			getContainer().clear();
			return;
		case MetamodelPackage.VOLUME__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MetamodelPackage.VOLUME__MOUNT_PATH:
			setMountPath(MOUNT_PATH_EDEFAULT);
			return;
		case MetamodelPackage.VOLUME__SUB_PATH:
			setSubPath(SUB_PATH_EDEFAULT);
			return;
		case MetamodelPackage.VOLUME__PERSISTENTVOLUME:
			setPersistentvolume((PersistentVolume) null);
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
		case MetamodelPackage.VOLUME__CONTAINER:
			return container != null && !container.isEmpty();
		case MetamodelPackage.VOLUME__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MetamodelPackage.VOLUME__MOUNT_PATH:
			return MOUNT_PATH_EDEFAULT == null ? mountPath != null : !MOUNT_PATH_EDEFAULT.equals(mountPath);
		case MetamodelPackage.VOLUME__SUB_PATH:
			return SUB_PATH_EDEFAULT == null ? subPath != null : !SUB_PATH_EDEFAULT.equals(subPath);
		case MetamodelPackage.VOLUME__PERSISTENTVOLUME:
			return persistentvolume != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", mountPath: ");
		result.append(mountPath);
		result.append(", subPath: ");
		result.append(subPath);
		result.append(')');
		return result.toString();
	}

} //VolumeImpl
