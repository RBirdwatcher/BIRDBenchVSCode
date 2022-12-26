/**
 */
package org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl;

import java.util.Collection;

import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.EntityToVTLIntermediateLayerLink;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLEnrichedCube;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForSelectionLayer;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForView;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLGeneratedIntermediateLayer;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLGeneratedOutputlayer;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLModule;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLScheme;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VTL Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLModuleImpl#getVTLSchemes <em>VTL Schemes</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLModuleImpl#getVTLGeneratedOutputLayers <em>VTL Generated Output Layers</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLModuleImpl#getVTLGeneratedIntermediateLayers <em>VTL Generated Intermediate Layers</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLModuleImpl#getVTLEnrichedCubes <em>VTL Enriched Cubes</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLModuleImpl#getVTLForSelectionLayers <em>VTL For Selection Layers</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLModuleImpl#getEntityToVTLIntermediateLayerLinks <em>Entity To VTL Intermediate Layer Links</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLModuleImpl#getVTLForViews <em>VTL For Views</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VTLModuleImpl extends ModuleImpl implements VTLModule
{
	/**
	 * The cached value of the '{@link #getVTLSchemes() <em>VTL Schemes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVTLSchemes()
	 * @generated
	 * @ordered
	 */
	protected EList<VTLScheme> vtlSchemes;

	/**
	 * The cached value of the '{@link #getVTLGeneratedOutputLayers() <em>VTL Generated Output Layers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVTLGeneratedOutputLayers()
	 * @generated
	 * @ordered
	 */
	protected EList<VTLGeneratedOutputlayer> vtlGeneratedOutputLayers;

	/**
	 * The cached value of the '{@link #getVTLGeneratedIntermediateLayers() <em>VTL Generated Intermediate Layers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVTLGeneratedIntermediateLayers()
	 * @generated
	 * @ordered
	 */
	protected EList<VTLGeneratedIntermediateLayer> vtlGeneratedIntermediateLayers;

	/**
	 * The cached value of the '{@link #getVTLEnrichedCubes() <em>VTL Enriched Cubes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVTLEnrichedCubes()
	 * @generated
	 * @ordered
	 */
	protected EList<VTLEnrichedCube> vtlEnrichedCubes;

	/**
	 * The cached value of the '{@link #getVTLForSelectionLayers() <em>VTL For Selection Layers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVTLForSelectionLayers()
	 * @generated
	 * @ordered
	 */
	protected EList<VTLForSelectionLayer> vtlForSelectionLayers;

	/**
	 * The cached value of the '{@link #getEntityToVTLIntermediateLayerLinks() <em>Entity To VTL Intermediate Layer Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityToVTLIntermediateLayerLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityToVTLIntermediateLayerLink> entityToVTLIntermediateLayerLinks;

	/**
	 * The cached value of the '{@link #getVTLForViews() <em>VTL For Views</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVTLForViews()
	 * @generated
	 * @ordered
	 */
	protected EList<VTLForView> vtlForViews;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VTLModuleImpl()
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
		return Open_reg_specsPackage.eINSTANCE.getVTLModule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VTLScheme> getVTLSchemes()
	{
		if (vtlSchemes == null)
		{
			vtlSchemes = new EObjectContainmentEList<VTLScheme>(VTLScheme.class, this, Open_reg_specsPackage.VTL_MODULE__VTL_SCHEMES);
		}
		return vtlSchemes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VTLGeneratedOutputlayer> getVTLGeneratedOutputLayers()
	{
		if (vtlGeneratedOutputLayers == null)
		{
			vtlGeneratedOutputLayers = new EObjectContainmentEList<VTLGeneratedOutputlayer>(VTLGeneratedOutputlayer.class, this, Open_reg_specsPackage.VTL_MODULE__VTL_GENERATED_OUTPUT_LAYERS);
		}
		return vtlGeneratedOutputLayers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VTLGeneratedIntermediateLayer> getVTLGeneratedIntermediateLayers()
	{
		if (vtlGeneratedIntermediateLayers == null)
		{
			vtlGeneratedIntermediateLayers = new EObjectContainmentEList<VTLGeneratedIntermediateLayer>(VTLGeneratedIntermediateLayer.class, this, Open_reg_specsPackage.VTL_MODULE__VTL_GENERATED_INTERMEDIATE_LAYERS);
		}
		return vtlGeneratedIntermediateLayers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VTLEnrichedCube> getVTLEnrichedCubes()
	{
		if (vtlEnrichedCubes == null)
		{
			vtlEnrichedCubes = new EObjectContainmentEList<VTLEnrichedCube>(VTLEnrichedCube.class, this, Open_reg_specsPackage.VTL_MODULE__VTL_ENRICHED_CUBES);
		}
		return vtlEnrichedCubes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VTLForSelectionLayer> getVTLForSelectionLayers()
	{
		if (vtlForSelectionLayers == null)
		{
			vtlForSelectionLayers = new EObjectContainmentEList<VTLForSelectionLayer>(VTLForSelectionLayer.class, this, Open_reg_specsPackage.VTL_MODULE__VTL_FOR_SELECTION_LAYERS);
		}
		return vtlForSelectionLayers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityToVTLIntermediateLayerLink> getEntityToVTLIntermediateLayerLinks()
	{
		if (entityToVTLIntermediateLayerLinks == null)
		{
			entityToVTLIntermediateLayerLinks = new EObjectContainmentEList<EntityToVTLIntermediateLayerLink>(EntityToVTLIntermediateLayerLink.class, this, Open_reg_specsPackage.VTL_MODULE__ENTITY_TO_VTL_INTERMEDIATE_LAYER_LINKS);
		}
		return entityToVTLIntermediateLayerLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VTLForView> getVTLForViews()
	{
		if (vtlForViews == null)
		{
			vtlForViews = new EObjectContainmentEList<VTLForView>(VTLForView.class, this, Open_reg_specsPackage.VTL_MODULE__VTL_FOR_VIEWS);
		}
		return vtlForViews;
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
			case Open_reg_specsPackage.VTL_MODULE__VTL_SCHEMES:
				return ((InternalEList<?>)getVTLSchemes()).basicRemove(otherEnd, msgs);
			case Open_reg_specsPackage.VTL_MODULE__VTL_GENERATED_OUTPUT_LAYERS:
				return ((InternalEList<?>)getVTLGeneratedOutputLayers()).basicRemove(otherEnd, msgs);
			case Open_reg_specsPackage.VTL_MODULE__VTL_GENERATED_INTERMEDIATE_LAYERS:
				return ((InternalEList<?>)getVTLGeneratedIntermediateLayers()).basicRemove(otherEnd, msgs);
			case Open_reg_specsPackage.VTL_MODULE__VTL_ENRICHED_CUBES:
				return ((InternalEList<?>)getVTLEnrichedCubes()).basicRemove(otherEnd, msgs);
			case Open_reg_specsPackage.VTL_MODULE__VTL_FOR_SELECTION_LAYERS:
				return ((InternalEList<?>)getVTLForSelectionLayers()).basicRemove(otherEnd, msgs);
			case Open_reg_specsPackage.VTL_MODULE__ENTITY_TO_VTL_INTERMEDIATE_LAYER_LINKS:
				return ((InternalEList<?>)getEntityToVTLIntermediateLayerLinks()).basicRemove(otherEnd, msgs);
			case Open_reg_specsPackage.VTL_MODULE__VTL_FOR_VIEWS:
				return ((InternalEList<?>)getVTLForViews()).basicRemove(otherEnd, msgs);
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
			case Open_reg_specsPackage.VTL_MODULE__VTL_SCHEMES:
				return getVTLSchemes();
			case Open_reg_specsPackage.VTL_MODULE__VTL_GENERATED_OUTPUT_LAYERS:
				return getVTLGeneratedOutputLayers();
			case Open_reg_specsPackage.VTL_MODULE__VTL_GENERATED_INTERMEDIATE_LAYERS:
				return getVTLGeneratedIntermediateLayers();
			case Open_reg_specsPackage.VTL_MODULE__VTL_ENRICHED_CUBES:
				return getVTLEnrichedCubes();
			case Open_reg_specsPackage.VTL_MODULE__VTL_FOR_SELECTION_LAYERS:
				return getVTLForSelectionLayers();
			case Open_reg_specsPackage.VTL_MODULE__ENTITY_TO_VTL_INTERMEDIATE_LAYER_LINKS:
				return getEntityToVTLIntermediateLayerLinks();
			case Open_reg_specsPackage.VTL_MODULE__VTL_FOR_VIEWS:
				return getVTLForViews();
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
			case Open_reg_specsPackage.VTL_MODULE__VTL_SCHEMES:
				getVTLSchemes().clear();
				getVTLSchemes().addAll((Collection<? extends VTLScheme>)newValue);
				return;
			case Open_reg_specsPackage.VTL_MODULE__VTL_GENERATED_OUTPUT_LAYERS:
				getVTLGeneratedOutputLayers().clear();
				getVTLGeneratedOutputLayers().addAll((Collection<? extends VTLGeneratedOutputlayer>)newValue);
				return;
			case Open_reg_specsPackage.VTL_MODULE__VTL_GENERATED_INTERMEDIATE_LAYERS:
				getVTLGeneratedIntermediateLayers().clear();
				getVTLGeneratedIntermediateLayers().addAll((Collection<? extends VTLGeneratedIntermediateLayer>)newValue);
				return;
			case Open_reg_specsPackage.VTL_MODULE__VTL_ENRICHED_CUBES:
				getVTLEnrichedCubes().clear();
				getVTLEnrichedCubes().addAll((Collection<? extends VTLEnrichedCube>)newValue);
				return;
			case Open_reg_specsPackage.VTL_MODULE__VTL_FOR_SELECTION_LAYERS:
				getVTLForSelectionLayers().clear();
				getVTLForSelectionLayers().addAll((Collection<? extends VTLForSelectionLayer>)newValue);
				return;
			case Open_reg_specsPackage.VTL_MODULE__ENTITY_TO_VTL_INTERMEDIATE_LAYER_LINKS:
				getEntityToVTLIntermediateLayerLinks().clear();
				getEntityToVTLIntermediateLayerLinks().addAll((Collection<? extends EntityToVTLIntermediateLayerLink>)newValue);
				return;
			case Open_reg_specsPackage.VTL_MODULE__VTL_FOR_VIEWS:
				getVTLForViews().clear();
				getVTLForViews().addAll((Collection<? extends VTLForView>)newValue);
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
			case Open_reg_specsPackage.VTL_MODULE__VTL_SCHEMES:
				getVTLSchemes().clear();
				return;
			case Open_reg_specsPackage.VTL_MODULE__VTL_GENERATED_OUTPUT_LAYERS:
				getVTLGeneratedOutputLayers().clear();
				return;
			case Open_reg_specsPackage.VTL_MODULE__VTL_GENERATED_INTERMEDIATE_LAYERS:
				getVTLGeneratedIntermediateLayers().clear();
				return;
			case Open_reg_specsPackage.VTL_MODULE__VTL_ENRICHED_CUBES:
				getVTLEnrichedCubes().clear();
				return;
			case Open_reg_specsPackage.VTL_MODULE__VTL_FOR_SELECTION_LAYERS:
				getVTLForSelectionLayers().clear();
				return;
			case Open_reg_specsPackage.VTL_MODULE__ENTITY_TO_VTL_INTERMEDIATE_LAYER_LINKS:
				getEntityToVTLIntermediateLayerLinks().clear();
				return;
			case Open_reg_specsPackage.VTL_MODULE__VTL_FOR_VIEWS:
				getVTLForViews().clear();
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
			case Open_reg_specsPackage.VTL_MODULE__VTL_SCHEMES:
				return vtlSchemes != null && !vtlSchemes.isEmpty();
			case Open_reg_specsPackage.VTL_MODULE__VTL_GENERATED_OUTPUT_LAYERS:
				return vtlGeneratedOutputLayers != null && !vtlGeneratedOutputLayers.isEmpty();
			case Open_reg_specsPackage.VTL_MODULE__VTL_GENERATED_INTERMEDIATE_LAYERS:
				return vtlGeneratedIntermediateLayers != null && !vtlGeneratedIntermediateLayers.isEmpty();
			case Open_reg_specsPackage.VTL_MODULE__VTL_ENRICHED_CUBES:
				return vtlEnrichedCubes != null && !vtlEnrichedCubes.isEmpty();
			case Open_reg_specsPackage.VTL_MODULE__VTL_FOR_SELECTION_LAYERS:
				return vtlForSelectionLayers != null && !vtlForSelectionLayers.isEmpty();
			case Open_reg_specsPackage.VTL_MODULE__ENTITY_TO_VTL_INTERMEDIATE_LAYER_LINKS:
				return entityToVTLIntermediateLayerLinks != null && !entityToVTLIntermediateLayerLinks.isEmpty();
			case Open_reg_specsPackage.VTL_MODULE__VTL_FOR_VIEWS:
				return vtlForViews != null && !vtlForViews.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VTLModuleImpl
