/**
 */
package org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsFactory;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Open_reg_specsPackageImpl extends EPackageImpl implements Open_reg_specsPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "open_reg_specs.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowElementsContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusiveGatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inclusiveGatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelGatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allowedTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementsModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementsSectionImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementsSectionLinkWithTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementsSectionTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass titledRequirementsSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerSQLEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectColumnMemberAsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectColumnAttributeAsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whereClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitTestScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass e2ETestScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xEnumLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xStructuralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xTypedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vtlEnrichedCubeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vtlGeneratedOutputlayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vtlForOutputLayerAndIntermediateLayerCombinationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vtlGeneratedIntermediateLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vtlTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vtlSchemeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vtlForSelectionLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vtlModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityToVTLIntermediateLayerLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vtlForViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparitorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attrComparisonEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Open_reg_specsPackageImpl()
	{
		super(eNS_URI, Open_reg_specsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Open_reg_specsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static Open_reg_specsPackage init()
	{
		if (isInited) return (Open_reg_specsPackage)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOpen_reg_specsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Open_reg_specsPackageImpl theOpen_reg_specsPackage = registeredOpen_reg_specsPackage instanceof Open_reg_specsPackageImpl ? (Open_reg_specsPackageImpl)registeredOpen_reg_specsPackage : new Open_reg_specsPackageImpl();

		isInited = true;

		// Load packages
		theOpen_reg_specsPackage.loadPackage();

		// Fix loaded packages
		theOpen_reg_specsPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theOpen_reg_specsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Open_reg_specsPackage.eNS_URI, theOpen_reg_specsPackage);
		return theOpen_reg_specsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseElement()
	{
		if (baseElementEClass == null)
		{
			baseElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(0);
		}
		return baseElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseElement_Name()
	{
        return (EAttribute)getBaseElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseElement_Description()
	{
        return (EAttribute)getBaseElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseElement_Invisible()
	{
        return (EAttribute)getBaseElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowElementsContainer()
	{
		if (flowElementsContainerEClass == null)
		{
			flowElementsContainerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(1);
		}
		return flowElementsContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowElementsContainer_FlowElements()
	{
        return (EReference)getFlowElementsContainer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowElement()
	{
		if (flowElementEClass == null)
		{
			flowElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(2);
		}
		return flowElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowElement_Display_name()
	{
        return (EAttribute)getFlowElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowNode()
	{
		if (flowNodeEClass == null)
		{
			flowNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(3);
		}
		return flowNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowNode_Outgoing()
	{
        return (EReference)getFlowNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowNode_Incoming()
	{
        return (EReference)getFlowNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceFlow()
	{
		if (sequenceFlowEClass == null)
		{
			sequenceFlowEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(4);
		}
		return sequenceFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceFlow_TargetRef()
	{
        return (EReference)getSequenceFlow().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceFlow_SourceRef()
	{
        return (EReference)getSequenceFlow().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask()
	{
		if (taskEClass == null)
		{
			taskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(5);
		}
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity()
	{
		if (activityEClass == null)
		{
			activityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(6);
		}
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGateway()
	{
		if (gatewayEClass == null)
		{
			gatewayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(7);
		}
		return gatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExclusiveGateway()
	{
		if (exclusiveGatewayEClass == null)
		{
			exclusiveGatewayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(8);
		}
		return exclusiveGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInclusiveGateway()
	{
		if (inclusiveGatewayEClass == null)
		{
			inclusiveGatewayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(9);
		}
		return inclusiveGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallelGateway()
	{
		if (parallelGatewayEClass == null)
		{
			parallelGatewayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(10);
		}
		return parallelGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceTask()
	{
		if (serviceTaskEClass == null)
		{
			serviceTaskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(11);
		}
		return serviceTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceTask_EnrichedAttribute()
	{
        return (EReference)getServiceTask().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceTask_Scenarios()
	{
        return (EReference)getServiceTask().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceTask_SecondAttribute()
	{
        return (EReference)getServiceTask().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceTask_RequiredAttributesForScenarioChoice()
	{
        return (EReference)getServiceTask().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceTask_RequiredAttributesForEntityCreation()
	{
        return (EReference)getServiceTask().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceTask_EntityCreationTask()
	{
        return (EAttribute)getServiceTask().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubProcess()
	{
		if (subProcessEClass == null)
		{
			subProcessEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(12);
		}
		return subProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScriptTask()
	{
		if (scriptTaskEClass == null)
		{
			scriptTaskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(13);
		}
		return scriptTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScriptTask_SelectionLayers()
	{
        return (EReference)getScriptTask().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScriptTask_OutputLayer()
	{
        return (EReference)getScriptTask().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserTask()
	{
		if (userTaskEClass == null)
		{
			userTaskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(14);
		}
		return userTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserTask_Entity()
	{
        return (EReference)getUserTask().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule()
	{
		if (moduleEClass == null)
		{
			moduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(15);
		}
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Dependencies()
	{
        return (EReference)getModule().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_TheDescription()
	{
        return (EAttribute)getModule().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_License()
	{
        return (EAttribute)getModule().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Name()
	{
        return (EAttribute)getModule().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Version()
	{
        return (EAttribute)getModule().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleList()
	{
		if (moduleListEClass == null)
		{
			moduleListEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(16);
		}
		return moduleListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleList_Modules()
	{
        return (EReference)getModuleList().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllowedTypes()
	{
		if (allowedTypesEClass == null)
		{
			allowedTypesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(17);
		}
		return allowedTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllowedTypes_AllowedTypes()
	{
        return (EReference)getAllowedTypes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementsModule()
	{
		if (requirementsModuleEClass == null)
		{
			requirementsModuleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(18);
		}
		return requirementsModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementsModule_Rules()
	{
        return (EReference)getRequirementsModule().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementsModule_Allowedtypes()
	{
        return (EReference)getRequirementsModule().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementsSection()
	{
		if (requirementsSectionEClass == null)
		{
			requirementsSectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(19);
		}
		return requirementsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementsSection_Name()
	{
        return (EAttribute)getRequirementsSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementsSectionImage()
	{
		if (requirementsSectionImageEClass == null)
		{
			requirementsSectionImageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(20);
		}
		return requirementsSectionImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementsSectionImage_Style()
	{
        return (EAttribute)getRequirementsSectionImage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementsSectionImage_Uri()
	{
        return (EAttribute)getRequirementsSectionImage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementsSectionLinkWithText()
	{
		if (requirementsSectionLinkWithTextEClass == null)
		{
			requirementsSectionLinkWithTextEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(21);
		}
		return requirementsSectionLinkWithTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementsSectionLinkWithText_LinkedRuleSection()
	{
        return (EReference)getRequirementsSectionLinkWithText().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementsSectionLinkWithText_LinkText()
	{
        return (EAttribute)getRequirementsSectionLinkWithText().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementsSectionLinkWithText_Subsection()
	{
        return (EAttribute)getRequirementsSectionLinkWithText().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementsSectionText()
	{
		if (requirementsSectionTextEClass == null)
		{
			requirementsSectionTextEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(22);
		}
		return requirementsSectionTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementsSectionText_Text()
	{
        return (EAttribute)getRequirementsSectionText().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementType()
	{
		if (requirementTypeEClass == null)
		{
			requirementTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(23);
		}
		return requirementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementType_Name()
	{
        return (EAttribute)getRequirementType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTitledRequirementsSection()
	{
		if (titledRequirementsSectionEClass == null)
		{
			titledRequirementsSectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(24);
		}
		return titledRequirementsSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTitledRequirementsSection_Sections()
	{
        return (EReference)getTitledRequirementsSection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTitledRequirementsSection_ReferencingSections()
	{
        return (EReference)getTitledRequirementsSection().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTitledRequirementsSection_RequirementsType()
	{
        return (EReference)getTitledRequirementsSection().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTitledRequirementsSection_Title()
	{
        return (EAttribute)getTitledRequirementsSection().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTag()
	{
		if (tagEClass == null)
		{
			tagEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(25);
		}
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTag_DisplayName()
	{
        return (EAttribute)getTag().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTag_Name()
	{
        return (EAttribute)getTag().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTag_Requirements()
	{
        return (EReference)getTag().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTagGroup()
	{
		if (tagGroupEClass == null)
		{
			tagGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(26);
		}
		return tagGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTagGroup_Tags()
	{
        return (EReference)getTagGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getView()
	{
		if (viewEClass == null)
		{
			viewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(27);
		}
		return viewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getView_Name()
	{
        return (EAttribute)getView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_OutputLayer()
	{
        return (EReference)getView().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getView_SelectionLayerSQL()
	{
        return (EReference)getView().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayerSQL()
	{
		if (layerSQLEClass == null)
		{
			layerSQLEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(28);
		}
		return layerSQLEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayerSQL_SelectionLayer()
	{
        return (EReference)getLayerSQL().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayerSQL_Columns()
	{
        return (EReference)getLayerSQL().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayerSQL_WhereClause()
	{
        return (EReference)getLayerSQL().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectClause()
	{
		if (selectClauseEClass == null)
		{
			selectClauseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(29);
		}
		return selectClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectColumn()
	{
		if (selectColumnEClass == null)
		{
			selectColumnEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(30);
		}
		return selectColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectColumn_AsAttribute()
	{
        return (EReference)getSelectColumn().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectColumnMemberAs()
	{
		if (selectColumnMemberAsEClass == null)
		{
			selectColumnMemberAsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(31);
		}
		return selectColumnMemberAsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectColumnMemberAs_MemberAsConstant()
	{
        return (EReference)getSelectColumnMemberAs().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectColumnAttributeAs()
	{
		if (selectColumnAttributeAsEClass == null)
		{
			selectColumnAttributeAsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(32);
		}
		return selectColumnAttributeAsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectColumnAttributeAs_Attribute()
	{
        return (EReference)getSelectColumnAttributeAs().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhereClause()
	{
		if (whereClauseEClass == null)
		{
			whereClauseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(34);
		}
		return whereClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhereClause_Attribute1()
	{
        return (EReference)getWhereClause().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhereClause_Comparitor()
	{
        return (EAttribute)getWhereClause().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhereClause_Member()
	{
        return (EReference)getWhereClause().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhereClause_Value()
	{
        return (EAttribute)getWhereClause().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewModule()
	{
		if (viewModuleEClass == null)
		{
			viewModuleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(35);
		}
		return viewModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewModule_Views()
	{
        return (EReference)getViewModule().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityTag()
	{
		if (activityTagEClass == null)
		{
			activityTagEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(36);
		}
		return activityTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityTag_Activity()
	{
        return (EReference)getActivityTag().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenario()
	{
		if (scenarioEClass == null)
		{
			scenarioEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(37);
		}
		return scenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_Name()
	{
        return (EAttribute)getScenario().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_Invisible()
	{
        return (EAttribute)getScenario().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScenario_Description()
	{
        return (EAttribute)getScenario().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_RequiredAttributes()
	{
        return (EReference)getScenario().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenario_Data_constraints()
	{
        return (EReference)getScenario().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScenarioTag()
	{
		if (scenarioTagEClass == null)
		{
			scenarioTagEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(38);
		}
		return scenarioTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScenarioTag_Scenario()
	{
        return (EReference)getScenarioTag().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTest()
	{
		if (testEClass == null)
		{
			testEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(39);
		}
		return testEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTest_InputData()
	{
        return (EReference)getTest().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTest_ExpectedResult()
	{
        return (EReference)getTest().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTest_Name()
	{
        return (EAttribute)getTest().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTest_Scope()
	{
        return (EReference)getTest().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestModule()
	{
		if (testModuleEClass == null)
		{
			testModuleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(40);
		}
		return testModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestModule_Tests()
	{
        return (EReference)getTestModule().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataConstraint()
	{
		if (dataConstraintEClass == null)
		{
			dataConstraintEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(41);
		}
		return dataConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataConstraint_Attr1()
	{
        return (EReference)getDataConstraint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataConstraint_Comparison()
	{
        return (EAttribute)getDataConstraint().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataConstraint_Member()
	{
        return (EReference)getDataConstraint().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataConstraint_Value()
	{
        return (EAttribute)getDataConstraint().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectionLayer()
	{
		if (selectionLayerEClass == null)
		{
			selectionLayerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(43);
		}
		return selectionLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectionLayer_Name()
	{
        return (EAttribute)getSelectionLayer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectionLayer_Invisible()
	{
        return (EAttribute)getSelectionLayer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectionLayer_GeneratedEntity()
	{
        return (EReference)getSelectionLayer().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestScope()
	{
		if (testScopeEClass == null)
		{
			testScopeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(44);
		}
		return testScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestScope_Name()
	{
        return (EAttribute)getTestScope().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitTestScope()
	{
		if (unitTestScopeEClass == null)
		{
			unitTestScopeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(45);
		}
		return unitTestScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitTestScope_Scenarios()
	{
        return (EReference)getUnitTestScope().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getE2ETestScope()
	{
		if (e2ETestScopeEClass == null)
		{
			e2ETestScopeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(46);
		}
		return e2ETestScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getE2ETestScope_Scenarios()
	{
        return (EReference)getE2ETestScope().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getE2ETestScope_Layer()
	{
        return (EReference)getE2ETestScope().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getE2ETestScope_ScriptTask()
	{
        return (EReference)getE2ETestScope().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputFile()
	{
		if (inputFileEClass == null)
		{
			inputFileEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(47);
		}
		return inputFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputFile_FileName()
	{
        return (EAttribute)getInputFile().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputFile_Entity()
	{
        return (EReference)getInputFile().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkflowModule()
	{
		if (workflowModuleEClass == null)
		{
			workflowModuleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(48);
		}
		return workflowModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowModule_TaskTags()
	{
        return (EReference)getWorkflowModule().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowModule_ScenarioTags()
	{
        return (EReference)getWorkflowModule().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkflowModule_SubProcess()
	{
        return (EReference)getWorkflowModule().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXAttribute()
	{
		if (xAttributeEClass == null)
		{
			xAttributeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(49);
		}
		return xAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXAttribute_DefaultValueLiteral()
	{
        return (EAttribute)getXAttribute().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXAttribute_ID()
	{
        return (EAttribute)getXAttribute().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXClass()
	{
		if (xClassEClass == null)
		{
			xClassEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(50);
		}
		return xClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXClass_Abstract()
	{
        return (EAttribute)getXClass().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXClass_Members()
	{
        return (EReference)getXClass().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXClass_SuperTypes()
	{
        return (EReference)getXClass().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXClassifier()
	{
		if (xClassifierEClass == null)
		{
			xClassifierEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(51);
		}
		return xClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXClassifier_Package()
	{
        return (EReference)getXClassifier().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXDataType()
	{
		if (xDataTypeEClass == null)
		{
			xDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(52);
		}
		return xDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXDataType_IndustryName()
	{
        return (EAttribute)getXDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXEnum()
	{
		if (xEnumEClass == null)
		{
			xEnumEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(53);
		}
		return xEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXEnum_Literals()
	{
        return (EReference)getXEnum().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXEnumLiteral()
	{
		if (xEnumLiteralEClass == null)
		{
			xEnumLiteralEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(54);
		}
		return xEnumLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXEnumLiteral_Value()
	{
        return (EAttribute)getXEnumLiteral().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXEnumLiteral_Literal()
	{
        return (EAttribute)getXEnumLiteral().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXEnumLiteral_Enum()
	{
        return (EReference)getXEnumLiteral().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMember()
	{
		if (xMemberEClass == null)
		{
			xMemberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(55);
		}
		return xMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXMember_ContainingClass()
	{
        return (EReference)getXMember().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXModelElement()
	{
		if (xModelElementEClass == null)
		{
			xModelElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(56);
		}
		return xModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXNamedElement()
	{
		if (xNamedElementEClass == null)
		{
			xNamedElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(57);
		}
		return xNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXNamedElement_Name()
	{
        return (EAttribute)getXNamedElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXOperation()
	{
		if (xOperationEClass == null)
		{
			xOperationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(58);
		}
		return xOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXOperation_Body()
	{
        return (EAttribute)getXOperation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXPackage()
	{
		if (xPackageEClass == null)
		{
			xPackageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(59);
		}
		return xPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXPackage_Classifiers()
	{
        return (EReference)getXPackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXReference()
	{
		if (xReferenceEClass == null)
		{
			xReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(60);
		}
		return xReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXReference_Containment()
	{
        return (EAttribute)getXReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXStructuralFeature()
	{
		if (xStructuralFeatureEClass == null)
		{
			xStructuralFeatureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(61);
		}
		return xStructuralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXTypedElement()
	{
		if (xTypedElementEClass == null)
		{
			xTypedElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(62);
		}
		return xTypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXTypedElement_Type()
	{
        return (EReference)getXTypedElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXTypedElement_UpperBound()
	{
        return (EAttribute)getXTypedElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXTypedElement_LowerBound()
	{
        return (EAttribute)getXTypedElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTLEnrichedCube()
	{
		if (vtlEnrichedCubeEClass == null)
		{
			vtlEnrichedCubeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(63);
		}
		return vtlEnrichedCubeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTLEnrichedCube_Transformations()
	{
        return (EReference)getVTLEnrichedCube().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTLGeneratedOutputlayer()
	{
		if (vtlGeneratedOutputlayerEClass == null)
		{
			vtlGeneratedOutputlayerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(64);
		}
		return vtlGeneratedOutputlayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTLGeneratedOutputlayer_Name()
	{
        return (EAttribute)getVTLGeneratedOutputlayer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTLGeneratedOutputlayer_Dependant_intermediate_layers()
	{
        return (EReference)getVTLGeneratedOutputlayer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTLGeneratedOutputlayer_VTLForOutputLayerAndIntemedateLayerCombinations()
	{
        return (EReference)getVTLGeneratedOutputlayer().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTLGeneratedOutputlayer_OutputLayer()
	{
        return (EReference)getVTLGeneratedOutputlayer().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTLForOutputLayerAndIntermediateLayerCombination()
	{
		if (vtlForOutputLayerAndIntermediateLayerCombinationEClass == null)
		{
			vtlForOutputLayerAndIntermediateLayerCombinationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(65);
		}
		return vtlForOutputLayerAndIntermediateLayerCombinationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTLForOutputLayerAndIntermediateLayerCombination_Transformations()
	{
        return (EReference)getVTLForOutputLayerAndIntermediateLayerCombination().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTLForOutputLayerAndIntermediateLayerCombination_OutputLayer()
	{
        return (EReference)getVTLForOutputLayerAndIntermediateLayerCombination().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTLForOutputLayerAndIntermediateLayerCombination_IntermediateLayer()
	{
        return (EReference)getVTLForOutputLayerAndIntermediateLayerCombination().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTLGeneratedIntermediateLayer()
	{
		if (vtlGeneratedIntermediateLayerEClass == null)
		{
			vtlGeneratedIntermediateLayerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(66);
		}
		return vtlGeneratedIntermediateLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTLGeneratedIntermediateLayer_Name()
	{
        return (EAttribute)getVTLGeneratedIntermediateLayer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTLGeneratedIntermediateLayer_Dependant_enriched_cubes()
	{
        return (EReference)getVTLGeneratedIntermediateLayer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTLGeneratedIntermediateLayer_Transformations()
	{
        return (EReference)getVTLGeneratedIntermediateLayer().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTLTransformation()
	{
		if (vtlTransformationEClass == null)
		{
			vtlTransformationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(67);
		}
		return vtlTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTLTransformation_Expression()
	{
        return (EAttribute)getVTLTransformation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTLTransformation_Description()
	{
        return (EAttribute)getVTLTransformation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTLTransformation_Transformation_id()
	{
        return (EAttribute)getVTLTransformation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTLTransformation_Order_in_scheme()
	{
        return (EAttribute)getVTLTransformation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTLScheme()
	{
		if (vtlSchemeEClass == null)
		{
			vtlSchemeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(68);
		}
		return vtlSchemeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTLScheme_Expressions()
	{
        return (EReference)getVTLScheme().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTLScheme_Scheme_id()
	{
        return (EAttribute)getVTLScheme().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTLForSelectionLayer()
	{
		if (vtlForSelectionLayerEClass == null)
		{
			vtlForSelectionLayerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(69);
		}
		return vtlForSelectionLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTLForSelectionLayer_SelectionLayer()
	{
        return (EReference)getVTLForSelectionLayer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTLForSelectionLayer_OutputLayer()
	{
        return (EReference)getVTLForSelectionLayer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTLForSelectionLayer_IntermediateLayer()
	{
        return (EReference)getVTLForSelectionLayer().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTLModule()
	{
		if (vtlModuleEClass == null)
		{
			vtlModuleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(70);
		}
		return vtlModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTLModule_VTLSchemes()
	{
        return (EReference)getVTLModule().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTLModule_VTLGeneratedOutputLayers()
	{
        return (EReference)getVTLModule().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTLModule_VTLGeneratedIntermediateLayers()
	{
        return (EReference)getVTLModule().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTLModule_VTLEnrichedCubes()
	{
        return (EReference)getVTLModule().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTLModule_VTLForSelectionLayers()
	{
        return (EReference)getVTLModule().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTLModule_EntityToVTLIntermediateLayerLinks()
	{
        return (EReference)getVTLModule().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTLModule_VTLForViews()
	{
        return (EReference)getVTLModule().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityToVTLIntermediateLayerLink()
	{
		if (entityToVTLIntermediateLayerLinkEClass == null)
		{
			entityToVTLIntermediateLayerLinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(71);
		}
		return entityToVTLIntermediateLayerLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityToVTLIntermediateLayerLink_VTLIntermediateLayer()
	{
        return (EReference)getEntityToVTLIntermediateLayerLink().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityToVTLIntermediateLayerLink_Entity()
	{
        return (EReference)getEntityToVTLIntermediateLayerLink().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityToVTLIntermediateLayerLink_Filter()
	{
        return (EAttribute)getEntityToVTLIntermediateLayerLink().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTLForView()
	{
		if (vtlForViewEClass == null)
		{
			vtlForViewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(72);
		}
		return vtlForViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVTLForView_Name()
	{
        return (EAttribute)getVTLForView().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTLForView_View()
	{
        return (EReference)getVTLForView().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVTLForView_Vtl()
	{
        return (EReference)getVTLForView().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparitor()
	{
		if (comparitorEEnum == null)
		{
			comparitorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(33);
		}
		return comparitorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAttrComparison()
	{
		if (attrComparisonEEnum == null)
		{
			attrComparisonEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(Open_reg_specsPackage.eNS_URI).getEClassifiers().get(42);
		}
		return attrComparisonEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Open_reg_specsFactory getOpen_reg_specsFactory()
	{
		return (Open_reg_specsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage()
	{
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null)
		{
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try
		{
			resource.load(null);
		}
		catch (IOException exception)
		{
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents()
	{
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier)
	{
		if (eClassifier.getInstanceClassName() == null)
		{
			eClassifier.setInstanceClassName("org.eclipse.efbt.openregspecs.dsl.open_reg_specs." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //Open_reg_specsPackageImpl
