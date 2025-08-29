/**
 */
package com.orka.orkametamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.orka.orkametamodel.SecurityGroup#getNetwork <em>Network</em>}</li>
 *   <li>{@link com.orka.orkametamodel.SecurityGroup#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see com.orka.orkametamodel.MetamodelPackage#getSecurityGroup()
 * @model
 * @generated
 */
public interface SecurityGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Network</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.orka.orkametamodel.Network#getSecuritygroups <em>Securitygroups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' reference.
	 * @see #setNetwork(Network)
	 * @see com.orka.orkametamodel.MetamodelPackage#getSecurityGroup_Network()
	 * @see com.orka.orkametamodel.Network#getSecuritygroups
	 * @model opposite="securitygroups" required="true"
	 * @generated
	 */
	Network getNetwork();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.SecurityGroup#getNetwork <em>Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(Network value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference list.
	 * The list contents are of type {@link com.orka.orkametamodel.Service}.
	 * It is bidirectional and its opposite is '{@link com.orka.orkametamodel.Service#getSecurityGroup <em>Security Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference list.
	 * @see com.orka.orkametamodel.MetamodelPackage#getSecurityGroup_Services()
	 * @see com.orka.orkametamodel.Service#getSecurityGroup
	 * @model opposite="securityGroup" required="true"
	 * @generated
	 */
	EList<Service> getServices();

} // SecurityGroup
