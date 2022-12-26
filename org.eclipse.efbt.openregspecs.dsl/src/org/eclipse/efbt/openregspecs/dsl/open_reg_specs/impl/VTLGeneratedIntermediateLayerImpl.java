/**
 */
package org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl;

import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLGeneratedIntermediateLayer;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLScheme;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VTL Generated Intermediate Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLGeneratedIntermediateLayerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLGeneratedIntermediateLayerImpl#getDependant_enriched_cubes <em>Dependant enriched cubes</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLGeneratedIntermediateLayerImpl#getTransformations <em>Transformations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VTLGeneratedIntermediateLayerImpl extends MinimalEObjectImpl.Container implements VTLGeneratedIntermediateLayer
{
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDependant_enriched_cubes() <em>Dependant enriched cubes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependant_enriched_cubes()
	 * @generated
	 * @ordered
	 */
	protected VTLScheme dependant_enriched_cubes;

	/**
	 * The cached value of the '{@link #getTransformations() <em>Transformations</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformations()
	 * @generated
	 * @ordered
	 */
	protected VTLScheme transformations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTLGeneratedIntermediateLayerImpl()
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
		return Open_reg_specsPackage.eINSTANCE.getVTLGeneratedIntermediateLayer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Open_reg_specsPackage.VTL_GENERATED_INTERMEDIATE_LAYER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTLScheme getDependant_enriched_cubes()
	{
		if (dependant_enriched_cubes != null && dependant_enriched_cubes.eIsProxy())
		{
			InternalEObject oldDependant_enriched_cubes = (InternalEObject)dependant_enriched_cubes;
			dependant_enriched_cubes = (VTLScheme)eResolveProxy(oldDependant_enriched_cubes);
			if (dependant_enriched_cubes != oldDependant_enriched_cubes)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Open_reg_specsPackage.VTL_GENERATED_INTERMEDIATE_LAYER__DEPENDANT_ENRICHED_CUBES, oldDependant_enriched_cubes, dependant_enriched_cubes));
			}
		}
		return dependant_enriched_cubes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTLScheme basicGetDependant_enriched_cubes()
	{
		return dependant_enriched_cubes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependant_enriched_cubes(VTLScheme newDependant_enriched_cubes)
	{
		VTLScheme oldDependant_enriched_cubes = dependant_enriched_cubes;
		dependant_enriched_cubes = newDependant_enriched_cubes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Open_reg_specsPackage.VTL_GENERATED_INTERMEDIATE_LAYER__DEPENDANT_ENRICHED_CUBES, oldDependant_enriched_cubes, dependant_enriched_cubes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTLScheme getTransformations()
	{
		if (transformations != null && transformations.eIsProxy())
		{
			InternalEObject oldTransformations = (InternalEObject)transformations;
			transformations = (VTLScheme)eResolveProxy(oldTransformations);
			if (transformations != oldTransformations)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Open_reg_specsPackage.VTL_GENERATED_INTERMEDIATE_LAYER__TRANSFORMATIONS, oldTransformations, transformations));
			}
		}
		return transformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTLScheme basicGetTransformations()
	{
		return transformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformations(VTLScheme newTransformations)
	{
		VTLScheme oldTransformations = transformations;
		transformations = newTransformations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Open_reg_specsPackage.VTL_GENERATED_INTERMEDIATE_LAYER__TRANSFORMATIONS, oldTransformations, transformations));
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
			case Open_reg_specsPackage.VTL_GENERATED_INTERMEDIATE_LAYER__NAME:
				return getName();
			case Open_reg_specsPackage.VTL_GENERATED_INTERMEDIATE_LAYER__DEPENDANT_ENRICHED_CUBES:
				if (resolve) return getDependant_enriched_cubes();
				return basicGetDependant_enriched_cubes();
			case Open_reg_specsPackage.VTL_GENERATED_INTERMEDIATE_LAYER__TRANSFORMATIONS:
				if (resolve) return getTransformations();
				return basicGetTransformations();
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
			case Open_reg_specsPackage.VTL_GENERATED_INTERMEDIATE_LAYER__NAME:
				setName((String)newValue);
				return;
			case Open_reg_specsPackage.VTL_GENERATED_INTERMEDIATE_LAYER__DEPENDANT_ENRICHED_CUBES:
				setDependant_enriched_cubes((VTLScheme)newValue);
				return;
			case Open_reg_specsPackage.VTL_GENERATED_INTERMEDIATE_LAYER__TRANSFORMATIONS:
				setTransformations((VTLScheme)newValue);
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
			case Open_reg_specsPackage.VTL_GENERATED_INTERMEDIATE_LAYER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Open_reg_specsPackage.VTL_GENERATED_INTERMEDIATE_LAYER__DEPENDANT_ENRICHED_CUBES:
				setDependant_enriched_cubes((VTLScheme)null);
				return;
			case Open_reg_specsPackage.VTL_GENERATED_INTERMEDIATE_LAYER__TRANSFORMATIONS:
				setTransformations((VTLScheme)null);
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
			case Open_reg_specsPackage.VTL_GENERATED_INTERMEDIATE_LAYER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Open_reg_specsPackage.VTL_GENERATED_INTERMEDIATE_LAYER__DEPENDANT_ENRICHED_CUBES:
				return dependant_enriched_cubes != null;
			case Open_reg_specsPackage.VTL_GENERATED_INTERMEDIATE_LAYER__TRANSFORMATIONS:
				return transformations != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //VTLGeneratedIntermediateLayerImpl
