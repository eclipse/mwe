/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleValue.java,v 1.2 2008/02/23 22:07:39 pschonbac Exp $
 */
package workflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.SimpleValue#getVal <em>Val</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getSimpleValue()
 * @model
 * @generated
 */
public interface SimpleValue extends AbstractValue {
    /**
     * Returns the value of the '<em><b>Val</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Val</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Val</em>' attribute.
     * @see #setVal(String)
     * @see workflow.WorkflowPackage#getSimpleValue_Val()
     * @model
     * @generated
     */
    String getVal();

    /**
     * Sets the value of the '{@link workflow.SimpleValue#getVal <em>Val</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Val</em>' attribute.
     * @see #getVal()
     * @generated
     */
    void setVal(String value);

} // SimpleValue
