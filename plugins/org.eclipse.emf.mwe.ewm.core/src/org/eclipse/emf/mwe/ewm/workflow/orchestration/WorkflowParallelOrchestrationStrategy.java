/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.ewm.workflow.orchestration;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowCompositeComponent;
import org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimeFactory;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRunner;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Parallel Workflow Orchestrator</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationPackage#getWorkflowParallelOrchestrationStrategy()
 * @model kind="class"
 * @generated
 */
public class WorkflowParallelOrchestrationStrategy extends WorkflowCompositeOrchestrationStrategy
{
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowParallelOrchestrationStrategy()
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
		return OrchestrationPackage.Literals.WORKFLOW_PARALLEL_ORCHESTRATION_STRATEGY;
	}

	/**
	 * @generated NOT
	 */
	@Override
	public void run(WorkflowCompositeComponent composite, WorkflowContext context)
	{
		ExecutorService threadPool = context.getThreadPool();
		ArrayList<Future<?>> futures = new ArrayList<Future<?>>();

		for (WorkflowComponent component : composite.getComponents())
		{
			WorkflowRunner runner = RuntimeFactory.eINSTANCE.createWorkflowRunner();
			runner.setComponent(component);
			runner.setContext(context);
			futures.add(threadPool.submit(runner));
		}
		
		for (Future<?> future : futures)
		{
			try
			{
				future.get();
			}
			catch (Exception e)
			{
				continue;
			}
		}
	}
} // ParallelWorkflowOrchestrator
