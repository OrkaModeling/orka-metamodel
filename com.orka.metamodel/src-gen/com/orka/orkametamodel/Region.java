/**
 */
package com.orka.orkametamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.orka.orkametamodel.Region#getZone <em>Zone</em>}</li>
 *   <li>{@link com.orka.orkametamodel.Region#getCluster <em>Cluster</em>}</li>
 *   <li>{@link com.orka.orkametamodel.Region#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.orka.orkametamodel.MetamodelPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends EObject {
	/**
	 * Returns the value of the '<em><b>Zone</b></em>' reference list.
	 * The list contents are of type {@link com.orka.orkametamodel.Zone}.
	 * It is bidirectional and its opposite is '{@link com.orka.orkametamodel.Zone#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone</em>' reference list.
	 * @see com.orka.orkametamodel.MetamodelPackage#getRegion_Zone()
	 * @see com.orka.orkametamodel.Zone#getRegion
	 * @model opposite="region"
	 * @generated
	 */
	EList<Zone> getZone();

	/**
	 * Returns the value of the '<em><b>Cluster</b></em>' reference list.
	 * The list contents are of type {@link com.orka.orkametamodel.Cluster}.
	 * It is bidirectional and its opposite is '{@link com.orka.orkametamodel.Cluster#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cluster</em>' reference list.
	 * @see com.orka.orkametamodel.MetamodelPackage#getRegion_Cluster()
	 * @see com.orka.orkametamodel.Cluster#getRegion
	 * @model opposite="region"
	 * @generated
	 */
	EList<Cluster> getCluster();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.orka.orkametamodel.MetamodelPackage#getRegion_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.Region#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Region
