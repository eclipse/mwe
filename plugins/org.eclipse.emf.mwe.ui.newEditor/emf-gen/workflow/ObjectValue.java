/**
 * <copyright>
 * </copyright>
 *
 * $Id: ObjectValue.java,v 1.2 2008/02/23 22:07:39 pschonbac Exp $
 */
package workflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.ObjectValue#getClazz <em>Clazz</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getObjectValue()
 * @model
 * @generated
 */
public interface ObjectValue extends ComplexValue {
    /**
     * Returns the value of the '<em><b>Clazz</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Clazz</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Clazz</em>' attribute.
     * @see #setClazz(String)
     * @see workflow.WorkflowPackage#getObjectValue_Clazz()
     * @model
     * @generated
     */
    String getClazz();

    /**
     * Sets the value of the '{@link workflow.ObjectValue#getClazz <em>Clazz</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Clazz</em>' attribute.
     * @see #getClazz()
     * @generated
     */
    void setClazz(String value);

} // ObjectValue
