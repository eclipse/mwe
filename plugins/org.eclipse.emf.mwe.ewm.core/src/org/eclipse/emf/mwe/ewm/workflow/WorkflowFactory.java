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
 * @see org.eclipse.emf.mwe.ewm.workflow.WorkflowPackage
 * @generated
 */
public class WorkflowFactory extends EFactoryImpl
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WorkflowFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkflowFactory init()
	{
		try
		{
			WorkflowFactory theWorkflowFactory = (WorkflowFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/emf/mwe/ewm/workflow"); 
			if (theWorkflowFactory != null)
			{
				return theWorkflowFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WorkflowFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowFactory()
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
			case WorkflowPackage.WORKFLOW_COMPOSITE_COMPONENT: return createWorkflowCompositeComponent();
			case WorkflowPackage.WORKFLOW_PARAMETER: return createWorkflowParameter();
			case WorkflowPackage.WORKFLOW_PARAMETER_VALUE_STRATEGY: return createWorkflowParameterValueStrategy();
			case WorkflowPackage.WORKFLOW_PARAMETER_CONNECTION: return createWorkflowParameterConnection();
			case WorkflowPackage.WORKFLOW_PARAMETER_SIMPLE_VALUE_STRATEGY: return createWorkflowParameterSimpleValueStrategy();
			case WorkflowPackage.WORKFLOW_COMPONENT_PROXY: return createWorkflowComponentProxy();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowCompositeComponent createWorkflowCompositeComponent()
	{
		WorkflowCompositeComponent workflowCompositeComponent = new WorkflowCompositeComponent();
		return workflowCompositeComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowParameter createWorkflowParameter()
	{
		WorkflowParameter workflowParameter = new WorkflowParameter();
		return workflowParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowParameterValueStrategy createWorkflowParameterValueStrategy()
	{
		WorkflowParameterValueStrategy workflowParameterValueStrategy = new WorkflowParameterValueStrategy();
		return workflowParameterValueStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowParameterConnection createWorkflowParameterConnection()
	{
		WorkflowParameterConnection workflowParameterConnection = new WorkflowParameterConnection();
		return workflowParameterConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowParameterSimpleValueStrategy createWorkflowParameterSimpleValueStrategy()
	{
		WorkflowParameterSimpleValueStrategy workflowParameterSimpleValueStrategy = new WorkflowParameterSimpleValueStrategy();
		return workflowParameterSimpleValueStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowComponentProxy createWorkflowComponentProxy()
	{
		WorkflowComponentProxy workflowComponentProxy = new WorkflowComponentProxy();
		return workflowComponentProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowPackage getWorkflowPackage()
	{
		return (WorkflowPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WorkflowPackage getPackage()
	{
		return WorkflowPackage.eINSTANCE;
	}

} //WorkflowFactory
