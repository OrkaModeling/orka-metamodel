/**
 */
package com.orka.orkametamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Secret</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.orka.orkametamodel.Secret#getEncryptedData <em>Encrypted Data</em>}</li>
 * </ul>
 *
 * @see com.orka.orkametamodel.MetamodelPackage#getSecret()
 * @model
 * @generated
 */
public interface Secret extends EObject {
	/**
	 * Returns the value of the '<em><b>Encrypted Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encrypted Data</em>' attribute.
	 * @see #setEncryptedData(String)
	 * @see com.orka.orkametamodel.MetamodelPackage#getSecret_EncryptedData()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getEncryptedData();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.Secret#getEncryptedData <em>Encrypted Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encrypted Data</em>' attribute.
	 * @see #getEncryptedData()
	 * @generated
	 */
	void setEncryptedData(String value);

} // Secret
