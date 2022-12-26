/**
 */
package org.eclipse.efbt.openregspecs.dsl.open_reg_specs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.UserTask#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getUserTask()
 * @model
 * @generated
 */
public interface UserTask extends Task
{
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(XClass)
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getUserTask_Entity()
	 * @model
	 * @generated
	 */
	XClass getEntity();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.UserTask#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(XClass value);

} // UserTask
