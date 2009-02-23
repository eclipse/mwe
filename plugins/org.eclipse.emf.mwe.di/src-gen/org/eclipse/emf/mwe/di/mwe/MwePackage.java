/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.mwe.di.mwe;

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
 * @see org.eclipse.emf.mwe.di.mwe.MweFactory
 * @model kind="package"
 * @generated
 */
public interface MwePackage extends EPackage
{
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
  MwePackage eINSTANCE = org.eclipse.emf.mwe.di.mwe.impl.MwePackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.di.mwe.impl.FileImpl <em>File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.di.mwe.impl.FileImpl
   * @see org.eclipse.emf.mwe.di.mwe.impl.MwePackageImpl#getFile()
   * @generated
   */
  int FILE = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__PROPERTIES = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE__VALUE = 2;

  /**
   * The number of structural features of the '<em>File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.di.mwe.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.di.mwe.impl.ImportImpl
   * @see org.eclipse.emf.mwe.di.mwe.impl.MwePackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.di.mwe.impl.JavaImportImpl <em>Java Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.di.mwe.impl.JavaImportImpl
   * @see org.eclipse.emf.mwe.di.mwe.impl.MwePackageImpl#getJavaImport()
   * @generated
   */
  int JAVA_IMPORT = 2;

  /**
   * The feature id for the '<em><b>Java Import</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_IMPORT__JAVA_IMPORT = IMPORT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Wildcard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_IMPORT__WILDCARD = IMPORT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Java Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JAVA_IMPORT_FEATURE_COUNT = IMPORT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.di.mwe.impl.GenericImportImpl <em>Generic Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.di.mwe.impl.GenericImportImpl
   * @see org.eclipse.emf.mwe.di.mwe.impl.MwePackageImpl#getGenericImport()
   * @generated
   */
  int GENERIC_IMPORT = 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_IMPORT__VALUE = IMPORT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Generic Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERIC_IMPORT_FEATURE_COUNT = IMPORT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.di.mwe.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.di.mwe.impl.PropertyImpl
   * @see org.eclipse.emf.mwe.di.mwe.impl.MwePackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 4;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.di.mwe.impl.LocalVariableImpl <em>Local Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.di.mwe.impl.LocalVariableImpl
   * @see org.eclipse.emf.mwe.di.mwe.impl.MwePackageImpl#getLocalVariable()
   * @generated
   */
  int LOCAL_VARIABLE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE__NAME = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE__VALUE = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Local Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.di.mwe.impl.PropertiesFileImportImpl <em>Properties File Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.di.mwe.impl.PropertiesFileImportImpl
   * @see org.eclipse.emf.mwe.di.mwe.impl.MwePackageImpl#getPropertiesFileImport()
   * @generated
   */
  int PROPERTIES_FILE_IMPORT = 6;

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
   * The meta object id for the '{@link org.eclipse.emf.mwe.di.mwe.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.di.mwe.impl.ValueImpl
   * @see org.eclipse.emf.mwe.di.mwe.impl.MwePackageImpl#getValue()
   * @generated
   */
  int VALUE = 7;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.di.mwe.impl.SimpleValueImpl <em>Simple Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.di.mwe.impl.SimpleValueImpl
   * @see org.eclipse.emf.mwe.di.mwe.impl.MwePackageImpl#getSimpleValue()
   * @generated
   */
  int SIMPLE_VALUE = 8;

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
   * The meta object id for the '{@link org.eclipse.emf.mwe.di.mwe.impl.AssignableImpl <em>Assignable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.di.mwe.impl.AssignableImpl
   * @see org.eclipse.emf.mwe.di.mwe.impl.MwePackageImpl#getAssignable()
   * @generated
   */
  int ASSIGNABLE = 9;

