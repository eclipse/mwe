/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.mwe.di.mwe;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.mwe.di.mwe.MwePackage
 * @generated
 */
public interface MweFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MweFactory eINSTANCE = org.eclipse.emf.mwe.di.mwe.impl.MweFactoryImpl.init();

  /**
   * Returns a new object of class '<em>File</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>File</em>'.
   * @generated
   */
  File createFile();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Java Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Java Import</em>'.
   * @generated
   */
  JavaImport createJavaImport();

  /**
   * Returns a new object of class '<em>Generic Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Generic Import</em>'.
   * @generated
   */
  GenericImport createGenericImport();

  /**
   * Returns a new object of class '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property</em>'.
   * @generated
   */
  Property createProperty();

  /**
   * Returns a new object of class '<em>Local Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Variable</em>'.
   * @generated
   */
  LocalVariable createLocalVariable();

  /**
   * Returns a new object of class '<em>Properties File Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Properties File Import</em>'.
   * @generated
   */
  PropertiesFileImport createPropertiesFileImport();

  /**
   * Returns a new object of class '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value</em>'.
   * @generated
   */
  Value createValue();

  /**
   * Returns a new object of class '<em>Simple Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Simple Value</em>'.
   * @generated
   */
  SimpleValue createSimpleValue();

  /**
   * Returns a new object of class '<em>Assignable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignable</em>'.
   * @generated
   */
  Assignable createAssignable();

  /**
   * Returns a new object of class '<em>Complex Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Complex Value</em>'.
   * @generated
   */
  ComplexValue createComplexValue();

  /**
   * Returns a new object of class '<em>Workflow Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Workflow Ref</em>'.
   * @generated
   */
  WorkflowRef createWorkflowRef();

  /**
   * Returns a new object of class '<em>Id Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Id Ref</em>'.
   * @generated
   */
  IdRef createIdRef();

  /**
   * Returns a new object of class '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignment</em>'.
   * @generated
   */
  Assignment createAssignment();

  /**
   * Returns a new object of class '<em>Qualified Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qualified Name</em>'.
   * @generated
   */
  QualifiedName createQualifiedName();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MwePackage getMwePackage();

} //MweFactory
