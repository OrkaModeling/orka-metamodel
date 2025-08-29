/**
 */
package org.orka.orkametamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.orka.orkametamodel.CloudProperties#getInstanceType <em>Instance Type</em>}</li>
 *   <li>{@link org.orka.orkametamodel.CloudProperties#getImageId <em>Image Id</em>}</li>
 *   <li>{@link org.orka.orkametamodel.CloudProperties#getIamRole <em>Iam Role</em>}</li>
 *   <li>{@link org.orka.orkametamodel.CloudProperties#getTenantId <em>Tenant Id</em>}</li>
 *   <li>{@link org.orka.orkametamodel.CloudProperties#getProjectId <em>Project Id</em>}</li>
 *   <li>{@link org.orka.orkametamodel.CloudProperties#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.orka.orkametamodel.CloudProperties#getRegion <em>Region</em>}</li>
 *   <li>{@link org.orka.orkametamodel.CloudProperties#getZone <em>Zone</em>}</li>
 * </ul>
 *
 * @see org.orka.orkametamodel.MetamodelPackage#getCloudProperties()
 * @model
 * @generated
 */
public interface CloudProperties extends EObject {
	/**
	 * Returns the value of the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Type</em>' attribute.
	 * @see #setInstanceType(String)
	 * @see org.orka.orkametamodel.MetamodelPackage#getCloudProperties_InstanceType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getInstanceType();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.CloudProperties#getInstanceType <em>Instance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Type</em>' attribute.
	 * @see #getInstanceType()
	 * @generated
	 */
	void setInstanceType(String value);

	/**
	 * Returns the value of the '<em><b>Image Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Id</em>' attribute.
	 * @see #setImageId(String)
	 * @see org.orka.orkametamodel.MetamodelPackage#getCloudProperties_ImageId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getImageId();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.CloudProperties#getImageId <em>Image Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Id</em>' attribute.
	 * @see #getImageId()
	 * @generated
	 */
	void setImageId(String value);

	/**
	 * Returns the value of the '<em><b>Iam Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iam Role</em>' attribute.
	 * @see #setIamRole(String)
	 * @see org.orka.orkametamodel.MetamodelPackage#getCloudProperties_IamRole()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getIamRole();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.CloudProperties#getIamRole <em>Iam Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iam Role</em>' attribute.
	 * @see #getIamRole()
	 * @generated
	 */
	void setIamRole(String value);

	/**
	 * Returns the value of the '<em><b>Tenant Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tenant Id</em>' attribute.
	 * @see #setTenantId(String)
	 * @see org.orka.orkametamodel.MetamodelPackage#getCloudProperties_TenantId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getTenantId();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.CloudProperties#getTenantId <em>Tenant Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenant Id</em>' attribute.
	 * @see #getTenantId()
	 * @generated
	 */
	void setTenantId(String value);

	/**
	 * Returns the value of the '<em><b>Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Id</em>' attribute.
	 * @see #setProjectId(String)
	 * @see org.orka.orkametamodel.MetamodelPackage#getCloudProperties_ProjectId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getProjectId();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.CloudProperties#getProjectId <em>Project Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Id</em>' attribute.
	 * @see #getProjectId()
	 * @generated
	 */
	void setProjectId(String value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' attribute.
	 * The literals are from the enumeration {@link org.orka.orkametamodel.Provider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' attribute.
	 * @see org.orka.orkametamodel.Provider
	 * @see #setProvider(Provider)
	 * @see org.orka.orkametamodel.MetamodelPackage#getCloudProperties_Provider()
	 * @model
	 * @generated
	 */
	Provider getProvider();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.CloudProperties#getProvider <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' attribute.
	 * @see org.orka.orkametamodel.Provider
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(Provider value);

	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #setRegion(String)
	 * @see org.orka.orkametamodel.MetamodelPackage#getCloudProperties_Region()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.CloudProperties#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

	/**
	 * Returns the value of the '<em><b>Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone</em>' attribute.
	 * @see #setZone(String)
	 * @see org.orka.orkametamodel.MetamodelPackage#getCloudProperties_Zone()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getZone();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.CloudProperties#getZone <em>Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone</em>' attribute.
	 * @see #getZone()
	 * @generated
	 */
	void setZone(String value);

} // CloudProperties
