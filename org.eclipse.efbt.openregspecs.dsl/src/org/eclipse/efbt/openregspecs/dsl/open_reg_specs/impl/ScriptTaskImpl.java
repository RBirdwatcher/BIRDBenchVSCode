/**
 */
package org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl;

import java.util.Collection;

import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ScriptTask;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectionLayer;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XClass;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.ScriptTaskImpl#getSelectionLayers <em>Selection Layers</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.ScriptTaskImpl#getOutputLayer <em>Output Layer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScriptTaskImpl extends TaskImpl implements ScriptTask
{
	/**
	 * The cached value of the '{@link #getSelectionLayers() <em>Selection Layers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionLayers()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectionLayer> selectionLayers;

	/**
	 * The cached value of the '{@link #getOutputLayer() <em>Output Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputLayer()
	 * @generated
	 * @ordered
	 */
	protected XClass outputLayer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptTaskImpl()
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
		return Open_reg_specsPackage.eINSTANCE.getScriptTask();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectionLayer> getSelectionLayers()
	{
		if (selectionLayers == null)
		{
			selectionLayers = new EObjectContainmentEList<SelectionLayer>(SelectionLayer.class, this, Open_reg_specsPackage.SCRIPT_TASK__SELECTION_LAYERS);
		}
		return selectionLayers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XClass getOutputLayer()
	{
		if (outputLayer != null && outputLayer.eIsProxy())
		{
			InternalEObject oldOutputLayer = (InternalEObject)outputLayer;
			outputLayer = (XClass)eResolveProxy(oldOutputLayer);
			if (outputLayer != oldOutputLayer)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Open_reg_specsPackage.SCRIPT_TASK__OUTPUT_LAYER, oldOutputLayer, outputLayer));
			}
		}
		return outputLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XClass basicGetOutputLayer()
	{
		return outputLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputLayer(XClass newOutputLayer)
	{
		XClass oldOutputLayer = outputLayer;
		outputLayer = newOutputLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Open_reg_specsPackage.SCRIPT_TASK__OUTPUT_LAYER, oldOutputLayer, outputLayer));
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
			case Open_reg_specsPackage.SCRIPT_TASK__SELECTION_LAYERS:
				return ((InternalEList<?>)getSelectionLayers()).basicRemove(otherEnd, msgs);
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
			case Open_reg_specsPackage.SCRIPT_TASK__SELECTION_LAYERS:
				return getSelectionLayers();
			case Open_reg_specsPackage.SCRIPT_TASK__OUTPUT_LAYER:
				if (resolve) return getOutputLayer();
				return basicGetOutputLayer();
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
			case Open_reg_specsPackage.SCRIPT_TASK__SELECTION_LAYERS:
				getSelectionLayers().clear();
				getSelectionLayers().addAll((Collection<? extends SelectionLayer>)newValue);
				return;
			case Open_reg_specsPackage.SCRIPT_TASK__OUTPUT_LAYER:
				setOutputLayer((XClass)newValue);
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
			case Open_reg_specsPackage.SCRIPT_TASK__SELECTION_LAYERS:
				getSelectionLayers().clear();
				return;
			case Open_reg_specsPackage.SCRIPT_TASK__OUTPUT_LAYER:
				setOutputLayer((XClass)null);
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
			case Open_reg_specsPackage.SCRIPT_TASK__SELECTION_LAYERS:
				return selectionLayers != null && !selectionLayers.isEmpty();
			case Open_reg_specsPackage.SCRIPT_TASK__OUTPUT_LAYER:
				return outputLayer != null;
		}
		return super.eIsSet(featureID);
	}

} //ScriptTaskImpl
