/**
 */
package org.eclipse.efbt.openregspecs.dsl.open_reg_specs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.FlowNode#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.FlowNode#getIncoming <em>Incoming</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getFlowNode()
 * @model abstract="true"
 * @generated
 */
public interface FlowNode extends FlowElement
{
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SequenceFlow}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SequenceFlow#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getFlowNode_Outgoing()
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SequenceFlow#getSourceRef
	 * @model opposite="sourceRef"
	 * @generated
	 */
	EList<SequenceFlow> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SequenceFlow}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SequenceFlow#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getFlowNode_Incoming()
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SequenceFlow#getTargetRef
	 * @model opposite="targetRef" ordered="false"
	 * @generated
	 */
	EList<SequenceFlow> getIncoming();

} // FlowNode
