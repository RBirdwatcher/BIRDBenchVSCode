/**
 */
package org.eclipse.efbt.ecore4reg.dsl.ecore4reg.util;

import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Activity;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ActivityTag;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.AllowedTypes;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.BaseElement;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.DataConstraint;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.E2ETestScope;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELAnnotation;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELAttribute;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELClass;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELClassifier;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELDataType;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELEnum;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELEnumLiteral;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELModelElement;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELNamedElement;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELOperation;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELPackage;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELReference;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELStructuralFeature;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELTypedElement;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Ecore4regPackage;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.EntityToVTLIntermediateLayerLink;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.EntityToVTLIntermediateLayerLinkModule;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ExclusiveGateway;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.FlowElement;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.FlowElementsContainer;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.FlowNode;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Gateway;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Import;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.InclusiveGateway;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.InputFile;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.LayerSQL;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ModuleList;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ParallelGateway;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.RequirementType;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.RequirementsModule;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.RequirementsSection;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.RequirementsSectionImage;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.RequirementsSectionLinkWithText;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.RequirementsSectionText;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Scenario;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ScenarioTag;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ScriptTask;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.SelectClause;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.SelectColumn;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.SelectColumnAttributeAs;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.SelectColumnMemberAs;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.SelectValueAs;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.SelectionLayer;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.SequenceFlow;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ServiceTask;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.SubProcess;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Tag;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.TagGroup;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Task;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Test;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.TestModule;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.TestScope;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.TitledRequirementsSection;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.UnitTestScope;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.UserTask;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLEnrichedCube;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLForOutputLayerAndIntermediateLayerCombination;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLForOutputLayerAndIntermediateLayerCombinationModule;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLForSelectionLayer;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLForSelectionLayerModule;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLForView;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLForViewModule;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLGeneratedIntermediateLayer;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLGeneratedIntermediateLayerModule;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLGeneratedOutputlayer;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLGeneratedOutputlayerModule;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLModule;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLScheme;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLSchemesModule;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLTransformation;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.View;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ViewModule;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.WhereClause;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.WorkflowModule;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Ecore4regPackage
 * @generated
 */
