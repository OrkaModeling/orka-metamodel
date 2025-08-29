/**
 */
package org.orka.orkametamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitoring</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.orka.orkametamodel.Monitoring#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.orka.orkametamodel.Monitoring#getTool <em>Tool</em>}</li>
 *   <li>{@link org.orka.orkametamodel.Monitoring#getCluster <em>Cluster</em>}</li>
 *   <li>{@link org.orka.orkametamodel.Monitoring#getApplication <em>Application</em>}</li>
 * </ul>
 *
 * @see org.orka.orkametamodel.MetamodelPackage#getMonitoring()
 * @model
 * @generated
 */
public interface Monitoring extends EObject {
	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see org.orka.orkametamodel.MetamodelPackage#getMonitoring_Enabled()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.Monitoring#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Tool</b></em>' attribute.
	 * The literals are from the enumeration {@link org.orka.orkametamodel.MonitoringTool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool</em>' attribute.
	 * @see org.orka.orkametamodel.MonitoringTool
	 * @see #setTool(MonitoringTool)
	 * @see org.orka.orkametamodel.MetamodelPackage#getMonitoring_Tool()
	 * @model
	 * @generated
	 */
	MonitoringTool getTool();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.Monitoring#getTool <em>Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool</em>' attribute.
	 * @see org.orka.orkametamodel.MonitoringTool
	 * @see #getTool()
	 * @generated
	 */
	void setTool(MonitoringTool value);

	/**
	 * Returns the value of the '<em><b>Cluster</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cluster</em>' reference.
	 * @see #setCluster(Cluster)
	 * @see org.orka.orkametamodel.MetamodelPackage#getMonitoring_Cluster()
	 * @model
	 * @generated
	 */
	Cluster getCluster();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.Monitoring#getCluster <em>Cluster</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cluster</em>' reference.
	 * @see #getCluster()
	 * @generated
	 */
	void setCluster(Cluster value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' reference.
	 * @see #setApplication(Application)
	 * @see org.orka.orkametamodel.MetamodelPackage#getMonitoring_Application()
	 * @model
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.Monitoring#getApplication <em>Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

} // Monitoring
