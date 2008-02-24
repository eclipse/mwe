/**
 * <copyright>
 * </copyright>
 *
 * $Id: WorkflowFactoryImpl.java,v 1.4 2008/02/24 23:32:36 pschonbac Exp $
 */
package workflow.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import workflow.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkflowFactoryImpl extends EFactoryImpl implements WorkflowFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static WorkflowFactory init() {
        try {
            WorkflowFactory theWorkflowFactory = (WorkflowFactory)EPackage.Registry.INSTANCE.getEFactory("workflow"); 
            if (theWorkflowFactory != null) {
                return theWorkflowFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new WorkflowFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WorkflowFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case WorkflowPackage.WORKFLOW_FILE: return createWorkflowFile();
            case WorkflowPackage.WORKFLOW_ELEMENT: return createWorkflowElement();
            case WorkflowPackage.SIMPLE_PROPERTY: return createSimpleProperty();
            case WorkflowPackage.FILE_PROPERTY: return createFileProperty();
            case WorkflowPackage.ASSIGNMENT: return createAssignment();
            case WorkflowPackage.SIMPLE_VALUE: return createSimpleValue();
            case WorkflowPackage.OBJECT_VALUE: return createObjectValue();
            case WorkflowPackage.REFERENCED_VALUE: return createReferencedValue();
            case WorkflowPackage.FILE_VALUE: return createFileValue();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WorkflowFile createWorkflowFile() {
        WorkflowFileImpl workflowFile = new WorkflowFileImpl();
        return workflowFile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WorkflowElement createWorkflowElement() {
        WorkflowElementImpl workflowElement = new WorkflowElementImpl();
        return workflowElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SimpleProperty createSimpleProperty() {
        SimplePropertyImpl simpleProperty = new SimplePropertyImpl();
        return simpleProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FileProperty createFileProperty() {
        FilePropertyImpl fileProperty = new FilePropertyImpl();
        return fileProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Assignment createAssignment() {
        AssignmentImpl assignment = new AssignmentImpl();
        return assignment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SimpleValue createSimpleValue() {
        SimpleValueImpl simpleValue = new SimpleValueImpl();
        return simpleValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObjectValue createObjectValue() {
        ObjectValueImpl objectValue = new ObjectValueImpl();
        return objectValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReferencedValue createReferencedValue() {
        ReferencedValueImpl referencedValue = new ReferencedValueImpl();
        return referencedValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FileValue createFileValue() {
        FileValueImpl fileValue = new FileValueImpl();
        return fileValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WorkflowPackage getWorkflowPackage() {
        return (WorkflowPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static WorkflowPackage getPackage() {
        return WorkflowPackage.eINSTANCE;
    }

} //WorkflowFactoryImpl
