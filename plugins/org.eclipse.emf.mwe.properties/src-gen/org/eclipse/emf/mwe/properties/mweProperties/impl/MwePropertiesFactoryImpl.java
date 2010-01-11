/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.mwe.properties.mweProperties.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.mwe.properties.mweProperties.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MwePropertiesFactoryImpl extends EFactoryImpl implements MwePropertiesFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MwePropertiesFactory init()
  {
    try
    {
      MwePropertiesFactory theMwePropertiesFactory = (MwePropertiesFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/mwe/properties/MWEProperties"); 
      if (theMwePropertiesFactory != null)
      {
        return theMwePropertiesFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MwePropertiesFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MwePropertiesFactoryImpl()
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
      case MwePropertiesPackage.PROPERTY_FILE: return createPropertyFile();
      case MwePropertiesPackage.NATURAL_LINE: return createNaturalLine();
      case MwePropertiesPackage.BLANK_LINE: return createBlankLine();
      case MwePropertiesPackage.PROPERTY_COMMENT: return createPropertyComment();
      case MwePropertiesPackage.PROPERTY_ENTRY: return createPropertyEntry();
      case MwePropertiesPackage.COMPOUND_STRING: return createCompoundString();
      case MwePropertiesPackage.COMPOUND_STRING_PART: return createCompoundStringPart();
      case MwePropertiesPackage.EMPTY_PROPERTY_VALUE: return createEmptyPropertyValue();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
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
  public NaturalLine createNaturalLine()
  {
    NaturalLineImpl naturalLine = new NaturalLineImpl();
    return naturalLine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlankLine createBlankLine()
  {
    BlankLineImpl blankLine = new BlankLineImpl();
    return blankLine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyComment createPropertyComment()
  {
    PropertyCommentImpl propertyComment = new PropertyCommentImpl();
    return propertyComment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyEntry createPropertyEntry()
  {
    PropertyEntryImpl propertyEntry = new PropertyEntryImpl();
    return propertyEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompoundString createCompoundString()
  {
    CompoundStringImpl compoundString = new CompoundStringImpl();
    return compoundString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompoundStringPart createCompoundStringPart()
  {
    CompoundStringPartImpl compoundStringPart = new CompoundStringPartImpl();
    return compoundStringPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmptyPropertyValue createEmptyPropertyValue()
  {
    EmptyPropertyValueImpl emptyPropertyValue = new EmptyPropertyValueImpl();
    return emptyPropertyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MwePropertiesPackage getMwePropertiesPackage()
  {
    return (MwePropertiesPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MwePropertiesPackage getPackage()
  {
    return MwePropertiesPackage.eINSTANCE;
  }

} //MwePropertiesFactoryImpl
