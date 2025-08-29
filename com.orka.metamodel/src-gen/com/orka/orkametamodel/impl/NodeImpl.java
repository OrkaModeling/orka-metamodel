/**
 */
package com.orka.orkametamodel.impl;

import com.orka.orkametamodel.Cluster;
import com.orka.orkametamodel.MetamodelPackage;
import com.orka.orkametamodel.Node;
import com.orka.orkametamodel.Processor;
import com.orka.orkametamodel.Resources;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.orka.orkametamodel.impl.NodeImpl#getCluster <em>Cluster</em>}</li>
 *   <li>{@link com.orka.orkametamodel.impl.NodeImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link com.orka.orkametamodel.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.orka.orkametamodel.impl.NodeImpl#getHostname <em>Hostname</em>}</li>
 *   <li>{@link com.orka.orkametamodel.impl.NodeImpl#getPublic_ip <em>Public ip</em>}</li>
 *   <li>{@link com.orka.orkametamodel.impl.NodeImpl#getPrivate_ip <em>Private ip</em>}</li>
 *   <li>{@link com.orka.orkametamodel.impl.NodeImpl#getOs <em>Os</em>}</li>
 *   <li>{@link com.orka.orkametamodel.impl.NodeImpl#getStorage <em>Storage</em>}</li>
 *   <li>{@link com.orka.orkametamodel.impl.NodeImpl#getProcessor <em>Processor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends MinimalEObjectImpl.Container implements Node {
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
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resources> resources;

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
	 * The default value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostname()
	 * @generated
	 * @ordered
	 */
	protected static final String HOSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostname()
	 * @generated
	 * @ordered
	 */
	protected String hostname = HOSTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublic_ip() <em>Public ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublic_ip()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLIC_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublic_ip() <em>Public ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublic_ip()
	 * @generated
	 * @ordered
	 */
	protected String public_ip = PUBLIC_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivate_ip() <em>Private ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivate_ip()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVATE_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivate_ip() <em>Private ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivate_ip()
	 * @generated
	 * @ordered
	 */
	protected String private_ip = PRIVATE_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getOs() <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOs() <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected String os = OS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStorage() <em>Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorage()
	 * @generated
	 * @ordered
	 */
	protected static final int STORAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStorage() <em>Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorage()
	 * @generated
	 * @ordered
	 */
	protected int storage = STORAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessor() <em>Processor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessor()
	 * @generated
	 * @ordered
	 */
	protected static final Processor PROCESSOR_EDEFAULT = Processor.X64;

	/**
	 * The cached value of the '{@link #getProcessor() <em>Processor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessor()
	 * @generated
	 * @ordered
	 */
	protected Processor processor = PROCESSOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.NODE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.NODE__CLUSTER,
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
					MetamodelPackage.NODE__CLUSTER, oldCluster, newCluster);
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
				msgs = ((InternalEObject) cluster).eInverseRemove(this, MetamodelPackage.CLUSTER__NODES, Cluster.class,
						msgs);
			if (newCluster != null)
				msgs = ((InternalEObject) newCluster).eInverseAdd(this, MetamodelPackage.CLUSTER__NODES, Cluster.class,
						msgs);
			msgs = basicSetCluster(newCluster, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.NODE__CLUSTER, newCluster,
					newCluster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resources> getResources() {
		if (resources == null) {
			resources = new EObjectWithInverseResolvingEList<Resources>(Resources.class, this,
					MetamodelPackage.NODE__RESOURCES, MetamodelPackage.RESOURCES__NODE);
		}
		return resources;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHostname() {
		return hostname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostname(String newHostname) {
		String oldHostname = hostname;
		hostname = newHostname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.NODE__HOSTNAME, oldHostname,
					hostname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublic_ip() {
		return public_ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublic_ip(String newPublic_ip) {
		String oldPublic_ip = public_ip;
		public_ip = newPublic_ip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.NODE__PUBLIC_IP, oldPublic_ip,
					public_ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrivate_ip() {
		return private_ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivate_ip(String newPrivate_ip) {
		String oldPrivate_ip = private_ip;
		private_ip = newPrivate_ip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.NODE__PRIVATE_IP, oldPrivate_ip,
					private_ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOs() {
		return os;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOs(String newOs) {
		String oldOs = os;
		os = newOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.NODE__OS, oldOs, os));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStorage() {
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorage(int newStorage) {
		int oldStorage = storage;
		storage = newStorage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.NODE__STORAGE, oldStorage, storage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processor getProcessor() {
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessor(Processor newProcessor) {
		Processor oldProcessor = processor;
		processor = newProcessor == null ? PROCESSOR_EDEFAULT : newProcessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.NODE__PROCESSOR, oldProcessor,
					processor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.NODE__CLUSTER:
			if (cluster != null)
				msgs = ((InternalEObject) cluster).eInverseRemove(this, MetamodelPackage.CLUSTER__NODES, Cluster.class,
						msgs);
			return basicSetCluster((Cluster) otherEnd, msgs);
		case MetamodelPackage.NODE__RESOURCES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getResources()).basicAdd(otherEnd, msgs);
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
		case MetamodelPackage.NODE__CLUSTER:
			return basicSetCluster(null, msgs);
		case MetamodelPackage.NODE__RESOURCES:
			return ((InternalEList<?>) getResources()).basicRemove(otherEnd, msgs);
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
		case MetamodelPackage.NODE__CLUSTER:
			if (resolve)
				return getCluster();
			return basicGetCluster();
		case MetamodelPackage.NODE__RESOURCES:
			return getResources();
		case MetamodelPackage.NODE__NAME:
			return getName();
		case MetamodelPackage.NODE__HOSTNAME:
			return getHostname();
		case MetamodelPackage.NODE__PUBLIC_IP:
			return getPublic_ip();
		case MetamodelPackage.NODE__PRIVATE_IP:
			return getPrivate_ip();
		case MetamodelPackage.NODE__OS:
			return getOs();
		case MetamodelPackage.NODE__STORAGE:
			return getStorage();
		case MetamodelPackage.NODE__PROCESSOR:
			return getProcessor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MetamodelPackage.NODE__CLUSTER:
			setCluster((Cluster) newValue);
			return;
		case MetamodelPackage.NODE__RESOURCES:
			getResources().clear();
			getResources().addAll((Collection<? extends Resources>) newValue);
			return;
		case MetamodelPackage.NODE__NAME:
			setName((String) newValue);
			return;
		case MetamodelPackage.NODE__HOSTNAME:
			setHostname((String) newValue);
			return;
		case MetamodelPackage.NODE__PUBLIC_IP:
			setPublic_ip((String) newValue);
			return;
		case MetamodelPackage.NODE__PRIVATE_IP:
			setPrivate_ip((String) newValue);
			return;
		case MetamodelPackage.NODE__OS:
			setOs((String) newValue);
			return;
		case MetamodelPackage.NODE__STORAGE:
			setStorage((Integer) newValue);
			return;
		case MetamodelPackage.NODE__PROCESSOR:
			setProcessor((Processor) newValue);
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
		case MetamodelPackage.NODE__CLUSTER:
			setCluster((Cluster) null);
			return;
		case MetamodelPackage.NODE__RESOURCES:
			getResources().clear();
			return;
		case MetamodelPackage.NODE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MetamodelPackage.NODE__HOSTNAME:
			setHostname(HOSTNAME_EDEFAULT);
			return;
		case MetamodelPackage.NODE__PUBLIC_IP:
			setPublic_ip(PUBLIC_IP_EDEFAULT);
			return;
		case MetamodelPackage.NODE__PRIVATE_IP:
			setPrivate_ip(PRIVATE_IP_EDEFAULT);
			return;
		case MetamodelPackage.NODE__OS:
			setOs(OS_EDEFAULT);
			return;
		case MetamodelPackage.NODE__STORAGE:
			setStorage(STORAGE_EDEFAULT);
			return;
		case MetamodelPackage.NODE__PROCESSOR:
			setProcessor(PROCESSOR_EDEFAULT);
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
		case MetamodelPackage.NODE__CLUSTER:
			return cluster != null;
		case MetamodelPackage.NODE__RESOURCES:
			return resources != null && !resources.isEmpty();
		case MetamodelPackage.NODE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MetamodelPackage.NODE__HOSTNAME:
			return HOSTNAME_EDEFAULT == null ? hostname != null : !HOSTNAME_EDEFAULT.equals(hostname);
		case MetamodelPackage.NODE__PUBLIC_IP:
			return PUBLIC_IP_EDEFAULT == null ? public_ip != null : !PUBLIC_IP_EDEFAULT.equals(public_ip);
		case MetamodelPackage.NODE__PRIVATE_IP:
			return PRIVATE_IP_EDEFAULT == null ? private_ip != null : !PRIVATE_IP_EDEFAULT.equals(private_ip);
		case MetamodelPackage.NODE__OS:
			return OS_EDEFAULT == null ? os != null : !OS_EDEFAULT.equals(os);
		case MetamodelPackage.NODE__STORAGE:
			return storage != STORAGE_EDEFAULT;
		case MetamodelPackage.NODE__PROCESSOR:
			return processor != PROCESSOR_EDEFAULT;
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
		result.append(", hostname: ");
		result.append(hostname);
		result.append(", public_ip: ");
		result.append(public_ip);
		result.append(", private_ip: ");
		result.append(private_ip);
		result.append(", os: ");
		result.append(os);
		result.append(", storage: ");
		result.append(storage);
		result.append(", processor: ");
		result.append(processor);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
