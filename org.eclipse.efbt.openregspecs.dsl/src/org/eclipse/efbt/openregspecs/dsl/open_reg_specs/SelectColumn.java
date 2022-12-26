/**
 */
package org.eclipse.efbt.openregspecs.dsl.open_reg_specs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectColumn#getAsAttribute <em>As Attribute</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getSelectColumn()
 * @model
 * @generated
 */
public interface SelectColumn extends EObject
{
	/**
	 * Returns the value of the '<em><b>As Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>As Attribute</em>' reference.
	 * @see #setAsAttribute(XOperation)
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getSelectColumn_AsAttribute()
	 * @model
	 * @generated
	 */
	XOperation getAsAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectColumn#getAsAttribute <em>As Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Attribute</em>' reference.
	 * @see #getAsAttribute()
	 * @generated
	 */
	void setAsAttribute(XOperation value);

} // SelectColumn
