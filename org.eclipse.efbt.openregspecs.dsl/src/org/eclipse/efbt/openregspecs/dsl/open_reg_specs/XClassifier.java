/**
 */
package org.eclipse.efbt.openregspecs.dsl.open_reg_specs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XClassifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XClassifier#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getXClassifier()
 * @model abstract="true"
 * @generated
 */
public interface XClassifier extends XNamedElement
{
	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XPackage#getClassifiers <em>Classifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getXClassifier_Package()
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.XPackage#getClassifiers
	 * @model opposite="classifiers" changeable="false"
	 * @generated
	 */
	XPackage getPackage();

} // XClassifier
