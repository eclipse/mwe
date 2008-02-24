/**
 * <copyright>
 * </copyright>
 *
 * $Id: FileProperty.java,v 1.1 2008/02/24 23:50:26 pschonbac Exp $
 */
package org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.FileProperty#getFile <em>File</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.WorkflowPackage#getFileProperty()
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
     * @see org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.WorkflowPackage#getFileProperty_File()
     * @model required="true"
     * @generated
     */
    String getFile();

    /**
     * Sets the value of the '{@link org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.FileProperty#getFile <em>File</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>File</em>' attribute.
     * @see #getFile()
     * @generated
     */
    void setFile(String value);

} // FileProperty