  /**
   * The number of structural features of the '<em>Assignable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNABLE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.di.mwe.impl.ComplexValueImpl <em>Complex Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.di.mwe.impl.ComplexValueImpl
   * @see org.eclipse.emf.mwe.di.mwe.impl.MwePackageImpl#getComplexValue()
   * @generated
   */
  int COMPLEX_VALUE = 10;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_VALUE__CLASS_NAME = VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_VALUE__ID = VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Foo Bar</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_VALUE__FOO_BAR = VALUE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_VALUE__ASSIGNMENTS = VALUE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Complex Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.di.mwe.impl.WorkflowRefImpl <em>Workflow Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.di.mwe.impl.WorkflowRefImpl
   * @see org.eclipse.emf.mwe.di.mwe.impl.MwePackageImpl#getWorkflowRef()
   * @generated
   */
  int WORKFLOW_REF = 11;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW_REF__URI = VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW_REF__ASSIGNMENTS = VALUE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Workflow Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKFLOW_REF_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.di.mwe.impl.IdRefImpl <em>Id Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.di.mwe.impl.IdRefImpl
   * @see org.eclipse.emf.mwe.di.mwe.impl.MwePackageImpl#getIdRef()
   * @generated
   */
  int ID_REF = 12;

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
   * The meta object id for the '{@link org.eclipse.emf.mwe.di.mwe.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.di.mwe.impl.AssignmentImpl
   * @see org.eclipse.emf.mwe.di.mwe.impl.MwePackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 13;

