/**
 */
package org.eclipse.efbt.regdna.dsl.regdna;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Report Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.regdna.dsl.regdna.ReportModule#getReports <em>Reports</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.regdna.dsl.regdna.regdnaPackage#getReportModule()
 * @model
 * @generated
 */
public interface ReportModule extends org.eclipse.efbt.regdna.dsl.regdna.Module
{
	/**
	 * Returns the value of the '<em><b>Reports</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.efbt.regdna.dsl.regdna.Report}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reports</em>' containment reference list.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.regdnaPackage#getReportModule_Reports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Report> getReports();

} // ReportModule
