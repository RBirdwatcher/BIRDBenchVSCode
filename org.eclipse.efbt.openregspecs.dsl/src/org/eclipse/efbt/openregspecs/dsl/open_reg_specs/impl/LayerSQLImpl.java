/**
 */
package org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl;

import java.util.Collection;

import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.LayerSQL;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectColumn;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.SelectionLayer;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.WhereClause;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layer SQL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.LayerSQLImpl#getSelectionLayer <em>Selection Layer</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.LayerSQLImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.LayerSQLImpl#getWhereClause <em>Where Clause</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayerSQLImpl extends MinimalEObjectImpl.Container implements LayerSQL
{
	/**
	 * The cached value of the '{@link #getSelectionLayer() <em>Selection Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionLayer()
	 * @generated
	 * @ordered
	 */
	protected SelectionLayer selectionLayer;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<SelectColumn> columns;

	/**
	 * The cached value of the '{@link #getWhereClause() <em>Where Clause</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhereClause()
	 * @generated
	 * @ordered
	 */
	protected EList<WhereClause> whereClause;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayerSQLImpl()
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
		return Open_reg_specsPackage.eINSTANCE.getLayerSQL();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionLayer getSelectionLayer()
	{
		if (selectionLayer != null && selectionLayer.eIsProxy())
		{
			InternalEObject oldSelectionLayer = (InternalEObject)selectionLayer;
			selectionLayer = (SelectionLayer)eResolveProxy(oldSelectionLayer);
			if (selectionLayer != oldSelectionLayer)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Open_reg_specsPackage.LAYER_SQL__SELECTION_LAYER, oldSelectionLayer, selectionLayer));
			}
		}
		return selectionLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionLayer basicGetSelectionLayer()
	{
		return selectionLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionLayer(SelectionLayer newSelectionLayer)
	{
		SelectionLayer oldSelectionLayer = selectionLayer;
		selectionLayer = newSelectionLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Open_reg_specsPackage.LAYER_SQL__SELECTION_LAYER, oldSelectionLayer, selectionLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectColumn> getColumns()
	{
		if (columns == null)
		{
			columns = new EObjectContainmentEList<SelectColumn>(SelectColumn.class, this, Open_reg_specsPackage.LAYER_SQL__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WhereClause> getWhereClause()
	{
		if (whereClause == null)
		{
			whereClause = new EObjectContainmentEList<WhereClause>(WhereClause.class, this, Open_reg_specsPackage.LAYER_SQL__WHERE_CLAUSE);
		}
		return whereClause;
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
			case Open_reg_specsPackage.LAYER_SQL__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
			case Open_reg_specsPackage.LAYER_SQL__WHERE_CLAUSE:
				return ((InternalEList<?>)getWhereClause()).basicRemove(otherEnd, msgs);
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
			case Open_reg_specsPackage.LAYER_SQL__SELECTION_LAYER:
				if (resolve) return getSelectionLayer();
				return basicGetSelectionLayer();
			case Open_reg_specsPackage.LAYER_SQL__COLUMNS:
				return getColumns();
			case Open_reg_specsPackage.LAYER_SQL__WHERE_CLAUSE:
				return getWhereClause();
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
			case Open_reg_specsPackage.LAYER_SQL__SELECTION_LAYER:
				setSelectionLayer((SelectionLayer)newValue);
				return;
			case Open_reg_specsPackage.LAYER_SQL__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends SelectColumn>)newValue);
				return;
			case Open_reg_specsPackage.LAYER_SQL__WHERE_CLAUSE:
				getWhereClause().clear();
				getWhereClause().addAll((Collection<? extends WhereClause>)newValue);
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
			case Open_reg_specsPackage.LAYER_SQL__SELECTION_LAYER:
				setSelectionLayer((SelectionLayer)null);
				return;
			case Open_reg_specsPackage.LAYER_SQL__COLUMNS:
				getColumns().clear();
				return;
			case Open_reg_specsPackage.LAYER_SQL__WHERE_CLAUSE:
				getWhereClause().clear();
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
			case Open_reg_specsPackage.LAYER_SQL__SELECTION_LAYER:
				return selectionLayer != null;
			case Open_reg_specsPackage.LAYER_SQL__COLUMNS:
				return columns != null && !columns.isEmpty();
			case Open_reg_specsPackage.LAYER_SQL__WHERE_CLAUSE:
				return whereClause != null && !whereClause.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LayerSQLImpl
