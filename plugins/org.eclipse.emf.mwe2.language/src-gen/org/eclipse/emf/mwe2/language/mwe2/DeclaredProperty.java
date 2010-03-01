/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.mwe2.language.mwe2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declared Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getDeclaredProperty()
 * @model
 * @generated
 */
public interface DeclaredProperty extends Referrable
{
  /**
   * Returns the value of the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default</em>' containment reference.
   * @see #setDefault(Value)
   * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getDeclaredProperty_Default()
   * @model containment="true"
   * @generated
   */
  Value getDefault();

  /**
   * Sets the value of the '{@link org.eclipse.emf.mwe2.language.mwe2.DeclaredProperty#getDefault <em>Default</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' containment reference.
   * @see #getDefault()
   * @generated
   */
  void setDefault(Value value);

} // DeclaredProperty
