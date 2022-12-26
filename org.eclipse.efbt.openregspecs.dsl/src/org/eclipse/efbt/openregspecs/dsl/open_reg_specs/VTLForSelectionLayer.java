/**
 */
package org.eclipse.efbt.openregspecs.dsl.open_reg_specs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VTL For Selection Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForSelectionLayer#getSelectionLayer <em>Selection Layer</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForSelectionLayer#getOutputLayer <em>Output Layer</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForSelectionLayer#getIntermediateLayer <em>Intermediate Layer</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getVTLForSelectionLayer()
 * @model
 * @generated
 */
public interface VTLForSelectionLayer extends EObject
{
	/**
	 * Returns the value of the '<em><b>Selection Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection Layer</em>' reference.
	 * @see #setSelectionLayer(LayerSQL)
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getVTLForSelectionLayer_SelectionLayer()
	 * @model
	 * @generated
	 */
	LayerSQL getSelectionLayer();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForSelectionLayer#getSelectionLayer <em>Selection Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection Layer</em>' reference.
	 * @see #getSelectionLayer()
	 * @generated
	 */
	void setSelectionLayer(LayerSQL value);

	/**
	 * Returns the value of the '<em><b>Output Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Layer</em>' reference.
	 * @see #setOutputLayer(VTLGeneratedOutputlayer)
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getVTLForSelectionLayer_OutputLayer()
	 * @model
	 * @generated
	 */
	VTLGeneratedOutputlayer getOutputLayer();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForSelectionLayer#getOutputLayer <em>Output Layer</em>}' reference.
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
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getVTLForSelectionLayer_IntermediateLayer()
	 * @model
	 * @generated
	 */
	VTLGeneratedIntermediateLayer getIntermediateLayer();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForSelectionLayer#getIntermediateLayer <em>Intermediate Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intermediate Layer</em>' reference.
	 * @see #getIntermediateLayer()
	 * @generated
	 */
	void setIntermediateLayer(VTLGeneratedIntermediateLayer value);

} // VTLForSelectionLayer
