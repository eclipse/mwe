/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.mwe2.language.mwe2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.StringLiteral#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getStringLiteral()
 * @model
 * @generated
 */
public interface StringLiteral extends Value
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
   * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getStringLiteral_Value()
   * @model containment="true"
   * @generated
   */
  MWEString getValue();

  /**
   * Sets the value of the '{@link org.eclipse.emf.mwe2.language.mwe2.StringLiteral#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(MWEString value);

} // StringLiteral
