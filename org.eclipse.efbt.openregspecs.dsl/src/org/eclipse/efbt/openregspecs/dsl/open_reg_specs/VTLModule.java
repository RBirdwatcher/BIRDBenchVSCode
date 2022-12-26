/**
 */
package org.eclipse.efbt.openregspecs.dsl.open_reg_specs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VTL Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLModule#getVTLSchemes <em>VTL Schemes</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLModule#getVTLGeneratedOutputLayers <em>VTL Generated Output Layers</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLModule#getVTLGeneratedIntermediateLayers <em>VTL Generated Intermediate Layers</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLModule#getVTLEnrichedCubes <em>VTL Enriched Cubes</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLModule#getVTLForSelectionLayers <em>VTL For Selection Layers</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLModule#getEntityToVTLIntermediateLayerLinks <em>Entity To VTL Intermediate Layer Links</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLModule#getVTLForViews <em>VTL For Views</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getVTLModule()
 * @model
 * @generated
 */
public interface VTLModule extends org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Module
{
	/**
	 * Returns the value of the '<em><b>VTL Schemes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLScheme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VTL Schemes</em>' containment reference list.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getVTLModule_VTLSchemes()
	 * @model containment="true"
	 * @generated
	 */
	EList<VTLScheme> getVTLSchemes();

	/**
	 * Returns the value of the '<em><b>VTL Generated Output Layers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLGeneratedOutputlayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VTL Generated Output Layers</em>' containment reference list.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getVTLModule_VTLGeneratedOutputLayers()
	 * @model containment="true"
	 * @generated
	 */
	EList<VTLGeneratedOutputlayer> getVTLGeneratedOutputLayers();

	/**
	 * Returns the value of the '<em><b>VTL Generated Intermediate Layers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLGeneratedIntermediateLayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VTL Generated Intermediate Layers</em>' containment reference list.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getVTLModule_VTLGeneratedIntermediateLayers()
	 * @model containment="true"
	 * @generated
	 */
	EList<VTLGeneratedIntermediateLayer> getVTLGeneratedIntermediateLayers();

	/**
	 * Returns the value of the '<em><b>VTL Enriched Cubes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLEnrichedCube}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VTL Enriched Cubes</em>' containment reference list.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getVTLModule_VTLEnrichedCubes()
	 * @model containment="true"
	 * @generated
	 */
	EList<VTLEnrichedCube> getVTLEnrichedCubes();

	/**
	 * Returns the value of the '<em><b>VTL For Selection Layers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForSelectionLayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VTL For Selection Layers</em>' containment reference list.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getVTLModule_VTLForSelectionLayers()
	 * @model containment="true"
	 * @generated
	 */
	EList<VTLForSelectionLayer> getVTLForSelectionLayers();

	/**
	 * Returns the value of the '<em><b>Entity To VTL Intermediate Layer Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.EntityToVTLIntermediateLayerLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity To VTL Intermediate Layer Links</em>' containment reference list.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getVTLModule_EntityToVTLIntermediateLayerLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntityToVTLIntermediateLayerLink> getEntityToVTLIntermediateLayerLinks();

	/**
	 * Returns the value of the '<em><b>VTL For Views</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForView}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VTL For Views</em>' containment reference list.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getVTLModule_VTLForViews()
	 * @model containment="true"
	 * @generated
	 */
	EList<VTLForView> getVTLForViews();

} // VTLModule
