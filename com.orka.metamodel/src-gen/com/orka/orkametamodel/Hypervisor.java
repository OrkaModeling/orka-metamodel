/**
 */
package com.orka.orkametamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Hypervisor</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.orka.orkametamodel.MetamodelPackage#getHypervisor()
 * @model
 * @generated
 */
public enum Hypervisor implements Enumerator {
	/**
	 * The '<em><b>VM Ware</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VM_WARE_VALUE
	 * @generated
	 * @ordered
	 */
	VM_WARE(0, "VMWare", "VMWare"),

	/**
	 * The '<em><b>Xen Server</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XEN_SERVER_VALUE
	 * @generated
	 * @ordered
	 */
	XEN_SERVER(2, "XenServer", "XenServer"),

	/**
	 * The '<em><b>RHEV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RHEV_VALUE
	 * @generated
	 * @ordered
	 */
	RHEV(3, "RHEV", "RHEV"),

	/**
	 * The '<em><b>KVM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KVM_VALUE
	 * @generated
	 * @ordered
	 */
	KVM(4, "KVM", "KVM");

	/**
	 * The '<em><b>VM Ware</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VM_WARE
	 * @model name="VMWare"
	 * @generated
	 * @ordered
	 */
	public static final int VM_WARE_VALUE = 0;

	/**
	 * The '<em><b>Xen Server</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XEN_SERVER
	 * @model name="XenServer"
	 * @generated
	 * @ordered
	 */
	public static final int XEN_SERVER_VALUE = 2;

	/**
	 * The '<em><b>RHEV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RHEV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RHEV_VALUE = 3;

	/**
	 * The '<em><b>KVM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KVM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KVM_VALUE = 4;

	/**
	 * An array of all the '<em><b>Hypervisor</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Hypervisor[] VALUES_ARRAY = new Hypervisor[] { VM_WARE, XEN_SERVER, RHEV, KVM, };

	/**
	 * A public read-only list of all the '<em><b>Hypervisor</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Hypervisor> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Hypervisor</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Hypervisor get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Hypervisor result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hypervisor</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Hypervisor getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Hypervisor result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hypervisor</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Hypervisor get(int value) {
		switch (value) {
		case VM_WARE_VALUE:
			return VM_WARE;
		case XEN_SERVER_VALUE:
			return XEN_SERVER;
		case RHEV_VALUE:
			return RHEV;
		case KVM_VALUE:
			return KVM;
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
	private Hypervisor(int value, String name, String literal) {
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

} //Hypervisor
