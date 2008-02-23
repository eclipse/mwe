/**
 * <copyright>
 * </copyright>
 *
 * $Id: ComplexValue.java,v 1.2 2008/02/23 22:07:39 pschonbac Exp $
 */
package workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.ComplexValue#getName <em>Name</em>}</li>
 *   <li>{@link workflow.ComplexValue#getAssignment <em>Assignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getComplexValue()
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
     * @see workflow.WorkflowPackage#getComplexValue_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link workflow.ComplexValue#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Assignment</b></em>' containment reference list.
     * The list contents are of type {@link workflow.Assignment}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Assignment</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Assignment</em>' containment reference list.
     * @see workflow.WorkflowPackage#getComplexValue_Assignment()
     * @model containment="true"
     * @generated
     */
    EList<Assignment> getAssignment();

} // ComplexValue
