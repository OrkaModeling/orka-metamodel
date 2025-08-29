/**
 */
package org.orka.orkametamodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.orka.orkametamodel.IPRange;
import org.orka.orkametamodel.IPRangeType;
import org.orka.orkametamodel.MetamodelPackage;
import org.orka.orkametamodel.Subnetwork;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IP Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.orka.orkametamodel.impl.IPRangeImpl#getSubnetwork <em>Subnetwork</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.IPRangeImpl#getCidr_range <em>Cidr range</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.IPRangeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.IPRangeImpl#isPublic <em>Public</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IPRangeImpl extends MinimalEObjectImpl.Container implements IPRange {
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
	 * The default value of the '{@link #getCidr_range() <em>Cidr range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidr_range()
	 * @generated
	 * @ordered
	 */
	protected static final String CIDR_RANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCidr_range() <em>Cidr range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCidr_range()
	 * @generated
	 * @ordered
	 */
	protected String cidr_range = CIDR_RANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final IPRangeType TYPE_EDEFAULT = IPRangeType.SERVICE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected IPRangeType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isPublic() <em>Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PUBLIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPublic() <em>Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublic()
	 * @generated
	 * @ordered
	 */
	protected boolean public_ = PUBLIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IPRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.IP_RANGE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.IP_RANGE__SUBNETWORK,
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
					MetamodelPackage.IP_RANGE__SUBNETWORK, oldSubnetwork, newSubnetwork);
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
				msgs = ((InternalEObject) subnetwork).eInverseRemove(this, MetamodelPackage.SUBNETWORK__IPRANGE,
						Subnetwork.class, msgs);
			if (newSubnetwork != null)
				msgs = ((InternalEObject) newSubnetwork).eInverseAdd(this, MetamodelPackage.SUBNETWORK__IPRANGE,
						Subnetwork.class, msgs);
			msgs = basicSetSubnetwork(newSubnetwork, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.IP_RANGE__SUBNETWORK, newSubnetwork,
					newSubnetwork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCidr_range() {
		return cidr_range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCidr_range(String newCidr_range) {
		String oldCidr_range = cidr_range;
		cidr_range = newCidr_range;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.IP_RANGE__CIDR_RANGE, oldCidr_range,
					cidr_range));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPRangeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(IPRangeType newType) {
		IPRangeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.IP_RANGE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPublic() {
		return public_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublic(boolean newPublic) {
		boolean oldPublic = public_;
		public_ = newPublic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.IP_RANGE__PUBLIC, oldPublic,
					public_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.IP_RANGE__SUBNETWORK:
			if (subnetwork != null)
				msgs = ((InternalEObject) subnetwork).eInverseRemove(this, MetamodelPackage.SUBNETWORK__IPRANGE,
						Subnetwork.class, msgs);
			return basicSetSubnetwork((Subnetwork) otherEnd, msgs);
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
		case MetamodelPackage.IP_RANGE__SUBNETWORK:
			return basicSetSubnetwork(null, msgs);
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
		case MetamodelPackage.IP_RANGE__SUBNETWORK:
			if (resolve)
				return getSubnetwork();
			return basicGetSubnetwork();
		case MetamodelPackage.IP_RANGE__CIDR_RANGE:
			return getCidr_range();
		case MetamodelPackage.IP_RANGE__TYPE:
			return getType();
		case MetamodelPackage.IP_RANGE__PUBLIC:
			return isPublic();
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
		case MetamodelPackage.IP_RANGE__SUBNETWORK:
			setSubnetwork((Subnetwork) newValue);
			return;
		case MetamodelPackage.IP_RANGE__CIDR_RANGE:
			setCidr_range((String) newValue);
			return;
		case MetamodelPackage.IP_RANGE__TYPE:
			setType((IPRangeType) newValue);
			return;
		case MetamodelPackage.IP_RANGE__PUBLIC:
			setPublic((Boolean) newValue);
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
		case MetamodelPackage.IP_RANGE__SUBNETWORK:
			setSubnetwork((Subnetwork) null);
			return;
		case MetamodelPackage.IP_RANGE__CIDR_RANGE:
			setCidr_range(CIDR_RANGE_EDEFAULT);
			return;
		case MetamodelPackage.IP_RANGE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case MetamodelPackage.IP_RANGE__PUBLIC:
			setPublic(PUBLIC_EDEFAULT);
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
		case MetamodelPackage.IP_RANGE__SUBNETWORK:
			return subnetwork != null;
		case MetamodelPackage.IP_RANGE__CIDR_RANGE:
			return CIDR_RANGE_EDEFAULT == null ? cidr_range != null : !CIDR_RANGE_EDEFAULT.equals(cidr_range);
		case MetamodelPackage.IP_RANGE__TYPE:
			return type != TYPE_EDEFAULT;
		case MetamodelPackage.IP_RANGE__PUBLIC:
			return public_ != PUBLIC_EDEFAULT;
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
		result.append(" (cidr_range: ");
		result.append(cidr_range);
		result.append(", type: ");
		result.append(type);
		result.append(", public: ");
		result.append(public_);
		result.append(')');
		return result.toString();
	}

} //IPRangeImpl
