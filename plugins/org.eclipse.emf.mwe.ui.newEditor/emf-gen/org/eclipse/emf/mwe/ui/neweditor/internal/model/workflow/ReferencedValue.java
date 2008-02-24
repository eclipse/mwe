/**
 * <copyright>
 * </copyright>
 *
 * $Id: ReferencedValue.java,v 1.1 2008/02/24 23:50:26 pschonbac Exp $
 */
package org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referenced Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.ReferencedValue#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.WorkflowPackage#getReferencedValue()
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
     * @see org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.WorkflowPackage#getReferencedValue_Ref()
     * @model required="true"
     * @generated
     */
    String getRef();

    /**
     * Sets the value of the '{@link org.eclipse.emf.mwe.ui.neweditor.internal.model.workflow.ReferencedValue#getRef <em>Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ref</em>' attribute.
     * @see #getRef()
     * @generated
     */
    void setRef(String value);

} // ReferencedValue
