/**
 */
package org.orka.orkametamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.orka.orkametamodel.Application;
import org.orka.orkametamodel.Cluster;
import org.orka.orkametamodel.Ingress;
import org.orka.orkametamodel.LoadBalancer;
import org.orka.orkametamodel.MetamodelPackage;
import org.orka.orkametamodel.Protocol;
import org.orka.orkametamodel.SecurityGroup;
import org.orka.orkametamodel.Service;
import org.orka.orkametamodel.ServiceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.orka.orkametamodel.impl.ServiceImpl#getCluster <em>Cluster</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.ServiceImpl#getSecurityGroup <em>Security Group</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.ServiceImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.ServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.ServiceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.ServiceImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.ServiceImpl#getTarget_port <em>Target port</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.ServiceImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.ServiceImpl#getLoadbalancer <em>Loadbalancer</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.ServiceImpl#getIngress <em>Ingress</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends MinimalEObjectImpl.Container implements Service {
	/**
	 * The cached value of the '{@link #getCluster() <em>Cluster</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCluster()
	 * @generated
	 * @ordered
	 */
	protected Cluster cluster;

	/**
	 * The cached value of the '{@link #getSecurityGroup() <em>Security Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityGroup()
	 * @generated
	 * @ordered
	 */
	protected SecurityGroup securityGroup;

	/**
	 * The cached value of the '{@link #getApplication() <em>Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected Application application;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ServiceType TYPE_EDEFAULT = ServiceType.LOAD_BALANCER;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ServiceType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTarget_port() <em>Target port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget_port()
	 * @generated
	 * @ordered
	 */
	protected static final int TARGET_PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTarget_port() <em>Target port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget_port()
	 * @generated
	 * @ordered
	 */
	protected int target_port = TARGET_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final Protocol PROTOCOL_EDEFAULT = Protocol.HTTP;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected Protocol protocol = PROTOCOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLoadbalancer() <em>Loadbalancer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadbalancer()
	 * @generated
	 * @ordered
	 */
	protected LoadBalancer loadbalancer;

	/**
	 * The cached value of the '{@link #getIngress() <em>Ingress</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngress()
	 * @generated
	 * @ordered
	 */
	protected Ingress ingress;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cluster getCluster() {
		if (cluster != null && cluster.eIsProxy()) {
			InternalEObject oldCluster = (InternalEObject) cluster;
			cluster = (Cluster) eResolveProxy(oldCluster);
			if (cluster != oldCluster) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.SERVICE__CLUSTER,
							oldCluster, cluster));
			}
		}
		return cluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cluster basicGetCluster() {
		return cluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCluster(Cluster newCluster, NotificationChain msgs) {
		Cluster oldCluster = cluster;
		cluster = newCluster;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.SERVICE__CLUSTER, oldCluster, newCluster);
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
	public void setCluster(Cluster newCluster) {
		if (newCluster != cluster) {
			NotificationChain msgs = null;
			if (cluster != null)
				msgs = ((InternalEObject) cluster).eInverseRemove(this, MetamodelPackage.CLUSTER__SERVICES,
						Cluster.class, msgs);
			if (newCluster != null)
				msgs = ((InternalEObject) newCluster).eInverseAdd(this, MetamodelPackage.CLUSTER__SERVICES,
						Cluster.class, msgs);
			msgs = basicSetCluster(newCluster, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.SERVICE__CLUSTER, newCluster,
					newCluster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityGroup getSecurityGroup() {
		if (securityGroup != null && securityGroup.eIsProxy()) {
			InternalEObject oldSecurityGroup = (InternalEObject) securityGroup;
			securityGroup = (SecurityGroup) eResolveProxy(oldSecurityGroup);
			if (securityGroup != oldSecurityGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.SERVICE__SECURITY_GROUP,
							oldSecurityGroup, securityGroup));
			}
		}
		return securityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityGroup basicGetSecurityGroup() {
		return securityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityGroup(SecurityGroup newSecurityGroup, NotificationChain msgs) {
		SecurityGroup oldSecurityGroup = securityGroup;
		securityGroup = newSecurityGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.SERVICE__SECURITY_GROUP, oldSecurityGroup, newSecurityGroup);
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
	public void setSecurityGroup(SecurityGroup newSecurityGroup) {
		if (newSecurityGroup != securityGroup) {
			NotificationChain msgs = null;
			if (securityGroup != null)
				msgs = ((InternalEObject) securityGroup).eInverseRemove(this, MetamodelPackage.SECURITY_GROUP__SERVICES,
						SecurityGroup.class, msgs);
			if (newSecurityGroup != null)
				msgs = ((InternalEObject) newSecurityGroup).eInverseAdd(this, MetamodelPackage.SECURITY_GROUP__SERVICES,
						SecurityGroup.class, msgs);
			msgs = basicSetSecurityGroup(newSecurityGroup, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.SERVICE__SECURITY_GROUP,
					newSecurityGroup, newSecurityGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application getApplication() {
		if (application != null && application.eIsProxy()) {
			InternalEObject oldApplication = (InternalEObject) application;
			application = (Application) eResolveProxy(oldApplication);
			if (application != oldApplication) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.SERVICE__APPLICATION,
							oldApplication, application));
			}
		}
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application basicGetApplication() {
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplication(Application newApplication, NotificationChain msgs) {
		Application oldApplication = application;
		application = newApplication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.SERVICE__APPLICATION, oldApplication, newApplication);
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
	public void setApplication(Application newApplication) {
		if (newApplication != application) {
			NotificationChain msgs = null;
			if (application != null)
				msgs = ((InternalEObject) application).eInverseRemove(this, MetamodelPackage.APPLICATION__SERVICES,
						Application.class, msgs);
			if (newApplication != null)
				msgs = ((InternalEObject) newApplication).eInverseAdd(this, MetamodelPackage.APPLICATION__SERVICES,
						Application.class, msgs);
			msgs = basicSetApplication(newApplication, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.SERVICE__APPLICATION, newApplication,
					newApplication));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.SERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ServiceType newType) {
		ServiceType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.SERVICE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.SERVICE__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTarget_port() {
		return target_port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget_port(int newTarget_port) {
		int oldTarget_port = target_port;
		target_port = newTarget_port;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.SERVICE__TARGET_PORT, oldTarget_port,
					target_port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protocol getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(Protocol newProtocol) {
		Protocol oldProtocol = protocol;
		protocol = newProtocol == null ? PROTOCOL_EDEFAULT : newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.SERVICE__PROTOCOL, oldProtocol,
					protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadBalancer getLoadbalancer() {
		if (loadbalancer != null && loadbalancer.eIsProxy()) {
			InternalEObject oldLoadbalancer = (InternalEObject) loadbalancer;
			loadbalancer = (LoadBalancer) eResolveProxy(oldLoadbalancer);
			if (loadbalancer != oldLoadbalancer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.SERVICE__LOADBALANCER,
							oldLoadbalancer, loadbalancer));
			}
		}
		return loadbalancer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadBalancer basicGetLoadbalancer() {
		return loadbalancer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadbalancer(LoadBalancer newLoadbalancer, NotificationChain msgs) {
		LoadBalancer oldLoadbalancer = loadbalancer;
		loadbalancer = newLoadbalancer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.SERVICE__LOADBALANCER, oldLoadbalancer, newLoadbalancer);
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
	public void setLoadbalancer(LoadBalancer newLoadbalancer) {
		if (newLoadbalancer != loadbalancer) {
			NotificationChain msgs = null;
			if (loadbalancer != null)
				msgs = ((InternalEObject) loadbalancer).eInverseRemove(this, MetamodelPackage.LOAD_BALANCER__SERVICES,
						LoadBalancer.class, msgs);
			if (newLoadbalancer != null)
				msgs = ((InternalEObject) newLoadbalancer).eInverseAdd(this, MetamodelPackage.LOAD_BALANCER__SERVICES,
						LoadBalancer.class, msgs);
			msgs = basicSetLoadbalancer(newLoadbalancer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.SERVICE__LOADBALANCER,
					newLoadbalancer, newLoadbalancer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ingress getIngress() {
		if (ingress != null && ingress.eIsProxy()) {
			InternalEObject oldIngress = (InternalEObject) ingress;
			ingress = (Ingress) eResolveProxy(oldIngress);
			if (ingress != oldIngress) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.SERVICE__INGRESS,
							oldIngress, ingress));
			}
		}
		return ingress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ingress basicGetIngress() {
		return ingress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIngress(Ingress newIngress, NotificationChain msgs) {
		Ingress oldIngress = ingress;
		ingress = newIngress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.SERVICE__INGRESS, oldIngress, newIngress);
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
	public void setIngress(Ingress newIngress) {
		if (newIngress != ingress) {
			NotificationChain msgs = null;
			if (ingress != null)
				msgs = ((InternalEObject) ingress).eInverseRemove(this, MetamodelPackage.INGRESS__SERVICE,
						Ingress.class, msgs);
			if (newIngress != null)
				msgs = ((InternalEObject) newIngress).eInverseAdd(this, MetamodelPackage.INGRESS__SERVICE,
						Ingress.class, msgs);
			msgs = basicSetIngress(newIngress, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.SERVICE__INGRESS, newIngress,
					newIngress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.SERVICE__CLUSTER:
			if (cluster != null)
				msgs = ((InternalEObject) cluster).eInverseRemove(this, MetamodelPackage.CLUSTER__SERVICES,
						Cluster.class, msgs);
			return basicSetCluster((Cluster) otherEnd, msgs);
		case MetamodelPackage.SERVICE__SECURITY_GROUP:
			if (securityGroup != null)
				msgs = ((InternalEObject) securityGroup).eInverseRemove(this, MetamodelPackage.SECURITY_GROUP__SERVICES,
						SecurityGroup.class, msgs);
			return basicSetSecurityGroup((SecurityGroup) otherEnd, msgs);
		case MetamodelPackage.SERVICE__APPLICATION:
			if (application != null)
				msgs = ((InternalEObject) application).eInverseRemove(this, MetamodelPackage.APPLICATION__SERVICES,
						Application.class, msgs);
			return basicSetApplication((Application) otherEnd, msgs);
		case MetamodelPackage.SERVICE__LOADBALANCER:
			if (loadbalancer != null)
				msgs = ((InternalEObject) loadbalancer).eInverseRemove(this, MetamodelPackage.LOAD_BALANCER__SERVICES,
						LoadBalancer.class, msgs);
			return basicSetLoadbalancer((LoadBalancer) otherEnd, msgs);
		case MetamodelPackage.SERVICE__INGRESS:
			if (ingress != null)
				msgs = ((InternalEObject) ingress).eInverseRemove(this, MetamodelPackage.INGRESS__SERVICE,
						Ingress.class, msgs);
			return basicSetIngress((Ingress) otherEnd, msgs);
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
		case MetamodelPackage.SERVICE__CLUSTER:
			return basicSetCluster(null, msgs);
		case MetamodelPackage.SERVICE__SECURITY_GROUP:
			return basicSetSecurityGroup(null, msgs);
		case MetamodelPackage.SERVICE__APPLICATION:
			return basicSetApplication(null, msgs);
		case MetamodelPackage.SERVICE__LOADBALANCER:
			return basicSetLoadbalancer(null, msgs);
		case MetamodelPackage.SERVICE__INGRESS:
			return basicSetIngress(null, msgs);
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
		case MetamodelPackage.SERVICE__CLUSTER:
			if (resolve)
				return getCluster();
			return basicGetCluster();
		case MetamodelPackage.SERVICE__SECURITY_GROUP:
			if (resolve)
				return getSecurityGroup();
			return basicGetSecurityGroup();
		case MetamodelPackage.SERVICE__APPLICATION:
			if (resolve)
				return getApplication();
			return basicGetApplication();
		case MetamodelPackage.SERVICE__NAME:
			return getName();
		case MetamodelPackage.SERVICE__TYPE:
			return getType();
		case MetamodelPackage.SERVICE__PORT:
			return getPort();
		case MetamodelPackage.SERVICE__TARGET_PORT:
			return getTarget_port();
		case MetamodelPackage.SERVICE__PROTOCOL:
			return getProtocol();
		case MetamodelPackage.SERVICE__LOADBALANCER:
			if (resolve)
				return getLoadbalancer();
			return basicGetLoadbalancer();
		case MetamodelPackage.SERVICE__INGRESS:
			if (resolve)
				return getIngress();
			return basicGetIngress();
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
		case MetamodelPackage.SERVICE__CLUSTER:
			setCluster((Cluster) newValue);
			return;
		case MetamodelPackage.SERVICE__SECURITY_GROUP:
			setSecurityGroup((SecurityGroup) newValue);
			return;
		case MetamodelPackage.SERVICE__APPLICATION:
			setApplication((Application) newValue);
			return;
		case MetamodelPackage.SERVICE__NAME:
			setName((String) newValue);
			return;
		case MetamodelPackage.SERVICE__TYPE:
			setType((ServiceType) newValue);
			return;
		case MetamodelPackage.SERVICE__PORT:
			setPort((Integer) newValue);
			return;
		case MetamodelPackage.SERVICE__TARGET_PORT:
			setTarget_port((Integer) newValue);
			return;
		case MetamodelPackage.SERVICE__PROTOCOL:
			setProtocol((Protocol) newValue);
			return;
		case MetamodelPackage.SERVICE__LOADBALANCER:
			setLoadbalancer((LoadBalancer) newValue);
			return;
		case MetamodelPackage.SERVICE__INGRESS:
			setIngress((Ingress) newValue);
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
		case MetamodelPackage.SERVICE__CLUSTER:
			setCluster((Cluster) null);
			return;
		case MetamodelPackage.SERVICE__SECURITY_GROUP:
			setSecurityGroup((SecurityGroup) null);
			return;
		case MetamodelPackage.SERVICE__APPLICATION:
			setApplication((Application) null);
			return;
		case MetamodelPackage.SERVICE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MetamodelPackage.SERVICE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case MetamodelPackage.SERVICE__PORT:
			setPort(PORT_EDEFAULT);
			return;
		case MetamodelPackage.SERVICE__TARGET_PORT:
			setTarget_port(TARGET_PORT_EDEFAULT);
			return;
		case MetamodelPackage.SERVICE__PROTOCOL:
			setProtocol(PROTOCOL_EDEFAULT);
			return;
		case MetamodelPackage.SERVICE__LOADBALANCER:
			setLoadbalancer((LoadBalancer) null);
			return;
		case MetamodelPackage.SERVICE__INGRESS:
			setIngress((Ingress) null);
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
		case MetamodelPackage.SERVICE__CLUSTER:
			return cluster != null;
		case MetamodelPackage.SERVICE__SECURITY_GROUP:
			return securityGroup != null;
		case MetamodelPackage.SERVICE__APPLICATION:
			return application != null;
		case MetamodelPackage.SERVICE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MetamodelPackage.SERVICE__TYPE:
			return type != TYPE_EDEFAULT;
		case MetamodelPackage.SERVICE__PORT:
			return port != PORT_EDEFAULT;
		case MetamodelPackage.SERVICE__TARGET_PORT:
			return target_port != TARGET_PORT_EDEFAULT;
		case MetamodelPackage.SERVICE__PROTOCOL:
			return protocol != PROTOCOL_EDEFAULT;
		case MetamodelPackage.SERVICE__LOADBALANCER:
			return loadbalancer != null;
		case MetamodelPackage.SERVICE__INGRESS:
			return ingress != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", port: ");
		result.append(port);
		result.append(", target_port: ");
		result.append(target_port);
		result.append(", protocol: ");
		result.append(protocol);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
