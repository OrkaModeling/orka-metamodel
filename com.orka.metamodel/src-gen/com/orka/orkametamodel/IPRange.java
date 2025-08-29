/**
 */
package com.orka.orkametamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IP Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.orka.orkametamodel.IPRange#getSubnetwork <em>Subnetwork</em>}</li>
 *   <li>{@link com.orka.orkametamodel.IPRange#getCidr_range <em>Cidr range</em>}</li>
 *   <li>{@link com.orka.orkametamodel.IPRange#getType <em>Type</em>}</li>
 *   <li>{@link com.orka.orkametamodel.IPRange#isPublic <em>Public</em>}</li>
 * </ul>
 *
 * @see com.orka.orkametamodel.MetamodelPackage#getIPRange()
 * @model
 * @generated
 */
public interface IPRange extends EObject {
	/**
	 * Returns the value of the '<em><b>Subnetwork</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.orka.orkametamodel.Subnetwork#getIprange <em>Iprange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnetwork</em>' reference.
	 * @see #setSubnetwork(Subnetwork)
	 * @see com.orka.orkametamodel.MetamodelPackage#getIPRange_Subnetwork()
	 * @see com.orka.orkametamodel.Subnetwork#getIprange
	 * @model opposite="iprange" required="true"
	 * @generated
	 */
	Subnetwork getSubnetwork();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.IPRange#getSubnetwork <em>Subnetwork</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnetwork</em>' reference.
	 * @see #getSubnetwork()
	 * @generated
	 */
	void setSubnetwork(Subnetwork value);

	/**
	 * Returns the value of the '<em><b>Cidr range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cidr range</em>' attribute.
	 * @see #setCidr_range(String)
	 * @see com.orka.orkametamodel.MetamodelPackage#getIPRange_Cidr_range()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getCidr_range();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.IPRange#getCidr_range <em>Cidr range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cidr range</em>' attribute.
	 * @see #getCidr_range()
	 * @generated
	 */
	void setCidr_range(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Service"</code>.
	 * The literals are from the enumeration {@link com.orka.orkametamodel.IPRangeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.orka.orkametamodel.IPRangeType
	 * @see #setType(IPRangeType)
	 * @see com.orka.orkametamodel.MetamodelPackage#getIPRange_Type()
	 * @model default="Service"
	 * @generated
	 */
	IPRangeType getType();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.IPRange#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.orka.orkametamodel.IPRangeType
	 * @see #getType()
	 * @generated
	 */
	void setType(IPRangeType value);

	/**
	 * Returns the value of the '<em><b>Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public</em>' attribute.
	 * @see #setPublic(boolean)
	 * @see com.orka.orkametamodel.MetamodelPackage#getIPRange_Public()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isPublic();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.IPRange#isPublic <em>Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public</em>' attribute.
	 * @see #isPublic()
	 * @generated
	 */
	void setPublic(boolean value);

} // IPRange
