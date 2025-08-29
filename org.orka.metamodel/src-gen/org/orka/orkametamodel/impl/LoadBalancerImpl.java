/**
 */
package org.orka.orkametamodel.impl;

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

import org.orka.orkametamodel.Cluster;
import org.orka.orkametamodel.LoadBalancer;
import org.orka.orkametamodel.LoadBalancerType;
import org.orka.orkametamodel.MetamodelPackage;
import org.orka.orkametamodel.Service;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Balancer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.orka.orkametamodel.impl.LoadBalancerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.LoadBalancerImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.LoadBalancerImpl#getCluster <em>Cluster</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.LoadBalancerImpl#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadBalancerImpl extends MinimalEObjectImpl.Container implements LoadBalancer {
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
	protected static final LoadBalancerType TYPE_EDEFAULT = LoadBalancerType.INTERNAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected LoadBalancerType type = TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getServices() <em>Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadBalancerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.LOAD_BALANCER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.LOAD_BALANCER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadBalancerType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(LoadBalancerType newType) {
		LoadBalancerType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.LOAD_BALANCER__TYPE, oldType, type));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.LOAD_BALANCER__CLUSTER,
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
					MetamodelPackage.LOAD_BALANCER__CLUSTER, oldCluster, newCluster);
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
				msgs = ((InternalEObject) cluster).eInverseRemove(this, MetamodelPackage.CLUSTER__LOADBALANCERS,
						Cluster.class, msgs);
			if (newCluster != null)
				msgs = ((InternalEObject) newCluster).eInverseAdd(this, MetamodelPackage.CLUSTER__LOADBALANCERS,
						Cluster.class, msgs);
			msgs = basicSetCluster(newCluster, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.LOAD_BALANCER__CLUSTER, newCluster,
					newCluster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectWithInverseResolvingEList<Service>(Service.class, this,
					MetamodelPackage.LOAD_BALANCER__SERVICES, MetamodelPackage.SERVICE__LOADBALANCER);
		}
		return services;
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
		case MetamodelPackage.LOAD_BALANCER__CLUSTER:
			if (cluster != null)
				msgs = ((InternalEObject) cluster).eInverseRemove(this, MetamodelPackage.CLUSTER__LOADBALANCERS,
						Cluster.class, msgs);
			return basicSetCluster((Cluster) otherEnd, msgs);
		case MetamodelPackage.LOAD_BALANCER__SERVICES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getServices()).basicAdd(otherEnd, msgs);
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
		case MetamodelPackage.LOAD_BALANCER__CLUSTER:
			return basicSetCluster(null, msgs);
		case MetamodelPackage.LOAD_BALANCER__SERVICES:
			return ((InternalEList<?>) getServices()).basicRemove(otherEnd, msgs);
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
		case MetamodelPackage.LOAD_BALANCER__NAME:
			return getName();
		case MetamodelPackage.LOAD_BALANCER__TYPE:
			return getType();
		case MetamodelPackage.LOAD_BALANCER__CLUSTER:
			if (resolve)
				return getCluster();
			return basicGetCluster();
		case MetamodelPackage.LOAD_BALANCER__SERVICES:
			return getServices();
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
		case MetamodelPackage.LOAD_BALANCER__NAME:
			setName((String) newValue);
			return;
		case MetamodelPackage.LOAD_BALANCER__TYPE:
			setType((LoadBalancerType) newValue);
			return;
		case MetamodelPackage.LOAD_BALANCER__CLUSTER:
			setCluster((Cluster) newValue);
			return;
		case MetamodelPackage.LOAD_BALANCER__SERVICES:
			getServices().clear();
			getServices().addAll((Collection<? extends Service>) newValue);
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
		case MetamodelPackage.LOAD_BALANCER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MetamodelPackage.LOAD_BALANCER__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case MetamodelPackage.LOAD_BALANCER__CLUSTER:
			setCluster((Cluster) null);
			return;
		case MetamodelPackage.LOAD_BALANCER__SERVICES:
			getServices().clear();
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
		case MetamodelPackage.LOAD_BALANCER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MetamodelPackage.LOAD_BALANCER__TYPE:
			return type != TYPE_EDEFAULT;
		case MetamodelPackage.LOAD_BALANCER__CLUSTER:
			return cluster != null;
		case MetamodelPackage.LOAD_BALANCER__SERVICES:
			return services != null && !services.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //LoadBalancerImpl
