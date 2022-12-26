/**
 */
package org.eclipse.efbt.openregspecs.dsl.open_reg_specs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allowed Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.AllowedTypes#getAllowedTypes <em>Allowed Types</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getAllowedTypes()
 * @model extendedMetaData="name='AllowedTypes' kind='elementOnly'"
 * @generated
 */
public interface AllowedTypes extends EObject
{
	/**
	 * Returns the value of the '<em><b>Allowed Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Types</em>' containment reference list.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getAllowedTypes_AllowedTypes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='allowedTypes'"
	 * @generated
	 */
	EList<RequirementType> getAllowedTypes();

} // AllowedTypes
