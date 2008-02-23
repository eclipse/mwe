/**
 * <copyright>
 * </copyright>
 *
 * $Id: WorkflowAdapterFactory.java,v 1.1 2008/02/23 16:08:24 pschonbac Exp $
 */
package workflow.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import workflow.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see workflow.WorkflowPackage
 * @generated
 */
public class WorkflowAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static WorkflowPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WorkflowAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = WorkflowPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch the delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WorkflowSwitch<Adapter> modelSwitch =
        new WorkflowSwitch<Adapter>() {
            @Override
            public Adapter caseWorkflowFile(WorkflowFile object) {
                return createWorkflowFileAdapter();
            }
            @Override
            public Adapter caseProperty(Property object) {
                return createPropertyAdapter();
            }
            @Override
            public Adapter caseSimpleProperty(SimpleProperty object) {
                return createSimplePropertyAdapter();
            }
            @Override
            public Adapter caseFileProperty(FileProperty object) {
                return createFilePropertyAdapter();
            }
            @Override
            public Adapter caseAssignment(Assignment object) {
                return createAssignmentAdapter();
            }
            @Override
            public Adapter caseAbstractValue(AbstractValue object) {
                return createAbstractValueAdapter();
            }
            @Override
            public Adapter caseComplexValue(ComplexValue object) {
                return createComplexValueAdapter();
            }
            @Override
            public Adapter caseSimpleValue(SimpleValue object) {
                return createSimpleValueAdapter();
            }
            @Override
            public Adapter caseObjectValue(ObjectValue object) {
                return createObjectValueAdapter();
            }
            @Override
            public Adapter caseReferencedValue(ReferencedValue object) {
                return createReferencedValueAdapter();
            }
            @Override
            public Adapter caseFileValue(FileValue object) {
                return createFileValueAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link workflow.WorkflowFile <em>File</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see workflow.WorkflowFile
     * @generated
     */
    public Adapter createWorkflowFileAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link workflow.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see workflow.Property
     * @generated
     */
    public Adapter createPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link workflow.SimpleProperty <em>Simple Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see workflow.SimpleProperty
     * @generated
     */
    public Adapter createSimplePropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link workflow.FileProperty <em>File Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see workflow.FileProperty
     * @generated
     */
    public Adapter createFilePropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link workflow.Assignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see workflow.Assignment
     * @generated
     */
    public Adapter createAssignmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link workflow.AbstractValue <em>Abstract Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see workflow.AbstractValue
     * @generated
     */
    public Adapter createAbstractValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link workflow.ComplexValue <em>Complex Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see workflow.ComplexValue
     * @generated
     */
    public Adapter createComplexValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link workflow.SimpleValue <em>Simple Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see workflow.SimpleValue
     * @generated
     */
    public Adapter createSimpleValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link workflow.ObjectValue <em>Object Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see workflow.ObjectValue
     * @generated
     */
    public Adapter createObjectValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link workflow.ReferencedValue <em>Referenced Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see workflow.ReferencedValue
     * @generated
     */
    public Adapter createReferencedValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link workflow.FileValue <em>File Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see workflow.FileValue
     * @generated
     */
    public Adapter createFileValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //WorkflowAdapterFactory
