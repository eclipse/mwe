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
package org.eclipse.emf.mwe.ewm.workflow.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowComponentProxy;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowCompositeComponent;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterConnection;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterSimpleValueStrategy;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterValueStrategy;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowUnitOfWork;

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
 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage
 * @generated
 */
public class WorkflowSwitch<T>
{
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
	public WorkflowSwitch()
	{
		if (modelPackage == null)
		{
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
			case WorkflowPackage.WORKFLOW_COMPONENT:
			{
				WorkflowComponent workflowComponent = (WorkflowComponent)theEObject;
				T result = caseWorkflowComponent(workflowComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT:
			{
				WorkflowCompositeComponent workflowCompositeComponent = (WorkflowCompositeComponent)theEObject;
				T result = caseWorkflowCompositeComponent(workflowCompositeComponent);
				if (result == null) result = caseWorkflowComponent(workflowCompositeComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.WORKFLOW_UNIT_OF_WORK:
			{
				WorkflowUnitOfWork workflowUnitOfWork = (WorkflowUnitOfWork)theEObject;
				T result = caseWorkflowUnitOfWork(workflowUnitOfWork);
				if (result == null) result = caseWorkflowComponent(workflowUnitOfWork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.WORKFLOW_PARAMETER:
			{
				WorkflowParameter workflowParameter = (WorkflowParameter)theEObject;
				T result = caseWorkflowParameter(workflowParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.WORKFLOW_PARAMETER_VALUE_STRATEGY:
			{
				WorkflowParameterValueStrategy workflowParameterValueStrategy = (WorkflowParameterValueStrategy)theEObject;
				T result = caseWorkflowParameterValueStrategy(workflowParameterValueStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.WORKFLOW_PARAMETER_CONNECTION:
			{
				WorkflowParameterConnection workflowParameterConnection = (WorkflowParameterConnection)theEObject;
				T result = caseWorkflowParameterConnection(workflowParameterConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.WORKFLOW_PARAMETER_SIMPLE_VALUE_STRATEGY:
			{
				WorkflowParameterSimpleValueStrategy workflowParameterSimpleValueStrategy = (WorkflowParameterSimpleValueStrategy)theEObject;
				T result = caseWorkflowParameterSimpleValueStrategy(workflowParameterSimpleValueStrategy);
				if (result == null) result = caseWorkflowParameterValueStrategy(workflowParameterSimpleValueStrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WorkflowPackage.WORKFLOW_COMPONENT_PROXY:
			{
				WorkflowComponentProxy workflowComponentProxy = (WorkflowComponentProxy)theEObject;
				T result = caseWorkflowComponentProxy(workflowComponentProxy);
				if (result == null) result = caseWorkflowComponent(workflowComponentProxy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowComponent(WorkflowComponent object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowCompositeComponent(WorkflowCompositeComponent object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Of Work</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Of Work</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowUnitOfWork(WorkflowUnitOfWork object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowParameter(WorkflowParameter object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Value Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Value Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowParameterValueStrategy(WorkflowParameterValueStrategy object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowParameterConnection(WorkflowParameterConnection object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Simple Value Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Simple Value Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowParameterSimpleValueStrategy(WorkflowParameterSimpleValueStrategy object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Proxy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Proxy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowComponentProxy(WorkflowComponentProxy object)
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

} //WorkflowSwitch
