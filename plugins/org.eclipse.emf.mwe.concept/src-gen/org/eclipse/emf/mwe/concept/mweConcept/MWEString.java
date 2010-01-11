/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.mwe.concept.mweConcept;

import org.eclipse.emf.mwe.properties.mweProperties.CompoundString;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MWE String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.concept.mweConcept.MWEString#getBegin <em>Begin</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.concept.mweConcept.MWEString#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.concept.mweConcept.MweConceptPackage#getMWEString()
 * @model
 * @generated
 */
public interface MWEString extends CompoundString
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
   * @see org.eclipse.emf.mwe.concept.mweConcept.MweConceptPackage#getMWEString_Begin()
   * @model
   * @generated
   */
  String getBegin();

  /**
   * Sets the value of the '{@link org.eclipse.emf.mwe.concept.mweConcept.MWEString#getBegin <em>Begin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Begin</em>' attribute.
   * @see #getBegin()
   * @generated
   */
  void setBegin(String value);

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
   * @see org.eclipse.emf.mwe.concept.mweConcept.MweConceptPackage#getMWEString_End()
   * @model
   * @generated
   */
  String getEnd();

  /**
   * Sets the value of the '{@link org.eclipse.emf.mwe.concept.mweConcept.MWEString#getEnd <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End</em>' attribute.
   * @see #getEnd()
   * @generated
   */
  void setEnd(String value);

} // MWEString
