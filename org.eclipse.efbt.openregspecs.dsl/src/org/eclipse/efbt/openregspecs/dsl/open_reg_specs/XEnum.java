/**
 */
package org.eclipse.efbt.openregspecs.dsl.open_reg_specs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XEnum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XEnum#getLiterals <em>Literals</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getXEnum()
 * @model
 * @generated
 */
public interface XEnum extends XDataType
{
	/**
	 * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XEnumLiteral}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XEnumLiteral#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literals</em>' containment reference list.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getXEnum_Literals()
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XEnumLiteral#getEnum
	 * @model opposite="enum" containment="true"
	 * @generated
	 */
	EList<XEnumLiteral> getLiterals();

} // XEnum
