/**
 */
package org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl;

import java.util.Collection;

import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLEnrichedCube;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLTransformation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VTL Enriched Cube</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLEnrichedCubeImpl#getTransformations <em>Transformations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VTLEnrichedCubeImpl extends MinimalEObjectImpl.Container implements VTLEnrichedCube
{
	/**
	 * The cached value of the '{@link #getTransformations() <em>Transformations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformations()
	 * @generated
	 * @ordered
	 */
	protected EList<VTLTransformation> transformations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTLEnrichedCubeImpl()
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
		return Open_reg_specsPackage.eINSTANCE.getVTLEnrichedCube();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VTLTransformation> getTransformations()
	{
		if (transformations == null)
		{
			transformations = new EObjectResolvingEList<VTLTransformation>(VTLTransformation.class, this, Open_reg_specsPackage.VTL_ENRICHED_CUBE__TRANSFORMATIONS);
		}
		return transformations;
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
			case Open_reg_specsPackage.VTL_ENRICHED_CUBE__TRANSFORMATIONS:
				return getTransformations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case Open_reg_specsPackage.VTL_ENRICHED_CUBE__TRANSFORMATIONS:
				getTransformations().clear();
				getTransformations().addAll((Collection<? extends VTLTransformation>)newValue);
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
			case Open_reg_specsPackage.VTL_ENRICHED_CUBE__TRANSFORMATIONS:
				getTransformations().clear();
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
			case Open_reg_specsPackage.VTL_ENRICHED_CUBE__TRANSFORMATIONS:
				return transformations != null && !transformations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VTLEnrichedCubeImpl
