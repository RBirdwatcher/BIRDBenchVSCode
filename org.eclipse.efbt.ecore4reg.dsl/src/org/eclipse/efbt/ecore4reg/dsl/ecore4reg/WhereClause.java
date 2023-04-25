/**
 */
package org.eclipse.efbt.ecore4reg.dsl.ecore4reg;

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
 *   <li>{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.WhereClause#getAttribute1 <em>Attribute1</em>}</li>
 *   <li>{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.WhereClause#getComparitor <em>Comparitor</em>}</li>
 *   <li>{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.WhereClause#getMember <em>Member</em>}</li>
 *   <li>{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.WhereClause#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Ecore4regPackage#getWhereClause()
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
	 * @see #setAttribute1(ELAttribute)
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Ecore4regPackage#getWhereClause_Attribute1()
	 * @model
	 * @generated
	 */
	ELAttribute getAttribute1();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.WhereClause#getAttribute1 <em>Attribute1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute1</em>' reference.
	 * @see #getAttribute1()
	 * @generated
	 */
	void setAttribute1(ELAttribute value);

	/**
	 * Returns the value of the '<em><b>Comparitor</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Comparitor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparitor</em>' attribute.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Comparitor
	 * @see #setComparitor(Comparitor)
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Ecore4regPackage#getWhereClause_Comparitor()
	 * @model
	 * @generated
	 */
	Comparitor getComparitor();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.WhereClause#getComparitor <em>Comparitor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparitor</em>' attribute.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Comparitor
	 * @see #getComparitor()
	 * @generated
	 */
	void setComparitor(Comparitor value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference.
	 * @see #setMember(ELEnumLiteral)
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Ecore4regPackage#getWhereClause_Member()
	 * @model
	 * @generated
	 */
	ELEnumLiteral getMember();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.WhereClause#getMember <em>Member</em>}' reference.
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
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Ecore4regPackage#getWhereClause_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.WhereClause#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // WhereClause
