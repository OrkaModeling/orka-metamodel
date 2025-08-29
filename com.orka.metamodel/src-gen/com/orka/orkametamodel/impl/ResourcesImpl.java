/**
 */
package com.orka.orkametamodel.impl;

import com.orka.orkametamodel.Application;
import com.orka.orkametamodel.MetamodelPackage;
import com.orka.orkametamodel.Node;
import com.orka.orkametamodel.Resources;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resources</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.orka.orkametamodel.impl.ResourcesImpl#getNode <em>Node</em>}</li>
 *   <li>{@link com.orka.orkametamodel.impl.ResourcesImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link com.orka.orkametamodel.impl.ResourcesImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link com.orka.orkametamodel.impl.ResourcesImpl#getCpu <em>Cpu</em>}</li>
 *   <li>{@link com.orka.orkametamodel.impl.ResourcesImpl#getMemory <em>Memory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourcesImpl extends MinimalEObjectImpl.Container implements Resources {
	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected Node node;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected com.orka.orkametamodel.Container container;

	/**
	 * The cached value of the '{@link #getApplication() <em>Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected Application application;

	/**
	 * The default value of the '{@link #getCpu() <em>Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu()
	 * @generated
	 * @ordered
	 */
	protected static final int CPU_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCpu() <em>Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu()
	 * @generated
	 * @ordered
	 */
	protected int cpu = CPU_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemory() <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemory() <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected int memory = MEMORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourcesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.RESOURCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getNode() {
		if (node != null && node.eIsProxy()) {
			InternalEObject oldNode = (InternalEObject) node;
			node = (Node) eResolveProxy(oldNode);
			if (node != oldNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.RESOURCES__NODE, oldNode,
							node));
			}
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetNode() {
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNode(Node newNode, NotificationChain msgs) {
		Node oldNode = node;
		node = newNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.RESOURCES__NODE, oldNode, newNode);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(Node newNode) {
		if (newNode != node) {
			NotificationChain msgs = null;
			if (node != null)
				msgs = ((InternalEObject) node).eInverseRemove(this, MetamodelPackage.NODE__RESOURCES, Node.class,
						msgs);
			if (newNode != null)
				msgs = ((InternalEObject) newNode).eInverseAdd(this, MetamodelPackage.NODE__RESOURCES, Node.class,
						msgs);
			msgs = basicSetNode(newNode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.RESOURCES__NODE, newNode, newNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.orka.orkametamodel.Container getContainer() {
		if (container != null && container.eIsProxy()) {
			InternalEObject oldContainer = (InternalEObject) container;
			container = (com.orka.orkametamodel.Container) eResolveProxy(oldContainer);
			if (container != oldContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.RESOURCES__CONTAINER,
							oldContainer, container));
			}
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.orka.orkametamodel.Container basicGetContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(com.orka.orkametamodel.Container newContainer, NotificationChain msgs) {
		com.orka.orkametamodel.Container oldContainer = container;
		container = newContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.RESOURCES__CONTAINER, oldContainer, newContainer);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(com.orka.orkametamodel.Container newContainer) {
		if (newContainer != container) {
			NotificationChain msgs = null;
			if (container != null)
				msgs = ((InternalEObject) container).eInverseRemove(this, MetamodelPackage.CONTAINER__RESOURCES,
						com.orka.orkametamodel.Container.class, msgs);
			if (newContainer != null)
				msgs = ((InternalEObject) newContainer).eInverseAdd(this, MetamodelPackage.CONTAINER__RESOURCES,
						com.orka.orkametamodel.Container.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.RESOURCES__CONTAINER, newContainer,
					newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application getApplication() {
		if (application != null && application.eIsProxy()) {
			InternalEObject oldApplication = (InternalEObject) application;
			application = (Application) eResolveProxy(oldApplication);
			if (application != oldApplication) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.RESOURCES__APPLICATION,
							oldApplication, application));
			}
		}
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application basicGetApplication() {
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplication(Application newApplication, NotificationChain msgs) {
		Application oldApplication = application;
		application = newApplication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.RESOURCES__APPLICATION, oldApplication, newApplication);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(Application newApplication) {
		if (newApplication != application) {
			NotificationChain msgs = null;
			if (application != null)
				msgs = ((InternalEObject) application).eInverseRemove(this,
						MetamodelPackage.APPLICATION__REQUIRED_RESOURCES, Application.class, msgs);
			if (newApplication != null)
				msgs = ((InternalEObject) newApplication).eInverseAdd(this,
						MetamodelPackage.APPLICATION__REQUIRED_RESOURCES, Application.class, msgs);
			msgs = basicSetApplication(newApplication, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.RESOURCES__APPLICATION,
					newApplication, newApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCpu() {
		return cpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpu(int newCpu) {
		int oldCpu = cpu;
		cpu = newCpu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.RESOURCES__CPU, oldCpu, cpu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMemory() {
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory(int newMemory) {
		int oldMemory = memory;
		memory = newMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.RESOURCES__MEMORY, oldMemory,
					memory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.RESOURCES__NODE:
			if (node != null)
				msgs = ((InternalEObject) node).eInverseRemove(this, MetamodelPackage.NODE__RESOURCES, Node.class,
						msgs);
			return basicSetNode((Node) otherEnd, msgs);
		case MetamodelPackage.RESOURCES__CONTAINER:
			if (container != null)
				msgs = ((InternalEObject) container).eInverseRemove(this, MetamodelPackage.CONTAINER__RESOURCES,
						com.orka.orkametamodel.Container.class, msgs);
			return basicSetContainer((com.orka.orkametamodel.Container) otherEnd, msgs);
		case MetamodelPackage.RESOURCES__APPLICATION:
			if (application != null)
				msgs = ((InternalEObject) application).eInverseRemove(this,
						MetamodelPackage.APPLICATION__REQUIRED_RESOURCES, Application.class, msgs);
			return basicSetApplication((Application) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.RESOURCES__NODE:
			return basicSetNode(null, msgs);
		case MetamodelPackage.RESOURCES__CONTAINER:
			return basicSetContainer(null, msgs);
		case MetamodelPackage.RESOURCES__APPLICATION:
			return basicSetApplication(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.RESOURCES__NODE:
			if (resolve)
				return getNode();
			return basicGetNode();
		case MetamodelPackage.RESOURCES__CONTAINER:
			if (resolve)
				return getContainer();
			return basicGetContainer();
		case MetamodelPackage.RESOURCES__APPLICATION:
			if (resolve)
				return getApplication();
			return basicGetApplication();
		case MetamodelPackage.RESOURCES__CPU:
			return getCpu();
		case MetamodelPackage.RESOURCES__MEMORY:
			return getMemory();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MetamodelPackage.RESOURCES__NODE:
			setNode((Node) newValue);
			return;
		case MetamodelPackage.RESOURCES__CONTAINER:
			setContainer((com.orka.orkametamodel.Container) newValue);
			return;
		case MetamodelPackage.RESOURCES__APPLICATION:
			setApplication((Application) newValue);
			return;
		case MetamodelPackage.RESOURCES__CPU:
			setCpu((Integer) newValue);
			return;
		case MetamodelPackage.RESOURCES__MEMORY:
			setMemory((Integer) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MetamodelPackage.RESOURCES__NODE:
			setNode((Node) null);
			return;
		case MetamodelPackage.RESOURCES__CONTAINER:
			setContainer((com.orka.orkametamodel.Container) null);
			return;
		case MetamodelPackage.RESOURCES__APPLICATION:
			setApplication((Application) null);
			return;
		case MetamodelPackage.RESOURCES__CPU:
			setCpu(CPU_EDEFAULT);
			return;
		case MetamodelPackage.RESOURCES__MEMORY:
			setMemory(MEMORY_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MetamodelPackage.RESOURCES__NODE:
			return node != null;
		case MetamodelPackage.RESOURCES__CONTAINER:
			return container != null;
		case MetamodelPackage.RESOURCES__APPLICATION:
			return application != null;
		case MetamodelPackage.RESOURCES__CPU:
			return cpu != CPU_EDEFAULT;
		case MetamodelPackage.RESOURCES__MEMORY:
			return memory != MEMORY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (cpu: ");
		result.append(cpu);
		result.append(", memory: ");
		result.append(memory);
		result.append(')');
		return result.toString();
	}

} //ResourcesImpl
