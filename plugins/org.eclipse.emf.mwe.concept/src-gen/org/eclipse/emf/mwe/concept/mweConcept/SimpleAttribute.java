/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.mwe.concept.mweConcept;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.concept.mweConcept.SimpleAttribute#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.concept.mweConcept.MweConceptPackage#getSimpleAttribute()
 * @model
 * @generated
 */
public interface SimpleAttribute extends Literal, Attribute
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(MWEString)
   * @see org.eclipse.emf.mwe.concept.mweConcept.MweConceptPackage#getSimpleAttribute_Value()
   * @model containment="true"
   * @generated
   */
  MWEString getValue();

  /**
   * Sets the value of the '{@link org.eclipse.emf.mwe.concept.mweConcept.SimpleAttribute#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(MWEString value);

} // SimpleAttribute
