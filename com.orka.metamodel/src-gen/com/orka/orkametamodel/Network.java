/**
 */
package com.orka.orkametamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.orka.orkametamodel.Network#getSubnetwork <em>Subnetwork</em>}</li>
 *   <li>{@link com.orka.orkametamodel.Network#getSecuritygroups <em>Securitygroups</em>}</li>
 *   <li>{@link com.orka.orkametamodel.Network#getCluster <em>Cluster</em>}</li>
 *   <li>{@link com.orka.orkametamodel.Network#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.orka.orkametamodel.MetamodelPackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends EObject {
	/**
	 * Returns the value of the '<em><b>Subnetwork</b></em>' reference list.
	 * The list contents are of type {@link com.orka.orkametamodel.Subnetwork}.
	 * It is bidirectional and its opposite is '{@link com.orka.orkametamodel.Subnetwork#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnetwork</em>' reference list.
	 * @see com.orka.orkametamodel.MetamodelPackage#getNetwork_Subnetwork()
	 * @see com.orka.orkametamodel.Subnetwork#getNetwork
	 * @model opposite="network"
	 * @generated
	 */
	EList<Subnetwork> getSubnetwork();

	/**
	 * Returns the value of the '<em><b>Securitygroups</b></em>' reference list.
	 * The list contents are of type {@link com.orka.orkametamodel.SecurityGroup}.
	 * It is bidirectional and its opposite is '{@link com.orka.orkametamodel.SecurityGroup#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securitygroups</em>' reference list.
	 * @see com.orka.orkametamodel.MetamodelPackage#getNetwork_Securitygroups()
	 * @see com.orka.orkametamodel.SecurityGroup#getNetwork
	 * @model opposite="network"
	 * @generated
	 */
	EList<SecurityGroup> getSecuritygroups();

	/**
	 * Returns the value of the '<em><b>Cluster</b></em>' reference list.
	 * The list contents are of type {@link com.orka.orkametamodel.Cluster}.
	 * It is bidirectional and its opposite is '{@link com.orka.orkametamodel.Cluster#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cluster</em>' reference list.
	 * @see com.orka.orkametamodel.MetamodelPackage#getNetwork_Cluster()
	 * @see com.orka.orkametamodel.Cluster#getNetwork
	 * @model opposite="network"
	 * @generated
	 */
	EList<Cluster> getCluster();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.orka.orkametamodel.MetamodelPackage#getNetwork_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.Network#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Network
