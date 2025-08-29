/**
 */
package com.orka.orkametamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>On Premises</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.orka.orkametamodel.OnPremises#getHypervisor <em>Hypervisor</em>}</li>
 * </ul>
 *
 * @see com.orka.orkametamodel.MetamodelPackage#getOnPremises()
 * @model
 * @generated
 */
public interface OnPremises extends Cluster {
	/**
	 * Returns the value of the '<em><b>Hypervisor</b></em>' attribute.
	 * The default value is <code>"VMWare"</code>.
	 * The literals are from the enumeration {@link com.orka.orkametamodel.Hypervisor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hypervisor</em>' attribute.
	 * @see com.orka.orkametamodel.Hypervisor
	 * @see #setHypervisor(Hypervisor)
	 * @see com.orka.orkametamodel.MetamodelPackage#getOnPremises_Hypervisor()
	 * @model default="VMWare"
	 * @generated
	 */
	Hypervisor getHypervisor();

	/**
	 * Sets the value of the '{@link com.orka.orkametamodel.OnPremises#getHypervisor <em>Hypervisor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hypervisor</em>' attribute.
	 * @see com.orka.orkametamodel.Hypervisor
	 * @see #getHypervisor()
	 * @generated
	 */
	void setHypervisor(Hypervisor value);

} // OnPremises
