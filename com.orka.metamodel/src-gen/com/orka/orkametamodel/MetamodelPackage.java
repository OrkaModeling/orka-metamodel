/**
 */
package com.orka.orkametamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.orka.orkametamodel.MetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface MetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "orkametamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://github.com/OrkaModeling/orka-metamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "orkametamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetamodelPackage eINSTANCE = com.orka.orkametamodel.impl.MetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.impl.ClusterImpl <em>Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.impl.ClusterImpl
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getCluster()
	 * @generated
	 */
	int CLUSTER = 25;

	/**
	 * The feature id for the '<em><b>Subnetwork</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__SUBNETWORK = 0;

	/**
	 * The feature id for the '<em><b>Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__NETWORK = 1;

	/**
	 * The feature id for the '<em><b>Loadbalancers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__LOADBALANCERS = 2;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__SERVICES = 3;

	/**
	 * The feature id for the '<em><b>Deployments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__DEPLOYMENTS = 4;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__NODES = 5;

	/**
	 * The feature id for the '<em><b>Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__REGION = 6;

	/**
	 * The feature id for the '<em><b>Net conf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__NET_CONF = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__NAME = 8;

	/**
	 * The feature id for the '<em><b>Orkamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER__ORKAMODEL = 9;

	/**
	 * The number of structural features of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLUSTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.impl.PublicClusterImpl <em>Public Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.impl.PublicClusterImpl
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getPublicCluster()
	 * @generated
	 */
	int PUBLIC_CLUSTER = 0;

	/**
	 * The feature id for the '<em><b>Subnetwork</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_CLUSTER__SUBNETWORK = CLUSTER__SUBNETWORK;

	/**
	 * The feature id for the '<em><b>Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_CLUSTER__NETWORK = CLUSTER__NETWORK;

	/**
	 * The feature id for the '<em><b>Loadbalancers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_CLUSTER__LOADBALANCERS = CLUSTER__LOADBALANCERS;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_CLUSTER__SERVICES = CLUSTER__SERVICES;

	/**
	 * The feature id for the '<em><b>Deployments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_CLUSTER__DEPLOYMENTS = CLUSTER__DEPLOYMENTS;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_CLUSTER__NODES = CLUSTER__NODES;

	/**
	 * The feature id for the '<em><b>Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_CLUSTER__REGION = CLUSTER__REGION;

	/**
	 * The feature id for the '<em><b>Net conf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_CLUSTER__NET_CONF = CLUSTER__NET_CONF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_CLUSTER__NAME = CLUSTER__NAME;

	/**
	 * The feature id for the '<em><b>Orkamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_CLUSTER__ORKAMODEL = CLUSTER__ORKAMODEL;

	/**
	 * The feature id for the '<em><b>Num nodes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_CLUSTER__NUM_NODES = CLUSTER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Config file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_CLUSTER__CONFIG_FILE = CLUSTER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_CLUSTER__PROVIDER = CLUSTER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Public Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_CLUSTER_FEATURE_COUNT = CLUSTER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Public Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_CLUSTER_OPERATION_COUNT = CLUSTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.impl.OnPremisesImpl <em>On Premises</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.impl.OnPremisesImpl
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getOnPremises()
	 * @generated
	 */
	int ON_PREMISES = 1;

	/**
	 * The feature id for the '<em><b>Subnetwork</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_PREMISES__SUBNETWORK = CLUSTER__SUBNETWORK;

	/**
	 * The feature id for the '<em><b>Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_PREMISES__NETWORK = CLUSTER__NETWORK;

	/**
	 * The feature id for the '<em><b>Loadbalancers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_PREMISES__LOADBALANCERS = CLUSTER__LOADBALANCERS;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_PREMISES__SERVICES = CLUSTER__SERVICES;

	/**
	 * The feature id for the '<em><b>Deployments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_PREMISES__DEPLOYMENTS = CLUSTER__DEPLOYMENTS;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_PREMISES__NODES = CLUSTER__NODES;

	/**
	 * The feature id for the '<em><b>Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_PREMISES__REGION = CLUSTER__REGION;

	/**
	 * The feature id for the '<em><b>Net conf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_PREMISES__NET_CONF = CLUSTER__NET_CONF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_PREMISES__NAME = CLUSTER__NAME;

	/**
	 * The feature id for the '<em><b>Orkamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_PREMISES__ORKAMODEL = CLUSTER__ORKAMODEL;

	/**
	 * The feature id for the '<em><b>Hypervisor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_PREMISES__HYPERVISOR = CLUSTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>On Premises</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_PREMISES_FEATURE_COUNT = CLUSTER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>On Premises</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_PREMISES_OPERATION_COUNT = CLUSTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.impl.NodeImpl
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 2;

	/**
	 * The feature id for the '<em><b>Cluster</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CLUSTER = 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__RESOURCES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__HOSTNAME = 3;

	/**
	 * The feature id for the '<em><b>Public ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PUBLIC_IP = 4;

	/**
	 * The feature id for the '<em><b>Private ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PRIVATE_IP = 5;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OS = 6;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__STORAGE = 7;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PROCESSOR = 8;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.impl.EdgeNodeImpl <em>Edge Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.impl.EdgeNodeImpl
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getEdgeNode()
	 * @generated
	 */
	int EDGE_NODE = 3;

	/**
	 * The feature id for the '<em><b>Cluster</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_NODE__CLUSTER = NODE__CLUSTER;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_NODE__RESOURCES = NODE__RESOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_NODE__HOSTNAME = NODE__HOSTNAME;

	/**
	 * The feature id for the '<em><b>Public ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_NODE__PUBLIC_IP = NODE__PUBLIC_IP;

	/**
	 * The feature id for the '<em><b>Private ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_NODE__PRIVATE_IP = NODE__PRIVATE_IP;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_NODE__OS = NODE__OS;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_NODE__STORAGE = NODE__STORAGE;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_NODE__PROCESSOR = NODE__PROCESSOR;

	/**
	 * The number of structural features of the '<em>Edge Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Edge Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.impl.CloudNodeImpl <em>Cloud Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.impl.CloudNodeImpl
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getCloudNode()
	 * @generated
	 */
	int CLOUD_NODE = 4;

	/**
	 * The feature id for the '<em><b>Cluster</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE__CLUSTER = NODE__CLUSTER;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE__RESOURCES = NODE__RESOURCES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE__HOSTNAME = NODE__HOSTNAME;

	/**
	 * The feature id for the '<em><b>Public ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE__PUBLIC_IP = NODE__PUBLIC_IP;

	/**
	 * The feature id for the '<em><b>Private ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE__PRIVATE_IP = NODE__PRIVATE_IP;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE__OS = NODE__OS;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE__STORAGE = NODE__STORAGE;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE__PROCESSOR = NODE__PROCESSOR;

	/**
	 * The number of structural features of the '<em>Cloud Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cloud Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_NODE_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.impl.ZoneImpl <em>Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.impl.ZoneImpl
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getZone()
	 * @generated
	 */
	int ZONE = 5;

	/**
	 * The feature id for the '<em><b>Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__REGION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.impl.RegionImpl <em>Region</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.impl.RegionImpl
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getRegion()
	 * @generated
	 */
	int REGION = 6;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__ZONE = 0;

	/**
	 * The feature id for the '<em><b>Cluster</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__CLUSTER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Region</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.impl.IPRangeImpl <em>IP Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.impl.IPRangeImpl
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getIPRange()
	 * @generated
	 */
	int IP_RANGE = 7;

	/**
	 * The feature id for the '<em><b>Subnetwork</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_RANGE__SUBNETWORK = 0;

	/**
	 * The feature id for the '<em><b>Cidr range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_RANGE__CIDR_RANGE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_RANGE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_RANGE__PUBLIC = 3;

	/**
	 * The number of structural features of the '<em>IP Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_RANGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>IP Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IP_RANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.impl.SubnetworkImpl <em>Subnetwork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.impl.SubnetworkImpl
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getSubnetwork()
	 * @generated
	 */
	int SUBNETWORK = 8;

	/**
	 * The feature id for the '<em><b>Cluster</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNETWORK__CLUSTER = 0;

	/**
	 * The feature id for the '<em><b>Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNETWORK__NETWORK = 1;

	/**
	 * The feature id for the '<em><b>Iprange</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNETWORK__IPRANGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNETWORK__NAME = 3;

	/**
	 * The number of structural features of the '<em>Subnetwork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNETWORK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Subnetwork</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.impl.NetworkImpl
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 9;

	/**
	 * The feature id for the '<em><b>Subnetwork</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__SUBNETWORK = 0;

	/**
	 * The feature id for the '<em><b>Securitygroups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__SECURITYGROUPS = 1;

	/**
	 * The feature id for the '<em><b>Cluster</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__CLUSTER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__NAME = 3;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.impl.ServiceImpl
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 10;

	/**
	 * The feature id for the '<em><b>Cluster</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__CLUSTER = 0;

	/**
	 * The feature id for the '<em><b>Security Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SECURITY_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__APPLICATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PORT = 5;

	/**
	 * The feature id for the '<em><b>Target port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__TARGET_PORT = 6;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PROTOCOL = 7;

	/**
	 * The feature id for the '<em><b>Loadbalancer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__LOADBALANCER = 8;

	/**
	 * The feature id for the '<em><b>Ingress</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__INGRESS = 9;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.impl.SecurityGroupImpl <em>Security Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.impl.SecurityGroupImpl
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getSecurityGroup()
	 * @generated
	 */
	int SECURITY_GROUP = 11;

	/**
	 * The feature id for the '<em><b>Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__NETWORK = 0;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP__SERVICES = 1;

	/**
	 * The number of structural features of the '<em>Security Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Security Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.impl.ApplicationImpl
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 12;

	/**
	 * The feature id for the '<em><b>Required Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__REQUIRED_RESOURCES = 0;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__SERVICES = 1;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Image Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__IMAGE_REPOSITORY = 3;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__PORT = 4;

	/**
	 * The feature id for the '<em><b>Secret</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__SECRET = 5;

	/**
	 * The feature id for the '<em><b>Configmap</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__CONFIGMAP = 6;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.impl.ResourcesImpl <em>Resources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.impl.ResourcesImpl
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getResources()
	 * @generated
	 */
	int RESOURCES = 13;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES__NODE = 0;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES__CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES__APPLICATION = 2;

	/**
	 * The feature id for the '<em><b>Cpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES__CPU = 3;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES__MEMORY = 4;

	/**
	 * The number of structural features of the '<em>Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.impl.DeploymentImpl <em>Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.impl.DeploymentImpl
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getDeployment()
	 * @generated
	 */
	int DEPLOYMENT = 14;

	/**
	 * The feature id for the '<em><b>Cluster</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__CLUSTER = 0;

	/**
	 * The feature id for the '<em><b>Replicas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__REPLICAS = 1;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__CONTAINERS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__NAME = 3;

	/**
	 * The feature id for the '<em><b>Scalingpolicy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__SCALINGPOLICY = 4;

	/**
	 * The number of structural features of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.impl.ContainerImpl
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 15;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__RESOURCES = 0;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__VOLUMES = 1;

	/**
	 * The feature id for the '<em><b>Deployment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DEPLOYMENT = 2;

	/**
	 * The feature id for the '<em><b>Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__APPLICATION = 3;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.impl.VolumeImpl <em>Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.impl.VolumeImpl
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getVolume()
	 * @generated
	 */
	int VOLUME = 16;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__NAME = 1;

	/**
	 * The feature id for the '<em><b>Mount Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__MOUNT_PATH = 2;

	/**
	 * The feature id for the '<em><b>Sub Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__SUB_PATH = 3;

	/**
	 * The feature id for the '<em><b>Persistentvolume</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__PERSISTENTVOLUME = 4;

	/**
	 * The number of structural features of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.impl.ScalingPolicyImpl <em>Scaling Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.impl.ScalingPolicyImpl
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getScalingPolicy()
	 * @generated
	 */
	int SCALING_POLICY = 17;

	/**
	 * The feature id for the '<em><b>Min Replicas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_POLICY__MIN_REPLICAS = 0;

	/**
	 * The feature id for the '<em><b>Max Replicas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_POLICY__MAX_REPLICAS = 1;

	/**
	 * The feature id for the '<em><b>Cpu Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_POLICY__CPU_THRESHOLD = 2;

	/**
	 * The feature id for the '<em><b>Memory Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_POLICY__MEMORY_THRESHOLD = 3;

	/**
	 * The feature id for the '<em><b>Deployment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_POLICY__DEPLOYMENT = 4;

	/**
	 * The number of structural features of the '<em>Scaling Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_POLICY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Scaling Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALING_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.impl.ConfigMapImpl <em>Config Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.impl.ConfigMapImpl
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getConfigMap()
	 * @generated
	 */
	int CONFIG_MAP = 18;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_MAP__DATA = 0;

	/**
	 * The number of structural features of the '<em>Config Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_MAP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Config Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.impl.SecretImpl <em>Secret</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.impl.SecretImpl
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getSecret()
	 * @generated
	 */
	int SECRET = 19;

	/**
	 * The feature id for the '<em><b>Encrypted Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET__ENCRYPTED_DATA = 0;

	/**
	 * The number of structural features of the '<em>Secret</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Secret</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.impl.PersistentVolumeImpl <em>Persistent Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.impl.PersistentVolumeImpl
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getPersistentVolume()
	 * @generated
	 */
	int PERSISTENT_VOLUME = 20;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_VOLUME__CAPACITY = 0;

	/**
	 * The feature id for the '<em><b>Storage Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_VOLUME__STORAGE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Access Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_VOLUME__ACCESS_MODE = 2;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_VOLUME__VOLUME = 3;

	/**
	 * The number of structural features of the '<em>Persistent Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_VOLUME_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Persistent Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENT_VOLUME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.impl.LoadBalancerImpl <em>Load Balancer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.impl.LoadBalancerImpl
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getLoadBalancer()
	 * @generated
	 */
	int LOAD_BALANCER = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Cluster</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER__CLUSTER = 2;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER__SERVICES = 3;

	/**
	 * The number of structural features of the '<em>Load Balancer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Load Balancer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BALANCER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.impl.CloudPropertiesImpl <em>Cloud Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.impl.CloudPropertiesImpl
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getCloudProperties()
	 * @generated
	 */
	int CLOUD_PROPERTIES = 22;

	/**
	 * The feature id for the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROPERTIES__INSTANCE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Image Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROPERTIES__IMAGE_ID = 1;

	/**
	 * The feature id for the '<em><b>Iam Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROPERTIES__IAM_ROLE = 2;

	/**
	 * The feature id for the '<em><b>Tenant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROPERTIES__TENANT_ID = 3;

	/**
	 * The feature id for the '<em><b>Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROPERTIES__PROJECT_ID = 4;

	/**
	 * The feature id for the '<em><b>Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROPERTIES__PROVIDER = 5;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROPERTIES__REGION = 6;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROPERTIES__ZONE = 7;

	/**
	 * The number of structural features of the '<em>Cloud Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROPERTIES_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Cloud Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.impl.IngressImpl <em>Ingress</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.impl.IngressImpl
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getIngress()
	 * @generated
	 */
	int INGRESS = 23;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGRESS__HOST = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGRESS__PATH = 1;

	/**
	 * The feature id for the '<em><b>Tls Secret</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGRESS__TLS_SECRET = 2;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGRESS__SERVICE = 3;

	/**
	 * The number of structural features of the '<em>Ingress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGRESS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Ingress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INGRESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.impl.MonitoringImpl <em>Monitoring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.impl.MonitoringImpl
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getMonitoring()
	 * @generated
	 */
	int MONITORING = 24;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING__ENABLED = 0;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING__TOOL = 1;

	/**
	 * The feature id for the '<em><b>Cluster</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING__CLUSTER = 2;

	/**
	 * The feature id for the '<em><b>Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING__APPLICATION = 3;

	/**
	 * The number of structural features of the '<em>Monitoring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Monitoring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.impl.OrkaModelImpl <em>Orka Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.impl.OrkaModelImpl
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getOrkaModel()
	 * @generated
	 */
	int ORKA_MODEL = 26;

	/**
	 * The feature id for the '<em><b>Clusters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORKA_MODEL__CLUSTERS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORKA_MODEL__NAME = 1;

	/**
	 * The number of structural features of the '<em>Orka Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORKA_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Orka Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORKA_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.Provider <em>Provider</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.Provider
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getProvider()
	 * @generated
	 */
	int PROVIDER = 27;

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.Protocol <em>Protocol</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.Protocol
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 28;

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.Hypervisor <em>Hypervisor</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.Hypervisor
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getHypervisor()
	 * @generated
	 */
	int HYPERVISOR = 29;

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.ServiceType <em>Service Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.ServiceType
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getServiceType()
	 * @generated
	 */
	int SERVICE_TYPE = 30;

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.Processor <em>Processor</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.Processor
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getProcessor()
	 * @generated
	 */
	int PROCESSOR = 31;

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.IPRangeType <em>IP Range Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.IPRangeType
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getIPRangeType()
	 * @generated
	 */
	int IP_RANGE_TYPE = 32;

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.LoadBalancerType <em>Load Balancer Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.LoadBalancerType
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getLoadBalancerType()
	 * @generated
	 */
	int LOAD_BALANCER_TYPE = 33;

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.AccessMode <em>Access Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.AccessMode
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getAccessMode()
	 * @generated
	 */
	int ACCESS_MODE = 34;

	/**
	 * The meta object id for the '{@link com.orka.orkametamodel.MonitoringTool <em>Monitoring Tool</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.orka.orkametamodel.MonitoringTool
	 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getMonitoringTool()
	 * @generated
	 */
	int MONITORING_TOOL = 35;

	/**
	 * Returns the meta object for class '{@link com.orka.orkametamodel.PublicCluster <em>Public Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Cluster</em>'.
	 * @see com.orka.orkametamodel.PublicCluster
	 * @generated
	 */
	EClass getPublicCluster();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.PublicCluster#getNum_nodes <em>Num nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num nodes</em>'.
	 * @see com.orka.orkametamodel.PublicCluster#getNum_nodes()
	 * @see #getPublicCluster()
	 * @generated
	 */
	EAttribute getPublicCluster_Num_nodes();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.PublicCluster#getConfig_file <em>Config file</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config file</em>'.
	 * @see com.orka.orkametamodel.PublicCluster#getConfig_file()
	 * @see #getPublicCluster()
	 * @generated
	 */
	EAttribute getPublicCluster_Config_file();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.PublicCluster#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see com.orka.orkametamodel.PublicCluster#getProvider()
	 * @see #getPublicCluster()
	 * @generated
	 */
	EAttribute getPublicCluster_Provider();

	/**
	 * Returns the meta object for class '{@link com.orka.orkametamodel.OnPremises <em>On Premises</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Premises</em>'.
	 * @see com.orka.orkametamodel.OnPremises
	 * @generated
	 */
	EClass getOnPremises();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.OnPremises#getHypervisor <em>Hypervisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hypervisor</em>'.
	 * @see com.orka.orkametamodel.OnPremises#getHypervisor()
	 * @see #getOnPremises()
	 * @generated
	 */
	EAttribute getOnPremises_Hypervisor();

	/**
	 * Returns the meta object for class '{@link com.orka.orkametamodel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see com.orka.orkametamodel.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference '{@link com.orka.orkametamodel.Node#getCluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cluster</em>'.
	 * @see com.orka.orkametamodel.Node#getCluster()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Cluster();

	/**
	 * Returns the meta object for the reference list '{@link com.orka.orkametamodel.Node#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resources</em>'.
	 * @see com.orka.orkametamodel.Node#getResources()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Resources();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.orka.orkametamodel.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.Node#getHostname <em>Hostname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hostname</em>'.
	 * @see com.orka.orkametamodel.Node#getHostname()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Hostname();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.Node#getPublic_ip <em>Public ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public ip</em>'.
	 * @see com.orka.orkametamodel.Node#getPublic_ip()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Public_ip();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.Node#getPrivate_ip <em>Private ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private ip</em>'.
	 * @see com.orka.orkametamodel.Node#getPrivate_ip()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Private_ip();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.Node#getOs <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os</em>'.
	 * @see com.orka.orkametamodel.Node#getOs()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Os();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.Node#getStorage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage</em>'.
	 * @see com.orka.orkametamodel.Node#getStorage()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Storage();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.Node#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processor</em>'.
	 * @see com.orka.orkametamodel.Node#getProcessor()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Processor();

	/**
	 * Returns the meta object for class '{@link com.orka.orkametamodel.EdgeNode <em>Edge Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Node</em>'.
	 * @see com.orka.orkametamodel.EdgeNode
	 * @generated
	 */
	EClass getEdgeNode();

	/**
	 * Returns the meta object for class '{@link com.orka.orkametamodel.CloudNode <em>Cloud Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Node</em>'.
	 * @see com.orka.orkametamodel.CloudNode
	 * @generated
	 */
	EClass getCloudNode();

	/**
	 * Returns the meta object for class '{@link com.orka.orkametamodel.Zone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zone</em>'.
	 * @see com.orka.orkametamodel.Zone
	 * @generated
	 */
	EClass getZone();

	/**
	 * Returns the meta object for the reference '{@link com.orka.orkametamodel.Zone#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Region</em>'.
	 * @see com.orka.orkametamodel.Zone#getRegion()
	 * @see #getZone()
	 * @generated
	 */
	EReference getZone_Region();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.Zone#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.orka.orkametamodel.Zone#getName()
	 * @see #getZone()
	 * @generated
	 */
	EAttribute getZone_Name();

	/**
	 * Returns the meta object for class '{@link com.orka.orkametamodel.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region</em>'.
	 * @see com.orka.orkametamodel.Region
	 * @generated
	 */
	EClass getRegion();

	/**
	 * Returns the meta object for the reference list '{@link com.orka.orkametamodel.Region#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Zone</em>'.
	 * @see com.orka.orkametamodel.Region#getZone()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Zone();

	/**
	 * Returns the meta object for the reference list '{@link com.orka.orkametamodel.Region#getCluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cluster</em>'.
	 * @see com.orka.orkametamodel.Region#getCluster()
	 * @see #getRegion()
	 * @generated
	 */
	EReference getRegion_Cluster();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.Region#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.orka.orkametamodel.Region#getName()
	 * @see #getRegion()
	 * @generated
	 */
	EAttribute getRegion_Name();

	/**
	 * Returns the meta object for class '{@link com.orka.orkametamodel.IPRange <em>IP Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IP Range</em>'.
	 * @see com.orka.orkametamodel.IPRange
	 * @generated
	 */
	EClass getIPRange();

	/**
	 * Returns the meta object for the reference '{@link com.orka.orkametamodel.IPRange#getSubnetwork <em>Subnetwork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subnetwork</em>'.
	 * @see com.orka.orkametamodel.IPRange#getSubnetwork()
	 * @see #getIPRange()
	 * @generated
	 */
	EReference getIPRange_Subnetwork();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.IPRange#getCidr_range <em>Cidr range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cidr range</em>'.
	 * @see com.orka.orkametamodel.IPRange#getCidr_range()
	 * @see #getIPRange()
	 * @generated
	 */
	EAttribute getIPRange_Cidr_range();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.IPRange#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.orka.orkametamodel.IPRange#getType()
	 * @see #getIPRange()
	 * @generated
	 */
	EAttribute getIPRange_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.IPRange#isPublic <em>Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public</em>'.
	 * @see com.orka.orkametamodel.IPRange#isPublic()
	 * @see #getIPRange()
	 * @generated
	 */
	EAttribute getIPRange_Public();

	/**
	 * Returns the meta object for class '{@link com.orka.orkametamodel.Subnetwork <em>Subnetwork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subnetwork</em>'.
	 * @see com.orka.orkametamodel.Subnetwork
	 * @generated
	 */
	EClass getSubnetwork();

	/**
	 * Returns the meta object for the reference list '{@link com.orka.orkametamodel.Subnetwork#getCluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cluster</em>'.
	 * @see com.orka.orkametamodel.Subnetwork#getCluster()
	 * @see #getSubnetwork()
	 * @generated
	 */
	EReference getSubnetwork_Cluster();

	/**
	 * Returns the meta object for the reference '{@link com.orka.orkametamodel.Subnetwork#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Network</em>'.
	 * @see com.orka.orkametamodel.Subnetwork#getNetwork()
	 * @see #getSubnetwork()
	 * @generated
	 */
	EReference getSubnetwork_Network();

	/**
	 * Returns the meta object for the reference list '{@link com.orka.orkametamodel.Subnetwork#getIprange <em>Iprange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Iprange</em>'.
	 * @see com.orka.orkametamodel.Subnetwork#getIprange()
	 * @see #getSubnetwork()
	 * @generated
	 */
	EReference getSubnetwork_Iprange();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.Subnetwork#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.orka.orkametamodel.Subnetwork#getName()
	 * @see #getSubnetwork()
	 * @generated
	 */
	EAttribute getSubnetwork_Name();

	/**
	 * Returns the meta object for class '{@link com.orka.orkametamodel.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see com.orka.orkametamodel.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the reference list '{@link com.orka.orkametamodel.Network#getSubnetwork <em>Subnetwork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subnetwork</em>'.
	 * @see com.orka.orkametamodel.Network#getSubnetwork()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Subnetwork();

	/**
	 * Returns the meta object for the reference list '{@link com.orka.orkametamodel.Network#getSecuritygroups <em>Securitygroups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Securitygroups</em>'.
	 * @see com.orka.orkametamodel.Network#getSecuritygroups()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Securitygroups();

	/**
	 * Returns the meta object for the reference list '{@link com.orka.orkametamodel.Network#getCluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cluster</em>'.
	 * @see com.orka.orkametamodel.Network#getCluster()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Cluster();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.Network#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.orka.orkametamodel.Network#getName()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Name();

	/**
	 * Returns the meta object for class '{@link com.orka.orkametamodel.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see com.orka.orkametamodel.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the reference '{@link com.orka.orkametamodel.Service#getCluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cluster</em>'.
	 * @see com.orka.orkametamodel.Service#getCluster()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Cluster();

	/**
	 * Returns the meta object for the reference '{@link com.orka.orkametamodel.Service#getSecurityGroup <em>Security Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Security Group</em>'.
	 * @see com.orka.orkametamodel.Service#getSecurityGroup()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_SecurityGroup();

	/**
	 * Returns the meta object for the reference '{@link com.orka.orkametamodel.Service#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Application</em>'.
	 * @see com.orka.orkametamodel.Service#getApplication()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Application();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.orka.orkametamodel.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.Service#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.orka.orkametamodel.Service#getType()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.Service#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see com.orka.orkametamodel.Service#getPort()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Port();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.Service#getTarget_port <em>Target port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target port</em>'.
	 * @see com.orka.orkametamodel.Service#getTarget_port()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Target_port();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.Service#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see com.orka.orkametamodel.Service#getProtocol()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Protocol();

	/**
	 * Returns the meta object for the reference '{@link com.orka.orkametamodel.Service#getLoadbalancer <em>Loadbalancer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Loadbalancer</em>'.
	 * @see com.orka.orkametamodel.Service#getLoadbalancer()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Loadbalancer();

	/**
	 * Returns the meta object for the reference '{@link com.orka.orkametamodel.Service#getIngress <em>Ingress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ingress</em>'.
	 * @see com.orka.orkametamodel.Service#getIngress()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Ingress();

	/**
	 * Returns the meta object for class '{@link com.orka.orkametamodel.SecurityGroup <em>Security Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Group</em>'.
	 * @see com.orka.orkametamodel.SecurityGroup
	 * @generated
	 */
	EClass getSecurityGroup();

	/**
	 * Returns the meta object for the reference '{@link com.orka.orkametamodel.SecurityGroup#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Network</em>'.
	 * @see com.orka.orkametamodel.SecurityGroup#getNetwork()
	 * @see #getSecurityGroup()
	 * @generated
	 */
	EReference getSecurityGroup_Network();

	/**
	 * Returns the meta object for the reference list '{@link com.orka.orkametamodel.SecurityGroup#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see com.orka.orkametamodel.SecurityGroup#getServices()
	 * @see #getSecurityGroup()
	 * @generated
	 */
	EReference getSecurityGroup_Services();

	/**
	 * Returns the meta object for class '{@link com.orka.orkametamodel.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see com.orka.orkametamodel.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the reference list '{@link com.orka.orkametamodel.Application#getRequiredResources <em>Required Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Resources</em>'.
	 * @see com.orka.orkametamodel.Application#getRequiredResources()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_RequiredResources();

	/**
	 * Returns the meta object for the reference list '{@link com.orka.orkametamodel.Application#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see com.orka.orkametamodel.Application#getServices()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Services();

	/**
	 * Returns the meta object for the reference list '{@link com.orka.orkametamodel.Application#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Container</em>'.
	 * @see com.orka.orkametamodel.Application#getContainer()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Container();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.Application#getImageRepository <em>Image Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Repository</em>'.
	 * @see com.orka.orkametamodel.Application#getImageRepository()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_ImageRepository();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.Application#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see com.orka.orkametamodel.Application#getPort()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Port();

	/**
	 * Returns the meta object for the reference '{@link com.orka.orkametamodel.Application#getSecret <em>Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Secret</em>'.
	 * @see com.orka.orkametamodel.Application#getSecret()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Secret();

	/**
	 * Returns the meta object for the reference '{@link com.orka.orkametamodel.Application#getConfigmap <em>Configmap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configmap</em>'.
	 * @see com.orka.orkametamodel.Application#getConfigmap()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Configmap();

	/**
	 * Returns the meta object for class '{@link com.orka.orkametamodel.Resources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resources</em>'.
	 * @see com.orka.orkametamodel.Resources
	 * @generated
	 */
	EClass getResources();

	/**
	 * Returns the meta object for the reference '{@link com.orka.orkametamodel.Resources#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see com.orka.orkametamodel.Resources#getNode()
	 * @see #getResources()
	 * @generated
	 */
	EReference getResources_Node();

	/**
	 * Returns the meta object for the reference '{@link com.orka.orkametamodel.Resources#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container</em>'.
	 * @see com.orka.orkametamodel.Resources#getContainer()
	 * @see #getResources()
	 * @generated
	 */
	EReference getResources_Container();

	/**
	 * Returns the meta object for the reference '{@link com.orka.orkametamodel.Resources#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Application</em>'.
	 * @see com.orka.orkametamodel.Resources#getApplication()
	 * @see #getResources()
	 * @generated
	 */
	EReference getResources_Application();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.Resources#getCpu <em>Cpu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu</em>'.
	 * @see com.orka.orkametamodel.Resources#getCpu()
	 * @see #getResources()
	 * @generated
	 */
	EAttribute getResources_Cpu();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.Resources#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory</em>'.
	 * @see com.orka.orkametamodel.Resources#getMemory()
	 * @see #getResources()
	 * @generated
	 */
	EAttribute getResources_Memory();

	/**
	 * Returns the meta object for class '{@link com.orka.orkametamodel.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment</em>'.
	 * @see com.orka.orkametamodel.Deployment
	 * @generated
	 */
	EClass getDeployment();

	/**
	 * Returns the meta object for the reference '{@link com.orka.orkametamodel.Deployment#getCluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cluster</em>'.
	 * @see com.orka.orkametamodel.Deployment#getCluster()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_Cluster();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.Deployment#getReplicas <em>Replicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replicas</em>'.
	 * @see com.orka.orkametamodel.Deployment#getReplicas()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_Replicas();

	/**
	 * Returns the meta object for the reference list '{@link com.orka.orkametamodel.Deployment#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Containers</em>'.
	 * @see com.orka.orkametamodel.Deployment#getContainers()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_Containers();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.Deployment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.orka.orkametamodel.Deployment#getName()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_Name();

	/**
	 * Returns the meta object for the reference '{@link com.orka.orkametamodel.Deployment#getScalingpolicy <em>Scalingpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scalingpolicy</em>'.
	 * @see com.orka.orkametamodel.Deployment#getScalingpolicy()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_Scalingpolicy();

	/**
	 * Returns the meta object for class '{@link com.orka.orkametamodel.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see com.orka.orkametamodel.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the reference list '{@link com.orka.orkametamodel.Container#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resources</em>'.
	 * @see com.orka.orkametamodel.Container#getResources()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Resources();

	/**
	 * Returns the meta object for the reference list '{@link com.orka.orkametamodel.Container#getVolumes <em>Volumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Volumes</em>'.
	 * @see com.orka.orkametamodel.Container#getVolumes()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Volumes();

	/**
	 * Returns the meta object for the reference '{@link com.orka.orkametamodel.Container#getDeployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deployment</em>'.
	 * @see com.orka.orkametamodel.Container#getDeployment()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Deployment();

	/**
	 * Returns the meta object for the reference '{@link com.orka.orkametamodel.Container#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Application</em>'.
	 * @see com.orka.orkametamodel.Container#getApplication()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Application();

	/**
	 * Returns the meta object for class '{@link com.orka.orkametamodel.Volume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volume</em>'.
	 * @see com.orka.orkametamodel.Volume
	 * @generated
	 */
	EClass getVolume();

	/**
	 * Returns the meta object for the reference list '{@link com.orka.orkametamodel.Volume#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Container</em>'.
	 * @see com.orka.orkametamodel.Volume#getContainer()
	 * @see #getVolume()
	 * @generated
	 */
	EReference getVolume_Container();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.Volume#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.orka.orkametamodel.Volume#getName()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.Volume#getMountPath <em>Mount Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mount Path</em>'.
	 * @see com.orka.orkametamodel.Volume#getMountPath()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_MountPath();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.Volume#getSubPath <em>Sub Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Path</em>'.
	 * @see com.orka.orkametamodel.Volume#getSubPath()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_SubPath();

	/**
	 * Returns the meta object for the reference '{@link com.orka.orkametamodel.Volume#getPersistentvolume <em>Persistentvolume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Persistentvolume</em>'.
	 * @see com.orka.orkametamodel.Volume#getPersistentvolume()
	 * @see #getVolume()
	 * @generated
	 */
	EReference getVolume_Persistentvolume();

	/**
	 * Returns the meta object for class '{@link com.orka.orkametamodel.ScalingPolicy <em>Scaling Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scaling Policy</em>'.
	 * @see com.orka.orkametamodel.ScalingPolicy
	 * @generated
	 */
	EClass getScalingPolicy();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.ScalingPolicy#getMinReplicas <em>Min Replicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Replicas</em>'.
	 * @see com.orka.orkametamodel.ScalingPolicy#getMinReplicas()
	 * @see #getScalingPolicy()
	 * @generated
	 */
	EAttribute getScalingPolicy_MinReplicas();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.ScalingPolicy#getMaxReplicas <em>Max Replicas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Replicas</em>'.
	 * @see com.orka.orkametamodel.ScalingPolicy#getMaxReplicas()
	 * @see #getScalingPolicy()
	 * @generated
	 */
	EAttribute getScalingPolicy_MaxReplicas();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.ScalingPolicy#getCpuThreshold <em>Cpu Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu Threshold</em>'.
	 * @see com.orka.orkametamodel.ScalingPolicy#getCpuThreshold()
	 * @see #getScalingPolicy()
	 * @generated
	 */
	EAttribute getScalingPolicy_CpuThreshold();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.ScalingPolicy#getMemoryThreshold <em>Memory Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Threshold</em>'.
	 * @see com.orka.orkametamodel.ScalingPolicy#getMemoryThreshold()
	 * @see #getScalingPolicy()
	 * @generated
	 */
	EAttribute getScalingPolicy_MemoryThreshold();

	/**
	 * Returns the meta object for the reference '{@link com.orka.orkametamodel.ScalingPolicy#getDeployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deployment</em>'.
	 * @see com.orka.orkametamodel.ScalingPolicy#getDeployment()
	 * @see #getScalingPolicy()
	 * @generated
	 */
	EReference getScalingPolicy_Deployment();

	/**
	 * Returns the meta object for class '{@link com.orka.orkametamodel.ConfigMap <em>Config Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Map</em>'.
	 * @see com.orka.orkametamodel.ConfigMap
	 * @generated
	 */
	EClass getConfigMap();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.ConfigMap#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see com.orka.orkametamodel.ConfigMap#getData()
	 * @see #getConfigMap()
	 * @generated
	 */
	EAttribute getConfigMap_Data();

	/**
	 * Returns the meta object for class '{@link com.orka.orkametamodel.Secret <em>Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secret</em>'.
	 * @see com.orka.orkametamodel.Secret
	 * @generated
	 */
	EClass getSecret();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.Secret#getEncryptedData <em>Encrypted Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encrypted Data</em>'.
	 * @see com.orka.orkametamodel.Secret#getEncryptedData()
	 * @see #getSecret()
	 * @generated
	 */
	EAttribute getSecret_EncryptedData();

	/**
	 * Returns the meta object for class '{@link com.orka.orkametamodel.PersistentVolume <em>Persistent Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persistent Volume</em>'.
	 * @see com.orka.orkametamodel.PersistentVolume
	 * @generated
	 */
	EClass getPersistentVolume();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.PersistentVolume#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see com.orka.orkametamodel.PersistentVolume#getCapacity()
	 * @see #getPersistentVolume()
	 * @generated
	 */
	EAttribute getPersistentVolume_Capacity();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.PersistentVolume#getStorageClass <em>Storage Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage Class</em>'.
	 * @see com.orka.orkametamodel.PersistentVolume#getStorageClass()
	 * @see #getPersistentVolume()
	 * @generated
	 */
	EAttribute getPersistentVolume_StorageClass();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.PersistentVolume#getAccessMode <em>Access Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Mode</em>'.
	 * @see com.orka.orkametamodel.PersistentVolume#getAccessMode()
	 * @see #getPersistentVolume()
	 * @generated
	 */
	EAttribute getPersistentVolume_AccessMode();

	/**
	 * Returns the meta object for the reference '{@link com.orka.orkametamodel.PersistentVolume#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Volume</em>'.
	 * @see com.orka.orkametamodel.PersistentVolume#getVolume()
	 * @see #getPersistentVolume()
	 * @generated
	 */
	EReference getPersistentVolume_Volume();

	/**
	 * Returns the meta object for class '{@link com.orka.orkametamodel.LoadBalancer <em>Load Balancer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Balancer</em>'.
	 * @see com.orka.orkametamodel.LoadBalancer
	 * @generated
	 */
	EClass getLoadBalancer();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.LoadBalancer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.orka.orkametamodel.LoadBalancer#getName()
	 * @see #getLoadBalancer()
	 * @generated
	 */
	EAttribute getLoadBalancer_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.LoadBalancer#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.orka.orkametamodel.LoadBalancer#getType()
	 * @see #getLoadBalancer()
	 * @generated
	 */
	EAttribute getLoadBalancer_Type();

	/**
	 * Returns the meta object for the reference '{@link com.orka.orkametamodel.LoadBalancer#getCluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cluster</em>'.
	 * @see com.orka.orkametamodel.LoadBalancer#getCluster()
	 * @see #getLoadBalancer()
	 * @generated
	 */
	EReference getLoadBalancer_Cluster();

	/**
	 * Returns the meta object for the reference list '{@link com.orka.orkametamodel.LoadBalancer#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see com.orka.orkametamodel.LoadBalancer#getServices()
	 * @see #getLoadBalancer()
	 * @generated
	 */
	EReference getLoadBalancer_Services();

	/**
	 * Returns the meta object for class '{@link com.orka.orkametamodel.CloudProperties <em>Cloud Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Properties</em>'.
	 * @see com.orka.orkametamodel.CloudProperties
	 * @generated
	 */
	EClass getCloudProperties();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.CloudProperties#getInstanceType <em>Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Type</em>'.
	 * @see com.orka.orkametamodel.CloudProperties#getInstanceType()
	 * @see #getCloudProperties()
	 * @generated
	 */
	EAttribute getCloudProperties_InstanceType();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.CloudProperties#getImageId <em>Image Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Id</em>'.
	 * @see com.orka.orkametamodel.CloudProperties#getImageId()
	 * @see #getCloudProperties()
	 * @generated
	 */
	EAttribute getCloudProperties_ImageId();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.CloudProperties#getIamRole <em>Iam Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iam Role</em>'.
	 * @see com.orka.orkametamodel.CloudProperties#getIamRole()
	 * @see #getCloudProperties()
	 * @generated
	 */
	EAttribute getCloudProperties_IamRole();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.CloudProperties#getTenantId <em>Tenant Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tenant Id</em>'.
	 * @see com.orka.orkametamodel.CloudProperties#getTenantId()
	 * @see #getCloudProperties()
	 * @generated
	 */
	EAttribute getCloudProperties_TenantId();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.CloudProperties#getProjectId <em>Project Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Id</em>'.
	 * @see com.orka.orkametamodel.CloudProperties#getProjectId()
	 * @see #getCloudProperties()
	 * @generated
	 */
	EAttribute getCloudProperties_ProjectId();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.CloudProperties#getProvider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider</em>'.
	 * @see com.orka.orkametamodel.CloudProperties#getProvider()
	 * @see #getCloudProperties()
	 * @generated
	 */
	EAttribute getCloudProperties_Provider();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.CloudProperties#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see com.orka.orkametamodel.CloudProperties#getRegion()
	 * @see #getCloudProperties()
	 * @generated
	 */
	EAttribute getCloudProperties_Region();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.CloudProperties#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zone</em>'.
	 * @see com.orka.orkametamodel.CloudProperties#getZone()
	 * @see #getCloudProperties()
	 * @generated
	 */
	EAttribute getCloudProperties_Zone();

	/**
	 * Returns the meta object for class '{@link com.orka.orkametamodel.Ingress <em>Ingress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ingress</em>'.
	 * @see com.orka.orkametamodel.Ingress
	 * @generated
	 */
	EClass getIngress();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.Ingress#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see com.orka.orkametamodel.Ingress#getHost()
	 * @see #getIngress()
	 * @generated
	 */
	EAttribute getIngress_Host();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.Ingress#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see com.orka.orkametamodel.Ingress#getPath()
	 * @see #getIngress()
	 * @generated
	 */
	EAttribute getIngress_Path();

	/**
	 * Returns the meta object for the reference '{@link com.orka.orkametamodel.Ingress#getTlsSecret <em>Tls Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tls Secret</em>'.
	 * @see com.orka.orkametamodel.Ingress#getTlsSecret()
	 * @see #getIngress()
	 * @generated
	 */
	EReference getIngress_TlsSecret();

	/**
	 * Returns the meta object for the reference list '{@link com.orka.orkametamodel.Ingress#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service</em>'.
	 * @see com.orka.orkametamodel.Ingress#getService()
	 * @see #getIngress()
	 * @generated
	 */
	EReference getIngress_Service();

	/**
	 * Returns the meta object for class '{@link com.orka.orkametamodel.Monitoring <em>Monitoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitoring</em>'.
	 * @see com.orka.orkametamodel.Monitoring
	 * @generated
	 */
	EClass getMonitoring();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.Monitoring#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see com.orka.orkametamodel.Monitoring#isEnabled()
	 * @see #getMonitoring()
	 * @generated
	 */
	EAttribute getMonitoring_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.Monitoring#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tool</em>'.
	 * @see com.orka.orkametamodel.Monitoring#getTool()
	 * @see #getMonitoring()
	 * @generated
	 */
	EAttribute getMonitoring_Tool();

	/**
	 * Returns the meta object for the reference '{@link com.orka.orkametamodel.Monitoring#getCluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cluster</em>'.
	 * @see com.orka.orkametamodel.Monitoring#getCluster()
	 * @see #getMonitoring()
	 * @generated
	 */
	EReference getMonitoring_Cluster();

	/**
	 * Returns the meta object for the reference '{@link com.orka.orkametamodel.Monitoring#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Application</em>'.
	 * @see com.orka.orkametamodel.Monitoring#getApplication()
	 * @see #getMonitoring()
	 * @generated
	 */
	EReference getMonitoring_Application();

	/**
	 * Returns the meta object for class '{@link com.orka.orkametamodel.Cluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cluster</em>'.
	 * @see com.orka.orkametamodel.Cluster
	 * @generated
	 */
	EClass getCluster();

	/**
	 * Returns the meta object for the reference '{@link com.orka.orkametamodel.Cluster#getSubnetwork <em>Subnetwork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subnetwork</em>'.
	 * @see com.orka.orkametamodel.Cluster#getSubnetwork()
	 * @see #getCluster()
	 * @generated
	 */
	EReference getCluster_Subnetwork();

	/**
	 * Returns the meta object for the reference '{@link com.orka.orkametamodel.Cluster#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Network</em>'.
	 * @see com.orka.orkametamodel.Cluster#getNetwork()
	 * @see #getCluster()
	 * @generated
	 */
	EReference getCluster_Network();

	/**
	 * Returns the meta object for the reference '{@link com.orka.orkametamodel.Cluster#getLoadbalancers <em>Loadbalancers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Loadbalancers</em>'.
	 * @see com.orka.orkametamodel.Cluster#getLoadbalancers()
	 * @see #getCluster()
	 * @generated
	 */
	EReference getCluster_Loadbalancers();

	/**
	 * Returns the meta object for the reference '{@link com.orka.orkametamodel.Cluster#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Services</em>'.
	 * @see com.orka.orkametamodel.Cluster#getServices()
	 * @see #getCluster()
	 * @generated
	 */
	EReference getCluster_Services();

	/**
	 * Returns the meta object for the reference '{@link com.orka.orkametamodel.Cluster#getDeployments <em>Deployments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deployments</em>'.
	 * @see com.orka.orkametamodel.Cluster#getDeployments()
	 * @see #getCluster()
	 * @generated
	 */
	EReference getCluster_Deployments();

	/**
	 * Returns the meta object for the reference '{@link com.orka.orkametamodel.Cluster#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nodes</em>'.
	 * @see com.orka.orkametamodel.Cluster#getNodes()
	 * @see #getCluster()
	 * @generated
	 */
	EReference getCluster_Nodes();

	/**
	 * Returns the meta object for the reference '{@link com.orka.orkametamodel.Cluster#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Region</em>'.
	 * @see com.orka.orkametamodel.Cluster#getRegion()
	 * @see #getCluster()
	 * @generated
	 */
	EReference getCluster_Region();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.Cluster#isNet_conf <em>Net conf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Net conf</em>'.
	 * @see com.orka.orkametamodel.Cluster#isNet_conf()
	 * @see #getCluster()
	 * @generated
	 */
	EAttribute getCluster_Net_conf();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.Cluster#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.orka.orkametamodel.Cluster#getName()
	 * @see #getCluster()
	 * @generated
	 */
	EAttribute getCluster_Name();

	/**
	 * Returns the meta object for the reference '{@link com.orka.orkametamodel.Cluster#getOrkamodel <em>Orkamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Orkamodel</em>'.
	 * @see com.orka.orkametamodel.Cluster#getOrkamodel()
	 * @see #getCluster()
	 * @generated
	 */
	EReference getCluster_Orkamodel();

	/**
	 * Returns the meta object for class '{@link com.orka.orkametamodel.OrkaModel <em>Orka Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orka Model</em>'.
	 * @see com.orka.orkametamodel.OrkaModel
	 * @generated
	 */
	EClass getOrkaModel();

	/**
	 * Returns the meta object for the reference list '{@link com.orka.orkametamodel.OrkaModel#getClusters <em>Clusters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clusters</em>'.
	 * @see com.orka.orkametamodel.OrkaModel#getClusters()
	 * @see #getOrkaModel()
	 * @generated
	 */
	EReference getOrkaModel_Clusters();

	/**
	 * Returns the meta object for the attribute '{@link com.orka.orkametamodel.OrkaModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.orka.orkametamodel.OrkaModel#getName()
	 * @see #getOrkaModel()
	 * @generated
	 */
	EAttribute getOrkaModel_Name();

	/**
	 * Returns the meta object for enum '{@link com.orka.orkametamodel.Provider <em>Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Provider</em>'.
	 * @see com.orka.orkametamodel.Provider
	 * @generated
	 */
	EEnum getProvider();

	/**
	 * Returns the meta object for enum '{@link com.orka.orkametamodel.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protocol</em>'.
	 * @see com.orka.orkametamodel.Protocol
	 * @generated
	 */
	EEnum getProtocol();

	/**
	 * Returns the meta object for enum '{@link com.orka.orkametamodel.Hypervisor <em>Hypervisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hypervisor</em>'.
	 * @see com.orka.orkametamodel.Hypervisor
	 * @generated
	 */
	EEnum getHypervisor();

	/**
	 * Returns the meta object for enum '{@link com.orka.orkametamodel.ServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Service Type</em>'.
	 * @see com.orka.orkametamodel.ServiceType
	 * @generated
	 */
	EEnum getServiceType();

	/**
	 * Returns the meta object for enum '{@link com.orka.orkametamodel.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Processor</em>'.
	 * @see com.orka.orkametamodel.Processor
	 * @generated
	 */
	EEnum getProcessor();

	/**
	 * Returns the meta object for enum '{@link com.orka.orkametamodel.IPRangeType <em>IP Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>IP Range Type</em>'.
	 * @see com.orka.orkametamodel.IPRangeType
	 * @generated
	 */
	EEnum getIPRangeType();

	/**
	 * Returns the meta object for enum '{@link com.orka.orkametamodel.LoadBalancerType <em>Load Balancer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Load Balancer Type</em>'.
	 * @see com.orka.orkametamodel.LoadBalancerType
	 * @generated
	 */
	EEnum getLoadBalancerType();

	/**
	 * Returns the meta object for enum '{@link com.orka.orkametamodel.AccessMode <em>Access Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Mode</em>'.
	 * @see com.orka.orkametamodel.AccessMode
	 * @generated
	 */
	EEnum getAccessMode();

	/**
	 * Returns the meta object for enum '{@link com.orka.orkametamodel.MonitoringTool <em>Monitoring Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Monitoring Tool</em>'.
	 * @see com.orka.orkametamodel.MonitoringTool
	 * @generated
	 */
	EEnum getMonitoringTool();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetamodelFactory getMetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.impl.PublicClusterImpl <em>Public Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.impl.PublicClusterImpl
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getPublicCluster()
		 * @generated
		 */
		EClass PUBLIC_CLUSTER = eINSTANCE.getPublicCluster();

		/**
		 * The meta object literal for the '<em><b>Num nodes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_CLUSTER__NUM_NODES = eINSTANCE.getPublicCluster_Num_nodes();

		/**
		 * The meta object literal for the '<em><b>Config file</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_CLUSTER__CONFIG_FILE = eINSTANCE.getPublicCluster_Config_file();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_CLUSTER__PROVIDER = eINSTANCE.getPublicCluster_Provider();

		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.impl.OnPremisesImpl <em>On Premises</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.impl.OnPremisesImpl
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getOnPremises()
		 * @generated
		 */
		EClass ON_PREMISES = eINSTANCE.getOnPremises();

		/**
		 * The meta object literal for the '<em><b>Hypervisor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_PREMISES__HYPERVISOR = eINSTANCE.getOnPremises_Hypervisor();

		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.impl.NodeImpl
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Cluster</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__CLUSTER = eINSTANCE.getNode_Cluster();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__RESOURCES = eINSTANCE.getNode_Resources();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Hostname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__HOSTNAME = eINSTANCE.getNode_Hostname();

		/**
		 * The meta object literal for the '<em><b>Public ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__PUBLIC_IP = eINSTANCE.getNode_Public_ip();

		/**
		 * The meta object literal for the '<em><b>Private ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__PRIVATE_IP = eINSTANCE.getNode_Private_ip();

		/**
		 * The meta object literal for the '<em><b>Os</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__OS = eINSTANCE.getNode_Os();

		/**
		 * The meta object literal for the '<em><b>Storage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__STORAGE = eINSTANCE.getNode_Storage();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__PROCESSOR = eINSTANCE.getNode_Processor();

		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.impl.EdgeNodeImpl <em>Edge Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.impl.EdgeNodeImpl
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getEdgeNode()
		 * @generated
		 */
		EClass EDGE_NODE = eINSTANCE.getEdgeNode();

		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.impl.CloudNodeImpl <em>Cloud Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.impl.CloudNodeImpl
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getCloudNode()
		 * @generated
		 */
		EClass CLOUD_NODE = eINSTANCE.getCloudNode();

		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.impl.ZoneImpl <em>Zone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.impl.ZoneImpl
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getZone()
		 * @generated
		 */
		EClass ZONE = eINSTANCE.getZone();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE__REGION = eINSTANCE.getZone_Region();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZONE__NAME = eINSTANCE.getZone_Name();

		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.impl.RegionImpl <em>Region</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.impl.RegionImpl
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getRegion()
		 * @generated
		 */
		EClass REGION = eINSTANCE.getRegion();

		/**
		 * The meta object literal for the '<em><b>Zone</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__ZONE = eINSTANCE.getRegion_Zone();

		/**
		 * The meta object literal for the '<em><b>Cluster</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGION__CLUSTER = eINSTANCE.getRegion_Cluster();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGION__NAME = eINSTANCE.getRegion_Name();

		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.impl.IPRangeImpl <em>IP Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.impl.IPRangeImpl
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getIPRange()
		 * @generated
		 */
		EClass IP_RANGE = eINSTANCE.getIPRange();

		/**
		 * The meta object literal for the '<em><b>Subnetwork</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IP_RANGE__SUBNETWORK = eINSTANCE.getIPRange_Subnetwork();

		/**
		 * The meta object literal for the '<em><b>Cidr range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IP_RANGE__CIDR_RANGE = eINSTANCE.getIPRange_Cidr_range();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IP_RANGE__TYPE = eINSTANCE.getIPRange_Type();

		/**
		 * The meta object literal for the '<em><b>Public</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IP_RANGE__PUBLIC = eINSTANCE.getIPRange_Public();

		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.impl.SubnetworkImpl <em>Subnetwork</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.impl.SubnetworkImpl
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getSubnetwork()
		 * @generated
		 */
		EClass SUBNETWORK = eINSTANCE.getSubnetwork();

		/**
		 * The meta object literal for the '<em><b>Cluster</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBNETWORK__CLUSTER = eINSTANCE.getSubnetwork_Cluster();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBNETWORK__NETWORK = eINSTANCE.getSubnetwork_Network();

		/**
		 * The meta object literal for the '<em><b>Iprange</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBNETWORK__IPRANGE = eINSTANCE.getSubnetwork_Iprange();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBNETWORK__NAME = eINSTANCE.getSubnetwork_Name();

		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.impl.NetworkImpl
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Subnetwork</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__SUBNETWORK = eINSTANCE.getNetwork_Subnetwork();

		/**
		 * The meta object literal for the '<em><b>Securitygroups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__SECURITYGROUPS = eINSTANCE.getNetwork_Securitygroups();

		/**
		 * The meta object literal for the '<em><b>Cluster</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__CLUSTER = eINSTANCE.getNetwork_Cluster();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__NAME = eINSTANCE.getNetwork_Name();

		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.impl.ServiceImpl
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Cluster</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__CLUSTER = eINSTANCE.getService_Cluster();

		/**
		 * The meta object literal for the '<em><b>Security Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__SECURITY_GROUP = eINSTANCE.getService_SecurityGroup();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__APPLICATION = eINSTANCE.getService_Application();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__TYPE = eINSTANCE.getService_Type();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__PORT = eINSTANCE.getService_Port();

		/**
		 * The meta object literal for the '<em><b>Target port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__TARGET_PORT = eINSTANCE.getService_Target_port();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__PROTOCOL = eINSTANCE.getService_Protocol();

		/**
		 * The meta object literal for the '<em><b>Loadbalancer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__LOADBALANCER = eINSTANCE.getService_Loadbalancer();

		/**
		 * The meta object literal for the '<em><b>Ingress</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__INGRESS = eINSTANCE.getService_Ingress();

		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.impl.SecurityGroupImpl <em>Security Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.impl.SecurityGroupImpl
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getSecurityGroup()
		 * @generated
		 */
		EClass SECURITY_GROUP = eINSTANCE.getSecurityGroup();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_GROUP__NETWORK = eINSTANCE.getSecurityGroup_Network();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_GROUP__SERVICES = eINSTANCE.getSecurityGroup_Services();

		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.impl.ApplicationImpl
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Required Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__REQUIRED_RESOURCES = eINSTANCE.getApplication_RequiredResources();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__SERVICES = eINSTANCE.getApplication_Services();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__CONTAINER = eINSTANCE.getApplication_Container();

		/**
		 * The meta object literal for the '<em><b>Image Repository</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__IMAGE_REPOSITORY = eINSTANCE.getApplication_ImageRepository();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__PORT = eINSTANCE.getApplication_Port();

		/**
		 * The meta object literal for the '<em><b>Secret</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__SECRET = eINSTANCE.getApplication_Secret();

		/**
		 * The meta object literal for the '<em><b>Configmap</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__CONFIGMAP = eINSTANCE.getApplication_Configmap();

		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.impl.ResourcesImpl <em>Resources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.impl.ResourcesImpl
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getResources()
		 * @generated
		 */
		EClass RESOURCES = eINSTANCE.getResources();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCES__NODE = eINSTANCE.getResources_Node();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCES__CONTAINER = eINSTANCE.getResources_Container();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCES__APPLICATION = eINSTANCE.getResources_Application();

		/**
		 * The meta object literal for the '<em><b>Cpu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCES__CPU = eINSTANCE.getResources_Cpu();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCES__MEMORY = eINSTANCE.getResources_Memory();

		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.impl.DeploymentImpl <em>Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.impl.DeploymentImpl
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getDeployment()
		 * @generated
		 */
		EClass DEPLOYMENT = eINSTANCE.getDeployment();

		/**
		 * The meta object literal for the '<em><b>Cluster</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__CLUSTER = eINSTANCE.getDeployment_Cluster();

		/**
		 * The meta object literal for the '<em><b>Replicas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__REPLICAS = eINSTANCE.getDeployment_Replicas();

		/**
		 * The meta object literal for the '<em><b>Containers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__CONTAINERS = eINSTANCE.getDeployment_Containers();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__NAME = eINSTANCE.getDeployment_Name();

		/**
		 * The meta object literal for the '<em><b>Scalingpolicy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__SCALINGPOLICY = eINSTANCE.getDeployment_Scalingpolicy();

		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.impl.ContainerImpl
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__RESOURCES = eINSTANCE.getContainer_Resources();

		/**
		 * The meta object literal for the '<em><b>Volumes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__VOLUMES = eINSTANCE.getContainer_Volumes();

		/**
		 * The meta object literal for the '<em><b>Deployment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__DEPLOYMENT = eINSTANCE.getContainer_Deployment();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__APPLICATION = eINSTANCE.getContainer_Application();

		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.impl.VolumeImpl <em>Volume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.impl.VolumeImpl
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getVolume()
		 * @generated
		 */
		EClass VOLUME = eINSTANCE.getVolume();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOLUME__CONTAINER = eINSTANCE.getVolume_Container();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__NAME = eINSTANCE.getVolume_Name();

		/**
		 * The meta object literal for the '<em><b>Mount Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__MOUNT_PATH = eINSTANCE.getVolume_MountPath();

		/**
		 * The meta object literal for the '<em><b>Sub Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__SUB_PATH = eINSTANCE.getVolume_SubPath();

		/**
		 * The meta object literal for the '<em><b>Persistentvolume</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOLUME__PERSISTENTVOLUME = eINSTANCE.getVolume_Persistentvolume();

		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.impl.ScalingPolicyImpl <em>Scaling Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.impl.ScalingPolicyImpl
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getScalingPolicy()
		 * @generated
		 */
		EClass SCALING_POLICY = eINSTANCE.getScalingPolicy();

		/**
		 * The meta object literal for the '<em><b>Min Replicas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALING_POLICY__MIN_REPLICAS = eINSTANCE.getScalingPolicy_MinReplicas();

		/**
		 * The meta object literal for the '<em><b>Max Replicas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALING_POLICY__MAX_REPLICAS = eINSTANCE.getScalingPolicy_MaxReplicas();

		/**
		 * The meta object literal for the '<em><b>Cpu Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALING_POLICY__CPU_THRESHOLD = eINSTANCE.getScalingPolicy_CpuThreshold();

		/**
		 * The meta object literal for the '<em><b>Memory Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALING_POLICY__MEMORY_THRESHOLD = eINSTANCE.getScalingPolicy_MemoryThreshold();

		/**
		 * The meta object literal for the '<em><b>Deployment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALING_POLICY__DEPLOYMENT = eINSTANCE.getScalingPolicy_Deployment();

		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.impl.ConfigMapImpl <em>Config Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.impl.ConfigMapImpl
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getConfigMap()
		 * @generated
		 */
		EClass CONFIG_MAP = eINSTANCE.getConfigMap();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_MAP__DATA = eINSTANCE.getConfigMap_Data();

		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.impl.SecretImpl <em>Secret</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.impl.SecretImpl
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getSecret()
		 * @generated
		 */
		EClass SECRET = eINSTANCE.getSecret();

		/**
		 * The meta object literal for the '<em><b>Encrypted Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECRET__ENCRYPTED_DATA = eINSTANCE.getSecret_EncryptedData();

		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.impl.PersistentVolumeImpl <em>Persistent Volume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.impl.PersistentVolumeImpl
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getPersistentVolume()
		 * @generated
		 */
		EClass PERSISTENT_VOLUME = eINSTANCE.getPersistentVolume();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENT_VOLUME__CAPACITY = eINSTANCE.getPersistentVolume_Capacity();

		/**
		 * The meta object literal for the '<em><b>Storage Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENT_VOLUME__STORAGE_CLASS = eINSTANCE.getPersistentVolume_StorageClass();

		/**
		 * The meta object literal for the '<em><b>Access Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENT_VOLUME__ACCESS_MODE = eINSTANCE.getPersistentVolume_AccessMode();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSISTENT_VOLUME__VOLUME = eINSTANCE.getPersistentVolume_Volume();

		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.impl.LoadBalancerImpl <em>Load Balancer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.impl.LoadBalancerImpl
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getLoadBalancer()
		 * @generated
		 */
		EClass LOAD_BALANCER = eINSTANCE.getLoadBalancer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_BALANCER__NAME = eINSTANCE.getLoadBalancer_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD_BALANCER__TYPE = eINSTANCE.getLoadBalancer_Type();

		/**
		 * The meta object literal for the '<em><b>Cluster</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_BALANCER__CLUSTER = eINSTANCE.getLoadBalancer_Cluster();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_BALANCER__SERVICES = eINSTANCE.getLoadBalancer_Services();

		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.impl.CloudPropertiesImpl <em>Cloud Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.impl.CloudPropertiesImpl
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getCloudProperties()
		 * @generated
		 */
		EClass CLOUD_PROPERTIES = eINSTANCE.getCloudProperties();

		/**
		 * The meta object literal for the '<em><b>Instance Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_PROPERTIES__INSTANCE_TYPE = eINSTANCE.getCloudProperties_InstanceType();

		/**
		 * The meta object literal for the '<em><b>Image Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_PROPERTIES__IMAGE_ID = eINSTANCE.getCloudProperties_ImageId();

		/**
		 * The meta object literal for the '<em><b>Iam Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_PROPERTIES__IAM_ROLE = eINSTANCE.getCloudProperties_IamRole();

		/**
		 * The meta object literal for the '<em><b>Tenant Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_PROPERTIES__TENANT_ID = eINSTANCE.getCloudProperties_TenantId();

		/**
		 * The meta object literal for the '<em><b>Project Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_PROPERTIES__PROJECT_ID = eINSTANCE.getCloudProperties_ProjectId();

		/**
		 * The meta object literal for the '<em><b>Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_PROPERTIES__PROVIDER = eINSTANCE.getCloudProperties_Provider();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_PROPERTIES__REGION = eINSTANCE.getCloudProperties_Region();

		/**
		 * The meta object literal for the '<em><b>Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_PROPERTIES__ZONE = eINSTANCE.getCloudProperties_Zone();

		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.impl.IngressImpl <em>Ingress</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.impl.IngressImpl
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getIngress()
		 * @generated
		 */
		EClass INGRESS = eINSTANCE.getIngress();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INGRESS__HOST = eINSTANCE.getIngress_Host();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INGRESS__PATH = eINSTANCE.getIngress_Path();

		/**
		 * The meta object literal for the '<em><b>Tls Secret</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INGRESS__TLS_SECRET = eINSTANCE.getIngress_TlsSecret();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INGRESS__SERVICE = eINSTANCE.getIngress_Service();

		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.impl.MonitoringImpl <em>Monitoring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.impl.MonitoringImpl
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getMonitoring()
		 * @generated
		 */
		EClass MONITORING = eINSTANCE.getMonitoring();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITORING__ENABLED = eINSTANCE.getMonitoring_Enabled();

		/**
		 * The meta object literal for the '<em><b>Tool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONITORING__TOOL = eINSTANCE.getMonitoring_Tool();

		/**
		 * The meta object literal for the '<em><b>Cluster</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITORING__CLUSTER = eINSTANCE.getMonitoring_Cluster();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITORING__APPLICATION = eINSTANCE.getMonitoring_Application();

		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.impl.ClusterImpl <em>Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.impl.ClusterImpl
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getCluster()
		 * @generated
		 */
		EClass CLUSTER = eINSTANCE.getCluster();

		/**
		 * The meta object literal for the '<em><b>Subnetwork</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER__SUBNETWORK = eINSTANCE.getCluster_Subnetwork();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER__NETWORK = eINSTANCE.getCluster_Network();

		/**
		 * The meta object literal for the '<em><b>Loadbalancers</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER__LOADBALANCERS = eINSTANCE.getCluster_Loadbalancers();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER__SERVICES = eINSTANCE.getCluster_Services();

		/**
		 * The meta object literal for the '<em><b>Deployments</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER__DEPLOYMENTS = eINSTANCE.getCluster_Deployments();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER__NODES = eINSTANCE.getCluster_Nodes();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER__REGION = eINSTANCE.getCluster_Region();

		/**
		 * The meta object literal for the '<em><b>Net conf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLUSTER__NET_CONF = eINSTANCE.getCluster_Net_conf();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLUSTER__NAME = eINSTANCE.getCluster_Name();

		/**
		 * The meta object literal for the '<em><b>Orkamodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLUSTER__ORKAMODEL = eINSTANCE.getCluster_Orkamodel();

		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.impl.OrkaModelImpl <em>Orka Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.impl.OrkaModelImpl
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getOrkaModel()
		 * @generated
		 */
		EClass ORKA_MODEL = eINSTANCE.getOrkaModel();

		/**
		 * The meta object literal for the '<em><b>Clusters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORKA_MODEL__CLUSTERS = eINSTANCE.getOrkaModel_Clusters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORKA_MODEL__NAME = eINSTANCE.getOrkaModel_Name();

		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.Provider <em>Provider</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.Provider
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getProvider()
		 * @generated
		 */
		EEnum PROVIDER = eINSTANCE.getProvider();

		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.Protocol <em>Protocol</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.Protocol
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getProtocol()
		 * @generated
		 */
		EEnum PROTOCOL = eINSTANCE.getProtocol();

		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.Hypervisor <em>Hypervisor</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.Hypervisor
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getHypervisor()
		 * @generated
		 */
		EEnum HYPERVISOR = eINSTANCE.getHypervisor();

		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.ServiceType <em>Service Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.ServiceType
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getServiceType()
		 * @generated
		 */
		EEnum SERVICE_TYPE = eINSTANCE.getServiceType();

		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.Processor <em>Processor</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.Processor
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getProcessor()
		 * @generated
		 */
		EEnum PROCESSOR = eINSTANCE.getProcessor();

		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.IPRangeType <em>IP Range Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.IPRangeType
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getIPRangeType()
		 * @generated
		 */
		EEnum IP_RANGE_TYPE = eINSTANCE.getIPRangeType();

		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.LoadBalancerType <em>Load Balancer Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.LoadBalancerType
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getLoadBalancerType()
		 * @generated
		 */
		EEnum LOAD_BALANCER_TYPE = eINSTANCE.getLoadBalancerType();

		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.AccessMode <em>Access Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.AccessMode
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getAccessMode()
		 * @generated
		 */
		EEnum ACCESS_MODE = eINSTANCE.getAccessMode();

		/**
		 * The meta object literal for the '{@link com.orka.orkametamodel.MonitoringTool <em>Monitoring Tool</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.orka.orkametamodel.MonitoringTool
		 * @see com.orka.orkametamodel.impl.MetamodelPackageImpl#getMonitoringTool()
		 * @generated
		 */
		EEnum MONITORING_TOOL = eINSTANCE.getMonitoringTool();

	}

} //MetamodelPackage
