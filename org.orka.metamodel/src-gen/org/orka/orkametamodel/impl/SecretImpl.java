/**
 */
package org.orka.orkametamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.orka.orkametamodel.MetamodelPackage;
import org.orka.orkametamodel.Secret;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Secret</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.orka.orkametamodel.impl.SecretImpl#getEncryptedData <em>Encrypted Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecretImpl extends MinimalEObjectImpl.Container implements Secret {
	/**
	 * The default value of the '{@link #getEncryptedData() <em>Encrypted Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptedData()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCRYPTED_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncryptedData() <em>Encrypted Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptedData()
	 * @generated
	 * @ordered
	 */
	protected String encryptedData = ENCRYPTED_DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecretImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.SECRET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEncryptedData() {
		return encryptedData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncryptedData(String newEncryptedData) {
		String oldEncryptedData = encryptedData;
		encryptedData = newEncryptedData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.SECRET__ENCRYPTED_DATA,
					oldEncryptedData, encryptedData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.SECRET__ENCRYPTED_DATA:
			return getEncryptedData();
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
		case MetamodelPackage.SECRET__ENCRYPTED_DATA:
			setEncryptedData((String) newValue);
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
		case MetamodelPackage.SECRET__ENCRYPTED_DATA:
			setEncryptedData(ENCRYPTED_DATA_EDEFAULT);
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
		case MetamodelPackage.SECRET__ENCRYPTED_DATA:
			return ENCRYPTED_DATA_EDEFAULT == null ? encryptedData != null
					: !ENCRYPTED_DATA_EDEFAULT.equals(encryptedData);
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
		result.append(" (encryptedData: ");
		result.append(encryptedData);
		result.append(')');
		return result.toString();
	}

} //SecretImpl
