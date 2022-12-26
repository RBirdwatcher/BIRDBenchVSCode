/**
 */
package org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl;

import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectColumnMemberAs;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XEnumLiteral;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Column Member As</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.SelectColumnMemberAsImpl#getMemberAsConstant <em>Member As Constant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectColumnMemberAsImpl extends SelectColumnImpl implements SelectColumnMemberAs
{
	/**
	 * The cached value of the '{@link #getMemberAsConstant() <em>Member As Constant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberAsConstant()
	 * @generated
	 * @ordered
	 */
	protected XEnumLiteral memberAsConstant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectColumnMemberAsImpl()
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
		return Open_reg_specsPackage.eINSTANCE.getSelectColumnMemberAs();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XEnumLiteral getMemberAsConstant()
	{
		if (memberAsConstant != null && memberAsConstant.eIsProxy())
		{
			InternalEObject oldMemberAsConstant = (InternalEObject)memberAsConstant;
			memberAsConstant = (XEnumLiteral)eResolveProxy(oldMemberAsConstant);
			if (memberAsConstant != oldMemberAsConstant)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Open_reg_specsPackage.SELECT_COLUMN_MEMBER_AS__MEMBER_AS_CONSTANT, oldMemberAsConstant, memberAsConstant));
			}
		}
		return memberAsConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XEnumLiteral basicGetMemberAsConstant()
	{
		return memberAsConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberAsConstant(XEnumLiteral newMemberAsConstant)
	{
		XEnumLiteral oldMemberAsConstant = memberAsConstant;
		memberAsConstant = newMemberAsConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Open_reg_specsPackage.SELECT_COLUMN_MEMBER_AS__MEMBER_AS_CONSTANT, oldMemberAsConstant, memberAsConstant));
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
			case Open_reg_specsPackage.SELECT_COLUMN_MEMBER_AS__MEMBER_AS_CONSTANT:
				if (resolve) return getMemberAsConstant();
				return basicGetMemberAsConstant();
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
			case Open_reg_specsPackage.SELECT_COLUMN_MEMBER_AS__MEMBER_AS_CONSTANT:
				setMemberAsConstant((XEnumLiteral)newValue);
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
			case Open_reg_specsPackage.SELECT_COLUMN_MEMBER_AS__MEMBER_AS_CONSTANT:
				setMemberAsConstant((XEnumLiteral)null);
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
			case Open_reg_specsPackage.SELECT_COLUMN_MEMBER_AS__MEMBER_AS_CONSTANT:
				return memberAsConstant != null;
		}
		return super.eIsSet(featureID);
	}

} //SelectColumnMemberAsImpl
