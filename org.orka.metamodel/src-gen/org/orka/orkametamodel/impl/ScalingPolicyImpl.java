/**
 */
package org.orka.orkametamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.orka.orkametamodel.Deployment;
import org.orka.orkametamodel.MetamodelPackage;
import org.orka.orkametamodel.ScalingPolicy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scaling Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.orka.orkametamodel.impl.ScalingPolicyImpl#getMinReplicas <em>Min Replicas</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.ScalingPolicyImpl#getMaxReplicas <em>Max Replicas</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.ScalingPolicyImpl#getCpuThreshold <em>Cpu Threshold</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.ScalingPolicyImpl#getMemoryThreshold <em>Memory Threshold</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.ScalingPolicyImpl#getDeployment <em>Deployment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScalingPolicyImpl extends MinimalEObjectImpl.Container implements ScalingPolicy {
	/**
	 * The default value of the '{@link #getMinReplicas() <em>Min Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinReplicas()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_REPLICAS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinReplicas() <em>Min Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinReplicas()
	 * @generated
	 * @ordered
	 */
	protected int minReplicas = MIN_REPLICAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxReplicas() <em>Max Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxReplicas()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_REPLICAS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxReplicas() <em>Max Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxReplicas()
	 * @generated
	 * @ordered
	 */
	protected int maxReplicas = MAX_REPLICAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpuThreshold() <em>Cpu Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final int CPU_THRESHOLD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCpuThreshold() <em>Cpu Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuThreshold()
	 * @generated
	 * @ordered
	 */
	protected int cpuThreshold = CPU_THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemoryThreshold() <em>Memory Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_THRESHOLD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemoryThreshold() <em>Memory Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryThreshold()
	 * @generated
	 * @ordered
	 */
	protected int memoryThreshold = MEMORY_THRESHOLD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeployment() <em>Deployment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployment()
	 * @generated
	 * @ordered
	 */
	protected Deployment deployment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScalingPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.SCALING_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinReplicas() {
		return minReplicas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinReplicas(int newMinReplicas) {
		int oldMinReplicas = minReplicas;
		minReplicas = newMinReplicas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.SCALING_POLICY__MIN_REPLICAS,
					oldMinReplicas, minReplicas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxReplicas() {
		return maxReplicas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxReplicas(int newMaxReplicas) {
		int oldMaxReplicas = maxReplicas;
		maxReplicas = newMaxReplicas;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.SCALING_POLICY__MAX_REPLICAS,
					oldMaxReplicas, maxReplicas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCpuThreshold() {
		return cpuThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpuThreshold(int newCpuThreshold) {
		int oldCpuThreshold = cpuThreshold;
		cpuThreshold = newCpuThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.SCALING_POLICY__CPU_THRESHOLD,
					oldCpuThreshold, cpuThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMemoryThreshold() {
		return memoryThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryThreshold(int newMemoryThreshold) {
		int oldMemoryThreshold = memoryThreshold;
		memoryThreshold = newMemoryThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.SCALING_POLICY__MEMORY_THRESHOLD,
					oldMemoryThreshold, memoryThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment getDeployment() {
		if (deployment != null && deployment.eIsProxy()) {
			InternalEObject oldDeployment = (InternalEObject) deployment;
			deployment = (Deployment) eResolveProxy(oldDeployment);
			if (deployment != oldDeployment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetamodelPackage.SCALING_POLICY__DEPLOYMENT, oldDeployment, deployment));
			}
		}
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment basicGetDeployment() {
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeployment(Deployment newDeployment, NotificationChain msgs) {
		Deployment oldDeployment = deployment;
		deployment = newDeployment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.SCALING_POLICY__DEPLOYMENT, oldDeployment, newDeployment);
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
	public void setDeployment(Deployment newDeployment) {
		if (newDeployment != deployment) {
			NotificationChain msgs = null;
			if (deployment != null)
				msgs = ((InternalEObject) deployment).eInverseRemove(this, MetamodelPackage.DEPLOYMENT__SCALINGPOLICY,
						Deployment.class, msgs);
			if (newDeployment != null)
				msgs = ((InternalEObject) newDeployment).eInverseAdd(this, MetamodelPackage.DEPLOYMENT__SCALINGPOLICY,
						Deployment.class, msgs);
			msgs = basicSetDeployment(newDeployment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.SCALING_POLICY__DEPLOYMENT,
					newDeployment, newDeployment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.SCALING_POLICY__DEPLOYMENT:
			if (deployment != null)
				msgs = ((InternalEObject) deployment).eInverseRemove(this, MetamodelPackage.DEPLOYMENT__SCALINGPOLICY,
						Deployment.class, msgs);
			return basicSetDeployment((Deployment) otherEnd, msgs);
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
		case MetamodelPackage.SCALING_POLICY__DEPLOYMENT:
			return basicSetDeployment(null, msgs);
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
		case MetamodelPackage.SCALING_POLICY__MIN_REPLICAS:
			return getMinReplicas();
		case MetamodelPackage.SCALING_POLICY__MAX_REPLICAS:
			return getMaxReplicas();
		case MetamodelPackage.SCALING_POLICY__CPU_THRESHOLD:
			return getCpuThreshold();
		case MetamodelPackage.SCALING_POLICY__MEMORY_THRESHOLD:
			return getMemoryThreshold();
		case MetamodelPackage.SCALING_POLICY__DEPLOYMENT:
			if (resolve)
				return getDeployment();
			return basicGetDeployment();
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
		case MetamodelPackage.SCALING_POLICY__MIN_REPLICAS:
			setMinReplicas((Integer) newValue);
			return;
		case MetamodelPackage.SCALING_POLICY__MAX_REPLICAS:
			setMaxReplicas((Integer) newValue);
			return;
		case MetamodelPackage.SCALING_POLICY__CPU_THRESHOLD:
			setCpuThreshold((Integer) newValue);
			return;
		case MetamodelPackage.SCALING_POLICY__MEMORY_THRESHOLD:
			setMemoryThreshold((Integer) newValue);
			return;
		case MetamodelPackage.SCALING_POLICY__DEPLOYMENT:
			setDeployment((Deployment) newValue);
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
		case MetamodelPackage.SCALING_POLICY__MIN_REPLICAS:
			setMinReplicas(MIN_REPLICAS_EDEFAULT);
			return;
		case MetamodelPackage.SCALING_POLICY__MAX_REPLICAS:
			setMaxReplicas(MAX_REPLICAS_EDEFAULT);
			return;
		case MetamodelPackage.SCALING_POLICY__CPU_THRESHOLD:
			setCpuThreshold(CPU_THRESHOLD_EDEFAULT);
			return;
		case MetamodelPackage.SCALING_POLICY__MEMORY_THRESHOLD:
			setMemoryThreshold(MEMORY_THRESHOLD_EDEFAULT);
			return;
		case MetamodelPackage.SCALING_POLICY__DEPLOYMENT:
			setDeployment((Deployment) null);
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
		case MetamodelPackage.SCALING_POLICY__MIN_REPLICAS:
			return minReplicas != MIN_REPLICAS_EDEFAULT;
		case MetamodelPackage.SCALING_POLICY__MAX_REPLICAS:
			return maxReplicas != MAX_REPLICAS_EDEFAULT;
		case MetamodelPackage.SCALING_POLICY__CPU_THRESHOLD:
			return cpuThreshold != CPU_THRESHOLD_EDEFAULT;
		case MetamodelPackage.SCALING_POLICY__MEMORY_THRESHOLD:
			return memoryThreshold != MEMORY_THRESHOLD_EDEFAULT;
		case MetamodelPackage.SCALING_POLICY__DEPLOYMENT:
			return deployment != null;
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
		result.append(" (minReplicas: ");
		result.append(minReplicas);
		result.append(", maxReplicas: ");
		result.append(maxReplicas);
		result.append(", cpuThreshold: ");
		result.append(cpuThreshold);
		result.append(", memoryThreshold: ");
		result.append(memoryThreshold);
		result.append(')');
		return result.toString();
	}

} //ScalingPolicyImpl
