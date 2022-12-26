/**
 */
package org.eclipse.efbt.openregspecs.dsl.open_reg_specs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirements Section Link With Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSectionLinkWithText#getLinkedRuleSection <em>Linked Rule Section</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSectionLinkWithText#getLinkText <em>Link Text</em>}</li>
 *   <li>{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSectionLinkWithText#getSubsection <em>Subsection</em>}</li>
 * </ul>
 *
 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getRequirementsSectionLinkWithText()
 * @model extendedMetaData="name='RequirementsSectionLinkWithText' kind='empty'"
 * @generated
 */
public interface RequirementsSectionLinkWithText extends RequirementsSection
{
	/**
	 * Returns the value of the '<em><b>Linked Rule Section</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TitledRequirementsSection#getReferencingSections <em>Referencing Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Rule Section</em>' reference.
	 * @see #setLinkedRuleSection(TitledRequirementsSection)
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getRequirementsSectionLinkWithText_LinkedRuleSection()
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.TitledRequirementsSection#getReferencingSections
	 * @model opposite="referencingSections"
	 *        extendedMetaData="kind='attribute' name='linkedRuleSection'"
	 * @generated
	 */
	TitledRequirementsSection getLinkedRuleSection();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSectionLinkWithText#getLinkedRuleSection <em>Linked Rule Section</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linked Rule Section</em>' reference.
	 * @see #getLinkedRuleSection()
	 * @generated
	 */
	void setLinkedRuleSection(TitledRequirementsSection value);

	/**
	 * Returns the value of the '<em><b>Link Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Text</em>' attribute.
	 * @see #setLinkText(String)
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getRequirementsSectionLinkWithText_LinkText()
	 * @model extendedMetaData="kind='attribute' name='linkText'"
	 * @generated
	 */
	String getLinkText();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSectionLinkWithText#getLinkText <em>Link Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Text</em>' attribute.
	 * @see #getLinkText()
	 * @generated
	 */
	void setLinkText(String value);

	/**
	 * Returns the value of the '<em><b>Subsection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsection</em>' attribute.
	 * @see #setSubsection(String)
	 * @see org.eclipse.efbt.openregspecs.dsl.open_reg_specs.Open_reg_specsPackage#getRequirementsSectionLinkWithText_Subsection()
	 * @model extendedMetaData="kind='attribute' name='subsection'"
	 * @generated
	 */
	String getSubsection();

	/**
	 * Sets the value of the '{@link org.eclipse.efbt.openregspecs.dsl.open_reg_specs.RequirementsSectionLinkWithText#getSubsection <em>Subsection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subsection</em>' attribute.
	 * @see #getSubsection()
	 * @generated
	 */
	void setSubsection(String value);

} // RequirementsSectionLinkWithText
