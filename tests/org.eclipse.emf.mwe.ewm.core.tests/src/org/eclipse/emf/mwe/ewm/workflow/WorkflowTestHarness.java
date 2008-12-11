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

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.mwe.ewm.workflow.junit.JunitFactory;
import org.eclipse.emf.mwe.ewm.workflow.junit.UnitOfWorkTestHarness;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationFactory;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowCompositeOrchestrationStrategy;
import org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimeFactory;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowEngine;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowState;
import org.junit.After;
import org.junit.Before;

/**
 * This class is used as a test harness for the various unit tests
 * @author bhunt
 *
 */
public class WorkflowTestHarness
{
	/**
	 * Set up an engine, context, parameter, and a temp file
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception
	{
		parameter = WorkflowFactory.eINSTANCE.createWorkflowParameter();
		parameter.setName("TestParameter");
		parameter.setType(EcorePackage.eINSTANCE.getEString());
		
		engine = RuntimeFactory.eINSTANCE.createWorkflowEngine();
		context = RuntimeFactory.eINSTANCE.createWorkflowContext();
	
		engine.setContext(context);

		tempFile = File.createTempFile("workflowComponent", "junit");
	}

	/**
	 * Deletes the temp fle
	 */
	@After
	public void tearDown() throws Exception
	{
		if(tempFile != null)
			assertTrue(tempFile.delete());
	}
	
	/**
	 * Factory for creating a UnitOfWorkTestharness
	 * @param name the name of the workflow component
	 * @param numberParameters the number of parameters to construct
	 * @param endState the end state of the workflow component
	 * @return a new instance of UnitofWorkTestHarness
	 */
	public UnitOfWorkTestHarness createComponent(String name, int numberParameters, WorkflowState endState, WorkflowContext context)
	{
		UnitOfWorkTestHarness component = JunitFactory.eINSTANCE.createUnitOfWorkTestHarness();
		component.setName(name);
		component.setEndState(endState);
		component.setComponentOrchestrationStrategy(OrchestrationFactory.eINSTANCE.createWorkflowComponentOrchestrationStrategy());
		
		for(int i = 0; i < numberParameters; i++)
		{
			WorkflowParameter parameter = WorkflowFactory.eINSTANCE.createWorkflowParameter();
			parameter.setValueStrategy(WorkflowFactory.eINSTANCE.createWorkflowParameterSimpleValueStrategy());
			parameter.setType(EcorePackage.eINSTANCE.getEString());
			component.getParameters().add(parameter);
		}
		
		return component;
	}

	/**
	 * Factory for creating a WorkflowCompositeComponent with a default serial orchestration strategy
	 * @param name the name of the composite
	 * @return a new instance of WorkflowCompositeComponent
	 */
	public WorkflowCompositeComponent createComposite(String name)
	{
		return createComposite(name, OrchestrationFactory.eINSTANCE.createWorkflowSerialOrchestrationStrategy());
	}
	
	/**
	 * Factory for creating a WorkflowCompositeComponent
	 * @param name the name of the composite
	 * @param strategy the orchestration strategy
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
	
	protected WorkflowEngine engine;
	protected WorkflowContext context;
	protected WorkflowParameter parameter;
	protected File tempFile;
}
