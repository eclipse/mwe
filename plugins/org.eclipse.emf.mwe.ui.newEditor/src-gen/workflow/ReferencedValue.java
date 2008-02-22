/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReferencedValue.java,v 1.1 2008/02/22 16:41:24 pschonbac Exp $
 */
package workflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referenced Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.ReferencedValue#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getReferencedValue()
 * @model
 * @generated
 */
public interface ReferencedValue extends AbstractValue {
    /**
     * Returns the value of the '<em><b>Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ref</em>' attribute.
     * @see #setRef(String)
     * @see workflow.WorkflowPackage#getReferencedValue_Ref()
     * @model
     * @generated
     */
    String getRef();

    /**
     * Sets the value of the '{@link workflow.ReferencedValue#getRef <em>Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ref</em>' attribute.
     * @see #getRef()
     * @generated
     */
    void setRef(String value);

} // ReferencedValue
