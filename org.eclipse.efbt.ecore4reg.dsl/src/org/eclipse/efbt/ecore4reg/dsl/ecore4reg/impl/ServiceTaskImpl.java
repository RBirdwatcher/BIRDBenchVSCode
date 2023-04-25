/**
 */
package org.eclipse.efbt.ecore4reg.dsl.ecore4reg.impl;

import java.util.Collection;

import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELAttribute;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELOperation;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ELStructuralFeature;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Ecore4regPackage;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Scenario;
import org.eclipse.efbt.ecore4reg.dsl.ecore4reg.ServiceTask;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.impl.ServiceTaskImpl#getEnrichedAttribute <em>Enriched Attribute</em>}</li>
 *   <li>{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.impl.ServiceTaskImpl#getScenarios <em>Scenarios</em>}</li>
 *   <li>{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.impl.ServiceTaskImpl#getSecondAttribute <em>Second Attribute</em>}</li>
 *   <li>{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.impl.ServiceTaskImpl#getRequiredAttributesForScenarioChoice <em>Required Attributes For Scenario Choice</em>}</li>
 *   <li>{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.impl.ServiceTaskImpl#getRequiredAttributesForEntityCreation <em>Required Attributes For Entity Creation</em>}</li>
 *   <li>{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.impl.ServiceTaskImpl#isEntityCreationTask <em>Entity Creation Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceTaskImpl extends TaskImpl implements ServiceTask
{
	/**
	 * The cached value of the '{@link #getEnrichedAttribute() <em>Enriched Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnrichedAttribute()
	 * @generated
	 * @ordered
	 */
	protected ELOperation enrichedAttribute;

	/**
	 * The cached value of the '{@link #getScenarios() <em>Scenarios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarios()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> scenarios;

	/**
	 * The cached value of the '{@link #getSecondAttribute() <em>Second Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondAttribute()
	 * @generated
	 * @ordered
	 */
	protected ELAttribute secondAttribute;

	/**
	 * The cached value of the '{@link #getRequiredAttributesForScenarioChoice() <em>Required Attributes For Scenario Choice</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredAttributesForScenarioChoice()
	 * @generated
	 * @ordered
	 */
	protected EList<ELStructuralFeature> requiredAttributesForScenarioChoice;

	/**
	 * The cached value of the '{@link #getRequiredAttributesForEntityCreation() <em>Required Attributes For Entity Creation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredAttributesForEntityCreation()
	 * @generated
	 * @ordered
	 */
	protected EList<ELStructuralFeature> requiredAttributesForEntityCreation;

	/**
	 * The default value of the '{@link #isEntityCreationTask() <em>Entity Creation Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEntityCreationTask()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENTITY_CREATION_TASK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEntityCreationTask() <em>Entity Creation Task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEntityCreationTask()
	 * @generated
	 * @ordered
	 */
	protected boolean entityCreationTask = ENTITY_CREATION_TASK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceTaskImpl()
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
		return Ecore4regPackage.eINSTANCE.getServiceTask();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELOperation getEnrichedAttribute()
	{
		if (enrichedAttribute != null && enrichedAttribute.eIsProxy())
		{
			InternalEObject oldEnrichedAttribute = (InternalEObject)enrichedAttribute;
			enrichedAttribute = (ELOperation)eResolveProxy(oldEnrichedAttribute);
			if (enrichedAttribute != oldEnrichedAttribute)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ecore4regPackage.SERVICE_TASK__ENRICHED_ATTRIBUTE, oldEnrichedAttribute, enrichedAttribute));
			}
		}
		return enrichedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELOperation basicGetEnrichedAttribute()
	{
		return enrichedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnrichedAttribute(ELOperation newEnrichedAttribute)
	{
		ELOperation oldEnrichedAttribute = enrichedAttribute;
		enrichedAttribute = newEnrichedAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ecore4regPackage.SERVICE_TASK__ENRICHED_ATTRIBUTE, oldEnrichedAttribute, enrichedAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Scenario> getScenarios()
	{
		if (scenarios == null)
		{
			scenarios = new EObjectContainmentEList<Scenario>(Scenario.class, this, Ecore4regPackage.SERVICE_TASK__SCENARIOS);
		}
		return scenarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELAttribute getSecondAttribute()
	{
		if (secondAttribute != null && secondAttribute.eIsProxy())
		{
			InternalEObject oldSecondAttribute = (InternalEObject)secondAttribute;
			secondAttribute = (ELAttribute)eResolveProxy(oldSecondAttribute);
			if (secondAttribute != oldSecondAttribute)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ecore4regPackage.SERVICE_TASK__SECOND_ATTRIBUTE, oldSecondAttribute, secondAttribute));
			}
		}
		return secondAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELAttribute basicGetSecondAttribute()
	{
		return secondAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondAttribute(ELAttribute newSecondAttribute)
	{
		ELAttribute oldSecondAttribute = secondAttribute;
		secondAttribute = newSecondAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ecore4regPackage.SERVICE_TASK__SECOND_ATTRIBUTE, oldSecondAttribute, secondAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ELStructuralFeature> getRequiredAttributesForScenarioChoice()
	{
		if (requiredAttributesForScenarioChoice == null)
		{
			requiredAttributesForScenarioChoice = new EObjectResolvingEList<ELStructuralFeature>(ELStructuralFeature.class, this, Ecore4regPackage.SERVICE_TASK__REQUIRED_ATTRIBUTES_FOR_SCENARIO_CHOICE);
		}
		return requiredAttributesForScenarioChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ELStructuralFeature> getRequiredAttributesForEntityCreation()
	{
		if (requiredAttributesForEntityCreation == null)
		{
			requiredAttributesForEntityCreation = new EObjectResolvingEList<ELStructuralFeature>(ELStructuralFeature.class, this, Ecore4regPackage.SERVICE_TASK__REQUIRED_ATTRIBUTES_FOR_ENTITY_CREATION);
		}
		return requiredAttributesForEntityCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEntityCreationTask()
	{
		return entityCreationTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityCreationTask(boolean newEntityCreationTask)
	{
		boolean oldEntityCreationTask = entityCreationTask;
		entityCreationTask = newEntityCreationTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ecore4regPackage.SERVICE_TASK__ENTITY_CREATION_TASK, oldEntityCreationTask, entityCreationTask));
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
			case Ecore4regPackage.SERVICE_TASK__SCENARIOS:
				return ((InternalEList<?>)getScenarios()).basicRemove(otherEnd, msgs);
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
			case Ecore4regPackage.SERVICE_TASK__ENRICHED_ATTRIBUTE:
				if (resolve) return getEnrichedAttribute();
				return basicGetEnrichedAttribute();
			case Ecore4regPackage.SERVICE_TASK__SCENARIOS:
				return getScenarios();
			case Ecore4regPackage.SERVICE_TASK__SECOND_ATTRIBUTE:
				if (resolve) return getSecondAttribute();
				return basicGetSecondAttribute();
			case Ecore4regPackage.SERVICE_TASK__REQUIRED_ATTRIBUTES_FOR_SCENARIO_CHOICE:
				return getRequiredAttributesForScenarioChoice();
			case Ecore4regPackage.SERVICE_TASK__REQUIRED_ATTRIBUTES_FOR_ENTITY_CREATION:
				return getRequiredAttributesForEntityCreation();
			case Ecore4regPackage.SERVICE_TASK__ENTITY_CREATION_TASK:
				return isEntityCreationTask();
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
			case Ecore4regPackage.SERVICE_TASK__ENRICHED_ATTRIBUTE:
				setEnrichedAttribute((ELOperation)newValue);
				return;
			case Ecore4regPackage.SERVICE_TASK__SCENARIOS:
				getScenarios().clear();
				getScenarios().addAll((Collection<? extends Scenario>)newValue);
				return;
			case Ecore4regPackage.SERVICE_TASK__SECOND_ATTRIBUTE:
				setSecondAttribute((ELAttribute)newValue);
				return;
			case Ecore4regPackage.SERVICE_TASK__REQUIRED_ATTRIBUTES_FOR_SCENARIO_CHOICE:
				getRequiredAttributesForScenarioChoice().clear();
				getRequiredAttributesForScenarioChoice().addAll((Collection<? extends ELStructuralFeature>)newValue);
				return;
			case Ecore4regPackage.SERVICE_TASK__REQUIRED_ATTRIBUTES_FOR_ENTITY_CREATION:
				getRequiredAttributesForEntityCreation().clear();
				getRequiredAttributesForEntityCreation().addAll((Collection<? extends ELStructuralFeature>)newValue);
				return;
			case Ecore4regPackage.SERVICE_TASK__ENTITY_CREATION_TASK:
				setEntityCreationTask((Boolean)newValue);
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
			case Ecore4regPackage.SERVICE_TASK__ENRICHED_ATTRIBUTE:
				setEnrichedAttribute((ELOperation)null);
				return;
			case Ecore4regPackage.SERVICE_TASK__SCENARIOS:
				getScenarios().clear();
				return;
			case Ecore4regPackage.SERVICE_TASK__SECOND_ATTRIBUTE:
				setSecondAttribute((ELAttribute)null);
				return;
			case Ecore4regPackage.SERVICE_TASK__REQUIRED_ATTRIBUTES_FOR_SCENARIO_CHOICE:
				getRequiredAttributesForScenarioChoice().clear();
				return;
			case Ecore4regPackage.SERVICE_TASK__REQUIRED_ATTRIBUTES_FOR_ENTITY_CREATION:
				getRequiredAttributesForEntityCreation().clear();
				return;
			case Ecore4regPackage.SERVICE_TASK__ENTITY_CREATION_TASK:
				setEntityCreationTask(ENTITY_CREATION_TASK_EDEFAULT);
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
			case Ecore4regPackage.SERVICE_TASK__ENRICHED_ATTRIBUTE:
				return enrichedAttribute != null;
			case Ecore4regPackage.SERVICE_TASK__SCENARIOS:
				return scenarios != null && !scenarios.isEmpty();
			case Ecore4regPackage.SERVICE_TASK__SECOND_ATTRIBUTE:
				return secondAttribute != null;
			case Ecore4regPackage.SERVICE_TASK__REQUIRED_ATTRIBUTES_FOR_SCENARIO_CHOICE:
				return requiredAttributesForScenarioChoice != null && !requiredAttributesForScenarioChoice.isEmpty();
			case Ecore4regPackage.SERVICE_TASK__REQUIRED_ATTRIBUTES_FOR_ENTITY_CREATION:
				return requiredAttributesForEntityCreation != null && !requiredAttributesForEntityCreation.isEmpty();
			case Ecore4regPackage.SERVICE_TASK__ENTITY_CREATION_TASK:
				return entityCreationTask != ENTITY_CREATION_TASK_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (entityCreationTask: ");
		result.append(entityCreationTask);
		result.append(')');
		return result.toString();
	}

} //ServiceTaskImpl
