/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.mwe.concept.mweConcept;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.concept.mweConcept.PropertyFile#getFileRef <em>File Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.concept.mweConcept.MweConceptPackage#getPropertyFile()
 * @model
 * @generated
 */
public interface PropertyFile extends Property
{
  /**
   * Returns the value of the '<em><b>File Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>File Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>File Ref</em>' containment reference.
   * @see #setFileRef(FileRef)
   * @see org.eclipse.emf.mwe.concept.mweConcept.MweConceptPackage#getPropertyFile_FileRef()
   * @model containment="true"
   * @generated
   */
  FileRef getFileRef();

  /**
   * Sets the value of the '{@link org.eclipse.emf.mwe.concept.mweConcept.PropertyFile#getFileRef <em>File Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File Ref</em>' containment reference.
   * @see #getFileRef()
   * @generated
   */
  void setFileRef(FileRef value);

} // PropertyFile
