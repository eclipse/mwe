/**
 * <copyright>
 * </copyright>
 *
 * $Id: MweFactoryImpl.java,v 1.1 2009/02/18 19:38:22 sefftinge Exp $
 */
package org.eclipse.emf.mwe.di.mwe.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.mwe.di.mwe.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MweFactoryImpl extends EFactoryImpl implements MweFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MweFactory init()
  {
    try
    {
      MweFactory theMweFactory = (MweFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/mwe/di"); 
      if (theMweFactory != null)
      {
        return theMweFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MweFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MweFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MwePackage.FILE: return createFile();
      case MwePackage.IMPORT: return createImport();
      case MwePackage.JAVA_IMPORT: return createJavaImport();
      case MwePackage.GENERIC_IMPORT: return createGenericImport();
      case MwePackage.PROPERTY: return createProperty();
      case MwePackage.LOCAL_VARIABLE: return createLocalVariable();
      case MwePackage.PROPERTIES_FILE_IMPORT: return createPropertiesFileImport();
      case MwePackage.VALUE: return createValue();
      case MwePackage.SIMPLE_VALUE: return createSimpleValue();
      case MwePackage.ASSIGNABLE: return createAssignable();
      case MwePackage.COMPLEX_VALUE: return createComplexValue();
      case MwePackage.WORKFLOW_REF: return createWorkflowRef();
      case MwePackage.ID_REF: return createIdRef();
      case MwePackage.ASSIGNMENT: return createAssignment();
      case MwePackage.QUALIFIED_NAME: return createQualifiedName();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public File createFile()
  {
    FileImpl file = new FileImpl();
    return file;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JavaImport createJavaImport()
  {
    JavaImportImpl javaImport = new JavaImportImpl();
    return javaImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericImport createGenericImport()
  {
    GenericImportImpl genericImport = new GenericImportImpl();
    return genericImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalVariable createLocalVariable()
  {
    LocalVariableImpl localVariable = new LocalVariableImpl();
    return localVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertiesFileImport createPropertiesFileImport()
  {
    PropertiesFileImportImpl propertiesFileImport = new PropertiesFileImportImpl();
    return propertiesFileImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleValue createSimpleValue()
  {
    SimpleValueImpl simpleValue = new SimpleValueImpl();
    return simpleValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignable createAssignable()
  {
    AssignableImpl assignable = new AssignableImpl();
    return assignable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue createComplexValue()
  {
    ComplexValueImpl complexValue = new ComplexValueImpl();
    return complexValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkflowRef createWorkflowRef()
  {
    WorkflowRefImpl workflowRef = new WorkflowRefImpl();
    return workflowRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdRef createIdRef()
  {
    IdRefImpl idRef = new IdRefImpl();
    return idRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedName createQualifiedName()
  {
    QualifiedNameImpl qualifiedName = new QualifiedNameImpl();
    return qualifiedName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MwePackage getMwePackage()
  {
    return (MwePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MwePackage getPackage()
  {
    return MwePackage.eINSTANCE;
  }

} //MweFactoryImpl
