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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage
 * @generated
 */
public class Open_reg_specsSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Open_reg_specsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Open_reg_specsSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = Open_reg_specsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case Open_reg_specsPackage.BASE_ELEMENT:
			{
				BaseElement baseElement = (BaseElement)theEObject;
				T result = caseBaseElement(baseElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.FLOW_ELEMENTS_CONTAINER:
			{
				FlowElementsContainer flowElementsContainer = (FlowElementsContainer)theEObject;
				T result = caseFlowElementsContainer(flowElementsContainer);
				if (result == null) result = caseBaseElement(flowElementsContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.FLOW_ELEMENT:
			{
				FlowElement flowElement = (FlowElement)theEObject;
				T result = caseFlowElement(flowElement);
				if (result == null) result = caseBaseElement(flowElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.FLOW_NODE:
			{
				FlowNode flowNode = (FlowNode)theEObject;
				T result = caseFlowNode(flowNode);
				if (result == null) result = caseFlowElement(flowNode);
				if (result == null) result = caseBaseElement(flowNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.SEQUENCE_FLOW:
			{
				SequenceFlow sequenceFlow = (SequenceFlow)theEObject;
				T result = caseSequenceFlow(sequenceFlow);
				if (result == null) result = caseFlowElement(sequenceFlow);
				if (result == null) result = caseBaseElement(sequenceFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.TASK:
			{
				Task task = (Task)theEObject;
				T result = caseTask(task);
				if (result == null) result = caseActivity(task);
				if (result == null) result = caseFlowNode(task);
				if (result == null) result = caseFlowElement(task);
				if (result == null) result = caseBaseElement(task);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.ACTIVITY:
			{
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = caseFlowNode(activity);
				if (result == null) result = caseFlowElement(activity);
				if (result == null) result = caseBaseElement(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.GATEWAY:
			{
				Gateway gateway = (Gateway)theEObject;
				T result = caseGateway(gateway);
				if (result == null) result = caseFlowNode(gateway);
				if (result == null) result = caseFlowElement(gateway);
				if (result == null) result = caseBaseElement(gateway);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.EXCLUSIVE_GATEWAY:
			{
				ExclusiveGateway exclusiveGateway = (ExclusiveGateway)theEObject;
				T result = caseExclusiveGateway(exclusiveGateway);
				if (result == null) result = caseGateway(exclusiveGateway);
				if (result == null) result = caseFlowNode(exclusiveGateway);
				if (result == null) result = caseFlowElement(exclusiveGateway);
				if (result == null) result = caseBaseElement(exclusiveGateway);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.INCLUSIVE_GATEWAY:
			{
				InclusiveGateway inclusiveGateway = (InclusiveGateway)theEObject;
				T result = caseInclusiveGateway(inclusiveGateway);
				if (result == null) result = caseGateway(inclusiveGateway);
				if (result == null) result = caseFlowNode(inclusiveGateway);
				if (result == null) result = caseFlowElement(inclusiveGateway);
				if (result == null) result = caseBaseElement(inclusiveGateway);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.PARALLEL_GATEWAY:
			{
				ParallelGateway parallelGateway = (ParallelGateway)theEObject;
				T result = caseParallelGateway(parallelGateway);
				if (result == null) result = caseGateway(parallelGateway);
				if (result == null) result = caseFlowNode(parallelGateway);
				if (result == null) result = caseFlowElement(parallelGateway);
				if (result == null) result = caseBaseElement(parallelGateway);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.SERVICE_TASK:
			{
				ServiceTask serviceTask = (ServiceTask)theEObject;
				T result = caseServiceTask(serviceTask);
				if (result == null) result = caseTask(serviceTask);
				if (result == null) result = caseActivity(serviceTask);
				if (result == null) result = caseFlowNode(serviceTask);
				if (result == null) result = caseFlowElement(serviceTask);
				if (result == null) result = caseBaseElement(serviceTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.SUB_PROCESS:
			{
				SubProcess subProcess = (SubProcess)theEObject;
				T result = caseSubProcess(subProcess);
				if (result == null) result = caseActivity(subProcess);
				if (result == null) result = caseFlowElementsContainer(subProcess);
				if (result == null) result = caseFlowNode(subProcess);
				if (result == null) result = caseFlowElement(subProcess);
				if (result == null) result = caseBaseElement(subProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.SCRIPT_TASK:
			{
				ScriptTask scriptTask = (ScriptTask)theEObject;
				T result = caseScriptTask(scriptTask);
				if (result == null) result = caseTask(scriptTask);
				if (result == null) result = caseActivity(scriptTask);
				if (result == null) result = caseFlowNode(scriptTask);
				if (result == null) result = caseFlowElement(scriptTask);
				if (result == null) result = caseBaseElement(scriptTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.USER_TASK:
			{
				UserTask userTask = (UserTask)theEObject;
				T result = caseUserTask(userTask);
				if (result == null) result = caseTask(userTask);
				if (result == null) result = caseActivity(userTask);
				if (result == null) result = caseFlowNode(userTask);
				if (result == null) result = caseFlowElement(userTask);
				if (result == null) result = caseBaseElement(userTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.MODULE:
			{
				org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Module module = (org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Module)theEObject;
				T result = caseModule(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.MODULE_LIST:
			{
				ModuleList moduleList = (ModuleList)theEObject;
				T result = caseModuleList(moduleList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.ALLOWED_TYPES:
			{
				AllowedTypes allowedTypes = (AllowedTypes)theEObject;
				T result = caseAllowedTypes(allowedTypes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.REQUIREMENTS_MODULE:
			{
				RequirementsModule requirementsModule = (RequirementsModule)theEObject;
				T result = caseRequirementsModule(requirementsModule);
				if (result == null) result = caseModule(requirementsModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.REQUIREMENTS_SECTION:
			{
				RequirementsSection requirementsSection = (RequirementsSection)theEObject;
				T result = caseRequirementsSection(requirementsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.REQUIREMENTS_SECTION_IMAGE:
			{
				RequirementsSectionImage requirementsSectionImage = (RequirementsSectionImage)theEObject;
				T result = caseRequirementsSectionImage(requirementsSectionImage);
				if (result == null) result = caseRequirementsSection(requirementsSectionImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.REQUIREMENTS_SECTION_LINK_WITH_TEXT:
			{
				RequirementsSectionLinkWithText requirementsSectionLinkWithText = (RequirementsSectionLinkWithText)theEObject;
				T result = caseRequirementsSectionLinkWithText(requirementsSectionLinkWithText);
				if (result == null) result = caseRequirementsSection(requirementsSectionLinkWithText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.REQUIREMENTS_SECTION_TEXT:
			{
				RequirementsSectionText requirementsSectionText = (RequirementsSectionText)theEObject;
				T result = caseRequirementsSectionText(requirementsSectionText);
				if (result == null) result = caseRequirementsSection(requirementsSectionText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.REQUIREMENT_TYPE:
			{
				RequirementType requirementType = (RequirementType)theEObject;
				T result = caseRequirementType(requirementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.TITLED_REQUIREMENTS_SECTION:
			{
				TitledRequirementsSection titledRequirementsSection = (TitledRequirementsSection)theEObject;
				T result = caseTitledRequirementsSection(titledRequirementsSection);
				if (result == null) result = caseRequirementsSection(titledRequirementsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.TAG:
			{
				Tag tag = (Tag)theEObject;
				T result = caseTag(tag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.TAG_GROUP:
			{
				TagGroup tagGroup = (TagGroup)theEObject;
				T result = caseTagGroup(tagGroup);
				if (result == null) result = caseModule(tagGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.VIEW:
			{
				View view = (View)theEObject;
				T result = caseView(view);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.LAYER_SQL:
			{
				LayerSQL layerSQL = (LayerSQL)theEObject;
				T result = caseLayerSQL(layerSQL);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.SELECT_CLAUSE:
			{
				SelectClause selectClause = (SelectClause)theEObject;
				T result = caseSelectClause(selectClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.SELECT_COLUMN:
			{
				SelectColumn selectColumn = (SelectColumn)theEObject;
				T result = caseSelectColumn(selectColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.SELECT_COLUMN_MEMBER_AS:
			{
				SelectColumnMemberAs selectColumnMemberAs = (SelectColumnMemberAs)theEObject;
				T result = caseSelectColumnMemberAs(selectColumnMemberAs);
				if (result == null) result = caseSelectColumn(selectColumnMemberAs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.SELECT_COLUMN_ATTRIBUTE_AS:
			{
				SelectColumnAttributeAs selectColumnAttributeAs = (SelectColumnAttributeAs)theEObject;
				T result = caseSelectColumnAttributeAs(selectColumnAttributeAs);
				if (result == null) result = caseSelectColumn(selectColumnAttributeAs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.WHERE_CLAUSE:
			{
				WhereClause whereClause = (WhereClause)theEObject;
				T result = caseWhereClause(whereClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.VIEW_MODULE:
			{
				ViewModule viewModule = (ViewModule)theEObject;
				T result = caseViewModule(viewModule);
				if (result == null) result = caseModule(viewModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.ACTIVITY_TAG:
			{
				ActivityTag activityTag = (ActivityTag)theEObject;
				T result = caseActivityTag(activityTag);
				if (result == null) result = caseTag(activityTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.SCENARIO:
			{
				Scenario scenario = (Scenario)theEObject;
				T result = caseScenario(scenario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.SCENARIO_TAG:
			{
				ScenarioTag scenarioTag = (ScenarioTag)theEObject;
				T result = caseScenarioTag(scenarioTag);
				if (result == null) result = caseTag(scenarioTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.TEST:
			{
				Test test = (Test)theEObject;
				T result = caseTest(test);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.TEST_MODULE:
			{
				TestModule testModule = (TestModule)theEObject;
				T result = caseTestModule(testModule);
				if (result == null) result = caseModule(testModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.DATA_CONSTRAINT:
			{
				DataConstraint dataConstraint = (DataConstraint)theEObject;
				T result = caseDataConstraint(dataConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.SELECTION_LAYER:
			{
				SelectionLayer selectionLayer = (SelectionLayer)theEObject;
				T result = caseSelectionLayer(selectionLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.TEST_SCOPE:
			{
				TestScope testScope = (TestScope)theEObject;
				T result = caseTestScope(testScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.UNIT_TEST_SCOPE:
			{
				UnitTestScope unitTestScope = (UnitTestScope)theEObject;
				T result = caseUnitTestScope(unitTestScope);
				if (result == null) result = caseTestScope(unitTestScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.E2E_TEST_SCOPE:
			{
				E2ETestScope e2ETestScope = (E2ETestScope)theEObject;
				T result = caseE2ETestScope(e2ETestScope);
				if (result == null) result = caseTestScope(e2ETestScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.INPUT_FILE:
			{
				InputFile inputFile = (InputFile)theEObject;
				T result = caseInputFile(inputFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.WORKFLOW_MODULE:
			{
				WorkflowModule workflowModule = (WorkflowModule)theEObject;
				T result = caseWorkflowModule(workflowModule);
				if (result == null) result = caseModule(workflowModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.XATTRIBUTE:
			{
				XAttribute xAttribute = (XAttribute)theEObject;
				T result = caseXAttribute(xAttribute);
				if (result == null) result = caseXStructuralFeature(xAttribute);
				if (result == null) result = caseXMember(xAttribute);
				if (result == null) result = caseXTypedElement(xAttribute);
				if (result == null) result = caseXNamedElement(xAttribute);
				if (result == null) result = caseXModelElement(xAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.XCLASS:
			{
				XClass xClass = (XClass)theEObject;
				T result = caseXClass(xClass);
				if (result == null) result = caseXClassifier(xClass);
				if (result == null) result = caseXNamedElement(xClass);
				if (result == null) result = caseXModelElement(xClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.XCLASSIFIER:
			{
				XClassifier xClassifier = (XClassifier)theEObject;
				T result = caseXClassifier(xClassifier);
				if (result == null) result = caseXNamedElement(xClassifier);
				if (result == null) result = caseXModelElement(xClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.XDATA_TYPE:
			{
				XDataType xDataType = (XDataType)theEObject;
				T result = caseXDataType(xDataType);
				if (result == null) result = caseXClassifier(xDataType);
				if (result == null) result = caseXNamedElement(xDataType);
				if (result == null) result = caseXModelElement(xDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.XENUM:
			{
				XEnum xEnum = (XEnum)theEObject;
				T result = caseXEnum(xEnum);
				if (result == null) result = caseXDataType(xEnum);
				if (result == null) result = caseXClassifier(xEnum);
				if (result == null) result = caseXNamedElement(xEnum);
				if (result == null) result = caseXModelElement(xEnum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.XENUM_LITERAL:
			{
				XEnumLiteral xEnumLiteral = (XEnumLiteral)theEObject;
				T result = caseXEnumLiteral(xEnumLiteral);
				if (result == null) result = caseXNamedElement(xEnumLiteral);
				if (result == null) result = caseXModelElement(xEnumLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.XMEMBER:
			{
				XMember xMember = (XMember)theEObject;
				T result = caseXMember(xMember);
				if (result == null) result = caseXTypedElement(xMember);
				if (result == null) result = caseXNamedElement(xMember);
				if (result == null) result = caseXModelElement(xMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.XMODEL_ELEMENT:
			{
				XModelElement xModelElement = (XModelElement)theEObject;
				T result = caseXModelElement(xModelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.XNAMED_ELEMENT:
			{
				XNamedElement xNamedElement = (XNamedElement)theEObject;
				T result = caseXNamedElement(xNamedElement);
				if (result == null) result = caseXModelElement(xNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.XOPERATION:
			{
				XOperation xOperation = (XOperation)theEObject;
				T result = caseXOperation(xOperation);
				if (result == null) result = caseXMember(xOperation);
				if (result == null) result = caseXTypedElement(xOperation);
				if (result == null) result = caseXNamedElement(xOperation);
				if (result == null) result = caseXModelElement(xOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.XPACKAGE:
			{
				XPackage xPackage = (XPackage)theEObject;
				T result = caseXPackage(xPackage);
				if (result == null) result = caseModule(xPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.XREFERENCE:
			{
				XReference xReference = (XReference)theEObject;
				T result = caseXReference(xReference);
				if (result == null) result = caseXStructuralFeature(xReference);
				if (result == null) result = caseXMember(xReference);
				if (result == null) result = caseXTypedElement(xReference);
				if (result == null) result = caseXNamedElement(xReference);
				if (result == null) result = caseXModelElement(xReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.XSTRUCTURAL_FEATURE:
			{
				XStructuralFeature xStructuralFeature = (XStructuralFeature)theEObject;
				T result = caseXStructuralFeature(xStructuralFeature);
				if (result == null) result = caseXMember(xStructuralFeature);
				if (result == null) result = caseXTypedElement(xStructuralFeature);
				if (result == null) result = caseXNamedElement(xStructuralFeature);
				if (result == null) result = caseXModelElement(xStructuralFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.XTYPED_ELEMENT:
			{
				XTypedElement xTypedElement = (XTypedElement)theEObject;
				T result = caseXTypedElement(xTypedElement);
				if (result == null) result = caseXNamedElement(xTypedElement);
				if (result == null) result = caseXModelElement(xTypedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.VTL_ENRICHED_CUBE:
			{
				VTLEnrichedCube vtlEnrichedCube = (VTLEnrichedCube)theEObject;
				T result = caseVTLEnrichedCube(vtlEnrichedCube);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.VTL_GENERATED_OUTPUTLAYER:
			{
				VTLGeneratedOutputlayer vtlGeneratedOutputlayer = (VTLGeneratedOutputlayer)theEObject;
				T result = caseVTLGeneratedOutputlayer(vtlGeneratedOutputlayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.VTL_FOR_OUTPUT_LAYER_AND_INTERMEDIATE_LAYER_COMBINATION:
			{
				VTLForOutputLayerAndIntermediateLayerCombination vtlForOutputLayerAndIntermediateLayerCombination = (VTLForOutputLayerAndIntermediateLayerCombination)theEObject;
				T result = caseVTLForOutputLayerAndIntermediateLayerCombination(vtlForOutputLayerAndIntermediateLayerCombination);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.VTL_GENERATED_INTERMEDIATE_LAYER:
			{
				VTLGeneratedIntermediateLayer vtlGeneratedIntermediateLayer = (VTLGeneratedIntermediateLayer)theEObject;
				T result = caseVTLGeneratedIntermediateLayer(vtlGeneratedIntermediateLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.VTL_TRANSFORMATION:
			{
				VTLTransformation vtlTransformation = (VTLTransformation)theEObject;
				T result = caseVTLTransformation(vtlTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.VTL_SCHEME:
			{
				VTLScheme vtlScheme = (VTLScheme)theEObject;
				T result = caseVTLScheme(vtlScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.VTL_FOR_SELECTION_LAYER:
			{
				VTLForSelectionLayer vtlForSelectionLayer = (VTLForSelectionLayer)theEObject;
				T result = caseVTLForSelectionLayer(vtlForSelectionLayer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.VTL_MODULE:
			{
				VTLModule vtlModule = (VTLModule)theEObject;
				T result = caseVTLModule(vtlModule);
				if (result == null) result = caseModule(vtlModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.ENTITY_TO_VTL_INTERMEDIATE_LAYER_LINK:
			{
				EntityToVTLIntermediateLayerLink entityToVTLIntermediateLayerLink = (EntityToVTLIntermediateLayerLink)theEObject;
				T result = caseEntityToVTLIntermediateLayerLink(entityToVTLIntermediateLayerLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Open_reg_specsPackage.VTL_FOR_VIEW:
			{
				VTLForView vtlForView = (VTLForView)theEObject;
				T result = caseVTLForView(vtlForView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseElement(BaseElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Elements Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Elements Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowElementsContainer(FlowElementsContainer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowElement(FlowElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowNode(FlowNode object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceFlow(SequenceFlow object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGateway(Gateway object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusive Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusive Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusiveGateway(ExclusiveGateway object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inclusive Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inclusive Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInclusiveGateway(InclusiveGateway object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel Gateway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallelGateway(ParallelGateway object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceTask(ServiceTask object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubProcess(SubProcess object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScriptTask(ScriptTask object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserTask(UserTask object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Module object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleList(ModuleList object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allowed Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allowed Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllowedTypes(AllowedTypes object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirements Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirements Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementsModule(RequirementsModule object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirements Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirements Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementsSection(RequirementsSection object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirements Section Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirements Section Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementsSectionImage(RequirementsSectionImage object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirements Section Link With Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirements Section Link With Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementsSectionLinkWithText(RequirementsSectionLinkWithText object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirements Section Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirements Section Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementsSectionText(RequirementsSectionText object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementType(RequirementType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Titled Requirements Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Titled Requirements Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTitledRequirementsSection(TitledRequirementsSection object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTag(Tag object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagGroup(TagGroup object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseView(View object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer SQL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer SQL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayerSQL(LayerSQL object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectClause(SelectClause object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectColumn(SelectColumn object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select Column Member As</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select Column Member As</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectColumnMemberAs(SelectColumnMemberAs object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select Column Attribute As</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select Column Attribute As</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectColumnAttributeAs(SelectColumnAttributeAs object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Where Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Where Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhereClause(WhereClause object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewModule(ViewModule object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityTag(ActivityTag object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenario(Scenario object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenarioTag(ScenarioTag object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTest(Test object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestModule(TestModule object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataConstraint(DataConstraint object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectionLayer(SelectionLayer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestScope(TestScope object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Test Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Test Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitTestScope(UnitTestScope object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>E2E Test Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>E2E Test Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseE2ETestScope(E2ETestScope object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputFile(InputFile object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowModule(WorkflowModule object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XAttribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXAttribute(XAttribute object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXClass(XClass object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XClassifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XClassifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXClassifier(XClassifier object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XData Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XData Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXDataType(XDataType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XEnum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XEnum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXEnum(XEnum object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XEnum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XEnum Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXEnumLiteral(XEnumLiteral object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XMember</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XMember</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMember(XMember object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XModel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XModel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXModelElement(XModelElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XNamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XNamed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXNamedElement(XNamedElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XOperation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XOperation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXOperation(XOperation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XPackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XPackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXPackage(XPackage object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XReference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XReference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXReference(XReference object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XStructural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XStructural Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXStructuralFeature(XStructuralFeature object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XTyped Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XTyped Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXTypedElement(XTypedElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VTL Enriched Cube</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VTL Enriched Cube</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVTLEnrichedCube(VTLEnrichedCube object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VTL Generated Outputlayer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VTL Generated Outputlayer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVTLGeneratedOutputlayer(VTLGeneratedOutputlayer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VTL For Output Layer And Intermediate Layer Combination</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VTL For Output Layer And Intermediate Layer Combination</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVTLForOutputLayerAndIntermediateLayerCombination(VTLForOutputLayerAndIntermediateLayerCombination object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VTL Generated Intermediate Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VTL Generated Intermediate Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVTLGeneratedIntermediateLayer(VTLGeneratedIntermediateLayer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VTL Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VTL Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVTLTransformation(VTLTransformation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VTL Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VTL Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVTLScheme(VTLScheme object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VTL For Selection Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VTL For Selection Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVTLForSelectionLayer(VTLForSelectionLayer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VTL Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VTL Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVTLModule(VTLModule object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity To VTL Intermediate Layer Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity To VTL Intermediate Layer Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityToVTLIntermediateLayerLink(EntityToVTLIntermediateLayerLink object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VTL For View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VTL For View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVTLForView(VTLForView object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //Open_reg_specsSwitch