  /**
   * The feature id for the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__FEATURE = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__VALUE = 2;

  /**
   * The number of structural features of the '<em>Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.di.mwe.impl.QualifiedNameImpl <em>Qualified Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.di.mwe.impl.QualifiedNameImpl
   * @see org.eclipse.emf.mwe.di.mwe.impl.MwePackageImpl#getQualifiedName()
   * @generated
   */
  int QUALIFIED_NAME = 14;

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
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.di.mwe.File <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.File
   * @generated
   */
  EClass getFile();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.mwe.di.mwe.File#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.File#getImports()
   * @see #getFile()
   * @generated
   */
  EReference getFile_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.mwe.di.mwe.File#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.File#getProperties()
   * @see #getFile()
   * @generated
   */
  EReference getFile_Properties();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.di.mwe.File#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.File#getValue()
   * @see #getFile()
   * @generated
   */
  EReference getFile_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.di.mwe.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.di.mwe.JavaImport <em>Java Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Java Import</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.JavaImport
   * @generated
   */
  EClass getJavaImport();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.di.mwe.JavaImport#getJavaImport <em>Java Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Java Import</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.JavaImport#getJavaImport()
   * @see #getJavaImport()
   * @generated
   */
  EReference getJavaImport_JavaImport();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.di.mwe.JavaImport#isWildcard <em>Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Wildcard</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.JavaImport#isWildcard()
   * @see #getJavaImport()
   * @generated
   */
  EAttribute getJavaImport_Wildcard();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.di.mwe.GenericImport <em>Generic Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generic Import</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.GenericImport
   * @generated
   */
  EClass getGenericImport();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.di.mwe.GenericImport#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.GenericImport#getValue()
   * @see #getGenericImport()
   * @generated
   */
  EAttribute getGenericImport_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.di.mwe.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.di.mwe.LocalVariable <em>Local Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Variable</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.LocalVariable
   * @generated
   */
  EClass getLocalVariable();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.di.mwe.LocalVariable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.LocalVariable#getName()
   * @see #getLocalVariable()
   * @generated
   */
  EAttribute getLocalVariable_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.di.mwe.LocalVariable#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.LocalVariable#getValue()
   * @see #getLocalVariable()
   * @generated
   */
  EReference getLocalVariable_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.di.mwe.PropertiesFileImport <em>Properties File Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Properties File Import</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.PropertiesFileImport
   * @generated
   */
  EClass getPropertiesFileImport();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.di.mwe.PropertiesFileImport#getFile <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>File</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.PropertiesFileImport#getFile()
   * @see #getPropertiesFileImport()
   * @generated
   */
  EAttribute getPropertiesFileImport_File();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.di.mwe.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.di.mwe.SimpleValue <em>Simple Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Value</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.SimpleValue
   * @generated
   */
  EClass getSimpleValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.di.mwe.SimpleValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.SimpleValue#getValue()
   * @see #getSimpleValue()
   * @generated
   */
  EAttribute getSimpleValue_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.di.mwe.Assignable <em>Assignable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignable</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.Assignable
   * @generated
   */
  EClass getAssignable();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.di.mwe.ComplexValue <em>Complex Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Value</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.ComplexValue
   * @generated
   */
  EClass getComplexValue();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.di.mwe.ComplexValue#getClassName <em>Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Name</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.ComplexValue#getClassName()
   * @see #getComplexValue()
   * @generated
   */
  EReference getComplexValue_ClassName();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.di.mwe.ComplexValue#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.ComplexValue#getId()
   * @see #getComplexValue()
   * @generated
   */
  EAttribute getComplexValue_Id();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.di.mwe.ComplexValue#isFooBar <em>Foo Bar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Foo Bar</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.ComplexValue#isFooBar()
   * @see #getComplexValue()
   * @generated
   */
  EAttribute getComplexValue_FooBar();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.mwe.di.mwe.ComplexValue#getAssignments <em>Assignments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assignments</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.ComplexValue#getAssignments()
   * @see #getComplexValue()
   * @generated
   */
  EReference getComplexValue_Assignments();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.di.mwe.WorkflowRef <em>Workflow Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Workflow Ref</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.WorkflowRef
   * @generated
   */
  EClass getWorkflowRef();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.di.mwe.WorkflowRef#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uri</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.WorkflowRef#getUri()
   * @see #getWorkflowRef()
   * @generated
   */
  EAttribute getWorkflowRef_Uri();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.mwe.di.mwe.WorkflowRef#getAssignments <em>Assignments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assignments</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.WorkflowRef#getAssignments()
   * @see #getWorkflowRef()
   * @generated
   */
  EReference getWorkflowRef_Assignments();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.di.mwe.IdRef <em>Id Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Id Ref</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.IdRef
   * @generated
   */
  EClass getIdRef();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.di.mwe.IdRef#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.IdRef#getId()
   * @see #getIdRef()
   * @generated
   */
  EAttribute getIdRef_Id();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.di.mwe.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.Assignment
   * @generated
   */
  EClass getAssignment();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.di.mwe.Assignment#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Feature</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.Assignment#getFeature()
   * @see #getAssignment()
   * @generated
   */
  EAttribute getAssignment_Feature();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.di.mwe.Assignment#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.Assignment#getOperator()
   * @see #getAssignment()
   * @generated
   */
  EAttribute getAssignment_Operator();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.di.mwe.Assignment#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.Assignment#getValue()
   * @see #getAssignment()
   * @generated
   */
  EReference getAssignment_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.di.mwe.QualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualified Name</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.QualifiedName
   * @generated
   */
  EClass getQualifiedName();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.emf.mwe.di.mwe.QualifiedName#getParts <em>Parts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Parts</em>'.
   * @see org.eclipse.emf.mwe.di.mwe.QualifiedName#getParts()
   * @see #getQualifiedName()
   * @generated
   */
  EAttribute getQualifiedName_Parts();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.di.mwe.impl.FileImpl <em>File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.di.mwe.impl.FileImpl
     * @see org.eclipse.emf.mwe.di.mwe.impl.MwePackageImpl#getFile()
     * @generated
     */
    EClass FILE = eINSTANCE.getFile();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILE__IMPORTS = eINSTANCE.getFile_Imports();

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
     * The meta object literal for the '{@link org.eclipse.emf.mwe.di.mwe.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.di.mwe.impl.ImportImpl
     * @see org.eclipse.emf.mwe.di.mwe.impl.MwePackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.di.mwe.impl.JavaImportImpl <em>Java Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.di.mwe.impl.JavaImportImpl
     * @see org.eclipse.emf.mwe.di.mwe.impl.MwePackageImpl#getJavaImport()
     * @generated
     */
    EClass JAVA_IMPORT = eINSTANCE.getJavaImport();

