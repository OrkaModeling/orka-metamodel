/**
 */
package com.orka.orkametamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Balancer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.orka.orkametamodel.LoadBalancer#getName <em>Name</em>}</li>
 *   <li>{@link com.orka.orkametamodel.LoadBalancer#getType <em>Type</em>}</li>
 *   <li>{@link com.orka.orkametamodel.LoadBalancer#getCluster <em>Cluster</em>}</li>
 *   <li>{@link com.orka.orkametamodel.LoadBalancer#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see com.orka.orkametamodel.MetamodelPackage#getLoadBalancer()
 * @model
 * @generated
 */
public interface LoadBalancer extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.orka.orkametamodel.MetamodelPackage#getLoadBalancer_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.LoadBalancer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.orka.orkametamodel.LoadBalancerType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.orka.orkametamodel.LoadBalancerType
	 * @see #setType(LoadBalancerType)
	 * @see com.orka.orkametamodel.MetamodelPackage#getLoadBalancer_Type()
	 * @model
	 * @generated
	 */
	LoadBalancerType getType();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.LoadBalancer#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.orka.orkametamodel.LoadBalancerType
	 * @see #getType()
	 * @generated
	 */
	void setType(LoadBalancerType value);

	/**
	 * Returns the value of the '<em><b>Cluster</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.orka.orkametamodel.Cluster#getLoadbalancers <em>Loadbalancers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cluster</em>' reference.
	 * @see #setCluster(Cluster)
	 * @see com.orka.orkametamodel.MetamodelPackage#getLoadBalancer_Cluster()
	 * @see com.orka.orkametamodel.Cluster#getLoadbalancers
	 * @model opposite="loadbalancers" required="true"
	 * @generated
	 */
	Cluster getCluster();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.LoadBalancer#getCluster <em>Cluster</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cluster</em>' reference.
	 * @see #getCluster()
	 * @generated
	 */
	void setCluster(Cluster value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference list.
	 * The list contents are of type {@link com.orka.orkametamodel.Service}.
	 * It is bidirectional and its opposite is '{@link com.orka.orkametamodel.Service#getLoadbalancer <em>Loadbalancer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference list.
	 * @see com.orka.orkametamodel.MetamodelPackage#getLoadBalancer_Services()
	 * @see com.orka.orkametamodel.Service#getLoadbalancer
	 * @model opposite="loadbalancer"
	 * @generated
	 */
	EList<Service> getServices();

} // LoadBalancer
