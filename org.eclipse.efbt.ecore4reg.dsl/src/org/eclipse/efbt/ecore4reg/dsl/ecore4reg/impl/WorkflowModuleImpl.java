/**
 */
package org.eclipse.efbt.ecore4reg.dsl.ecore4reg.impl;

import java.util.Collection;

import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ActivityTag;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Ecore4regPackage;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ScenarioTag;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.SubProcess;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.WorkflowModule;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.impl.WorkflowModuleImpl#getTaskTags <em>Task Tags</em>}</li>
 *   <li>{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.impl.WorkflowModuleImpl#getScenarioTags <em>Scenario Tags</em>}</li>
 *   <li>{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.impl.WorkflowModuleImpl#getSubProcess <em>Sub Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkflowModuleImpl extends ModuleImpl implements WorkflowModule
{
	/**
	 * The cached value of the '{@link #getTaskTags() <em>Task Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskTags()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityTag> taskTags;

	/**
	 * The cached value of the '{@link #getScenarioTags() <em>Scenario Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarioTags()
	 * @generated
	 * @ordered
	 */
	protected EList<ScenarioTag> scenarioTags;

	/**
	 * The cached value of the '{@link #getSubProcess() <em>Sub Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<SubProcess> subProcess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowModuleImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return Ecore4regPackage.eINSTANCE.getWorkflowModule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityTag> getTaskTags()
	{
		if (taskTags == null)
		{
			taskTags = new EObjectContainmentEList<ActivityTag>(ActivityTag.class, this, Ecore4regPackage.WORKFLOW_MODULE__TASK_TAGS);
		}
		return taskTags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScenarioTag> getScenarioTags()
	{
		if (scenarioTags == null)
		{
			scenarioTags = new EObjectContainmentEList<ScenarioTag>(ScenarioTag.class, this, Ecore4regPackage.WORKFLOW_MODULE__SCENARIO_TAGS);
		}
		return scenarioTags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubProcess> getSubProcess()
	{
		if (subProcess == null)
		{
			subProcess = new EObjectContainmentEList<SubProcess>(SubProcess.class, this, Ecore4regPackage.WORKFLOW_MODULE__SUB_PROCESS);
		}
		return subProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case Ecore4regPackage.WORKFLOW_MODULE__TASK_TAGS:
				return ((InternalEList<?>)getTaskTags()).basicRemove(otherEnd, msgs);
			case Ecore4regPackage.WORKFLOW_MODULE__SCENARIO_TAGS:
				return ((InternalEList<?>)getScenarioTags()).basicRemove(otherEnd, msgs);
			case Ecore4regPackage.WORKFLOW_MODULE__SUB_PROCESS:
				return ((InternalEList<?>)getSubProcess()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case Ecore4regPackage.WORKFLOW_MODULE__TASK_TAGS:
				return getTaskTags();
			case Ecore4regPackage.WORKFLOW_MODULE__SCENARIO_TAGS:
				return getScenarioTags();
			case Ecore4regPackage.WORKFLOW_MODULE__SUB_PROCESS:
				return getSubProcess();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case Ecore4regPackage.WORKFLOW_MODULE__TASK_TAGS:
				getTaskTags().clear();
				getTaskTags().addAll((Collection<? extends ActivityTag>)newValue);
				return;
			case Ecore4regPackage.WORKFLOW_MODULE__SCENARIO_TAGS:
				getScenarioTags().clear();
				getScenarioTags().addAll((Collection<? extends ScenarioTag>)newValue);
				return;
			case Ecore4regPackage.WORKFLOW_MODULE__SUB_PROCESS:
				getSubProcess().clear();
				getSubProcess().addAll((Collection<? extends SubProcess>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case Ecore4regPackage.WORKFLOW_MODULE__TASK_TAGS:
				getTaskTags().clear();
				return;
			case Ecore4regPackage.WORKFLOW_MODULE__SCENARIO_TAGS:
				getScenarioTags().clear();
				return;
			case Ecore4regPackage.WORKFLOW_MODULE__SUB_PROCESS:
				getSubProcess().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case Ecore4regPackage.WORKFLOW_MODULE__TASK_TAGS:
				return taskTags != null && !taskTags.isEmpty();
			case Ecore4regPackage.WORKFLOW_MODULE__SCENARIO_TAGS:
				return scenarioTags != null && !scenarioTags.isEmpty();
			case Ecore4regPackage.WORKFLOW_MODULE__SUB_PROCESS:
				return subProcess != null && !subProcess.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorkflowModuleImpl
