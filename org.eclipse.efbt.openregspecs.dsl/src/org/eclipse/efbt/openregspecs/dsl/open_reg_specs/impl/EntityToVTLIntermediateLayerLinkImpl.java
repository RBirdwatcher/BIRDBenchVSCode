/**
 */
package org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl;

import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.EntityToVTLIntermediateLayerLink;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLGeneratedIntermediateLayer;
import org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XClass;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity To VTL Intermediate Layer Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.EntityToVTLIntermediateLayerLinkImpl#getVTLIntermediateLayer <em>VTL Intermediate Layer</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.EntityToVTLIntermediateLayerLinkImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.impl.EntityToVTLIntermediateLayerLinkImpl#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityToVTLIntermediateLayerLinkImpl extends MinimalEObjectImpl.Container implements EntityToVTLIntermediateLayerLink
{
	/**
	 * The cached value of the '{@link #getVTLIntermediateLayer() <em>VTL Intermediate Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVTLIntermediateLayer()
	 * @generated
	 * @ordered
	 */
	protected VTLGeneratedIntermediateLayer vtlIntermediateLayer;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected XClass entity;

	/**
	 * The default value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected String filter = FILTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityToVTLIntermediateLayerLinkImpl()
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
		return Open_reg_specsPackage.eINSTANCE.getEntityToVTLIntermediateLayerLink();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTLGeneratedIntermediateLayer getVTLIntermediateLayer()
	{
		if (vtlIntermediateLayer != null && vtlIntermediateLayer.eIsProxy())
		{
			InternalEObject oldVTLIntermediateLayer = (InternalEObject)vtlIntermediateLayer;
			vtlIntermediateLayer = (VTLGeneratedIntermediateLayer)eResolveProxy(oldVTLIntermediateLayer);
			if (vtlIntermediateLayer != oldVTLIntermediateLayer)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Open_reg_specsPackage.ENTITY_TO_VTL_INTERMEDIATE_LAYER_LINK__VTL_INTERMEDIATE_LAYER, oldVTLIntermediateLayer, vtlIntermediateLayer));
			}
		}
		return vtlIntermediateLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTLGeneratedIntermediateLayer basicGetVTLIntermediateLayer()
	{
		return vtlIntermediateLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVTLIntermediateLayer(VTLGeneratedIntermediateLayer newVTLIntermediateLayer)
	{
		VTLGeneratedIntermediateLayer oldVTLIntermediateLayer = vtlIntermediateLayer;
		vtlIntermediateLayer = newVTLIntermediateLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Open_reg_specsPackage.ENTITY_TO_VTL_INTERMEDIATE_LAYER_LINK__VTL_INTERMEDIATE_LAYER, oldVTLIntermediateLayer, vtlIntermediateLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XClass getEntity()
	{
		if (entity != null && entity.eIsProxy())
		{
			InternalEObject oldEntity = (InternalEObject)entity;
			entity = (XClass)eResolveProxy(oldEntity);
			if (entity != oldEntity)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Open_reg_specsPackage.ENTITY_TO_VTL_INTERMEDIATE_LAYER_LINK__ENTITY, oldEntity, entity));
			}
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XClass basicGetEntity()
	{
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(XClass newEntity)
	{
		XClass oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Open_reg_specsPackage.ENTITY_TO_VTL_INTERMEDIATE_LAYER_LINK__ENTITY, oldEntity, entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilter()
	{
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(String newFilter)
	{
		String oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Open_reg_specsPackage.ENTITY_TO_VTL_INTERMEDIATE_LAYER_LINK__FILTER, oldFilter, filter));
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
			case Open_reg_specsPackage.ENTITY_TO_VTL_INTERMEDIATE_LAYER_LINK__VTL_INTERMEDIATE_LAYER:
				if (resolve) return getVTLIntermediateLayer();
				return basicGetVTLIntermediateLayer();
			case Open_reg_specsPackage.ENTITY_TO_VTL_INTERMEDIATE_LAYER_LINK__ENTITY:
				if (resolve) return getEntity();
				return basicGetEntity();
			case Open_reg_specsPackage.ENTITY_TO_VTL_INTERMEDIATE_LAYER_LINK__FILTER:
				return getFilter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case Open_reg_specsPackage.ENTITY_TO_VTL_INTERMEDIATE_LAYER_LINK__VTL_INTERMEDIATE_LAYER:
				setVTLIntermediateLayer((VTLGeneratedIntermediateLayer)newValue);
				return;
			case Open_reg_specsPackage.ENTITY_TO_VTL_INTERMEDIATE_LAYER_LINK__ENTITY:
				setEntity((XClass)newValue);
				return;
			case Open_reg_specsPackage.ENTITY_TO_VTL_INTERMEDIATE_LAYER_LINK__FILTER:
				setFilter((String)newValue);
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
			case Open_reg_specsPackage.ENTITY_TO_VTL_INTERMEDIATE_LAYER_LINK__VTL_INTERMEDIATE_LAYER:
				setVTLIntermediateLayer((VTLGeneratedIntermediateLayer)null);
				return;
			case Open_reg_specsPackage.ENTITY_TO_VTL_INTERMEDIATE_LAYER_LINK__ENTITY:
				setEntity((XClass)null);
				return;
			case Open_reg_specsPackage.ENTITY_TO_VTL_INTERMEDIATE_LAYER_LINK__FILTER:
				setFilter(FILTER_EDEFAULT);
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
			case Open_reg_specsPackage.ENTITY_TO_VTL_INTERMEDIATE_LAYER_LINK__VTL_INTERMEDIATE_LAYER:
				return vtlIntermediateLayer != null;
			case Open_reg_specsPackage.ENTITY_TO_VTL_INTERMEDIATE_LAYER_LINK__ENTITY:
				return entity != null;
			case Open_reg_specsPackage.ENTITY_TO_VTL_INTERMEDIATE_LAYER_LINK__FILTER:
				return FILTER_EDEFAULT == null ? filter != null : !FILTER_EDEFAULT.equals(filter);
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
		result.append(" (filter: ");
		result.append(filter);
		result.append(')');
		return result.toString();
	}

} //EntityToVTLIntermediateLayerLinkImpl
