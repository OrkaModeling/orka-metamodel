/**
 */
package com.orka.orkametamodel.impl;

import com.orka.orkametamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetamodelFactoryImpl extends EFactoryImpl implements MetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetamodelFactory init() {
		try {
			MetamodelFactory theMetamodelFactory = (MetamodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(MetamodelPackage.eNS_URI);
			if (theMetamodelFactory != null) {
				return theMetamodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MetamodelPackage.PUBLIC_CLUSTER:
			return createPublicCluster();
		case MetamodelPackage.ON_PREMISES:
			return createOnPremises();
		case MetamodelPackage.NODE:
			return createNode();
		case MetamodelPackage.EDGE_NODE:
			return createEdgeNode();
		case MetamodelPackage.CLOUD_NODE:
			return createCloudNode();
		case MetamodelPackage.ZONE:
			return createZone();
		case MetamodelPackage.REGION:
			return createRegion();
		case MetamodelPackage.IP_RANGE:
			return createIPRange();
		case MetamodelPackage.SUBNETWORK:
			return createSubnetwork();
		case MetamodelPackage.NETWORK:
			return createNetwork();
		case MetamodelPackage.SERVICE:
			return createService();
		case MetamodelPackage.SECURITY_GROUP:
			return createSecurityGroup();
		case MetamodelPackage.APPLICATION:
			return createApplication();
		case MetamodelPackage.RESOURCES:
			return createResources();
		case MetamodelPackage.DEPLOYMENT:
			return createDeployment();
		case MetamodelPackage.CONTAINER:
			return createContainer();
		case MetamodelPackage.VOLUME:
			return createVolume();
		case MetamodelPackage.SCALING_POLICY:
			return createScalingPolicy();
		case MetamodelPackage.CONFIG_MAP:
			return createConfigMap();
		case MetamodelPackage.SECRET:
			return createSecret();
		case MetamodelPackage.PERSISTENT_VOLUME:
			return createPersistentVolume();
		case MetamodelPackage.LOAD_BALANCER:
			return createLoadBalancer();
		case MetamodelPackage.CLOUD_PROPERTIES:
			return createCloudProperties();
		case MetamodelPackage.INGRESS:
			return createIngress();
		case MetamodelPackage.MONITORING:
			return createMonitoring();
		case MetamodelPackage.CLUSTER:
			return createCluster();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case MetamodelPackage.PROVIDER:
			return createProviderFromString(eDataType, initialValue);
		case MetamodelPackage.PROTOCOL:
			return createProtocolFromString(eDataType, initialValue);
		case MetamodelPackage.HYPERVISOR:
			return createHypervisorFromString(eDataType, initialValue);
		case MetamodelPackage.SERVICE_TYPE:
			return createServiceTypeFromString(eDataType, initialValue);
		case MetamodelPackage.PROCESSOR:
			return createProcessorFromString(eDataType, initialValue);
		case MetamodelPackage.IP_RANGE_TYPE:
			return createIPRangeTypeFromString(eDataType, initialValue);
		case MetamodelPackage.LOAD_BALANCER_TYPE:
			return createLoadBalancerTypeFromString(eDataType, initialValue);
		case MetamodelPackage.ACCESS_MODE:
			return createAccessModeFromString(eDataType, initialValue);
		case MetamodelPackage.MONITORING_TOOL:
			return createMonitoringToolFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case MetamodelPackage.PROVIDER:
			return convertProviderToString(eDataType, instanceValue);
		case MetamodelPackage.PROTOCOL:
			return convertProtocolToString(eDataType, instanceValue);
		case MetamodelPackage.HYPERVISOR:
			return convertHypervisorToString(eDataType, instanceValue);
		case MetamodelPackage.SERVICE_TYPE:
			return convertServiceTypeToString(eDataType, instanceValue);
		case MetamodelPackage.PROCESSOR:
			return convertProcessorToString(eDataType, instanceValue);
		case MetamodelPackage.IP_RANGE_TYPE:
			return convertIPRangeTypeToString(eDataType, instanceValue);
		case MetamodelPackage.LOAD_BALANCER_TYPE:
			return convertLoadBalancerTypeToString(eDataType, instanceValue);
		case MetamodelPackage.ACCESS_MODE:
			return convertAccessModeToString(eDataType, instanceValue);
		case MetamodelPackage.MONITORING_TOOL:
			return convertMonitoringToolToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicCluster createPublicCluster() {
		PublicClusterImpl publicCluster = new PublicClusterImpl();
		return publicCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnPremises createOnPremises() {
		OnPremisesImpl onPremises = new OnPremisesImpl();
		return onPremises;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeNode createEdgeNode() {
		EdgeNodeImpl edgeNode = new EdgeNodeImpl();
		return edgeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudNode createCloudNode() {
		CloudNodeImpl cloudNode = new CloudNodeImpl();
		return cloudNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zone createZone() {
		ZoneImpl zone = new ZoneImpl();
		return zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region createRegion() {
		RegionImpl region = new RegionImpl();
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPRange createIPRange() {
		IPRangeImpl ipRange = new IPRangeImpl();
		return ipRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subnetwork createSubnetwork() {
		SubnetworkImpl subnetwork = new SubnetworkImpl();
		return subnetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network createNetwork() {
		NetworkImpl network = new NetworkImpl();
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityGroup createSecurityGroup() {
		SecurityGroupImpl securityGroup = new SecurityGroupImpl();
		return securityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resources createResources() {
		ResourcesImpl resources = new ResourcesImpl();
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment createDeployment() {
		DeploymentImpl deployment = new DeploymentImpl();
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.orka.orkametamodel.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Volume createVolume() {
		VolumeImpl volume = new VolumeImpl();
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalingPolicy createScalingPolicy() {
		ScalingPolicyImpl scalingPolicy = new ScalingPolicyImpl();
		return scalingPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigMap createConfigMap() {
		ConfigMapImpl configMap = new ConfigMapImpl();
		return configMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Secret createSecret() {
		SecretImpl secret = new SecretImpl();
		return secret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistentVolume createPersistentVolume() {
		PersistentVolumeImpl persistentVolume = new PersistentVolumeImpl();
		return persistentVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadBalancer createLoadBalancer() {
		LoadBalancerImpl loadBalancer = new LoadBalancerImpl();
		return loadBalancer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudProperties createCloudProperties() {
		CloudPropertiesImpl cloudProperties = new CloudPropertiesImpl();
		return cloudProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ingress createIngress() {
		IngressImpl ingress = new IngressImpl();
		return ingress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monitoring createMonitoring() {
		MonitoringImpl monitoring = new MonitoringImpl();
		return monitoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cluster createCluster() {
		ClusterImpl cluster = new ClusterImpl();
		return cluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provider createProviderFromString(EDataType eDataType, String initialValue) {
		Provider result = Provider.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProviderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protocol createProtocolFromString(EDataType eDataType, String initialValue) {
		Protocol result = Protocol.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProtocolToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hypervisor createHypervisorFromString(EDataType eDataType, String initialValue) {
		Hypervisor result = Hypervisor.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHypervisorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceType createServiceTypeFromString(EDataType eDataType, String initialValue) {
		ServiceType result = ServiceType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processor createProcessorFromString(EDataType eDataType, String initialValue) {
		Processor result = Processor.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPRangeType createIPRangeTypeFromString(EDataType eDataType, String initialValue) {
		IPRangeType result = IPRangeType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIPRangeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadBalancerType createLoadBalancerTypeFromString(EDataType eDataType, String initialValue) {
		LoadBalancerType result = LoadBalancerType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLoadBalancerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessMode createAccessModeFromString(EDataType eDataType, String initialValue) {
		AccessMode result = AccessMode.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoringTool createMonitoringToolFromString(EDataType eDataType, String initialValue) {
		MonitoringTool result = MonitoringTool.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMonitoringToolToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelPackage getMetamodelPackage() {
		return (MetamodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetamodelPackage getPackage() {
		return MetamodelPackage.eINSTANCE;
	}

} //MetamodelFactoryImpl