    /**
     * The meta object literal for the '<em><b>Java Import</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JAVA_IMPORT__JAVA_IMPORT = eINSTANCE.getJavaImport_JavaImport();

    /**
     * The meta object literal for the '<em><b>Wildcard</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JAVA_IMPORT__WILDCARD = eINSTANCE.getJavaImport_Wildcard();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.di.mwe.impl.GenericImportImpl <em>Generic Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.di.mwe.impl.GenericImportImpl
     * @see org.eclipse.emf.mwe.di.mwe.impl.MwePackageImpl#getGenericImport()
     * @generated
     */
    EClass GENERIC_IMPORT = eINSTANCE.getGenericImport();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERIC_IMPORT__VALUE = eINSTANCE.getGenericImport_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.di.mwe.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.di.mwe.impl.PropertyImpl
     * @see org.eclipse.emf.mwe.di.mwe.impl.MwePackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.di.mwe.impl.LocalVariableImpl <em>Local Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.di.mwe.impl.LocalVariableImpl
     * @see org.eclipse.emf.mwe.di.mwe.impl.MwePackageImpl#getLocalVariable()
     * @generated
     */
    EClass LOCAL_VARIABLE = eINSTANCE.getLocalVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_VARIABLE__NAME = eINSTANCE.getLocalVariable_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_VARIABLE__VALUE = eINSTANCE.getLocalVariable_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.di.mwe.impl.PropertiesFileImportImpl <em>Properties File Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.di.mwe.impl.PropertiesFileImportImpl
     * @see org.eclipse.emf.mwe.di.mwe.impl.MwePackageImpl#getPropertiesFileImport()
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
     * The meta object literal for the '{@link org.eclipse.emf.mwe.di.mwe.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.di.mwe.impl.ValueImpl
     * @see org.eclipse.emf.mwe.di.mwe.impl.MwePackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.di.mwe.impl.SimpleValueImpl <em>Simple Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.di.mwe.impl.SimpleValueImpl
     * @see org.eclipse.emf.mwe.di.mwe.impl.MwePackageImpl#getSimpleValue()
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

    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.di.mwe.impl.AssignableImpl <em>Assignable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.di.mwe.impl.AssignableImpl
     * @see org.eclipse.emf.mwe.di.mwe.impl.MwePackageImpl#getAssignable()
     * @generated
     */
    EClass ASSIGNABLE = eINSTANCE.getAssignable();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.di.mwe.impl.ComplexValueImpl <em>Complex Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.di.mwe.impl.ComplexValueImpl
     * @see org.eclipse.emf.mwe.di.mwe.impl.MwePackageImpl#getComplexValue()
     * @generated
     */
    EClass COMPLEX_VALUE = eINSTANCE.getComplexValue();

    /**
     * The meta object literal for the '<em><b>Class Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_VALUE__CLASS_NAME = eINSTANCE.getComplexValue_ClassName();

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
     * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPLEX_VALUE__ASSIGNMENTS = eINSTANCE.getComplexValue_Assignments();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.di.mwe.impl.WorkflowRefImpl <em>Workflow Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.di.mwe.impl.WorkflowRefImpl
     * @see org.eclipse.emf.mwe.di.mwe.impl.MwePackageImpl#getWorkflowRef()
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
     * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKFLOW_REF__ASSIGNMENTS = eINSTANCE.getWorkflowRef_Assignments();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.di.mwe.impl.IdRefImpl <em>Id Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.di.mwe.impl.IdRefImpl
     * @see org.eclipse.emf.mwe.di.mwe.impl.MwePackageImpl#getIdRef()
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
     * The meta object literal for the '{@link org.eclipse.emf.mwe.di.mwe.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.di.mwe.impl.AssignmentImpl
     * @see org.eclipse.emf.mwe.di.mwe.impl.MwePackageImpl#getAssignment()
     * @generated
     */
    EClass ASSIGNMENT = eINSTANCE.getAssignment();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNMENT__FEATURE = eINSTANCE.getAssignment_Feature();

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
     * The meta object literal for the '{@link org.eclipse.emf.mwe.di.mwe.impl.QualifiedNameImpl <em>Qualified Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.di.mwe.impl.QualifiedNameImpl
     * @see org.eclipse.emf.mwe.di.mwe.impl.MwePackageImpl#getQualifiedName()
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

  }

} //MwePackage
