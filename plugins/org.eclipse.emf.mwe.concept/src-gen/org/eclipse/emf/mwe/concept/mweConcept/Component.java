/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.emf.mwe.concept.mweConcept;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.common.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.concept.mweConcept.Component#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.concept.mweConcept.Component#getFileRef <em>File Ref</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.concept.mweConcept.Component#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.concept.mweConcept.Component#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.concept.mweConcept.MweConceptPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends Literal
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Type)
   * @see org.eclipse.emf.mwe.concept.mweConcept.MweConceptPackage#getComponent_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link org.eclipse.emf.mwe.concept.mweConcept.Component#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

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
   * @see org.eclipse.emf.mwe.concept.mweConcept.MweConceptPackage#getComponent_FileRef()
   * @model containment="true"
   * @generated
   */
  FileRef getFileRef();

  /**
   * Sets the value of the '{@link org.eclipse.emf.mwe.concept.mweConcept.Component#getFileRef <em>File Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File Ref</em>' containment reference.
   * @see #getFileRef()
   * @generated
   */
  void setFileRef(FileRef value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.emf.mwe.concept.mweConcept.MweConceptPackage#getComponent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.mwe.concept.mweConcept.Component#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.mwe.concept.mweConcept.ConfigurationElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.eclipse.emf.mwe.concept.mweConcept.MweConceptPackage#getComponent_Elements()
   * @model containment="true"
   * @generated
   */
  EList<ConfigurationElement> getElements();

} // Component
