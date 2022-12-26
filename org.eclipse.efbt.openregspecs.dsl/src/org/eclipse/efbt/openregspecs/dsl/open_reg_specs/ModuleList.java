/**
 */
package org.eclipse.efbt.openregspecs.dsl.open_reg_specs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.ModuleList#getModules <em>Modules</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getModuleList()
 * @model
 * @generated
 */
public interface ModuleList extends EObject
{
	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Module}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getModuleList_Modules()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Module> getModules();

} // ModuleList
