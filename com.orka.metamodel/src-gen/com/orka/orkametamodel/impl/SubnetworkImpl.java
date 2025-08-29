/**
 */
package com.orka.orkametamodel.impl;

import com.orka.orkametamodel.Cluster;
import com.orka.orkametamodel.IPRange;
import com.orka.orkametamodel.MetamodelPackage;
import com.orka.orkametamodel.Network;
import com.orka.orkametamodel.Subnetwork;

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
 * An implementation of the model object '<em><b>Subnetwork</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.orka.orkametamodel.impl.SubnetworkImpl#getCluster <em>Cluster</em>}</li>
 *   <li>{@link com.orka.orkametamodel.impl.SubnetworkImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link com.orka.orkametamodel.impl.SubnetworkImpl#getIprange <em>Iprange</em>}</li>
 *   <li>{@link com.orka.orkametamodel.impl.SubnetworkImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubnetworkImpl extends MinimalEObjectImpl.Container implements Subnetwork {
	/**
	 * The cached value of the '{@link #getCluster() <em>Cluster</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCluster()
	 * @generated
	 * @ordered
	 */
	protected EList<Cluster> cluster;

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
	 * The cached value of the '{@link #getIprange() <em>Iprange</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIprange()
	 * @generated
	 * @ordered
	 */
	protected EList<IPRange> iprange;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubnetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.SUBNETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cluster> getCluster() {
		if (cluster == null) {
			cluster = new EObjectWithInverseResolvingEList<Cluster>(Cluster.class, this,
					MetamodelPackage.SUBNETWORK__CLUSTER, MetamodelPackage.CLUSTER__SUBNETWORK);
		}
		return cluster;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.SUBNETWORK__NETWORK,
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
					MetamodelPackage.SUBNETWORK__NETWORK, oldNetwork, newNetwork);
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
				msgs = ((InternalEObject) network).eInverseRemove(this, MetamodelPackage.NETWORK__SUBNETWORK,
						Network.class, msgs);
			if (newNetwork != null)
				msgs = ((InternalEObject) newNetwork).eInverseAdd(this, MetamodelPackage.NETWORK__SUBNETWORK,
						Network.class, msgs);
			msgs = basicSetNetwork(newNetwork, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.SUBNETWORK__NETWORK, newNetwork,
					newNetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IPRange> getIprange() {
		if (iprange == null) {
			iprange = new EObjectWithInverseResolvingEList<IPRange>(IPRange.class, this,
					MetamodelPackage.SUBNETWORK__IPRANGE, MetamodelPackage.IP_RANGE__SUBNETWORK);
		}
		return iprange;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.SUBNETWORK__NAME, oldName, name));
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
		case MetamodelPackage.SUBNETWORK__CLUSTER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCluster()).basicAdd(otherEnd, msgs);
		case MetamodelPackage.SUBNETWORK__NETWORK:
			if (network != null)
				msgs = ((InternalEObject) network).eInverseRemove(this, MetamodelPackage.NETWORK__SUBNETWORK,
						Network.class, msgs);
			return basicSetNetwork((Network) otherEnd, msgs);
		case MetamodelPackage.SUBNETWORK__IPRANGE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIprange()).basicAdd(otherEnd, msgs);
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
		case MetamodelPackage.SUBNETWORK__CLUSTER:
			return ((InternalEList<?>) getCluster()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.SUBNETWORK__NETWORK:
			return basicSetNetwork(null, msgs);
		case MetamodelPackage.SUBNETWORK__IPRANGE:
			return ((InternalEList<?>) getIprange()).basicRemove(otherEnd, msgs);
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
		case MetamodelPackage.SUBNETWORK__CLUSTER:
			return getCluster();
		case MetamodelPackage.SUBNETWORK__NETWORK:
			if (resolve)
				return getNetwork();
			return basicGetNetwork();
		case MetamodelPackage.SUBNETWORK__IPRANGE:
			return getIprange();
		case MetamodelPackage.SUBNETWORK__NAME:
			return getName();
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
		case MetamodelPackage.SUBNETWORK__CLUSTER:
			getCluster().clear();
			getCluster().addAll((Collection<? extends Cluster>) newValue);
			return;
		case MetamodelPackage.SUBNETWORK__NETWORK:
			setNetwork((Network) newValue);
			return;
		case MetamodelPackage.SUBNETWORK__IPRANGE:
			getIprange().clear();
			getIprange().addAll((Collection<? extends IPRange>) newValue);
			return;
		case MetamodelPackage.SUBNETWORK__NAME:
			setName((String) newValue);
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
		case MetamodelPackage.SUBNETWORK__CLUSTER:
			getCluster().clear();
			return;
		case MetamodelPackage.SUBNETWORK__NETWORK:
			setNetwork((Network) null);
			return;
		case MetamodelPackage.SUBNETWORK__IPRANGE:
			getIprange().clear();
			return;
		case MetamodelPackage.SUBNETWORK__NAME:
			setName(NAME_EDEFAULT);
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
		case MetamodelPackage.SUBNETWORK__CLUSTER:
			return cluster != null && !cluster.isEmpty();
		case MetamodelPackage.SUBNETWORK__NETWORK:
			return network != null;
		case MetamodelPackage.SUBNETWORK__IPRANGE:
			return iprange != null && !iprange.isEmpty();
		case MetamodelPackage.SUBNETWORK__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(')');
		return result.toString();
	}

} //SubnetworkImpl
