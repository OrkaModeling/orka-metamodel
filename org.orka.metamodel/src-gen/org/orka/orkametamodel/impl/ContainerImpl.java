/**
 */
package org.orka.orkametamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.orka.orkametamodel.Application;
import org.orka.orkametamodel.Deployment;
import org.orka.orkametamodel.MetamodelPackage;
import org.orka.orkametamodel.Resources;
import org.orka.orkametamodel.Volume;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.orka.orkametamodel.impl.ContainerImpl#getResources <em>Resources</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.ContainerImpl#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.ContainerImpl#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.ContainerImpl#getApplication <em>Application</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends MinimalEObjectImpl.Container implements org.orka.orkametamodel.Container {
	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resources> resources;

	/**
	 * The cached value of the '{@link #getVolumes() <em>Volumes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumes()
	 * @generated
	 * @ordered
	 */
	protected EList<Volume> volumes;

	/**
	 * The cached value of the '{@link #getDeployment() <em>Deployment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployment()
	 * @generated
	 * @ordered
	 */
	protected Deployment deployment;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resources> getResources() {
		if (resources == null) {
			resources = new EObjectWithInverseResolvingEList<Resources>(Resources.class, this,
					MetamodelPackage.CONTAINER__RESOURCES, MetamodelPackage.RESOURCES__CONTAINER);
		}
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Volume> getVolumes() {
		if (volumes == null) {
			volumes = new EObjectWithInverseResolvingEList.ManyInverse<Volume>(Volume.class, this,
					MetamodelPackage.CONTAINER__VOLUMES, MetamodelPackage.VOLUME__CONTAINER);
		}
		return volumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment getDeployment() {
		if (deployment != null && deployment.eIsProxy()) {
			InternalEObject oldDeployment = (InternalEObject) deployment;
			deployment = (Deployment) eResolveProxy(oldDeployment);
			if (deployment != oldDeployment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.CONTAINER__DEPLOYMENT,
							oldDeployment, deployment));
			}
		}
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment basicGetDeployment() {
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeployment(Deployment newDeployment, NotificationChain msgs) {
		Deployment oldDeployment = deployment;
		deployment = newDeployment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.CONTAINER__DEPLOYMENT, oldDeployment, newDeployment);
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
	public void setDeployment(Deployment newDeployment) {
		if (newDeployment != deployment) {
			NotificationChain msgs = null;
			if (deployment != null)
				msgs = ((InternalEObject) deployment).eInverseRemove(this, MetamodelPackage.DEPLOYMENT__CONTAINERS,
						Deployment.class, msgs);
			if (newDeployment != null)
				msgs = ((InternalEObject) newDeployment).eInverseAdd(this, MetamodelPackage.DEPLOYMENT__CONTAINERS,
						Deployment.class, msgs);
			msgs = basicSetDeployment(newDeployment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.CONTAINER__DEPLOYMENT, newDeployment,
					newDeployment));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.CONTAINER__APPLICATION,
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
					MetamodelPackage.CONTAINER__APPLICATION, oldApplication, newApplication);
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
				msgs = ((InternalEObject) application).eInverseRemove(this, MetamodelPackage.APPLICATION__CONTAINER,
						Application.class, msgs);
			if (newApplication != null)
				msgs = ((InternalEObject) newApplication).eInverseAdd(this, MetamodelPackage.APPLICATION__CONTAINER,
						Application.class, msgs);
			msgs = basicSetApplication(newApplication, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.CONTAINER__APPLICATION,
					newApplication, newApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.CONTAINER__RESOURCES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getResources()).basicAdd(otherEnd, msgs);
		case MetamodelPackage.CONTAINER__VOLUMES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getVolumes()).basicAdd(otherEnd, msgs);
		case MetamodelPackage.CONTAINER__DEPLOYMENT:
			if (deployment != null)
				msgs = ((InternalEObject) deployment).eInverseRemove(this, MetamodelPackage.DEPLOYMENT__CONTAINERS,
						Deployment.class, msgs);
			return basicSetDeployment((Deployment) otherEnd, msgs);
		case MetamodelPackage.CONTAINER__APPLICATION:
			if (application != null)
				msgs = ((InternalEObject) application).eInverseRemove(this, MetamodelPackage.APPLICATION__CONTAINER,
						Application.class, msgs);
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
		case MetamodelPackage.CONTAINER__RESOURCES:
			return ((InternalEList<?>) getResources()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.CONTAINER__VOLUMES:
			return ((InternalEList<?>) getVolumes()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.CONTAINER__DEPLOYMENT:
			return basicSetDeployment(null, msgs);
		case MetamodelPackage.CONTAINER__APPLICATION:
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
		case MetamodelPackage.CONTAINER__RESOURCES:
			return getResources();
		case MetamodelPackage.CONTAINER__VOLUMES:
			return getVolumes();
		case MetamodelPackage.CONTAINER__DEPLOYMENT:
			if (resolve)
				return getDeployment();
			return basicGetDeployment();
		case MetamodelPackage.CONTAINER__APPLICATION:
			if (resolve)
				return getApplication();
			return basicGetApplication();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MetamodelPackage.CONTAINER__RESOURCES:
			getResources().clear();
			getResources().addAll((Collection<? extends Resources>) newValue);
			return;
		case MetamodelPackage.CONTAINER__VOLUMES:
			getVolumes().clear();
			getVolumes().addAll((Collection<? extends Volume>) newValue);
			return;
		case MetamodelPackage.CONTAINER__DEPLOYMENT:
			setDeployment((Deployment) newValue);
			return;
		case MetamodelPackage.CONTAINER__APPLICATION:
			setApplication((Application) newValue);
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
		case MetamodelPackage.CONTAINER__RESOURCES:
			getResources().clear();
			return;
		case MetamodelPackage.CONTAINER__VOLUMES:
			getVolumes().clear();
			return;
		case MetamodelPackage.CONTAINER__DEPLOYMENT:
			setDeployment((Deployment) null);
			return;
		case MetamodelPackage.CONTAINER__APPLICATION:
			setApplication((Application) null);
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
		case MetamodelPackage.CONTAINER__RESOURCES:
			return resources != null && !resources.isEmpty();
		case MetamodelPackage.CONTAINER__VOLUMES:
			return volumes != null && !volumes.isEmpty();
		case MetamodelPackage.CONTAINER__DEPLOYMENT:
			return deployment != null;
		case MetamodelPackage.CONTAINER__APPLICATION:
			return application != null;
		}
		return super.eIsSet(featureID);
	}

} //ContainerImpl
