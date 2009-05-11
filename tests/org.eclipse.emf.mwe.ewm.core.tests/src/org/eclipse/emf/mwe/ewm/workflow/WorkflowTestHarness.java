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

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.mwe.ewm.workflow.junit.JunitFactory;
import org.eclipse.emf.mwe.ewm.workflow.junit.UnitOfWorkTestHarness;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationFactory;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowCompositeOrchestrationStrategy;
import org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimeFactory;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowEngine;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLogEntryType;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowState;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.junit.After;

/**
 * This class is used as a test harness for the various unit tests
 * 
 * @author bhunt
 * 
 */
public class WorkflowTestHarness
{
	/**
	 * Deletes the temp fle
	 */
	@After
	public void tearDown() throws Exception
	{
		for (File file : tempFiles)
		{
			try
			{
				file.delete();
			}
			catch (Exception e)
			{}
		}

		tempFiles.clear();

		if (context != null)
		{
			context.getParameters().clear();
			context.getStates().clear();
			context.getLog().clear();
		}
	}

	/**
	 * Factory for creating a UnitOfWorkTestharness
	 * 
	 * @param name
	 *          the name of the workflow component
	 * @param numberParameters
	 *          the number of parameters to construct
	 * @param endState
	 *          the end state of the workflow component
	 * @return a new instance of UnitofWorkTestHarness
	 */
	public UnitOfWorkTestHarness createComponent(String name, int numberParameters, WorkflowState endState)
	{
		UnitOfWorkTestHarness component = JunitFactory.eINSTANCE.createUnitOfWorkTestHarness();
		component.setName(name);
		component.setEndState(endState);
		component.setComponentOrchestrationStrategy(OrchestrationFactory.eINSTANCE.createWorkflowComponentOrchestrationStrategy());

		for (int i = 0; i < numberParameters; i++)
			component.getParameters().add(createStringParameter(null));

		return component;
	}

	/**
	 * Factory for creating a WorkflowCompositeComponent with a default serial orchestration strategy
	 * 
	 * @param name
	 *          the name of the composite
	 * @return a new instance of WorkflowCompositeComponent
	 */
	public WorkflowCompositeComponent createSerialComposite(String name)
	{
		return createComposite(name, OrchestrationFactory.eINSTANCE.createWorkflowSerialOrchestrationStrategy());
	}

	/**
	 * Factory for creating a WorkflowCompositeComponent
	 * 
	 * @param name
	 *          the name of the composite
	 * @param strategy
	 *          the orchestration strategy
	 * @return a new instance of WorkflowCompositeComponent
	 */
	public WorkflowCompositeComponent createComposite(String name, WorkflowCompositeOrchestrationStrategy strategy)
	{
		WorkflowCompositeComponent composite = WorkflowFactory.eINSTANCE.createWorkflowCompositeComponent();
		composite.setName(name);
		composite.setComponentOrchestrationStrategy(OrchestrationFactory.eINSTANCE.createWorkflowComponentOrchestrationStrategy());
		composite.setStateResolutionStrategy(RuntimeFactory.eINSTANCE.createWorkflowStateResolutionStrategy());
		composite.setCompositeOrchestrationStrategy(strategy);
		return composite;
	}

	public WorkflowParameter createStringParameter(String name)
	{
		WorkflowParameter parameter = WorkflowFactory.eINSTANCE.createWorkflowParameter();
		parameter.setName(name);
		parameter.setType(EcorePackage.Literals.ESTRING);
		parameter.setValueStrategy(WorkflowFactory.eINSTANCE.createWorkflowParameterSimpleValueStrategy());
		return parameter;
	}

	public File createTemporaryFile(String prefix) throws IOException
	{
		File file = File.createTempFile(prefix, ".junit");
		tempFiles.add(file);
		return file;
	}

	public WorkflowContext getContext()
	{
		if (context == null)
		{
			context = RuntimeFactory.eINSTANCE.createWorkflowContext();
			context.setEditingDomain(TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain());
			context.setLogLevel(WorkflowLogEntryType.INFO);
		}
		
		return context;
	}

	public WorkflowEngine getEngine()
	{
		if (engine == null)
		{
			engine = RuntimeFactory.eINSTANCE.createWorkflowEngine();
			engine.setContext(getContext());
		}
		
		return engine;
	}

	private WorkflowEngine engine;
	private WorkflowContext context;
	private ArrayList<File> tempFiles = new ArrayList<File>();
}
