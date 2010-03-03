/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.mwe2.language.mwe2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.mwe2.language.mwe2.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Mwe2FactoryImpl extends EFactoryImpl implements Mwe2Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Mwe2Factory init()
  {
    try
    {
      Mwe2Factory theMwe2Factory = (Mwe2Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/xtext/common/mwe2/Mwe2"); 
      if (theMwe2Factory != null)
      {
        return theMwe2Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Mwe2FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mwe2FactoryImpl()
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
      case Mwe2Package.MODULE: return createModule();
      case Mwe2Package.REFERRABLE: return createReferrable();
      case Mwe2Package.DECLARED_PROPERTY: return createDeclaredProperty();
      case Mwe2Package.COMPONENT: return createComponent();
      case Mwe2Package.IMPORT: return createImport();
      case Mwe2Package.ASSIGNMENT: return createAssignment();
      case Mwe2Package.BOOLEAN_LITERAL: return createBooleanLiteral();
      case Mwe2Package.REFERENCE: return createReference();
      case Mwe2Package.STRING_LITERAL: return createStringLiteral();
      case Mwe2Package.STRING_PART: return createStringPart();
      case Mwe2Package.PROPERTY_REFERENCE: return createPropertyReference();
      case Mwe2Package.PLAIN_STRING: return createPlainString();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module createModule()
  {
    ModuleImpl module = new ModuleImpl();
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Referrable createReferrable()
  {
    ReferrableImpl referrable = new ReferrableImpl();
    return referrable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeclaredProperty createDeclaredProperty()
  {
    DeclaredPropertyImplCustom declaredProperty = new DeclaredPropertyImplCustom();
    return declaredProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component createComponent()
  {
    ComponentImpl component = new ComponentImpl();
    return component;
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
  public BooleanLiteral createBooleanLiteral()
  {
    BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
    return booleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference createReference()
  {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringPart createStringPart()
  {
    StringPartImpl stringPart = new StringPartImpl();
    return stringPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyReference createPropertyReference()
  {
    PropertyReferenceImpl propertyReference = new PropertyReferenceImpl();
    return propertyReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlainString createPlainString()
  {
    PlainStringImpl plainString = new PlainStringImpl();
    return plainString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mwe2Package getMwe2Package()
  {
    return (Mwe2Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Mwe2Package getPackage()
  {
    return Mwe2Package.eINSTANCE;
  }

} //Mwe2FactoryImpl
