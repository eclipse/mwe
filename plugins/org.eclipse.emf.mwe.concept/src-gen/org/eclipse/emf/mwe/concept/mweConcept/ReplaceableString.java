/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.mwe.concept.mweConcept;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Replaceable String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.concept.mweConcept.ReplaceableString#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.concept.mweConcept.MweConceptPackage#getReplaceableString()
 * @model
 * @generated
 */
public interface ReplaceableString extends MWEStringPart
{
  /**
   * Returns the value of the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' containment reference.
   * @see #setProperty(PropertyReference)
   * @see org.eclipse.emf.mwe.concept.mweConcept.MweConceptPackage#getReplaceableString_Property()
   * @model containment="true"
   * @generated
   */
  PropertyReference getProperty();

  /**
   * Sets the value of the '{@link org.eclipse.emf.mwe.concept.mweConcept.ReplaceableString#getProperty <em>Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' containment reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(PropertyReference value);

} // ReplaceableString
