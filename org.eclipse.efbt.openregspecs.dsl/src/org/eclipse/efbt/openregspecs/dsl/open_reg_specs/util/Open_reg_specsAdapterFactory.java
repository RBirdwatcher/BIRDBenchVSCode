/**
 */
package org.eclipse.efbt.openregspecs.dsl.open_reg_specs.util;

import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Activity;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ActivityTag;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.AllowedTypes;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.BaseElement;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.DataConstraint;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.E2ETestScope;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.EntityToVTLIntermediateLayerLink;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ExclusiveGateway;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.FlowElement;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.FlowElementsContainer;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.FlowNode;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Gateway;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Import;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.InclusiveGateway;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.InputFile;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.LayerSQL;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ModuleList;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ParallelGateway;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementType;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsModule;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSection;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSectionImage;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSectionLinkWithText;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSectionText;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Scenario;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ScenarioTag;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ScriptTask;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectClause;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectColumn;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectColumnAttributeAs;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectColumnMemberAs;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectValueAs;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectionLayer;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SequenceFlow;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ServiceTask;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SubProcess;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Tag;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TagGroup;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Task;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Test;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TestModule;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TestScope;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TitledRequirementsSection;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.UnitTestScope;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.UserTask;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLEnrichedCube;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForOutputLayerAndIntermediateLayerCombination;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForSelectionLayer;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForView;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLGeneratedIntermediateLayer;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLGeneratedOutputlayer;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLModule;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLScheme;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLTransformation;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.View;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ViewModule;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.WhereClause;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.WorkflowModule;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XAttribute;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XClass;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XClassifier;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XDataType;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XEnum;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XEnumLiteral;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XMember;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XModelElement;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XNamedElement;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XOperation;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XPackage;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XReference;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XStructuralFeature;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XTypedElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage
 * @generated
 */
