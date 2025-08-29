/**
 */
package org.orka.orkametamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.orka.orkametamodel.Container#getResources <em>Resources</em>}</li>
 *   <li>{@link org.orka.orkametamodel.Container#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link org.orka.orkametamodel.Container#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link org.orka.orkametamodel.Container#getApplication <em>Application</em>}</li>
 * </ul>
 *
 * @see org.orka.orkametamodel.MetamodelPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends EObject {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference list.
	 * The list contents are of type {@link org.orka.orkametamodel.Resources}.
	 * It is bidirectional and its opposite is '{@link org.orka.orkametamodel.Resources#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' reference list.
	 * @see org.orka.orkametamodel.MetamodelPackage#getContainer_Resources()
	 * @see org.orka.orkametamodel.Resources#getContainer
	 * @model opposite="container"
	 * @generated
	 */
	EList<Resources> getResources();

	/**
	 * Returns the value of the '<em><b>Volumes</b></em>' reference list.
	 * The list contents are of type {@link org.orka.orkametamodel.Volume}.
	 * It is bidirectional and its opposite is '{@link org.orka.orkametamodel.Volume#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volumes</em>' reference list.
	 * @see org.orka.orkametamodel.MetamodelPackage#getContainer_Volumes()
	 * @see org.orka.orkametamodel.Volume#getContainer
	 * @model opposite="container"
	 * @generated
	 */
	EList<Volume> getVolumes();

	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.orka.orkametamodel.Deployment#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment</em>' reference.
	 * @see #setDeployment(Deployment)
	 * @see org.orka.orkametamodel.MetamodelPackage#getContainer_Deployment()
	 * @see org.orka.orkametamodel.Deployment#getContainers
	 * @model opposite="containers" required="true"
	 * @generated
	 */
	Deployment getDeployment();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.Container#getDeployment <em>Deployment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment</em>' reference.
	 * @see #getDeployment()
	 * @generated
	 */
	void setDeployment(Deployment value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.orka.orkametamodel.Application#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' reference.
	 * @see #setApplication(Application)
	 * @see org.orka.orkametamodel.MetamodelPackage#getContainer_Application()
	 * @see org.orka.orkametamodel.Application#getContainer
	 * @model opposite="container" required="true"
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.Container#getApplication <em>Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

} // Container
