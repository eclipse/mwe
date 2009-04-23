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
package org.eclipse.emf.mwe.ewm.workflow.runtime;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Engine</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowEngine#getWorkflow <em>Workflow</em>}</li>
 * <li>{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowEngine#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowEngine()
 * @model kind="class" superTypes="org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRunnable"
 * @generated
 */
public class WorkflowEngine extends WorkflowRunnable
{
	/**
	 * The cached value of the '{@link #getWorkflow() <em>Workflow</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getWorkflow()
	 * @generated
	 * @ordered
	 */
	protected WorkflowComponent workflow;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected WorkflowContext context;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected WorkflowEngine()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return RuntimePackage.Literals.WORKFLOW_ENGINE;
	}

	/**
	 * Returns the value of the '<em><b>Workflow</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workflow</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Workflow</em>' containment reference.
	 * @see #setWorkflow(WorkflowComponent)
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowEngine_Workflow()
	 * @model containment="true" required="true"
	 * @generated
	 */
	public WorkflowComponent getWorkflow()
	{
		return workflow;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetWorkflow(WorkflowComponent newWorkflow, NotificationChain msgs)
	{
		WorkflowComponent oldWorkflow = workflow;
		workflow = newWorkflow;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RuntimePackage.WORKFLOW_ENGINE__WORKFLOW, oldWorkflow, newWorkflow);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowEngine#getWorkflow <em>Workflow</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Workflow</em>' containment reference.
	 * @see #getWorkflow()
	 * @generated
	 */
	public void setWorkflow(WorkflowComponent newWorkflow)
	{
		if (newWorkflow != workflow)
		{
			NotificationChain msgs = null;
			if (workflow != null)
				msgs = ((InternalEObject) workflow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RuntimePackage.WORKFLOW_ENGINE__WORKFLOW, null, msgs);
			if (newWorkflow != null)
				msgs = ((InternalEObject) newWorkflow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RuntimePackage.WORKFLOW_ENGINE__WORKFLOW, null, msgs);
			msgs = basicSetWorkflow(newWorkflow, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.WORKFLOW_ENGINE__WORKFLOW, newWorkflow, newWorkflow));
	}

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(WorkflowContext)
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowEngine_Context()
	 * @model containment="true" required="true"
	 * @generated
	 */
	public WorkflowContext getContext()
	{
		return context;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetContext(WorkflowContext newContext, NotificationChain msgs)
	{
		WorkflowContext oldContext = context;
		context = newContext;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RuntimePackage.WORKFLOW_ENGINE__CONTEXT, oldContext, newContext);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowEngine#getContext <em>Context</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	public void setContext(WorkflowContext newContext)
	{
		if (newContext != context)
		{
			NotificationChain msgs = null;
			if (context != null)
				msgs = ((InternalEObject) context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RuntimePackage.WORKFLOW_ENGINE__CONTEXT, null, msgs);
			if (newContext != null)
				msgs = ((InternalEObject) newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RuntimePackage.WORKFLOW_ENGINE__CONTEXT, null, msgs);
			msgs = basicSetContext(newContext, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.WORKFLOW_ENGINE__CONTEXT, newContext, newContext));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated NOT
	 */
	public void run()
	{
		getContext().setWorkflow(getWorkflow());
		getWorkflow().start(getContext());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model
	 * @generated NOT
	 */
	public void reset()
	{
		getContext().reset(getWorkflow());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case RuntimePackage.WORKFLOW_ENGINE__WORKFLOW:
				return basicSetWorkflow(null, msgs);
			case RuntimePackage.WORKFLOW_ENGINE__CONTEXT:
				return basicSetContext(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case RuntimePackage.WORKFLOW_ENGINE__WORKFLOW:
				return getWorkflow();
			case RuntimePackage.WORKFLOW_ENGINE__CONTEXT:
				return getContext();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case RuntimePackage.WORKFLOW_ENGINE__WORKFLOW:
				setWorkflow((WorkflowComponent) newValue);
				return;
			case RuntimePackage.WORKFLOW_ENGINE__CONTEXT:
				setContext((WorkflowContext) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case RuntimePackage.WORKFLOW_ENGINE__WORKFLOW:
				setWorkflow((WorkflowComponent) null);
				return;
			case RuntimePackage.WORKFLOW_ENGINE__CONTEXT:
				setContext((WorkflowContext) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case RuntimePackage.WORKFLOW_ENGINE__WORKFLOW:
				return workflow != null;
			case RuntimePackage.WORKFLOW_ENGINE__CONTEXT:
				return context != null;
		}
		return super.eIsSet(featureID);
	}

} // WorkflowEngine
