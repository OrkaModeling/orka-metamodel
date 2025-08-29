/**
 */
package org.orka.orkametamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.orka.orkametamodel.AccessMode;
import org.orka.orkametamodel.MetamodelPackage;
import org.orka.orkametamodel.PersistentVolume;
import org.orka.orkametamodel.Volume;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persistent Volume</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.orka.orkametamodel.impl.PersistentVolumeImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.PersistentVolumeImpl#getStorageClass <em>Storage Class</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.PersistentVolumeImpl#getAccessMode <em>Access Mode</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.PersistentVolumeImpl#getVolume <em>Volume</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersistentVolumeImpl extends MinimalEObjectImpl.Container implements PersistentVolume {
	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected String capacity = CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStorageClass() <em>Storage Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageClass()
	 * @generated
	 * @ordered
	 */
	protected static final String STORAGE_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStorageClass() <em>Storage Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageClass()
	 * @generated
	 * @ordered
	 */
	protected String storageClass = STORAGE_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessMode() <em>Access Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessMode()
	 * @generated
	 * @ordered
	 */
	protected static final AccessMode ACCESS_MODE_EDEFAULT = AccessMode.READ_WRITE_ONCE;

	/**
	 * The cached value of the '{@link #getAccessMode() <em>Access Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessMode()
	 * @generated
	 * @ordered
	 */
	protected AccessMode accessMode = ACCESS_MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected Volume volume;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersistentVolumeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.PERSISTENT_VOLUME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(String newCapacity) {
		String oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.PERSISTENT_VOLUME__CAPACITY,
					oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStorageClass() {
		return storageClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorageClass(String newStorageClass) {
		String oldStorageClass = storageClass;
		storageClass = newStorageClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.PERSISTENT_VOLUME__STORAGE_CLASS,
					oldStorageClass, storageClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessMode getAccessMode() {
		return accessMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessMode(AccessMode newAccessMode) {
		AccessMode oldAccessMode = accessMode;
		accessMode = newAccessMode == null ? ACCESS_MODE_EDEFAULT : newAccessMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.PERSISTENT_VOLUME__ACCESS_MODE,
					oldAccessMode, accessMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Volume getVolume() {
		if (volume != null && volume.eIsProxy()) {
			InternalEObject oldVolume = (InternalEObject) volume;
			volume = (Volume) eResolveProxy(oldVolume);
			if (volume != oldVolume) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetamodelPackage.PERSISTENT_VOLUME__VOLUME, oldVolume, volume));
			}
		}
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Volume basicGetVolume() {
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVolume(Volume newVolume, NotificationChain msgs) {
		Volume oldVolume = volume;
		volume = newVolume;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.PERSISTENT_VOLUME__VOLUME, oldVolume, newVolume);
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
	public void setVolume(Volume newVolume) {
		if (newVolume != volume) {
			NotificationChain msgs = null;
			if (volume != null)
				msgs = ((InternalEObject) volume).eInverseRemove(this, MetamodelPackage.VOLUME__PERSISTENTVOLUME,
						Volume.class, msgs);
			if (newVolume != null)
				msgs = ((InternalEObject) newVolume).eInverseAdd(this, MetamodelPackage.VOLUME__PERSISTENTVOLUME,
						Volume.class, msgs);
			msgs = basicSetVolume(newVolume, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.PERSISTENT_VOLUME__VOLUME, newVolume,
					newVolume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.PERSISTENT_VOLUME__VOLUME:
			if (volume != null)
				msgs = ((InternalEObject) volume).eInverseRemove(this, MetamodelPackage.VOLUME__PERSISTENTVOLUME,
						Volume.class, msgs);
			return basicSetVolume((Volume) otherEnd, msgs);
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
		case MetamodelPackage.PERSISTENT_VOLUME__VOLUME:
			return basicSetVolume(null, msgs);
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
		case MetamodelPackage.PERSISTENT_VOLUME__CAPACITY:
			return getCapacity();
		case MetamodelPackage.PERSISTENT_VOLUME__STORAGE_CLASS:
			return getStorageClass();
		case MetamodelPackage.PERSISTENT_VOLUME__ACCESS_MODE:
			return getAccessMode();
		case MetamodelPackage.PERSISTENT_VOLUME__VOLUME:
			if (resolve)
				return getVolume();
			return basicGetVolume();
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
		case MetamodelPackage.PERSISTENT_VOLUME__CAPACITY:
			setCapacity((String) newValue);
			return;
		case MetamodelPackage.PERSISTENT_VOLUME__STORAGE_CLASS:
			setStorageClass((String) newValue);
			return;
		case MetamodelPackage.PERSISTENT_VOLUME__ACCESS_MODE:
			setAccessMode((AccessMode) newValue);
			return;
		case MetamodelPackage.PERSISTENT_VOLUME__VOLUME:
			setVolume((Volume) newValue);
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
		case MetamodelPackage.PERSISTENT_VOLUME__CAPACITY:
			setCapacity(CAPACITY_EDEFAULT);
			return;
		case MetamodelPackage.PERSISTENT_VOLUME__STORAGE_CLASS:
			setStorageClass(STORAGE_CLASS_EDEFAULT);
			return;
		case MetamodelPackage.PERSISTENT_VOLUME__ACCESS_MODE:
			setAccessMode(ACCESS_MODE_EDEFAULT);
			return;
		case MetamodelPackage.PERSISTENT_VOLUME__VOLUME:
			setVolume((Volume) null);
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
		case MetamodelPackage.PERSISTENT_VOLUME__CAPACITY:
			return CAPACITY_EDEFAULT == null ? capacity != null : !CAPACITY_EDEFAULT.equals(capacity);
		case MetamodelPackage.PERSISTENT_VOLUME__STORAGE_CLASS:
			return STORAGE_CLASS_EDEFAULT == null ? storageClass != null : !STORAGE_CLASS_EDEFAULT.equals(storageClass);
		case MetamodelPackage.PERSISTENT_VOLUME__ACCESS_MODE:
			return accessMode != ACCESS_MODE_EDEFAULT;
		case MetamodelPackage.PERSISTENT_VOLUME__VOLUME:
			return volume != null;
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
		result.append(" (capacity: ");
		result.append(capacity);
		result.append(", storageClass: ");
		result.append(storageClass);
		result.append(", accessMode: ");
		result.append(accessMode);
		result.append(')');
		return result.toString();
	}

} //PersistentVolumeImpl
