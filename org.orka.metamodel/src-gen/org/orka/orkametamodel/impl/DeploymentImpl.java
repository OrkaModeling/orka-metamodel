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
import org.orka.orkametamodel.Deployment;
import org.orka.orkametamodel.MetamodelPackage;
import org.orka.orkametamodel.ScalingPolicy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.orka.orkametamodel.impl.DeploymentImpl#getCluster <em>Cluster</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.DeploymentImpl#getReplicas <em>Replicas</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.DeploymentImpl#getContainers <em>Containers</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.DeploymentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.DeploymentImpl#getScalingpolicy <em>Scalingpolicy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentImpl extends MinimalEObjectImpl.Container implements Deployment {
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
	 * The default value of the '{@link #getReplicas() <em>Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicas()
	 * @generated
	 * @ordered
	 */
	protected static final int REPLICAS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getReplicas() <em>Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicas()
	 * @generated
	 * @ordered
	 */
	protected int replicas = REPLICAS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContainers() <em>Containers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<org.orka.orkametamodel.Container> containers;

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
	 * The cached value of the '{@link #getScalingpolicy() <em>Scalingpolicy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalingpolicy()
	 * @generated
	 * @ordered
	 */
	protected ScalingPolicy scalingpolicy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.DEPLOYMENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.DEPLOYMENT__CLUSTER,
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
					MetamodelPackage.DEPLOYMENT__CLUSTER, oldCluster, newCluster);
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
				msgs = ((InternalEObject) cluster).eInverseRemove(this, MetamodelPackage.CLUSTER__DEPLOYMENTS,
						Cluster.class, msgs);
			if (newCluster != null)
				msgs = ((InternalEObject) newCluster).eInverseAdd(this, MetamodelPackage.CLUSTER__DEPLOYMENTS,
						Cluster.class, msgs);
			msgs = basicSetCluster(newCluster, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.DEPLOYMENT__CLUSTER, newCluster,
					newCluster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getReplicas() {
		return replicas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplicas(int newReplicas) {
		int oldReplicas = replicas;
		replicas = newReplicas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.DEPLOYMENT__REPLICAS, oldReplicas,
					replicas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.orka.orkametamodel.Container> getContainers() {
		if (containers == null) {
			containers = new EObjectWithInverseResolvingEList<org.orka.orkametamodel.Container>(
					org.orka.orkametamodel.Container.class, this, MetamodelPackage.DEPLOYMENT__CONTAINERS,
					MetamodelPackage.CONTAINER__DEPLOYMENT);
		}
		return containers;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.DEPLOYMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalingPolicy getScalingpolicy() {
		if (scalingpolicy != null && scalingpolicy.eIsProxy()) {
			InternalEObject oldScalingpolicy = (InternalEObject) scalingpolicy;
			scalingpolicy = (ScalingPolicy) eResolveProxy(oldScalingpolicy);
			if (scalingpolicy != oldScalingpolicy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetamodelPackage.DEPLOYMENT__SCALINGPOLICY, oldScalingpolicy, scalingpolicy));
			}
		}
		return scalingpolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScalingPolicy basicGetScalingpolicy() {
		return scalingpolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScalingpolicy(ScalingPolicy newScalingpolicy, NotificationChain msgs) {
		ScalingPolicy oldScalingpolicy = scalingpolicy;
		scalingpolicy = newScalingpolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.DEPLOYMENT__SCALINGPOLICY, oldScalingpolicy, newScalingpolicy);
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
	public void setScalingpolicy(ScalingPolicy newScalingpolicy) {
		if (newScalingpolicy != scalingpolicy) {
			NotificationChain msgs = null;
			if (scalingpolicy != null)
				msgs = ((InternalEObject) scalingpolicy).eInverseRemove(this,
						MetamodelPackage.SCALING_POLICY__DEPLOYMENT, ScalingPolicy.class, msgs);
			if (newScalingpolicy != null)
				msgs = ((InternalEObject) newScalingpolicy).eInverseAdd(this,
						MetamodelPackage.SCALING_POLICY__DEPLOYMENT, ScalingPolicy.class, msgs);
			msgs = basicSetScalingpolicy(newScalingpolicy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.DEPLOYMENT__SCALINGPOLICY,
					newScalingpolicy, newScalingpolicy));
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
		case MetamodelPackage.DEPLOYMENT__CLUSTER:
			if (cluster != null)
				msgs = ((InternalEObject) cluster).eInverseRemove(this, MetamodelPackage.CLUSTER__DEPLOYMENTS,
						Cluster.class, msgs);
			return basicSetCluster((Cluster) otherEnd, msgs);
		case MetamodelPackage.DEPLOYMENT__CONTAINERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getContainers()).basicAdd(otherEnd, msgs);
		case MetamodelPackage.DEPLOYMENT__SCALINGPOLICY:
			if (scalingpolicy != null)
				msgs = ((InternalEObject) scalingpolicy).eInverseRemove(this,
						MetamodelPackage.SCALING_POLICY__DEPLOYMENT, ScalingPolicy.class, msgs);
			return basicSetScalingpolicy((ScalingPolicy) otherEnd, msgs);
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
		case MetamodelPackage.DEPLOYMENT__CLUSTER:
			return basicSetCluster(null, msgs);
		case MetamodelPackage.DEPLOYMENT__CONTAINERS:
			return ((InternalEList<?>) getContainers()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.DEPLOYMENT__SCALINGPOLICY:
			return basicSetScalingpolicy(null, msgs);
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
		case MetamodelPackage.DEPLOYMENT__CLUSTER:
			if (resolve)
				return getCluster();
			return basicGetCluster();
		case MetamodelPackage.DEPLOYMENT__REPLICAS:
			return getReplicas();
		case MetamodelPackage.DEPLOYMENT__CONTAINERS:
			return getContainers();
		case MetamodelPackage.DEPLOYMENT__NAME:
			return getName();
		case MetamodelPackage.DEPLOYMENT__SCALINGPOLICY:
			if (resolve)
				return getScalingpolicy();
			return basicGetScalingpolicy();
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
		case MetamodelPackage.DEPLOYMENT__CLUSTER:
			setCluster((Cluster) newValue);
			return;
		case MetamodelPackage.DEPLOYMENT__REPLICAS:
			setReplicas((Integer) newValue);
			return;
		case MetamodelPackage.DEPLOYMENT__CONTAINERS:
			getContainers().clear();
			getContainers().addAll((Collection<? extends org.orka.orkametamodel.Container>) newValue);
			return;
		case MetamodelPackage.DEPLOYMENT__NAME:
			setName((String) newValue);
			return;
		case MetamodelPackage.DEPLOYMENT__SCALINGPOLICY:
			setScalingpolicy((ScalingPolicy) newValue);
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
		case MetamodelPackage.DEPLOYMENT__CLUSTER:
			setCluster((Cluster) null);
			return;
		case MetamodelPackage.DEPLOYMENT__REPLICAS:
			setReplicas(REPLICAS_EDEFAULT);
			return;
		case MetamodelPackage.DEPLOYMENT__CONTAINERS:
			getContainers().clear();
			return;
		case MetamodelPackage.DEPLOYMENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MetamodelPackage.DEPLOYMENT__SCALINGPOLICY:
			setScalingpolicy((ScalingPolicy) null);
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
		case MetamodelPackage.DEPLOYMENT__CLUSTER:
			return cluster != null;
		case MetamodelPackage.DEPLOYMENT__REPLICAS:
			return replicas != REPLICAS_EDEFAULT;
		case MetamodelPackage.DEPLOYMENT__CONTAINERS:
			return containers != null && !containers.isEmpty();
		case MetamodelPackage.DEPLOYMENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MetamodelPackage.DEPLOYMENT__SCALINGPOLICY:
			return scalingpolicy != null;
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
		result.append(" (replicas: ");
		result.append(replicas);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DeploymentImpl
