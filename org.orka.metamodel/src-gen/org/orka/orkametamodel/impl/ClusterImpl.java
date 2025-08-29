/**
 */
package org.orka.orkametamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.orka.orkametamodel.Cluster;
import org.orka.orkametamodel.Deployment;
import org.orka.orkametamodel.LoadBalancer;
import org.orka.orkametamodel.MetamodelPackage;
import org.orka.orkametamodel.Network;
import org.orka.orkametamodel.Node;
import org.orka.orkametamodel.OrkaModel;
import org.orka.orkametamodel.Region;
import org.orka.orkametamodel.Service;
import org.orka.orkametamodel.Subnetwork;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.orka.orkametamodel.impl.ClusterImpl#getSubnetwork <em>Subnetwork</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.ClusterImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.ClusterImpl#getLoadbalancers <em>Loadbalancers</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.ClusterImpl#getServices <em>Services</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.ClusterImpl#getDeployments <em>Deployments</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.ClusterImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.ClusterImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.ClusterImpl#isNet_conf <em>Net conf</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.ClusterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.ClusterImpl#getOrkamodel <em>Orkamodel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClusterImpl extends MinimalEObjectImpl.Container implements Cluster {
	/**
	 * The cached value of the '{@link #getSubnetwork() <em>Subnetwork</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetwork()
	 * @generated
	 * @ordered
	 */
	protected Subnetwork subnetwork;

	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected Network network;

	/**
	 * The cached value of the '{@link #getLoadbalancers() <em>Loadbalancers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadbalancers()
	 * @generated
	 * @ordered
	 */
	protected LoadBalancer loadbalancers;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected Service services;

	/**
	 * The cached value of the '{@link #getDeployments() <em>Deployments</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployments()
	 * @generated
	 * @ordered
	 */
	protected Deployment deployments;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected Node nodes;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected Region region;

	/**
	 * The default value of the '{@link #isNet_conf() <em>Net conf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNet_conf()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NET_CONF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNet_conf() <em>Net conf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNet_conf()
	 * @generated
	 * @ordered
	 */
	protected boolean net_conf = NET_CONF_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrkamodel() <em>Orkamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrkamodel()
	 * @generated
	 * @ordered
	 */
	protected OrkaModel orkamodel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.CLUSTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subnetwork getSubnetwork() {
		if (subnetwork != null && subnetwork.eIsProxy()) {
			InternalEObject oldSubnetwork = (InternalEObject) subnetwork;
			subnetwork = (Subnetwork) eResolveProxy(oldSubnetwork);
			if (subnetwork != oldSubnetwork) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.CLUSTER__SUBNETWORK,
							oldSubnetwork, subnetwork));
			}
		}
		return subnetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subnetwork basicGetSubnetwork() {
		return subnetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubnetwork(Subnetwork newSubnetwork, NotificationChain msgs) {
		Subnetwork oldSubnetwork = subnetwork;
		subnetwork = newSubnetwork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.CLUSTER__SUBNETWORK, oldSubnetwork, newSubnetwork);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubnetwork(Subnetwork newSubnetwork) {
		if (newSubnetwork != subnetwork) {
			NotificationChain msgs = null;
			if (subnetwork != null)
				msgs = ((InternalEObject) subnetwork).eInverseRemove(this, MetamodelPackage.SUBNETWORK__CLUSTER,
						Subnetwork.class, msgs);
			if (newSubnetwork != null)
				msgs = ((InternalEObject) newSubnetwork).eInverseAdd(this, MetamodelPackage.SUBNETWORK__CLUSTER,
						Subnetwork.class, msgs);
			msgs = basicSetSubnetwork(newSubnetwork, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.CLUSTER__SUBNETWORK, newSubnetwork,
					newSubnetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network getNetwork() {
		if (network != null && network.eIsProxy()) {
			InternalEObject oldNetwork = (InternalEObject) network;
			network = (Network) eResolveProxy(oldNetwork);
			if (network != oldNetwork) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.CLUSTER__NETWORK,
							oldNetwork, network));
			}
		}
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Network basicGetNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetwork(Network newNetwork, NotificationChain msgs) {
		Network oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.CLUSTER__NETWORK, oldNetwork, newNetwork);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetwork(Network newNetwork) {
		if (newNetwork != network) {
			NotificationChain msgs = null;
			if (network != null)
				msgs = ((InternalEObject) network).eInverseRemove(this, MetamodelPackage.NETWORK__CLUSTER,
						Network.class, msgs);
			if (newNetwork != null)
				msgs = ((InternalEObject) newNetwork).eInverseAdd(this, MetamodelPackage.NETWORK__CLUSTER,
						Network.class, msgs);
			msgs = basicSetNetwork(newNetwork, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.CLUSTER__NETWORK, newNetwork,
					newNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadBalancer getLoadbalancers() {
		if (loadbalancers != null && loadbalancers.eIsProxy()) {
			InternalEObject oldLoadbalancers = (InternalEObject) loadbalancers;
			loadbalancers = (LoadBalancer) eResolveProxy(oldLoadbalancers);
			if (loadbalancers != oldLoadbalancers) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.CLUSTER__LOADBALANCERS,
							oldLoadbalancers, loadbalancers));
			}
		}
		return loadbalancers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadBalancer basicGetLoadbalancers() {
		return loadbalancers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadbalancers(LoadBalancer newLoadbalancers, NotificationChain msgs) {
		LoadBalancer oldLoadbalancers = loadbalancers;
		loadbalancers = newLoadbalancers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.CLUSTER__LOADBALANCERS, oldLoadbalancers, newLoadbalancers);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadbalancers(LoadBalancer newLoadbalancers) {
		if (newLoadbalancers != loadbalancers) {
			NotificationChain msgs = null;
			if (loadbalancers != null)
				msgs = ((InternalEObject) loadbalancers).eInverseRemove(this, MetamodelPackage.LOAD_BALANCER__CLUSTER,
						LoadBalancer.class, msgs);
			if (newLoadbalancers != null)
				msgs = ((InternalEObject) newLoadbalancers).eInverseAdd(this, MetamodelPackage.LOAD_BALANCER__CLUSTER,
						LoadBalancer.class, msgs);
			msgs = basicSetLoadbalancers(newLoadbalancers, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.CLUSTER__LOADBALANCERS,
					newLoadbalancers, newLoadbalancers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getServices() {
		if (services != null && services.eIsProxy()) {
			InternalEObject oldServices = (InternalEObject) services;
			services = (Service) eResolveProxy(oldServices);
			if (services != oldServices) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.CLUSTER__SERVICES,
							oldServices, services));
			}
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetServices() {
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServices(Service newServices, NotificationChain msgs) {
		Service oldServices = services;
		services = newServices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.CLUSTER__SERVICES, oldServices, newServices);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServices(Service newServices) {
		if (newServices != services) {
			NotificationChain msgs = null;
			if (services != null)
				msgs = ((InternalEObject) services).eInverseRemove(this, MetamodelPackage.SERVICE__CLUSTER,
						Service.class, msgs);
			if (newServices != null)
				msgs = ((InternalEObject) newServices).eInverseAdd(this, MetamodelPackage.SERVICE__CLUSTER,
						Service.class, msgs);
			msgs = basicSetServices(newServices, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.CLUSTER__SERVICES, newServices,
					newServices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment getDeployments() {
		if (deployments != null && deployments.eIsProxy()) {
			InternalEObject oldDeployments = (InternalEObject) deployments;
			deployments = (Deployment) eResolveProxy(oldDeployments);
			if (deployments != oldDeployments) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.CLUSTER__DEPLOYMENTS,
							oldDeployments, deployments));
			}
		}
		return deployments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment basicGetDeployments() {
		return deployments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeployments(Deployment newDeployments, NotificationChain msgs) {
		Deployment oldDeployments = deployments;
		deployments = newDeployments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.CLUSTER__DEPLOYMENTS, oldDeployments, newDeployments);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployments(Deployment newDeployments) {
		if (newDeployments != deployments) {
			NotificationChain msgs = null;
			if (deployments != null)
				msgs = ((InternalEObject) deployments).eInverseRemove(this, MetamodelPackage.DEPLOYMENT__CLUSTER,
						Deployment.class, msgs);
			if (newDeployments != null)
				msgs = ((InternalEObject) newDeployments).eInverseAdd(this, MetamodelPackage.DEPLOYMENT__CLUSTER,
						Deployment.class, msgs);
			msgs = basicSetDeployments(newDeployments, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.CLUSTER__DEPLOYMENTS, newDeployments,
					newDeployments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getNodes() {
		if (nodes != null && nodes.eIsProxy()) {
			InternalEObject oldNodes = (InternalEObject) nodes;
			nodes = (Node) eResolveProxy(oldNodes);
			if (nodes != oldNodes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.CLUSTER__NODES, oldNodes,
							nodes));
			}
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetNodes() {
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodes(Node newNodes, NotificationChain msgs) {
		Node oldNodes = nodes;
		nodes = newNodes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.CLUSTER__NODES, oldNodes, newNodes);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodes(Node newNodes) {
		if (newNodes != nodes) {
			NotificationChain msgs = null;
			if (nodes != null)
				msgs = ((InternalEObject) nodes).eInverseRemove(this, MetamodelPackage.NODE__CLUSTER, Node.class, msgs);
			if (newNodes != null)
				msgs = ((InternalEObject) newNodes).eInverseAdd(this, MetamodelPackage.NODE__CLUSTER, Node.class, msgs);
			msgs = basicSetNodes(newNodes, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.CLUSTER__NODES, newNodes, newNodes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region getRegion() {
		if (region != null && region.eIsProxy()) {
			InternalEObject oldRegion = (InternalEObject) region;
			region = (Region) eResolveProxy(oldRegion);
			if (region != oldRegion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.CLUSTER__REGION,
							oldRegion, region));
			}
		}
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region basicGetRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegion(Region newRegion, NotificationChain msgs) {
		Region oldRegion = region;
		region = newRegion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.CLUSTER__REGION, oldRegion, newRegion);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(Region newRegion) {
		if (newRegion != region) {
			NotificationChain msgs = null;
			if (region != null)
				msgs = ((InternalEObject) region).eInverseRemove(this, MetamodelPackage.REGION__CLUSTER, Region.class,
						msgs);
			if (newRegion != null)
				msgs = ((InternalEObject) newRegion).eInverseAdd(this, MetamodelPackage.REGION__CLUSTER, Region.class,
						msgs);
			msgs = basicSetRegion(newRegion, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.CLUSTER__REGION, newRegion,
					newRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNet_conf() {
		return net_conf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNet_conf(boolean newNet_conf) {
		boolean oldNet_conf = net_conf;
		net_conf = newNet_conf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.CLUSTER__NET_CONF, oldNet_conf,
					net_conf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.CLUSTER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrkaModel getOrkamodel() {
		if (orkamodel != null && orkamodel.eIsProxy()) {
			InternalEObject oldOrkamodel = (InternalEObject) orkamodel;
			orkamodel = (OrkaModel) eResolveProxy(oldOrkamodel);
			if (orkamodel != oldOrkamodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.CLUSTER__ORKAMODEL,
							oldOrkamodel, orkamodel));
			}
		}
		return orkamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrkaModel basicGetOrkamodel() {
		return orkamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrkamodel(OrkaModel newOrkamodel, NotificationChain msgs) {
		OrkaModel oldOrkamodel = orkamodel;
		orkamodel = newOrkamodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.CLUSTER__ORKAMODEL, oldOrkamodel, newOrkamodel);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrkamodel(OrkaModel newOrkamodel) {
		if (newOrkamodel != orkamodel) {
			NotificationChain msgs = null;
			if (orkamodel != null)
				msgs = ((InternalEObject) orkamodel).eInverseRemove(this, MetamodelPackage.ORKA_MODEL__CLUSTERS,
						OrkaModel.class, msgs);
			if (newOrkamodel != null)
				msgs = ((InternalEObject) newOrkamodel).eInverseAdd(this, MetamodelPackage.ORKA_MODEL__CLUSTERS,
						OrkaModel.class, msgs);
			msgs = basicSetOrkamodel(newOrkamodel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.CLUSTER__ORKAMODEL, newOrkamodel,
					newOrkamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.CLUSTER__SUBNETWORK:
			if (subnetwork != null)
				msgs = ((InternalEObject) subnetwork).eInverseRemove(this, MetamodelPackage.SUBNETWORK__CLUSTER,
						Subnetwork.class, msgs);
			return basicSetSubnetwork((Subnetwork) otherEnd, msgs);
		case MetamodelPackage.CLUSTER__NETWORK:
			if (network != null)
				msgs = ((InternalEObject) network).eInverseRemove(this, MetamodelPackage.NETWORK__CLUSTER,
						Network.class, msgs);
			return basicSetNetwork((Network) otherEnd, msgs);
		case MetamodelPackage.CLUSTER__LOADBALANCERS:
			if (loadbalancers != null)
				msgs = ((InternalEObject) loadbalancers).eInverseRemove(this, MetamodelPackage.LOAD_BALANCER__CLUSTER,
						LoadBalancer.class, msgs);
			return basicSetLoadbalancers((LoadBalancer) otherEnd, msgs);
		case MetamodelPackage.CLUSTER__SERVICES:
			if (services != null)
				msgs = ((InternalEObject) services).eInverseRemove(this, MetamodelPackage.SERVICE__CLUSTER,
						Service.class, msgs);
			return basicSetServices((Service) otherEnd, msgs);
		case MetamodelPackage.CLUSTER__DEPLOYMENTS:
			if (deployments != null)
				msgs = ((InternalEObject) deployments).eInverseRemove(this, MetamodelPackage.DEPLOYMENT__CLUSTER,
						Deployment.class, msgs);
			return basicSetDeployments((Deployment) otherEnd, msgs);
		case MetamodelPackage.CLUSTER__NODES:
			if (nodes != null)
				msgs = ((InternalEObject) nodes).eInverseRemove(this, MetamodelPackage.NODE__CLUSTER, Node.class, msgs);
			return basicSetNodes((Node) otherEnd, msgs);
		case MetamodelPackage.CLUSTER__REGION:
			if (region != null)
				msgs = ((InternalEObject) region).eInverseRemove(this, MetamodelPackage.REGION__CLUSTER, Region.class,
						msgs);
			return basicSetRegion((Region) otherEnd, msgs);
		case MetamodelPackage.CLUSTER__ORKAMODEL:
			if (orkamodel != null)
				msgs = ((InternalEObject) orkamodel).eInverseRemove(this, MetamodelPackage.ORKA_MODEL__CLUSTERS,
						OrkaModel.class, msgs);
			return basicSetOrkamodel((OrkaModel) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.CLUSTER__SUBNETWORK:
			return basicSetSubnetwork(null, msgs);
		case MetamodelPackage.CLUSTER__NETWORK:
			return basicSetNetwork(null, msgs);
		case MetamodelPackage.CLUSTER__LOADBALANCERS:
			return basicSetLoadbalancers(null, msgs);
		case MetamodelPackage.CLUSTER__SERVICES:
			return basicSetServices(null, msgs);
		case MetamodelPackage.CLUSTER__DEPLOYMENTS:
			return basicSetDeployments(null, msgs);
		case MetamodelPackage.CLUSTER__NODES:
			return basicSetNodes(null, msgs);
		case MetamodelPackage.CLUSTER__REGION:
			return basicSetRegion(null, msgs);
		case MetamodelPackage.CLUSTER__ORKAMODEL:
			return basicSetOrkamodel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.CLUSTER__SUBNETWORK:
			if (resolve)
				return getSubnetwork();
			return basicGetSubnetwork();
		case MetamodelPackage.CLUSTER__NETWORK:
			if (resolve)
				return getNetwork();
			return basicGetNetwork();
		case MetamodelPackage.CLUSTER__LOADBALANCERS:
			if (resolve)
				return getLoadbalancers();
			return basicGetLoadbalancers();
		case MetamodelPackage.CLUSTER__SERVICES:
			if (resolve)
				return getServices();
			return basicGetServices();
		case MetamodelPackage.CLUSTER__DEPLOYMENTS:
			if (resolve)
				return getDeployments();
			return basicGetDeployments();
		case MetamodelPackage.CLUSTER__NODES:
			if (resolve)
				return getNodes();
			return basicGetNodes();
		case MetamodelPackage.CLUSTER__REGION:
			if (resolve)
				return getRegion();
			return basicGetRegion();
		case MetamodelPackage.CLUSTER__NET_CONF:
			return isNet_conf();
		case MetamodelPackage.CLUSTER__NAME:
			return getName();
		case MetamodelPackage.CLUSTER__ORKAMODEL:
			if (resolve)
				return getOrkamodel();
			return basicGetOrkamodel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MetamodelPackage.CLUSTER__SUBNETWORK:
			setSubnetwork((Subnetwork) newValue);
			return;
		case MetamodelPackage.CLUSTER__NETWORK:
			setNetwork((Network) newValue);
			return;
		case MetamodelPackage.CLUSTER__LOADBALANCERS:
			setLoadbalancers((LoadBalancer) newValue);
			return;
		case MetamodelPackage.CLUSTER__SERVICES:
			setServices((Service) newValue);
			return;
		case MetamodelPackage.CLUSTER__DEPLOYMENTS:
			setDeployments((Deployment) newValue);
			return;
		case MetamodelPackage.CLUSTER__NODES:
			setNodes((Node) newValue);
			return;
		case MetamodelPackage.CLUSTER__REGION:
			setRegion((Region) newValue);
			return;
		case MetamodelPackage.CLUSTER__NET_CONF:
			setNet_conf((Boolean) newValue);
			return;
		case MetamodelPackage.CLUSTER__NAME:
			setName((String) newValue);
			return;
		case MetamodelPackage.CLUSTER__ORKAMODEL:
			setOrkamodel((OrkaModel) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MetamodelPackage.CLUSTER__SUBNETWORK:
			setSubnetwork((Subnetwork) null);
			return;
		case MetamodelPackage.CLUSTER__NETWORK:
			setNetwork((Network) null);
			return;
		case MetamodelPackage.CLUSTER__LOADBALANCERS:
			setLoadbalancers((LoadBalancer) null);
			return;
		case MetamodelPackage.CLUSTER__SERVICES:
			setServices((Service) null);
			return;
		case MetamodelPackage.CLUSTER__DEPLOYMENTS:
			setDeployments((Deployment) null);
			return;
		case MetamodelPackage.CLUSTER__NODES:
			setNodes((Node) null);
			return;
		case MetamodelPackage.CLUSTER__REGION:
			setRegion((Region) null);
			return;
		case MetamodelPackage.CLUSTER__NET_CONF:
			setNet_conf(NET_CONF_EDEFAULT);
			return;
		case MetamodelPackage.CLUSTER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MetamodelPackage.CLUSTER__ORKAMODEL:
			setOrkamodel((OrkaModel) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MetamodelPackage.CLUSTER__SUBNETWORK:
			return subnetwork != null;
		case MetamodelPackage.CLUSTER__NETWORK:
			return network != null;
		case MetamodelPackage.CLUSTER__LOADBALANCERS:
			return loadbalancers != null;
		case MetamodelPackage.CLUSTER__SERVICES:
			return services != null;
		case MetamodelPackage.CLUSTER__DEPLOYMENTS:
			return deployments != null;
		case MetamodelPackage.CLUSTER__NODES:
			return nodes != null;
		case MetamodelPackage.CLUSTER__REGION:
			return region != null;
		case MetamodelPackage.CLUSTER__NET_CONF:
			return net_conf != NET_CONF_EDEFAULT;
		case MetamodelPackage.CLUSTER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MetamodelPackage.CLUSTER__ORKAMODEL:
			return orkamodel != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (net_conf: ");
		result.append(net_conf);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ClusterImpl
