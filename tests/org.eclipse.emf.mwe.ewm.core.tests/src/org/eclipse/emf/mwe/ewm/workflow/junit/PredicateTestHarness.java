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
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowExecutionPredicate;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicate Test Harness</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.junit.PredicateTestHarness#isExecutionAllowed <em>Execution Allowed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.ewm.workflow.junit.JunitPackage#getPredicateTestHarness()
 * @model kind="class"
 * @generated
 */
public class PredicateTestHarness extends WorkflowExecutionPredicate
{
	/**
	 * The default value of the '{@link #isExecutionAllowed() <em>Execution Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExecutionAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXECUTION_ALLOWED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isExecutionAllowed() <em>Execution Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExecutionAllowed()
	 * @generated
	 * @ordered
	 */
	protected boolean executionAllowed = EXECUTION_ALLOWED_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredicateTestHarness()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return JunitPackage.Literals.PREDICATE_TEST_HARNESS;
	}

	/**
	 * Returns the value of the '<em><b>Execution Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Allowed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Allowed</em>' attribute.
	 * @see #setExecutionAllowed(boolean)
	 * @see org.eclipse.emf.mwe.ewm.workflow.junit.JunitPackage#getPredicateTestHarness_ExecutionAllowed()
	 * @model required="true"
	 * @generated
	 */
	public boolean isExecutionAllowed()
	{
		return executionAllowed;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.workflow.junit.PredicateTestHarness#isExecutionAllowed <em>Execution Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Allowed</em>' attribute.
	 * @see #isExecutionAllowed()
	 * @generated
	 */
	public void setExecutionAllowed(boolean newExecutionAllowed)
	{
		boolean oldExecutionAllowed = executionAllowed;
		executionAllowed = newExecutionAllowed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JunitPackage.PREDICATE_TEST_HARNESS__EXECUTION_ALLOWED, oldExecutionAllowed, executionAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case JunitPackage.PREDICATE_TEST_HARNESS__EXECUTION_ALLOWED:
				return isExecutionAllowed();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case JunitPackage.PREDICATE_TEST_HARNESS__EXECUTION_ALLOWED:
				setExecutionAllowed((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case JunitPackage.PREDICATE_TEST_HARNESS__EXECUTION_ALLOWED:
				setExecutionAllowed(EXECUTION_ALLOWED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case JunitPackage.PREDICATE_TEST_HARNESS__EXECUTION_ALLOWED:
				return executionAllowed != EXECUTION_ALLOWED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (executionAllowed: ");
		result.append(executionAllowed);
		result.append(')');
		return result.toString();
	}

	@Override
	public boolean evaluate(WorkflowComponent component, WorkflowContext context)
	{
		return isExecutionAllowed();
	}

} // PredicateTestHarness
