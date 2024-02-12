/**
 */
package org.eclipse.efbt.regdna.dsl.regdna;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EL Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.regdna.dsl.regdna.ELEnum#getELiterals <em>ELiterals</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.regdna.dsl.regdna.regdnaPackage#getELEnum()
 * @model
 * @generated
 */
public interface ELEnum extends ELDataType
{
	/**
	 * Returns the value of the '<em><b>ELiterals</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.efbt.regdna.dsl.regdna.ELEnumLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ELiterals</em>' containment reference list.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.regdnaPackage#getELEnum_ELiterals()
	 * @model containment="true"
	 * @generated
	 */
	EList<ELEnumLiteral> getELiterals();

} // ELEnum
