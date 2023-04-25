/**
 */
package org.eclipse.efbt.ecore4reg.dsl.ecore4reg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.InputFile#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.InputFile#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Ecore4regPackage#getInputFile()
 * @model
 * @generated
 */
public interface InputFile extends EObject
{
	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Ecore4regPackage#getInputFile_FileName()
	 * @model
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.InputFile#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(ELClass)
	 * @see org.eclipse.efbt.ecore4reg.dsl.ecore4reg.Ecore4regPackage#getInputFile_Entity()
	 * @model
	 * @generated
	 */
	ELClass getEntity();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.ecore4reg.dsl.ecore4reg.InputFile#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(ELClass value);

} // InputFile
