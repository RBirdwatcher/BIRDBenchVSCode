/**
 */
package org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl;

import java.util.Collection;

import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForOutputLayerAndIntermediateLayerCombination;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLGeneratedIntermediateLayer;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLGeneratedOutputlayer;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLTransformation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VTL For Output Layer And Intermediate Layer Combination</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLForOutputLayerAndIntermediateLayerCombinationImpl#getTransformations <em>Transformations</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLForOutputLayerAndIntermediateLayerCombinationImpl#getOutputLayer <em>Output Layer</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLForOutputLayerAndIntermediateLayerCombinationImpl#getIntermediateLayer <em>Intermediate Layer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VTLForOutputLayerAndIntermediateLayerCombinationImpl extends MinimalEObjectImpl.Container implements VTLForOutputLayerAndIntermediateLayerCombination
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
	 * The cached value of the '{@link #getOutputLayer() <em>Output Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputLayer()
	 * @generated
	 * @ordered
	 */
	protected VTLGeneratedOutputlayer outputLayer;

	/**
	 * The cached value of the '{@link #getIntermediateLayer() <em>Intermediate Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediateLayer()
	 * @generated
	 * @ordered
	 */
	protected VTLGeneratedIntermediateLayer intermediateLayer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTLForOutputLayerAndIntermediateLayerCombinationImpl()
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
		return Open_reg_specsPackage.eINSTANCE.getVTLForOutputLayerAndIntermediateLayerCombination();
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
			transformations = new EObjectResolvingEList<VTLTransformation>(VTLTransformation.class, this, Open_reg_specsPackage.VTL_FOR_OUTPUT_LAYER_AND_INTERMEDIATE_LAYER_COMBINATION__TRANSFORMATIONS);
		}
		return transformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTLGeneratedOutputlayer getOutputLayer()
	{
		if (outputLayer != null && outputLayer.eIsProxy())
		{
			InternalEObject oldOutputLayer = (InternalEObject)outputLayer;
			outputLayer = (VTLGeneratedOutputlayer)eResolveProxy(oldOutputLayer);
			if (outputLayer != oldOutputLayer)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Open_reg_specsPackage.VTL_FOR_OUTPUT_LAYER_AND_INTERMEDIATE_LAYER_COMBINATION__OUTPUT_LAYER, oldOutputLayer, outputLayer));
			}
		}
		return outputLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTLGeneratedOutputlayer basicGetOutputLayer()
	{
		return outputLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputLayer(VTLGeneratedOutputlayer newOutputLayer)
	{
		VTLGeneratedOutputlayer oldOutputLayer = outputLayer;
		outputLayer = newOutputLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Open_reg_specsPackage.VTL_FOR_OUTPUT_LAYER_AND_INTERMEDIATE_LAYER_COMBINATION__OUTPUT_LAYER, oldOutputLayer, outputLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTLGeneratedIntermediateLayer getIntermediateLayer()
	{
		if (intermediateLayer != null && intermediateLayer.eIsProxy())
		{
			InternalEObject oldIntermediateLayer = (InternalEObject)intermediateLayer;
			intermediateLayer = (VTLGeneratedIntermediateLayer)eResolveProxy(oldIntermediateLayer);
			if (intermediateLayer != oldIntermediateLayer)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Open_reg_specsPackage.VTL_FOR_OUTPUT_LAYER_AND_INTERMEDIATE_LAYER_COMBINATION__INTERMEDIATE_LAYER, oldIntermediateLayer, intermediateLayer));
			}
		}
		return intermediateLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTLGeneratedIntermediateLayer basicGetIntermediateLayer()
	{
		return intermediateLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntermediateLayer(VTLGeneratedIntermediateLayer newIntermediateLayer)
	{
		VTLGeneratedIntermediateLayer oldIntermediateLayer = intermediateLayer;
		intermediateLayer = newIntermediateLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Open_reg_specsPackage.VTL_FOR_OUTPUT_LAYER_AND_INTERMEDIATE_LAYER_COMBINATION__INTERMEDIATE_LAYER, oldIntermediateLayer, intermediateLayer));
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
			case Open_reg_specsPackage.VTL_FOR_OUTPUT_LAYER_AND_INTERMEDIATE_LAYER_COMBINATION__TRANSFORMATIONS:
				return getTransformations();
			case Open_reg_specsPackage.VTL_FOR_OUTPUT_LAYER_AND_INTERMEDIATE_LAYER_COMBINATION__OUTPUT_LAYER:
				if (resolve) return getOutputLayer();
				return basicGetOutputLayer();
			case Open_reg_specsPackage.VTL_FOR_OUTPUT_LAYER_AND_INTERMEDIATE_LAYER_COMBINATION__INTERMEDIATE_LAYER:
				if (resolve) return getIntermediateLayer();
				return basicGetIntermediateLayer();
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
			case Open_reg_specsPackage.VTL_FOR_OUTPUT_LAYER_AND_INTERMEDIATE_LAYER_COMBINATION__TRANSFORMATIONS:
				getTransformations().clear();
				getTransformations().addAll((Collection<? extends VTLTransformation>)newValue);
				return;
			case Open_reg_specsPackage.VTL_FOR_OUTPUT_LAYER_AND_INTERMEDIATE_LAYER_COMBINATION__OUTPUT_LAYER:
				setOutputLayer((VTLGeneratedOutputlayer)newValue);
				return;
			case Open_reg_specsPackage.VTL_FOR_OUTPUT_LAYER_AND_INTERMEDIATE_LAYER_COMBINATION__INTERMEDIATE_LAYER:
				setIntermediateLayer((VTLGeneratedIntermediateLayer)newValue);
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
			case Open_reg_specsPackage.VTL_FOR_OUTPUT_LAYER_AND_INTERMEDIATE_LAYER_COMBINATION__TRANSFORMATIONS:
				getTransformations().clear();
				return;
			case Open_reg_specsPackage.VTL_FOR_OUTPUT_LAYER_AND_INTERMEDIATE_LAYER_COMBINATION__OUTPUT_LAYER:
				setOutputLayer((VTLGeneratedOutputlayer)null);
				return;
			case Open_reg_specsPackage.VTL_FOR_OUTPUT_LAYER_AND_INTERMEDIATE_LAYER_COMBINATION__INTERMEDIATE_LAYER:
				setIntermediateLayer((VTLGeneratedIntermediateLayer)null);
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
			case Open_reg_specsPackage.VTL_FOR_OUTPUT_LAYER_AND_INTERMEDIATE_LAYER_COMBINATION__TRANSFORMATIONS:
				return transformations != null && !transformations.isEmpty();
			case Open_reg_specsPackage.VTL_FOR_OUTPUT_LAYER_AND_INTERMEDIATE_LAYER_COMBINATION__OUTPUT_LAYER:
				return outputLayer != null;
			case Open_reg_specsPackage.VTL_FOR_OUTPUT_LAYER_AND_INTERMEDIATE_LAYER_COMBINATION__INTERMEDIATE_LAYER:
				return intermediateLayer != null;
		}
		return super.eIsSet(featureID);
	}

} //VTLForOutputLayerAndIntermediateLayerCombinationImpl
