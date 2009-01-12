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

import java.util.Map;
import java.util.concurrent.ExecutorService;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowState;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimePackage
 * @generated
 */
public class RuntimeFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RuntimeFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RuntimeFactory init()
	{
		try {
			RuntimeFactory theRuntimeFactory = (RuntimeFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/mwe/ewm/workflow/runtime"); 
			if (theRuntimeFactory != null) {
				return theRuntimeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RuntimeFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeFactory()
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
		switch (eClass.getClassifierID()) {
			case RuntimePackage.WORKFLOW_CONTEXT: return createWorkflowContext();
			case RuntimePackage.WORKFLOW_ENGINE: return createWorkflowEngine();
			case RuntimePackage.WORKFLOW_STATE_MAP: return (EObject)createWorkflowStateMap();
			case RuntimePackage.WORKFLOW_PARAMETER_MAP: return (EObject)createWorkflowParameterMap();
			case RuntimePackage.WORKFLOW_STATE_RESOLUTION_STRATEGY: return createWorkflowStateResolutionStrategy();
			case RuntimePackage.WORKFLOW_RUNNABLE: return (EObject)createWorkflowRunnable();
			case RuntimePackage.WORKFLOW_RUNNER: return createWorkflowRunner();
			case RuntimePackage.WORKFLOW_STATE_RESETTER: return createWorkflowStateResetter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID()) {
			case RuntimePackage.EXECUTOR_SERVICE:
				return createExecutorServiceFromString(eDataType, initialValue);
			case RuntimePackage.WORKFLOW_RUNTIME_EXCEPTION:
				return createWorkflowRuntimeExceptionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID()) {
			case RuntimePackage.EXECUTOR_SERVICE:
				return convertExecutorServiceToString(eDataType, instanceValue);
			case RuntimePackage.WORKFLOW_RUNTIME_EXCEPTION:
				return convertWorkflowRuntimeExceptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowContext createWorkflowContext()
	{
		WorkflowContext workflowContext = new WorkflowContext();
		return workflowContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowEngine createWorkflowEngine()
	{
		WorkflowEngine workflowEngine = new WorkflowEngine();
		return workflowEngine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<WorkflowComponent, WorkflowState> createWorkflowStateMap()
	{
		WorkflowStateMap workflowStateMap = new WorkflowStateMap();
		return workflowStateMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<WorkflowParameter, EObject> createWorkflowParameterMap()
	{
		WorkflowParameterMap workflowParameterMap = new WorkflowParameterMap();
		return workflowParameterMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowStateResolutionStrategy createWorkflowStateResolutionStrategy()
	{
		WorkflowStateResolutionStrategy workflowStateResolutionStrategy = new WorkflowStateResolutionStrategy();
		return workflowStateResolutionStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Runnable createWorkflowRunnable()
	{
		WorkflowRunnable workflowRunnable = new WorkflowRunnable();
		return workflowRunnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowRunner createWorkflowRunner()
	{
		WorkflowRunner workflowRunner = new WorkflowRunner();
		return workflowRunner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowStateResetter createWorkflowStateResetter()
	{
		WorkflowStateResetter workflowStateResetter = new WorkflowStateResetter();
		return workflowStateResetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutorService createExecutorServiceFromString(EDataType eDataType, String initialValue)
	{
		return (ExecutorService)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExecutorServiceToString(EDataType eDataType, Object instanceValue)
	{
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowRuntimeException createWorkflowRuntimeExceptionFromString(EDataType eDataType, String initialValue)
	{
		return (WorkflowRuntimeException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWorkflowRuntimeExceptionToString(EDataType eDataType, Object instanceValue)
	{
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimePackage getRuntimePackage()
	{
		return (RuntimePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RuntimePackage getPackage()
	{
		return RuntimePackage.eINSTANCE;
	}

} //RuntimeFactory