public class Ecore4regAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Ecore4regPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ecore4regAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = Ecore4regPackage.eINSTANCE;
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
	protected Ecore4regSwitch<Adapter> modelSwitch =
		new Ecore4regSwitch<Adapter>()
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
			public Adapter caseModule(org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Module object)
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
			public Adapter caseELAttribute(ELAttribute object)
			{
				return createELAttributeAdapter();
			}
			@Override
			public Adapter caseELClass(ELClass object)
			{
				return createELClassAdapter();
			}
			@Override
			public Adapter caseELClassifier(ELClassifier object)
			{
				return createELClassifierAdapter();
			}
			@Override
			public Adapter caseELDataType(ELDataType object)
			{
				return createELDataTypeAdapter();
			}
			@Override
			public Adapter caseELEnum(ELEnum object)
			{
				return createELEnumAdapter();
			}
			@Override
			public Adapter caseELEnumLiteral(ELEnumLiteral object)
			{
				return createELEnumLiteralAdapter();
			}
			@Override
			public Adapter caseELModelElement(ELModelElement object)
			{
				return createELModelElementAdapter();
			}
			@Override
			public Adapter caseELNamedElement(ELNamedElement object)
			{
				return createELNamedElementAdapter();
			}
			@Override
			public Adapter caseELOperation(ELOperation object)
			{
				return createELOperationAdapter();
			}
			@Override
			public Adapter caseELPackage(ELPackage object)
			{
				return createELPackageAdapter();
			}
			@Override
			public Adapter caseELReference(ELReference object)
			{
				return createELReferenceAdapter();
			}
			@Override
			public Adapter caseELStructuralFeature(ELStructuralFeature object)
			{
				return createELStructuralFeatureAdapter();
			}
			@Override
			public Adapter caseELTypedElement(ELTypedElement object)
			{
				return createELTypedElementAdapter();
			}
			@Override
			public Adapter caseELAnnotation(ELAnnotation object)
			{
				return createELAnnotationAdapter();
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
			public Adapter caseVTLGeneratedOutputlayerModule(VTLGeneratedOutputlayerModule object)
			{
				return createVTLGeneratedOutputlayerModuleAdapter();
			}
			@Override
			public Adapter caseVTLForOutputLayerAndIntermediateLayerCombinationModule(VTLForOutputLayerAndIntermediateLayerCombinationModule object)
			{
				return createVTLForOutputLayerAndIntermediateLayerCombinationModuleAdapter();
			}
			@Override
			public Adapter caseVTLGeneratedIntermediateLayerModule(VTLGeneratedIntermediateLayerModule object)
			{
				return createVTLGeneratedIntermediateLayerModuleAdapter();
			}
			@Override
			public Adapter caseVTLSchemesModule(VTLSchemesModule object)
			{
				return createVTLSchemesModuleAdapter();
			}
			@Override
			public Adapter caseVTLForSelectionLayerModule(VTLForSelectionLayerModule object)
			{
				return createVTLForSelectionLayerModuleAdapter();
			}
			@Override
			public Adapter caseEntityToVTLIntermediateLayerLinkModule(EntityToVTLIntermediateLayerLinkModule object)
			{
				return createEntityToVTLIntermediateLayerLinkModuleAdapter();
			}
			@Override
			public Adapter caseVTLForViewModule(VTLForViewModule object)
			{
				return createVTLForViewModuleAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.BaseElement <em>Base Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.BaseElement
	 * @generated
	 */
	public Adapter createBaseElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.FlowElementsContainer <em>Flow Elements Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.FlowElementsContainer
	 * @generated
	 */
	public Adapter createFlowElementsContainerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.FlowElement <em>Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.FlowElement
	 * @generated
	 */
	public Adapter createFlowElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.FlowNode <em>Flow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.FlowNode
	 * @generated
	 */
	public Adapter createFlowNodeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.SequenceFlow <em>Sequence Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.SequenceFlow
	 * @generated
	 */
	public Adapter createSequenceFlowAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Task
	 * @generated
	 */
	public Adapter createTaskAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Gateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Gateway
	 * @generated
	 */
	public Adapter createGatewayAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ExclusiveGateway <em>Exclusive Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ExclusiveGateway
	 * @generated
	 */
	public Adapter createExclusiveGatewayAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.InclusiveGateway <em>Inclusive Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.InclusiveGateway
	 * @generated
	 */
	public Adapter createInclusiveGatewayAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ParallelGateway <em>Parallel Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ParallelGateway
	 * @generated
	 */
	public Adapter createParallelGatewayAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ServiceTask <em>Service Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ServiceTask
	 * @generated
	 */
	public Adapter createServiceTaskAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.SubProcess <em>Sub Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.SubProcess
	 * @generated
	 */
	public Adapter createSubProcessAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ScriptTask <em>Script Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ScriptTask
	 * @generated
	 */
	public Adapter createScriptTaskAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.UserTask <em>User Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.UserTask
	 * @generated
	 */
	public Adapter createUserTaskAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Import
	 * @generated
	 */
	public Adapter createImportAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Module
	 * @generated
	 */
	public Adapter createModuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ModuleList <em>Module List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ModuleList
	 * @generated
	 */
	public Adapter createModuleListAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.AllowedTypes <em>Allowed Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.AllowedTypes
	 * @generated
	 */
	public Adapter createAllowedTypesAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.RequirementsModule <em>Requirements Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.RequirementsModule
	 * @generated
	 */
	public Adapter createRequirementsModuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.RequirementsSection <em>Requirements Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.RequirementsSection
	 * @generated
	 */
	public Adapter createRequirementsSectionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.RequirementsSectionImage <em>Requirements Section Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.RequirementsSectionImage
	 * @generated
	 */
	public Adapter createRequirementsSectionImageAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.RequirementsSectionLinkWithText <em>Requirements Section Link With Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.RequirementsSectionLinkWithText
	 * @generated
	 */
	public Adapter createRequirementsSectionLinkWithTextAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.RequirementsSectionText <em>Requirements Section Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.RequirementsSectionText
	 * @generated
	 */
	public Adapter createRequirementsSectionTextAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.RequirementType <em>Requirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.RequirementType
	 * @generated
	 */
	public Adapter createRequirementTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.TitledRequirementsSection <em>Titled Requirements Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.TitledRequirementsSection
	 * @generated
	 */
	public Adapter createTitledRequirementsSectionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Tag
	 * @generated
	 */
	public Adapter createTagAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.TagGroup <em>Tag Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.TagGroup
	 * @generated
	 */
	public Adapter createTagGroupAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.View
	 * @generated
	 */
	public Adapter createViewAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.LayerSQL <em>Layer SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.LayerSQL
	 * @generated
	 */
	public Adapter createLayerSQLAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.SelectClause <em>Select Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.SelectClause
	 * @generated
	 */
	public Adapter createSelectClauseAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.SelectColumn <em>Select Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.SelectColumn
	 * @generated
	 */
	public Adapter createSelectColumnAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.SelectColumnMemberAs <em>Select Column Member As</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.SelectColumnMemberAs
	 * @generated
	 */
	public Adapter createSelectColumnMemberAsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.SelectValueAs <em>Select Value As</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.SelectValueAs
	 * @generated
	 */
	public Adapter createSelectValueAsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.SelectColumnAttributeAs <em>Select Column Attribute As</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.SelectColumnAttributeAs
	 * @generated
	 */
	public Adapter createSelectColumnAttributeAsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.WhereClause <em>Where Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.WhereClause
	 * @generated
	 */
	public Adapter createWhereClauseAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ViewModule <em>View Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ViewModule
	 * @generated
	 */
	public Adapter createViewModuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ActivityTag <em>Activity Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ActivityTag
	 * @generated
	 */
	public Adapter createActivityTagAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Scenario
	 * @generated
	 */
	public Adapter createScenarioAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ScenarioTag <em>Scenario Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ScenarioTag
	 * @generated
	 */
	public Adapter createScenarioTagAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Test
	 * @generated
	 */
	public Adapter createTestAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.TestModule <em>Test Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.TestModule
	 * @generated
	 */
	public Adapter createTestModuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.DataConstraint <em>Data Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.DataConstraint
	 * @generated
	 */
	public Adapter createDataConstraintAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.SelectionLayer <em>Selection Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.SelectionLayer
	 * @generated
	 */
	public Adapter createSelectionLayerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.TestScope <em>Test Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.TestScope
	 * @generated
	 */
	public Adapter createTestScopeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.UnitTestScope <em>Unit Test Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.UnitTestScope
	 * @generated
	 */
	public Adapter createUnitTestScopeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.E2ETestScope <em>E2E Test Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.E2ETestScope
	 * @generated
	 */
	public Adapter createE2ETestScopeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.InputFile <em>Input File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.InputFile
	 * @generated
	 */
	public Adapter createInputFileAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.WorkflowModule <em>Workflow Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.WorkflowModule
	 * @generated
	 */
	public Adapter createWorkflowModuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELAttribute <em>EL Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELAttribute
	 * @generated
	 */
	public Adapter createELAttributeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELClass <em>EL Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELClass
	 * @generated
	 */
	public Adapter createELClassAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELClassifier <em>EL Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELClassifier
	 * @generated
	 */
	public Adapter createELClassifierAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELDataType <em>EL Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELDataType
	 * @generated
	 */
	public Adapter createELDataTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELEnum <em>EL Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELEnum
	 * @generated
	 */
	public Adapter createELEnumAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELEnumLiteral <em>EL Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELEnumLiteral
	 * @generated
	 */
	public Adapter createELEnumLiteralAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELModelElement <em>EL Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELModelElement
	 * @generated
	 */
	public Adapter createELModelElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELNamedElement <em>EL Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELNamedElement
	 * @generated
	 */
	public Adapter createELNamedElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELOperation <em>EL Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELOperation
	 * @generated
	 */
	public Adapter createELOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELPackage <em>EL Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELPackage
	 * @generated
	 */
	public Adapter createELPackageAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELReference <em>EL Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELReference
	 * @generated
	 */
	public Adapter createELReferenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELStructuralFeature <em>EL Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELStructuralFeature
	 * @generated
	 */
	public Adapter createELStructuralFeatureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELTypedElement <em>EL Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELTypedElement
	 * @generated
	 */
	public Adapter createELTypedElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELAnnotation <em>EL Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELAnnotation
	 * @generated
	 */
	public Adapter createELAnnotationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLEnrichedCube <em>VTL Enriched Cube</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLEnrichedCube
	 * @generated
	 */
	public Adapter createVTLEnrichedCubeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLGeneratedOutputlayer <em>VTL Generated Outputlayer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLGeneratedOutputlayer
	 * @generated
	 */
	public Adapter createVTLGeneratedOutputlayerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLForOutputLayerAndIntermediateLayerCombination <em>VTL For Output Layer And Intermediate Layer Combination</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLForOutputLayerAndIntermediateLayerCombination
	 * @generated
	 */
	public Adapter createVTLForOutputLayerAndIntermediateLayerCombinationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLGeneratedIntermediateLayer <em>VTL Generated Intermediate Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLGeneratedIntermediateLayer
	 * @generated
	 */
	public Adapter createVTLGeneratedIntermediateLayerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLTransformation <em>VTL Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLTransformation
	 * @generated
	 */
	public Adapter createVTLTransformationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLScheme <em>VTL Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLScheme
	 * @generated
	 */
	public Adapter createVTLSchemeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLForSelectionLayer <em>VTL For Selection Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLForSelectionLayer
	 * @generated
	 */
	public Adapter createVTLForSelectionLayerAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLModule <em>VTL Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLModule
	 * @generated
	 */
	public Adapter createVTLModuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.EntityToVTLIntermediateLayerLink <em>Entity To VTL Intermediate Layer Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.EntityToVTLIntermediateLayerLink
	 * @generated
	 */
	public Adapter createEntityToVTLIntermediateLayerLinkAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLForView <em>VTL For View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLForView
	 * @generated
	 */
	public Adapter createVTLForViewAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLGeneratedOutputlayerModule <em>VTL Generated Outputlayer Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLGeneratedOutputlayerModule
	 * @generated
	 */
	public Adapter createVTLGeneratedOutputlayerModuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLForOutputLayerAndIntermediateLayerCombinationModule <em>VTL For Output Layer And Intermediate Layer Combination Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLForOutputLayerAndIntermediateLayerCombinationModule
	 * @generated
	 */
	public Adapter createVTLForOutputLayerAndIntermediateLayerCombinationModuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLGeneratedIntermediateLayerModule <em>VTL Generated Intermediate Layer Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLGeneratedIntermediateLayerModule
	 * @generated
	 */
	public Adapter createVTLGeneratedIntermediateLayerModuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLSchemesModule <em>VTL Schemes Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLSchemesModule
	 * @generated
	 */
	public Adapter createVTLSchemesModuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLForSelectionLayerModule <em>VTL For Selection Layer Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLForSelectionLayerModule
	 * @generated
	 */
	public Adapter createVTLForSelectionLayerModuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.EntityToVTLIntermediateLayerLinkModule <em>Entity To VTL Intermediate Layer Link Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.EntityToVTLIntermediateLayerLinkModule
	 * @generated
	 */
	public Adapter createEntityToVTLIntermediateLayerLinkModuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLForViewModule <em>VTL For View Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.VTLForViewModule
	 * @generated
	 */
	public Adapter createVTLForViewModuleAdapter()
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

} //Ecore4regAdapterFactory
