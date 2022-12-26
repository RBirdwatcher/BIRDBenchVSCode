/**
 */
package org.eclipse.efbt.openregspecs.dsl.open_reg_specs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VTL Enriched Cube</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLEnrichedCube#getTransformations <em>Transformations</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getVTLEnrichedCube()
 * @model
 * @generated
 */
public interface VTLEnrichedCube extends EObject
{
	/**
	 * Returns the value of the '<em><b>Transformations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.VTLTransformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformations</em>' reference list.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getVTLEnrichedCube_Transformations()
	 * @model
	 * @generated
	 */
	EList<VTLTransformation> getTransformations();

} // VTLEnrichedCube
