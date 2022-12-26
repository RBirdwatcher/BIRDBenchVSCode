/**
 */
package org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl;

import java.util.Collection;

import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ActivityTag;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ScenarioTag;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SubProcess;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.WorkflowModule;

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
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.WorkflowModuleImpl#getTaskTags <em>Task Tags</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.WorkflowModuleImpl#getScenarioTags <em>Scenario Tags</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.WorkflowModuleImpl#getSubProcess <em>Sub Process</em>}</li>
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
		return Open_reg_specsPackage.eINSTANCE.getWorkflowModule();
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
			taskTags = new EObjectContainmentEList<ActivityTag>(ActivityTag.class, this, Open_reg_specsPackage.WORKFLOW_MODULE__TASK_TAGS);
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
			scenarioTags = new EObjectContainmentEList<ScenarioTag>(ScenarioTag.class, this, Open_reg_specsPackage.WORKFLOW_MODULE__SCENARIO_TAGS);
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
			subProcess = new EObjectContainmentEList<SubProcess>(SubProcess.class, this, Open_reg_specsPackage.WORKFLOW_MODULE__SUB_PROCESS);
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
			case Open_reg_specsPackage.WORKFLOW_MODULE__TASK_TAGS:
				return ((InternalEList<?>)getTaskTags()).basicRemove(otherEnd, msgs);
			case Open_reg_specsPackage.WORKFLOW_MODULE__SCENARIO_TAGS:
				return ((InternalEList<?>)getScenarioTags()).basicRemove(otherEnd, msgs);
			case Open_reg_specsPackage.WORKFLOW_MODULE__SUB_PROCESS:
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
			case Open_reg_specsPackage.WORKFLOW_MODULE__TASK_TAGS:
				return getTaskTags();
			case Open_reg_specsPackage.WORKFLOW_MODULE__SCENARIO_TAGS:
				return getScenarioTags();
			case Open_reg_specsPackage.WORKFLOW_MODULE__SUB_PROCESS:
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
			case Open_reg_specsPackage.WORKFLOW_MODULE__TASK_TAGS:
				getTaskTags().clear();
				getTaskTags().addAll((Collection<? extends ActivityTag>)newValue);
				return;
			case Open_reg_specsPackage.WORKFLOW_MODULE__SCENARIO_TAGS:
				getScenarioTags().clear();
				getScenarioTags().addAll((Collection<? extends ScenarioTag>)newValue);
				return;
			case Open_reg_specsPackage.WORKFLOW_MODULE__SUB_PROCESS:
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
			case Open_reg_specsPackage.WORKFLOW_MODULE__TASK_TAGS:
				getTaskTags().clear();
				return;
			case Open_reg_specsPackage.WORKFLOW_MODULE__SCENARIO_TAGS:
				getScenarioTags().clear();
				return;
			case Open_reg_specsPackage.WORKFLOW_MODULE__SUB_PROCESS:
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
			case Open_reg_specsPackage.WORKFLOW_MODULE__TASK_TAGS:
				return taskTags != null && !taskTags.isEmpty();
			case Open_reg_specsPackage.WORKFLOW_MODULE__SCENARIO_TAGS:
				return scenarioTags != null && !scenarioTags.isEmpty();
			case Open_reg_specsPackage.WORKFLOW_MODULE__SUB_PROCESS:
				return subProcess != null && !subProcess.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorkflowModuleImpl
