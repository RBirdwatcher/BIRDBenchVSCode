/**
 */
package org.eclipse.efbt.openregspecs.dsl.open_reg_specs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Elements Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.FlowElementsContainer#getFlowElements <em>Flow Elements</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getFlowElementsContainer()
 * @model abstract="true"
 * @generated
 */
public interface FlowElementsContainer extends BaseElement
{
	/**
	 * Returns the value of the '<em><b>Flow Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.FlowElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Elements</em>' containment reference list.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getFlowElementsContainer_FlowElements()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<FlowElement> getFlowElements();

} // FlowElementsContainer
