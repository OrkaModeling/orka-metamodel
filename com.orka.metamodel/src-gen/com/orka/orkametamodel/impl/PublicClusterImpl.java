/**
 */
package com.orka.orkametamodel.impl;

import com.orka.orkametamodel.MetamodelPackage;
import com.orka.orkametamodel.Provider;
import com.orka.orkametamodel.PublicCluster;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Public Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.orka.orkametamodel.impl.PublicClusterImpl#getNum_nodes <em>Num nodes</em>}</li>
 *   <li>{@link com.orka.orkametamodel.impl.PublicClusterImpl#getConfig_file <em>Config file</em>}</li>
 *   <li>{@link com.orka.orkametamodel.impl.PublicClusterImpl#getProvider <em>Provider</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PublicClusterImpl extends ClusterImpl implements PublicCluster {
	/**
	 * The default value of the '{@link #getNum_nodes() <em>Num nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_nodes()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_NODES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNum_nodes() <em>Num nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNum_nodes()
	 * @generated
	 * @ordered
	 */
	protected int num_nodes = NUM_NODES_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfig_file() <em>Config file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig_file()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIG_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfig_file() <em>Config file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig_file()
	 * @generated
	 * @ordered
	 */
	protected String config_file = CONFIG_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected static final Provider PROVIDER_EDEFAULT = Provider.AWS;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected Provider provider = PROVIDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.PUBLIC_CLUSTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNum_nodes() {
		return num_nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNum_nodes(int newNum_nodes) {
		int oldNum_nodes = num_nodes;
		num_nodes = newNum_nodes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.PUBLIC_CLUSTER__NUM_NODES,
					oldNum_nodes, num_nodes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConfig_file() {
		return config_file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfig_file(String newConfig_file) {
		String oldConfig_file = config_file;
		config_file = newConfig_file;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.PUBLIC_CLUSTER__CONFIG_FILE,
					oldConfig_file, config_file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provider getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(Provider newProvider) {
		Provider oldProvider = provider;
		provider = newProvider == null ? PROVIDER_EDEFAULT : newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.PUBLIC_CLUSTER__PROVIDER,
					oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.PUBLIC_CLUSTER__NUM_NODES:
			return getNum_nodes();
		case MetamodelPackage.PUBLIC_CLUSTER__CONFIG_FILE:
			return getConfig_file();
		case MetamodelPackage.PUBLIC_CLUSTER__PROVIDER:
			return getProvider();
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
		case MetamodelPackage.PUBLIC_CLUSTER__NUM_NODES:
			setNum_nodes((Integer) newValue);
			return;
		case MetamodelPackage.PUBLIC_CLUSTER__CONFIG_FILE:
			setConfig_file((String) newValue);
			return;
		case MetamodelPackage.PUBLIC_CLUSTER__PROVIDER:
			setProvider((Provider) newValue);
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
		case MetamodelPackage.PUBLIC_CLUSTER__NUM_NODES:
			setNum_nodes(NUM_NODES_EDEFAULT);
			return;
		case MetamodelPackage.PUBLIC_CLUSTER__CONFIG_FILE:
			setConfig_file(CONFIG_FILE_EDEFAULT);
			return;
		case MetamodelPackage.PUBLIC_CLUSTER__PROVIDER:
			setProvider(PROVIDER_EDEFAULT);
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
		case MetamodelPackage.PUBLIC_CLUSTER__NUM_NODES:
			return num_nodes != NUM_NODES_EDEFAULT;
		case MetamodelPackage.PUBLIC_CLUSTER__CONFIG_FILE:
			return CONFIG_FILE_EDEFAULT == null ? config_file != null : !CONFIG_FILE_EDEFAULT.equals(config_file);
		case MetamodelPackage.PUBLIC_CLUSTER__PROVIDER:
			return provider != PROVIDER_EDEFAULT;
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
		result.append(" (num_nodes: ");
		result.append(num_nodes);
		result.append(", config_file: ");
		result.append(config_file);
		result.append(", provider: ");
		result.append(provider);
		result.append(')');
		return result.toString();
	}

} //PublicClusterImpl
