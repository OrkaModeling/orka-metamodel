/**
 */
package com.orka.orkametamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scaling Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.orka.orkametamodel.ScalingPolicy#getMinReplicas <em>Min Replicas</em>}</li>
 *   <li>{@link com.orka.orkametamodel.ScalingPolicy#getMaxReplicas <em>Max Replicas</em>}</li>
 *   <li>{@link com.orka.orkametamodel.ScalingPolicy#getCpuThreshold <em>Cpu Threshold</em>}</li>
 *   <li>{@link com.orka.orkametamodel.ScalingPolicy#getMemoryThreshold <em>Memory Threshold</em>}</li>
 *   <li>{@link com.orka.orkametamodel.ScalingPolicy#getDeployment <em>Deployment</em>}</li>
 * </ul>
 *
 * @see com.orka.orkametamodel.MetamodelPackage#getScalingPolicy()
 * @model
 * @generated
 */
public interface ScalingPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Min Replicas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Replicas</em>' attribute.
	 * @see #setMinReplicas(int)
	 * @see com.orka.orkametamodel.MetamodelPackage#getScalingPolicy_MinReplicas()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getMinReplicas();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.ScalingPolicy#getMinReplicas <em>Min Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Replicas</em>' attribute.
	 * @see #getMinReplicas()
	 * @generated
	 */
	void setMinReplicas(int value);

	/**
	 * Returns the value of the '<em><b>Max Replicas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Replicas</em>' attribute.
	 * @see #setMaxReplicas(int)
	 * @see com.orka.orkametamodel.MetamodelPackage#getScalingPolicy_MaxReplicas()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getMaxReplicas();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.ScalingPolicy#getMaxReplicas <em>Max Replicas</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Replicas</em>' attribute.
	 * @see #getMaxReplicas()
	 * @generated
	 */
	void setMaxReplicas(int value);

	/**
	 * Returns the value of the '<em><b>Cpu Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu Threshold</em>' attribute.
	 * @see #setCpuThreshold(int)
	 * @see com.orka.orkametamodel.MetamodelPackage#getScalingPolicy_CpuThreshold()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getCpuThreshold();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.ScalingPolicy#getCpuThreshold <em>Cpu Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu Threshold</em>' attribute.
	 * @see #getCpuThreshold()
	 * @generated
	 */
	void setCpuThreshold(int value);

	/**
	 * Returns the value of the '<em><b>Memory Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Threshold</em>' attribute.
	 * @see #setMemoryThreshold(int)
	 * @see com.orka.orkametamodel.MetamodelPackage#getScalingPolicy_MemoryThreshold()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getMemoryThreshold();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.ScalingPolicy#getMemoryThreshold <em>Memory Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Threshold</em>' attribute.
	 * @see #getMemoryThreshold()
	 * @generated
	 */
	void setMemoryThreshold(int value);

	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.orka.orkametamodel.Deployment#getScalingpolicy <em>Scalingpolicy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment</em>' reference.
	 * @see #setDeployment(Deployment)
	 * @see com.orka.orkametamodel.MetamodelPackage#getScalingPolicy_Deployment()
	 * @see com.orka.orkametamodel.Deployment#getScalingpolicy
	 * @model opposite="scalingpolicy"
	 * @generated
	 */
	Deployment getDeployment();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.ScalingPolicy#getDeployment <em>Deployment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment</em>' reference.
	 * @see #getDeployment()
	 * @generated
	 */
	void setDeployment(Deployment value);

} // ScalingPolicy
