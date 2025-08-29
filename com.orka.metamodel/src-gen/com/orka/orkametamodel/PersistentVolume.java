/**
 */
package com.orka.orkametamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persistent Volume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.orka.orkametamodel.PersistentVolume#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link com.orka.orkametamodel.PersistentVolume#getStorageClass <em>Storage Class</em>}</li>
 *   <li>{@link com.orka.orkametamodel.PersistentVolume#getAccessMode <em>Access Mode</em>}</li>
 *   <li>{@link com.orka.orkametamodel.PersistentVolume#getVolume <em>Volume</em>}</li>
 * </ul>
 *
 * @see com.orka.orkametamodel.MetamodelPackage#getPersistentVolume()
 * @model
 * @generated
 */
public interface PersistentVolume extends EObject {
	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(String)
	 * @see com.orka.orkametamodel.MetamodelPackage#getPersistentVolume_Capacity()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getCapacity();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.PersistentVolume#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(String value);

	/**
	 * Returns the value of the '<em><b>Storage Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Class</em>' attribute.
	 * @see #setStorageClass(String)
	 * @see com.orka.orkametamodel.MetamodelPackage#getPersistentVolume_StorageClass()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getStorageClass();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.PersistentVolume#getStorageClass <em>Storage Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Class</em>' attribute.
	 * @see #getStorageClass()
	 * @generated
	 */
	void setStorageClass(String value);

	/**
	 * Returns the value of the '<em><b>Access Mode</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link com.orka.orkametamodel.AccessMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Mode</em>' attribute.
	 * @see com.orka.orkametamodel.AccessMode
	 * @see #setAccessMode(AccessMode)
	 * @see com.orka.orkametamodel.MetamodelPackage#getPersistentVolume_AccessMode()
	 * @model default=""
	 * @generated
	 */
	AccessMode getAccessMode();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.PersistentVolume#getAccessMode <em>Access Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Mode</em>' attribute.
	 * @see com.orka.orkametamodel.AccessMode
	 * @see #getAccessMode()
	 * @generated
	 */
	void setAccessMode(AccessMode value);

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.orka.orkametamodel.Volume#getPersistentvolume <em>Persistentvolume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume</em>' reference.
	 * @see #setVolume(Volume)
	 * @see com.orka.orkametamodel.MetamodelPackage#getPersistentVolume_Volume()
	 * @see com.orka.orkametamodel.Volume#getPersistentvolume
	 * @model opposite="persistentvolume"
	 * @generated
	 */
	Volume getVolume();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.PersistentVolume#getVolume <em>Volume</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' reference.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(Volume value);

} // PersistentVolume
