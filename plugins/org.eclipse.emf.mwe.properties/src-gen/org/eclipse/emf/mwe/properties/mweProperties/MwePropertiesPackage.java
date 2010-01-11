/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.mwe.properties.mweProperties;

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
 * @see org.eclipse.emf.mwe.properties.mweProperties.MwePropertiesFactory
 * @model kind="package"
 * @generated
 */
public interface MwePropertiesPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mweProperties";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/emf/mwe/properties/MWEProperties";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "mweProperties";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MwePropertiesPackage eINSTANCE = org.eclipse.emf.mwe.properties.mweProperties.impl.MwePropertiesPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.properties.mweProperties.impl.PropertyFileImpl <em>Property File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.properties.mweProperties.impl.PropertyFileImpl
   * @see org.eclipse.emf.mwe.properties.mweProperties.impl.MwePropertiesPackageImpl#getPropertyFile()
   * @generated
   */
  int PROPERTY_FILE = 0;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FILE__ENTRIES = 0;

  /**
   * The number of structural features of the '<em>Property File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FILE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.properties.mweProperties.impl.NaturalLineImpl <em>Natural Line</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.properties.mweProperties.impl.NaturalLineImpl
   * @see org.eclipse.emf.mwe.properties.mweProperties.impl.MwePropertiesPackageImpl#getNaturalLine()
   * @generated
   */
  int NATURAL_LINE = 1;

  /**
   * The number of structural features of the '<em>Natural Line</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NATURAL_LINE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.properties.mweProperties.impl.BlankLineImpl <em>Blank Line</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.properties.mweProperties.impl.BlankLineImpl
   * @see org.eclipse.emf.mwe.properties.mweProperties.impl.MwePropertiesPackageImpl#getBlankLine()
   * @generated
   */
  int BLANK_LINE = 2;

  /**
   * The number of structural features of the '<em>Blank Line</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLANK_LINE_FEATURE_COUNT = NATURAL_LINE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.properties.mweProperties.impl.PropertyCommentImpl <em>Property Comment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.properties.mweProperties.impl.PropertyCommentImpl
   * @see org.eclipse.emf.mwe.properties.mweProperties.impl.MwePropertiesPackageImpl#getPropertyComment()
   * @generated
   */
  int PROPERTY_COMMENT = 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_COMMENT__VALUE = NATURAL_LINE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Property Comment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_COMMENT_FEATURE_COUNT = NATURAL_LINE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.properties.mweProperties.impl.PropertyEntryImpl <em>Property Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.properties.mweProperties.impl.PropertyEntryImpl
   * @see org.eclipse.emf.mwe.properties.mweProperties.impl.MwePropertiesPackageImpl#getPropertyEntry()
   * @generated
   */
  int PROPERTY_ENTRY = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_ENTRY__NAME = NATURAL_LINE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Delimiter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_ENTRY__DELIMITER = NATURAL_LINE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_ENTRY__VALUE = NATURAL_LINE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Property Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_ENTRY_FEATURE_COUNT = NATURAL_LINE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.properties.mweProperties.impl.CompoundStringImpl <em>Compound String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.properties.mweProperties.impl.CompoundStringImpl
   * @see org.eclipse.emf.mwe.properties.mweProperties.impl.MwePropertiesPackageImpl#getCompoundString()
   * @generated
   */
  int COMPOUND_STRING = 5;

  /**
   * The feature id for the '<em><b>Parts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_STRING__PARTS = 0;

  /**
   * The number of structural features of the '<em>Compound String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_STRING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.properties.mweProperties.impl.CompoundStringPartImpl <em>Compound String Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.properties.mweProperties.impl.CompoundStringPartImpl
   * @see org.eclipse.emf.mwe.properties.mweProperties.impl.MwePropertiesPackageImpl#getCompoundStringPart()
   * @generated
   */
  int COMPOUND_STRING_PART = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_STRING_PART__VALUE = 0;

  /**
   * The number of structural features of the '<em>Compound String Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOUND_STRING_PART_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.properties.mweProperties.impl.EmptyPropertyValueImpl <em>Empty Property Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.properties.mweProperties.impl.EmptyPropertyValueImpl
   * @see org.eclipse.emf.mwe.properties.mweProperties.impl.MwePropertiesPackageImpl#getEmptyPropertyValue()
   * @generated
   */
  int EMPTY_PROPERTY_VALUE = 7;

  /**
   * The feature id for the '<em><b>Parts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_PROPERTY_VALUE__PARTS = COMPOUND_STRING__PARTS;

  /**
   * The number of structural features of the '<em>Empty Property Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_PROPERTY_VALUE_FEATURE_COUNT = COMPOUND_STRING_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.properties.mweProperties.PropertyFile <em>Property File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property File</em>'.
   * @see org.eclipse.emf.mwe.properties.mweProperties.PropertyFile
   * @generated
   */
  EClass getPropertyFile();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.mwe.properties.mweProperties.PropertyFile#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see org.eclipse.emf.mwe.properties.mweProperties.PropertyFile#getEntries()
   * @see #getPropertyFile()
   * @generated
   */
  EReference getPropertyFile_Entries();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.properties.mweProperties.NaturalLine <em>Natural Line</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Natural Line</em>'.
   * @see org.eclipse.emf.mwe.properties.mweProperties.NaturalLine
   * @generated
   */
  EClass getNaturalLine();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.properties.mweProperties.BlankLine <em>Blank Line</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Blank Line</em>'.
   * @see org.eclipse.emf.mwe.properties.mweProperties.BlankLine
   * @generated
   */
  EClass getBlankLine();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.properties.mweProperties.PropertyComment <em>Property Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Comment</em>'.
   * @see org.eclipse.emf.mwe.properties.mweProperties.PropertyComment
   * @generated
   */
  EClass getPropertyComment();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.properties.mweProperties.PropertyComment#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.emf.mwe.properties.mweProperties.PropertyComment#getValue()
   * @see #getPropertyComment()
   * @generated
   */
  EAttribute getPropertyComment_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.properties.mweProperties.PropertyEntry <em>Property Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Entry</em>'.
   * @see org.eclipse.emf.mwe.properties.mweProperties.PropertyEntry
   * @generated
   */
  EClass getPropertyEntry();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.properties.mweProperties.PropertyEntry#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.mwe.properties.mweProperties.PropertyEntry#getName()
   * @see #getPropertyEntry()
   * @generated
   */
  EAttribute getPropertyEntry_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.properties.mweProperties.PropertyEntry#getDelimiter <em>Delimiter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Delimiter</em>'.
   * @see org.eclipse.emf.mwe.properties.mweProperties.PropertyEntry#getDelimiter()
   * @see #getPropertyEntry()
   * @generated
   */
  EAttribute getPropertyEntry_Delimiter();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.properties.mweProperties.PropertyEntry#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.eclipse.emf.mwe.properties.mweProperties.PropertyEntry#getValue()
   * @see #getPropertyEntry()
   * @generated
   */
  EReference getPropertyEntry_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.properties.mweProperties.CompoundString <em>Compound String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compound String</em>'.
   * @see org.eclipse.emf.mwe.properties.mweProperties.CompoundString
   * @generated
   */
  EClass getCompoundString();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.mwe.properties.mweProperties.CompoundString#getParts <em>Parts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parts</em>'.
   * @see org.eclipse.emf.mwe.properties.mweProperties.CompoundString#getParts()
   * @see #getCompoundString()
   * @generated
   */
  EReference getCompoundString_Parts();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.properties.mweProperties.CompoundStringPart <em>Compound String Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compound String Part</em>'.
   * @see org.eclipse.emf.mwe.properties.mweProperties.CompoundStringPart
   * @generated
   */
  EClass getCompoundStringPart();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.properties.mweProperties.CompoundStringPart#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.emf.mwe.properties.mweProperties.CompoundStringPart#getValue()
   * @see #getCompoundStringPart()
   * @generated
   */
  EAttribute getCompoundStringPart_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.properties.mweProperties.EmptyPropertyValue <em>Empty Property Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Empty Property Value</em>'.
   * @see org.eclipse.emf.mwe.properties.mweProperties.EmptyPropertyValue
   * @generated
   */
  EClass getEmptyPropertyValue();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MwePropertiesFactory getMwePropertiesFactory();

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
     * The meta object literal for the '{@link org.eclipse.emf.mwe.properties.mweProperties.impl.PropertyFileImpl <em>Property File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.properties.mweProperties.impl.PropertyFileImpl
     * @see org.eclipse.emf.mwe.properties.mweProperties.impl.MwePropertiesPackageImpl#getPropertyFile()
     * @generated
     */
    EClass PROPERTY_FILE = eINSTANCE.getPropertyFile();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_FILE__ENTRIES = eINSTANCE.getPropertyFile_Entries();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.properties.mweProperties.impl.NaturalLineImpl <em>Natural Line</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.properties.mweProperties.impl.NaturalLineImpl
     * @see org.eclipse.emf.mwe.properties.mweProperties.impl.MwePropertiesPackageImpl#getNaturalLine()
     * @generated
     */
    EClass NATURAL_LINE = eINSTANCE.getNaturalLine();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.properties.mweProperties.impl.BlankLineImpl <em>Blank Line</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.properties.mweProperties.impl.BlankLineImpl
     * @see org.eclipse.emf.mwe.properties.mweProperties.impl.MwePropertiesPackageImpl#getBlankLine()
     * @generated
     */
    EClass BLANK_LINE = eINSTANCE.getBlankLine();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.properties.mweProperties.impl.PropertyCommentImpl <em>Property Comment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.properties.mweProperties.impl.PropertyCommentImpl
     * @see org.eclipse.emf.mwe.properties.mweProperties.impl.MwePropertiesPackageImpl#getPropertyComment()
     * @generated
     */
    EClass PROPERTY_COMMENT = eINSTANCE.getPropertyComment();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_COMMENT__VALUE = eINSTANCE.getPropertyComment_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.properties.mweProperties.impl.PropertyEntryImpl <em>Property Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.properties.mweProperties.impl.PropertyEntryImpl
     * @see org.eclipse.emf.mwe.properties.mweProperties.impl.MwePropertiesPackageImpl#getPropertyEntry()
     * @generated
     */
    EClass PROPERTY_ENTRY = eINSTANCE.getPropertyEntry();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_ENTRY__NAME = eINSTANCE.getPropertyEntry_Name();

    /**
     * The meta object literal for the '<em><b>Delimiter</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_ENTRY__DELIMITER = eINSTANCE.getPropertyEntry_Delimiter();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_ENTRY__VALUE = eINSTANCE.getPropertyEntry_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.properties.mweProperties.impl.CompoundStringImpl <em>Compound String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.properties.mweProperties.impl.CompoundStringImpl
     * @see org.eclipse.emf.mwe.properties.mweProperties.impl.MwePropertiesPackageImpl#getCompoundString()
     * @generated
     */
    EClass COMPOUND_STRING = eINSTANCE.getCompoundString();

    /**
     * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOUND_STRING__PARTS = eINSTANCE.getCompoundString_Parts();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.properties.mweProperties.impl.CompoundStringPartImpl <em>Compound String Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.properties.mweProperties.impl.CompoundStringPartImpl
     * @see org.eclipse.emf.mwe.properties.mweProperties.impl.MwePropertiesPackageImpl#getCompoundStringPart()
     * @generated
     */
    EClass COMPOUND_STRING_PART = eINSTANCE.getCompoundStringPart();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPOUND_STRING_PART__VALUE = eINSTANCE.getCompoundStringPart_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.properties.mweProperties.impl.EmptyPropertyValueImpl <em>Empty Property Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.properties.mweProperties.impl.EmptyPropertyValueImpl
     * @see org.eclipse.emf.mwe.properties.mweProperties.impl.MwePropertiesPackageImpl#getEmptyPropertyValue()
     * @generated
     */
    EClass EMPTY_PROPERTY_VALUE = eINSTANCE.getEmptyPropertyValue();

  }

} //MwePropertiesPackage
