/**
 */
package org.eclipse.efbt.ecore4reg.dsl.ecore4reg.impl;

import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Ecore4regPackage;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Gateway;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class GatewayImpl extends FlowNodeImpl implements Gateway
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GatewayImpl()
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
		return Ecore4regPackage.eINSTANCE.getGateway();
	}

} //GatewayImpl
