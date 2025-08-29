/**
 */
package org.orka.orkametamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>IP Range Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.orka.orkametamodel.MetamodelPackage#getIPRangeType()
 * @model
 * @generated
 */
public enum IPRangeType implements Enumerator {
	/**
	 * The '<em><b>Subnetwork</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBNETWORK_VALUE
	 * @generated
	 * @ordered
	 */
	SUBNETWORK(0, "Subnetwork", "Subnetwork"),

	/**
	 * The '<em><b>Pod</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POD_VALUE
	 * @generated
	 * @ordered
	 */
	POD(1, "Pod", "Pod"),

	/**
	 * The '<em><b>Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE(2, "Service", "Service");

	/**
	 * The '<em><b>Subnetwork</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBNETWORK
	 * @model name="Subnetwork"
	 * @generated
	 * @ordered
	 */
	public static final int SUBNETWORK_VALUE = 0;

	/**
	 * The '<em><b>Pod</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POD
	 * @model name="Pod"
	 * @generated
	 * @ordered
	 */
	public static final int POD_VALUE = 1;

	/**
	 * The '<em><b>Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE
	 * @model name="Service"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_VALUE = 2;

	/**
	 * An array of all the '<em><b>IP Range Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IPRangeType[] VALUES_ARRAY = new IPRangeType[] { SUBNETWORK, POD, SERVICE, };

	/**
	 * A public read-only list of all the '<em><b>IP Range Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IPRangeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>IP Range Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IPRangeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IPRangeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>IP Range Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IPRangeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IPRangeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>IP Range Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IPRangeType get(int value) {
		switch (value) {
		case SUBNETWORK_VALUE:
			return SUBNETWORK;
		case POD_VALUE:
			return POD;
		case SERVICE_VALUE:
			return SERVICE;
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
	private IPRangeType(int value, String name, String literal) {
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

} //IPRangeType
