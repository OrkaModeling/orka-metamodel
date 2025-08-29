/**
 */
package org.orka.orkametamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subnetwork</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.orka.orkametamodel.Subnetwork#getCluster <em>Cluster</em>}</li>
 *   <li>{@link org.orka.orkametamodel.Subnetwork#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.orka.orkametamodel.Subnetwork#getIprange <em>Iprange</em>}</li>
 *   <li>{@link org.orka.orkametamodel.Subnetwork#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.orka.orkametamodel.MetamodelPackage#getSubnetwork()
 * @model
 * @generated
 */
public interface Subnetwork extends EObject {
	/**
	 * Returns the value of the '<em><b>Cluster</b></em>' reference list.
	 * The list contents are of type {@link org.orka.orkametamodel.Cluster}.
	 * It is bidirectional and its opposite is '{@link org.orka.orkametamodel.Cluster#getSubnetwork <em>Subnetwork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cluster</em>' reference list.
	 * @see org.orka.orkametamodel.MetamodelPackage#getSubnetwork_Cluster()
	 * @see org.orka.orkametamodel.Cluster#getSubnetwork
	 * @model opposite="subnetwork"
	 * @generated
	 */
	EList<Cluster> getCluster();

	/**
	 * Returns the value of the '<em><b>Network</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.orka.orkametamodel.Network#getSubnetwork <em>Subnetwork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' reference.
	 * @see #setNetwork(Network)
	 * @see org.orka.orkametamodel.MetamodelPackage#getSubnetwork_Network()
	 * @see org.orka.orkametamodel.Network#getSubnetwork
	 * @model opposite="subnetwork" required="true"
	 * @generated
	 */
	Network getNetwork();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.Subnetwork#getNetwork <em>Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(Network value);

	/**
	 * Returns the value of the '<em><b>Iprange</b></em>' reference list.
	 * The list contents are of type {@link org.orka.orkametamodel.IPRange}.
	 * It is bidirectional and its opposite is '{@link org.orka.orkametamodel.IPRange#getSubnetwork <em>Subnetwork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iprange</em>' reference list.
	 * @see org.orka.orkametamodel.MetamodelPackage#getSubnetwork_Iprange()
	 * @see org.orka.orkametamodel.IPRange#getSubnetwork
	 * @model opposite="subnetwork" required="true"
	 * @generated
	 */
	EList<IPRange> getIprange();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.orka.orkametamodel.MetamodelPackage#getSubnetwork_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.Subnetwork#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Subnetwork
