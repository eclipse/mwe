/**
 * <copyright>
 * </copyright>
 *
 * $Id: WorkflowFactory.java,v 1.3 2008/02/22 23:38:59 pschonbac Exp $
 */
package workflow;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see workflow.WorkflowPackage
 * @generated
 */
public interface WorkflowFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    WorkflowFactory eINSTANCE = workflow.impl.WorkflowFactoryImpl.init();

    /**
     * Returns a new object of class '<em>File</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>File</em>'.
     * @generated
     */
    WorkflowFile createWorkflowFile();

    /**
     * Returns a new object of class '<em>Simple Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Simple Property</em>'.
     * @generated
     */
    SimpleProperty createSimpleProperty();

    /**
     * Returns a new object of class '<em>File Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>File Property</em>'.
     * @generated
     */
    FileProperty createFileProperty();

    /**
     * Returns a new object of class '<em>Assignment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Assignment</em>'.
     * @generated
     */
    Assignment createAssignment();

    /**
     * Returns a new object of class '<em>Simple Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Simple Value</em>'.
     * @generated
     */
    SimpleValue createSimpleValue();

    /**
     * Returns a new object of class '<em>Object Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Object Value</em>'.
     * @generated
     */
    ObjectValue createObjectValue();

    /**
     * Returns a new object of class '<em>Referenced Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Referenced Value</em>'.
     * @generated
     */
    ReferencedValue createReferencedValue();

    /**
     * Returns a new object of class '<em>File Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>File Value</em>'.
     * @generated
     */
    FileValue createFileValue();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    WorkflowPackage getWorkflowPackage();

} //WorkflowFactory
