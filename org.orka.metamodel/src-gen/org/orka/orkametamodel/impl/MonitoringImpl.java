/**
 */
package org.orka.orkametamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.orka.orkametamodel.Application;
import org.orka.orkametamodel.Cluster;
import org.orka.orkametamodel.MetamodelPackage;
import org.orka.orkametamodel.Monitoring;
import org.orka.orkametamodel.MonitoringTool;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monitoring</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.orka.orkametamodel.impl.MonitoringImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.MonitoringImpl#getTool <em>Tool</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.MonitoringImpl#getCluster <em>Cluster</em>}</li>
 *   <li>{@link org.orka.orkametamodel.impl.MonitoringImpl#getApplication <em>Application</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MonitoringImpl extends MinimalEObjectImpl.Container implements Monitoring {
	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean enabled = ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTool() <em>Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool()
	 * @generated
	 * @ordered
	 */
	protected static final MonitoringTool TOOL_EDEFAULT = MonitoringTool.CLOUD_WATCH;

	/**
	 * The cached value of the '{@link #getTool() <em>Tool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTool()
	 * @generated
	 * @ordered
	 */
	protected MonitoringTool tool = TOOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCluster() <em>Cluster</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCluster()
	 * @generated
	 * @ordered
	 */
	protected Cluster cluster;

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
	protected MonitoringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.MONITORING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(boolean newEnabled) {
		boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MONITORING__ENABLED, oldEnabled,
					enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoringTool getTool() {
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTool(MonitoringTool newTool) {
		MonitoringTool oldTool = tool;
		tool = newTool == null ? TOOL_EDEFAULT : newTool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MONITORING__TOOL, oldTool, tool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cluster getCluster() {
		if (cluster != null && cluster.eIsProxy()) {
			InternalEObject oldCluster = (InternalEObject) cluster;
			cluster = (Cluster) eResolveProxy(oldCluster);
			if (cluster != oldCluster) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.MONITORING__CLUSTER,
							oldCluster, cluster));
			}
		}
		return cluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cluster basicGetCluster() {
		return cluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCluster(Cluster newCluster) {
		Cluster oldCluster = cluster;
		cluster = newCluster;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MONITORING__CLUSTER, oldCluster,
					cluster));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.MONITORING__APPLICATION,
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
	public void setApplication(Application newApplication) {
		Application oldApplication = application;
		application = newApplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.MONITORING__APPLICATION,
					oldApplication, application));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.MONITORING__ENABLED:
			return isEnabled();
		case MetamodelPackage.MONITORING__TOOL:
			return getTool();
		case MetamodelPackage.MONITORING__CLUSTER:
			if (resolve)
				return getCluster();
			return basicGetCluster();
		case MetamodelPackage.MONITORING__APPLICATION:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MetamodelPackage.MONITORING__ENABLED:
			setEnabled((Boolean) newValue);
			return;
		case MetamodelPackage.MONITORING__TOOL:
			setTool((MonitoringTool) newValue);
			return;
		case MetamodelPackage.MONITORING__CLUSTER:
			setCluster((Cluster) newValue);
			return;
		case MetamodelPackage.MONITORING__APPLICATION:
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
		case MetamodelPackage.MONITORING__ENABLED:
			setEnabled(ENABLED_EDEFAULT);
			return;
		case MetamodelPackage.MONITORING__TOOL:
			setTool(TOOL_EDEFAULT);
			return;
		case MetamodelPackage.MONITORING__CLUSTER:
			setCluster((Cluster) null);
			return;
		case MetamodelPackage.MONITORING__APPLICATION:
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
		case MetamodelPackage.MONITORING__ENABLED:
			return enabled != ENABLED_EDEFAULT;
		case MetamodelPackage.MONITORING__TOOL:
			return tool != TOOL_EDEFAULT;
		case MetamodelPackage.MONITORING__CLUSTER:
			return cluster != null;
		case MetamodelPackage.MONITORING__APPLICATION:
			return application != null;
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
		result.append(" (enabled: ");
		result.append(enabled);
		result.append(", tool: ");
		result.append(tool);
		result.append(')');
		return result.toString();
	}

} //MonitoringImpl
