/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleProperty.java,v 1.1 2008/02/22 16:41:24 pschonbac Exp $
 */
package workflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.SimpleProperty#getName <em>Name</em>}</li>
 *   <li>{@link workflow.SimpleProperty#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getSimpleProperty()
 * @model
 * @generated
 */
public interface SimpleProperty extends Property {
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
     * @see workflow.WorkflowPackage#getSimpleProperty_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link workflow.SimpleProperty#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(String)
     * @see workflow.WorkflowPackage#getSimpleProperty_Value()
     * @model
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link workflow.SimpleProperty#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(String value);

} // SimpleProperty
