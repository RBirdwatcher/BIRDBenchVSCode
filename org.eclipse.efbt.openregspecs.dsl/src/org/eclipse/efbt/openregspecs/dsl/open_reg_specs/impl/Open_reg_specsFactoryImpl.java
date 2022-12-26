/**
 */
package org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl;

import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ActivityTag;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.AllowedTypes;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.AttrComparison;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Comparitor;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.DataConstraint;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.E2ETestScope;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.EntityToVTLIntermediateLayerLink;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ExclusiveGateway;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.InclusiveGateway;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.InputFile;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.LayerSQL;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ModuleList;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsFactory;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ParallelGateway;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementType;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsModule;
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
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XDataType;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XEnum;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XEnumLiteral;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XOperation;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XPackage;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XReference;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Open_reg_specsFactoryImpl extends EFactoryImpl implements Open_reg_specsFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Open_reg_specsFactory init()
	{
		try
		{
			Open_reg_specsFactory theOpen_reg_specsFactory = (Open_reg_specsFactory)EPackage.Registry.INSTANCE.getEFactory(Open_reg_specsPackage.eNS_URI);
			if (theOpen_reg_specsFactory != null)
			{
				return theOpen_reg_specsFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Open_reg_specsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Open_reg_specsFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case Open_reg_specsPackage.SEQUENCE_FLOW: return createSequenceFlow();
			case Open_reg_specsPackage.TASK: return createTask();
			case Open_reg_specsPackage.EXCLUSIVE_GATEWAY: return createExclusiveGateway();
			case Open_reg_specsPackage.INCLUSIVE_GATEWAY: return createInclusiveGateway();
			case Open_reg_specsPackage.PARALLEL_GATEWAY: return createParallelGateway();
			case Open_reg_specsPackage.SERVICE_TASK: return createServiceTask();
			case Open_reg_specsPackage.SUB_PROCESS: return createSubProcess();
			case Open_reg_specsPackage.SCRIPT_TASK: return createScriptTask();
			case Open_reg_specsPackage.USER_TASK: return createUserTask();
			case Open_reg_specsPackage.MODULE: return createModule();
			case Open_reg_specsPackage.MODULE_LIST: return createModuleList();
			case Open_reg_specsPackage.ALLOWED_TYPES: return createAllowedTypes();
			case Open_reg_specsPackage.REQUIREMENTS_MODULE: return createRequirementsModule();
			case Open_reg_specsPackage.REQUIREMENTS_SECTION_IMAGE: return createRequirementsSectionImage();
			case Open_reg_specsPackage.REQUIREMENTS_SECTION_LINK_WITH_TEXT: return createRequirementsSectionLinkWithText();
			case Open_reg_specsPackage.REQUIREMENTS_SECTION_TEXT: return createRequirementsSectionText();
			case Open_reg_specsPackage.REQUIREMENT_TYPE: return createRequirementType();
			case Open_reg_specsPackage.TITLED_REQUIREMENTS_SECTION: return createTitledRequirementsSection();
			case Open_reg_specsPackage.TAG: return createTag();
			case Open_reg_specsPackage.TAG_GROUP: return createTagGroup();
			case Open_reg_specsPackage.VIEW: return createView();
			case Open_reg_specsPackage.LAYER_SQL: return createLayerSQL();
			case Open_reg_specsPackage.SELECT_CLAUSE: return createSelectClause();
			case Open_reg_specsPackage.SELECT_COLUMN: return createSelectColumn();
			case Open_reg_specsPackage.SELECT_COLUMN_MEMBER_AS: return createSelectColumnMemberAs();
			case Open_reg_specsPackage.SELECT_COLUMN_ATTRIBUTE_AS: return createSelectColumnAttributeAs();
			case Open_reg_specsPackage.WHERE_CLAUSE: return createWhereClause();
			case Open_reg_specsPackage.VIEW_MODULE: return createViewModule();
			case Open_reg_specsPackage.ACTIVITY_TAG: return createActivityTag();
			case Open_reg_specsPackage.SCENARIO: return createScenario();
			case Open_reg_specsPackage.SCENARIO_TAG: return createScenarioTag();
			case Open_reg_specsPackage.TEST: return createTest();
			case Open_reg_specsPackage.TEST_MODULE: return createTestModule();
			case Open_reg_specsPackage.DATA_CONSTRAINT: return createDataConstraint();
			case Open_reg_specsPackage.SELECTION_LAYER: return createSelectionLayer();
			case Open_reg_specsPackage.TEST_SCOPE: return createTestScope();
			case Open_reg_specsPackage.UNIT_TEST_SCOPE: return createUnitTestScope();
			case Open_reg_specsPackage.E2E_TEST_SCOPE: return createE2ETestScope();
			case Open_reg_specsPackage.INPUT_FILE: return createInputFile();
			case Open_reg_specsPackage.WORKFLOW_MODULE: return createWorkflowModule();
			case Open_reg_specsPackage.XATTRIBUTE: return createXAttribute();
			case Open_reg_specsPackage.XCLASS: return createXClass();
			case Open_reg_specsPackage.XDATA_TYPE: return createXDataType();
			case Open_reg_specsPackage.XENUM: return createXEnum();
			case Open_reg_specsPackage.XENUM_LITERAL: return createXEnumLiteral();
			case Open_reg_specsPackage.XOPERATION: return createXOperation();
			case Open_reg_specsPackage.XPACKAGE: return createXPackage();
			case Open_reg_specsPackage.XREFERENCE: return createXReference();
			case Open_reg_specsPackage.VTL_ENRICHED_CUBE: return createVTLEnrichedCube();
			case Open_reg_specsPackage.VTL_GENERATED_OUTPUTLAYER: return createVTLGeneratedOutputlayer();
			case Open_reg_specsPackage.VTL_FOR_OUTPUT_LAYER_AND_INTERMEDIATE_LAYER_COMBINATION: return createVTLForOutputLayerAndIntermediateLayerCombination();
			case Open_reg_specsPackage.VTL_GENERATED_INTERMEDIATE_LAYER: return createVTLGeneratedIntermediateLayer();
			case Open_reg_specsPackage.VTL_TRANSFORMATION: return createVTLTransformation();
			case Open_reg_specsPackage.VTL_SCHEME: return createVTLScheme();
			case Open_reg_specsPackage.VTL_FOR_SELECTION_LAYER: return createVTLForSelectionLayer();
			case Open_reg_specsPackage.VTL_MODULE: return createVTLModule();
			case Open_reg_specsPackage.ENTITY_TO_VTL_INTERMEDIATE_LAYER_LINK: return createEntityToVTLIntermediateLayerLink();
			case Open_reg_specsPackage.VTL_FOR_VIEW: return createVTLForView();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID())
		{
			case Open_reg_specsPackage.COMPARITOR:
				return createComparitorFromString(eDataType, initialValue);
			case Open_reg_specsPackage.ATTR_COMPARISON:
				return createAttrComparisonFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID())
		{
			case Open_reg_specsPackage.COMPARITOR:
				return convertComparitorToString(eDataType, instanceValue);
			case Open_reg_specsPackage.ATTR_COMPARISON:
				return convertAttrComparisonToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceFlow createSequenceFlow()
	{
		SequenceFlowImpl sequenceFlow = new SequenceFlowImpl();
		return sequenceFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask()
	{
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusiveGateway createExclusiveGateway()
	{
		ExclusiveGatewayImpl exclusiveGateway = new ExclusiveGatewayImpl();
		return exclusiveGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InclusiveGateway createInclusiveGateway()
	{
		InclusiveGatewayImpl inclusiveGateway = new InclusiveGatewayImpl();
		return inclusiveGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelGateway createParallelGateway()
	{
		ParallelGatewayImpl parallelGateway = new ParallelGatewayImpl();
		return parallelGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTask createServiceTask()
	{
		ServiceTaskImpl serviceTask = new ServiceTaskImpl();
		return serviceTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubProcess createSubProcess()
	{
		SubProcessImpl subProcess = new SubProcessImpl();
		return subProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptTask createScriptTask()
	{
		ScriptTaskImpl scriptTask = new ScriptTaskImpl();
		return scriptTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserTask createUserTask()
	{
		UserTaskImpl userTask = new UserTaskImpl();
		return userTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Module createModule()
	{
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleList createModuleList()
	{
		ModuleListImpl moduleList = new ModuleListImpl();
		return moduleList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowedTypes createAllowedTypes()
	{
		AllowedTypesImpl allowedTypes = new AllowedTypesImpl();
		return allowedTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsModule createRequirementsModule()
	{
		RequirementsModuleImpl requirementsModule = new RequirementsModuleImpl();
		return requirementsModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsSectionImage createRequirementsSectionImage()
	{
		RequirementsSectionImageImpl requirementsSectionImage = new RequirementsSectionImageImpl();
		return requirementsSectionImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsSectionLinkWithText createRequirementsSectionLinkWithText()
	{
		RequirementsSectionLinkWithTextImpl requirementsSectionLinkWithText = new RequirementsSectionLinkWithTextImpl();
		return requirementsSectionLinkWithText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsSectionText createRequirementsSectionText()
	{
		RequirementsSectionTextImpl requirementsSectionText = new RequirementsSectionTextImpl();
		return requirementsSectionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementType createRequirementType()
	{
		RequirementTypeImpl requirementType = new RequirementTypeImpl();
		return requirementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TitledRequirementsSection createTitledRequirementsSection()
	{
		TitledRequirementsSectionImpl titledRequirementsSection = new TitledRequirementsSectionImpl();
		return titledRequirementsSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag createTag()
	{
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagGroup createTagGroup()
	{
		TagGroupImpl tagGroup = new TagGroupImpl();
		return tagGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View createView()
	{
		ViewImpl view = new ViewImpl();
		return view;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LayerSQL createLayerSQL()
	{
		LayerSQLImpl layerSQL = new LayerSQLImpl();
		return layerSQL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectClause createSelectClause()
	{
		SelectClauseImpl selectClause = new SelectClauseImpl();
		return selectClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectColumn createSelectColumn()
	{
		SelectColumnImpl selectColumn = new SelectColumnImpl();
		return selectColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectColumnMemberAs createSelectColumnMemberAs()
	{
		SelectColumnMemberAsImpl selectColumnMemberAs = new SelectColumnMemberAsImpl();
		return selectColumnMemberAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectColumnAttributeAs createSelectColumnAttributeAs()
	{
		SelectColumnAttributeAsImpl selectColumnAttributeAs = new SelectColumnAttributeAsImpl();
		return selectColumnAttributeAs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhereClause createWhereClause()
	{
		WhereClauseImpl whereClause = new WhereClauseImpl();
		return whereClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewModule createViewModule()
	{
		ViewModuleImpl viewModule = new ViewModuleImpl();
		return viewModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityTag createActivityTag()
	{
		ActivityTagImpl activityTag = new ActivityTagImpl();
		return activityTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario createScenario()
	{
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScenarioTag createScenarioTag()
	{
		ScenarioTagImpl scenarioTag = new ScenarioTagImpl();
		return scenarioTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test createTest()
	{
		TestImpl test = new TestImpl();
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestModule createTestModule()
	{
		TestModuleImpl testModule = new TestModuleImpl();
		return testModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataConstraint createDataConstraint()
	{
		DataConstraintImpl dataConstraint = new DataConstraintImpl();
		return dataConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionLayer createSelectionLayer()
	{
		SelectionLayerImpl selectionLayer = new SelectionLayerImpl();
		return selectionLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScope createTestScope()
	{
		TestScopeImpl testScope = new TestScopeImpl();
		return testScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitTestScope createUnitTestScope()
	{
		UnitTestScopeImpl unitTestScope = new UnitTestScopeImpl();
		return unitTestScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public E2ETestScope createE2ETestScope()
	{
		E2ETestScopeImpl e2ETestScope = new E2ETestScopeImpl();
		return e2ETestScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputFile createInputFile()
	{
		InputFileImpl inputFile = new InputFileImpl();
		return inputFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowModule createWorkflowModule()
	{
		WorkflowModuleImpl workflowModule = new WorkflowModuleImpl();
		return workflowModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAttribute createXAttribute()
	{
		XAttributeImpl xAttribute = new XAttributeImpl();
		return xAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XClass createXClass()
	{
		XClassImpl xClass = new XClassImpl();
		return xClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDataType createXDataType()
	{
		XDataTypeImpl xDataType = new XDataTypeImpl();
		return xDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XEnum createXEnum()
	{
		XEnumImpl xEnum = new XEnumImpl();
		return xEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XEnumLiteral createXEnumLiteral()
	{
		XEnumLiteralImpl xEnumLiteral = new XEnumLiteralImpl();
		return xEnumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XOperation createXOperation()
	{
		XOperationImpl xOperation = new XOperationImpl();
		return xOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPackage createXPackage()
	{
		XPackageImpl xPackage = new XPackageImpl();
		return xPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XReference createXReference()
	{
		XReferenceImpl xReference = new XReferenceImpl();
		return xReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTLEnrichedCube createVTLEnrichedCube()
	{
		VTLEnrichedCubeImpl vtlEnrichedCube = new VTLEnrichedCubeImpl();
		return vtlEnrichedCube;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTLGeneratedOutputlayer createVTLGeneratedOutputlayer()
	{
		VTLGeneratedOutputlayerImpl vtlGeneratedOutputlayer = new VTLGeneratedOutputlayerImpl();
		return vtlGeneratedOutputlayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTLForOutputLayerAndIntermediateLayerCombination createVTLForOutputLayerAndIntermediateLayerCombination()
	{
		VTLForOutputLayerAndIntermediateLayerCombinationImpl vtlForOutputLayerAndIntermediateLayerCombination = new VTLForOutputLayerAndIntermediateLayerCombinationImpl();
		return vtlForOutputLayerAndIntermediateLayerCombination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTLGeneratedIntermediateLayer createVTLGeneratedIntermediateLayer()
	{
		VTLGeneratedIntermediateLayerImpl vtlGeneratedIntermediateLayer = new VTLGeneratedIntermediateLayerImpl();
		return vtlGeneratedIntermediateLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTLTransformation createVTLTransformation()
	{
		VTLTransformationImpl vtlTransformation = new VTLTransformationImpl();
		return vtlTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTLScheme createVTLScheme()
	{
		VTLSchemeImpl vtlScheme = new VTLSchemeImpl();
		return vtlScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTLForSelectionLayer createVTLForSelectionLayer()
	{
		VTLForSelectionLayerImpl vtlForSelectionLayer = new VTLForSelectionLayerImpl();
		return vtlForSelectionLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTLModule createVTLModule()
	{
		VTLModuleImpl vtlModule = new VTLModuleImpl();
		return vtlModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityToVTLIntermediateLayerLink createEntityToVTLIntermediateLayerLink()
	{
		EntityToVTLIntermediateLayerLinkImpl entityToVTLIntermediateLayerLink = new EntityToVTLIntermediateLayerLinkImpl();
		return entityToVTLIntermediateLayerLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTLForView createVTLForView()
	{
		VTLForViewImpl vtlForView = new VTLForViewImpl();
		return vtlForView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comparitor createComparitorFromString(EDataType eDataType, String initialValue)
	{
		Comparitor result = Comparitor.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparitorToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttrComparison createAttrComparisonFromString(EDataType eDataType, String initialValue)
	{
		AttrComparison result = AttrComparison.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttrComparisonToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Open_reg_specsPackage getOpen_reg_specsPackage()
	{
		return (Open_reg_specsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Open_reg_specsPackage getPackage()
	{
		return Open_reg_specsPackage.eINSTANCE;
	}

} //Open_reg_specsFactoryImpl
