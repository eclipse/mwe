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

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowState;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getThreadPool <em>Thread Pool</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getStates <em>States</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getLog <em>Log</em>}</li>
 *   <li>{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getLogLevel <em>Log Level</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowContext()
 * @model kind="class"
 * @generated
 */
public class WorkflowContext extends EObjectImpl implements EObject
{
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EMap<WorkflowParameter, EObject> parameters;

	/**
	 * The default value of the '{@link #getThreadPool() <em>Thread Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadPool()
	 * @generated
	 * @ordered
	 */
	protected static final ExecutorService THREAD_POOL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getThreadPool() <em>Thread Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreadPool()
	 * @generated
	 * @ordered
	 */
	protected ExecutorService threadPool = THREAD_POOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EMap<WorkflowComponent, WorkflowState> states;

	/**
	 * The cached value of the '{@link #getLog() <em>Log</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLog()
	 * @generated
	 * @ordered
	 */
	protected EMap<WorkflowComponent, WorkflowLog> log;

	/**
	 * The default value of the '{@link #getLogLevel() <em>Log Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogLevel()
	 * @generated
	 * @ordered
	 */
	protected static final WorkflowLogEntryType LOG_LEVEL_EDEFAULT = WorkflowLogEntryType.ERROR;

	/**
	 * The cached value of the '{@link #getLogLevel() <em>Log Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogLevel()
	 * @generated
	 * @ordered
	 */
	protected WorkflowLogEntryType logLevel = LOG_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowContext()
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
		return RuntimePackage.Literals.WORKFLOW_CONTEXT;
	}

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' map.
	 * The key is of type {@link org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter},
	 * and the value is of type {@link org.eclipse.emf.ecore.EObject},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' map.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowContext_Parameters()
	 * @model mapType="org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowParameterMap<org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter, org.eclipse.emf.ecore.EObject>"
	 * @generated
	 */
	public EMap<WorkflowParameter, EObject> getParameters()
	{
		if (parameters == null)
		{
			parameters = new EcoreEMap<WorkflowParameter,EObject>(RuntimePackage.Literals.WORKFLOW_PARAMETER_MAP, WorkflowParameterMap.class, this, RuntimePackage.WORKFLOW_CONTEXT__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * Returns the value of the '<em><b>Thread Pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread Pool</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread Pool</em>' attribute.
	 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage#getWorkflowContext_ThreadPool()
	 * @model dataType="org.eclipse.emf.workflow.ExecutorService" transient="true" changeable="false"
	 * @generated NOT
	 */
	public ExecutorService getThreadPool()
	{
		if(threadPool == null)
			threadPool = Executors.newCachedThreadPool();
		
		return threadPool;
	}

	/**
	 * Returns the value of the '<em><b>States</b></em>' map.
	 * The key is of type {@link org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent},
	 * and the value is of type {@link org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowState},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' map.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowContext_States()
	 * @model mapType="org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowStateMap<org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent, org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowState>"
	 * @generated
	 */
	public EMap<WorkflowComponent, WorkflowState> getStates()
	{
		if (states == null)
		{
			states = new EcoreEMap<WorkflowComponent,WorkflowState>(RuntimePackage.Literals.WORKFLOW_STATE_MAP, WorkflowStateMap.class, this, RuntimePackage.WORKFLOW_CONTEXT__STATES);
		}
		return states;
	}

	/**
	 * Returns the value of the '<em><b>Log</b></em>' map.
	 * The key is of type {@link org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent},
	 * and the value is of type {@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log</em>' map.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowContext_Log()
	 * @model mapType="org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogMap<org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent, org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog>"
	 * @generated
	 */
	public EMap<WorkflowComponent, WorkflowLog> getLog()
	{
		if (log == null)
		{
			log = new EcoreEMap<WorkflowComponent,WorkflowLog>(RuntimePackage.Literals.WORKFLOW_LOG_MAP, WorkflowLogMap.class, this, RuntimePackage.WORKFLOW_CONTEXT__LOG);
		}
		return log;
	}

	/**
	 * Returns the value of the '<em><b>Log Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Log Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Level</em>' attribute.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntryType
	 * @see #setLogLevel(WorkflowLogEntryType)
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage#getWorkflowContext_LogLevel()
	 * @model
	 * @generated
	 */
	public WorkflowLogEntryType getLogLevel()
	{
		return logLevel;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext#getLogLevel <em>Log Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Level</em>' attribute.
	 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntryType
	 * @see #getLogLevel()
	 * @generated
	 */
	public void setLogLevel(WorkflowLogEntryType newLogLevel)
	{
		WorkflowLogEntryType oldLogLevel = logLevel;
		logLevel = newLogLevel == null ? LOG_LEVEL_EDEFAULT : newLogLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.WORKFLOW_CONTEXT__LOG_LEVEL, oldLogLevel, logLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated NOT
	 */
	public void reset(WorkflowComponent component)
	{
		resetState(component);
		resetLog(component);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated NOT
	 */
	public void resetState(WorkflowComponent component)
	{
		WorkflowStateResetter resetter = RuntimeFactory.eINSTANCE.createWorkflowStateResetter();
		resetter.setContext(this);
		component.accept(resetter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated NOT
	 */
	public void resetLog(WorkflowComponent component)
	{
		WorkflowLogResetter resetter = RuntimeFactory.eINSTANCE.createWorkflowLogResetter();
		resetter.setContext(this);
		component.accept(resetter);
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
			case RuntimePackage.WORKFLOW_CONTEXT__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case RuntimePackage.WORKFLOW_CONTEXT__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case RuntimePackage.WORKFLOW_CONTEXT__LOG:
				return ((InternalEList<?>)getLog()).basicRemove(otherEnd, msgs);
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
			case RuntimePackage.WORKFLOW_CONTEXT__PARAMETERS:
				if (coreType) return getParameters();
				else return getParameters().map();
			case RuntimePackage.WORKFLOW_CONTEXT__THREAD_POOL:
				return getThreadPool();
			case RuntimePackage.WORKFLOW_CONTEXT__STATES:
				if (coreType) return getStates();
				else return getStates().map();
			case RuntimePackage.WORKFLOW_CONTEXT__LOG:
				if (coreType) return getLog();
				else return getLog().map();
			case RuntimePackage.WORKFLOW_CONTEXT__LOG_LEVEL:
				return getLogLevel();
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
			case RuntimePackage.WORKFLOW_CONTEXT__PARAMETERS:
				((EStructuralFeature.Setting)getParameters()).set(newValue);
				return;
			case RuntimePackage.WORKFLOW_CONTEXT__STATES:
				((EStructuralFeature.Setting)getStates()).set(newValue);
				return;
			case RuntimePackage.WORKFLOW_CONTEXT__LOG:
				((EStructuralFeature.Setting)getLog()).set(newValue);
				return;
			case RuntimePackage.WORKFLOW_CONTEXT__LOG_LEVEL:
				setLogLevel((WorkflowLogEntryType)newValue);
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
			case RuntimePackage.WORKFLOW_CONTEXT__PARAMETERS:
				getParameters().clear();
				return;
			case RuntimePackage.WORKFLOW_CONTEXT__STATES:
				getStates().clear();
				return;
			case RuntimePackage.WORKFLOW_CONTEXT__LOG:
				getLog().clear();
				return;
			case RuntimePackage.WORKFLOW_CONTEXT__LOG_LEVEL:
				setLogLevel(LOG_LEVEL_EDEFAULT);
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
			case RuntimePackage.WORKFLOW_CONTEXT__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case RuntimePackage.WORKFLOW_CONTEXT__THREAD_POOL:
				return THREAD_POOL_EDEFAULT == null ? threadPool != null : !THREAD_POOL_EDEFAULT.equals(threadPool);
			case RuntimePackage.WORKFLOW_CONTEXT__STATES:
				return states != null && !states.isEmpty();
			case RuntimePackage.WORKFLOW_CONTEXT__LOG:
				return log != null && !log.isEmpty();
			case RuntimePackage.WORKFLOW_CONTEXT__LOG_LEVEL:
				return logLevel != LOG_LEVEL_EDEFAULT;
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
		result.append(" (threadPool: ");
		result.append(threadPool);
		result.append(", logLevel: ");
		result.append(logLevel);
		result.append(')');
		return result.toString();
	}

} // WorkflowContext
