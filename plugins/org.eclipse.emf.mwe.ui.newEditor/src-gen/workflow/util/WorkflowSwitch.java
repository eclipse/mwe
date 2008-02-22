/**
 * <copyright>
 * </copyright>
 *
 * $Id: WorkflowSwitch.java,v 1.3 2008/02/22 23:39:00 pschonbac Exp $
 */
package workflow.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import workflow.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see workflow.WorkflowPackage
 * @generated
 */
public class WorkflowSwitch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static WorkflowPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WorkflowSwitch() {
        if (modelPackage == null) {
            modelPackage = WorkflowPackage.eINSTANCE;
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    public T doSwitch(EObject theEObject) {
        return doSwitch(theEObject.eClass(), theEObject);
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(EClass theEClass, EObject theEObject) {
        if (theEClass.eContainer() == modelPackage) {
            return doSwitch(theEClass.getClassifierID(), theEObject);
        }
        else {
            List<EClass> eSuperTypes = theEClass.getESuperTypes();
            return
                eSuperTypes.isEmpty() ?
                    defaultCase(theEObject) :
                    doSwitch(eSuperTypes.get(0), theEObject);
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case WorkflowPackage.WORKFLOW_FILE: {
                WorkflowFile workflowFile = (WorkflowFile)theEObject;
                T result = caseWorkflowFile(workflowFile);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WorkflowPackage.PROPERTY: {
                Property property = (Property)theEObject;
                T result = caseProperty(property);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WorkflowPackage.SIMPLE_PROPERTY: {
                SimpleProperty simpleProperty = (SimpleProperty)theEObject;
                T result = caseSimpleProperty(simpleProperty);
                if (result == null) result = caseProperty(simpleProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WorkflowPackage.FILE_PROPERTY: {
                FileProperty fileProperty = (FileProperty)theEObject;
                T result = caseFileProperty(fileProperty);
                if (result == null) result = caseProperty(fileProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WorkflowPackage.ASSIGNMENT: {
                Assignment assignment = (Assignment)theEObject;
                T result = caseAssignment(assignment);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WorkflowPackage.ABSTRACT_VALUE: {
                AbstractValue abstractValue = (AbstractValue)theEObject;
                T result = caseAbstractValue(abstractValue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WorkflowPackage.COMPLEX_VALUE: {
                ComplexValue complexValue = (ComplexValue)theEObject;
                T result = caseComplexValue(complexValue);
                if (result == null) result = caseAbstractValue(complexValue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WorkflowPackage.SIMPLE_VALUE: {
                SimpleValue simpleValue = (SimpleValue)theEObject;
                T result = caseSimpleValue(simpleValue);
                if (result == null) result = caseAbstractValue(simpleValue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WorkflowPackage.OBJECT_VALUE: {
                ObjectValue objectValue = (ObjectValue)theEObject;
                T result = caseObjectValue(objectValue);
                if (result == null) result = caseComplexValue(objectValue);
                if (result == null) result = caseAbstractValue(objectValue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WorkflowPackage.REFERENCED_VALUE: {
                ReferencedValue referencedValue = (ReferencedValue)theEObject;
                T result = caseReferencedValue(referencedValue);
                if (result == null) result = caseAbstractValue(referencedValue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WorkflowPackage.FILE_VALUE: {
                FileValue fileValue = (FileValue)theEObject;
                T result = caseFileValue(fileValue);
                if (result == null) result = caseComplexValue(fileValue);
                if (result == null) result = caseAbstractValue(fileValue);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>File</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>File</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWorkflowFile(WorkflowFile object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProperty(Property object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Simple Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Simple Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSimpleProperty(SimpleProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>File Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>File Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFileProperty(FileProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAssignment(Assignment object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Abstract Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Abstract Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAbstractValue(AbstractValue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Complex Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Complex Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseComplexValue(ComplexValue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Simple Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Simple Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSimpleValue(SimpleValue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Object Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Object Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseObjectValue(ObjectValue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Referenced Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Referenced Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReferencedValue(ReferencedValue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>File Value</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>File Value</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFileValue(FileValue object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    public T defaultCase(EObject object) {
        return null;
    }

} //WorkflowSwitch
