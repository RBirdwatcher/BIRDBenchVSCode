/**
 */
package org.eclipse.efbt.openregspecs.dsl.open_reg_specs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity To VTL Intermediate Layer Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.EntityToVTLIntermediateLayerLink#getVTLIntermediateLayer <em>VTL Intermediate Layer</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.EntityToVTLIntermediateLayerLink#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.EntityToVTLIntermediateLayerLink#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getEntityToVTLIntermediateLayerLink()
 * @model
 * @generated
 */
public interface EntityToVTLIntermediateLayerLink extends EObject
{
	/**
	 * Returns the value of the '<em><b>VTL Intermediate Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VTL Intermediate Layer</em>' reference.
	 * @see #setVTLIntermediateLayer(VTLGeneratedIntermediateLayer)
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getEntityToVTLIntermediateLayerLink_VTLIntermediateLayer()
	 * @model
	 * @generated
	 */
	VTLGeneratedIntermediateLayer getVTLIntermediateLayer();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.EntityToVTLIntermediateLayerLink#getVTLIntermediateLayer <em>VTL Intermediate Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VTL Intermediate Layer</em>' reference.
	 * @see #getVTLIntermediateLayer()
	 * @generated
	 */
	void setVTLIntermediateLayer(VTLGeneratedIntermediateLayer value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(XClass)
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getEntityToVTLIntermediateLayerLink_Entity()
	 * @model
	 * @generated
	 */
	XClass getEntity();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.EntityToVTLIntermediateLayerLink#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(XClass value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' attribute.
	 * @see #setFilter(String)
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getEntityToVTLIntermediateLayerLink_Filter()
	 * @model
	 * @generated
	 */
	String getFilter();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.EntityToVTLIntermediateLayerLink#getFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(String value);

} // EntityToVTLIntermediateLayerLink
