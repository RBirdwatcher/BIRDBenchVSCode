/**
 */
package org.eclipse.efbt.ecore4reg.dsl.ecore4reg.impl;

import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.AttrComparison;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.DataConstraint;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELAttribute;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELEnumLiteral;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Ecore4regPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.impl.DataConstraintImpl#getAttr1 <em>Attr1</em>}</li>
 *   <li>{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.impl.DataConstraintImpl#getComparison <em>Comparison</em>}</li>
 *   <li>{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.impl.DataConstraintImpl#getMember <em>Member</em>}</li>
 *   <li>{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.impl.DataConstraintImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataConstraintImpl extends MinimalEObjectImpl.Container implements DataConstraint
{
	/**
	 * The cached value of the '{@link #getAttr1() <em>Attr1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttr1()
	 * @generated
	 * @ordered
	 */
	protected ELAttribute attr1;

	/**
	 * The default value of the '{@link #getComparison() <em>Comparison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparison()
	 * @generated
	 * @ordered
	 */
	protected static final AttrComparison COMPARISON_EDEFAULT = AttrComparison.EQUALS;

	/**
	 * The cached value of the '{@link #getComparison() <em>Comparison</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparison()
	 * @generated
	 * @ordered
	 */
	protected AttrComparison comparison = COMPARISON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected ELEnumLiteral member;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataConstraintImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return Ecore4regPackage.eINSTANCE.getDataConstraint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELAttribute getAttr1()
	{
		if (attr1 != null && attr1.eIsProxy())
		{
			InternalEObject oldAttr1 = (InternalEObject)attr1;
			attr1 = (ELAttribute)eResolveProxy(oldAttr1);
			if (attr1 != oldAttr1)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ecore4regPackage.DATA_CONSTRAINT__ATTR1, oldAttr1, attr1));
			}
		}
		return attr1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELAttribute basicGetAttr1()
	{
		return attr1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttr1(ELAttribute newAttr1)
	{
		ELAttribute oldAttr1 = attr1;
		attr1 = newAttr1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ecore4regPackage.DATA_CONSTRAINT__ATTR1, oldAttr1, attr1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttrComparison getComparison()
	{
		return comparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparison(AttrComparison newComparison)
	{
		AttrComparison oldComparison = comparison;
		comparison = newComparison == null ? COMPARISON_EDEFAULT : newComparison;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ecore4regPackage.DATA_CONSTRAINT__COMPARISON, oldComparison, comparison));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELEnumLiteral getMember()
	{
		if (member != null && member.eIsProxy())
		{
			InternalEObject oldMember = (InternalEObject)member;
			member = (ELEnumLiteral)eResolveProxy(oldMember);
			if (member != oldMember)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ecore4regPackage.DATA_CONSTRAINT__MEMBER, oldMember, member));
			}
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELEnumLiteral basicGetMember()
	{
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMember(ELEnumLiteral newMember)
	{
		ELEnumLiteral oldMember = member;
		member = newMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ecore4regPackage.DATA_CONSTRAINT__MEMBER, oldMember, member));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue()
	{
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue)
	{
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ecore4regPackage.DATA_CONSTRAINT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case Ecore4regPackage.DATA_CONSTRAINT__ATTR1:
				if (resolve) return getAttr1();
				return basicGetAttr1();
			case Ecore4regPackage.DATA_CONSTRAINT__COMPARISON:
				return getComparison();
			case Ecore4regPackage.DATA_CONSTRAINT__MEMBER:
				if (resolve) return getMember();
				return basicGetMember();
			case Ecore4regPackage.DATA_CONSTRAINT__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case Ecore4regPackage.DATA_CONSTRAINT__ATTR1:
				setAttr1((ELAttribute)newValue);
				return;
			case Ecore4regPackage.DATA_CONSTRAINT__COMPARISON:
				setComparison((AttrComparison)newValue);
				return;
			case Ecore4regPackage.DATA_CONSTRAINT__MEMBER:
				setMember((ELEnumLiteral)newValue);
				return;
			case Ecore4regPackage.DATA_CONSTRAINT__VALUE:
				setValue((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case Ecore4regPackage.DATA_CONSTRAINT__ATTR1:
				setAttr1((ELAttribute)null);
				return;
			case Ecore4regPackage.DATA_CONSTRAINT__COMPARISON:
				setComparison(COMPARISON_EDEFAULT);
				return;
			case Ecore4regPackage.DATA_CONSTRAINT__MEMBER:
				setMember((ELEnumLiteral)null);
				return;
			case Ecore4regPackage.DATA_CONSTRAINT__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case Ecore4regPackage.DATA_CONSTRAINT__ATTR1:
				return attr1 != null;
			case Ecore4regPackage.DATA_CONSTRAINT__COMPARISON:
				return comparison != COMPARISON_EDEFAULT;
			case Ecore4regPackage.DATA_CONSTRAINT__MEMBER:
				return member != null;
			case Ecore4regPackage.DATA_CONSTRAINT__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (comparison: ");
		result.append(comparison);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //DataConstraintImpl
