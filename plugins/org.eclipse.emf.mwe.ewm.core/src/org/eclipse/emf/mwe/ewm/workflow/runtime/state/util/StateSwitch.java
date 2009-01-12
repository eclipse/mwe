/*******************************************************************************
 * Copyright (c) 2008 Bryan Hunt.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bryan Hunt - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.ewm.workflow.runtime.state.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.StatePackage;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowDoneState;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowErrorState;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowFailedState;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowIdleState;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowRunningState;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowState;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowSuccessState;

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
 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.StatePackage
 * @generated
 */
public class StateSwitch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StatePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateSwitch()
	{
		if (modelPackage == null) {
			modelPackage = StatePackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject)
	{
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject)
	{
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
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID) {
			case StatePackage.WORKFLOW_STATE: {
				WorkflowState workflowState = (WorkflowState)theEObject;
				T result = caseWorkflowState(workflowState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatePackage.WORKFLOW_IDLE_STATE: {
				WorkflowIdleState workflowIdleState = (WorkflowIdleState)theEObject;
				T result = caseWorkflowIdleState(workflowIdleState);
				if (result == null) result = caseWorkflowState(workflowIdleState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatePackage.WORKFLOW_RUNNING_STATE: {
				WorkflowRunningState workflowRunningState = (WorkflowRunningState)theEObject;
				T result = caseWorkflowRunningState(workflowRunningState);
				if (result == null) result = caseWorkflowState(workflowRunningState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatePackage.WORKFLOW_DONE_STATE: {
				WorkflowDoneState workflowDoneState = (WorkflowDoneState)theEObject;
				T result = caseWorkflowDoneState(workflowDoneState);
				if (result == null) result = caseWorkflowState(workflowDoneState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatePackage.WORKFLOW_SUCCESS_STATE: {
				WorkflowSuccessState workflowSuccessState = (WorkflowSuccessState)theEObject;
				T result = caseWorkflowSuccessState(workflowSuccessState);
				if (result == null) result = caseWorkflowDoneState(workflowSuccessState);
				if (result == null) result = caseWorkflowState(workflowSuccessState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatePackage.WORKFLOW_FAILED_STATE: {
				WorkflowFailedState workflowFailedState = (WorkflowFailedState)theEObject;
				T result = caseWorkflowFailedState(workflowFailedState);
				if (result == null) result = caseWorkflowDoneState(workflowFailedState);
				if (result == null) result = caseWorkflowState(workflowFailedState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatePackage.WORKFLOW_ERROR_STATE: {
				WorkflowErrorState workflowErrorState = (WorkflowErrorState)theEObject;
				T result = caseWorkflowErrorState(workflowErrorState);
				if (result == null) result = caseWorkflowDoneState(workflowErrorState);
				if (result == null) result = caseWorkflowState(workflowErrorState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowState(WorkflowState object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Idle State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Idle State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowIdleState(WorkflowIdleState object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Running State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Running State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowRunningState(WorkflowRunningState object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Done State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Done State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowDoneState(WorkflowDoneState object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Success State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Success State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowSuccessState(WorkflowSuccessState object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Failed State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Failed State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowFailedState(WorkflowFailedState object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Error State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Error State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowErrorState(WorkflowErrorState object)
	{
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
	public T defaultCase(EObject object)
	{
		return null;
	}

} //StateSwitch
