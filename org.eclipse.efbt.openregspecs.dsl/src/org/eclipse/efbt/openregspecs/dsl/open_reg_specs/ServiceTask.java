/**
 */
package org.eclipse.efbt.openregspecs.dsl.open_reg_specs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ServiceTask#getEnrichedAttribute <em>Enriched Attribute</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ServiceTask#getScenarios <em>Scenarios</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ServiceTask#getSecondAttribute <em>Second Attribute</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ServiceTask#getRequiredAttributesForScenarioChoice <em>Required Attributes For Scenario Choice</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ServiceTask#getRequiredAttributesForEntityCreation <em>Required Attributes For Entity Creation</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ServiceTask#isEntityCreationTask <em>Entity Creation Task</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getServiceTask()
 * @model
 * @generated
 */
public interface ServiceTask extends Task
{
	/**
	 * Returns the value of the '<em><b>Enriched Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enriched Attribute</em>' reference.
	 * @see #setEnrichedAttribute(XOperation)
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getServiceTask_EnrichedAttribute()
	 * @model
	 * @generated
	 */
	XOperation getEnrichedAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ServiceTask#getEnrichedAttribute <em>Enriched Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enriched Attribute</em>' reference.
	 * @see #getEnrichedAttribute()
	 * @generated
	 */
	void setEnrichedAttribute(XOperation value);

	/**
	 * Returns the value of the '<em><b>Scenarios</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Scenario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenarios</em>' containment reference list.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getServiceTask_Scenarios()
	 * @model containment="true"
	 * @generated
	 */
	EList<Scenario> getScenarios();

	/**
	 * Returns the value of the '<em><b>Second Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Attribute</em>' reference.
	 * @see #setSecondAttribute(XAttribute)
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getServiceTask_SecondAttribute()
	 * @model
	 * @generated
	 */
	XAttribute getSecondAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ServiceTask#getSecondAttribute <em>Second Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Attribute</em>' reference.
	 * @see #getSecondAttribute()
	 * @generated
	 */
	void setSecondAttribute(XAttribute value);

	/**
	 * Returns the value of the '<em><b>Required Attributes For Scenario Choice</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XMember}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Attributes For Scenario Choice</em>' reference list.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getServiceTask_RequiredAttributesForScenarioChoice()
	 * @model
	 * @generated
	 */
	EList<XMember> getRequiredAttributesForScenarioChoice();

	/**
	 * Returns the value of the '<em><b>Required Attributes For Entity Creation</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XMember}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Attributes For Entity Creation</em>' reference list.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getServiceTask_RequiredAttributesForEntityCreation()
	 * @model
	 * @generated
	 */
	EList<XMember> getRequiredAttributesForEntityCreation();

	/**
	 * Returns the value of the '<em><b>Entity Creation Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Creation Task</em>' attribute.
	 * @see #setEntityCreationTask(boolean)
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getServiceTask_EntityCreationTask()
	 * @model
	 * @generated
	 */
	boolean isEntityCreationTask();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ServiceTask#isEntityCreationTask <em>Entity Creation Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Creation Task</em>' attribute.
	 * @see #isEntityCreationTask()
	 * @generated
	 */
	void setEntityCreationTask(boolean value);

} // ServiceTask
