/**
 */
package com.orka.orkametamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.orka.orkametamodel.Application#getRequiredResources <em>Required Resources</em>}</li>
 *   <li>{@link com.orka.orkametamodel.Application#getServices <em>Services</em>}</li>
 *   <li>{@link com.orka.orkametamodel.Application#getContainer <em>Container</em>}</li>
 *   <li>{@link com.orka.orkametamodel.Application#getImageRepository <em>Image Repository</em>}</li>
 *   <li>{@link com.orka.orkametamodel.Application#getPort <em>Port</em>}</li>
 *   <li>{@link com.orka.orkametamodel.Application#getSecret <em>Secret</em>}</li>
 *   <li>{@link com.orka.orkametamodel.Application#getConfigmap <em>Configmap</em>}</li>
 * </ul>
 *
 * @see com.orka.orkametamodel.MetamodelPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject {
	/**
	 * Returns the value of the '<em><b>Required Resources</b></em>' reference list.
	 * The list contents are of type {@link com.orka.orkametamodel.Resources}.
	 * It is bidirectional and its opposite is '{@link com.orka.orkametamodel.Resources#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Resources</em>' reference list.
	 * @see com.orka.orkametamodel.MetamodelPackage#getApplication_RequiredResources()
	 * @see com.orka.orkametamodel.Resources#getApplication
	 * @model opposite="application"
	 * @generated
	 */
	EList<Resources> getRequiredResources();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference list.
	 * The list contents are of type {@link com.orka.orkametamodel.Service}.
	 * It is bidirectional and its opposite is '{@link com.orka.orkametamodel.Service#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference list.
	 * @see com.orka.orkametamodel.MetamodelPackage#getApplication_Services()
	 * @see com.orka.orkametamodel.Service#getApplication
	 * @model opposite="application"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference list.
	 * The list contents are of type {@link com.orka.orkametamodel.Container}.
	 * It is bidirectional and its opposite is '{@link com.orka.orkametamodel.Container#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference list.
	 * @see com.orka.orkametamodel.MetamodelPackage#getApplication_Container()
	 * @see com.orka.orkametamodel.Container#getApplication
	 * @model opposite="application"
	 * @generated
	 */
	EList<Container> getContainer();

	/**
	 * Returns the value of the '<em><b>Image Repository</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Repository</em>' attribute.
	 * @see #setImageRepository(String)
	 * @see com.orka.orkametamodel.MetamodelPackage#getApplication_ImageRepository()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getImageRepository();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.Application#getImageRepository <em>Image Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Repository</em>' attribute.
	 * @see #getImageRepository()
	 * @generated
	 */
	void setImageRepository(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see com.orka.orkametamodel.MetamodelPackage#getApplication_Port()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.Application#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Secret</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secret</em>' reference.
	 * @see #setSecret(Secret)
	 * @see com.orka.orkametamodel.MetamodelPackage#getApplication_Secret()
	 * @model
	 * @generated
	 */
	Secret getSecret();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.Application#getSecret <em>Secret</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secret</em>' reference.
	 * @see #getSecret()
	 * @generated
	 */
	void setSecret(Secret value);

	/**
	 * Returns the value of the '<em><b>Configmap</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configmap</em>' reference.
	 * @see #setConfigmap(ConfigMap)
	 * @see com.orka.orkametamodel.MetamodelPackage#getApplication_Configmap()
	 * @model
	 * @generated
	 */
	ConfigMap getConfigmap();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.Application#getConfigmap <em>Configmap</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configmap</em>' reference.
	 * @see #getConfigmap()
	 * @generated
	 */
	void setConfigmap(ConfigMap value);

} // Application
