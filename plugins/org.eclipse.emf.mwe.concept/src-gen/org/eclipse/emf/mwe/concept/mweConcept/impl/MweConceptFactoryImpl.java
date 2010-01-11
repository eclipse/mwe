/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.mwe.concept.mweConcept.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.mwe.concept.mweConcept.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MweConceptFactoryImpl extends EFactoryImpl implements MweConceptFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MweConceptFactory init()
  {
    try
    {
      MweConceptFactory theMweConceptFactory = (MweConceptFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/xtext/common/mwe/MWEConcept"); 
      if (theMweConceptFactory != null)
      {
        return theMweConceptFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MweConceptFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MweConceptFactoryImpl()
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
      case MweConceptPackage.MWE_FILE: return createMWEFile();
      case MweConceptPackage.IMPORT: return createImport();
      case MweConceptPackage.SETTING: return createSetting();
      case MweConceptPackage.COMPONENT: return createComponent();
      case MweConceptPackage.CONFIGURATION_ELEMENT: return createConfigurationElement();
      case MweConceptPackage.LITERAL: return createLiteral();
      case MweConceptPackage.PROPERTY: return createProperty();
      case MweConceptPackage.PROPERTY_FILE: return createPropertyFile();
      case MweConceptPackage.ATTRIBUTE: return createAttribute();
      case MweConceptPackage.SIMPLE_ATTRIBUTE: return createSimpleAttribute();
      case MweConceptPackage.REFERENCE: return createReference();
      case MweConceptPackage.MWE_STRING: return createMWEString();
      case MweConceptPackage.MWE_STRING_PART: return createMWEStringPart();
      case MweConceptPackage.REPLACEABLE_STRING: return createReplaceableString();
      case MweConceptPackage.PROPERTY_REFERENCE: return createPropertyReference();
      case MweConceptPackage.PLAIN_STRING: return createPlainString();
      case MweConceptPackage.FILE_REF: return createFileRef();
      case MweConceptPackage.ATTRIBUTE_LIST: return createAttributeList();
      case MweConceptPackage.BOOLEAN_STRING_PART: return createBooleanStringPart();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MWEFile createMWEFile()
  {
    MWEFileImpl mweFile = new MWEFileImpl();
    return mweFile;
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
  public Setting createSetting()
  {
    SettingImpl setting = new SettingImpl();
    return setting;
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
  public ConfigurationElement createConfigurationElement()
  {
    ConfigurationElementImpl configurationElement = new ConfigurationElementImpl();
    return configurationElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
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
  public PropertyFile createPropertyFile()
  {
    PropertyFileImpl propertyFile = new PropertyFileImpl();
    return propertyFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleAttribute createSimpleAttribute()
  {
    SimpleAttributeImpl simpleAttribute = new SimpleAttributeImpl();
    return simpleAttribute;
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
  public MWEString createMWEString()
  {
    MWEStringImpl mweString = new MWEStringImpl();
    return mweString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MWEStringPart createMWEStringPart()
  {
    MWEStringPartImpl mweStringPart = new MWEStringPartImpl();
    return mweStringPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReplaceableString createReplaceableString()
  {
    ReplaceableStringImpl replaceableString = new ReplaceableStringImpl();
    return replaceableString;
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
  public FileRef createFileRef()
  {
    FileRefImpl fileRef = new FileRefImpl();
    return fileRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeList createAttributeList()
  {
    AttributeListImpl attributeList = new AttributeListImpl();
    return attributeList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanStringPart createBooleanStringPart()
  {
    BooleanStringPartImpl booleanStringPart = new BooleanStringPartImpl();
    return booleanStringPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MweConceptPackage getMweConceptPackage()
  {
    return (MweConceptPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MweConceptPackage getPackage()
  {
    return MweConceptPackage.eINSTANCE;
  }

} //MweConceptFactoryImpl
