/**
 */
package org.eclipse.efbt.ecore4reg.dsl.ecore4reg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.DataConstraint#getAttr1 <em>Attr1</em>}</li>
 *   <li>{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.DataConstraint#getComparison <em>Comparison</em>}</li>
 *   <li>{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.DataConstraint#getMember <em>Member</em>}</li>
 *   <li>{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.DataConstraint#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Ecore4regPackage#getDataConstraint()
 * @model
 * @generated
 */
public interface DataConstraint extends EObject
{
	/**
	 * Returns the value of the '<em><b>Attr1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr1</em>' reference.
	 * @see #setAttr1(ELAttribute)
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Ecore4regPackage#getDataConstraint_Attr1()
	 * @model
	 * @generated
	 */
	ELAttribute getAttr1();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.DataConstraint#getAttr1 <em>Attr1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr1</em>' reference.
	 * @see #getAttr1()
	 * @generated
	 */
	void setAttr1(ELAttribute value);

	/**
	 * Returns the value of the '<em><b>Comparison</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.AttrComparison}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison</em>' attribute.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.AttrComparison
	 * @see #setComparison(AttrComparison)
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Ecore4regPackage#getDataConstraint_Comparison()
	 * @model
	 * @generated
	 */
	AttrComparison getComparison();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.DataConstraint#getComparison <em>Comparison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison</em>' attribute.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.AttrComparison
	 * @see #getComparison()
	 * @generated
	 */
	void setComparison(AttrComparison value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference.
	 * @see #setMember(ELEnumLiteral)
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Ecore4regPackage#getDataConstraint_Member()
	 * @model
	 * @generated
	 */
	ELEnumLiteral getMember();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.DataConstraint#getMember <em>Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' reference.
	 * @see #getMember()
	 * @generated
	 */
	void setMember(ELEnumLiteral value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Ecore4regPackage#getDataConstraint_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.DataConstraint#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // DataConstraint
