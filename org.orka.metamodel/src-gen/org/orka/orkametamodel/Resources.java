/**
 */
package org.orka.orkametamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resources</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.orka.orkametamodel.Resources#getNode <em>Node</em>}</li>
 *   <li>{@link org.orka.orkametamodel.Resources#getContainer <em>Container</em>}</li>
 *   <li>{@link org.orka.orkametamodel.Resources#getApplication <em>Application</em>}</li>
 *   <li>{@link org.orka.orkametamodel.Resources#getCpu <em>Cpu</em>}</li>
 *   <li>{@link org.orka.orkametamodel.Resources#getMemory <em>Memory</em>}</li>
 * </ul>
 *
 * @see org.orka.orkametamodel.MetamodelPackage#getResources()
 * @model
 * @generated
 */
public interface Resources extends EObject {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.orka.orkametamodel.Node#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(Node)
	 * @see org.orka.orkametamodel.MetamodelPackage#getResources_Node()
	 * @see org.orka.orkametamodel.Node#getResources
	 * @model opposite="resources" required="true"
	 * @generated
	 */
	Node getNode();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.Resources#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(Node value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.orka.orkametamodel.Container#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference.
	 * @see #setContainer(Container)
	 * @see org.orka.orkametamodel.MetamodelPackage#getResources_Container()
	 * @see org.orka.orkametamodel.Container#getResources
	 * @model opposite="resources" required="true"
	 * @generated
	 */
	Container getContainer();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.Resources#getContainer <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Container value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.orka.orkametamodel.Application#getRequiredResources <em>Required Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' reference.
	 * @see #setApplication(Application)
	 * @see org.orka.orkametamodel.MetamodelPackage#getResources_Application()
	 * @see org.orka.orkametamodel.Application#getRequiredResources
	 * @model opposite="requiredResources" required="true"
	 * @generated
	 */
	Application getApplication();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.Resources#getApplication <em>Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' reference.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(Application value);

	/**
	 * Returns the value of the '<em><b>Cpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu</em>' attribute.
	 * @see #setCpu(int)
	 * @see org.orka.orkametamodel.MetamodelPackage#getResources_Cpu()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getCpu();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.Resources#getCpu <em>Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu</em>' attribute.
	 * @see #getCpu()
	 * @generated
	 */
	void setCpu(int value);

	/**
	 * Returns the value of the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory</em>' attribute.
	 * @see #setMemory(int)
	 * @see org.orka.orkametamodel.MetamodelPackage#getResources_Memory()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getMemory();

	/**
	 * Sets the value of the '{@link org.orka.orkametamodel.Resources#getMemory <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory</em>' attribute.
	 * @see #getMemory()
	 * @generated
	 */
	void setMemory(int value);

} // Resources
