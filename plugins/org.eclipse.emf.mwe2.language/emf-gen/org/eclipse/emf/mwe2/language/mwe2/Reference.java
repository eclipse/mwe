/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.mwe2.language.mwe2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe2.language.mwe2.Reference#getReferable <em>Referable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getReference()
 * @model
 * @generated
 */
public interface Reference extends Value
{
  /**
   * Returns the value of the '<em><b>Referable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referable</em>' reference.
   * @see #setReferable(Referrable)
   * @see org.eclipse.emf.mwe2.language.mwe2.Mwe2Package#getReference_Referable()
   * @model
   * @generated
   */
  Referrable getReferable();

  /**
   * Sets the value of the '{@link org.eclipse.emf.mwe2.language.mwe2.Reference#getReferable <em>Referable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Referable</em>' reference.
   * @see #getReferable()
   * @generated
   */
  void setReferable(Referrable value);

} // Reference
