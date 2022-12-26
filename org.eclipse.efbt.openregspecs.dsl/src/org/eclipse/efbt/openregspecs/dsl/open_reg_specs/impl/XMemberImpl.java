/**
 */
package org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl;

import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XClass;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XMember;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XMember</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.XMemberImpl#getContainingClass <em>Containing Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class XMemberImpl extends XTypedElementImpl implements XMember
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMemberImpl()
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
		return Open_reg_specsPackage.eINSTANCE.getXMember();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XClass getContainingClass()
	{
		if (eContainerFeatureID() != Open_reg_specsPackage.XMEMBER__CONTAINING_CLASS) return null;
		return (XClass)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case Open_reg_specsPackage.XMEMBER__CONTAINING_CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, Open_reg_specsPackage.XMEMBER__CONTAINING_CLASS, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case Open_reg_specsPackage.XMEMBER__CONTAINING_CLASS:
				return eBasicSetContainer(null, Open_reg_specsPackage.XMEMBER__CONTAINING_CLASS, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
	{
		switch (eContainerFeatureID())
		{
			case Open_reg_specsPackage.XMEMBER__CONTAINING_CLASS:
				return eInternalContainer().eInverseRemove(this, Open_reg_specsPackage.XCLASS__MEMBERS, XClass.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case Open_reg_specsPackage.XMEMBER__CONTAINING_CLASS:
				return getContainingClass();
		}
		return super.eGet(featureID, resolve, coreType);
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
			case Open_reg_specsPackage.XMEMBER__CONTAINING_CLASS:
				return getContainingClass() != null;
		}
		return super.eIsSet(featureID);
	}

} //XMemberImpl
