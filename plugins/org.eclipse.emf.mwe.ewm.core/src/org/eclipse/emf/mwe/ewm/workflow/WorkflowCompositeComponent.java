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
package org.eclipse.emf.mwe.ewm.workflow;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowCompositeOrchestrationStrategy;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRuntimeException;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowStateResolutionStrategy;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowState;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow Composite Component</b></em>'.  A composite may reference parameters of it's children.
 * This allows the composite to be treated as a "black box", or as a single, complex component.
 * 
 * A composite orchestration strategy must be specified for each composite instance.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowCompositeComponent#getComponents <em>Components</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowCompositeComponent#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowCompositeComponent#getCompositeOrchestrationStrategy <em>Composite Orchestration Strategy</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowCompositeComponent#getConnections <em>Connections</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowCompositeComponent#getStateResolutionStrategy <em>State Resolution Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowCompositeComponent()
 * @model kind="class"
 * @generated
 */
public class WorkflowCompositeComponent extends WorkflowComponent
{
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkflowComponent> components;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkflowParameter> parameters;

	/**
	 * The cached value of the '{@link #getCompositeOrchestrationStrategy() <em>Composite Orchestration Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeOrchestrationStrategy()
	 * @generated
	 * @ordered
	 */
	protected WorkflowCompositeOrchestrationStrategy compositeOrchestrationStrategy;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkflowParameterConnection> connections;

