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
import org.eclipse.emf.common.notify.NotificationChain;
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
	 * The cached value of the '{@link #getEndState() <em>End State</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEndState()
	 * @generated
	 * @ordered
	 */
	protected WorkflowState endState;

	/**
	 * The cached value of the '{@link #getRunningState() <em>Running State</em>}' containment reference.
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
	 * Returns the value of the '<em><b>End State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End State</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End State</em>' containment reference.
	 * @see #setEndState(WorkflowState)
	 * @see org.eclipse.emf.mwe.ewm.workflow.junit.JunitPackage#getUnitOfWorkTestHarness_EndState()
	 * @model containment="true" required="true"
	 * @generated
	 */
	public WorkflowState getEndState()
	{
		return endState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndState(WorkflowState newEndState, NotificationChain msgs)
	{
		WorkflowState oldEndState = endState;
		endState = newEndState;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JunitPackage.UNIT_OF_WORK_TEST_HARNESS__END_STATE, oldEndState, newEndState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.workflow.junit.UnitOfWorkTestHarness#getEndState <em>End State</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>End State</em>' containment reference.
	 * @see #getEndState()
	 * @generated
	 */
	public void setEndState(WorkflowState newEndState)
	{
		if (newEndState != endState)
		{
			NotificationChain msgs = null;
			if (endState != null)
				msgs = ((InternalEObject)endState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JunitPackage.UNIT_OF_WORK_TEST_HARNESS__END_STATE, null, msgs);
			if (newEndState != null)
				msgs = ((InternalEObject)newEndState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JunitPackage.UNIT_OF_WORK_TEST_HARNESS__END_STATE, null, msgs);
			msgs = basicSetEndState(newEndState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JunitPackage.UNIT_OF_WORK_TEST_HARNESS__END_STATE, newEndState, newEndState));
	}

	/**
	 * Returns the value of the '<em><b>Running State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Running State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running State</em>' containment reference.
	 * @see #setRunningState(WorkflowState)
	 * @see org.eclipse.emf.mwe.ewm.workflow.junit.JunitPackage#getUnitOfWorkTestHarness_RunningState()
	 * @model containment="true" required="true"
	 * @generated
	 */
	public WorkflowState getRunningState()
	{
		return runningState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRunningState(WorkflowState newRunningState, NotificationChain msgs)
	{
		WorkflowState oldRunningState = runningState;
		runningState = newRunningState;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JunitPackage.UNIT_OF_WORK_TEST_HARNESS__RUNNING_STATE, oldRunningState, newRunningState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.workflow.junit.UnitOfWorkTestHarness#getRunningState <em>Running State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running State</em>' containment reference.
	 * @see #getRunningState()
	 * @generated
	 */
	public void setRunningState(WorkflowState newRunningState)
	{
		if (newRunningState != runningState)
		{
			NotificationChain msgs = null;
			if (runningState != null)
				msgs = ((InternalEObject)runningState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JunitPackage.UNIT_OF_WORK_TEST_HARNESS__RUNNING_STATE, null, msgs);
			if (newRunningState != null)
				msgs = ((InternalEObject)newRunningState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JunitPackage.UNIT_OF_WORK_TEST_HARNESS__RUNNING_STATE, null, msgs);
			msgs = basicSetRunningState(newRunningState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JunitPackage.UNIT_OF_WORK_TEST_HARNESS__RUNNING_STATE, newRunningState, newRunningState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case JunitPackage.UNIT_OF_WORK_TEST_HARNESS__END_STATE:
				return basicSetEndState(null, msgs);
			case JunitPackage.UNIT_OF_WORK_TEST_HARNESS__RUNNING_STATE:
				return basicSetRunningState(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
				return getEndState();
			case JunitPackage.UNIT_OF_WORK_TEST_HARNESS__RUNNING_STATE:
				return getRunningState();
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
