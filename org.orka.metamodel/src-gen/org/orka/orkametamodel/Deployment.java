/**
 */
package org.orka.orkametamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.orka.orkametamodel.Deployment#getCluster <em>Cluster</em>}</li>
 *   <li>{@link org.orka.orkametamodel.Deployment#getReplicas <em>Replicas</em>}</li>
 *   <li>{@link org.orka.orkametamodel.Deployment#getContainers <em>Containers</em>}</li>
 *   <li>{@link org.orka.orkametamodel.Deployment#getName <em>Name</em>}</li>
 *   <li>{@link org.orka.orkametamodel.Deployment#getScalingpolicy <em>Scalingpolicy</em>}</li>
 * </ul>
 *
 * @see org.orka.orkametamodel.MetamodelPackage#getDeployment()
 * @model
 * @generated
 */
public interface Deployment extends EObject {
	/**
	 * Returns the value of the '<em><b>Cluster</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.orka.orkametamodel.Cluster#getDeployments <em>Deployments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cluster</em>' reference.
	 * @see #setCluster(Cluster)
	 * @see org.orka.orkametamodel.MetamodelPackage#getDeployment_Cluster()
	 * @see org.orka.orkametamodel.Cluster#getDeployments
	 * @model opposite="deployments" required="true"
	 * @generated
	 */
	Cluster getCluster();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.Deployment#getCluster <em>Cluster</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cluster</em>' reference.
	 * @see #getCluster()
	 * @generated
	 */
	void setCluster(Cluster value);

	/**
	 * Returns the value of the '<em><b>Replicas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replicas</em>' attribute.
	 * @see #setReplicas(int)
	 * @see org.orka.orkametamodel.MetamodelPackage#getDeployment_Replicas()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getReplicas();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.Deployment#getReplicas <em>Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replicas</em>' attribute.
	 * @see #getReplicas()
	 * @generated
	 */
	void setReplicas(int value);

	/**
	 * Returns the value of the '<em><b>Containers</b></em>' reference list.
	 * The list contents are of type {@link org.orka.orkametamodel.Container}.
	 * It is bidirectional and its opposite is '{@link org.orka.orkametamodel.Container#getDeployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' reference list.
	 * @see org.orka.orkametamodel.MetamodelPackage#getDeployment_Containers()
	 * @see org.orka.orkametamodel.Container#getDeployment
	 * @model opposite="deployment" required="true"
	 * @generated
	 */
	EList<Container> getContainers();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.orka.orkametamodel.MetamodelPackage#getDeployment_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.Deployment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Scalingpolicy</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.orka.orkametamodel.ScalingPolicy#getDeployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scalingpolicy</em>' reference.
	 * @see #setScalingpolicy(ScalingPolicy)
	 * @see org.orka.orkametamodel.MetamodelPackage#getDeployment_Scalingpolicy()
	 * @see org.orka.orkametamodel.ScalingPolicy#getDeployment
	 * @model opposite="deployment"
	 * @generated
	 */
	ScalingPolicy getScalingpolicy();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.Deployment#getScalingpolicy <em>Scalingpolicy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scalingpolicy</em>' reference.
	 * @see #getScalingpolicy()
	 * @generated
	 */
	void setScalingpolicy(ScalingPolicy value);

} // Deployment
