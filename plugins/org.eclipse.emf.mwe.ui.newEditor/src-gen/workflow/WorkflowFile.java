/**
 * <copyright>
 * </copyright>
 *
 * $Id: WorkflowFile.java,v 1.1 2008/02/22 16:41:24 pschonbac Exp $
 */
package workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.WorkflowFile#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link workflow.WorkflowFile#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getWorkflowFile()
 * @model
 * @generated
 */
public interface WorkflowFile extends EObject {
    /**
     * Returns the value of the '<em><b>Assignment</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Assignment</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Assignment</em>' containment reference.
     * @see #setAssignment(Assignment)
     * @see workflow.WorkflowPackage#getWorkflowFile_Assignment()
     * @model containment="true"
     * @generated
     */
    Assignment getAssignment();

    /**
     * Sets the value of the '{@link workflow.WorkflowFile#getAssignment <em>Assignment</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Assignment</em>' containment reference.
     * @see #getAssignment()
     * @generated
     */
    void setAssignment(Assignment value);

    /**
     * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
     * The list contents are of type {@link workflow.Property}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' containment reference list.
     * @see workflow.WorkflowPackage#getWorkflowFile_Properties()
     * @model containment="true"
     * @generated
     */
    EList<Property> getProperties();

} // WorkflowFile
