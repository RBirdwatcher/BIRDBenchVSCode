/**
 */
package org.eclipse.efbt.openregspecs.dsl.open_reg_specs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsFactory
 * @model kind="package"
 * @generated
 */
public interface Open_reg_specsPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "open_reg_specs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/efbt/open_reg_specs";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "open_reg_specs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Open_reg_specsPackage eINSTANCE = org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.BaseElementImpl <em>Base Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.BaseElementImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getBaseElement()
	 * @generated
	 */
	int BASE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ELEMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Invisible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ELEMENT__INVISIBLE = 2;

	/**
	 * The number of structural features of the '<em>Base Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Base Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.FlowElementsContainerImpl <em>Flow Elements Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.FlowElementsContainerImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getFlowElementsContainer()
	 * @generated
	 */
	int FLOW_ELEMENTS_CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENTS_CONTAINER__NAME = BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENTS_CONTAINER__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Invisible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENTS_CONTAINER__INVISIBLE = BASE_ELEMENT__INVISIBLE;

	/**
	 * The feature id for the '<em><b>Flow Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Flow Elements Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENTS_CONTAINER_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Flow Elements Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENTS_CONTAINER_OPERATION_COUNT = BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.FlowElementImpl <em>Flow Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.FlowElementImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getFlowElement()
	 * @generated
	 */
	int FLOW_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__NAME = BASE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__DESCRIPTION = BASE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Invisible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__INVISIBLE = BASE_ELEMENT__INVISIBLE;

	/**
	 * The feature id for the '<em><b>Display name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__DISPLAY_NAME = BASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Flow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_FEATURE_COUNT = BASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Flow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_OPERATION_COUNT = BASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.FlowNodeImpl <em>Flow Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.FlowNodeImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getFlowNode()
	 * @generated
	 */
	int FLOW_NODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__NAME = FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__DESCRIPTION = FLOW_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Invisible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__INVISIBLE = FLOW_ELEMENT__INVISIBLE;

	/**
	 * The feature id for the '<em><b>Display name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__DISPLAY_NAME = FLOW_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__OUTGOING = FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE__INCOMING = FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Flow Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Flow Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_NODE_OPERATION_COUNT = FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.SequenceFlowImpl <em>Sequence Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.SequenceFlowImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getSequenceFlow()
	 * @generated
	 */
	int SEQUENCE_FLOW = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__NAME = FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__DESCRIPTION = FLOW_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Invisible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__INVISIBLE = FLOW_ELEMENT__INVISIBLE;

	/**
	 * The feature id for the '<em><b>Display name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__DISPLAY_NAME = FLOW_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Target Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__TARGET_REF = FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW__SOURCE_REF = FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sequence Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sequence Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FLOW_OPERATION_COUNT = FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.ActivityImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__NAME = FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DESCRIPTION = FLOW_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Invisible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INVISIBLE = FLOW_NODE__INVISIBLE;

	/**
	 * The feature id for the '<em><b>Display name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__DISPLAY_NAME = FLOW_NODE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__OUTGOING = FLOW_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__INCOMING = FLOW_NODE__INCOMING;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_OPERATION_COUNT = FLOW_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.TaskImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DESCRIPTION = ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Invisible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INVISIBLE = ACTIVITY__INVISIBLE;

	/**
	 * The feature id for the '<em><b>Display name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DISPLAY_NAME = ACTIVITY__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUTGOING = ACTIVITY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INCOMING = ACTIVITY__INCOMING;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.GatewayImpl <em>Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.GatewayImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getGateway()
	 * @generated
	 */
	int GATEWAY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__NAME = FLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__DESCRIPTION = FLOW_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Invisible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__INVISIBLE = FLOW_NODE__INVISIBLE;

	/**
	 * The feature id for the '<em><b>Display name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__DISPLAY_NAME = FLOW_NODE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__OUTGOING = FLOW_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY__INCOMING = FLOW_NODE__INCOMING;

	/**
	 * The number of structural features of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_FEATURE_COUNT = FLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATEWAY_OPERATION_COUNT = FLOW_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.ExclusiveGatewayImpl <em>Exclusive Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.ExclusiveGatewayImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getExclusiveGateway()
	 * @generated
	 */
	int EXCLUSIVE_GATEWAY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__NAME = GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__DESCRIPTION = GATEWAY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Invisible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__INVISIBLE = GATEWAY__INVISIBLE;

	/**
	 * The feature id for the '<em><b>Display name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__DISPLAY_NAME = GATEWAY__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__OUTGOING = GATEWAY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY__INCOMING = GATEWAY__INCOMING;

	/**
	 * The number of structural features of the '<em>Exclusive Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exclusive Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_GATEWAY_OPERATION_COUNT = GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.InclusiveGatewayImpl <em>Inclusive Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.InclusiveGatewayImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getInclusiveGateway()
	 * @generated
	 */
	int INCLUSIVE_GATEWAY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__NAME = GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__DESCRIPTION = GATEWAY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Invisible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__INVISIBLE = GATEWAY__INVISIBLE;

	/**
	 * The feature id for the '<em><b>Display name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__DISPLAY_NAME = GATEWAY__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__OUTGOING = GATEWAY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY__INCOMING = GATEWAY__INCOMING;

	/**
	 * The number of structural features of the '<em>Inclusive Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inclusive Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_GATEWAY_OPERATION_COUNT = GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.ParallelGatewayImpl <em>Parallel Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.ParallelGatewayImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getParallelGateway()
	 * @generated
	 */
	int PARALLEL_GATEWAY = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__NAME = GATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__DESCRIPTION = GATEWAY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Invisible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__INVISIBLE = GATEWAY__INVISIBLE;

	/**
	 * The feature id for the '<em><b>Display name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__DISPLAY_NAME = GATEWAY__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__OUTGOING = GATEWAY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY__INCOMING = GATEWAY__INCOMING;

	/**
	 * The number of structural features of the '<em>Parallel Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_FEATURE_COUNT = GATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parallel Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_GATEWAY_OPERATION_COUNT = GATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.ServiceTaskImpl <em>Service Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.ServiceTaskImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getServiceTask()
	 * @generated
	 */
	int SERVICE_TASK = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__DESCRIPTION = TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Invisible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__INVISIBLE = TASK__INVISIBLE;

	/**
	 * The feature id for the '<em><b>Display name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__DISPLAY_NAME = TASK__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__OUTGOING = TASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__INCOMING = TASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Enriched Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__ENRICHED_ATTRIBUTE = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scenarios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__SCENARIOS = TASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Second Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__SECOND_ATTRIBUTE = TASK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Required Attributes For Scenario Choice</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__REQUIRED_ATTRIBUTES_FOR_SCENARIO_CHOICE = TASK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Required Attributes For Entity Creation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__REQUIRED_ATTRIBUTES_FOR_ENTITY_CREATION = TASK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Entity Creation Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK__ENTITY_CREATION_TASK = TASK_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Service Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Service Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TASK_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.SubProcessImpl <em>Sub Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.SubProcessImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getSubProcess()
	 * @generated
	 */
	int SUB_PROCESS = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__NAME = ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__DESCRIPTION = ACTIVITY__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Invisible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__INVISIBLE = ACTIVITY__INVISIBLE;

	/**
	 * The feature id for the '<em><b>Display name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__DISPLAY_NAME = ACTIVITY__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__OUTGOING = ACTIVITY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__INCOMING = ACTIVITY__INCOMING;

	/**
	 * The feature id for the '<em><b>Flow Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__FLOW_ELEMENTS = ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sub Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sub Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS_OPERATION_COUNT = ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.ScriptTaskImpl <em>Script Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.ScriptTaskImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getScriptTask()
	 * @generated
	 */
	int SCRIPT_TASK = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__DESCRIPTION = TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Invisible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__INVISIBLE = TASK__INVISIBLE;

	/**
	 * The feature id for the '<em><b>Display name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__DISPLAY_NAME = TASK__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__OUTGOING = TASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__INCOMING = TASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Selection Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__SELECTION_LAYERS = TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK__OUTPUT_LAYER = TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Script Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Script Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_TASK_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.UserTaskImpl <em>User Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.UserTaskImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getUserTask()
	 * @generated
	 */
	int USER_TASK = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__NAME = TASK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__DESCRIPTION = TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Invisible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__INVISIBLE = TASK__INVISIBLE;

	/**
	 * The feature id for the '<em><b>Display name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__DISPLAY_NAME = TASK__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__OUTGOING = TASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__INCOMING = TASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK__ENTITY = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>User Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>User Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TASK_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.ImportImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 15;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORTED_NAMESPACE = 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.ModuleImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 16;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DEPENDENCIES = 0;

	/**
	 * The feature id for the '<em><b>The Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__THE_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__LICENSE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__VERSION = 4;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__IMPORTS = 5;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.ModuleListImpl <em>Module List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.ModuleListImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getModuleList()
	 * @generated
	 */
	int MODULE_LIST = 17;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_LIST__MODULES = 0;

	/**
	 * The number of structural features of the '<em>Module List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Module List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.AllowedTypesImpl <em>Allowed Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.AllowedTypesImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getAllowedTypes()
	 * @generated
	 */
	int ALLOWED_TYPES = 18;

	/**
	 * The feature id for the '<em><b>Allowed Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_TYPES__ALLOWED_TYPES = 0;

	/**
	 * The number of structural features of the '<em>Allowed Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_TYPES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Allowed Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_TYPES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.RequirementsModuleImpl <em>Requirements Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.RequirementsModuleImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getRequirementsModule()
	 * @generated
	 */
	int REQUIREMENTS_MODULE = 19;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODULE__DEPENDENCIES = MODULE__DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>The Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODULE__THE_DESCRIPTION = MODULE__THE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODULE__LICENSE = MODULE__LICENSE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODULE__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODULE__VERSION = MODULE__VERSION;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODULE__IMPORTS = MODULE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODULE__RULES = MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allowedtypes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODULE__ALLOWEDTYPES = MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Requirements Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Requirements Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_MODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.RequirementsSectionImpl <em>Requirements Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.RequirementsSectionImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getRequirementsSection()
	 * @generated
	 */
	int REQUIREMENTS_SECTION = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SECTION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Requirements Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SECTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Requirements Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.RequirementsSectionImageImpl <em>Requirements Section Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.RequirementsSectionImageImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getRequirementsSectionImage()
	 * @generated
	 */
	int REQUIREMENTS_SECTION_IMAGE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SECTION_IMAGE__NAME = REQUIREMENTS_SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SECTION_IMAGE__STYLE = REQUIREMENTS_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SECTION_IMAGE__URI = REQUIREMENTS_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Requirements Section Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SECTION_IMAGE_FEATURE_COUNT = REQUIREMENTS_SECTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Requirements Section Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SECTION_IMAGE_OPERATION_COUNT = REQUIREMENTS_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.RequirementsSectionLinkWithTextImpl <em>Requirements Section Link With Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.RequirementsSectionLinkWithTextImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getRequirementsSectionLinkWithText()
	 * @generated
	 */
	int REQUIREMENTS_SECTION_LINK_WITH_TEXT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SECTION_LINK_WITH_TEXT__NAME = REQUIREMENTS_SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Linked Rule Section</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SECTION_LINK_WITH_TEXT__LINKED_RULE_SECTION = REQUIREMENTS_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Link Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SECTION_LINK_WITH_TEXT__LINK_TEXT = REQUIREMENTS_SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subsection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SECTION_LINK_WITH_TEXT__SUBSECTION = REQUIREMENTS_SECTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Requirements Section Link With Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SECTION_LINK_WITH_TEXT_FEATURE_COUNT = REQUIREMENTS_SECTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Requirements Section Link With Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SECTION_LINK_WITH_TEXT_OPERATION_COUNT = REQUIREMENTS_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.RequirementsSectionTextImpl <em>Requirements Section Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.RequirementsSectionTextImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getRequirementsSectionText()
	 * @generated
	 */
	int REQUIREMENTS_SECTION_TEXT = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SECTION_TEXT__NAME = REQUIREMENTS_SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SECTION_TEXT__TEXT = REQUIREMENTS_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Requirements Section Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SECTION_TEXT_FEATURE_COUNT = REQUIREMENTS_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Requirements Section Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SECTION_TEXT_OPERATION_COUNT = REQUIREMENTS_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.RequirementTypeImpl <em>Requirement Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.RequirementTypeImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getRequirementType()
	 * @generated
	 */
	int REQUIREMENT_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Requirement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Requirement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.TitledRequirementsSectionImpl <em>Titled Requirements Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.TitledRequirementsSectionImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getTitledRequirementsSection()
	 * @generated
	 */
	int TITLED_REQUIREMENTS_SECTION = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_REQUIREMENTS_SECTION__NAME = REQUIREMENTS_SECTION__NAME;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_REQUIREMENTS_SECTION__SECTIONS = REQUIREMENTS_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referencing Sections</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_REQUIREMENTS_SECTION__REFERENCING_SECTIONS = REQUIREMENTS_SECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requirements Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_REQUIREMENTS_SECTION__REQUIREMENTS_TYPE = REQUIREMENTS_SECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_REQUIREMENTS_SECTION__TITLE = REQUIREMENTS_SECTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Titled Requirements Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_REQUIREMENTS_SECTION_FEATURE_COUNT = REQUIREMENTS_SECTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Titled Requirements Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLED_REQUIREMENTS_SECTION_OPERATION_COUNT = REQUIREMENTS_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.TagImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 26;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__DISPLAY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__NAME = 1;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__REQUIREMENTS = 2;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.TagGroupImpl <em>Tag Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.TagGroupImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getTagGroup()
	 * @generated
	 */
	int TAG_GROUP = 27;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GROUP__DEPENDENCIES = MODULE__DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>The Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GROUP__THE_DESCRIPTION = MODULE__THE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GROUP__LICENSE = MODULE__LICENSE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GROUP__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GROUP__VERSION = MODULE__VERSION;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GROUP__IMPORTS = MODULE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GROUP__TAGS = MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tag Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GROUP_FEATURE_COUNT = MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Tag Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_GROUP_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.ViewImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = 0;

	/**
	 * The feature id for the '<em><b>Output Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__OUTPUT_LAYER = 1;

	/**
	 * The feature id for the '<em><b>Selection Layer SQL</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__SELECTION_LAYER_SQL = 2;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.LayerSQLImpl <em>Layer SQL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.LayerSQLImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getLayerSQL()
	 * @generated
	 */
	int LAYER_SQL = 29;

	/**
	 * The feature id for the '<em><b>Selection Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SQL__SELECTION_LAYER = 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SQL__COLUMNS = 1;

	/**
	 * The feature id for the '<em><b>Where Clause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SQL__WHERE_CLAUSE = 2;

	/**
	 * The number of structural features of the '<em>Layer SQL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SQL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Layer SQL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SQL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.SelectClauseImpl <em>Select Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.SelectClauseImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getSelectClause()
	 * @generated
	 */
	int SELECT_CLAUSE = 30;

	/**
	 * The number of structural features of the '<em>Select Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_CLAUSE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Select Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_CLAUSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.SelectColumnImpl <em>Select Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.SelectColumnImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getSelectColumn()
	 * @generated
	 */
	int SELECT_COLUMN = 31;

	/**
	 * The feature id for the '<em><b>As Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_COLUMN__AS_ATTRIBUTE = 0;

	/**
	 * The number of structural features of the '<em>Select Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_COLUMN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Select Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.SelectColumnMemberAsImpl <em>Select Column Member As</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.SelectColumnMemberAsImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getSelectColumnMemberAs()
	 * @generated
	 */
	int SELECT_COLUMN_MEMBER_AS = 32;

	/**
	 * The feature id for the '<em><b>As Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_COLUMN_MEMBER_AS__AS_ATTRIBUTE = SELECT_COLUMN__AS_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Member As Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_COLUMN_MEMBER_AS__MEMBER_AS_CONSTANT = SELECT_COLUMN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Select Column Member As</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_COLUMN_MEMBER_AS_FEATURE_COUNT = SELECT_COLUMN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Select Column Member As</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_COLUMN_MEMBER_AS_OPERATION_COUNT = SELECT_COLUMN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.SelectValueAsImpl <em>Select Value As</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.SelectValueAsImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getSelectValueAs()
	 * @generated
	 */
	int SELECT_VALUE_AS = 33;

	/**
	 * The feature id for the '<em><b>As Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_VALUE_AS__AS_ATTRIBUTE = SELECT_COLUMN__AS_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_VALUE_AS__VALUE = SELECT_COLUMN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Select Value As</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_VALUE_AS_FEATURE_COUNT = SELECT_COLUMN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Select Value As</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_VALUE_AS_OPERATION_COUNT = SELECT_COLUMN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.SelectColumnAttributeAsImpl <em>Select Column Attribute As</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.SelectColumnAttributeAsImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getSelectColumnAttributeAs()
	 * @generated
	 */
	int SELECT_COLUMN_ATTRIBUTE_AS = 34;

	/**
	 * The feature id for the '<em><b>As Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_COLUMN_ATTRIBUTE_AS__AS_ATTRIBUTE = SELECT_COLUMN__AS_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_COLUMN_ATTRIBUTE_AS__ATTRIBUTE = SELECT_COLUMN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Select Column Attribute As</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_COLUMN_ATTRIBUTE_AS_FEATURE_COUNT = SELECT_COLUMN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Select Column Attribute As</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_COLUMN_ATTRIBUTE_AS_OPERATION_COUNT = SELECT_COLUMN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.WhereClauseImpl <em>Where Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.WhereClauseImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getWhereClause()
	 * @generated
	 */
	int WHERE_CLAUSE = 35;

	/**
	 * The feature id for the '<em><b>Attribute1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_CLAUSE__ATTRIBUTE1 = 0;

	/**
	 * The feature id for the '<em><b>Comparitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_CLAUSE__COMPARITOR = 1;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_CLAUSE__MEMBER = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_CLAUSE__VALUE = 3;

	/**
	 * The number of structural features of the '<em>Where Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_CLAUSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Where Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_CLAUSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.ViewModuleImpl <em>View Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.ViewModuleImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getViewModule()
	 * @generated
	 */
	int VIEW_MODULE = 36;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODULE__DEPENDENCIES = MODULE__DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>The Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODULE__THE_DESCRIPTION = MODULE__THE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODULE__LICENSE = MODULE__LICENSE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODULE__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODULE__VERSION = MODULE__VERSION;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODULE__IMPORTS = MODULE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODULE__VIEWS = MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>View Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_MODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.ActivityTagImpl <em>Activity Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.ActivityTagImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getActivityTag()
	 * @generated
	 */
	int ACTIVITY_TAG = 37;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TAG__DISPLAY_NAME = TAG__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TAG__NAME = TAG__NAME;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TAG__REQUIREMENTS = TAG__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TAG__ACTIVITY = TAG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Activity Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TAG_FEATURE_COUNT = TAG_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Activity Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TAG_OPERATION_COUNT = TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.ScenarioImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Invisible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__INVISIBLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Required Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__REQUIRED_ATTRIBUTES = 3;

	/**
	 * The feature id for the '<em><b>Data constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__DATA_CONSTRAINTS = 4;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.ScenarioTagImpl <em>Scenario Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.ScenarioTagImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getScenarioTag()
	 * @generated
	 */
	int SCENARIO_TAG = 39;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TAG__DISPLAY_NAME = TAG__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TAG__NAME = TAG__NAME;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TAG__REQUIREMENTS = TAG__REQUIREMENTS;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TAG__SCENARIO = TAG_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scenario Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TAG_FEATURE_COUNT = TAG_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Scenario Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_TAG_OPERATION_COUNT = TAG_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.TestImpl <em>Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.TestImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getTest()
	 * @generated
	 */
	int TEST = 40;

	/**
	 * The feature id for the '<em><b>Input Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__INPUT_DATA = 0;

	/**
	 * The feature id for the '<em><b>Expected Result</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__EXPECTED_RESULT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__NAME = 2;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__SCOPE = 3;

	/**
	 * The number of structural features of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.TestModuleImpl <em>Test Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.TestModuleImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getTestModule()
	 * @generated
	 */
	int TEST_MODULE = 41;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MODULE__DEPENDENCIES = MODULE__DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>The Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MODULE__THE_DESCRIPTION = MODULE__THE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MODULE__LICENSE = MODULE__LICENSE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MODULE__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MODULE__VERSION = MODULE__VERSION;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MODULE__IMPORTS = MODULE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MODULE__TESTS = MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Test Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Test Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_MODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.DataConstraintImpl <em>Data Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.DataConstraintImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getDataConstraint()
	 * @generated
	 */
	int DATA_CONSTRAINT = 42;

	/**
	 * The feature id for the '<em><b>Attr1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONSTRAINT__ATTR1 = 0;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONSTRAINT__COMPARISON = 1;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONSTRAINT__MEMBER = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONSTRAINT__VALUE = 3;

	/**
	 * The number of structural features of the '<em>Data Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONSTRAINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Data Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.SelectionLayerImpl <em>Selection Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.SelectionLayerImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getSelectionLayer()
	 * @generated
	 */
	int SELECTION_LAYER = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_LAYER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Invisible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_LAYER__INVISIBLE = 1;

	/**
	 * The feature id for the '<em><b>Generated Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_LAYER__GENERATED_ENTITY = 2;

	/**
	 * The number of structural features of the '<em>Selection Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_LAYER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Selection Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_LAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.TestScopeImpl <em>Test Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.TestScopeImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getTestScope()
	 * @generated
	 */
	int TEST_SCOPE = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SCOPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Test Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SCOPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Test Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_SCOPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.UnitTestScopeImpl <em>Unit Test Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.UnitTestScopeImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getUnitTestScope()
	 * @generated
	 */
	int UNIT_TEST_SCOPE = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST_SCOPE__NAME = TEST_SCOPE__NAME;

	/**
	 * The feature id for the '<em><b>Scenarios</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST_SCOPE__SCENARIOS = TEST_SCOPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unit Test Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST_SCOPE_FEATURE_COUNT = TEST_SCOPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unit Test Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_TEST_SCOPE_OPERATION_COUNT = TEST_SCOPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.E2ETestScopeImpl <em>E2E Test Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.E2ETestScopeImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getE2ETestScope()
	 * @generated
	 */
	int E2E_TEST_SCOPE = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2E_TEST_SCOPE__NAME = TEST_SCOPE__NAME;

	/**
	 * The feature id for the '<em><b>Scenarios</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2E_TEST_SCOPE__SCENARIOS = TEST_SCOPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2E_TEST_SCOPE__LAYER = TEST_SCOPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Script Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2E_TEST_SCOPE__SCRIPT_TASK = TEST_SCOPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>E2E Test Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2E_TEST_SCOPE_FEATURE_COUNT = TEST_SCOPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>E2E Test Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int E2E_TEST_SCOPE_OPERATION_COUNT = TEST_SCOPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.InputFileImpl <em>Input File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.InputFileImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getInputFile()
	 * @generated
	 */
	int INPUT_FILE = 47;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FILE__FILE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FILE__ENTITY = 1;

	/**
	 * The number of structural features of the '<em>Input File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FILE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Input File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.WorkflowModuleImpl <em>Workflow Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.WorkflowModuleImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getWorkflowModule()
	 * @generated
	 */
	int WORKFLOW_MODULE = 48;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_MODULE__DEPENDENCIES = MODULE__DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>The Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_MODULE__THE_DESCRIPTION = MODULE__THE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_MODULE__LICENSE = MODULE__LICENSE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_MODULE__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_MODULE__VERSION = MODULE__VERSION;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_MODULE__IMPORTS = MODULE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Task Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_MODULE__TASK_TAGS = MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scenario Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_MODULE__SCENARIO_TAGS = MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_MODULE__SUB_PROCESS = MODULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Workflow Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Workflow Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_MODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.XModelElementImpl <em>XModel Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.XModelElementImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getXModelElement()
	 * @generated
	 */
	int XMODEL_ELEMENT = 56;

	/**
	 * The number of structural features of the '<em>XModel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMODEL_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>XModel Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.XNamedElementImpl <em>XNamed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.XNamedElementImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getXNamedElement()
	 * @generated
	 */
	int XNAMED_ELEMENT = 57;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XNAMED_ELEMENT__NAME = XMODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XNamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XNAMED_ELEMENT_FEATURE_COUNT = XMODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XNamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XNAMED_ELEMENT_OPERATION_COUNT = XMODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.XTypedElementImpl <em>XTyped Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.XTypedElementImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getXTypedElement()
	 * @generated
	 */
	int XTYPED_ELEMENT = 62;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTYPED_ELEMENT__NAME = XNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTYPED_ELEMENT__TYPE = XNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTYPED_ELEMENT__UPPER_BOUND = XNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTYPED_ELEMENT__LOWER_BOUND = XNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>XTyped Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTYPED_ELEMENT_FEATURE_COUNT = XNAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>XTyped Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTYPED_ELEMENT_OPERATION_COUNT = XNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.XMemberImpl <em>XMember</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.XMemberImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getXMember()
	 * @generated
	 */
	int XMEMBER = 55;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMEMBER__NAME = XTYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMEMBER__TYPE = XTYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMEMBER__UPPER_BOUND = XTYPED_ELEMENT__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMEMBER__LOWER_BOUND = XTYPED_ELEMENT__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Containing Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMEMBER__CONTAINING_CLASS = XTYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XMember</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMEMBER_FEATURE_COUNT = XTYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XMember</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMEMBER_OPERATION_COUNT = XTYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.XStructuralFeatureImpl <em>XStructural Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.XStructuralFeatureImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getXStructuralFeature()
	 * @generated
	 */
	int XSTRUCTURAL_FEATURE = 61;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSTRUCTURAL_FEATURE__NAME = XMEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSTRUCTURAL_FEATURE__TYPE = XMEMBER__TYPE;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSTRUCTURAL_FEATURE__UPPER_BOUND = XMEMBER__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSTRUCTURAL_FEATURE__LOWER_BOUND = XMEMBER__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Containing Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSTRUCTURAL_FEATURE__CONTAINING_CLASS = XMEMBER__CONTAINING_CLASS;

	/**
	 * The number of structural features of the '<em>XStructural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSTRUCTURAL_FEATURE_FEATURE_COUNT = XMEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XStructural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSTRUCTURAL_FEATURE_OPERATION_COUNT = XMEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.XAttributeImpl <em>XAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.XAttributeImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getXAttribute()
	 * @generated
	 */
	int XATTRIBUTE = 49;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XATTRIBUTE__NAME = XSTRUCTURAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XATTRIBUTE__TYPE = XSTRUCTURAL_FEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XATTRIBUTE__UPPER_BOUND = XSTRUCTURAL_FEATURE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XATTRIBUTE__LOWER_BOUND = XSTRUCTURAL_FEATURE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Containing Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XATTRIBUTE__CONTAINING_CLASS = XSTRUCTURAL_FEATURE__CONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XATTRIBUTE__DEFAULT_VALUE_LITERAL = XSTRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XATTRIBUTE__ID = XSTRUCTURAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>XAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XATTRIBUTE_FEATURE_COUNT = XSTRUCTURAL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>XAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XATTRIBUTE_OPERATION_COUNT = XSTRUCTURAL_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.XClassifierImpl <em>XClassifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.XClassifierImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getXClassifier()
	 * @generated
	 */
	int XCLASSIFIER = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCLASSIFIER__NAME = XNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCLASSIFIER__PACKAGE = XNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XClassifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCLASSIFIER_FEATURE_COUNT = XNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XClassifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCLASSIFIER_OPERATION_COUNT = XNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.XClassImpl <em>XClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.XClassImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getXClass()
	 * @generated
	 */
	int XCLASS = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCLASS__NAME = XCLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCLASS__PACKAGE = XCLASSIFIER__PACKAGE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCLASS__ABSTRACT = XCLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCLASS__MEMBERS = XCLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCLASS__SUPER_TYPES = XCLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>XClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCLASS_FEATURE_COUNT = XCLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>XClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCLASS_OPERATION_COUNT = XCLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.XDataTypeImpl <em>XData Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.XDataTypeImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getXDataType()
	 * @generated
	 */
	int XDATA_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDATA_TYPE__NAME = XCLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDATA_TYPE__PACKAGE = XCLASSIFIER__PACKAGE;

	/**
	 * The feature id for the '<em><b>Industry Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDATA_TYPE__INDUSTRY_NAME = XCLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XData Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDATA_TYPE_FEATURE_COUNT = XCLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XData Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDATA_TYPE_OPERATION_COUNT = XCLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.XEnumImpl <em>XEnum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.XEnumImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getXEnum()
	 * @generated
	 */
	int XENUM = 53;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XENUM__NAME = XDATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XENUM__PACKAGE = XDATA_TYPE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Industry Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XENUM__INDUSTRY_NAME = XDATA_TYPE__INDUSTRY_NAME;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XENUM__LITERALS = XDATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XEnum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XENUM_FEATURE_COUNT = XDATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XEnum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XENUM_OPERATION_COUNT = XDATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.XEnumLiteralImpl <em>XEnum Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.XEnumLiteralImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getXEnumLiteral()
	 * @generated
	 */
	int XENUM_LITERAL = 54;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XENUM_LITERAL__NAME = XNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XENUM_LITERAL__VALUE = XNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XENUM_LITERAL__LITERAL = XNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XENUM_LITERAL__ENUM = XNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>XEnum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XENUM_LITERAL_FEATURE_COUNT = XNAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>XEnum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XENUM_LITERAL_OPERATION_COUNT = XNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.XOperationImpl <em>XOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.XOperationImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getXOperation()
	 * @generated
	 */
	int XOPERATION = 58;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOPERATION__NAME = XMEMBER__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOPERATION__TYPE = XMEMBER__TYPE;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOPERATION__UPPER_BOUND = XMEMBER__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOPERATION__LOWER_BOUND = XMEMBER__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Containing Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOPERATION__CONTAINING_CLASS = XMEMBER__CONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOPERATION__BODY = XMEMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOPERATION_FEATURE_COUNT = XMEMBER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOPERATION_OPERATION_COUNT = XMEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.XPackageImpl <em>XPackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.XPackageImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getXPackage()
	 * @generated
	 */
	int XPACKAGE = 59;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACKAGE__DEPENDENCIES = MODULE__DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>The Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACKAGE__THE_DESCRIPTION = MODULE__THE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACKAGE__LICENSE = MODULE__LICENSE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACKAGE__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACKAGE__VERSION = MODULE__VERSION;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACKAGE__IMPORTS = MODULE__IMPORTS;

	/**
	 * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACKAGE__CLASSIFIERS = MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACKAGE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XPackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XPACKAGE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.XReferenceImpl <em>XReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.XReferenceImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getXReference()
	 * @generated
	 */
	int XREFERENCE = 60;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREFERENCE__NAME = XSTRUCTURAL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREFERENCE__TYPE = XSTRUCTURAL_FEATURE__TYPE;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREFERENCE__UPPER_BOUND = XSTRUCTURAL_FEATURE__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREFERENCE__LOWER_BOUND = XSTRUCTURAL_FEATURE__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Containing Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREFERENCE__CONTAINING_CLASS = XSTRUCTURAL_FEATURE__CONTAINING_CLASS;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREFERENCE__CONTAINMENT = XSTRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREFERENCE_FEATURE_COUNT = XSTRUCTURAL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XREFERENCE_OPERATION_COUNT = XSTRUCTURAL_FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLEnrichedCubeImpl <em>VTL Enriched Cube</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLEnrichedCubeImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getVTLEnrichedCube()
	 * @generated
	 */
	int VTL_ENRICHED_CUBE = 63;

	/**
	 * The feature id for the '<em><b>Transformations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_ENRICHED_CUBE__TRANSFORMATIONS = 0;

	/**
	 * The number of structural features of the '<em>VTL Enriched Cube</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_ENRICHED_CUBE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>VTL Enriched Cube</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_ENRICHED_CUBE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLGeneratedOutputlayerImpl <em>VTL Generated Outputlayer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLGeneratedOutputlayerImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getVTLGeneratedOutputlayer()
	 * @generated
	 */
	int VTL_GENERATED_OUTPUTLAYER = 64;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_GENERATED_OUTPUTLAYER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Dependant intermediate layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_GENERATED_OUTPUTLAYER__DEPENDANT_INTERMEDIATE_LAYERS = 1;

	/**
	 * The feature id for the '<em><b>VTL For Output Layer And Intemedate Layer Combinations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_GENERATED_OUTPUTLAYER__VTL_FOR_OUTPUT_LAYER_AND_INTEMEDATE_LAYER_COMBINATIONS = 2;

	/**
	 * The feature id for the '<em><b>Output Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_GENERATED_OUTPUTLAYER__OUTPUT_LAYER = 3;

	/**
	 * The number of structural features of the '<em>VTL Generated Outputlayer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_GENERATED_OUTPUTLAYER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>VTL Generated Outputlayer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_GENERATED_OUTPUTLAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLForOutputLayerAndIntermediateLayerCombinationImpl <em>VTL For Output Layer And Intermediate Layer Combination</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLForOutputLayerAndIntermediateLayerCombinationImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getVTLForOutputLayerAndIntermediateLayerCombination()
	 * @generated
	 */
	int VTL_FOR_OUTPUT_LAYER_AND_INTERMEDIATE_LAYER_COMBINATION = 65;

	/**
	 * The feature id for the '<em><b>Transformations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_FOR_OUTPUT_LAYER_AND_INTERMEDIATE_LAYER_COMBINATION__TRANSFORMATIONS = 0;

	/**
	 * The feature id for the '<em><b>Output Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_FOR_OUTPUT_LAYER_AND_INTERMEDIATE_LAYER_COMBINATION__OUTPUT_LAYER = 1;

	/**
	 * The feature id for the '<em><b>Intermediate Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_FOR_OUTPUT_LAYER_AND_INTERMEDIATE_LAYER_COMBINATION__INTERMEDIATE_LAYER = 2;

	/**
	 * The number of structural features of the '<em>VTL For Output Layer And Intermediate Layer Combination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_FOR_OUTPUT_LAYER_AND_INTERMEDIATE_LAYER_COMBINATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>VTL For Output Layer And Intermediate Layer Combination</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_FOR_OUTPUT_LAYER_AND_INTERMEDIATE_LAYER_COMBINATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLGeneratedIntermediateLayerImpl <em>VTL Generated Intermediate Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLGeneratedIntermediateLayerImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getVTLGeneratedIntermediateLayer()
	 * @generated
	 */
	int VTL_GENERATED_INTERMEDIATE_LAYER = 66;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_GENERATED_INTERMEDIATE_LAYER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Dependant enriched cubes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_GENERATED_INTERMEDIATE_LAYER__DEPENDANT_ENRICHED_CUBES = 1;

	/**
	 * The feature id for the '<em><b>Transformations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_GENERATED_INTERMEDIATE_LAYER__TRANSFORMATIONS = 2;

	/**
	 * The number of structural features of the '<em>VTL Generated Intermediate Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_GENERATED_INTERMEDIATE_LAYER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>VTL Generated Intermediate Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_GENERATED_INTERMEDIATE_LAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLTransformationImpl <em>VTL Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLTransformationImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getVTLTransformation()
	 * @generated
	 */
	int VTL_TRANSFORMATION = 67;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_TRANSFORMATION__EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_TRANSFORMATION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Transformation id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_TRANSFORMATION__TRANSFORMATION_ID = 2;

	/**
	 * The feature id for the '<em><b>Order in scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_TRANSFORMATION__ORDER_IN_SCHEME = 3;

	/**
	 * The number of structural features of the '<em>VTL Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_TRANSFORMATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>VTL Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_TRANSFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLSchemeImpl <em>VTL Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLSchemeImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getVTLScheme()
	 * @generated
	 */
	int VTL_SCHEME = 68;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_SCHEME__EXPRESSIONS = 0;

	/**
	 * The feature id for the '<em><b>Scheme id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_SCHEME__SCHEME_ID = 1;

	/**
	 * The number of structural features of the '<em>VTL Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_SCHEME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>VTL Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_SCHEME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLForSelectionLayerImpl <em>VTL For Selection Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLForSelectionLayerImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getVTLForSelectionLayer()
	 * @generated
	 */
	int VTL_FOR_SELECTION_LAYER = 69;

	/**
	 * The feature id for the '<em><b>Selection Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_FOR_SELECTION_LAYER__SELECTION_LAYER = 0;

	/**
	 * The feature id for the '<em><b>Output Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_FOR_SELECTION_LAYER__OUTPUT_LAYER = 1;

	/**
	 * The feature id for the '<em><b>Intermediate Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_FOR_SELECTION_LAYER__INTERMEDIATE_LAYER = 2;

	/**
	 * The number of structural features of the '<em>VTL For Selection Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_FOR_SELECTION_LAYER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>VTL For Selection Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_FOR_SELECTION_LAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLModuleImpl <em>VTL Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLModuleImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getVTLModule()
	 * @generated
	 */
	int VTL_MODULE = 70;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_MODULE__DEPENDENCIES = MODULE__DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>The Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_MODULE__THE_DESCRIPTION = MODULE__THE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_MODULE__LICENSE = MODULE__LICENSE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_MODULE__NAME = MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_MODULE__VERSION = MODULE__VERSION;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_MODULE__IMPORTS = MODULE__IMPORTS;

	/**
	 * The feature id for the '<em><b>VTL Schemes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_MODULE__VTL_SCHEMES = MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>VTL Generated Output Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_MODULE__VTL_GENERATED_OUTPUT_LAYERS = MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>VTL Generated Intermediate Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_MODULE__VTL_GENERATED_INTERMEDIATE_LAYERS = MODULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>VTL Enriched Cubes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_MODULE__VTL_ENRICHED_CUBES = MODULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>VTL For Selection Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_MODULE__VTL_FOR_SELECTION_LAYERS = MODULE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Entity To VTL Intermediate Layer Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_MODULE__ENTITY_TO_VTL_INTERMEDIATE_LAYER_LINKS = MODULE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>VTL For Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_MODULE__VTL_FOR_VIEWS = MODULE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>VTL Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_MODULE_FEATURE_COUNT = MODULE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>VTL Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_MODULE_OPERATION_COUNT = MODULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.EntityToVTLIntermediateLayerLinkImpl <em>Entity To VTL Intermediate Layer Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.EntityToVTLIntermediateLayerLinkImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getEntityToVTLIntermediateLayerLink()
	 * @generated
	 */
	int ENTITY_TO_VTL_INTERMEDIATE_LAYER_LINK = 71;

	/**
	 * The feature id for the '<em><b>VTL Intermediate Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TO_VTL_INTERMEDIATE_LAYER_LINK__VTL_INTERMEDIATE_LAYER = 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TO_VTL_INTERMEDIATE_LAYER_LINK__ENTITY = 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TO_VTL_INTERMEDIATE_LAYER_LINK__FILTER = 2;

	/**
	 * The number of structural features of the '<em>Entity To VTL Intermediate Layer Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TO_VTL_INTERMEDIATE_LAYER_LINK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Entity To VTL Intermediate Layer Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TO_VTL_INTERMEDIATE_LAYER_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLForViewImpl <em>VTL For View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.VTLForViewImpl
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getVTLForView()
	 * @generated
	 */
	int VTL_FOR_VIEW = 72;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_FOR_VIEW__NAME = 0;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_FOR_VIEW__VIEW = 1;

	/**
	 * The feature id for the '<em><b>Vtl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_FOR_VIEW__VTL = 2;

	/**
	 * The number of structural features of the '<em>VTL For View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_FOR_VIEW_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>VTL For View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTL_FOR_VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Comparitor <em>Comparitor</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Comparitor
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getComparitor()
	 * @generated
	 */
	int COMPARITOR = 73;

	/**
	 * The meta object id for the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.AttrComparison <em>Attr Comparison</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.AttrComparison
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.Open_reg_specsPackageImpl#getAttrComparison()
	 * @generated
	 */
	int ATTR_COMPARISON = 74;


	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.BaseElement <em>Base Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Element</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.BaseElement
	 * @generated
	 */
	EClass getBaseElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.BaseElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.BaseElement#getName()
	 * @see #getBaseElement()
	 * @generated
	 */
	EAttribute getBaseElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.BaseElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.BaseElement#getDescription()
	 * @see #getBaseElement()
	 * @generated
	 */
	EAttribute getBaseElement_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.BaseElement#isInvisible <em>Invisible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invisible</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.BaseElement#isInvisible()
	 * @see #getBaseElement()
	 * @generated
	 */
	EAttribute getBaseElement_Invisible();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.FlowElementsContainer <em>Flow Elements Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Elements Container</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.FlowElementsContainer
	 * @generated
	 */
	EClass getFlowElementsContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.FlowElementsContainer#getFlowElements <em>Flow Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flow Elements</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.FlowElementsContainer#getFlowElements()
	 * @see #getFlowElementsContainer()
	 * @generated
	 */
	EReference getFlowElementsContainer_FlowElements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.FlowElement <em>Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Element</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.FlowElement
	 * @generated
	 */
	EClass getFlowElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.FlowElement#getDisplay_name <em>Display name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display name</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.FlowElement#getDisplay_name()
	 * @see #getFlowElement()
	 * @generated
	 */
	EAttribute getFlowElement_Display_name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.FlowNode <em>Flow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Node</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.FlowNode
	 * @generated
	 */
	EClass getFlowNode();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.FlowNode#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.FlowNode#getOutgoing()
	 * @see #getFlowNode()
	 * @generated
	 */
	EReference getFlowNode_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.FlowNode#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.FlowNode#getIncoming()
	 * @see #getFlowNode()
	 * @generated
	 */
	EReference getFlowNode_Incoming();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SequenceFlow <em>Sequence Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Flow</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SequenceFlow
	 * @generated
	 */
	EClass getSequenceFlow();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SequenceFlow#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Ref</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SequenceFlow#getTargetRef()
	 * @see #getSequenceFlow()
	 * @generated
	 */
	EReference getSequenceFlow_TargetRef();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SequenceFlow#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Ref</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SequenceFlow#getSourceRef()
	 * @see #getSequenceFlow()
	 * @generated
	 */
	EReference getSequenceFlow_SourceRef();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gateway</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Gateway
	 * @generated
	 */
	EClass getGateway();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ExclusiveGateway <em>Exclusive Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusive Gateway</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ExclusiveGateway
	 * @generated
	 */
	EClass getExclusiveGateway();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.InclusiveGateway <em>Inclusive Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inclusive Gateway</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.InclusiveGateway
	 * @generated
	 */
	EClass getInclusiveGateway();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ParallelGateway <em>Parallel Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Gateway</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ParallelGateway
	 * @generated
	 */
	EClass getParallelGateway();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ServiceTask <em>Service Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Task</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ServiceTask
	 * @generated
	 */
	EClass getServiceTask();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ServiceTask#getEnrichedAttribute <em>Enriched Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enriched Attribute</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ServiceTask#getEnrichedAttribute()
	 * @see #getServiceTask()
	 * @generated
	 */
	EReference getServiceTask_EnrichedAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ServiceTask#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenarios</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ServiceTask#getScenarios()
	 * @see #getServiceTask()
	 * @generated
	 */
	EReference getServiceTask_Scenarios();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ServiceTask#getSecondAttribute <em>Second Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Second Attribute</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ServiceTask#getSecondAttribute()
	 * @see #getServiceTask()
	 * @generated
	 */
	EReference getServiceTask_SecondAttribute();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ServiceTask#getRequiredAttributesForScenarioChoice <em>Required Attributes For Scenario Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Attributes For Scenario Choice</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ServiceTask#getRequiredAttributesForScenarioChoice()
	 * @see #getServiceTask()
	 * @generated
	 */
	EReference getServiceTask_RequiredAttributesForScenarioChoice();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ServiceTask#getRequiredAttributesForEntityCreation <em>Required Attributes For Entity Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Attributes For Entity Creation</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ServiceTask#getRequiredAttributesForEntityCreation()
	 * @see #getServiceTask()
	 * @generated
	 */
	EReference getServiceTask_RequiredAttributesForEntityCreation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ServiceTask#isEntityCreationTask <em>Entity Creation Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Creation Task</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ServiceTask#isEntityCreationTask()
	 * @see #getServiceTask()
	 * @generated
	 */
	EAttribute getServiceTask_EntityCreationTask();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SubProcess <em>Sub Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Process</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SubProcess
	 * @generated
	 */
	EClass getSubProcess();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ScriptTask <em>Script Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script Task</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ScriptTask
	 * @generated
	 */
	EClass getScriptTask();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ScriptTask#getSelectionLayers <em>Selection Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Selection Layers</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ScriptTask#getSelectionLayers()
	 * @see #getScriptTask()
	 * @generated
	 */
	EReference getScriptTask_SelectionLayers();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ScriptTask#getOutputLayer <em>Output Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Layer</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ScriptTask#getOutputLayer()
	 * @see #getScriptTask()
	 * @generated
	 */
	EReference getScriptTask_OutputLayer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.UserTask <em>User Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Task</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.UserTask
	 * @generated
	 */
	EClass getUserTask();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.UserTask#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.UserTask#getEntity()
	 * @see #getUserTask()
	 * @generated
	 */
	EReference getUserTask_Entity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Import#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Import#getImportedNamespace()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportedNamespace();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Module#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependencies</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Module#getDependencies()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Dependencies();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Module#getTheDescription <em>The Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>The Description</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Module#getTheDescription()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_TheDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Module#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Module#getLicense()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_License();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Module#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Module#getName()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Module#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Module#getVersion()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Module#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Module#getImports()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Imports();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ModuleList <em>Module List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module List</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ModuleList
	 * @generated
	 */
	EClass getModuleList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ModuleList#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ModuleList#getModules()
	 * @see #getModuleList()
	 * @generated
	 */
	EReference getModuleList_Modules();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.AllowedTypes <em>Allowed Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allowed Types</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.AllowedTypes
	 * @generated
	 */
	EClass getAllowedTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.AllowedTypes#getAllowedTypes <em>Allowed Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Allowed Types</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.AllowedTypes#getAllowedTypes()
	 * @see #getAllowedTypes()
	 * @generated
	 */
	EReference getAllowedTypes_AllowedTypes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsModule <em>Requirements Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements Module</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsModule
	 * @generated
	 */
	EClass getRequirementsModule();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsModule#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsModule#getRules()
	 * @see #getRequirementsModule()
	 * @generated
	 */
	EReference getRequirementsModule_Rules();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsModule#getAllowedtypes <em>Allowedtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allowedtypes</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsModule#getAllowedtypes()
	 * @see #getRequirementsModule()
	 * @generated
	 */
	EReference getRequirementsModule_Allowedtypes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSection <em>Requirements Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements Section</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSection
	 * @generated
	 */
	EClass getRequirementsSection();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSection#getName()
	 * @see #getRequirementsSection()
	 * @generated
	 */
	EAttribute getRequirementsSection_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSectionImage <em>Requirements Section Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements Section Image</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSectionImage
	 * @generated
	 */
	EClass getRequirementsSectionImage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSectionImage#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSectionImage#getStyle()
	 * @see #getRequirementsSectionImage()
	 * @generated
	 */
	EAttribute getRequirementsSectionImage_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSectionImage#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSectionImage#getUri()
	 * @see #getRequirementsSectionImage()
	 * @generated
	 */
	EAttribute getRequirementsSectionImage_Uri();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSectionLinkWithText <em>Requirements Section Link With Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements Section Link With Text</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSectionLinkWithText
	 * @generated
	 */
	EClass getRequirementsSectionLinkWithText();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSectionLinkWithText#getLinkedRuleSection <em>Linked Rule Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linked Rule Section</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSectionLinkWithText#getLinkedRuleSection()
	 * @see #getRequirementsSectionLinkWithText()
	 * @generated
	 */
	EReference getRequirementsSectionLinkWithText_LinkedRuleSection();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSectionLinkWithText#getLinkText <em>Link Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Text</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSectionLinkWithText#getLinkText()
	 * @see #getRequirementsSectionLinkWithText()
	 * @generated
	 */
	EAttribute getRequirementsSectionLinkWithText_LinkText();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSectionLinkWithText#getSubsection <em>Subsection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subsection</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSectionLinkWithText#getSubsection()
	 * @see #getRequirementsSectionLinkWithText()
	 * @generated
	 */
	EAttribute getRequirementsSectionLinkWithText_Subsection();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSectionText <em>Requirements Section Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements Section Text</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSectionText
	 * @generated
	 */
	EClass getRequirementsSectionText();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSectionText#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSectionText#getText()
	 * @see #getRequirementsSectionText()
	 * @generated
	 */
	EAttribute getRequirementsSectionText_Text();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementType <em>Requirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Type</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementType
	 * @generated
	 */
	EClass getRequirementType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementType#getName()
	 * @see #getRequirementType()
	 * @generated
	 */
	EAttribute getRequirementType_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TitledRequirementsSection <em>Titled Requirements Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Titled Requirements Section</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TitledRequirementsSection
	 * @generated
	 */
	EClass getTitledRequirementsSection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TitledRequirementsSection#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TitledRequirementsSection#getSections()
	 * @see #getTitledRequirementsSection()
	 * @generated
	 */
	EReference getTitledRequirementsSection_Sections();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TitledRequirementsSection#getReferencingSections <em>Referencing Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referencing Sections</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TitledRequirementsSection#getReferencingSections()
	 * @see #getTitledRequirementsSection()
	 * @generated
	 */
	EReference getTitledRequirementsSection_ReferencingSections();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TitledRequirementsSection#getRequirementsType <em>Requirements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirements Type</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TitledRequirementsSection#getRequirementsType()
	 * @see #getTitledRequirementsSection()
	 * @generated
	 */
	EReference getTitledRequirementsSection_RequirementsType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TitledRequirementsSection#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TitledRequirementsSection#getTitle()
	 * @see #getTitledRequirementsSection()
	 * @generated
	 */
	EAttribute getTitledRequirementsSection_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Tag#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Tag#getDisplayName()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Tag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Tag#getName()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Tag#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requirements</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Tag#getRequirements()
	 * @see #getTag()
	 * @generated
	 */
	EReference getTag_Requirements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TagGroup <em>Tag Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag Group</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TagGroup
	 * @generated
	 */
	EClass getTagGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TagGroup#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TagGroup#getTags()
	 * @see #getTagGroup()
	 * @generated
	 */
	EReference getTagGroup_Tags();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.View#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.View#getName()
	 * @see #getView()
	 * @generated
	 */
	EAttribute getView_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.View#getOutputLayer <em>Output Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Layer</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.View#getOutputLayer()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_OutputLayer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.View#getSelectionLayerSQL <em>Selection Layer SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Selection Layer SQL</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.View#getSelectionLayerSQL()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_SelectionLayerSQL();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.LayerSQL <em>Layer SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer SQL</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.LayerSQL
	 * @generated
	 */
	EClass getLayerSQL();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.LayerSQL#getSelectionLayer <em>Selection Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selection Layer</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.LayerSQL#getSelectionLayer()
	 * @see #getLayerSQL()
	 * @generated
	 */
	EReference getLayerSQL_SelectionLayer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.LayerSQL#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.LayerSQL#getColumns()
	 * @see #getLayerSQL()
	 * @generated
	 */
	EReference getLayerSQL_Columns();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.LayerSQL#getWhereClause <em>Where Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Where Clause</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.LayerSQL#getWhereClause()
	 * @see #getLayerSQL()
	 * @generated
	 */
	EReference getLayerSQL_WhereClause();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectClause <em>Select Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Clause</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectClause
	 * @generated
	 */
	EClass getSelectClause();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectColumn <em>Select Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Column</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectColumn
	 * @generated
	 */
	EClass getSelectColumn();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectColumn#getAsAttribute <em>As Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>As Attribute</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectColumn#getAsAttribute()
	 * @see #getSelectColumn()
	 * @generated
	 */
	EReference getSelectColumn_AsAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectColumnMemberAs <em>Select Column Member As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Column Member As</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectColumnMemberAs
	 * @generated
	 */
	EClass getSelectColumnMemberAs();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectColumnMemberAs#getMemberAsConstant <em>Member As Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member As Constant</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectColumnMemberAs#getMemberAsConstant()
	 * @see #getSelectColumnMemberAs()
	 * @generated
	 */
	EReference getSelectColumnMemberAs_MemberAsConstant();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectValueAs <em>Select Value As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Value As</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectValueAs
	 * @generated
	 */
	EClass getSelectValueAs();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectValueAs#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectValueAs#getValue()
	 * @see #getSelectValueAs()
	 * @generated
	 */
	EAttribute getSelectValueAs_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectColumnAttributeAs <em>Select Column Attribute As</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Column Attribute As</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectColumnAttributeAs
	 * @generated
	 */
	EClass getSelectColumnAttributeAs();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectColumnAttributeAs#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectColumnAttributeAs#getAttribute()
	 * @see #getSelectColumnAttributeAs()
	 * @generated
	 */
	EReference getSelectColumnAttributeAs_Attribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.WhereClause <em>Where Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Where Clause</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.WhereClause
	 * @generated
	 */
	EClass getWhereClause();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.WhereClause#getAttribute1 <em>Attribute1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute1</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.WhereClause#getAttribute1()
	 * @see #getWhereClause()
	 * @generated
	 */
	EReference getWhereClause_Attribute1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.WhereClause#getComparitor <em>Comparitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparitor</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.WhereClause#getComparitor()
	 * @see #getWhereClause()
	 * @generated
	 */
	EAttribute getWhereClause_Comparitor();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.WhereClause#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.WhereClause#getMember()
	 * @see #getWhereClause()
	 * @generated
	 */
	EReference getWhereClause_Member();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.WhereClause#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.WhereClause#getValue()
	 * @see #getWhereClause()
	 * @generated
	 */
	EAttribute getWhereClause_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ViewModule <em>View Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Module</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ViewModule
	 * @generated
	 */
	EClass getViewModule();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ViewModule#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ViewModule#getViews()
	 * @see #getViewModule()
	 * @generated
	 */
	EReference getViewModule_Views();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ActivityTag <em>Activity Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Tag</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ActivityTag
	 * @generated
	 */
	EClass getActivityTag();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ActivityTag#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ActivityTag#getActivity()
	 * @see #getActivityTag()
	 * @generated
	 */
	EReference getActivityTag_Activity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Scenario#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Scenario#getName()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Scenario#isInvisible <em>Invisible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invisible</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Scenario#isInvisible()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Invisible();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Scenario#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Scenario#getDescription()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Scenario#getRequiredAttributes <em>Required Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Attributes</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Scenario#getRequiredAttributes()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_RequiredAttributes();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Scenario#getData_constraints <em>Data constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data constraints</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Scenario#getData_constraints()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Data_constraints();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ScenarioTag <em>Scenario Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario Tag</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ScenarioTag
	 * @generated
	 */
	EClass getScenarioTag();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ScenarioTag#getScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scenario</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ScenarioTag#getScenario()
	 * @see #getScenarioTag()
	 * @generated
	 */
	EReference getScenarioTag_Scenario();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Test
	 * @generated
	 */
	EClass getTest();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Test#getInputData <em>Input Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Data</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Test#getInputData()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_InputData();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Test#getExpectedResult <em>Expected Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expected Result</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Test#getExpectedResult()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_ExpectedResult();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Test#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Test#getName()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Test#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Test#getScope()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_Scope();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TestModule <em>Test Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Module</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TestModule
	 * @generated
	 */
	EClass getTestModule();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TestModule#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tests</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TestModule#getTests()
	 * @see #getTestModule()
	 * @generated
	 */
	EReference getTestModule_Tests();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.DataConstraint <em>Data Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Constraint</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.DataConstraint
	 * @generated
	 */
	EClass getDataConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.DataConstraint#getAttr1 <em>Attr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attr1</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.DataConstraint#getAttr1()
	 * @see #getDataConstraint()
	 * @generated
	 */
	EReference getDataConstraint_Attr1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.DataConstraint#getComparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.DataConstraint#getComparison()
	 * @see #getDataConstraint()
	 * @generated
	 */
	EAttribute getDataConstraint_Comparison();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.DataConstraint#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.DataConstraint#getMember()
	 * @see #getDataConstraint()
	 * @generated
	 */
	EReference getDataConstraint_Member();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.DataConstraint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.DataConstraint#getValue()
	 * @see #getDataConstraint()
	 * @generated
	 */
	EAttribute getDataConstraint_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectionLayer <em>Selection Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Layer</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectionLayer
	 * @generated
	 */
	EClass getSelectionLayer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectionLayer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectionLayer#getName()
	 * @see #getSelectionLayer()
	 * @generated
	 */
	EAttribute getSelectionLayer_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectionLayer#getInvisible <em>Invisible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invisible</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectionLayer#getInvisible()
	 * @see #getSelectionLayer()
	 * @generated
	 */
	EAttribute getSelectionLayer_Invisible();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectionLayer#getGeneratedEntity <em>Generated Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generated Entity</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectionLayer#getGeneratedEntity()
	 * @see #getSelectionLayer()
	 * @generated
	 */
	EReference getSelectionLayer_GeneratedEntity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TestScope <em>Test Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Scope</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TestScope
	 * @generated
	 */
	EClass getTestScope();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TestScope#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TestScope#getName()
	 * @see #getTestScope()
	 * @generated
	 */
	EAttribute getTestScope_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.UnitTestScope <em>Unit Test Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Test Scope</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.UnitTestScope
	 * @generated
	 */
	EClass getUnitTestScope();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.UnitTestScope#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scenarios</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.UnitTestScope#getScenarios()
	 * @see #getUnitTestScope()
	 * @generated
	 */
	EReference getUnitTestScope_Scenarios();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.E2ETestScope <em>E2E Test Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>E2E Test Scope</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.E2ETestScope
	 * @generated
	 */
	EClass getE2ETestScope();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.E2ETestScope#getScenarios <em>Scenarios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scenarios</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.E2ETestScope#getScenarios()
	 * @see #getE2ETestScope()
	 * @generated
	 */
	EReference getE2ETestScope_Scenarios();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.E2ETestScope#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layer</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.E2ETestScope#getLayer()
	 * @see #getE2ETestScope()
	 * @generated
	 */
	EReference getE2ETestScope_Layer();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.E2ETestScope#getScriptTask <em>Script Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Script Task</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.E2ETestScope#getScriptTask()
	 * @see #getE2ETestScope()
	 * @generated
	 */
	EReference getE2ETestScope_ScriptTask();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.InputFile <em>Input File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input File</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.InputFile
	 * @generated
	 */
	EClass getInputFile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.InputFile#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.InputFile#getFileName()
	 * @see #getInputFile()
	 * @generated
	 */
	EAttribute getInputFile_FileName();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.InputFile#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.InputFile#getEntity()
	 * @see #getInputFile()
	 * @generated
	 */
	EReference getInputFile_Entity();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.WorkflowModule <em>Workflow Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Module</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.WorkflowModule
	 * @generated
	 */
	EClass getWorkflowModule();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.WorkflowModule#getTaskTags <em>Task Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task Tags</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.WorkflowModule#getTaskTags()
	 * @see #getWorkflowModule()
	 * @generated
	 */
	EReference getWorkflowModule_TaskTags();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.WorkflowModule#getScenarioTags <em>Scenario Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenario Tags</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.WorkflowModule#getScenarioTags()
	 * @see #getWorkflowModule()
	 * @generated
	 */
	EReference getWorkflowModule_ScenarioTags();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.WorkflowModule#getSubProcess <em>Sub Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Process</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.WorkflowModule#getSubProcess()
	 * @see #getWorkflowModule()
	 * @generated
	 */
	EReference getWorkflowModule_SubProcess();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XAttribute <em>XAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XAttribute</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XAttribute
	 * @generated
	 */
	EClass getXAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XAttribute#getDefaultValueLiteral <em>Default Value Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value Literal</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XAttribute#getDefaultValueLiteral()
	 * @see #getXAttribute()
	 * @generated
	 */
	EAttribute getXAttribute_DefaultValueLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XAttribute#isID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XAttribute#isID()
	 * @see #getXAttribute()
	 * @generated
	 */
	EAttribute getXAttribute_ID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XClass <em>XClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XClass</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XClass
	 * @generated
	 */
	EClass getXClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XClass#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XClass#isAbstract()
	 * @see #getXClass()
	 * @generated
	 */
	EAttribute getXClass_Abstract();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XClass#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XClass#getMembers()
	 * @see #getXClass()
	 * @generated
	 */
	EReference getXClass_Members();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XClass#getSuperTypes <em>Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Types</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XClass#getSuperTypes()
	 * @see #getXClass()
	 * @generated
	 */
	EReference getXClass_SuperTypes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XClassifier <em>XClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XClassifier</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XClassifier
	 * @generated
	 */
	EClass getXClassifier();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XClassifier#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XClassifier#getPackage()
	 * @see #getXClassifier()
	 * @generated
	 */
	EReference getXClassifier_Package();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XDataType <em>XData Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XData Type</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XDataType
	 * @generated
	 */
	EClass getXDataType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XDataType#getIndustryName <em>Industry Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Industry Name</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XDataType#getIndustryName()
	 * @see #getXDataType()
	 * @generated
	 */
	EAttribute getXDataType_IndustryName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XEnum <em>XEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XEnum</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XEnum
	 * @generated
	 */
	EClass getXEnum();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XEnum#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XEnum#getLiterals()
	 * @see #getXEnum()
	 * @generated
	 */
	EReference getXEnum_Literals();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XEnumLiteral <em>XEnum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XEnum Literal</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XEnumLiteral
	 * @generated
	 */
	EClass getXEnumLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XEnumLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XEnumLiteral#getValue()
	 * @see #getXEnumLiteral()
	 * @generated
	 */
	EAttribute getXEnumLiteral_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XEnumLiteral#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XEnumLiteral#getLiteral()
	 * @see #getXEnumLiteral()
	 * @generated
	 */
	EAttribute getXEnumLiteral_Literal();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XEnumLiteral#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Enum</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XEnumLiteral#getEnum()
	 * @see #getXEnumLiteral()
	 * @generated
	 */
	EReference getXEnumLiteral_Enum();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XMember <em>XMember</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XMember</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XMember
	 * @generated
	 */
	EClass getXMember();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XMember#getContainingClass <em>Containing Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Containing Class</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XMember#getContainingClass()
	 * @see #getXMember()
	 * @generated
	 */
	EReference getXMember_ContainingClass();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XModelElement <em>XModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XModel Element</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XModelElement
	 * @generated
	 */
	EClass getXModelElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XNamedElement <em>XNamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XNamed Element</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XNamedElement
	 * @generated
	 */
	EClass getXNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XNamedElement#getName()
	 * @see #getXNamedElement()
	 * @generated
	 */
	EAttribute getXNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XOperation <em>XOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XOperation</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XOperation
	 * @generated
	 */
	EClass getXOperation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XOperation#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XOperation#getBody()
	 * @see #getXOperation()
	 * @generated
	 */
	EAttribute getXOperation_Body();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XPackage <em>XPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XPackage</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XPackage
	 * @generated
	 */
	EClass getXPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XPackage#getClassifiers <em>Classifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classifiers</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XPackage#getClassifiers()
	 * @see #getXPackage()
	 * @generated
	 */
	EReference getXPackage_Classifiers();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XReference <em>XReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XReference</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XReference
	 * @generated
	 */
	EClass getXReference();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XReference#isContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Containment</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XReference#isContainment()
	 * @see #getXReference()
	 * @generated
	 */
	EAttribute getXReference_Containment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XStructuralFeature <em>XStructural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XStructural Feature</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XStructuralFeature
	 * @generated
	 */
	EClass getXStructuralFeature();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XTypedElement <em>XTyped Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XTyped Element</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XTypedElement
	 * @generated
	 */
	EClass getXTypedElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XTypedElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XTypedElement#getType()
	 * @see #getXTypedElement()
	 * @generated
	 */
	EReference getXTypedElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XTypedElement#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XTypedElement#getUpperBound()
	 * @see #getXTypedElement()
	 * @generated
	 */
	EAttribute getXTypedElement_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XTypedElement#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XTypedElement#getLowerBound()
	 * @see #getXTypedElement()
	 * @generated
	 */
	EAttribute getXTypedElement_LowerBound();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLEnrichedCube <em>VTL Enriched Cube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTL Enriched Cube</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLEnrichedCube
	 * @generated
	 */
	EClass getVTLEnrichedCube();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLEnrichedCube#getTransformations <em>Transformations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformations</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLEnrichedCube#getTransformations()
	 * @see #getVTLEnrichedCube()
	 * @generated
	 */
	EReference getVTLEnrichedCube_Transformations();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLGeneratedOutputlayer <em>VTL Generated Outputlayer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTL Generated Outputlayer</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLGeneratedOutputlayer
	 * @generated
	 */
	EClass getVTLGeneratedOutputlayer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLGeneratedOutputlayer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLGeneratedOutputlayer#getName()
	 * @see #getVTLGeneratedOutputlayer()
	 * @generated
	 */
	EAttribute getVTLGeneratedOutputlayer_Name();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLGeneratedOutputlayer#getDependant_intermediate_layers <em>Dependant intermediate layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependant intermediate layers</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLGeneratedOutputlayer#getDependant_intermediate_layers()
	 * @see #getVTLGeneratedOutputlayer()
	 * @generated
	 */
	EReference getVTLGeneratedOutputlayer_Dependant_intermediate_layers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLGeneratedOutputlayer#getVTLForOutputLayerAndIntemedateLayerCombinations <em>VTL For Output Layer And Intemedate Layer Combinations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>VTL For Output Layer And Intemedate Layer Combinations</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLGeneratedOutputlayer#getVTLForOutputLayerAndIntemedateLayerCombinations()
	 * @see #getVTLGeneratedOutputlayer()
	 * @generated
	 */
	EReference getVTLGeneratedOutputlayer_VTLForOutputLayerAndIntemedateLayerCombinations();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLGeneratedOutputlayer#getOutputLayer <em>Output Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Layer</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLGeneratedOutputlayer#getOutputLayer()
	 * @see #getVTLGeneratedOutputlayer()
	 * @generated
	 */
	EReference getVTLGeneratedOutputlayer_OutputLayer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForOutputLayerAndIntermediateLayerCombination <em>VTL For Output Layer And Intermediate Layer Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTL For Output Layer And Intermediate Layer Combination</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForOutputLayerAndIntermediateLayerCombination
	 * @generated
	 */
	EClass getVTLForOutputLayerAndIntermediateLayerCombination();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForOutputLayerAndIntermediateLayerCombination#getTransformations <em>Transformations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformations</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForOutputLayerAndIntermediateLayerCombination#getTransformations()
	 * @see #getVTLForOutputLayerAndIntermediateLayerCombination()
	 * @generated
	 */
	EReference getVTLForOutputLayerAndIntermediateLayerCombination_Transformations();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForOutputLayerAndIntermediateLayerCombination#getOutputLayer <em>Output Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Layer</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForOutputLayerAndIntermediateLayerCombination#getOutputLayer()
	 * @see #getVTLForOutputLayerAndIntermediateLayerCombination()
	 * @generated
	 */
	EReference getVTLForOutputLayerAndIntermediateLayerCombination_OutputLayer();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForOutputLayerAndIntermediateLayerCombination#getIntermediateLayer <em>Intermediate Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Intermediate Layer</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForOutputLayerAndIntermediateLayerCombination#getIntermediateLayer()
	 * @see #getVTLForOutputLayerAndIntermediateLayerCombination()
	 * @generated
	 */
	EReference getVTLForOutputLayerAndIntermediateLayerCombination_IntermediateLayer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLGeneratedIntermediateLayer <em>VTL Generated Intermediate Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTL Generated Intermediate Layer</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLGeneratedIntermediateLayer
	 * @generated
	 */
	EClass getVTLGeneratedIntermediateLayer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLGeneratedIntermediateLayer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLGeneratedIntermediateLayer#getName()
	 * @see #getVTLGeneratedIntermediateLayer()
	 * @generated
	 */
	EAttribute getVTLGeneratedIntermediateLayer_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLGeneratedIntermediateLayer#getDependant_enriched_cubes <em>Dependant enriched cubes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependant enriched cubes</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLGeneratedIntermediateLayer#getDependant_enriched_cubes()
	 * @see #getVTLGeneratedIntermediateLayer()
	 * @generated
	 */
	EReference getVTLGeneratedIntermediateLayer_Dependant_enriched_cubes();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLGeneratedIntermediateLayer#getTransformations <em>Transformations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformations</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLGeneratedIntermediateLayer#getTransformations()
	 * @see #getVTLGeneratedIntermediateLayer()
	 * @generated
	 */
	EReference getVTLGeneratedIntermediateLayer_Transformations();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLTransformation <em>VTL Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTL Transformation</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLTransformation
	 * @generated
	 */
	EClass getVTLTransformation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLTransformation#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLTransformation#getExpression()
	 * @see #getVTLTransformation()
	 * @generated
	 */
	EAttribute getVTLTransformation_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLTransformation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLTransformation#getDescription()
	 * @see #getVTLTransformation()
	 * @generated
	 */
	EAttribute getVTLTransformation_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLTransformation#getTransformation_id <em>Transformation id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transformation id</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLTransformation#getTransformation_id()
	 * @see #getVTLTransformation()
	 * @generated
	 */
	EAttribute getVTLTransformation_Transformation_id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLTransformation#getOrder_in_scheme <em>Order in scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order in scheme</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLTransformation#getOrder_in_scheme()
	 * @see #getVTLTransformation()
	 * @generated
	 */
	EAttribute getVTLTransformation_Order_in_scheme();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLScheme <em>VTL Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTL Scheme</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLScheme
	 * @generated
	 */
	EClass getVTLScheme();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLScheme#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLScheme#getExpressions()
	 * @see #getVTLScheme()
	 * @generated
	 */
	EReference getVTLScheme_Expressions();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLScheme#getScheme_id <em>Scheme id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheme id</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLScheme#getScheme_id()
	 * @see #getVTLScheme()
	 * @generated
	 */
	EAttribute getVTLScheme_Scheme_id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForSelectionLayer <em>VTL For Selection Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTL For Selection Layer</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForSelectionLayer
	 * @generated
	 */
	EClass getVTLForSelectionLayer();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForSelectionLayer#getSelectionLayer <em>Selection Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selection Layer</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForSelectionLayer#getSelectionLayer()
	 * @see #getVTLForSelectionLayer()
	 * @generated
	 */
	EReference getVTLForSelectionLayer_SelectionLayer();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForSelectionLayer#getOutputLayer <em>Output Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output Layer</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForSelectionLayer#getOutputLayer()
	 * @see #getVTLForSelectionLayer()
	 * @generated
	 */
	EReference getVTLForSelectionLayer_OutputLayer();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForSelectionLayer#getIntermediateLayer <em>Intermediate Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Intermediate Layer</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForSelectionLayer#getIntermediateLayer()
	 * @see #getVTLForSelectionLayer()
	 * @generated
	 */
	EReference getVTLForSelectionLayer_IntermediateLayer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLModule <em>VTL Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTL Module</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLModule
	 * @generated
	 */
	EClass getVTLModule();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLModule#getVTLSchemes <em>VTL Schemes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>VTL Schemes</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLModule#getVTLSchemes()
	 * @see #getVTLModule()
	 * @generated
	 */
	EReference getVTLModule_VTLSchemes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLModule#getVTLGeneratedOutputLayers <em>VTL Generated Output Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>VTL Generated Output Layers</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLModule#getVTLGeneratedOutputLayers()
	 * @see #getVTLModule()
	 * @generated
	 */
	EReference getVTLModule_VTLGeneratedOutputLayers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLModule#getVTLGeneratedIntermediateLayers <em>VTL Generated Intermediate Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>VTL Generated Intermediate Layers</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLModule#getVTLGeneratedIntermediateLayers()
	 * @see #getVTLModule()
	 * @generated
	 */
	EReference getVTLModule_VTLGeneratedIntermediateLayers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLModule#getVTLEnrichedCubes <em>VTL Enriched Cubes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>VTL Enriched Cubes</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLModule#getVTLEnrichedCubes()
	 * @see #getVTLModule()
	 * @generated
	 */
	EReference getVTLModule_VTLEnrichedCubes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLModule#getVTLForSelectionLayers <em>VTL For Selection Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>VTL For Selection Layers</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLModule#getVTLForSelectionLayers()
	 * @see #getVTLModule()
	 * @generated
	 */
	EReference getVTLModule_VTLForSelectionLayers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLModule#getEntityToVTLIntermediateLayerLinks <em>Entity To VTL Intermediate Layer Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity To VTL Intermediate Layer Links</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLModule#getEntityToVTLIntermediateLayerLinks()
	 * @see #getVTLModule()
	 * @generated
	 */
	EReference getVTLModule_EntityToVTLIntermediateLayerLinks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLModule#getVTLForViews <em>VTL For Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>VTL For Views</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLModule#getVTLForViews()
	 * @see #getVTLModule()
	 * @generated
	 */
	EReference getVTLModule_VTLForViews();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.EntityToVTLIntermediateLayerLink <em>Entity To VTL Intermediate Layer Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity To VTL Intermediate Layer Link</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.EntityToVTLIntermediateLayerLink
	 * @generated
	 */
	EClass getEntityToVTLIntermediateLayerLink();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.EntityToVTLIntermediateLayerLink#getVTLIntermediateLayer <em>VTL Intermediate Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>VTL Intermediate Layer</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.EntityToVTLIntermediateLayerLink#getVTLIntermediateLayer()
	 * @see #getEntityToVTLIntermediateLayerLink()
	 * @generated
	 */
	EReference getEntityToVTLIntermediateLayerLink_VTLIntermediateLayer();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.EntityToVTLIntermediateLayerLink#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.EntityToVTLIntermediateLayerLink#getEntity()
	 * @see #getEntityToVTLIntermediateLayerLink()
	 * @generated
	 */
	EReference getEntityToVTLIntermediateLayerLink_Entity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.EntityToVTLIntermediateLayerLink#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.EntityToVTLIntermediateLayerLink#getFilter()
	 * @see #getEntityToVTLIntermediateLayerLink()
	 * @generated
	 */
	EAttribute getEntityToVTLIntermediateLayerLink_Filter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForView <em>VTL For View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTL For View</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForView
	 * @generated
	 */
	EClass getVTLForView();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForView#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForView#getName()
	 * @see #getVTLForView()
	 * @generated
	 */
	EAttribute getVTLForView_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForView#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>View</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForView#getView()
	 * @see #getVTLForView()
	 * @generated
	 */
	EReference getVTLForView_View();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForView#getVtl <em>Vtl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vtl</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForView#getVtl()
	 * @see #getVTLForView()
	 * @generated
	 */
	EReference getVTLForView_Vtl();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Comparitor <em>Comparitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparitor</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Comparitor
	 * @generated
	 */
	EEnum getComparitor();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.AttrComparison <em>Attr Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attr Comparison</em>'.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.AttrComparison
	 * @generated
	 */
	EEnum getAttrComparison();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Open_reg_specsFactory getOpen_reg_specsFactory();

} //Open_reg_specsPackage
