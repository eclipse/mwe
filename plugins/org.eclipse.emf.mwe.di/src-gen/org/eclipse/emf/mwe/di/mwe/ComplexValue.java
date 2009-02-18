/**
 * <copyright>
 * </copyright>
 *
 * $Id: ComplexValue.java,v 1.1 2009/02/18 19:38:21 sefftinge Exp $
 */
package org.eclipse.emf.mwe.di.mwe;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.di.mwe.ComplexValue#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.di.mwe.ComplexValue#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.di.mwe.ComplexValue#isFooBar <em>Foo Bar</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.di.mwe.ComplexValue#getAssignments <em>Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.di.mwe.MwePackage#getComplexValue()
 * @model
 * @generated
 */
public interface ComplexValue extends Value, Assignable
{
  /**
   * Returns the value of the '<em><b>Class Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Name</em>' containment reference.
   * @see #setClassName(QualifiedName)
   * @see org.eclipse.emf.mwe.di.mwe.MwePackage#getComplexValue_ClassName()
   * @model containment="true"
   * @generated
   */
  QualifiedName getClassName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.mwe.di.mwe.ComplexValue#getClassName <em>Class Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Name</em>' containment reference.
   * @see #getClassName()
   * @generated
   */
  void setClassName(QualifiedName value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.eclipse.emf.mwe.di.mwe.MwePackage#getComplexValue_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.eclipse.emf.mwe.di.mwe.ComplexValue#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Foo Bar</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Foo Bar</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Foo Bar</em>' attribute.
   * @see #setFooBar(boolean)
   * @see org.eclipse.emf.mwe.di.mwe.MwePackage#getComplexValue_FooBar()
   * @model
   * @generated
   */
  boolean isFooBar();

  /**
   * Sets the value of the '{@link org.eclipse.emf.mwe.di.mwe.ComplexValue#isFooBar <em>Foo Bar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Foo Bar</em>' attribute.
   * @see #isFooBar()
   * @generated
   */
  void setFooBar(boolean value);

  /**
   * Returns the value of the '<em><b>Assignments</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.mwe.di.mwe.Assignment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignments</em>' containment reference list.
   * @see org.eclipse.emf.mwe.di.mwe.MwePackage#getComplexValue_Assignments()
   * @model containment="true"
   * @generated
   */
  EList<Assignment> getAssignments();

} // ComplexValue
