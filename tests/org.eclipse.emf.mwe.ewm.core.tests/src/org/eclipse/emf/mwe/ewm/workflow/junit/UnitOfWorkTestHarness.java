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
package org.eclipse.emf.mwe.ewm.workflow.junit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowUnitOfWork;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRuntimeException;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowState;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Unit Of Work Test Harness</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.junit.UnitOfWorkTestHarness#getEndState <em>End State</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.junit.UnitOfWorkTestHarness#getRunningState <em>Running State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.ewm.workflow.junit.JunitPackage#getUnitOfWorkTestHarness()
 * @model kind="class"
 * @generated
 */
public class UnitOfWorkTestHarness extends WorkflowUnitOfWork
{
	/**
	 * The cached value of the '{@link #getEndState() <em>End State</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEndState()
	 * @generated
	 * @ordered
	 */
	protected WorkflowState endState;

	/**
	 * The cached value of the '{@link #getRunningState() <em>Running State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunningState()
	 * @generated
	 * @ordered
	 */
	protected WorkflowState runningState;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitOfWorkTestHarness()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return JunitPackage.Literals.UNIT_OF_WORK_TEST_HARNESS;
	}

	/**
	 * Returns the value of the '<em><b>End State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End State</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End State</em>' reference.
	 * @see #setEndState(WorkflowState)
	 * @see org.eclipse.emf.mwe.ewm.workflow.junit.JunitPackage#getUnitOfWorkTestHarness_EndState()
	 * @model required="true"
	 * @generated
	 */
	public WorkflowState getEndState()
	{
		if (endState != null && endState.eIsProxy())
		{
			InternalEObject oldEndState = (InternalEObject)endState;
			endState = (WorkflowState)eResolveProxy(oldEndState);
			if (endState != oldEndState)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JunitPackage.UNIT_OF_WORK_TEST_HARNESS__END_STATE, oldEndState, endState));
			}
		}
		return endState;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowState basicGetEndState()
	{
		return endState;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.workflow.junit.UnitOfWorkTestHarness#getEndState <em>End State</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>End State</em>' reference.
	 * @see #getEndState()
	 * @generated
	 */
	public void setEndState(WorkflowState newEndState)
	{
		WorkflowState oldEndState = endState;
		endState = newEndState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JunitPackage.UNIT_OF_WORK_TEST_HARNESS__END_STATE, oldEndState, endState));
	}

	/**
	 * Returns the value of the '<em><b>Running State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Running State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running State</em>' reference.
	 * @see #setRunningState(WorkflowState)
	 * @see org.eclipse.emf.mwe.ewm.workflow.junit.JunitPackage#getUnitOfWorkTestHarness_RunningState()
	 * @model required="true"
	 * @generated
	 */
	public WorkflowState getRunningState()
	{
		if (runningState != null && runningState.eIsProxy())
		{
			InternalEObject oldRunningState = (InternalEObject)runningState;
			runningState = (WorkflowState)eResolveProxy(oldRunningState);
			if (runningState != oldRunningState)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JunitPackage.UNIT_OF_WORK_TEST_HARNESS__RUNNING_STATE, oldRunningState, runningState));
			}
		}
		return runningState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowState basicGetRunningState()
	{
		return runningState;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.workflow.junit.UnitOfWorkTestHarness#getRunningState <em>Running State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running State</em>' reference.
	 * @see #getRunningState()
	 * @generated
	 */
	public void setRunningState(WorkflowState newRunningState)
	{
		WorkflowState oldRunningState = runningState;
		runningState = newRunningState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JunitPackage.UNIT_OF_WORK_TEST_HARNESS__RUNNING_STATE, oldRunningState, runningState));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case JunitPackage.UNIT_OF_WORK_TEST_HARNESS__END_STATE:
				if (resolve) return getEndState();
				return basicGetEndState();
			case JunitPackage.UNIT_OF_WORK_TEST_HARNESS__RUNNING_STATE:
				if (resolve) return getRunningState();
				return basicGetRunningState();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case JunitPackage.UNIT_OF_WORK_TEST_HARNESS__END_STATE:
				setEndState((WorkflowState)newValue);
				return;
			case JunitPackage.UNIT_OF_WORK_TEST_HARNESS__RUNNING_STATE:
				setRunningState((WorkflowState)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case JunitPackage.UNIT_OF_WORK_TEST_HARNESS__END_STATE:
				setEndState((WorkflowState)null);
				return;
			case JunitPackage.UNIT_OF_WORK_TEST_HARNESS__RUNNING_STATE:
				setRunningState((WorkflowState)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case JunitPackage.UNIT_OF_WORK_TEST_HARNESS__END_STATE:
				return endState != null;
			case JunitPackage.UNIT_OF_WORK_TEST_HARNESS__RUNNING_STATE:
				return runningState != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public WorkflowState run(WorkflowContext context) throws WorkflowRuntimeException
	{
		setRunningState(context.getStates().get(this));
		
		if(getParameters().size() == 2)
		{
			WorkflowParameter in = getParameters().get(0);
			WorkflowParameter out = getParameters().get(1);
			out.setValue(context, in.getValue(context));
		}
		
		return getEndState();
	}
} // UnitOfWorkTestHarness
