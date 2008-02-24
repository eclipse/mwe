/**
 * <copyright>
 * </copyright>
 *
 * $Id: FileProperty.java,v 1.4 2008/02/24 23:32:35 pschonbac Exp $
 */
package workflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.FileProperty#getFile <em>File</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getFileProperty()
 * @model
 * @generated
 */
public interface FileProperty extends Property {
    /**
     * Returns the value of the '<em><b>File</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>File</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>File</em>' attribute.
     * @see #setFile(String)
     * @see workflow.WorkflowPackage#getFileProperty_File()
     * @model required="true"
     * @generated
     */
    String getFile();

    /**
     * Sets the value of the '{@link workflow.FileProperty#getFile <em>File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>File</em>' attribute.
     * @see #getFile()
     * @generated
     */
    void setFile(String value);

} // FileProperty
