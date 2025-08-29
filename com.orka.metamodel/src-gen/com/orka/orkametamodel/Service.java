/**
 */
package com.orka.orkametamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.orka.orkametamodel.Service#getCluster <em>Cluster</em>}</li>
 *   <li>{@link com.orka.orkametamodel.Service#getSecurityGroup <em>Security Group</em>}</li>
 *   <li>{@link com.orka.orkametamodel.Service#getApplication <em>Application</em>}</li>
 *   <li>{@link com.orka.orkametamodel.Service#getName <em>Name</em>}</li>
 *   <li>{@link com.orka.orkametamodel.Service#getType <em>Type</em>}</li>
 *   <li>{@link com.orka.orkametamodel.Service#getPort <em>Port</em>}</li>
 *   <li>{@link com.orka.orkametamodel.Service#getTarget_port <em>Target port</em>}</li>
 *   <li>{@link com.orka.orkametamodel.Service#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link com.orka.orkametamodel.Service#getLoadbalancer <em>Loadbalancer</em>}</li>
 *   <li>{@link com.orka.orkametamodel.Service#getIngress <em>Ingress</em>}</li>
 * </ul>
 *
 * @see com.orka.orkametamodel.MetamodelPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Cluster</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.orka.orkametamodel.Cluster#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cluster</em>' reference.
	 * @see #setCluster(Cluster)
	 * @see com.orka.orkametamodel.MetamodelPackage#getService_Cluster()
	 * @see com.orka.orkametamodel.Cluster#getServices
	 * @model opposite="services" required="true"
	 * @generated
	 */
	Cluster getCluster();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.Service#getCluster <em>Cluster</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cluster</em>' reference.
	 * @see #getCluster()
	 * @generated
	 */
	void setCluster(Cluster value);

	/**
	 * Returns the value of the '<em><b>Security Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.orka.orkametamodel.SecurityGroup#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Group</em>' reference.
	 * @see #setSecurityGroup(SecurityGroup)
	 * @see com.orka.orkametamodel.MetamodelPackage#getService_SecurityGroup()
	 * @see com.orka.orkametamodel.SecurityGroup#getServices
	 * @model opposite="services"
	 * @generated
	 */
	SecurityGroup getSecurityGroup();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.Service#getSecurityGroup <em>Security Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Group</em>' reference.
	 * @see #getSecurityGroup()
	 * @generated
	 */
	void setSecurityGroup(SecurityGroup value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.orka.orkametamodel.Application#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' reference.
	 * @see #setApplication(Application)
	 * @see com.orka.orkametamodel.MetamodelPackage#getService_Application()
	 * @see com.orka.orkametamodel.Application#getServices
	 * @model opposite="services"
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.Service#getApplication <em>Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.orka.orkametamodel.MetamodelPackage#getService_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.Service#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.orka.orkametamodel.ServiceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.orka.orkametamodel.ServiceType
	 * @see #setType(ServiceType)
	 * @see com.orka.orkametamodel.MetamodelPackage#getService_Type()
	 * @model
	 * @generated
	 */
	ServiceType getType();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.Service#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.orka.orkametamodel.ServiceType
	 * @see #getType()
	 * @generated
	 */
	void setType(ServiceType value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see com.orka.orkametamodel.MetamodelPackage#getService_Port()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.Service#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Target port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target port</em>' attribute.
	 * @see #setTarget_port(int)
	 * @see com.orka.orkametamodel.MetamodelPackage#getService_Target_port()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getTarget_port();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.Service#getTarget_port <em>Target port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target port</em>' attribute.
	 * @see #getTarget_port()
	 * @generated
	 */
	void setTarget_port(int value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * The literals are from the enumeration {@link com.orka.orkametamodel.Protocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see com.orka.orkametamodel.Protocol
	 * @see #setProtocol(Protocol)
	 * @see com.orka.orkametamodel.MetamodelPackage#getService_Protocol()
	 * @model
	 * @generated
	 */
	Protocol getProtocol();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.Service#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see com.orka.orkametamodel.Protocol
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(Protocol value);

	/**
	 * Returns the value of the '<em><b>Loadbalancer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.orka.orkametamodel.LoadBalancer#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loadbalancer</em>' reference.
	 * @see #setLoadbalancer(LoadBalancer)
	 * @see com.orka.orkametamodel.MetamodelPackage#getService_Loadbalancer()
	 * @see com.orka.orkametamodel.LoadBalancer#getServices
	 * @model opposite="services"
	 * @generated
	 */
	LoadBalancer getLoadbalancer();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.Service#getLoadbalancer <em>Loadbalancer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loadbalancer</em>' reference.
	 * @see #getLoadbalancer()
	 * @generated
	 */
	void setLoadbalancer(LoadBalancer value);

	/**
	 * Returns the value of the '<em><b>Ingress</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.orka.orkametamodel.Ingress#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ingress</em>' reference.
	 * @see #setIngress(Ingress)
	 * @see com.orka.orkametamodel.MetamodelPackage#getService_Ingress()
	 * @see com.orka.orkametamodel.Ingress#getService
	 * @model opposite="service"
	 * @generated
	 */
	Ingress getIngress();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.Service#getIngress <em>Ingress</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ingress</em>' reference.
	 * @see #getIngress()
	 * @generated
	 */
	void setIngress(Ingress value);

} // Service
