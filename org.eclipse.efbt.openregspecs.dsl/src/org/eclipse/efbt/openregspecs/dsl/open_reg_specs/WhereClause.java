/**
 */
package org.eclipse.efbt.openregspecs.dsl.open_reg_specs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Where Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.WhereClause#getAttribute1 <em>Attribute1</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.WhereClause#getComparitor <em>Comparitor</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.WhereClause#getMember <em>Member</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.WhereClause#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getWhereClause()
 * @model
 * @generated
 */
public interface WhereClause extends EObject
{
	/**
	 * Returns the value of the '<em><b>Attribute1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute1</em>' reference.
	 * @see #setAttribute1(XAttribute)
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getWhereClause_Attribute1()
	 * @model
	 * @generated
	 */
	XAttribute getAttribute1();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.WhereClause#getAttribute1 <em>Attribute1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute1</em>' reference.
	 * @see #getAttribute1()
	 * @generated
	 */
	void setAttribute1(XAttribute value);

	/**
	 * Returns the value of the '<em><b>Comparitor</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Comparitor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparitor</em>' attribute.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Comparitor
	 * @see #setComparitor(Comparitor)
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getWhereClause_Comparitor()
	 * @model
	 * @generated
	 */
	Comparitor getComparitor();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.WhereClause#getComparitor <em>Comparitor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparitor</em>' attribute.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Comparitor
	 * @see #getComparitor()
	 * @generated
	 */
	void setComparitor(Comparitor value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference.
	 * @see #setMember(XEnumLiteral)
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getWhereClause_Member()
	 * @model
	 * @generated
	 */
	XEnumLiteral getMember();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.WhereClause#getMember <em>Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' reference.
	 * @see #getMember()
	 * @generated
	 */
	void setMember(XEnumLiteral value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getWhereClause_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.WhereClause#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // WhereClause
