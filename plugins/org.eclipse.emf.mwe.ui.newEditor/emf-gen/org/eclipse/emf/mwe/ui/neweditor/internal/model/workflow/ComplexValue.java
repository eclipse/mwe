/**
 * <copyright>
 * </copyright>
 *
 * $Id: ComplexValue.java,v 1.1 2008/02/24 23:50:26 pschonbac Exp $
 */
package org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.ComplexValue#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.ComplexValue#getAssignment <em>Assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.WorkflowPackage#getComplexValue()
 * @model abstract="true"
 * @generated
 */
public interface ComplexValue extends AbstractValue {
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
     * @see org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.WorkflowPackage#getComplexValue_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.ComplexValue#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Assignment</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.Assignment}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Assignment</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Assignment</em>' containment reference list.
     * @see org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.WorkflowPackage#getComplexValue_Assignment()
     * @model containment="true" required="true"
     * @generated
     */
    EList<Assignment> getAssignment();

} // ComplexValue
