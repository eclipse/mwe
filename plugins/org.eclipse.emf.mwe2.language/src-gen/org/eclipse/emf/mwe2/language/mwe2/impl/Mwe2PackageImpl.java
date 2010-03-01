/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.mwe2.language.mwe2.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.mwe2.language.mwe2.Assignment;
import org.eclipse.emf.mwe2.language.mwe2.BooleanLiteral;
import org.eclipse.emf.mwe2.language.mwe2.Component;
import org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty;
import org.eclipse.emf.mwe2.language.mwe2.Import;
import org.eclipse.emf.mwe2.language.mwe2.MWEString;
import org.eclipse.emf.mwe2.language.mwe2.MWEStringPart;
import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.emf.mwe2.language.mwe2.Mwe2Factory;
import org.eclipse.emf.mwe2.language.mwe2.Mwe2Package;
import org.eclipse.emf.mwe2.language.mwe2.PlainString;
import org.eclipse.emf.mwe2.language.mwe2.Reference;
import org.eclipse.emf.mwe2.language.mwe2.Referrable;
import org.eclipse.emf.mwe2.language.mwe2.ReplaceableString;
import org.eclipse.emf.mwe2.language.mwe2.StringLiteral;
import org.eclipse.emf.mwe2.language.mwe2.Value;

