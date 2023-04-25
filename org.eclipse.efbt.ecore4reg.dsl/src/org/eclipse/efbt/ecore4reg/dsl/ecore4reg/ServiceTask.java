/**
 */
package org.eclipse.efbt.ecore4reg.dsl.ecore4reg;

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
 *   <li>{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ServiceTask#getEnrichedAttribute <em>Enriched Attribute</em>}</li>
 *   <li>{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ServiceTask#getScenarios <em>Scenarios</em>}</li>
 *   <li>{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ServiceTask#getSecondAttribute <em>Second Attribute</em>}</li>
 *   <li>{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ServiceTask#getRequiredAttributesForScenarioChoice <em>Required Attributes For Scenario Choice</em>}</li>
 *   <li>{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ServiceTask#getRequiredAttributesForEntityCreation <em>Required Attributes For Entity Creation</em>}</li>
 *   <li>{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ServiceTask#isEntityCreationTask <em>Entity Creation Task</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Ecore4regPackage#getServiceTask()
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
	 * @see #setEnrichedAttribute(ELOperation)
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Ecore4regPackage#getServiceTask_EnrichedAttribute()
	 * @model
	 * @generated
	 */
	ELOperation getEnrichedAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ServiceTask#getEnrichedAttribute <em>Enriched Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enriched Attribute</em>' reference.
	 * @see #getEnrichedAttribute()
	 * @generated
	 */
	void setEnrichedAttribute(ELOperation value);

	/**
	 * Returns the value of the '<em><b>Scenarios</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Scenario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenarios</em>' containment reference list.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Ecore4regPackage#getServiceTask_Scenarios()
	 * @model containment="true"
	 * @generated
	 */
	EList<Scenario> getScenarios();

	/**
	 * Returns the value of the '<em><b>Second Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Attribute</em>' reference.
	 * @see #setSecondAttribute(ELAttribute)
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Ecore4regPackage#getServiceTask_SecondAttribute()
	 * @model
	 * @generated
	 */
	ELAttribute getSecondAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ServiceTask#getSecondAttribute <em>Second Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Attribute</em>' reference.
	 * @see #getSecondAttribute()
	 * @generated
	 */
	void setSecondAttribute(ELAttribute value);

	/**
	 * Returns the value of the '<em><b>Required Attributes For Scenario Choice</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELStructuralFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Attributes For Scenario Choice</em>' reference list.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Ecore4regPackage#getServiceTask_RequiredAttributesForScenarioChoice()
	 * @model
	 * @generated
	 */
	EList<ELStructuralFeature> getRequiredAttributesForScenarioChoice();

	/**
	 * Returns the value of the '<em><b>Required Attributes For Entity Creation</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELStructuralFeature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Attributes For Entity Creation</em>' reference list.
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Ecore4regPackage#getServiceTask_RequiredAttributesForEntityCreation()
	 * @model
	 * @generated
	 */
	EList<ELStructuralFeature> getRequiredAttributesForEntityCreation();

	/**
	 * Returns the value of the '<em><b>Entity Creation Task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Creation Task</em>' attribute.
	 * @see #setEntityCreationTask(boolean)
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Ecore4regPackage#getServiceTask_EntityCreationTask()
	 * @model
	 * @generated
	 */
	boolean isEntityCreationTask();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ServiceTask#isEntityCreationTask <em>Entity Creation Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Creation Task</em>' attribute.
	 * @see #isEntityCreationTask()
	 * @generated
	 */
	void setEntityCreationTask(boolean value);

} // ServiceTask
