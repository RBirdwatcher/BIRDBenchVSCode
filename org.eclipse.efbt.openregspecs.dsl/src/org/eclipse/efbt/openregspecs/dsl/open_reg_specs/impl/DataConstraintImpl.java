/**
 */
package org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl;

import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.AttrComparison;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.DataConstraint;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XAttribute;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XEnumLiteral;

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
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.DataConstraintImpl#getAttr1 <em>Attr1</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.DataConstraintImpl#getComparison <em>Comparison</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.DataConstraintImpl#getMember <em>Member</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.DataConstraintImpl#getValue <em>Value</em>}</li>
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
	protected XAttribute attr1;

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
	protected XEnumLiteral member;

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
		return Open_reg_specsPackage.eINSTANCE.getDataConstraint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAttribute getAttr1()
	{
		if (attr1 != null && attr1.eIsProxy())
		{
			InternalEObject oldAttr1 = (InternalEObject)attr1;
			attr1 = (XAttribute)eResolveProxy(oldAttr1);
			if (attr1 != oldAttr1)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Open_reg_specsPackage.DATA_CONSTRAINT__ATTR1, oldAttr1, attr1));
			}
		}
		return attr1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAttribute basicGetAttr1()
	{
		return attr1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttr1(XAttribute newAttr1)
	{
		XAttribute oldAttr1 = attr1;
		attr1 = newAttr1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Open_reg_specsPackage.DATA_CONSTRAINT__ATTR1, oldAttr1, attr1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Open_reg_specsPackage.DATA_CONSTRAINT__COMPARISON, oldComparison, comparison));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XEnumLiteral getMember()
	{
		if (member != null && member.eIsProxy())
		{
			InternalEObject oldMember = (InternalEObject)member;
			member = (XEnumLiteral)eResolveProxy(oldMember);
			if (member != oldMember)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Open_reg_specsPackage.DATA_CONSTRAINT__MEMBER, oldMember, member));
			}
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XEnumLiteral basicGetMember()
	{
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMember(XEnumLiteral newMember)
	{
		XEnumLiteral oldMember = member;
		member = newMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Open_reg_specsPackage.DATA_CONSTRAINT__MEMBER, oldMember, member));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Open_reg_specsPackage.DATA_CONSTRAINT__VALUE, oldValue, value));
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
			case Open_reg_specsPackage.DATA_CONSTRAINT__ATTR1:
				if (resolve) return getAttr1();
				return basicGetAttr1();
			case Open_reg_specsPackage.DATA_CONSTRAINT__COMPARISON:
				return getComparison();
			case Open_reg_specsPackage.DATA_CONSTRAINT__MEMBER:
				if (resolve) return getMember();
				return basicGetMember();
			case Open_reg_specsPackage.DATA_CONSTRAINT__VALUE:
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
			case Open_reg_specsPackage.DATA_CONSTRAINT__ATTR1:
				setAttr1((XAttribute)newValue);
				return;
			case Open_reg_specsPackage.DATA_CONSTRAINT__COMPARISON:
				setComparison((AttrComparison)newValue);
				return;
			case Open_reg_specsPackage.DATA_CONSTRAINT__MEMBER:
				setMember((XEnumLiteral)newValue);
				return;
			case Open_reg_specsPackage.DATA_CONSTRAINT__VALUE:
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
			case Open_reg_specsPackage.DATA_CONSTRAINT__ATTR1:
				setAttr1((XAttribute)null);
				return;
			case Open_reg_specsPackage.DATA_CONSTRAINT__COMPARISON:
				setComparison(COMPARISON_EDEFAULT);
				return;
			case Open_reg_specsPackage.DATA_CONSTRAINT__MEMBER:
				setMember((XEnumLiteral)null);
				return;
			case Open_reg_specsPackage.DATA_CONSTRAINT__VALUE:
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
			case Open_reg_specsPackage.DATA_CONSTRAINT__ATTR1:
				return attr1 != null;
			case Open_reg_specsPackage.DATA_CONSTRAINT__COMPARISON:
				return comparison != COMPARISON_EDEFAULT;
			case Open_reg_specsPackage.DATA_CONSTRAINT__MEMBER:
				return member != null;
			case Open_reg_specsPackage.DATA_CONSTRAINT__VALUE:
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
