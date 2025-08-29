/**
 */
package com.orka.orkametamodel.impl;

import com.orka.orkametamodel.Application;
import com.orka.orkametamodel.ConfigMap;
import com.orka.orkametamodel.MetamodelPackage;
import com.orka.orkametamodel.Resources;
import com.orka.orkametamodel.Secret;
import com.orka.orkametamodel.Service;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.orka.orkametamodel.impl.ApplicationImpl#getRequiredResources <em>Required Resources</em>}</li>
 *   <li>{@link com.orka.orkametamodel.impl.ApplicationImpl#getServices <em>Services</em>}</li>
 *   <li>{@link com.orka.orkametamodel.impl.ApplicationImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link com.orka.orkametamodel.impl.ApplicationImpl#getImageRepository <em>Image Repository</em>}</li>
 *   <li>{@link com.orka.orkametamodel.impl.ApplicationImpl#getPort <em>Port</em>}</li>
 *   <li>{@link com.orka.orkametamodel.impl.ApplicationImpl#getSecret <em>Secret</em>}</li>
 *   <li>{@link com.orka.orkametamodel.impl.ApplicationImpl#getConfigmap <em>Configmap</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApplicationImpl extends MinimalEObjectImpl.Container implements Application {
	/**
	 * The cached value of the '{@link #getRequiredResources() <em>Required Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resources> requiredResources;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<com.orka.orkametamodel.Container> container;

	/**
	 * The default value of the '{@link #getImageRepository() <em>Image Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageRepository()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_REPOSITORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageRepository() <em>Image Repository</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageRepository()
	 * @generated
	 * @ordered
	 */
	protected String imageRepository = IMAGE_REPOSITORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSecret() <em>Secret</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecret()
	 * @generated
	 * @ordered
	 */
	protected Secret secret;

	/**
	 * The cached value of the '{@link #getConfigmap() <em>Configmap</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigmap()
	 * @generated
	 * @ordered
	 */
	protected ConfigMap configmap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resources> getRequiredResources() {
		if (requiredResources == null) {
			requiredResources = new EObjectWithInverseResolvingEList<Resources>(Resources.class, this,
					MetamodelPackage.APPLICATION__REQUIRED_RESOURCES, MetamodelPackage.RESOURCES__APPLICATION);
		}
		return requiredResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectWithInverseResolvingEList<Service>(Service.class, this,
					MetamodelPackage.APPLICATION__SERVICES, MetamodelPackage.SERVICE__APPLICATION);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<com.orka.orkametamodel.Container> getContainer() {
		if (container == null) {
			container = new EObjectWithInverseResolvingEList<com.orka.orkametamodel.Container>(
					com.orka.orkametamodel.Container.class, this, MetamodelPackage.APPLICATION__CONTAINER,
					MetamodelPackage.CONTAINER__APPLICATION);
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageRepository() {
		return imageRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageRepository(String newImageRepository) {
		String oldImageRepository = imageRepository;
		imageRepository = newImageRepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.APPLICATION__IMAGE_REPOSITORY,
					oldImageRepository, imageRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.APPLICATION__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Secret getSecret() {
		if (secret != null && secret.eIsProxy()) {
			InternalEObject oldSecret = (InternalEObject) secret;
			secret = (Secret) eResolveProxy(oldSecret);
			if (secret != oldSecret) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.APPLICATION__SECRET,
							oldSecret, secret));
			}
		}
		return secret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Secret basicGetSecret() {
		return secret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecret(Secret newSecret) {
		Secret oldSecret = secret;
		secret = newSecret;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.APPLICATION__SECRET, oldSecret,
					secret));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigMap getConfigmap() {
		if (configmap != null && configmap.eIsProxy()) {
			InternalEObject oldConfigmap = (InternalEObject) configmap;
			configmap = (ConfigMap) eResolveProxy(oldConfigmap);
			if (configmap != oldConfigmap) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.APPLICATION__CONFIGMAP,
							oldConfigmap, configmap));
			}
		}
		return configmap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigMap basicGetConfigmap() {
		return configmap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigmap(ConfigMap newConfigmap) {
		ConfigMap oldConfigmap = configmap;
		configmap = newConfigmap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.APPLICATION__CONFIGMAP, oldConfigmap,
					configmap));
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
		case MetamodelPackage.APPLICATION__REQUIRED_RESOURCES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRequiredResources()).basicAdd(otherEnd,
					msgs);
		case MetamodelPackage.APPLICATION__SERVICES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getServices()).basicAdd(otherEnd, msgs);
		case MetamodelPackage.APPLICATION__CONTAINER:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getContainer()).basicAdd(otherEnd, msgs);
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
		case MetamodelPackage.APPLICATION__REQUIRED_RESOURCES:
			return ((InternalEList<?>) getRequiredResources()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.APPLICATION__SERVICES:
			return ((InternalEList<?>) getServices()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.APPLICATION__CONTAINER:
			return ((InternalEList<?>) getContainer()).basicRemove(otherEnd, msgs);
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
		case MetamodelPackage.APPLICATION__REQUIRED_RESOURCES:
			return getRequiredResources();
		case MetamodelPackage.APPLICATION__SERVICES:
			return getServices();
		case MetamodelPackage.APPLICATION__CONTAINER:
			return getContainer();
		case MetamodelPackage.APPLICATION__IMAGE_REPOSITORY:
			return getImageRepository();
		case MetamodelPackage.APPLICATION__PORT:
			return getPort();
		case MetamodelPackage.APPLICATION__SECRET:
			if (resolve)
				return getSecret();
			return basicGetSecret();
		case MetamodelPackage.APPLICATION__CONFIGMAP:
			if (resolve)
				return getConfigmap();
			return basicGetConfigmap();
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
		case MetamodelPackage.APPLICATION__REQUIRED_RESOURCES:
			getRequiredResources().clear();
			getRequiredResources().addAll((Collection<? extends Resources>) newValue);
			return;
		case MetamodelPackage.APPLICATION__SERVICES:
			getServices().clear();
			getServices().addAll((Collection<? extends Service>) newValue);
			return;
		case MetamodelPackage.APPLICATION__CONTAINER:
			getContainer().clear();
			getContainer().addAll((Collection<? extends com.orka.orkametamodel.Container>) newValue);
			return;
		case MetamodelPackage.APPLICATION__IMAGE_REPOSITORY:
			setImageRepository((String) newValue);
			return;
		case MetamodelPackage.APPLICATION__PORT:
			setPort((Integer) newValue);
			return;
		case MetamodelPackage.APPLICATION__SECRET:
			setSecret((Secret) newValue);
			return;
		case MetamodelPackage.APPLICATION__CONFIGMAP:
			setConfigmap((ConfigMap) newValue);
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
		case MetamodelPackage.APPLICATION__REQUIRED_RESOURCES:
			getRequiredResources().clear();
			return;
		case MetamodelPackage.APPLICATION__SERVICES:
			getServices().clear();
			return;
		case MetamodelPackage.APPLICATION__CONTAINER:
			getContainer().clear();
			return;
		case MetamodelPackage.APPLICATION__IMAGE_REPOSITORY:
			setImageRepository(IMAGE_REPOSITORY_EDEFAULT);
			return;
		case MetamodelPackage.APPLICATION__PORT:
			setPort(PORT_EDEFAULT);
			return;
		case MetamodelPackage.APPLICATION__SECRET:
			setSecret((Secret) null);
			return;
		case MetamodelPackage.APPLICATION__CONFIGMAP:
			setConfigmap((ConfigMap) null);
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
		case MetamodelPackage.APPLICATION__REQUIRED_RESOURCES:
			return requiredResources != null && !requiredResources.isEmpty();
		case MetamodelPackage.APPLICATION__SERVICES:
			return services != null && !services.isEmpty();
		case MetamodelPackage.APPLICATION__CONTAINER:
			return container != null && !container.isEmpty();
		case MetamodelPackage.APPLICATION__IMAGE_REPOSITORY:
			return IMAGE_REPOSITORY_EDEFAULT == null ? imageRepository != null
					: !IMAGE_REPOSITORY_EDEFAULT.equals(imageRepository);
		case MetamodelPackage.APPLICATION__PORT:
			return port != PORT_EDEFAULT;
		case MetamodelPackage.APPLICATION__SECRET:
			return secret != null;
		case MetamodelPackage.APPLICATION__CONFIGMAP:
			return configmap != null;
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
		result.append(" (imageRepository: ");
		result.append(imageRepository);
		result.append(", port: ");
		result.append(port);
		result.append(')');
		return result.toString();
	}

} //ApplicationImpl
