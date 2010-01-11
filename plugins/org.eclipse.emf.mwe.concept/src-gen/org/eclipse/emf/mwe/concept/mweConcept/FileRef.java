/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.mwe.concept.mweConcept;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.concept.mweConcept.FileRef#getFilePath <em>File Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.concept.mweConcept.MweConceptPackage#getFileRef()
 * @model
 * @generated
 */
public interface FileRef extends EObject
{
  /**
   * Returns the value of the '<em><b>File Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>File Path</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>File Path</em>' containment reference.
   * @see #setFilePath(MWEString)
   * @see org.eclipse.emf.mwe.concept.mweConcept.MweConceptPackage#getFileRef_FilePath()
   * @model containment="true"
   * @generated
   */
  MWEString getFilePath();

  /**
   * Sets the value of the '{@link org.eclipse.emf.mwe.concept.mweConcept.FileRef#getFilePath <em>File Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File Path</em>' containment reference.
   * @see #getFilePath()
   * @generated
   */
  void setFilePath(MWEString value);

} // FileRef
