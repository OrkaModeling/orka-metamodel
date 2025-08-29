/**
 */
package org.orka.orkametamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Monitoring Tool</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.orka.orkametamodel.MetamodelPackage#getMonitoringTool()
 * @model
 * @generated
 */
public enum MonitoringTool implements Enumerator {
	/**
	 * The '<em><b>Cloud Watch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOUD_WATCH_VALUE
	 * @generated
	 * @ordered
	 */
	CLOUD_WATCH(0, "CloudWatch", "CloudWatch"),

	/**
	 * The '<em><b>Azure Monitor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AZURE_MONITOR_VALUE
	 * @generated
	 * @ordered
	 */
	AZURE_MONITOR(1, "AzureMonitor", "AzureMonitor"),

	/**
	 * The '<em><b>Prometheus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROMETHEUS_VALUE
	 * @generated
	 * @ordered
	 */
	PROMETHEUS(2, "Prometheus", "Prometheus");

	/**
	 * The '<em><b>Cloud Watch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOUD_WATCH
	 * @model name="CloudWatch"
	 * @generated
	 * @ordered
	 */
	public static final int CLOUD_WATCH_VALUE = 0;

	/**
	 * The '<em><b>Azure Monitor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AZURE_MONITOR
	 * @model name="AzureMonitor"
	 * @generated
	 * @ordered
	 */
	public static final int AZURE_MONITOR_VALUE = 1;

	/**
	 * The '<em><b>Prometheus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROMETHEUS
	 * @model name="Prometheus"
	 * @generated
	 * @ordered
	 */
	public static final int PROMETHEUS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Monitoring Tool</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MonitoringTool[] VALUES_ARRAY = new MonitoringTool[] { CLOUD_WATCH, AZURE_MONITOR,
			PROMETHEUS, };

	/**
	 * A public read-only list of all the '<em><b>Monitoring Tool</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MonitoringTool> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Monitoring Tool</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MonitoringTool get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MonitoringTool result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Monitoring Tool</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MonitoringTool getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MonitoringTool result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Monitoring Tool</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MonitoringTool get(int value) {
		switch (value) {
		case CLOUD_WATCH_VALUE:
			return CLOUD_WATCH;
		case AZURE_MONITOR_VALUE:
			return AZURE_MONITOR;
		case PROMETHEUS_VALUE:
			return PROMETHEUS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MonitoringTool(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //MonitoringTool
