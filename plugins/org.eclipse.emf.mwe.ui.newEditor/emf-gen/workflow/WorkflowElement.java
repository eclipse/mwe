/**
 * <copyright>
 * </copyright>
 *
 * $Id: WorkflowElement.java,v 1.1 2008/02/23 22:07:39 pschonbac Exp $
 */
package workflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.WorkflowElement#getOffset <em>Offset</em>}</li>
 *   <li>{@link workflow.WorkflowElement#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getWorkflowElement()
 * @model
 * @generated
 */
public interface WorkflowElement extends EObject {
    /**
     * Returns the value of the '<em><b>Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Offset</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Offset</em>' attribute.
     * @see #setOffset(int)
     * @see workflow.WorkflowPackage#getWorkflowElement_Offset()
     * @model
     * @generated
     */
    int getOffset();

    /**
     * Sets the value of the '{@link workflow.WorkflowElement#getOffset <em>Offset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Offset</em>' attribute.
     * @see #getOffset()
     * @generated
     */
    void setOffset(int value);

    /**
     * Returns the value of the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Length</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Length</em>' attribute.
     * @see #setLength(int)
     * @see workflow.WorkflowPackage#getWorkflowElement_Length()
     * @model
     * @generated
     */
    int getLength();

    /**
     * Sets the value of the '{@link workflow.WorkflowElement#getLength <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Length</em>' attribute.
     * @see #getLength()
     * @generated
     */
    void setLength(int value);

} // WorkflowElement
