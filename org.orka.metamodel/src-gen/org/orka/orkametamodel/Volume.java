/**
 */
package org.orka.orkametamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.orka.orkametamodel.Volume#getContainer <em>Container</em>}</li>
 *   <li>{@link org.orka.orkametamodel.Volume#getName <em>Name</em>}</li>
 *   <li>{@link org.orka.orkametamodel.Volume#getMountPath <em>Mount Path</em>}</li>
 *   <li>{@link org.orka.orkametamodel.Volume#getSubPath <em>Sub Path</em>}</li>
 *   <li>{@link org.orka.orkametamodel.Volume#getPersistentvolume <em>Persistentvolume</em>}</li>
 * </ul>
 *
 * @see org.orka.orkametamodel.MetamodelPackage#getVolume()
 * @model
 * @generated
 */
public interface Volume extends EObject {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference list.
	 * The list contents are of type {@link org.orka.orkametamodel.Container}.
	 * It is bidirectional and its opposite is '{@link org.orka.orkametamodel.Container#getVolumes <em>Volumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference list.
	 * @see org.orka.orkametamodel.MetamodelPackage#getVolume_Container()
	 * @see org.orka.orkametamodel.Container#getVolumes
	 * @model opposite="volumes"
	 * @generated
	 */
	EList<Container> getContainer();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.orka.orkametamodel.MetamodelPackage#getVolume_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.Volume#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mount Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mount Path</em>' attribute.
	 * @see #setMountPath(String)
	 * @see org.orka.orkametamodel.MetamodelPackage#getVolume_MountPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getMountPath();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.Volume#getMountPath <em>Mount Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mount Path</em>' attribute.
	 * @see #getMountPath()
	 * @generated
	 */
	void setMountPath(String value);

	/**
	 * Returns the value of the '<em><b>Sub Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Path</em>' attribute.
	 * @see #setSubPath(String)
	 * @see org.orka.orkametamodel.MetamodelPackage#getVolume_SubPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getSubPath();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.Volume#getSubPath <em>Sub Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Path</em>' attribute.
	 * @see #getSubPath()
	 * @generated
	 */
	void setSubPath(String value);

	/**
	 * Returns the value of the '<em><b>Persistentvolume</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.orka.orkametamodel.PersistentVolume#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistentvolume</em>' reference.
	 * @see #setPersistentvolume(PersistentVolume)
	 * @see org.orka.orkametamodel.MetamodelPackage#getVolume_Persistentvolume()
	 * @see org.orka.orkametamodel.PersistentVolume#getVolume
	 * @model opposite="volume"
	 * @generated
	 */
	PersistentVolume getPersistentvolume();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.Volume#getPersistentvolume <em>Persistentvolume</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistentvolume</em>' reference.
	 * @see #getPersistentvolume()
	 * @generated
	 */
	void setPersistentvolume(PersistentVolume value);

} // Volume
