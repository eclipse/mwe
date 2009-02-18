/**
 * <copyright>
 * </copyright>
 *
 * $Id: WorkflowRef.java,v 1.1 2009/02/18 19:38:20 sefftinge Exp $
 */
package org.eclipse.emf.mwe.di.mwe;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.di.mwe.WorkflowRef#getUri <em>Uri</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.di.mwe.WorkflowRef#getAssignments <em>Assignments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.di.mwe.MwePackage#getWorkflowRef()
 * @model
 * @generated
 */
public interface WorkflowRef extends Value, Assignable
{
  /**
   * Returns the value of the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uri</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uri</em>' attribute.
   * @see #setUri(String)
   * @see org.eclipse.emf.mwe.di.mwe.MwePackage#getWorkflowRef_Uri()
   * @model
   * @generated
   */
  String getUri();

  /**
   * Sets the value of the '{@link org.eclipse.emf.mwe.di.mwe.WorkflowRef#getUri <em>Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uri</em>' attribute.
   * @see #getUri()
   * @generated
   */
  void setUri(String value);

  /**
   * Returns the value of the '<em><b>Assignments</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.mwe.di.mwe.Assignment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignments</em>' containment reference list.
   * @see org.eclipse.emf.mwe.di.mwe.MwePackage#getWorkflowRef_Assignments()
   * @model containment="true"
   * @generated
   */
  EList<Assignment> getAssignments();

} // WorkflowRef
