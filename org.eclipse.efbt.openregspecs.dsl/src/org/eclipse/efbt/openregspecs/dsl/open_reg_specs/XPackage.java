/**
 */
package org.eclipse.efbt.openregspecs.dsl.open_reg_specs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XPackage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XPackage#getClassifiers <em>Classifiers</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getXPackage()
 * @model
 * @generated
 */
public interface XPackage extends org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Module
{
	/**
	 * Returns the value of the '<em><b>Classifiers</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XClassifier}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XClassifier#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifiers</em>' containment reference list.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getXPackage_Classifiers()
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XClassifier#getPackage
	 * @model opposite="package" containment="true"
	 * @generated
	 */
	EList<XClassifier> getClassifiers();

} // XPackage
