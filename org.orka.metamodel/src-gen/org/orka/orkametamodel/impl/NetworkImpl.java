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
import org.orka.orkametamodel.MetamodelPackage;
import org.orka.orkametamodel.Network;
import org.orka.orkametamodel.SecurityGroup;
import org.orka.orkametamodel.Subnetwork;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.orka.orkametamodel.impl.NetworkImpl#getSubnetwork <em>Subnetwork</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.NetworkImpl#getSecuritygroups <em>Securitygroups</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.NetworkImpl#getCluster <em>Cluster</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.NetworkImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkImpl extends MinimalEObjectImpl.Container implements Network {
	/**
	 * The cached value of the '{@link #getSubnetwork() <em>Subnetwork</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetwork()
	 * @generated
	 * @ordered
	 */
	protected EList<Subnetwork> subnetwork;

	/**
	 * The cached value of the '{@link #getSecuritygroups() <em>Securitygroups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritygroups()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityGroup> securitygroups;

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
	protected NetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subnetwork> getSubnetwork() {
		if (subnetwork == null) {
			subnetwork = new EObjectWithInverseResolvingEList<Subnetwork>(Subnetwork.class, this,
					MetamodelPackage.NETWORK__SUBNETWORK, MetamodelPackage.SUBNETWORK__NETWORK);
		}
		return subnetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityGroup> getSecuritygroups() {
		if (securitygroups == null) {
			securitygroups = new EObjectWithInverseResolvingEList<SecurityGroup>(SecurityGroup.class, this,
					MetamodelPackage.NETWORK__SECURITYGROUPS, MetamodelPackage.SECURITY_GROUP__NETWORK);
		}
		return securitygroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cluster> getCluster() {
		if (cluster == null) {
			cluster = new EObjectWithInverseResolvingEList<Cluster>(Cluster.class, this,
					MetamodelPackage.NETWORK__CLUSTER, MetamodelPackage.CLUSTER__NETWORK);
		}
		return cluster;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.NETWORK__NAME, oldName, name));
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
		case MetamodelPackage.NETWORK__SUBNETWORK:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubnetwork()).basicAdd(otherEnd, msgs);
		case MetamodelPackage.NETWORK__SECURITYGROUPS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSecuritygroups()).basicAdd(otherEnd, msgs);
		case MetamodelPackage.NETWORK__CLUSTER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCluster()).basicAdd(otherEnd, msgs);
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
		case MetamodelPackage.NETWORK__SUBNETWORK:
			return ((InternalEList<?>) getSubnetwork()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.NETWORK__SECURITYGROUPS:
			return ((InternalEList<?>) getSecuritygroups()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.NETWORK__CLUSTER:
			return ((InternalEList<?>) getCluster()).basicRemove(otherEnd, msgs);
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
		case MetamodelPackage.NETWORK__SUBNETWORK:
			return getSubnetwork();
		case MetamodelPackage.NETWORK__SECURITYGROUPS:
			return getSecuritygroups();
		case MetamodelPackage.NETWORK__CLUSTER:
			return getCluster();
		case MetamodelPackage.NETWORK__NAME:
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
		case MetamodelPackage.NETWORK__SUBNETWORK:
			getSubnetwork().clear();
			getSubnetwork().addAll((Collection<? extends Subnetwork>) newValue);
			return;
		case MetamodelPackage.NETWORK__SECURITYGROUPS:
			getSecuritygroups().clear();
			getSecuritygroups().addAll((Collection<? extends SecurityGroup>) newValue);
			return;
		case MetamodelPackage.NETWORK__CLUSTER:
			getCluster().clear();
			getCluster().addAll((Collection<? extends Cluster>) newValue);
			return;
		case MetamodelPackage.NETWORK__NAME:
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
		case MetamodelPackage.NETWORK__SUBNETWORK:
			getSubnetwork().clear();
			return;
		case MetamodelPackage.NETWORK__SECURITYGROUPS:
			getSecuritygroups().clear();
			return;
		case MetamodelPackage.NETWORK__CLUSTER:
			getCluster().clear();
			return;
		case MetamodelPackage.NETWORK__NAME:
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
		case MetamodelPackage.NETWORK__SUBNETWORK:
			return subnetwork != null && !subnetwork.isEmpty();
		case MetamodelPackage.NETWORK__SECURITYGROUPS:
			return securitygroups != null && !securitygroups.isEmpty();
		case MetamodelPackage.NETWORK__CLUSTER:
			return cluster != null && !cluster.isEmpty();
		case MetamodelPackage.NETWORK__NAME:
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

} //NetworkImpl
