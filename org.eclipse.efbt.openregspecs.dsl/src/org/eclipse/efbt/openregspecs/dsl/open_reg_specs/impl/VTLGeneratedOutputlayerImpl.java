/**
 */
package org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl;

import java.util.Collection;

import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForOutputLayerAndIntermediateLayerCombination;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLGeneratedIntermediateLayer;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLGeneratedOutputlayer;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XClass;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VTL Generated Outputlayer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLGeneratedOutputlayerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLGeneratedOutputlayerImpl#getDependant_intermediate_layers <em>Dependant intermediate layers</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLGeneratedOutputlayerImpl#getVTLForOutputLayerAndIntemedateLayerCombinations <em>VTL For Output Layer And Intemedate Layer Combinations</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLGeneratedOutputlayerImpl#getOutputLayer <em>Output Layer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VTLGeneratedOutputlayerImpl extends MinimalEObjectImpl.Container implements VTLGeneratedOutputlayer
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
	 * The cached value of the '{@link #getDependant_intermediate_layers() <em>Dependant intermediate layers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependant_intermediate_layers()
	 * @generated
	 * @ordered
	 */
	protected EList<VTLGeneratedIntermediateLayer> dependant_intermediate_layers;

	/**
	 * The cached value of the '{@link #getVTLForOutputLayerAndIntemedateLayerCombinations() <em>VTL For Output Layer And Intemedate Layer Combinations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVTLForOutputLayerAndIntemedateLayerCombinations()
	 * @generated
	 * @ordered
	 */
	protected EList<VTLForOutputLayerAndIntermediateLayerCombination> vtlForOutputLayerAndIntemedateLayerCombinations;

	/**
	 * The cached value of the '{@link #getOutputLayer() <em>Output Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputLayer()
	 * @generated
	 * @ordered
	 */
	protected XClass outputLayer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTLGeneratedOutputlayerImpl()
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
		return Open_reg_specsPackage.eINSTANCE.getVTLGeneratedOutputlayer();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Open_reg_specsPackage.VTL_GENERATED_OUTPUTLAYER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VTLGeneratedIntermediateLayer> getDependant_intermediate_layers()
	{
		if (dependant_intermediate_layers == null)
		{
			dependant_intermediate_layers = new EObjectResolvingEList<VTLGeneratedIntermediateLayer>(VTLGeneratedIntermediateLayer.class, this, Open_reg_specsPackage.VTL_GENERATED_OUTPUTLAYER__DEPENDANT_INTERMEDIATE_LAYERS);
		}
		return dependant_intermediate_layers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VTLForOutputLayerAndIntermediateLayerCombination> getVTLForOutputLayerAndIntemedateLayerCombinations()
	{
		if (vtlForOutputLayerAndIntemedateLayerCombinations == null)
		{
			vtlForOutputLayerAndIntemedateLayerCombinations = new EObjectContainmentEList<VTLForOutputLayerAndIntermediateLayerCombination>(VTLForOutputLayerAndIntermediateLayerCombination.class, this, Open_reg_specsPackage.VTL_GENERATED_OUTPUTLAYER__VTL_FOR_OUTPUT_LAYER_AND_INTEMEDATE_LAYER_COMBINATIONS);
		}
		return vtlForOutputLayerAndIntemedateLayerCombinations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XClass getOutputLayer()
	{
		if (outputLayer != null && outputLayer.eIsProxy())
		{
			InternalEObject oldOutputLayer = (InternalEObject)outputLayer;
			outputLayer = (XClass)eResolveProxy(oldOutputLayer);
			if (outputLayer != oldOutputLayer)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Open_reg_specsPackage.VTL_GENERATED_OUTPUTLAYER__OUTPUT_LAYER, oldOutputLayer, outputLayer));
			}
		}
		return outputLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XClass basicGetOutputLayer()
	{
		return outputLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputLayer(XClass newOutputLayer)
	{
		XClass oldOutputLayer = outputLayer;
		outputLayer = newOutputLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Open_reg_specsPackage.VTL_GENERATED_OUTPUTLAYER__OUTPUT_LAYER, oldOutputLayer, outputLayer));
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
			case Open_reg_specsPackage.VTL_GENERATED_OUTPUTLAYER__VTL_FOR_OUTPUT_LAYER_AND_INTEMEDATE_LAYER_COMBINATIONS:
				return ((InternalEList<?>)getVTLForOutputLayerAndIntemedateLayerCombinations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case Open_reg_specsPackage.VTL_GENERATED_OUTPUTLAYER__NAME:
				return getName();
			case Open_reg_specsPackage.VTL_GENERATED_OUTPUTLAYER__DEPENDANT_INTERMEDIATE_LAYERS:
				return getDependant_intermediate_layers();
			case Open_reg_specsPackage.VTL_GENERATED_OUTPUTLAYER__VTL_FOR_OUTPUT_LAYER_AND_INTEMEDATE_LAYER_COMBINATIONS:
				return getVTLForOutputLayerAndIntemedateLayerCombinations();
			case Open_reg_specsPackage.VTL_GENERATED_OUTPUTLAYER__OUTPUT_LAYER:
				if (resolve) return getOutputLayer();
				return basicGetOutputLayer();
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
			case Open_reg_specsPackage.VTL_GENERATED_OUTPUTLAYER__NAME:
				setName((String)newValue);
				return;
			case Open_reg_specsPackage.VTL_GENERATED_OUTPUTLAYER__DEPENDANT_INTERMEDIATE_LAYERS:
				getDependant_intermediate_layers().clear();
				getDependant_intermediate_layers().addAll((Collection<? extends VTLGeneratedIntermediateLayer>)newValue);
				return;
			case Open_reg_specsPackage.VTL_GENERATED_OUTPUTLAYER__VTL_FOR_OUTPUT_LAYER_AND_INTEMEDATE_LAYER_COMBINATIONS:
				getVTLForOutputLayerAndIntemedateLayerCombinations().clear();
				getVTLForOutputLayerAndIntemedateLayerCombinations().addAll((Collection<? extends VTLForOutputLayerAndIntermediateLayerCombination>)newValue);
				return;
			case Open_reg_specsPackage.VTL_GENERATED_OUTPUTLAYER__OUTPUT_LAYER:
				setOutputLayer((XClass)newValue);
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
			case Open_reg_specsPackage.VTL_GENERATED_OUTPUTLAYER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Open_reg_specsPackage.VTL_GENERATED_OUTPUTLAYER__DEPENDANT_INTERMEDIATE_LAYERS:
				getDependant_intermediate_layers().clear();
				return;
			case Open_reg_specsPackage.VTL_GENERATED_OUTPUTLAYER__VTL_FOR_OUTPUT_LAYER_AND_INTEMEDATE_LAYER_COMBINATIONS:
				getVTLForOutputLayerAndIntemedateLayerCombinations().clear();
				return;
			case Open_reg_specsPackage.VTL_GENERATED_OUTPUTLAYER__OUTPUT_LAYER:
				setOutputLayer((XClass)null);
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
			case Open_reg_specsPackage.VTL_GENERATED_OUTPUTLAYER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Open_reg_specsPackage.VTL_GENERATED_OUTPUTLAYER__DEPENDANT_INTERMEDIATE_LAYERS:
				return dependant_intermediate_layers != null && !dependant_intermediate_layers.isEmpty();
			case Open_reg_specsPackage.VTL_GENERATED_OUTPUTLAYER__VTL_FOR_OUTPUT_LAYER_AND_INTEMEDATE_LAYER_COMBINATIONS:
				return vtlForOutputLayerAndIntemedateLayerCombinations != null && !vtlForOutputLayerAndIntemedateLayerCombinations.isEmpty();
			case Open_reg_specsPackage.VTL_GENERATED_OUTPUTLAYER__OUTPUT_LAYER:
				return outputLayer != null;
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

} //VTLGeneratedOutputlayerImpl
