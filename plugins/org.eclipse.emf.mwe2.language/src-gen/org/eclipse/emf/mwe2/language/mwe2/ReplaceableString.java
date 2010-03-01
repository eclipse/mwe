/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.mwe2.language.mwe2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Replaceable String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.ReplaceableString#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getReplaceableString()
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
   * @see #setProperty(Value)
   * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getReplaceableString_Property()
   * @model containment="true"
   * @generated
   */
  Value getProperty();

  /**
   * Sets the value of the '{@link org.eclipse.emf.mwe2.language.mwe2.ReplaceableString#getProperty <em>Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' containment reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(Value value);

} // ReplaceableString
