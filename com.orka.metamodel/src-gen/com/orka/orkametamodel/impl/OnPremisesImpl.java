/**
 */
package com.orka.orkametamodel.impl;

import com.orka.orkametamodel.Hypervisor;
import com.orka.orkametamodel.MetamodelPackage;
import com.orka.orkametamodel.OnPremises;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>On Premises</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.orka.orkametamodel.impl.OnPremisesImpl#getHypervisor <em>Hypervisor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OnPremisesImpl extends ClusterImpl implements OnPremises {
	/**
	 * The default value of the '{@link #getHypervisor() <em>Hypervisor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHypervisor()
	 * @generated
	 * @ordered
	 */
	protected static final Hypervisor HYPERVISOR_EDEFAULT = Hypervisor.VM_WARE;

	/**
	 * The cached value of the '{@link #getHypervisor() <em>Hypervisor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHypervisor()
	 * @generated
	 * @ordered
	 */
	protected Hypervisor hypervisor = HYPERVISOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnPremisesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.ON_PREMISES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hypervisor getHypervisor() {
		return hypervisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHypervisor(Hypervisor newHypervisor) {
		Hypervisor oldHypervisor = hypervisor;
		hypervisor = newHypervisor == null ? HYPERVISOR_EDEFAULT : newHypervisor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.ON_PREMISES__HYPERVISOR,
					oldHypervisor, hypervisor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.ON_PREMISES__HYPERVISOR:
			return getHypervisor();
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
		case MetamodelPackage.ON_PREMISES__HYPERVISOR:
			setHypervisor((Hypervisor) newValue);
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
		case MetamodelPackage.ON_PREMISES__HYPERVISOR:
			setHypervisor(HYPERVISOR_EDEFAULT);
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
		case MetamodelPackage.ON_PREMISES__HYPERVISOR:
			return hypervisor != HYPERVISOR_EDEFAULT;
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
		result.append(" (hypervisor: ");
		result.append(hypervisor);
		result.append(')');
		return result.toString();
	}

} //OnPremisesImpl
