/**
 */
package com.orka.orkametamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Access Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.orka.orkametamodel.MetamodelPackage#getAccessMode()
 * @model
 * @generated
 */
public enum AccessMode implements Enumerator {
	/**
	 * The '<em><b>Read Write Once</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_WRITE_ONCE_VALUE
	 * @generated
	 * @ordered
	 */
	READ_WRITE_ONCE(0, "ReadWriteOnce", "ReadWriteOnce"),

	/**
	 * The '<em><b>Read Only Many</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_ONLY_MANY_VALUE
	 * @generated
	 * @ordered
	 */
	READ_ONLY_MANY(1, "ReadOnlyMany", "ReadOnlyMany"),

	/**
	 * The '<em><b>Read Write Many</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_WRITE_MANY_VALUE
	 * @generated
	 * @ordered
	 */
	READ_WRITE_MANY(2, "ReadWriteMany", "ReadWriteMany");

	/**
	 * The '<em><b>Read Write Once</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_WRITE_ONCE
	 * @model name="ReadWriteOnce"
	 * @generated
	 * @ordered
	 */
	public static final int READ_WRITE_ONCE_VALUE = 0;

	/**
	 * The '<em><b>Read Only Many</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_ONLY_MANY
	 * @model name="ReadOnlyMany"
	 * @generated
	 * @ordered
	 */
	public static final int READ_ONLY_MANY_VALUE = 1;

	/**
	 * The '<em><b>Read Write Many</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_WRITE_MANY
	 * @model name="ReadWriteMany"
	 * @generated
	 * @ordered
	 */
	public static final int READ_WRITE_MANY_VALUE = 2;

	/**
	 * An array of all the '<em><b>Access Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AccessMode[] VALUES_ARRAY = new AccessMode[] { READ_WRITE_ONCE, READ_ONLY_MANY,
			READ_WRITE_MANY, };

	/**
	 * A public read-only list of all the '<em><b>Access Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AccessMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Access Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AccessMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AccessMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Access Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AccessMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AccessMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Access Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AccessMode get(int value) {
		switch (value) {
		case READ_WRITE_ONCE_VALUE:
			return READ_WRITE_ONCE;
		case READ_ONLY_MANY_VALUE:
			return READ_ONLY_MANY;
		case READ_WRITE_MANY_VALUE:
			return READ_WRITE_MANY;
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
	private AccessMode(int value, String name, String literal) {
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

} //AccessMode
