/**
 */
package org.eclipse.efbt.openregspecs.dsl.open_reg_specs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VTL For Output Layer And Intermediate Layer Combination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForOutputLayerAndIntermediateLayerCombination#getTransformations <em>Transformations</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForOutputLayerAndIntermediateLayerCombination#getOutputLayer <em>Output Layer</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForOutputLayerAndIntermediateLayerCombination#getIntermediateLayer <em>Intermediate Layer</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getVTLForOutputLayerAndIntermediateLayerCombination()
 * @model
 * @generated
 */
public interface VTLForOutputLayerAndIntermediateLayerCombination extends EObject
{
	/**
	 * Returns the value of the '<em><b>Transformations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLTransformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformations</em>' reference list.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getVTLForOutputLayerAndIntermediateLayerCombination_Transformations()
	 * @model
	 * @generated
	 */
	EList<VTLTransformation> getTransformations();

	/**
	 * Returns the value of the '<em><b>Output Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Layer</em>' reference.
	 * @see #setOutputLayer(VTLGeneratedOutputlayer)
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getVTLForOutputLayerAndIntermediateLayerCombination_OutputLayer()
	 * @model
	 * @generated
	 */
	VTLGeneratedOutputlayer getOutputLayer();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForOutputLayerAndIntermediateLayerCombination#getOutputLayer <em>Output Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Layer</em>' reference.
	 * @see #getOutputLayer()
	 * @generated
	 */
	void setOutputLayer(VTLGeneratedOutputlayer value);

	/**
	 * Returns the value of the '<em><b>Intermediate Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediate Layer</em>' reference.
	 * @see #setIntermediateLayer(VTLGeneratedIntermediateLayer)
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getVTLForOutputLayerAndIntermediateLayerCombination_IntermediateLayer()
	 * @model
	 * @generated
	 */
	VTLGeneratedIntermediateLayer getIntermediateLayer();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForOutputLayerAndIntermediateLayerCombination#getIntermediateLayer <em>Intermediate Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intermediate Layer</em>' reference.
	 * @see #getIntermediateLayer()
	 * @generated
	 */
	void setIntermediateLayer(VTLGeneratedIntermediateLayer value);

} // VTLForOutputLayerAndIntermediateLayerCombination
