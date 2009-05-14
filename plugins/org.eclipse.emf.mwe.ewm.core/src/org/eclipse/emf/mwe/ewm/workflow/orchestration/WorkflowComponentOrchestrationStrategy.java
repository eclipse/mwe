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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
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
 *
 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowComponentOrchestrationStrategy()
 * @model kind="class"
 * @generated
 */
public class WorkflowComponentOrchestrationStrategy extends EObjectImpl implements EObject
{
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws WorkflowRuntimeException 
	 * @model
	 * @generated NOT
	 */
	public void run(WorkflowComponent component, WorkflowContext context)
	{
		component.setState(context, StateFactory.eINSTANCE.createWorkflowRunningState());
		
		try
		{
			component.setState(context, component.run(context));
		}
		catch (Exception e)
		{
			component.getLog(context).logException(e);
			component.setState(context, StateFactory.eINSTANCE.createWorkflowErrorState());
		}
	}
} // WorkflowComponentOrchestrationStrategy
