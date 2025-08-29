/**
 */
package org.orka.orkametamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.orka.orkametamodel.Zone#getRegion <em>Region</em>}</li>
 *   <li>{@link org.orka.orkametamodel.Zone#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.orka.orkametamodel.MetamodelPackage#getZone()
 * @model
 * @generated
 */
public interface Zone extends EObject {
	/**
	 * Returns the value of the '<em><b>Region</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.orka.orkametamodel.Region#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' reference.
	 * @see #setRegion(Region)
	 * @see org.orka.orkametamodel.MetamodelPackage#getZone_Region()
	 * @see org.orka.orkametamodel.Region#getZone
	 * @model opposite="zone" required="true"
	 * @generated
	 */
	Region getRegion();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.Zone#getRegion <em>Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' reference.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(Region value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.orka.orkametamodel.MetamodelPackage#getZone_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.Zone#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Zone
