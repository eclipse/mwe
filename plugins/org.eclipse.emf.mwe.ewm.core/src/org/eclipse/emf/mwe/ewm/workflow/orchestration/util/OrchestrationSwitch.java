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
package org.eclipse.emf.mwe.ewm.workflow.orchestration.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowComponentOrchestrationStrategy;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowCompositeOrchestrationStrategy;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowExecutionPredicate;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopComponentOrchestrationStrategy;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowLoopCountPredicate;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowParameterPredicate;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowPredicateAND;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowPredicateOR;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowRerunPredicate;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowSerialOrchestrationStrategy;

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
 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage
 * @generated
 */
public class OrchestrationSwitch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OrchestrationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrchestrationSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = OrchestrationPackage.eINSTANCE;
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
		if (theEClass.eContainer() == modelPackage)
		{
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else
		{
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
		switch (classifierID)
		{
			case OrchestrationPackage.WORKFLOW_SERIAL_ORCHESTRATION_STRATEGY:
			{
				WorkflowSerialOrchestrationStrategy workflowSerialOrchestrationStrategy = (WorkflowSerialOrchestrationStrategy)theEObject;
				T result = caseWorkflowSerialOrchestrationStrategy(workflowSerialOrchestrationStrategy);
				if (result == null) result = caseWorkflowCompositeOrchestrationStrategy(workflowSerialOrchestrationStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestrationPackage.WORKFLOW_COMPOSITE_ORCHESTRATION_STRATEGY:
			{
				WorkflowCompositeOrchestrationStrategy workflowCompositeOrchestrationStrategy = (WorkflowCompositeOrchestrationStrategy)theEObject;
				T result = caseWorkflowCompositeOrchestrationStrategy(workflowCompositeOrchestrationStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestrationPackage.WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY:
			{
				WorkflowComponentOrchestrationStrategy workflowComponentOrchestrationStrategy = (WorkflowComponentOrchestrationStrategy)theEObject;
				T result = caseWorkflowComponentOrchestrationStrategy(workflowComponentOrchestrationStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestrationPackage.WORKFLOW_LOOP_COMPONENT_ORCHESTRATION_STRATEGY:
			{
				WorkflowLoopComponentOrchestrationStrategy workflowLoopComponentOrchestrationStrategy = (WorkflowLoopComponentOrchestrationStrategy)theEObject;
				T result = caseWorkflowLoopComponentOrchestrationStrategy(workflowLoopComponentOrchestrationStrategy);
				if (result == null) result = caseWorkflowComponentOrchestrationStrategy(workflowLoopComponentOrchestrationStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestrationPackage.WORKFLOW_EXECUTION_PREDICATE:
			{
				WorkflowExecutionPredicate workflowExecutionPredicate = (WorkflowExecutionPredicate)theEObject;
				T result = caseWorkflowExecutionPredicate(workflowExecutionPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestrationPackage.WORKFLOW_RERUN_PREDICATE:
			{
				WorkflowRerunPredicate workflowRerunPredicate = (WorkflowRerunPredicate)theEObject;
				T result = caseWorkflowRerunPredicate(workflowRerunPredicate);
				if (result == null) result = caseWorkflowExecutionPredicate(workflowRerunPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestrationPackage.WORKFLOW_PARAMETER_PREDICATE:
			{
				WorkflowParameterPredicate workflowParameterPredicate = (WorkflowParameterPredicate)theEObject;
				T result = caseWorkflowParameterPredicate(workflowParameterPredicate);
				if (result == null) result = caseWorkflowExecutionPredicate(workflowParameterPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestrationPackage.WORKFLOW_PREDICATE_OR:
			{
				WorkflowPredicateOR workflowPredicateOR = (WorkflowPredicateOR)theEObject;
				T result = caseWorkflowPredicateOR(workflowPredicateOR);
				if (result == null) result = caseWorkflowExecutionPredicate(workflowPredicateOR);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestrationPackage.WORKFLOW_PREDICATE_AND:
			{
				WorkflowPredicateAND workflowPredicateAND = (WorkflowPredicateAND)theEObject;
				T result = caseWorkflowPredicateAND(workflowPredicateAND);
				if (result == null) result = caseWorkflowExecutionPredicate(workflowPredicateAND);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OrchestrationPackage.WORKFLOW_LOOP_COUNT_PREDICATE:
			{
				WorkflowLoopCountPredicate workflowLoopCountPredicate = (WorkflowLoopCountPredicate)theEObject;
				T result = caseWorkflowLoopCountPredicate(workflowLoopCountPredicate);
				if (result == null) result = caseWorkflowExecutionPredicate(workflowLoopCountPredicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Serial Orchestration Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Serial Orchestration Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowSerialOrchestrationStrategy(WorkflowSerialOrchestrationStrategy object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Composite Orchestration Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Composite Orchestration Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowCompositeOrchestrationStrategy(WorkflowCompositeOrchestrationStrategy object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Component Orchestration Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Component Orchestration Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowComponentOrchestrationStrategy(WorkflowComponentOrchestrationStrategy object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Loop Component Orchestration Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Loop Component Orchestration Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowLoopComponentOrchestrationStrategy(WorkflowLoopComponentOrchestrationStrategy object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Execution Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Execution Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowExecutionPredicate(WorkflowExecutionPredicate object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Rerun Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Rerun Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowRerunPredicate(WorkflowRerunPredicate object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Parameter Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Parameter Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowParameterPredicate(WorkflowParameterPredicate object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Predicate OR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Predicate OR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowPredicateOR(WorkflowPredicateOR object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Predicate AND</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Predicate AND</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowPredicateAND(WorkflowPredicateAND object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Loop Count Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Loop Count Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowLoopCountPredicate(WorkflowLoopCountPredicate object)
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

} //OrchestrationSwitch
