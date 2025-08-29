/**
 */
package com.orka.orkametamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.orka.orkametamodel.Cluster#getSubnetwork <em>Subnetwork</em>}</li>
 *   <li>{@link com.orka.orkametamodel.Cluster#getNetwork <em>Network</em>}</li>
 *   <li>{@link com.orka.orkametamodel.Cluster#getLoadbalancers <em>Loadbalancers</em>}</li>
 *   <li>{@link com.orka.orkametamodel.Cluster#getServices <em>Services</em>}</li>
 *   <li>{@link com.orka.orkametamodel.Cluster#getDeployments <em>Deployments</em>}</li>
 *   <li>{@link com.orka.orkametamodel.Cluster#getNodes <em>Nodes</em>}</li>
 *   <li>{@link com.orka.orkametamodel.Cluster#getRegion <em>Region</em>}</li>
 *   <li>{@link com.orka.orkametamodel.Cluster#isNet_conf <em>Net conf</em>}</li>
 *   <li>{@link com.orka.orkametamodel.Cluster#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.orka.orkametamodel.MetamodelPackage#getCluster()
 * @model
 * @generated
 */
public interface Cluster extends EObject {
	/**
	 * Returns the value of the '<em><b>Subnetwork</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.orka.orkametamodel.Subnetwork#getCluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnetwork</em>' reference.
	 * @see #setSubnetwork(Subnetwork)
	 * @see com.orka.orkametamodel.MetamodelPackage#getCluster_Subnetwork()
	 * @see com.orka.orkametamodel.Subnetwork#getCluster
	 * @model opposite="cluster"
	 * @generated
	 */
	Subnetwork getSubnetwork();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.Cluster#getSubnetwork <em>Subnetwork</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnetwork</em>' reference.
	 * @see #getSubnetwork()
	 * @generated
	 */
	void setSubnetwork(Subnetwork value);

	/**
	 * Returns the value of the '<em><b>Network</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.orka.orkametamodel.Network#getCluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' reference.
	 * @see #setNetwork(Network)
	 * @see com.orka.orkametamodel.MetamodelPackage#getCluster_Network()
	 * @see com.orka.orkametamodel.Network#getCluster
	 * @model opposite="cluster"
	 * @generated
	 */
	Network getNetwork();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.Cluster#getNetwork <em>Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(Network value);

	/**
	 * Returns the value of the '<em><b>Loadbalancers</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.orka.orkametamodel.LoadBalancer#getCluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loadbalancers</em>' reference.
	 * @see #setLoadbalancers(LoadBalancer)
	 * @see com.orka.orkametamodel.MetamodelPackage#getCluster_Loadbalancers()
	 * @see com.orka.orkametamodel.LoadBalancer#getCluster
	 * @model opposite="cluster"
	 * @generated
	 */
	LoadBalancer getLoadbalancers();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.Cluster#getLoadbalancers <em>Loadbalancers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loadbalancers</em>' reference.
	 * @see #getLoadbalancers()
	 * @generated
	 */
	void setLoadbalancers(LoadBalancer value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.orka.orkametamodel.Service#getCluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference.
	 * @see #setServices(Service)
	 * @see com.orka.orkametamodel.MetamodelPackage#getCluster_Services()
	 * @see com.orka.orkametamodel.Service#getCluster
	 * @model opposite="cluster"
	 * @generated
	 */
	Service getServices();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.Cluster#getServices <em>Services</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Services</em>' reference.
	 * @see #getServices()
	 * @generated
	 */
	void setServices(Service value);

	/**
	 * Returns the value of the '<em><b>Deployments</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.orka.orkametamodel.Deployment#getCluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployments</em>' reference.
	 * @see #setDeployments(Deployment)
	 * @see com.orka.orkametamodel.MetamodelPackage#getCluster_Deployments()
	 * @see com.orka.orkametamodel.Deployment#getCluster
	 * @model opposite="cluster"
	 * @generated
	 */
	Deployment getDeployments();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.Cluster#getDeployments <em>Deployments</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployments</em>' reference.
	 * @see #getDeployments()
	 * @generated
	 */
	void setDeployments(Deployment value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.orka.orkametamodel.Node#getCluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' reference.
	 * @see #setNodes(Node)
	 * @see com.orka.orkametamodel.MetamodelPackage#getCluster_Nodes()
	 * @see com.orka.orkametamodel.Node#getCluster
	 * @model opposite="cluster"
	 * @generated
	 */
	Node getNodes();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.Cluster#getNodes <em>Nodes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodes</em>' reference.
	 * @see #getNodes()
	 * @generated
	 */
	void setNodes(Node value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.orka.orkametamodel.Region#getCluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' reference.
	 * @see #setRegion(Region)
	 * @see com.orka.orkametamodel.MetamodelPackage#getCluster_Region()
	 * @see com.orka.orkametamodel.Region#getCluster
	 * @model opposite="cluster"
	 * @generated
	 */
	Region getRegion();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.Cluster#getRegion <em>Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' reference.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(Region value);

	/**
	 * Returns the value of the '<em><b>Net conf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net conf</em>' attribute.
	 * @see #setNet_conf(boolean)
	 * @see com.orka.orkametamodel.MetamodelPackage#getCluster_Net_conf()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isNet_conf();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.Cluster#isNet_conf <em>Net conf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net conf</em>' attribute.
	 * @see #isNet_conf()
	 * @generated
	 */
	void setNet_conf(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.orka.orkametamodel.MetamodelPackage#getCluster_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.Cluster#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Cluster
