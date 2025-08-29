/**
 */
package com.orka.orkametamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Public Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.orka.orkametamodel.PublicCluster#getNum_nodes <em>Num nodes</em>}</li>
 *   <li>{@link com.orka.orkametamodel.PublicCluster#getConfig_file <em>Config file</em>}</li>
 *   <li>{@link com.orka.orkametamodel.PublicCluster#getProvider <em>Provider</em>}</li>
 * </ul>
 *
 * @see com.orka.orkametamodel.MetamodelPackage#getPublicCluster()
 * @model
 * @generated
 */
public interface PublicCluster extends Cluster {
	/**
	 * Returns the value of the '<em><b>Num nodes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num nodes</em>' attribute.
	 * @see #setNum_nodes(int)
	 * @see com.orka.orkametamodel.MetamodelPackage#getPublicCluster_Num_nodes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getNum_nodes();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.PublicCluster#getNum_nodes <em>Num nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num nodes</em>' attribute.
	 * @see #getNum_nodes()
	 * @generated
	 */
	void setNum_nodes(int value);

	/**
	 * Returns the value of the '<em><b>Config file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config file</em>' attribute.
	 * @see #setConfig_file(String)
	 * @see com.orka.orkametamodel.MetamodelPackage#getPublicCluster_Config_file()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getConfig_file();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.PublicCluster#getConfig_file <em>Config file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config file</em>' attribute.
	 * @see #getConfig_file()
	 * @generated
	 */
	void setConfig_file(String value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' attribute.
	 * The default value is <code>"AWS"</code>.
	 * The literals are from the enumeration {@link com.orka.orkametamodel.Provider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' attribute.
	 * @see com.orka.orkametamodel.Provider
	 * @see #setProvider(Provider)
	 * @see com.orka.orkametamodel.MetamodelPackage#getPublicCluster_Provider()
	 * @model default="AWS"
	 * @generated
	 */
	Provider getProvider();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.PublicCluster#getProvider <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' attribute.
	 * @see com.orka.orkametamodel.Provider
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(Provider value);

} // PublicCluster
