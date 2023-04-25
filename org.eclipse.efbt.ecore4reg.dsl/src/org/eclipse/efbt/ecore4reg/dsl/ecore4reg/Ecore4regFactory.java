/**
 */
package org.eclipse.efbt.ecore4reg.dsl.ecore4reg;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Ecore4regPackage
 * @generated
 */
public interface Ecore4regFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Ecore4regFactory eINSTANCE = org.eclipse.efbt.ecore4reg.dsl.ecore4reg.impl.Ecore4regFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sequence Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Flow</em>'.
	 * @generated
	 */
	SequenceFlow createSequenceFlow();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>Exclusive Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exclusive Gateway</em>'.
	 * @generated
	 */
	ExclusiveGateway createExclusiveGateway();

	/**
	 * Returns a new object of class '<em>Inclusive Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inclusive Gateway</em>'.
	 * @generated
	 */
	InclusiveGateway createInclusiveGateway();

	/**
	 * Returns a new object of class '<em>Parallel Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel Gateway</em>'.
	 * @generated
	 */
	ParallelGateway createParallelGateway();

	/**
	 * Returns a new object of class '<em>Service Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Task</em>'.
	 * @generated
	 */
	ServiceTask createServiceTask();

	/**
	 * Returns a new object of class '<em>Sub Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Process</em>'.
	 * @generated
	 */
	SubProcess createSubProcess();

	/**
	 * Returns a new object of class '<em>Script Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Script Task</em>'.
	 * @generated
	 */
	ScriptTask createScriptTask();

	/**
	 * Returns a new object of class '<em>User Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Task</em>'.
	 * @generated
	 */
	UserTask createUserTask();

	/**
	 * Returns a new object of class '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import</em>'.
	 * @generated
	 */
	Import createImport();

	/**
	 * Returns a new object of class '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module</em>'.
	 * @generated
	 */
	Module createModule();

	/**
	 * Returns a new object of class '<em>Module List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module List</em>'.
	 * @generated
	 */
	ModuleList createModuleList();

	/**
	 * Returns a new object of class '<em>Allowed Types</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allowed Types</em>'.
	 * @generated
	 */
	AllowedTypes createAllowedTypes();

	/**
	 * Returns a new object of class '<em>Requirements Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirements Module</em>'.
	 * @generated
	 */
	RequirementsModule createRequirementsModule();

	/**
	 * Returns a new object of class '<em>Requirements Section Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirements Section Image</em>'.
	 * @generated
	 */
	RequirementsSectionImage createRequirementsSectionImage();

	/**
	 * Returns a new object of class '<em>Requirements Section Link With Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirements Section Link With Text</em>'.
	 * @generated
	 */
	RequirementsSectionLinkWithText createRequirementsSectionLinkWithText();

	/**
	 * Returns a new object of class '<em>Requirements Section Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirements Section Text</em>'.
	 * @generated
	 */
	RequirementsSectionText createRequirementsSectionText();

	/**
	 * Returns a new object of class '<em>Requirement Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement Type</em>'.
	 * @generated
	 */
	RequirementType createRequirementType();

	/**
	 * Returns a new object of class '<em>Titled Requirements Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Titled Requirements Section</em>'.
	 * @generated
	 */
	TitledRequirementsSection createTitledRequirementsSection();

	/**
	 * Returns a new object of class '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag</em>'.
	 * @generated
	 */
	Tag createTag();

	/**
	 * Returns a new object of class '<em>Tag Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag Group</em>'.
	 * @generated
	 */
	TagGroup createTagGroup();

	/**
	 * Returns a new object of class '<em>View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View</em>'.
	 * @generated
	 */
	View createView();

	/**
	 * Returns a new object of class '<em>Layer SQL</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layer SQL</em>'.
	 * @generated
	 */
	LayerSQL createLayerSQL();

	/**
	 * Returns a new object of class '<em>Select Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select Clause</em>'.
	 * @generated
	 */
	SelectClause createSelectClause();

	/**
	 * Returns a new object of class '<em>Select Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select Column</em>'.
	 * @generated
	 */
	SelectColumn createSelectColumn();

	/**
	 * Returns a new object of class '<em>Select Column Member As</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select Column Member As</em>'.
	 * @generated
	 */
	SelectColumnMemberAs createSelectColumnMemberAs();

	/**
	 * Returns a new object of class '<em>Select Value As</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select Value As</em>'.
	 * @generated
	 */
	SelectValueAs createSelectValueAs();

	/**
	 * Returns a new object of class '<em>Select Column Attribute As</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select Column Attribute As</em>'.
	 * @generated
	 */
	SelectColumnAttributeAs createSelectColumnAttributeAs();

	/**
	 * Returns a new object of class '<em>Where Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Where Clause</em>'.
	 * @generated
	 */
	WhereClause createWhereClause();

	/**
	 * Returns a new object of class '<em>View Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Module</em>'.
	 * @generated
	 */
	ViewModule createViewModule();

	/**
	 * Returns a new object of class '<em>Activity Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Tag</em>'.
	 * @generated
	 */
	ActivityTag createActivityTag();

	/**
	 * Returns a new object of class '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario</em>'.
	 * @generated
	 */
	Scenario createScenario();

	/**
	 * Returns a new object of class '<em>Scenario Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scenario Tag</em>'.
	 * @generated
	 */
	ScenarioTag createScenarioTag();

	/**
	 * Returns a new object of class '<em>Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test</em>'.
	 * @generated
	 */
	Test createTest();

	/**
	 * Returns a new object of class '<em>Test Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Module</em>'.
	 * @generated
	 */
	TestModule createTestModule();

	/**
	 * Returns a new object of class '<em>Data Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Constraint</em>'.
	 * @generated
	 */
	DataConstraint createDataConstraint();

	/**
	 * Returns a new object of class '<em>Selection Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Selection Layer</em>'.
	 * @generated
	 */
	SelectionLayer createSelectionLayer();

	/**
	 * Returns a new object of class '<em>Test Scope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Scope</em>'.
	 * @generated
	 */
	TestScope createTestScope();

	/**
	 * Returns a new object of class '<em>Unit Test Scope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unit Test Scope</em>'.
	 * @generated
	 */
	UnitTestScope createUnitTestScope();

	/**
	 * Returns a new object of class '<em>E2E Test Scope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>E2E Test Scope</em>'.
	 * @generated
	 */
	E2ETestScope createE2ETestScope();

	/**
	 * Returns a new object of class '<em>Input File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input File</em>'.
	 * @generated
	 */
	InputFile createInputFile();

	/**
	 * Returns a new object of class '<em>Workflow Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Module</em>'.
	 * @generated
	 */
	WorkflowModule createWorkflowModule();

	/**
	 * Returns a new object of class '<em>EL Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EL Attribute</em>'.
	 * @generated
	 */
	ELAttribute createELAttribute();

	/**
	 * Returns a new object of class '<em>EL Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EL Class</em>'.
	 * @generated
	 */
	ELClass createELClass();

	/**
	 * Returns a new object of class '<em>EL Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EL Data Type</em>'.
	 * @generated
	 */
	ELDataType createELDataType();

	/**
	 * Returns a new object of class '<em>EL Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EL Enum</em>'.
	 * @generated
	 */
	ELEnum createELEnum();

	/**
	 * Returns a new object of class '<em>EL Enum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EL Enum Literal</em>'.
	 * @generated
	 */
	ELEnumLiteral createELEnumLiteral();

	/**
	 * Returns a new object of class '<em>EL Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EL Operation</em>'.
	 * @generated
	 */
	ELOperation createELOperation();

	/**
	 * Returns a new object of class '<em>EL Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EL Package</em>'.
	 * @generated
	 */
	ELPackage createELPackage();

	/**
	 * Returns a new object of class '<em>EL Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EL Reference</em>'.
	 * @generated
	 */
	ELReference createELReference();

	/**
	 * Returns a new object of class '<em>EL Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EL Annotation</em>'.
	 * @generated
	 */
	ELAnnotation createELAnnotation();

	/**
	 * Returns a new object of class '<em>VTL Enriched Cube</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTL Enriched Cube</em>'.
	 * @generated
	 */
	VTLEnrichedCube createVTLEnrichedCube();

	/**
	 * Returns a new object of class '<em>VTL Generated Outputlayer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTL Generated Outputlayer</em>'.
	 * @generated
	 */
	VTLGeneratedOutputlayer createVTLGeneratedOutputlayer();

	/**
	 * Returns a new object of class '<em>VTL For Output Layer And Intermediate Layer Combination</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTL For Output Layer And Intermediate Layer Combination</em>'.
	 * @generated
	 */
	VTLForOutputLayerAndIntermediateLayerCombination createVTLForOutputLayerAndIntermediateLayerCombination();

	/**
	 * Returns a new object of class '<em>VTL Generated Intermediate Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTL Generated Intermediate Layer</em>'.
	 * @generated
	 */
	VTLGeneratedIntermediateLayer createVTLGeneratedIntermediateLayer();

	/**
	 * Returns a new object of class '<em>VTL Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTL Transformation</em>'.
	 * @generated
	 */
	VTLTransformation createVTLTransformation();

	/**
	 * Returns a new object of class '<em>VTL Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTL Scheme</em>'.
	 * @generated
	 */
	VTLScheme createVTLScheme();

	/**
	 * Returns a new object of class '<em>VTL For Selection Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTL For Selection Layer</em>'.
	 * @generated
	 */
	VTLForSelectionLayer createVTLForSelectionLayer();

	/**
	 * Returns a new object of class '<em>VTL Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTL Module</em>'.
	 * @generated
	 */
	VTLModule createVTLModule();

	/**
	 * Returns a new object of class '<em>Entity To VTL Intermediate Layer Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity To VTL Intermediate Layer Link</em>'.
	 * @generated
	 */
	EntityToVTLIntermediateLayerLink createEntityToVTLIntermediateLayerLink();

	/**
	 * Returns a new object of class '<em>VTL For View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTL For View</em>'.
	 * @generated
	 */
	VTLForView createVTLForView();

	/**
	 * Returns a new object of class '<em>VTL Generated Outputlayer Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTL Generated Outputlayer Module</em>'.
	 * @generated
	 */
	VTLGeneratedOutputlayerModule createVTLGeneratedOutputlayerModule();

	/**
	 * Returns a new object of class '<em>VTL For Output Layer And Intermediate Layer Combination Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTL For Output Layer And Intermediate Layer Combination Module</em>'.
	 * @generated
	 */
	VTLForOutputLayerAndIntermediateLayerCombinationModule createVTLForOutputLayerAndIntermediateLayerCombinationModule();

	/**
	 * Returns a new object of class '<em>VTL Generated Intermediate Layer Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTL Generated Intermediate Layer Module</em>'.
	 * @generated
	 */
	VTLGeneratedIntermediateLayerModule createVTLGeneratedIntermediateLayerModule();

	/**
	 * Returns a new object of class '<em>VTL Schemes Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTL Schemes Module</em>'.
	 * @generated
	 */
	VTLSchemesModule createVTLSchemesModule();

	/**
	 * Returns a new object of class '<em>VTL For Selection Layer Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTL For Selection Layer Module</em>'.
	 * @generated
	 */
	VTLForSelectionLayerModule createVTLForSelectionLayerModule();

	/**
	 * Returns a new object of class '<em>Entity To VTL Intermediate Layer Link Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity To VTL Intermediate Layer Link Module</em>'.
	 * @generated
	 */
	EntityToVTLIntermediateLayerLinkModule createEntityToVTLIntermediateLayerLinkModule();

	/**
	 * Returns a new object of class '<em>VTL For View Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VTL For View Module</em>'.
	 * @generated
	 */
	VTLForViewModule createVTLForViewModule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Ecore4regPackage getEcore4regPackage();

} //Ecore4regFactory
