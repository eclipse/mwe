/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.mwe2.language.mwe2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MWE String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.MWEString#getBegin <em>Begin</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.MWEString#getParts <em>Parts</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.MWEString#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getMWEString()
 * @model
 * @generated
 */
public interface MWEString extends EObject
{
  /**
   * Returns the value of the '<em><b>Begin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Begin</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Begin</em>' attribute.
   * @see #setBegin(String)
   * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getMWEString_Begin()
   * @model
   * @generated
   */
  String getBegin();

  /**
   * Sets the value of the '{@link org.eclipse.emf.mwe2.language.mwe2.MWEString#getBegin <em>Begin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Begin</em>' attribute.
   * @see #getBegin()
   * @generated
   */
  void setBegin(String value);

  /**
   * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.mwe2.language.mwe2.MWEStringPart}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parts</em>' containment reference list.
   * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getMWEString_Parts()
   * @model containment="true"
   * @generated
   */
  EList<MWEStringPart> getParts();

  /**
   * Returns the value of the '<em><b>End</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End</em>' attribute.
   * @see #setEnd(String)
   * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getMWEString_End()
   * @model
   * @generated
   */
  String getEnd();

  /**
   * Sets the value of the '{@link org.eclipse.emf.mwe2.language.mwe2.MWEString#getEnd <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' attribute.
   * @see #getEnd()
   * @generated
   */
  void setEnd(String value);

} // MWEString
