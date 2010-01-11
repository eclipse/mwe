/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.mwe.concept.mweConcept;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.mwe.properties.mweProperties.MwePropertiesPackage;

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
 * @see org.eclipse.emf.mwe.concept.mweConcept.MweConceptFactory
 * @model kind="package"
 * @generated
 */
public interface MweConceptPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mweConcept";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/xtext/common/mwe/MWEConcept";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "mweConcept";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MweConceptPackage eINSTANCE = org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.MWEFileImpl <em>MWE File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MWEFileImpl
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getMWEFile()
   * @generated
   */
  int MWE_FILE = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MWE_FILE__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Root</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MWE_FILE__ROOT = 1;

  /**
   * The number of structural features of the '<em>MWE File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MWE_FILE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.ImportImpl
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.ConfigurationElementImpl <em>Configuration Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.ConfigurationElementImpl
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getConfigurationElement()
   * @generated
   */
  int CONFIGURATION_ELEMENT = 4;

  /**
   * The number of structural features of the '<em>Configuration Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.SettingImpl <em>Setting</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.SettingImpl
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getSetting()
   * @generated
   */
  int SETTING = 2;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETTING__FEATURE = CONFIGURATION_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETTING__VALUE = CONFIGURATION_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Setting</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETTING_FEATURE_COUNT = CONFIGURATION_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.LiteralImpl
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 5;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.ComponentImpl
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__TYPE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>File Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__FILE_REF = LITERAL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__NAME = LITERAL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__ELEMENTS = LITERAL_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.PropertyImpl
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = CONFIGURATION_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Delimiter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__DELIMITER = CONFIGURATION_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__VALUE = CONFIGURATION_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = CONFIGURATION_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.PropertyFileImpl <em>Property File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.PropertyFileImpl
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getPropertyFile()
   * @generated
   */
  int PROPERTY_FILE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FILE__NAME = PROPERTY__NAME;

  /**
   * The feature id for the '<em><b>Delimiter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FILE__DELIMITER = PROPERTY__DELIMITER;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FILE__VALUE = PROPERTY__VALUE;

  /**
   * The feature id for the '<em><b>File Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FILE__FILE_REF = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Property File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FILE_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.AttributeImpl
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 8;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.SimpleAttributeImpl <em>Simple Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.SimpleAttributeImpl
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getSimpleAttribute()
   * @generated
   */
  int SIMPLE_ATTRIBUTE = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_ATTRIBUTE__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Simple Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_ATTRIBUTE_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.ReferenceImpl
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 10;

  /**
   * The feature id for the '<em><b>Component</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__COMPONENT = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.MWEStringImpl <em>MWE String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MWEStringImpl
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getMWEString()
   * @generated
   */
  int MWE_STRING = 11;

  /**
   * The feature id for the '<em><b>Parts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MWE_STRING__PARTS = MwePropertiesPackage.COMPOUND_STRING__PARTS;

  /**
   * The feature id for the '<em><b>Begin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MWE_STRING__BEGIN = MwePropertiesPackage.COMPOUND_STRING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MWE_STRING__END = MwePropertiesPackage.COMPOUND_STRING_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>MWE String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MWE_STRING_FEATURE_COUNT = MwePropertiesPackage.COMPOUND_STRING_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.MWEStringPartImpl <em>MWE String Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MWEStringPartImpl
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getMWEStringPart()
   * @generated
   */
  int MWE_STRING_PART = 12;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MWE_STRING_PART__VALUE = MwePropertiesPackage.COMPOUND_STRING_PART__VALUE;

  /**
   * The number of structural features of the '<em>MWE String Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MWE_STRING_PART_FEATURE_COUNT = MwePropertiesPackage.COMPOUND_STRING_PART_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.ReplaceableStringImpl <em>Replaceable String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.ReplaceableStringImpl
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getReplaceableString()
   * @generated
   */
  int REPLACEABLE_STRING = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPLACEABLE_STRING__VALUE = MWE_STRING_PART__VALUE;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPLACEABLE_STRING__PROPERTY = MWE_STRING_PART_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Replaceable String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPLACEABLE_STRING_FEATURE_COUNT = MWE_STRING_PART_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.PropertyReferenceImpl <em>Property Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.PropertyReferenceImpl
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getPropertyReference()
   * @generated
   */
  int PROPERTY_REFERENCE = 14;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_REFERENCE__PROPERTY = 0;

  /**
   * The number of structural features of the '<em>Property Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_REFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.PlainStringImpl <em>Plain String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.PlainStringImpl
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getPlainString()
   * @generated
   */
  int PLAIN_STRING = 15;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAIN_STRING__VALUE = MWE_STRING_PART__VALUE;

  /**
   * The number of structural features of the '<em>Plain String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLAIN_STRING_FEATURE_COUNT = MWE_STRING_PART_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.FileRefImpl <em>File Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.FileRefImpl
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getFileRef()
   * @generated
   */
  int FILE_REF = 16;

  /**
   * The feature id for the '<em><b>File Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_REF__FILE_PATH = 0;

  /**
   * The number of structural features of the '<em>File Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_REF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.AttributeListImpl <em>Attribute List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.AttributeListImpl
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getAttributeList()
   * @generated
   */
  int ATTRIBUTE_LIST = 17;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_LIST__CONTENT = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Attribute List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_LIST_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.BooleanStringPartImpl <em>Boolean String Part</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.BooleanStringPartImpl
   * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getBooleanStringPart()
   * @generated
   */
  int BOOLEAN_STRING_PART = 18;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_STRING_PART__VALUE = MWE_STRING_PART__VALUE;

  /**
   * The number of structural features of the '<em>Boolean String Part</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_STRING_PART_FEATURE_COUNT = MWE_STRING_PART_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.concept.mweConcept.MWEFile <em>MWE File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MWE File</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.MWEFile
   * @generated
   */
  EClass getMWEFile();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.mwe.concept.mweConcept.MWEFile#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.MWEFile#getImports()
   * @see #getMWEFile()
   * @generated
   */
  EReference getMWEFile_Imports();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.concept.mweConcept.MWEFile#getRoot <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Root</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.MWEFile#getRoot()
   * @see #getMWEFile()
   * @generated
   */
  EReference getMWEFile_Root();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.concept.mweConcept.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.concept.mweConcept.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.concept.mweConcept.Setting <em>Setting</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Setting</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.Setting
   * @generated
   */
  EClass getSetting();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.emf.mwe.concept.mweConcept.Setting#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.Setting#getFeature()
   * @see #getSetting()
   * @generated
   */
  EReference getSetting_Feature();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.concept.mweConcept.Setting#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.Setting#getValue()
   * @see #getSetting()
   * @generated
   */
  EReference getSetting_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.concept.mweConcept.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.emf.mwe.concept.mweConcept.Component#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.Component#getType()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.concept.mweConcept.Component#getFileRef <em>File Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>File Ref</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.Component#getFileRef()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_FileRef();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.concept.mweConcept.Component#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.Component#getName()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.mwe.concept.mweConcept.Component#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.Component#getElements()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Elements();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.concept.mweConcept.ConfigurationElement <em>Configuration Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Configuration Element</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.ConfigurationElement
   * @generated
   */
  EClass getConfigurationElement();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.concept.mweConcept.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.concept.mweConcept.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.concept.mweConcept.PropertyFile <em>Property File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property File</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.PropertyFile
   * @generated
   */
  EClass getPropertyFile();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.concept.mweConcept.PropertyFile#getFileRef <em>File Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>File Ref</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.PropertyFile#getFileRef()
   * @see #getPropertyFile()
   * @generated
   */
  EReference getPropertyFile_FileRef();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.concept.mweConcept.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.concept.mweConcept.SimpleAttribute <em>Simple Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Attribute</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.SimpleAttribute
   * @generated
   */
  EClass getSimpleAttribute();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.concept.mweConcept.SimpleAttribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.SimpleAttribute#getValue()
   * @see #getSimpleAttribute()
   * @generated
   */
  EReference getSimpleAttribute_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.concept.mweConcept.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.emf.mwe.concept.mweConcept.Reference#getComponent <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Component</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.Reference#getComponent()
   * @see #getReference()
   * @generated
   */
  EReference getReference_Component();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.concept.mweConcept.MWEString <em>MWE String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MWE String</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.MWEString
   * @generated
   */
  EClass getMWEString();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.concept.mweConcept.MWEString#getBegin <em>Begin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Begin</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.MWEString#getBegin()
   * @see #getMWEString()
   * @generated
   */
  EAttribute getMWEString_Begin();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.mwe.concept.mweConcept.MWEString#getEnd <em>End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.MWEString#getEnd()
   * @see #getMWEString()
   * @generated
   */
  EAttribute getMWEString_End();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.concept.mweConcept.MWEStringPart <em>MWE String Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MWE String Part</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.MWEStringPart
   * @generated
   */
  EClass getMWEStringPart();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.concept.mweConcept.ReplaceableString <em>Replaceable String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Replaceable String</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.ReplaceableString
   * @generated
   */
  EClass getReplaceableString();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.concept.mweConcept.ReplaceableString#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Property</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.ReplaceableString#getProperty()
   * @see #getReplaceableString()
   * @generated
   */
  EReference getReplaceableString_Property();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.concept.mweConcept.PropertyReference <em>Property Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Reference</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.PropertyReference
   * @generated
   */
  EClass getPropertyReference();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.emf.mwe.concept.mweConcept.PropertyReference#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Property</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.PropertyReference#getProperty()
   * @see #getPropertyReference()
   * @generated
   */
  EReference getPropertyReference_Property();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.concept.mweConcept.PlainString <em>Plain String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plain String</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.PlainString
   * @generated
   */
  EClass getPlainString();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.concept.mweConcept.FileRef <em>File Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File Ref</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.FileRef
   * @generated
   */
  EClass getFileRef();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.mwe.concept.mweConcept.FileRef#getFilePath <em>File Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>File Path</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.FileRef#getFilePath()
   * @see #getFileRef()
   * @generated
   */
  EReference getFileRef_FilePath();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.concept.mweConcept.AttributeList <em>Attribute List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute List</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.AttributeList
   * @generated
   */
  EClass getAttributeList();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.mwe.concept.mweConcept.AttributeList#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Content</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.AttributeList#getContent()
   * @see #getAttributeList()
   * @generated
   */
  EReference getAttributeList_Content();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.mwe.concept.mweConcept.BooleanStringPart <em>Boolean String Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean String Part</em>'.
   * @see org.eclipse.emf.mwe.concept.mweConcept.BooleanStringPart
   * @generated
   */
  EClass getBooleanStringPart();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MweConceptFactory getMweConceptFactory();

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
     * The meta object literal for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.MWEFileImpl <em>MWE File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MWEFileImpl
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getMWEFile()
     * @generated
     */
    EClass MWE_FILE = eINSTANCE.getMWEFile();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MWE_FILE__IMPORTS = eINSTANCE.getMWEFile_Imports();

    /**
     * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MWE_FILE__ROOT = eINSTANCE.getMWEFile_Root();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.ImportImpl
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.SettingImpl <em>Setting</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.SettingImpl
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getSetting()
     * @generated
     */
    EClass SETTING = eINSTANCE.getSetting();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SETTING__FEATURE = eINSTANCE.getSetting_Feature();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SETTING__VALUE = eINSTANCE.getSetting_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.ComponentImpl
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getComponent()
     * @generated
     */
    EClass COMPONENT = eINSTANCE.getComponent();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__TYPE = eINSTANCE.getComponent_Type();

    /**
     * The meta object literal for the '<em><b>File Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__FILE_REF = eINSTANCE.getComponent_FileRef();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__ELEMENTS = eINSTANCE.getComponent_Elements();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.ConfigurationElementImpl <em>Configuration Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.ConfigurationElementImpl
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getConfigurationElement()
     * @generated
     */
    EClass CONFIGURATION_ELEMENT = eINSTANCE.getConfigurationElement();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.LiteralImpl
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.PropertyImpl
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.PropertyFileImpl <em>Property File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.PropertyFileImpl
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getPropertyFile()
     * @generated
     */
    EClass PROPERTY_FILE = eINSTANCE.getPropertyFile();

    /**
     * The meta object literal for the '<em><b>File Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_FILE__FILE_REF = eINSTANCE.getPropertyFile_FileRef();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.AttributeImpl
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.SimpleAttributeImpl <em>Simple Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.SimpleAttributeImpl
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getSimpleAttribute()
     * @generated
     */
    EClass SIMPLE_ATTRIBUTE = eINSTANCE.getSimpleAttribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_ATTRIBUTE__VALUE = eINSTANCE.getSimpleAttribute_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.ReferenceImpl
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

    /**
     * The meta object literal for the '<em><b>Component</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__COMPONENT = eINSTANCE.getReference_Component();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.MWEStringImpl <em>MWE String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MWEStringImpl
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getMWEString()
     * @generated
     */
    EClass MWE_STRING = eINSTANCE.getMWEString();

    /**
     * The meta object literal for the '<em><b>Begin</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MWE_STRING__BEGIN = eINSTANCE.getMWEString_Begin();

    /**
     * The meta object literal for the '<em><b>End</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MWE_STRING__END = eINSTANCE.getMWEString_End();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.MWEStringPartImpl <em>MWE String Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MWEStringPartImpl
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getMWEStringPart()
     * @generated
     */
    EClass MWE_STRING_PART = eINSTANCE.getMWEStringPart();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.ReplaceableStringImpl <em>Replaceable String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.ReplaceableStringImpl
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getReplaceableString()
     * @generated
     */
    EClass REPLACEABLE_STRING = eINSTANCE.getReplaceableString();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPLACEABLE_STRING__PROPERTY = eINSTANCE.getReplaceableString_Property();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.PropertyReferenceImpl <em>Property Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.PropertyReferenceImpl
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getPropertyReference()
     * @generated
     */
    EClass PROPERTY_REFERENCE = eINSTANCE.getPropertyReference();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_REFERENCE__PROPERTY = eINSTANCE.getPropertyReference_Property();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.PlainStringImpl <em>Plain String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.PlainStringImpl
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getPlainString()
     * @generated
     */
    EClass PLAIN_STRING = eINSTANCE.getPlainString();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.FileRefImpl <em>File Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.FileRefImpl
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getFileRef()
     * @generated
     */
    EClass FILE_REF = eINSTANCE.getFileRef();

    /**
     * The meta object literal for the '<em><b>File Path</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FILE_REF__FILE_PATH = eINSTANCE.getFileRef_FilePath();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.AttributeListImpl <em>Attribute List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.AttributeListImpl
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getAttributeList()
     * @generated
     */
    EClass ATTRIBUTE_LIST = eINSTANCE.getAttributeList();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_LIST__CONTENT = eINSTANCE.getAttributeList_Content();

    /**
     * The meta object literal for the '{@link org.eclipse.emf.mwe.concept.mweConcept.impl.BooleanStringPartImpl <em>Boolean String Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.BooleanStringPartImpl
     * @see org.eclipse.emf.mwe.concept.mweConcept.impl.MweConceptPackageImpl#getBooleanStringPart()
     * @generated
     */
    EClass BOOLEAN_STRING_PART = eINSTANCE.getBooleanStringPart();

  }

} //MweConceptPackage
