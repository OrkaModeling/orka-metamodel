/**
 */
package com.orka.orkametamodel.impl;

import com.orka.orkametamodel.Ingress;
import com.orka.orkametamodel.MetamodelPackage;
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
 * An implementation of the model object '<em><b>Ingress</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.orka.orkametamodel.impl.IngressImpl#getHost <em>Host</em>}</li>
 *   <li>{@link com.orka.orkametamodel.impl.IngressImpl#getPath <em>Path</em>}</li>
 *   <li>{@link com.orka.orkametamodel.impl.IngressImpl#getTlsSecret <em>Tls Secret</em>}</li>
 *   <li>{@link com.orka.orkametamodel.impl.IngressImpl#getService <em>Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IngressImpl extends MinimalEObjectImpl.Container implements Ingress {
	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected String host = HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTlsSecret() <em>Tls Secret</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTlsSecret()
	 * @generated
	 * @ordered
	 */
	protected Secret tlsSecret;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> service;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IngressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.INGRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(String newHost) {
		String oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.INGRESS__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.INGRESS__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Secret getTlsSecret() {
		if (tlsSecret != null && tlsSecret.eIsProxy()) {
			InternalEObject oldTlsSecret = (InternalEObject) tlsSecret;
			tlsSecret = (Secret) eResolveProxy(oldTlsSecret);
			if (tlsSecret != oldTlsSecret) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.INGRESS__TLS_SECRET,
							oldTlsSecret, tlsSecret));
			}
		}
		return tlsSecret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Secret basicGetTlsSecret() {
		return tlsSecret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTlsSecret(Secret newTlsSecret) {
		Secret oldTlsSecret = tlsSecret;
		tlsSecret = newTlsSecret;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.INGRESS__TLS_SECRET, oldTlsSecret,
					tlsSecret));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getService() {
		if (service == null) {
			service = new EObjectWithInverseResolvingEList<Service>(Service.class, this,
					MetamodelPackage.INGRESS__SERVICE, MetamodelPackage.SERVICE__INGRESS);
		}
		return service;
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
		case MetamodelPackage.INGRESS__SERVICE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getService()).basicAdd(otherEnd, msgs);
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
		case MetamodelPackage.INGRESS__SERVICE:
			return ((InternalEList<?>) getService()).basicRemove(otherEnd, msgs);
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
		case MetamodelPackage.INGRESS__HOST:
			return getHost();
		case MetamodelPackage.INGRESS__PATH:
			return getPath();
		case MetamodelPackage.INGRESS__TLS_SECRET:
			if (resolve)
				return getTlsSecret();
			return basicGetTlsSecret();
		case MetamodelPackage.INGRESS__SERVICE:
			return getService();
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
		case MetamodelPackage.INGRESS__HOST:
			setHost((String) newValue);
			return;
		case MetamodelPackage.INGRESS__PATH:
			setPath((String) newValue);
			return;
		case MetamodelPackage.INGRESS__TLS_SECRET:
			setTlsSecret((Secret) newValue);
			return;
		case MetamodelPackage.INGRESS__SERVICE:
			getService().clear();
			getService().addAll((Collection<? extends Service>) newValue);
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
		case MetamodelPackage.INGRESS__HOST:
			setHost(HOST_EDEFAULT);
			return;
		case MetamodelPackage.INGRESS__PATH:
			setPath(PATH_EDEFAULT);
			return;
		case MetamodelPackage.INGRESS__TLS_SECRET:
			setTlsSecret((Secret) null);
			return;
		case MetamodelPackage.INGRESS__SERVICE:
			getService().clear();
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
		case MetamodelPackage.INGRESS__HOST:
			return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
		case MetamodelPackage.INGRESS__PATH:
			return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
		case MetamodelPackage.INGRESS__TLS_SECRET:
			return tlsSecret != null;
		case MetamodelPackage.INGRESS__SERVICE:
			return service != null && !service.isEmpty();
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
		result.append(" (host: ");
		result.append(host);
		result.append(", path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

} //IngressImpl
