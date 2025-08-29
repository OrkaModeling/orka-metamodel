/**
 */
package com.orka.orkametamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orka Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.orka.orkametamodel.OrkaModel#getClusters <em>Clusters</em>}</li>
 *   <li>{@link com.orka.orkametamodel.OrkaModel#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.orka.orkametamodel.MetamodelPackage#getOrkaModel()
 * @model
 * @generated
 */
public interface OrkaModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Clusters</b></em>' reference list.
	 * The list contents are of type {@link com.orka.orkametamodel.Cluster}.
	 * It is bidirectional and its opposite is '{@link com.orka.orkametamodel.Cluster#getOrkamodel <em>Orkamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clusters</em>' reference list.
	 * @see com.orka.orkametamodel.MetamodelPackage#getOrkaModel_Clusters()
	 * @see com.orka.orkametamodel.Cluster#getOrkamodel
	 * @model opposite="orkamodel"
	 * @generated
	 */
	EList<Cluster> getClusters();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.orka.orkametamodel.MetamodelPackage#getOrkaModel_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.OrkaModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // OrkaModel