import org.eclipse.xtext.common.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Mwe2PackageImpl extends EPackageImpl implements Mwe2Package
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referrableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declaredPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mweStringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mweStringPartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass replaceableStringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass plainStringEClass = null;

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
   * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#eNS_URI
   * @see #init()
   * @generated
   */
  private Mwe2PackageImpl()
  {
    super(eNS_URI, Mwe2Factory.eINSTANCE);
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
   * <p>This method is used to initialize {@link Mwe2Package#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static Mwe2Package init()
  {
    if (isInited) return (Mwe2Package)EPackage.Registry.INSTANCE.getEPackage(Mwe2Package.eNS_URI);

    // Obtain or create and register package
    Mwe2PackageImpl theMwe2Package = (Mwe2PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Mwe2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Mwe2PackageImpl());

    isInited = true;

    // Initialize simple dependencies
    TypesPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theMwe2Package.createPackageContents();

    // Initialize created meta-data
    theMwe2Package.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMwe2Package.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(Mwe2Package.eNS_URI, theMwe2Package);
    return theMwe2Package;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModule()
  {
    return moduleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModule_CanonicalName()
  {
    return (EAttribute)moduleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_Imports()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_DeclaredProperties()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_Root()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferrable()
  {
    return referrableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferrable_Type()
  {
    return (EReference)referrableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReferrable_Name()
  {
    return (EAttribute)referrableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeclaredProperty()
  {
    return declaredPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclaredProperty_Default()
  {
    return (EReference)declaredPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponent()
  {
    return componentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponent_Module()
  {
    return (EReference)componentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComponent_AutoInject()
  {
    return (EAttribute)componentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponent_Assignment()
  {
    return (EReference)componentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_ImportedNamespace()
  {
    return (EAttribute)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignment()
  {
    return assignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignment_Feature()
  {
    return (EReference)assignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignment_Value()
  {
    return (EReference)assignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValue()
  {
    return valueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringLiteral()
  {
    return stringLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStringLiteral_Value()
  {
    return (EReference)stringLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanLiteral()
  {
    return booleanLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanLiteral_IsTrue()
  {
    return (EAttribute)booleanLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReference()
  {
    return referenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReference_Referable()
  {
    return (EReference)referenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMWEString()
  {
    return mweStringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMWEString_Begin()
  {
    return (EAttribute)mweStringEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMWEString_Parts()
  {
    return (EReference)mweStringEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMWEString_End()
  {
    return (EAttribute)mweStringEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMWEStringPart()
  {
    return mweStringPartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReplaceableString()
  {
    return replaceableStringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReplaceableString_Property()
  {
    return (EReference)replaceableStringEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlainString()
  {
    return plainStringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPlainString_Value()
  {
    return (EAttribute)plainStringEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mwe2Factory getMwe2Factory()
  {
    return (Mwe2Factory)getEFactoryInstance();
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
    moduleEClass = createEClass(MODULE);
    createEAttribute(moduleEClass, MODULE__CANONICAL_NAME);
    createEReference(moduleEClass, MODULE__IMPORTS);
    createEReference(moduleEClass, MODULE__DECLARED_PROPERTIES);
    createEReference(moduleEClass, MODULE__ROOT);

    referrableEClass = createEClass(REFERRABLE);
    createEReference(referrableEClass, REFERRABLE__TYPE);
    createEAttribute(referrableEClass, REFERRABLE__NAME);

    declaredPropertyEClass = createEClass(DECLARED_PROPERTY);
    createEReference(declaredPropertyEClass, DECLARED_PROPERTY__DEFAULT);

    componentEClass = createEClass(COMPONENT);
    createEReference(componentEClass, COMPONENT__MODULE);
    createEAttribute(componentEClass, COMPONENT__AUTO_INJECT);
    createEReference(componentEClass, COMPONENT__ASSIGNMENT);

    importEClass = createEClass(IMPORT);
    createEAttribute(importEClass, IMPORT__IMPORTED_NAMESPACE);

    assignmentEClass = createEClass(ASSIGNMENT);
    createEReference(assignmentEClass, ASSIGNMENT__FEATURE);
    createEReference(assignmentEClass, ASSIGNMENT__VALUE);

    valueEClass = createEClass(VALUE);

    stringLiteralEClass = createEClass(STRING_LITERAL);
    createEReference(stringLiteralEClass, STRING_LITERAL__VALUE);

    booleanLiteralEClass = createEClass(BOOLEAN_LITERAL);
    createEAttribute(booleanLiteralEClass, BOOLEAN_LITERAL__IS_TRUE);

    referenceEClass = createEClass(REFERENCE);
    createEReference(referenceEClass, REFERENCE__REFERABLE);

    mweStringEClass = createEClass(MWE_STRING);
    createEAttribute(mweStringEClass, MWE_STRING__BEGIN);
    createEReference(mweStringEClass, MWE_STRING__PARTS);
    createEAttribute(mweStringEClass, MWE_STRING__END);

    mweStringPartEClass = createEClass(MWE_STRING_PART);

    replaceableStringEClass = createEClass(REPLACEABLE_STRING);
    createEReference(replaceableStringEClass, REPLACEABLE_STRING__PROPERTY);

    plainStringEClass = createEClass(PLAIN_STRING);
    createEAttribute(plainStringEClass, PLAIN_STRING__VALUE);
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

    // Obtain other dependent packages
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    declaredPropertyEClass.getESuperTypes().add(this.getReferrable());
    componentEClass.getESuperTypes().add(this.getReferrable());
    componentEClass.getESuperTypes().add(this.getValue());
    stringLiteralEClass.getESuperTypes().add(this.getValue());
    booleanLiteralEClass.getESuperTypes().add(this.getValue());
    referenceEClass.getESuperTypes().add(this.getValue());
    replaceableStringEClass.getESuperTypes().add(this.getMWEStringPart());
    plainStringEClass.getESuperTypes().add(this.getMWEStringPart());

    // Initialize classes and features; add operations and parameters
    initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModule_CanonicalName(), ecorePackage.getEString(), "canonicalName", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_Imports(), this.getImport(), null, "imports", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_DeclaredProperties(), this.getDeclaredProperty(), null, "declaredProperties", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_Root(), this.getComponent(), null, "root", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referrableEClass, Referrable.class, "Referrable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReferrable_Type(), theTypesPackage.getType(), null, "type", null, 0, 1, Referrable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReferrable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Referrable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declaredPropertyEClass, DeclaredProperty.class, "DeclaredProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeclaredProperty_Default(), this.getValue(), null, "default", null, 0, 1, DeclaredProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComponent_Module(), this.getModule(), null, "module", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComponent_AutoInject(), ecorePackage.getEBoolean(), "autoInject", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_Assignment(), this.getAssignment(), null, "assignment", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssignment_Feature(), theTypesPackage.getOperation(), null, "feature", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssignment_Value(), this.getValue(), null, "value", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStringLiteral_Value(), this.getMWEString(), null, "value", null, 0, 1, StringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanLiteralEClass, BooleanLiteral.class, "BooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanLiteral_IsTrue(), ecorePackage.getEBoolean(), "isTrue", null, 0, 1, BooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReference_Referable(), this.getReferrable(), null, "referable", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mweStringEClass, MWEString.class, "MWEString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMWEString_Begin(), ecorePackage.getEString(), "begin", null, 0, 1, MWEString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMWEString_Parts(), this.getMWEStringPart(), null, "parts", null, 0, -1, MWEString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMWEString_End(), ecorePackage.getEString(), "end", null, 0, 1, MWEString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mweStringPartEClass, MWEStringPart.class, "MWEStringPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(replaceableStringEClass, ReplaceableString.class, "ReplaceableString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReplaceableString_Property(), this.getValue(), null, "property", null, 0, 1, ReplaceableString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(plainStringEClass, PlainString.class, "PlainString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPlainString_Value(), ecorePackage.getEString(), "value", null, 0, 1, PlainString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //Mwe2PackageImpl