public class Open_reg_specsAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Open_reg_specsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Open_reg_specsAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = Open_reg_specsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Open_reg_specsSwitch<Adapter> modelSwitch =
		new Open_reg_specsSwitch<Adapter>()
		{
			@Override
			public Adapter caseBaseElement(BaseElement object)
			{
				return createBaseElementAdapter();
			}
			@Override
			public Adapter caseFlowElementsContainer(FlowElementsContainer object)
			{
				return createFlowElementsContainerAdapter();
			}
			@Override
			public Adapter caseFlowElement(FlowElement object)
			{
				return createFlowElementAdapter();
			}
			@Override
			public Adapter caseFlowNode(FlowNode object)
			{
				return createFlowNodeAdapter();
			}
			@Override
			public Adapter caseSequenceFlow(SequenceFlow object)
			{
				return createSequenceFlowAdapter();
			}
			@Override
			public Adapter caseTask(Task object)
			{
				return createTaskAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object)
			{
				return createActivityAdapter();
			}
			@Override
			public Adapter caseGateway(Gateway object)
			{
				return createGatewayAdapter();
			}
			@Override
			public Adapter caseExclusiveGateway(ExclusiveGateway object)
			{
				return createExclusiveGatewayAdapter();
			}
			@Override
			public Adapter caseInclusiveGateway(InclusiveGateway object)
			{
				return createInclusiveGatewayAdapter();
			}
			@Override
			public Adapter caseParallelGateway(ParallelGateway object)
			{
				return createParallelGatewayAdapter();
			}
			@Override
			public Adapter caseServiceTask(ServiceTask object)
			{
				return createServiceTaskAdapter();
			}
			@Override
			public Adapter caseSubProcess(SubProcess object)
			{
				return createSubProcessAdapter();
			}
			@Override
			public Adapter caseScriptTask(ScriptTask object)
			{
				return createScriptTaskAdapter();
			}
			@Override
			public Adapter caseUserTask(UserTask object)
			{
				return createUserTaskAdapter();
			}
			@Override
			public Adapter caseImport(Import object)
			{
				return createImportAdapter();
			}
			@Override
			public Adapter caseModule(org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Module object)
			{
				return createModuleAdapter();
			}
			@Override
			public Adapter caseModuleList(ModuleList object)
			{
				return createModuleListAdapter();
			}
			@Override
			public Adapter caseAllowedTypes(AllowedTypes object)
			{
				return createAllowedTypesAdapter();
			}
			@Override
			public Adapter caseRequirementsModule(RequirementsModule object)
			{
				return createRequirementsModuleAdapter();
			}
			@Override
			public Adapter caseRequirementsSection(RequirementsSection object)
			{
				return createRequirementsSectionAdapter();
			}
			@Override
			public Adapter caseRequirementsSectionImage(RequirementsSectionImage object)
			{
				return createRequirementsSectionImageAdapter();
			}
			@Override
			public Adapter caseRequirementsSectionLinkWithText(RequirementsSectionLinkWithText object)
			{
				return createRequirementsSectionLinkWithTextAdapter();
			}
			@Override
			public Adapter caseRequirementsSectionText(RequirementsSectionText object)
			{
				return createRequirementsSectionTextAdapter();
			}
			@Override
			public Adapter caseRequirementType(RequirementType object)
			{
				return createRequirementTypeAdapter();
			}
			@Override
			public Adapter caseTitledRequirementsSection(TitledRequirementsSection object)
			{
				return createTitledRequirementsSectionAdapter();
			}
			@Override
			public Adapter caseTag(Tag object)
			{
				return createTagAdapter();
			}
			@Override
			public Adapter caseTagGroup(TagGroup object)
			{
				return createTagGroupAdapter();
			}
			@Override
			public Adapter caseView(View object)
			{
				return createViewAdapter();
			}
			@Override
			public Adapter caseLayerSQL(LayerSQL object)
			{
				return createLayerSQLAdapter();
			}
			@Override
			public Adapter caseSelectClause(SelectClause object)
			{
				return createSelectClauseAdapter();
			}
			@Override
			public Adapter caseSelectColumn(SelectColumn object)
			{
				return createSelectColumnAdapter();
			}
			@Override
			public Adapter caseSelectColumnMemberAs(SelectColumnMemberAs object)
			{
				return createSelectColumnMemberAsAdapter();
			}
			@Override
			public Adapter caseSelectValueAs(SelectValueAs object)
			{
				return createSelectValueAsAdapter();
			}
			@Override
			public Adapter caseSelectColumnAttributeAs(SelectColumnAttributeAs object)
			{
				return createSelectColumnAttributeAsAdapter();
			}
			@Override
			public Adapter caseWhereClause(WhereClause object)
			{
				return createWhereClauseAdapter();
			}
			@Override
			public Adapter caseViewModule(ViewModule object)
			{
				return createViewModuleAdapter();
			}
			@Override
			public Adapter caseActivityTag(ActivityTag object)
			{
				return createActivityTagAdapter();
			}
			@Override
			public Adapter caseScenario(Scenario object)
			{
				return createScenarioAdapter();
			}
			@Override
			public Adapter caseScenarioTag(ScenarioTag object)
			{
				return createScenarioTagAdapter();
			}
			@Override
			public Adapter caseTest(Test object)
			{
				return createTestAdapter();
			}
			@Override
			public Adapter caseTestModule(TestModule object)
			{
				return createTestModuleAdapter();
			}
			@Override
			public Adapter caseDataConstraint(DataConstraint object)
			{
				return createDataConstraintAdapter();
			}
			@Override
			public Adapter caseSelectionLayer(SelectionLayer object)
			{
				return createSelectionLayerAdapter();
			}
			@Override
			public Adapter caseTestScope(TestScope object)
			{
				return createTestScopeAdapter();
			}
			@Override
			public Adapter caseUnitTestScope(UnitTestScope object)
			{
				return createUnitTestScopeAdapter();
			}
			@Override
			public Adapter caseE2ETestScope(E2ETestScope object)
			{
				return createE2ETestScopeAdapter();
			}
			@Override
			public Adapter caseInputFile(InputFile object)
			{
				return createInputFileAdapter();
			}
			@Override
			public Adapter caseWorkflowModule(WorkflowModule object)
			{
				return createWorkflowModuleAdapter();
			}
			@Override
			public Adapter caseXAttribute(XAttribute object)
			{
				return createXAttributeAdapter();
			}
			@Override
			public Adapter caseXClass(XClass object)
			{
				return createXClassAdapter();
			}
			@Override
			public Adapter caseXClassifier(XClassifier object)
			{
				return createXClassifierAdapter();
			}
			@Override
			public Adapter caseXDataType(XDataType object)
			{
				return createXDataTypeAdapter();
			}
			@Override
			public Adapter caseXEnum(XEnum object)
			{
				return createXEnumAdapter();
			}
			@Override
			public Adapter caseXEnumLiteral(XEnumLiteral object)
			{
				return createXEnumLiteralAdapter();
			}
			@Override
			public Adapter caseXMember(XMember object)
			{
				return createXMemberAdapter();
			}
			@Override
			public Adapter caseXModelElement(XModelElement object)
			{
				return createXModelElementAdapter();
			}
			@Override
			public Adapter caseXNamedElement(XNamedElement object)
			{
				return createXNamedElementAdapter();
			}
			@Override
			public Adapter caseXOperation(XOperation object)
			{
				return createXOperationAdapter();
			}
			@Override
			public Adapter caseXPackage(XPackage object)
			{
				return createXPackageAdapter();
			}
			@Override
			public Adapter caseXReference(XReference object)
			{
				return createXReferenceAdapter();
			}
			@Override
			public Adapter caseXStructuralFeature(XStructuralFeature object)
			{
				return createXStructuralFeatureAdapter();
			}
			@Override
			public Adapter caseXTypedElement(XTypedElement object)
			{
				return createXTypedElementAdapter();
			}
			@Override
			public Adapter caseVTLEnrichedCube(VTLEnrichedCube object)
			{
				return createVTLEnrichedCubeAdapter();
			}
			@Override
			public Adapter caseVTLGeneratedOutputlayer(VTLGeneratedOutputlayer object)
			{
				return createVTLGeneratedOutputlayerAdapter();
			}
			@Override
			public Adapter caseVTLForOutputLayerAndIntermediateLayerCombination(VTLForOutputLayerAndIntermediateLayerCombination object)
			{
				return createVTLForOutputLayerAndIntermediateLayerCombinationAdapter();
			}
			@Override
			public Adapter caseVTLGeneratedIntermediateLayer(VTLGeneratedIntermediateLayer object)
			{
				return createVTLGeneratedIntermediateLayerAdapter();
			}
			@Override
			public Adapter caseVTLTransformation(VTLTransformation object)
			{
				return createVTLTransformationAdapter();
			}
			@Override
			public Adapter caseVTLScheme(VTLScheme object)
			{
				return createVTLSchemeAdapter();
			}
			@Override
			public Adapter caseVTLForSelectionLayer(VTLForSelectionLayer object)
			{
				return createVTLForSelectionLayerAdapter();
			}
			@Override
			public Adapter caseVTLModule(VTLModule object)
			{
				return createVTLModuleAdapter();
			}
			@Override
			public Adapter caseEntityToVTLIntermediateLayerLink(EntityToVTLIntermediateLayerLink object)
			{
				return createEntityToVTLIntermediateLayerLinkAdapter();
			}
			@Override
			public Adapter caseVTLForView(VTLForView object)
			{
				return createVTLForViewAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.BaseElement <em>Base Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.BaseElement
	 * @generated
	 */
	public Adapter createBaseElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.FlowElementsContainer <em>Flow Elements Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.FlowElementsContainer
	 * @generated
	 */
	public Adapter createFlowElementsContainerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.FlowElement <em>Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.FlowElement
	 * @generated
	 */
	public Adapter createFlowElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.FlowNode <em>Flow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.FlowNode
	 * @generated
	 */
	public Adapter createFlowNodeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SequenceFlow <em>Sequence Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SequenceFlow
	 * @generated
	 */
	public Adapter createSequenceFlowAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Task
	 * @generated
	 */
	public Adapter createTaskAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Gateway
	 * @generated
	 */
	public Adapter createGatewayAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ExclusiveGateway <em>Exclusive Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ExclusiveGateway
	 * @generated
	 */
	public Adapter createExclusiveGatewayAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.InclusiveGateway <em>Inclusive Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.InclusiveGateway
	 * @generated
	 */
	public Adapter createInclusiveGatewayAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ParallelGateway <em>Parallel Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ParallelGateway
	 * @generated
	 */
	public Adapter createParallelGatewayAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ServiceTask <em>Service Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ServiceTask
	 * @generated
	 */
	public Adapter createServiceTaskAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SubProcess <em>Sub Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SubProcess
	 * @generated
	 */
	public Adapter createSubProcessAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ScriptTask <em>Script Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ScriptTask
	 * @generated
	 */
	public Adapter createScriptTaskAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.UserTask <em>User Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.UserTask
	 * @generated
	 */
	public Adapter createUserTaskAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Import
	 * @generated
	 */
	public Adapter createImportAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Module
	 * @generated
	 */
	public Adapter createModuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ModuleList <em>Module List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ModuleList
	 * @generated
	 */
	public Adapter createModuleListAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.AllowedTypes <em>Allowed Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.AllowedTypes
	 * @generated
	 */
	public Adapter createAllowedTypesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsModule <em>Requirements Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsModule
	 * @generated
	 */
	public Adapter createRequirementsModuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSection <em>Requirements Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSection
	 * @generated
	 */
	public Adapter createRequirementsSectionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSectionImage <em>Requirements Section Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSectionImage
	 * @generated
	 */
	public Adapter createRequirementsSectionImageAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSectionLinkWithText <em>Requirements Section Link With Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSectionLinkWithText
	 * @generated
	 */
	public Adapter createRequirementsSectionLinkWithTextAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSectionText <em>Requirements Section Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSectionText
	 * @generated
	 */
	public Adapter createRequirementsSectionTextAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementType <em>Requirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementType
	 * @generated
	 */
	public Adapter createRequirementTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TitledRequirementsSection <em>Titled Requirements Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TitledRequirementsSection
	 * @generated
	 */
	public Adapter createTitledRequirementsSectionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Tag
	 * @generated
	 */
	public Adapter createTagAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TagGroup <em>Tag Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TagGroup
	 * @generated
	 */
	public Adapter createTagGroupAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.View
	 * @generated
	 */
	public Adapter createViewAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.LayerSQL <em>Layer SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.LayerSQL
	 * @generated
	 */
	public Adapter createLayerSQLAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectClause <em>Select Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectClause
	 * @generated
	 */
	public Adapter createSelectClauseAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectColumn <em>Select Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectColumn
	 * @generated
	 */
	public Adapter createSelectColumnAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectColumnMemberAs <em>Select Column Member As</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectColumnMemberAs
	 * @generated
	 */
	public Adapter createSelectColumnMemberAsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectValueAs <em>Select Value As</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectValueAs
	 * @generated
	 */
	public Adapter createSelectValueAsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectColumnAttributeAs <em>Select Column Attribute As</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectColumnAttributeAs
	 * @generated
	 */
	public Adapter createSelectColumnAttributeAsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.WhereClause <em>Where Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.WhereClause
	 * @generated
	 */
	public Adapter createWhereClauseAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ViewModule <em>View Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ViewModule
	 * @generated
	 */
	public Adapter createViewModuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ActivityTag <em>Activity Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ActivityTag
	 * @generated
	 */
	public Adapter createActivityTagAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Scenario
	 * @generated
	 */
	public Adapter createScenarioAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ScenarioTag <em>Scenario Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ScenarioTag
	 * @generated
	 */
	public Adapter createScenarioTagAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Test
	 * @generated
	 */
	public Adapter createTestAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TestModule <em>Test Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TestModule
	 * @generated
	 */
	public Adapter createTestModuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.DataConstraint <em>Data Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.DataConstraint
	 * @generated
	 */
	public Adapter createDataConstraintAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectionLayer <em>Selection Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectionLayer
	 * @generated
	 */
	public Adapter createSelectionLayerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TestScope <em>Test Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TestScope
	 * @generated
	 */
	public Adapter createTestScopeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.UnitTestScope <em>Unit Test Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.UnitTestScope
	 * @generated
	 */
	public Adapter createUnitTestScopeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.E2ETestScope <em>E2E Test Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.E2ETestScope
	 * @generated
	 */
	public Adapter createE2ETestScopeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.InputFile <em>Input File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.InputFile
	 * @generated
	 */
	public Adapter createInputFileAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.WorkflowModule <em>Workflow Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.WorkflowModule
	 * @generated
	 */
	public Adapter createWorkflowModuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XAttribute <em>XAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XAttribute
	 * @generated
	 */
	public Adapter createXAttributeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XClass <em>XClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XClass
	 * @generated
	 */
	public Adapter createXClassAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XClassifier <em>XClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XClassifier
	 * @generated
	 */
	public Adapter createXClassifierAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XDataType <em>XData Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XDataType
	 * @generated
	 */
	public Adapter createXDataTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XEnum <em>XEnum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XEnum
	 * @generated
	 */
	public Adapter createXEnumAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XEnumLiteral <em>XEnum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XEnumLiteral
	 * @generated
	 */
	public Adapter createXEnumLiteralAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XMember <em>XMember</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XMember
	 * @generated
	 */
	public Adapter createXMemberAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XModelElement <em>XModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XModelElement
	 * @generated
	 */
	public Adapter createXModelElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XNamedElement <em>XNamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XNamedElement
	 * @generated
	 */
	public Adapter createXNamedElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XOperation <em>XOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XOperation
	 * @generated
	 */
	public Adapter createXOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XPackage <em>XPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XPackage
	 * @generated
	 */
	public Adapter createXPackageAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XReference <em>XReference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XReference
	 * @generated
	 */
	public Adapter createXReferenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XStructuralFeature <em>XStructural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XStructuralFeature
	 * @generated
	 */
	public Adapter createXStructuralFeatureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XTypedElement <em>XTyped Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XTypedElement
	 * @generated
	 */
	public Adapter createXTypedElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLEnrichedCube <em>VTL Enriched Cube</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLEnrichedCube
	 * @generated
	 */
	public Adapter createVTLEnrichedCubeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLGeneratedOutputlayer <em>VTL Generated Outputlayer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLGeneratedOutputlayer
	 * @generated
	 */
	public Adapter createVTLGeneratedOutputlayerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForOutputLayerAndIntermediateLayerCombination <em>VTL For Output Layer And Intermediate Layer Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForOutputLayerAndIntermediateLayerCombination
	 * @generated
	 */
	public Adapter createVTLForOutputLayerAndIntermediateLayerCombinationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLGeneratedIntermediateLayer <em>VTL Generated Intermediate Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLGeneratedIntermediateLayer
	 * @generated
	 */
	public Adapter createVTLGeneratedIntermediateLayerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLTransformation <em>VTL Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLTransformation
	 * @generated
	 */
	public Adapter createVTLTransformationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLScheme <em>VTL Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLScheme
	 * @generated
	 */
	public Adapter createVTLSchemeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForSelectionLayer <em>VTL For Selection Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForSelectionLayer
	 * @generated
	 */
	public Adapter createVTLForSelectionLayerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLModule <em>VTL Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLModule
	 * @generated
	 */
	public Adapter createVTLModuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.EntityToVTLIntermediateLayerLink <em>Entity To VTL Intermediate Layer Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.EntityToVTLIntermediateLayerLink
	 * @generated
	 */
	public Adapter createEntityToVTLIntermediateLayerLinkAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForView <em>VTL For View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLForView
	 * @generated
	 */
	public Adapter createVTLForViewAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //Open_reg_specsAdapterFactory
