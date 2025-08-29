/**
 */
package org.orka.orkametamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.orka.orkametamodel.Node#getCluster <em>Cluster</em>}</li>
 *   <li>{@link org.orka.orkametamodel.Node#getResources <em>Resources</em>}</li>
 *   <li>{@link org.orka.orkametamodel.Node#getName <em>Name</em>}</li>
 *   <li>{@link org.orka.orkametamodel.Node#getHostname <em>Hostname</em>}</li>
 *   <li>{@link org.orka.orkametamodel.Node#getPublic_ip <em>Public ip</em>}</li>
 *   <li>{@link org.orka.orkametamodel.Node#getPrivate_ip <em>Private ip</em>}</li>
 *   <li>{@link org.orka.orkametamodel.Node#getOs <em>Os</em>}</li>
 *   <li>{@link org.orka.orkametamodel.Node#getStorage <em>Storage</em>}</li>
 *   <li>{@link org.orka.orkametamodel.Node#getProcessor <em>Processor</em>}</li>
 * </ul>
 *
 * @see org.orka.orkametamodel.MetamodelPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Cluster</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.orka.orkametamodel.Cluster#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cluster</em>' reference.
	 * @see #setCluster(Cluster)
	 * @see org.orka.orkametamodel.MetamodelPackage#getNode_Cluster()
	 * @see org.orka.orkametamodel.Cluster#getNodes
	 * @model opposite="nodes" required="true"
	 * @generated
	 */
	Cluster getCluster();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.Node#getCluster <em>Cluster</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cluster</em>' reference.
	 * @see #getCluster()
	 * @generated
	 */
	void setCluster(Cluster value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference list.
	 * The list contents are of type {@link org.orka.orkametamodel.Resources}.
	 * It is bidirectional and its opposite is '{@link org.orka.orkametamodel.Resources#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' reference list.
	 * @see org.orka.orkametamodel.MetamodelPackage#getNode_Resources()
	 * @see org.orka.orkametamodel.Resources#getNode
	 * @model opposite="node" required="true"
	 * @generated
	 */
	EList<Resources> getResources();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.orka.orkametamodel.MetamodelPackage#getNode_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hostname</em>' attribute.
	 * @see #setHostname(String)
	 * @see org.orka.orkametamodel.MetamodelPackage#getNode_Hostname()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getHostname();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.Node#getHostname <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hostname</em>' attribute.
	 * @see #getHostname()
	 * @generated
	 */
	void setHostname(String value);

	/**
	 * Returns the value of the '<em><b>Public ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public ip</em>' attribute.
	 * @see #setPublic_ip(String)
	 * @see org.orka.orkametamodel.MetamodelPackage#getNode_Public_ip()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getPublic_ip();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.Node#getPublic_ip <em>Public ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public ip</em>' attribute.
	 * @see #getPublic_ip()
	 * @generated
	 */
	void setPublic_ip(String value);

	/**
	 * Returns the value of the '<em><b>Private ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private ip</em>' attribute.
	 * @see #setPrivate_ip(String)
	 * @see org.orka.orkametamodel.MetamodelPackage#getNode_Private_ip()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getPrivate_ip();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.Node#getPrivate_ip <em>Private ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private ip</em>' attribute.
	 * @see #getPrivate_ip()
	 * @generated
	 */
	void setPrivate_ip(String value);

	/**
	 * Returns the value of the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os</em>' attribute.
	 * @see #setOs(String)
	 * @see org.orka.orkametamodel.MetamodelPackage#getNode_Os()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getOs();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.Node#getOs <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os</em>' attribute.
	 * @see #getOs()
	 * @generated
	 */
	void setOs(String value);

	/**
	 * Returns the value of the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage</em>' attribute.
	 * @see #setStorage(int)
	 * @see org.orka.orkametamodel.MetamodelPackage#getNode_Storage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getStorage();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.Node#getStorage <em>Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage</em>' attribute.
	 * @see #getStorage()
	 * @generated
	 */
	void setStorage(int value);

	/**
	 * Returns the value of the '<em><b>Processor</b></em>' attribute.
	 * The literals are from the enumeration {@link org.orka.orkametamodel.Processor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor</em>' attribute.
	 * @see org.orka.orkametamodel.Processor
	 * @see #setProcessor(Processor)
	 * @see org.orka.orkametamodel.MetamodelPackage#getNode_Processor()
	 * @model
	 * @generated
	 */
	Processor getProcessor();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.Node#getProcessor <em>Processor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor</em>' attribute.
	 * @see org.orka.orkametamodel.Processor
	 * @see #getProcessor()
	 * @generated
	 */
	void setProcessor(Processor value);

} // Node