	/**
	 * The cached value of the '{@link #getStateResolutionStrategy() <em>State Resolution Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateResolutionStrategy()
	 * @generated
	 * @ordered
	 */
	protected WorkflowStateResolutionStrategy stateResolutionStrategy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowCompositeComponent()
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
		return WorkflowPackage.Literals.WORKFLOW_COMPOSITE_COMPONENT;
	}

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowCompositeComponent_Components()
	 * @model containment="true"
	 * @generated
	 */
	public EList<WorkflowComponent> getComponents()
	{
		if (components == null)
		{
			components = new EObjectContainmentEList<WorkflowComponent>(WorkflowComponent.class, this, WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__COMPONENTS);
		}
		return components;
	}

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowCompositeComponent_Parameters()
	 * @model
	 * @generated
	 */
	public EList<WorkflowParameter> getParameters()
	{
		if (parameters == null)
		{
			parameters = new EObjectResolvingEList<WorkflowParameter>(WorkflowParameter.class, this, WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * Returns the value of the '<em><b>Composite Orchestration Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite Orchestration Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite Orchestration Strategy</em>' containment reference.
	 * @see #setCompositeOrchestrationStrategy(WorkflowCompositeOrchestrationStrategy)
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowCompositeComponent_CompositeOrchestrationStrategy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	public WorkflowCompositeOrchestrationStrategy getCompositeOrchestrationStrategy()
	{
		return compositeOrchestrationStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositeOrchestrationStrategy(WorkflowCompositeOrchestrationStrategy newCompositeOrchestrationStrategy, NotificationChain msgs)
	{
		WorkflowCompositeOrchestrationStrategy oldCompositeOrchestrationStrategy = compositeOrchestrationStrategy;
		compositeOrchestrationStrategy = newCompositeOrchestrationStrategy;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__COMPOSITE_ORCHESTRATION_STRATEGY, oldCompositeOrchestrationStrategy, newCompositeOrchestrationStrategy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowCompositeComponent#getCompositeOrchestrationStrategy <em>Composite Orchestration Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite Orchestration Strategy</em>' containment reference.
	 * @see #getCompositeOrchestrationStrategy()
	 * @generated
	 */
	public void setCompositeOrchestrationStrategy(WorkflowCompositeOrchestrationStrategy newCompositeOrchestrationStrategy)
	{
		if (newCompositeOrchestrationStrategy != compositeOrchestrationStrategy)
		{
			NotificationChain msgs = null;
			if (compositeOrchestrationStrategy != null)
				msgs = ((InternalEObject)compositeOrchestrationStrategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__COMPOSITE_ORCHESTRATION_STRATEGY, null, msgs);
			if (newCompositeOrchestrationStrategy != null)
				msgs = ((InternalEObject)newCompositeOrchestrationStrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__COMPOSITE_ORCHESTRATION_STRATEGY, null, msgs);
			msgs = basicSetCompositeOrchestrationStrategy(newCompositeOrchestrationStrategy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__COMPOSITE_ORCHESTRATION_STRATEGY, newCompositeOrchestrationStrategy, newCompositeOrchestrationStrategy));
	}

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowCompositeComponent_Connections()
	 * @model containment="true"
	 * @generated
	 */
	public EList<WorkflowParameterConnection> getConnections()
	{
		if (connections == null)
		{
			connections = new EObjectContainmentEList<WorkflowParameterConnection>(WorkflowParameterConnection.class, this, WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * Returns the value of the '<em><b>State Resolution Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Resolution Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Resolution Strategy</em>' containment reference.
	 * @see #setStateResolutionStrategy(WorkflowStateResolutionStrategy)
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowCompositeComponent_StateResolutionStrategy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	public WorkflowStateResolutionStrategy getStateResolutionStrategy()
	{
		return stateResolutionStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateResolutionStrategy(WorkflowStateResolutionStrategy newStateResolutionStrategy, NotificationChain msgs)
	{
		WorkflowStateResolutionStrategy oldStateResolutionStrategy = stateResolutionStrategy;
		stateResolutionStrategy = newStateResolutionStrategy;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__STATE_RESOLUTION_STRATEGY, oldStateResolutionStrategy, newStateResolutionStrategy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.workflow.WorkflowCompositeComponent#getStateResolutionStrategy <em>State Resolution Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Resolution Strategy</em>' containment reference.
	 * @see #getStateResolutionStrategy()
	 * @generated
	 */
	public void setStateResolutionStrategy(WorkflowStateResolutionStrategy newStateResolutionStrategy)
	{
		if (newStateResolutionStrategy != stateResolutionStrategy)
		{
			NotificationChain msgs = null;
			if (stateResolutionStrategy != null)
				msgs = ((InternalEObject)stateResolutionStrategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__STATE_RESOLUTION_STRATEGY, null, msgs);
			if (newStateResolutionStrategy != null)
				msgs = ((InternalEObject)newStateResolutionStrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__STATE_RESOLUTION_STRATEGY, null, msgs);
			msgs = basicSetStateResolutionStrategy(newStateResolutionStrategy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__STATE_RESOLUTION_STRATEGY, newStateResolutionStrategy, newStateResolutionStrategy));
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
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__COMPOSITE_ORCHESTRATION_STRATEGY:
				return basicSetCompositeOrchestrationStrategy(null, msgs);
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__CONNECTIONS:
				return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__STATE_RESOLUTION_STRATEGY:
				return basicSetStateResolutionStrategy(null, msgs);
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
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__COMPONENTS:
				return getComponents();
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__PARAMETERS:
				return getParameters();
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__COMPOSITE_ORCHESTRATION_STRATEGY:
				return getCompositeOrchestrationStrategy();
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__CONNECTIONS:
				return getConnections();
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__STATE_RESOLUTION_STRATEGY:
				return getStateResolutionStrategy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends WorkflowComponent>)newValue);
				return;
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends WorkflowParameter>)newValue);
				return;
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__COMPOSITE_ORCHESTRATION_STRATEGY:
				setCompositeOrchestrationStrategy((WorkflowCompositeOrchestrationStrategy)newValue);
				return;
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends WorkflowParameterConnection>)newValue);
				return;
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__STATE_RESOLUTION_STRATEGY:
				setStateResolutionStrategy((WorkflowStateResolutionStrategy)newValue);
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
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__COMPONENTS:
				getComponents().clear();
				return;
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__PARAMETERS:
				getParameters().clear();
				return;
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__COMPOSITE_ORCHESTRATION_STRATEGY:
				setCompositeOrchestrationStrategy((WorkflowCompositeOrchestrationStrategy)null);
				return;
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__CONNECTIONS:
				getConnections().clear();
				return;
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__STATE_RESOLUTION_STRATEGY:
				setStateResolutionStrategy((WorkflowStateResolutionStrategy)null);
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
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__COMPONENTS:
				return components != null && !components.isEmpty();
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__COMPOSITE_ORCHESTRATION_STRATEGY:
				return compositeOrchestrationStrategy != null;
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__CONNECTIONS:
				return connections != null && !connections.isEmpty();
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT__STATE_RESOLUTION_STRATEGY:
				return stateResolutionStrategy != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * Calls visitor.visitComposite() with the instance of this class.
	 */
	@Override
	public void accept(IWorkflowVisitor visitor)
	{
		visitor.visitComposite(this);
	}

	/**
	 * Runs each of the composite's children using the supplied composite orchestration strategy.
	 */
	@Override
	public WorkflowState run(WorkflowContext context) throws WorkflowRuntimeException
	{
		getCompositeOrchestrationStrategy().run(this, context);
		return getStateResolutionStrategy().resolve(this, context);
	}
} // CompositeWorkflowComponent
