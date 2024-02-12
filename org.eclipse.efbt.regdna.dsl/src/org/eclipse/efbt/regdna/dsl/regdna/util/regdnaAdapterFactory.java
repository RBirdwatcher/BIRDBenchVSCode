/**
 */
package org.eclipse.efbt.regdna.dsl.regdna.util;

import org.eclipse.efbt.regdna.dsl.regdna.AndPredicate;
import org.eclipse.efbt.regdna.dsl.regdna.AttributePredicate;
import org.eclipse.efbt.regdna.dsl.regdna.ELAnnotation;
import org.eclipse.efbt.regdna.dsl.regdna.ELAnnotationDirective;
import org.eclipse.efbt.regdna.dsl.regdna.ELAttribute;
import org.eclipse.efbt.regdna.dsl.regdna.ELClass;
import org.eclipse.efbt.regdna.dsl.regdna.ELClassifier;
import org.eclipse.efbt.regdna.dsl.regdna.ELDataType;
import org.eclipse.efbt.regdna.dsl.regdna.ELEnum;
import org.eclipse.efbt.regdna.dsl.regdna.ELEnumLiteral;
import org.eclipse.efbt.regdna.dsl.regdna.ELModelElement;
import org.eclipse.efbt.regdna.dsl.regdna.ELNamedElement;
import org.eclipse.efbt.regdna.dsl.regdna.ELOperation;
import org.eclipse.efbt.regdna.dsl.regdna.ELPackage;
import org.eclipse.efbt.regdna.dsl.regdna.ELParameter;
import org.eclipse.efbt.regdna.dsl.regdna.ELReference;
import org.eclipse.efbt.regdna.dsl.regdna.ELStringToStringMapEntry;
import org.eclipse.efbt.regdna.dsl.regdna.ELStructuralFeature;
import org.eclipse.efbt.regdna.dsl.regdna.ELTypedElement;
import org.eclipse.efbt.regdna.dsl.regdna.Filter;
import org.eclipse.efbt.regdna.dsl.regdna.GenerationRulesModule;
import org.eclipse.efbt.regdna.dsl.regdna.Import;
import org.eclipse.efbt.regdna.dsl.regdna.ModuleList;
import org.eclipse.efbt.regdna.dsl.regdna.NotPredicate;
import org.eclipse.efbt.regdna.dsl.regdna.OrPredicate;
import org.eclipse.efbt.regdna.dsl.regdna.Predicate;
import org.eclipse.efbt.regdna.dsl.regdna.Report;
import org.eclipse.efbt.regdna.dsl.regdna.ReportCell;
import org.eclipse.efbt.regdna.dsl.regdna.ReportColumn;
import org.eclipse.efbt.regdna.dsl.regdna.ReportModule;
import org.eclipse.efbt.regdna.dsl.regdna.ReportRow;
import org.eclipse.efbt.regdna.dsl.regdna.RuleForILTablePart;
import org.eclipse.efbt.regdna.dsl.regdna.RulesForILTable;
import org.eclipse.efbt.regdna.dsl.regdna.RulesForReport;
import org.eclipse.efbt.regdna.dsl.regdna.SelectColumn;
import org.eclipse.efbt.regdna.dsl.regdna.SelectColumnAttributeAs;
import org.eclipse.efbt.regdna.dsl.regdna.SelectColumnMemberAs;
import org.eclipse.efbt.regdna.dsl.regdna.SelectDerivedColumnAs;
import org.eclipse.efbt.regdna.dsl.regdna.SelectValueAs;
import org.eclipse.efbt.regdna.dsl.regdna.TableFilter;
import org.eclipse.efbt.regdna.dsl.regdna.regdnaPackage;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.efbt.regdna.dsl.regdna.regdnaPackage
 * @generated
 */
