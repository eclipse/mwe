/**
 * <copyright>
 * </copyright>
 *
 * $Id: MwePackage.java,v 1.1 2008/06/13 09:57:49 sefftinge Exp $
 */
package org.eclipse.emf.mwe;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.mwe.MweFactory
 * @model kind="package"
 * @generated
 */
public interface MwePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mwe";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/mwe/di";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mwe";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MwePackage eINSTANCE = org.eclipse.emf.mwe.impl.MwePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.impl.ValueImpl
	 * @see org.eclipse.emf.mwe.impl.MwePackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.impl.WorkflowRefImpl <em>Workflow Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.impl.WorkflowRefImpl
	 * @see org.eclipse.emf.mwe.impl.MwePackageImpl#getWorkflowRef()
	 * @generated
	 */
	int WORKFLOW_REF = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.impl.ComplexValueImpl <em>Complex Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.impl.ComplexValueImpl
	 * @see org.eclipse.emf.mwe.impl.MwePackageImpl#getComplexValue()
	 * @generated
	 */
	int COMPLEX_VALUE = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.impl.PropertyImpl
	 * @see org.eclipse.emf.mwe.impl.MwePackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.impl.LocalVariableImpl <em>Local Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.impl.LocalVariableImpl
	 * @see org.eclipse.emf.mwe.impl.MwePackageImpl#getLocalVariable()
	 * @generated
	 */
	int LOCAL_VARIABLE = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.impl.QualifiedNameImpl <em>Qualified Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.impl.QualifiedNameImpl
	 * @see org.eclipse.emf.mwe.impl.MwePackageImpl#getQualifiedName()
	 * @generated
	 */
	int QUALIFIED_NAME = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.impl.FileImpl
	 * @see org.eclipse.emf.mwe.impl.MwePackageImpl#getFile()
	 * @generated
	 */
	int FILE = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.impl.AssignmentImpl
	 * @see org.eclipse.emf.mwe.impl.MwePackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.impl.IdRefImpl <em>Id Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.impl.IdRefImpl
	 * @see org.eclipse.emf.mwe.impl.MwePackageImpl#getIdRef()
	 * @generated
	 */
	int ID_REF = 4;

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.WorkflowRef <em>Workflow Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow Ref</em>'.
	 * @see org.eclipse.emf.mwe.WorkflowRef
	 * @generated
	 */
	EClass getWorkflowRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.WorkflowRef#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.eclipse.emf.mwe.WorkflowRef#getUri()
	 * @see #getWorkflowRef()
	 * @generated
	 */
	EAttribute getWorkflowRef_Uri();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.impl.PropertiesFileImportImpl <em>Properties File Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.impl.PropertiesFileImportImpl
	 * @see org.eclipse.emf.mwe.impl.MwePackageImpl#getPropertiesFileImport()
	 * @generated
	 */
	int PROPERTIES_FILE_IMPORT = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.impl.SimpleValueImpl <em>Simple Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.impl.SimpleValueImpl
	 * @see org.eclipse.emf.mwe.impl.MwePackageImpl#getSimpleValue()
	 * @generated
	 */
	int SIMPLE_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__FEATURE = 2;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = 3;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_VALUE__ASSIGNMENTS = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_VALUE__CLASS_NAME = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_VALUE__ID = VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Foo Bar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_VALUE__FOO_BAR = VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Complex Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_REF__ID = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Id Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_REF_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.eclipse.emf.mwe.impl.AssignableImpl <em>Assignable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.mwe.impl.AssignableImpl
	 * @see org.eclipse.emf.mwe.impl.MwePackageImpl#getAssignable()
	 * @generated
	 */
	int ASSIGNABLE = 5;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNABLE__ASSIGNMENTS = 0;

	/**
	 * The number of structural features of the '<em>Assignable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNABLE_FEATURE_COUNT = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAME__PARTS = 0;

	/**
	 * The number of structural features of the '<em>Qualified Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALIFIED_NAME_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_REF__ASSIGNMENTS = ASSIGNABLE__ASSIGNMENTS;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_REF__URI = ASSIGNABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Workflow Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_REF_FEATURE_COUNT = ASSIGNABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_FILE_IMPORT__FILE = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Properties File Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_FILE_IMPORT_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__VALUE = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE__NAME = PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Local Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLE_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.ComplexValue <em>Complex Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Value</em>'.
	 * @see org.eclipse.emf.mwe.ComplexValue
	 * @generated
	 */
	EClass getComplexValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.ComplexValue#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.mwe.ComplexValue#getId()
	 * @see #getComplexValue()
	 * @generated
	 */
	EAttribute getComplexValue_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.ComplexValue#isFooBar <em>Foo Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foo Bar</em>'.
	 * @see org.eclipse.emf.mwe.ComplexValue#isFooBar()
	 * @see #getComplexValue()
	 * @generated
	 */
	EAttribute getComplexValue_FooBar();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.ComplexValue#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Class Name</em>'.
	 * @see org.eclipse.emf.mwe.ComplexValue#getClassName()
	 * @see #getComplexValue()
	 * @generated
	 */
	EReference getComplexValue_ClassName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.LocalVariable <em>Local Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Variable</em>'.
	 * @see org.eclipse.emf.mwe.LocalVariable
	 * @generated
	 */
	EClass getLocalVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.LocalVariable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.mwe.LocalVariable#getValue()
	 * @see #getLocalVariable()
	 * @generated
	 */
	EAttribute getLocalVariable_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.LocalVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.mwe.LocalVariable#getName()
	 * @see #getLocalVariable()
	 * @generated
	 */
	EAttribute getLocalVariable_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.QualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualified Name</em>'.
	 * @see org.eclipse.emf.mwe.QualifiedName
	 * @generated
	 */
	EClass getQualifiedName();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.mwe.QualifiedName#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parts</em>'.
	 * @see org.eclipse.emf.mwe.QualifiedName#getParts()
	 * @see #getQualifiedName()
	 * @generated
	 */
	EAttribute getQualifiedName_Parts();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see org.eclipse.emf.mwe.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.mwe.File#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.emf.mwe.File#getProperties()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.File#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.emf.mwe.File#getValue()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see org.eclipse.emf.mwe.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see org.eclipse.emf.mwe.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.Assignment#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.eclipse.emf.mwe.Assignment#getOperator()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.Assignment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.emf.mwe.Assignment#getValue()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.Assignment#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see org.eclipse.emf.mwe.Assignment#getFeature()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_Feature();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.eclipse.emf.mwe.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.IdRef <em>Id Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id Ref</em>'.
	 * @see org.eclipse.emf.mwe.IdRef
	 * @generated
	 */
	EClass getIdRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.IdRef#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.emf.mwe.IdRef#getId()
	 * @see #getIdRef()
	 * @generated
	 */
	EAttribute getIdRef_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.Assignable <em>Assignable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignable</em>'.
	 * @see org.eclipse.emf.mwe.Assignable
	 * @generated
	 */
	EClass getAssignable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.mwe.Assignable#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignments</em>'.
	 * @see org.eclipse.emf.mwe.Assignable#getAssignments()
	 * @see #getAssignable()
	 * @generated
	 */
	EReference getAssignable_Assignments();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.PropertiesFileImport <em>Properties File Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties File Import</em>'.
	 * @see org.eclipse.emf.mwe.PropertiesFileImport
	 * @generated
	 */
	EClass getPropertiesFileImport();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.PropertiesFileImport#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see org.eclipse.emf.mwe.PropertiesFileImport#getFile()
	 * @see #getPropertiesFileImport()
	 * @generated
	 */
	EAttribute getPropertiesFileImport_File();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.mwe.SimpleValue <em>Simple Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Value</em>'.
	 * @see org.eclipse.emf.mwe.SimpleValue
	 * @generated
	 */
	EClass getSimpleValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.SimpleValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.emf.mwe.SimpleValue#getValue()
	 * @see #getSimpleValue()
	 * @generated
	 */
	EAttribute getSimpleValue_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MweFactory getMweFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.impl.WorkflowRefImpl <em>Workflow Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.impl.WorkflowRefImpl
		 * @see org.eclipse.emf.mwe.impl.MwePackageImpl#getWorkflowRef()
		 * @generated
		 */
		EClass WORKFLOW_REF = eINSTANCE.getWorkflowRef();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKFLOW_REF__URI = eINSTANCE.getWorkflowRef_Uri();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.impl.ComplexValueImpl <em>Complex Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.impl.ComplexValueImpl
		 * @see org.eclipse.emf.mwe.impl.MwePackageImpl#getComplexValue()
		 * @generated
		 */
		EClass COMPLEX_VALUE = eINSTANCE.getComplexValue();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_VALUE__ID = eINSTANCE.getComplexValue_Id();

		/**
		 * The meta object literal for the '<em><b>Foo Bar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_VALUE__FOO_BAR = eINSTANCE.getComplexValue_FooBar();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_VALUE__CLASS_NAME = eINSTANCE.getComplexValue_ClassName();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.impl.LocalVariableImpl <em>Local Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.impl.LocalVariableImpl
		 * @see org.eclipse.emf.mwe.impl.MwePackageImpl#getLocalVariable()
		 * @generated
		 */
		EClass LOCAL_VARIABLE = eINSTANCE.getLocalVariable();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_VARIABLE__VALUE = eINSTANCE.getLocalVariable_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_VARIABLE__NAME = eINSTANCE.getLocalVariable_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.impl.QualifiedNameImpl <em>Qualified Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.impl.QualifiedNameImpl
		 * @see org.eclipse.emf.mwe.impl.MwePackageImpl#getQualifiedName()
		 * @generated
		 */
		EClass QUALIFIED_NAME = eINSTANCE.getQualifiedName();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALIFIED_NAME__PARTS = eINSTANCE.getQualifiedName_Parts();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.impl.FileImpl
		 * @see org.eclipse.emf.mwe.impl.MwePackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__PROPERTIES = eINSTANCE.getFile_Properties();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__VALUE = eINSTANCE.getFile_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.impl.ValueImpl
		 * @see org.eclipse.emf.mwe.impl.MwePackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.impl.AssignmentImpl
		 * @see org.eclipse.emf.mwe.impl.MwePackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT__OPERATOR = eINSTANCE.getAssignment_Operator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__VALUE = eINSTANCE.getAssignment_Value();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT__FEATURE = eINSTANCE.getAssignment_Feature();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.impl.PropertyImpl
		 * @see org.eclipse.emf.mwe.impl.MwePackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.impl.IdRefImpl <em>Id Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.impl.IdRefImpl
		 * @see org.eclipse.emf.mwe.impl.MwePackageImpl#getIdRef()
		 * @generated
		 */
		EClass ID_REF = eINSTANCE.getIdRef();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_REF__ID = eINSTANCE.getIdRef_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.impl.AssignableImpl <em>Assignable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.impl.AssignableImpl
		 * @see org.eclipse.emf.mwe.impl.MwePackageImpl#getAssignable()
		 * @generated
		 */
		EClass ASSIGNABLE = eINSTANCE.getAssignable();

		/**
		 * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNABLE__ASSIGNMENTS = eINSTANCE.getAssignable_Assignments();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.impl.PropertiesFileImportImpl <em>Properties File Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.impl.PropertiesFileImportImpl
		 * @see org.eclipse.emf.mwe.impl.MwePackageImpl#getPropertiesFileImport()
		 * @generated
		 */
		EClass PROPERTIES_FILE_IMPORT = eINSTANCE.getPropertiesFileImport();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES_FILE_IMPORT__FILE = eINSTANCE.getPropertiesFileImport_File();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.mwe.impl.SimpleValueImpl <em>Simple Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.mwe.impl.SimpleValueImpl
		 * @see org.eclipse.emf.mwe.impl.MwePackageImpl#getSimpleValue()
		 * @generated
		 */
		EClass SIMPLE_VALUE = eINSTANCE.getSimpleValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_VALUE__VALUE = eINSTANCE.getSimpleValue_Value();

	}

} //MwePackage
