/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.mwe.properties.mweProperties.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.mwe.properties.mweProperties.BlankLine;
import org.eclipse.emf.mwe.properties.mweProperties.CompoundString;
import org.eclipse.emf.mwe.properties.mweProperties.CompoundStringPart;
import org.eclipse.emf.mwe.properties.mweProperties.EmptyPropertyValue;
import org.eclipse.emf.mwe.properties.mweProperties.MwePropertiesFactory;
import org.eclipse.emf.mwe.properties.mweProperties.MwePropertiesPackage;
import org.eclipse.emf.mwe.properties.mweProperties.NaturalLine;
import org.eclipse.emf.mwe.properties.mweProperties.PropertyComment;
import org.eclipse.emf.mwe.properties.mweProperties.PropertyEntry;
import org.eclipse.emf.mwe.properties.mweProperties.PropertyFile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MwePropertiesPackageImpl extends EPackageImpl implements MwePropertiesPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass naturalLineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blankLineEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyCommentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compoundStringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compoundStringPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass emptyPropertyValueEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.emf.mwe.properties.mweProperties.MwePropertiesPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MwePropertiesPackageImpl()
  {
    super(eNS_URI, MwePropertiesFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link MwePropertiesPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MwePropertiesPackage init()
  {
    if (isInited) return (MwePropertiesPackage)EPackage.Registry.INSTANCE.getEPackage(MwePropertiesPackage.eNS_URI);

    // Obtain or create and register package
    MwePropertiesPackageImpl theMwePropertiesPackage = (MwePropertiesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MwePropertiesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MwePropertiesPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMwePropertiesPackage.createPackageContents();

    // Initialize created meta-data
    theMwePropertiesPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMwePropertiesPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MwePropertiesPackage.eNS_URI, theMwePropertiesPackage);
    return theMwePropertiesPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyFile()
  {
    return propertyFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyFile_Entries()
  {
    return (EReference)propertyFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNaturalLine()
  {
    return naturalLineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlankLine()
  {
    return blankLineEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyComment()
  {
    return propertyCommentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyComment_Value()
  {
    return (EAttribute)propertyCommentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyEntry()
  {
    return propertyEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyEntry_Name()
  {
    return (EAttribute)propertyEntryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyEntry_Delimiter()
  {
    return (EAttribute)propertyEntryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyEntry_Value()
  {
    return (EReference)propertyEntryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompoundString()
  {
    return compoundStringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompoundString_Parts()
  {
    return (EReference)compoundStringEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompoundStringPart()
  {
    return compoundStringPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCompoundStringPart_Value()
  {
    return (EAttribute)compoundStringPartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEmptyPropertyValue()
  {
    return emptyPropertyValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MwePropertiesFactory getMwePropertiesFactory()
  {
    return (MwePropertiesFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    propertyFileEClass = createEClass(PROPERTY_FILE);
    createEReference(propertyFileEClass, PROPERTY_FILE__ENTRIES);

    naturalLineEClass = createEClass(NATURAL_LINE);

    blankLineEClass = createEClass(BLANK_LINE);

    propertyCommentEClass = createEClass(PROPERTY_COMMENT);
    createEAttribute(propertyCommentEClass, PROPERTY_COMMENT__VALUE);

    propertyEntryEClass = createEClass(PROPERTY_ENTRY);
    createEAttribute(propertyEntryEClass, PROPERTY_ENTRY__NAME);
    createEAttribute(propertyEntryEClass, PROPERTY_ENTRY__DELIMITER);
    createEReference(propertyEntryEClass, PROPERTY_ENTRY__VALUE);

    compoundStringEClass = createEClass(COMPOUND_STRING);
    createEReference(compoundStringEClass, COMPOUND_STRING__PARTS);

    compoundStringPartEClass = createEClass(COMPOUND_STRING_PART);
    createEAttribute(compoundStringPartEClass, COMPOUND_STRING_PART__VALUE);

    emptyPropertyValueEClass = createEClass(EMPTY_PROPERTY_VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    blankLineEClass.getESuperTypes().add(this.getNaturalLine());
    propertyCommentEClass.getESuperTypes().add(this.getNaturalLine());
    propertyEntryEClass.getESuperTypes().add(this.getNaturalLine());
    emptyPropertyValueEClass.getESuperTypes().add(this.getCompoundString());

    // Initialize classes and features; add operations and parameters
    initEClass(propertyFileEClass, PropertyFile.class, "PropertyFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPropertyFile_Entries(), this.getNaturalLine(), null, "entries", null, 0, -1, PropertyFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(naturalLineEClass, NaturalLine.class, "NaturalLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(blankLineEClass, BlankLine.class, "BlankLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(propertyCommentEClass, PropertyComment.class, "PropertyComment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPropertyComment_Value(), ecorePackage.getEString(), "value", null, 0, 1, PropertyComment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyEntryEClass, PropertyEntry.class, "PropertyEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPropertyEntry_Name(), ecorePackage.getEString(), "name", null, 0, 1, PropertyEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyEntry_Delimiter(), ecorePackage.getEString(), "delimiter", null, 0, 1, PropertyEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPropertyEntry_Value(), this.getCompoundString(), null, "value", null, 0, 1, PropertyEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compoundStringEClass, CompoundString.class, "CompoundString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompoundString_Parts(), this.getCompoundStringPart(), null, "parts", null, 0, -1, CompoundString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compoundStringPartEClass, CompoundStringPart.class, "CompoundStringPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCompoundStringPart_Value(), ecorePackage.getEString(), "value", null, 0, 1, CompoundStringPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(emptyPropertyValueEClass, EmptyPropertyValue.class, "EmptyPropertyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //MwePropertiesPackageImpl
