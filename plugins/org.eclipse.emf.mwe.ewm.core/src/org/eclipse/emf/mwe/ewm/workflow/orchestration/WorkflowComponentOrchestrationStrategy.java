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
package org.eclipse.emf.mwe.ewm.workflow.orchestration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRuntimeException;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.StateFactory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Component Orchestration Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowComponentOrchestrationStrategy#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowComponentOrchestrationStrategy#getChildStrategy <em>Child Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowComponentOrchestrationStrategy()
 * @model kind="class"
 * @generated
 */
public class WorkflowComponentOrchestrationStrategy extends EObjectImpl implements EObject
{
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected WorkflowExecutionPredicate condition;

	/**
	 * The cached value of the '{@link #getChildStrategy() <em>Child Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildStrategy()
	 * @generated
	 * @ordered
	 */
	protected WorkflowComponentOrchestrationStrategy childStrategy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowComponentOrchestrationStrategy()
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
		return OrchestrationPackage.Literals.WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY;
	}

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(WorkflowExecutionPredicate)
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowComponentOrchestrationStrategy_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	public WorkflowExecutionPredicate getCondition()
	{
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(WorkflowExecutionPredicate newCondition, NotificationChain msgs)
	{
		WorkflowExecutionPredicate oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrchestrationPackage.WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowComponentOrchestrationStrategy#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	public void setCondition(WorkflowExecutionPredicate newCondition)
	{
		if (newCondition != condition)
		{
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrchestrationPackage.WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrchestrationPackage.WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestrationPackage.WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY__CONDITION, newCondition, newCondition));
	}

	/**
	 * Returns the value of the '<em><b>Child Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Strategy</em>' containment reference.
	 * @see #setChildStrategy(WorkflowComponentOrchestrationStrategy)
	 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowComponentOrchestrationStrategy_ChildStrategy()
	 * @model containment="true"
	 * @generated
	 */
	public WorkflowComponentOrchestrationStrategy getChildStrategy()
	{
		return childStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildStrategy(WorkflowComponentOrchestrationStrategy newChildStrategy, NotificationChain msgs)
	{
		WorkflowComponentOrchestrationStrategy oldChildStrategy = childStrategy;
		childStrategy = newChildStrategy;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrchestrationPackage.WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY__CHILD_STRATEGY, oldChildStrategy, newChildStrategy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowComponentOrchestrationStrategy#getChildStrategy <em>Child Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Strategy</em>' containment reference.
	 * @see #getChildStrategy()
	 * @generated
	 */
	public void setChildStrategy(WorkflowComponentOrchestrationStrategy newChildStrategy)
	{
		if (newChildStrategy != childStrategy)
		{
			NotificationChain msgs = null;
			if (childStrategy != null)
				msgs = ((InternalEObject)childStrategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrchestrationPackage.WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY__CHILD_STRATEGY, null, msgs);
			if (newChildStrategy != null)
				msgs = ((InternalEObject)newChildStrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrchestrationPackage.WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY__CHILD_STRATEGY, null, msgs);
			msgs = basicSetChildStrategy(newChildStrategy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrchestrationPackage.WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY__CHILD_STRATEGY, newChildStrategy, newChildStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws WorkflowRuntimeException 
	 * @model
	 * @generated NOT
	 */
	public void run(WorkflowComponent component, WorkflowContext context)
	{
		WorkflowExecutionPredicate condition = getCondition();
		
		if(condition != null && !condition.evaluate(component, context))
		{
			component.setState(context, StateFactory.eINSTANCE.createWorkflowSkippedState());
			return;
		}

		if(getChildStrategy() != null)
		{
			getChildStrategy().run(component, context);
			return;
		}
		
		component.setState(context, StateFactory.eINSTANCE.createWorkflowRunningState());
		
		try
		{
			component.setState(context, component.run(context));
		}
		catch (Exception e)
		{
			component.logException(context, e);
			component.setState(context, StateFactory.eINSTANCE.createWorkflowErrorState());
		}
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
			case OrchestrationPackage.WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY__CONDITION:
				return basicSetCondition(null, msgs);
			case OrchestrationPackage.WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY__CHILD_STRATEGY:
				return basicSetChildStrategy(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case OrchestrationPackage.WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY__CONDITION:
				return getCondition();
			case OrchestrationPackage.WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY__CHILD_STRATEGY:
				return getChildStrategy();
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
			case OrchestrationPackage.WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY__CONDITION:
				setCondition((WorkflowExecutionPredicate)newValue);
				return;
			case OrchestrationPackage.WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY__CHILD_STRATEGY:
				setChildStrategy((WorkflowComponentOrchestrationStrategy)newValue);
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
			case OrchestrationPackage.WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY__CONDITION:
				setCondition((WorkflowExecutionPredicate)null);
				return;
			case OrchestrationPackage.WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY__CHILD_STRATEGY:
				setChildStrategy((WorkflowComponentOrchestrationStrategy)null);
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
			case OrchestrationPackage.WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY__CONDITION:
				return condition != null;
			case OrchestrationPackage.WORKFLOW_COMPONENT_ORCHESTRATION_STRATEGY__CHILD_STRATEGY:
				return childStrategy != null;
		}
		return super.eIsSet(featureID);
	}
} // WorkflowComponentOrchestrationStrategy
