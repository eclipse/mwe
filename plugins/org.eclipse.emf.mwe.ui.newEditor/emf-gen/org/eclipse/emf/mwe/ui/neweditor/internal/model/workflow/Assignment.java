/**
 * <copyright>
 * </copyright>
 *
 * $Id: Assignment.java,v 1.1 2008/02/24 23:50:26 pschonbac Exp $
 */
package org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.Assignment#getToAssignTo <em>To Assign To</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.Assignment#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.WorkflowPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends WorkflowElement {
    /**
     * Returns the value of the '<em><b>To Assign To</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>To Assign To</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>To Assign To</em>' attribute.
     * @see #setToAssignTo(String)
     * @see org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.WorkflowPackage#getAssignment_ToAssignTo()
     * @model required="true"
     * @generated
     */
    String getToAssignTo();

    /**
     * Sets the value of the '{@link org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.Assignment#getToAssignTo <em>To Assign To</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>To Assign To</em>' attribute.
     * @see #getToAssignTo()
     * @generated
     */
    void setToAssignTo(String value);

    /**
     * Returns the value of the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' containment reference.
     * @see #setValue(AbstractValue)
     * @see org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.WorkflowPackage#getAssignment_Value()
     * @model containment="true" required="true"
     * @generated
     */
    AbstractValue getValue();

    /**
     * Sets the value of the '{@link org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.Assignment#getValue <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' containment reference.
     * @see #getValue()
     * @generated
     */
    void setValue(AbstractValue value);

} // Assignment
