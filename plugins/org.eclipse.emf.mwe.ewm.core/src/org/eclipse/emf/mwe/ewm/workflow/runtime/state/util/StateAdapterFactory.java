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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.StatePackage
 * @generated
 */
public class StateAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StatePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateAdapterFactory()
	{
		if (modelPackage == null) {
			modelPackage = StatePackage.eINSTANCE;
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
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateSwitch<Adapter> modelSwitch =
		new StateSwitch<Adapter>() {
			@Override
			public Adapter caseWorkflowState(WorkflowState object) {
				return createWorkflowStateAdapter();
			}
			@Override
			public Adapter caseWorkflowIdleState(WorkflowIdleState object) {
				return createWorkflowIdleStateAdapter();
			}
			@Override
			public Adapter caseWorkflowRunningState(WorkflowRunningState object) {
				return createWorkflowRunningStateAdapter();
			}
			@Override
			public Adapter caseWorkflowDoneState(WorkflowDoneState object) {
				return createWorkflowDoneStateAdapter();
			}
			@Override
			public Adapter caseWorkflowSuccessState(WorkflowSuccessState object) {
				return createWorkflowSuccessStateAdapter();
			}
			@Override
			public Adapter caseWorkflowFailedState(WorkflowFailedState object) {
				return createWorkflowFailedStateAdapter();
			}
			@Override
			public Adapter caseWorkflowErrorState(WorkflowErrorState object) {
				return createWorkflowErrorStateAdapter();
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
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowState <em>Workflow State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowState
	 * @generated
	 */
	public Adapter createWorkflowStateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowIdleState <em>Workflow Idle State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowIdleState
	 * @generated
	 */
	public Adapter createWorkflowIdleStateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowRunningState <em>Workflow Running State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowRunningState
	 * @generated
	 */
	public Adapter createWorkflowRunningStateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowDoneState <em>Workflow Done State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowDoneState
	 * @generated
	 */
	public Adapter createWorkflowDoneStateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowSuccessState <em>Workflow Success State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowSuccessState
	 * @generated
	 */
	public Adapter createWorkflowSuccessStateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowFailedState <em>Workflow Failed State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowFailedState
	 * @generated
	 */
	public Adapter createWorkflowFailedStateAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowErrorState <em>Workflow Error State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowErrorState
	 * @generated
	 */
	public Adapter createWorkflowErrorStateAdapter()
	{
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
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //StateAdapterFactory
