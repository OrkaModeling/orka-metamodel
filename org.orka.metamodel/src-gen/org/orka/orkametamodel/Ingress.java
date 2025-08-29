/**
 */
package org.orka.orkametamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ingress</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.orka.orkametamodel.Ingress#getHost <em>Host</em>}</li>
 *   <li>{@link org.orka.orkametamodel.Ingress#getPath <em>Path</em>}</li>
 *   <li>{@link org.orka.orkametamodel.Ingress#getTlsSecret <em>Tls Secret</em>}</li>
 *   <li>{@link org.orka.orkametamodel.Ingress#getService <em>Service</em>}</li>
 * </ul>
 *
 * @see org.orka.orkametamodel.MetamodelPackage#getIngress()
 * @model
 * @generated
 */
public interface Ingress extends EObject {
	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see org.orka.orkametamodel.MetamodelPackage#getIngress_Host()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.Ingress#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.orka.orkametamodel.MetamodelPackage#getIngress_Path()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.Ingress#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Tls Secret</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tls Secret</em>' reference.
	 * @see #setTlsSecret(Secret)
	 * @see org.orka.orkametamodel.MetamodelPackage#getIngress_TlsSecret()
	 * @model
	 * @generated
	 */
	Secret getTlsSecret();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.Ingress#getTlsSecret <em>Tls Secret</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tls Secret</em>' reference.
	 * @see #getTlsSecret()
	 * @generated
	 */
	void setTlsSecret(Secret value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference list.
	 * The list contents are of type {@link org.orka.orkametamodel.Service}.
	 * It is bidirectional and its opposite is '{@link org.orka.orkametamodel.Service#getIngress <em>Ingress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference list.
	 * @see org.orka.orkametamodel.MetamodelPackage#getIngress_Service()
	 * @see org.orka.orkametamodel.Service#getIngress
	 * @model opposite="ingress"
	 * @generated
	 */
	EList<Service> getService();

} // Ingress