public class regdnaAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static regdnaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public regdnaAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = regdnaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected regdnaSwitch<Adapter> modelSwitch =
		new regdnaSwitch<Adapter>()
		{
			@Override
			public Adapter caseImport(Import object)
			{
				return createImportAdapter();
			}
			@Override
			public Adapter caseModule(org.eclipse.efbt.regdna.dsl.regdna.Module object)
			{
				return createModuleAdapter();
			}
			@Override
			public Adapter caseModuleList(ModuleList object)
			{
				return createModuleListAdapter();
			}
			@Override
			public Adapter caseRulesForReport(RulesForReport object)
			{
				return createRulesForReportAdapter();
			}
			@Override
			public Adapter caseRulesForILTable(RulesForILTable object)
			{
				return createRulesForILTableAdapter();
			}
			@Override
			public Adapter caseSelectColumn(SelectColumn object)
			{
				return createSelectColumnAdapter();
			}
			@Override
			public Adapter caseSelectColumnMemberAs(SelectColumnMemberAs object)
			{
				return createSelectColumnMemberAsAdapter();
			}
			@Override
			public Adapter caseSelectColumnAttributeAs(SelectColumnAttributeAs object)
			{
				return createSelectColumnAttributeAsAdapter();
			}
			@Override
			public Adapter caseSelectDerivedColumnAs(SelectDerivedColumnAs object)
			{
				return createSelectDerivedColumnAsAdapter();
			}
			@Override
			public Adapter caseSelectValueAs(SelectValueAs object)
			{
				return createSelectValueAsAdapter();
			}
			@Override
			public Adapter caseTableFilter(TableFilter object)
			{
				return createTableFilterAdapter();
			}
			@Override
			public Adapter caseGenerationRulesModule(GenerationRulesModule object)
			{
				return createGenerationRulesModuleAdapter();
			}
			@Override
			public Adapter caseRuleForILTablePart(RuleForILTablePart object)
			{
				return createRuleForILTablePartAdapter();
			}
			@Override
			public Adapter casePredicate(Predicate object)
			{
				return createPredicateAdapter();
			}
			@Override
			public Adapter caseAndPredicate(AndPredicate object)
			{
				return createAndPredicateAdapter();
			}
			@Override
			public Adapter caseOrPredicate(OrPredicate object)
			{
				return createOrPredicateAdapter();
			}
			@Override
			public Adapter caseNotPredicate(NotPredicate object)
			{
				return createNotPredicateAdapter();
			}
			@Override
			public Adapter caseAttributePredicate(AttributePredicate object)
			{
				return createAttributePredicateAdapter();
			}
			@Override
			public Adapter caseELAttribute(ELAttribute object)
			{
				return createELAttributeAdapter();
			}
			@Override
			public Adapter caseELClass(ELClass object)
			{
				return createELClassAdapter();
			}
			@Override
			public Adapter caseELClassifier(ELClassifier object)
			{
				return createELClassifierAdapter();
			}
			@Override
			public Adapter caseELDataType(ELDataType object)
			{
				return createELDataTypeAdapter();
			}
			@Override
			public Adapter caseELEnum(ELEnum object)
			{
				return createELEnumAdapter();
			}
			@Override
			public Adapter caseELEnumLiteral(ELEnumLiteral object)
			{
				return createELEnumLiteralAdapter();
			}
			@Override
			public Adapter caseELModelElement(ELModelElement object)
			{
				return createELModelElementAdapter();
			}
			@Override
			public Adapter caseELNamedElement(ELNamedElement object)
			{
				return createELNamedElementAdapter();
			}
			@Override
			public Adapter caseELOperation(ELOperation object)
			{
				return createELOperationAdapter();
			}
			@Override
			public Adapter caseELParameter(ELParameter object)
			{
				return createELParameterAdapter();
			}
			@Override
			public Adapter caseELPackage(ELPackage object)
			{
				return createELPackageAdapter();
			}
			@Override
			public Adapter caseELReference(ELReference object)
			{
				return createELReferenceAdapter();
			}
			@Override
			public Adapter caseELStructuralFeature(ELStructuralFeature object)
			{
				return createELStructuralFeatureAdapter();
			}
			@Override
			public Adapter caseELTypedElement(ELTypedElement object)
			{
				return createELTypedElementAdapter();
			}
			@Override
			public Adapter caseELAnnotation(ELAnnotation object)
			{
				return createELAnnotationAdapter();
			}
			@Override
			public Adapter caseELAnnotationDirective(ELAnnotationDirective object)
			{
				return createELAnnotationDirectiveAdapter();
			}
			@Override
			public Adapter caseELStringToStringMapEntry(ELStringToStringMapEntry object)
			{
				return createELStringToStringMapEntryAdapter();
			}
			@Override
			public Adapter caseReport(Report object)
			{
				return createReportAdapter();
			}
			@Override
			public Adapter caseReportRow(ReportRow object)
			{
				return createReportRowAdapter();
			}
			@Override
			public Adapter caseReportColumn(ReportColumn object)
			{
				return createReportColumnAdapter();
			}
			@Override
			public Adapter caseReportCell(ReportCell object)
			{
				return createReportCellAdapter();
			}
			@Override
			public Adapter caseFilter(Filter object)
			{
				return createFilterAdapter();
			}
			@Override
			public Adapter caseReportModule(ReportModule object)
			{
				return createReportModuleAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.Import
	 * @generated
	 */
	public Adapter createImportAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.Module
	 * @generated
	 */
	public Adapter createModuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.ModuleList <em>Module List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.ModuleList
	 * @generated
	 */
	public Adapter createModuleListAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.RulesForReport <em>Rules For Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.RulesForReport
	 * @generated
	 */
	public Adapter createRulesForReportAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.RulesForILTable <em>Rules For IL Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.RulesForILTable
	 * @generated
	 */
	public Adapter createRulesForILTableAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.SelectColumn <em>Select Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.SelectColumn
	 * @generated
	 */
	public Adapter createSelectColumnAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.SelectColumnMemberAs <em>Select Column Member As</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.SelectColumnMemberAs
	 * @generated
	 */
	public Adapter createSelectColumnMemberAsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.SelectColumnAttributeAs <em>Select Column Attribute As</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.SelectColumnAttributeAs
	 * @generated
	 */
	public Adapter createSelectColumnAttributeAsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.SelectDerivedColumnAs <em>Select Derived Column As</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.SelectDerivedColumnAs
	 * @generated
	 */
	public Adapter createSelectDerivedColumnAsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.SelectValueAs <em>Select Value As</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.SelectValueAs
	 * @generated
	 */
	public Adapter createSelectValueAsAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.TableFilter <em>Table Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.TableFilter
	 * @generated
	 */
	public Adapter createTableFilterAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.GenerationRulesModule <em>Generation Rules Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.GenerationRulesModule
	 * @generated
	 */
	public Adapter createGenerationRulesModuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.RuleForILTablePart <em>Rule For IL Table Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.RuleForILTablePart
	 * @generated
	 */
	public Adapter createRuleForILTablePartAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.Predicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.Predicate
	 * @generated
	 */
	public Adapter createPredicateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.AndPredicate <em>And Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.AndPredicate
	 * @generated
	 */
	public Adapter createAndPredicateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.OrPredicate <em>Or Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.OrPredicate
	 * @generated
	 */
	public Adapter createOrPredicateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.NotPredicate <em>Not Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.NotPredicate
	 * @generated
	 */
	public Adapter createNotPredicateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.AttributePredicate <em>Attribute Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.AttributePredicate
	 * @generated
	 */
	public Adapter createAttributePredicateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.ELAttribute <em>EL Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.ELAttribute
	 * @generated
	 */
	public Adapter createELAttributeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.ELClass <em>EL Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.ELClass
	 * @generated
	 */
	public Adapter createELClassAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.ELClassifier <em>EL Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.ELClassifier
	 * @generated
	 */
	public Adapter createELClassifierAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.ELDataType <em>EL Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.ELDataType
	 * @generated
	 */
	public Adapter createELDataTypeAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.ELEnum <em>EL Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.ELEnum
	 * @generated
	 */
	public Adapter createELEnumAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.ELEnumLiteral <em>EL Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.ELEnumLiteral
	 * @generated
	 */
	public Adapter createELEnumLiteralAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.ELModelElement <em>EL Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.ELModelElement
	 * @generated
	 */
	public Adapter createELModelElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.ELNamedElement <em>EL Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.ELNamedElement
	 * @generated
	 */
	public Adapter createELNamedElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.ELOperation <em>EL Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.ELOperation
	 * @generated
	 */
	public Adapter createELOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.ELParameter <em>EL Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.ELParameter
	 * @generated
	 */
	public Adapter createELParameterAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.ELPackage <em>EL Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.ELPackage
	 * @generated
	 */
	public Adapter createELPackageAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.ELReference <em>EL Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.ELReference
	 * @generated
	 */
	public Adapter createELReferenceAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.ELStructuralFeature <em>EL Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.ELStructuralFeature
	 * @generated
	 */
	public Adapter createELStructuralFeatureAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.ELTypedElement <em>EL Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.ELTypedElement
	 * @generated
	 */
	public Adapter createELTypedElementAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.ELAnnotation <em>EL Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.ELAnnotation
	 * @generated
	 */
	public Adapter createELAnnotationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.ELAnnotationDirective <em>EL Annotation Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.ELAnnotationDirective
	 * @generated
	 */
	public Adapter createELAnnotationDirectiveAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.ELStringToStringMapEntry <em>EL String To String Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.ELStringToStringMapEntry
	 * @generated
	 */
	public Adapter createELStringToStringMapEntryAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.Report <em>Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.Report
	 * @generated
	 */
	public Adapter createReportAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.ReportRow <em>Report Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.ReportRow
	 * @generated
	 */
	public Adapter createReportRowAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.ReportColumn <em>Report Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.ReportColumn
	 * @generated
	 */
	public Adapter createReportColumnAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.ReportCell <em>Report Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.ReportCell
	 * @generated
	 */
	public Adapter createReportCellAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.Filter
	 * @generated
	 */
	public Adapter createFilterAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.efbt.regdna.dsl.regdna.ReportModule <em>Report Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.efbt.regdna.dsl.regdna.ReportModule
	 * @generated
	 */
	public Adapter createReportModuleAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //regdnaAdapterFactory
