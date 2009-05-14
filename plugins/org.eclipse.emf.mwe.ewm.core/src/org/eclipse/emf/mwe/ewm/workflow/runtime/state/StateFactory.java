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
package org.eclipse.emf.mwe.ewm.workflow.runtime.state;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.StatePackage
 * @generated
 */
public class StateFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StateFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StateFactory init()
	{
		try
		{
			StateFactory theStateFactory = (StateFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/mwe/ewm/workflow/runtime/state"); 
			if (theStateFactory != null)
			{
				return theStateFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StateFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateFactory()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case StatePackage.WORKFLOW_IDLE_STATE: return createWorkflowIdleState();
			case StatePackage.WORKFLOW_RUNNING_STATE: return createWorkflowRunningState();
			case StatePackage.WORKFLOW_SKIPPED_STATE: return createWorkflowSkippedState();
			case StatePackage.WORKFLOW_DONE_STATE: return createWorkflowDoneState();
			case StatePackage.WORKFLOW_SUCCESS_STATE: return createWorkflowSuccessState();
			case StatePackage.WORKFLOW_FAILED_STATE: return createWorkflowFailedState();
			case StatePackage.WORKFLOW_ERROR_STATE: return createWorkflowErrorState();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowIdleState createWorkflowIdleState()
	{
		WorkflowIdleState workflowIdleState = new WorkflowIdleState();
		return workflowIdleState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowRunningState createWorkflowRunningState()
	{
		WorkflowRunningState workflowRunningState = new WorkflowRunningState();
		return workflowRunningState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowSkippedState createWorkflowSkippedState()
	{
		WorkflowSkippedState workflowSkippedState = new WorkflowSkippedState();
		return workflowSkippedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowDoneState createWorkflowDoneState()
	{
		WorkflowDoneState workflowDoneState = new WorkflowDoneState();
		return workflowDoneState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowSuccessState createWorkflowSuccessState()
	{
		WorkflowSuccessState workflowSuccessState = new WorkflowSuccessState();
		return workflowSuccessState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowFailedState createWorkflowFailedState()
	{
		WorkflowFailedState workflowFailedState = new WorkflowFailedState();
		return workflowFailedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowErrorState createWorkflowErrorState()
	{
		WorkflowErrorState workflowErrorState = new WorkflowErrorState();
		return workflowErrorState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatePackage getStatePackage()
	{
		return (StatePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StatePackage getPackage()
	{
		return StatePackage.eINSTANCE;
	}

} //StateFactory
