/**
 */
package com.orka.orkametamodel.impl;

import com.orka.orkametamodel.CloudProperties;
import com.orka.orkametamodel.MetamodelPackage;
import com.orka.orkametamodel.Provider;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloud Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.orka.orkametamodel.impl.CloudPropertiesImpl#getInstanceType <em>Instance Type</em>}</li>
 *   <li>{@link com.orka.orkametamodel.impl.CloudPropertiesImpl#getImageId <em>Image Id</em>}</li>
 *   <li>{@link com.orka.orkametamodel.impl.CloudPropertiesImpl#getIamRole <em>Iam Role</em>}</li>
 *   <li>{@link com.orka.orkametamodel.impl.CloudPropertiesImpl#getTenantId <em>Tenant Id</em>}</li>
 *   <li>{@link com.orka.orkametamodel.impl.CloudPropertiesImpl#getProjectId <em>Project Id</em>}</li>
 *   <li>{@link com.orka.orkametamodel.impl.CloudPropertiesImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link com.orka.orkametamodel.impl.CloudPropertiesImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link com.orka.orkametamodel.impl.CloudPropertiesImpl#getZone <em>Zone</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CloudPropertiesImpl extends MinimalEObjectImpl.Container implements CloudProperties {
	/**
	 * The default value of the '{@link #getInstanceType() <em>Instance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceType()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceType() <em>Instance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceType()
	 * @generated
	 * @ordered
	 */
	protected String instanceType = INSTANCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageId() <em>Image Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageId()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageId() <em>Image Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageId()
	 * @generated
	 * @ordered
	 */
	protected String imageId = IMAGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIamRole() <em>Iam Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIamRole()
	 * @generated
	 * @ordered
	 */
	protected static final String IAM_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIamRole() <em>Iam Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIamRole()
	 * @generated
	 * @ordered
	 */
	protected String iamRole = IAM_ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTenantId() <em>Tenant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenantId()
	 * @generated
	 * @ordered
	 */
	protected static final String TENANT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTenantId() <em>Tenant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTenantId()
	 * @generated
	 * @ordered
	 */
	protected String tenantId = TENANT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectId() <em>Project Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectId()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectId() <em>Project Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectId()
	 * @generated
	 * @ordered
	 */
	protected String projectId = PROJECT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected static final Provider PROVIDER_EDEFAULT = Provider.GOOGLE;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected Provider provider = PROVIDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected String region = REGION_EDEFAULT;

	/**
	 * The default value of the '{@link #getZone() <em>Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZone()
	 * @generated
	 * @ordered
	 */
	protected static final String ZONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZone() <em>Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZone()
	 * @generated
	 * @ordered
	 */
	protected String zone = ZONE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.CLOUD_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceType() {
		return instanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceType(String newInstanceType) {
		String oldInstanceType = instanceType;
		instanceType = newInstanceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.CLOUD_PROPERTIES__INSTANCE_TYPE,
					oldInstanceType, instanceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageId() {
		return imageId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageId(String newImageId) {
		String oldImageId = imageId;
		imageId = newImageId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.CLOUD_PROPERTIES__IMAGE_ID,
					oldImageId, imageId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIamRole() {
		return iamRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIamRole(String newIamRole) {
		String oldIamRole = iamRole;
		iamRole = newIamRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.CLOUD_PROPERTIES__IAM_ROLE,
					oldIamRole, iamRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTenantId() {
		return tenantId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTenantId(String newTenantId) {
		String oldTenantId = tenantId;
		tenantId = newTenantId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.CLOUD_PROPERTIES__TENANT_ID,
					oldTenantId, tenantId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProjectId() {
		return projectId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectId(String newProjectId) {
		String oldProjectId = projectId;
		projectId = newProjectId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.CLOUD_PROPERTIES__PROJECT_ID,
					oldProjectId, projectId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provider getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(Provider newProvider) {
		Provider oldProvider = provider;
		provider = newProvider == null ? PROVIDER_EDEFAULT : newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.CLOUD_PROPERTIES__PROVIDER,
					oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(String newRegion) {
		String oldRegion = region;
		region = newRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.CLOUD_PROPERTIES__REGION, oldRegion,
					region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZone() {
		return zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZone(String newZone) {
		String oldZone = zone;
		zone = newZone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.CLOUD_PROPERTIES__ZONE, oldZone,
					zone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.CLOUD_PROPERTIES__INSTANCE_TYPE:
			return getInstanceType();
		case MetamodelPackage.CLOUD_PROPERTIES__IMAGE_ID:
			return getImageId();
		case MetamodelPackage.CLOUD_PROPERTIES__IAM_ROLE:
			return getIamRole();
		case MetamodelPackage.CLOUD_PROPERTIES__TENANT_ID:
			return getTenantId();
		case MetamodelPackage.CLOUD_PROPERTIES__PROJECT_ID:
			return getProjectId();
		case MetamodelPackage.CLOUD_PROPERTIES__PROVIDER:
			return getProvider();
		case MetamodelPackage.CLOUD_PROPERTIES__REGION:
			return getRegion();
		case MetamodelPackage.CLOUD_PROPERTIES__ZONE:
			return getZone();
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
		case MetamodelPackage.CLOUD_PROPERTIES__INSTANCE_TYPE:
			setInstanceType((String) newValue);
			return;
		case MetamodelPackage.CLOUD_PROPERTIES__IMAGE_ID:
			setImageId((String) newValue);
			return;
		case MetamodelPackage.CLOUD_PROPERTIES__IAM_ROLE:
			setIamRole((String) newValue);
			return;
		case MetamodelPackage.CLOUD_PROPERTIES__TENANT_ID:
			setTenantId((String) newValue);
			return;
		case MetamodelPackage.CLOUD_PROPERTIES__PROJECT_ID:
			setProjectId((String) newValue);
			return;
		case MetamodelPackage.CLOUD_PROPERTIES__PROVIDER:
			setProvider((Provider) newValue);
			return;
		case MetamodelPackage.CLOUD_PROPERTIES__REGION:
			setRegion((String) newValue);
			return;
		case MetamodelPackage.CLOUD_PROPERTIES__ZONE:
			setZone((String) newValue);
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
		case MetamodelPackage.CLOUD_PROPERTIES__INSTANCE_TYPE:
			setInstanceType(INSTANCE_TYPE_EDEFAULT);
			return;
		case MetamodelPackage.CLOUD_PROPERTIES__IMAGE_ID:
			setImageId(IMAGE_ID_EDEFAULT);
			return;
		case MetamodelPackage.CLOUD_PROPERTIES__IAM_ROLE:
			setIamRole(IAM_ROLE_EDEFAULT);
			return;
		case MetamodelPackage.CLOUD_PROPERTIES__TENANT_ID:
			setTenantId(TENANT_ID_EDEFAULT);
			return;
		case MetamodelPackage.CLOUD_PROPERTIES__PROJECT_ID:
			setProjectId(PROJECT_ID_EDEFAULT);
			return;
		case MetamodelPackage.CLOUD_PROPERTIES__PROVIDER:
			setProvider(PROVIDER_EDEFAULT);
			return;
		case MetamodelPackage.CLOUD_PROPERTIES__REGION:
			setRegion(REGION_EDEFAULT);
			return;
		case MetamodelPackage.CLOUD_PROPERTIES__ZONE:
			setZone(ZONE_EDEFAULT);
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
		case MetamodelPackage.CLOUD_PROPERTIES__INSTANCE_TYPE:
			return INSTANCE_TYPE_EDEFAULT == null ? instanceType != null : !INSTANCE_TYPE_EDEFAULT.equals(instanceType);
		case MetamodelPackage.CLOUD_PROPERTIES__IMAGE_ID:
			return IMAGE_ID_EDEFAULT == null ? imageId != null : !IMAGE_ID_EDEFAULT.equals(imageId);
		case MetamodelPackage.CLOUD_PROPERTIES__IAM_ROLE:
			return IAM_ROLE_EDEFAULT == null ? iamRole != null : !IAM_ROLE_EDEFAULT.equals(iamRole);
		case MetamodelPackage.CLOUD_PROPERTIES__TENANT_ID:
			return TENANT_ID_EDEFAULT == null ? tenantId != null : !TENANT_ID_EDEFAULT.equals(tenantId);
		case MetamodelPackage.CLOUD_PROPERTIES__PROJECT_ID:
			return PROJECT_ID_EDEFAULT == null ? projectId != null : !PROJECT_ID_EDEFAULT.equals(projectId);
		case MetamodelPackage.CLOUD_PROPERTIES__PROVIDER:
			return provider != PROVIDER_EDEFAULT;
		case MetamodelPackage.CLOUD_PROPERTIES__REGION:
			return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
		case MetamodelPackage.CLOUD_PROPERTIES__ZONE:
			return ZONE_EDEFAULT == null ? zone != null : !ZONE_EDEFAULT.equals(zone);
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
		result.append(" (instanceType: ");
		result.append(instanceType);
		result.append(", imageId: ");
		result.append(imageId);
		result.append(", iamRole: ");
		result.append(iamRole);
		result.append(", tenantId: ");
		result.append(tenantId);
		result.append(", projectId: ");
		result.append(projectId);
		result.append(", provider: ");
		result.append(provider);
		result.append(", region: ");
		result.append(region);
		result.append(", zone: ");
		result.append(zone);
		result.append(')');
		return result.toString();
	}

} //CloudPropertiesImpl
