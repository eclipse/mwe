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

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import org.eclipse.emf.mwe.ewm.workflow.WorkflowCompositeComponent;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowFactory;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowParameterConnection;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowTestHarness;
import org.eclipse.emf.mwe.ewm.workflow.junit.UnitOfWorkTestHarness;
import org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimeFactory;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRuntimeException;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.StateFactory;
import org.junit.Test;

/**
 * 
 * @author bhunt
 *
 */
public class TestWorkflowSerialOrchestrationStrategy extends WorkflowTestHarness
{
	/**
	 * Test that two components are executed in the proper order with a successfull result
	 * @throws WorkflowRuntimeException 
	 */
	@Test
	public void testExecuteSuccess() throws WorkflowRuntimeException
	{
		WorkflowCompositeComponent composite = createComposite("Test", OrchestrationFactory.eINSTANCE.createWorkflowSerialOrchestrationStrategy());
		composite.setStateResolutionStrategy(RuntimeFactory.eINSTANCE.createWorkflowStateResolutionStrategy());

		UnitOfWorkTestHarness c1 = createComponent("First", 2, StateFactory.eINSTANCE.createWorkflowSuccessState(), context);
		UnitOfWorkTestHarness c2 = createComponent("Second", 2, StateFactory.eINSTANCE.createWorkflowSuccessState(), context);		
		composite.getComponents().add(c1);
		composite.getComponents().add(c2);
		
		WorkflowParameter output = c1.getParameters().get(1);
		WorkflowParameter input = c2.getParameters().get(0);
		WorkflowParameterConnection connection = WorkflowFactory.eINSTANCE.createWorkflowParameterConnection();
		connection.setOutput(output);
		connection.getInputs().add(input);
		
		c1.getParameters().get(0).setValue(context, "Hello");
		engine.setWorkflow(composite);
		engine.run();
		
		assertThat((String) c2.getParameters().get(1).getValue(context), is("Hello"));
	}

	/**
	 * Test that a failing component stops execution
	 * @throws WorkflowRuntimeException 
	 */
	@Test
	public void testExecuteFailed() throws WorkflowRuntimeException
	{
		WorkflowCompositeComponent composite = createComposite("Test", OrchestrationFactory.eINSTANCE.createWorkflowSerialOrchestrationStrategy());
		composite.setStateResolutionStrategy(RuntimeFactory.eINSTANCE.createWorkflowStateResolutionStrategy());

		UnitOfWorkTestHarness c1 = createComponent("First", 2, StateFactory.eINSTANCE.createWorkflowFailedState(), context);
		UnitOfWorkTestHarness c2 = createComponent("Second", 2, StateFactory.eINSTANCE.createWorkflowSuccessState(), context);		
		composite.getComponents().add(c1);
		composite.getComponents().add(c2);
		
		WorkflowParameter output = c1.getParameters().get(1);
		WorkflowParameter input = c2.getParameters().get(0);
		WorkflowParameterConnection connection = WorkflowFactory.eINSTANCE.createWorkflowParameterConnection();
		connection.setOutput(output);
		connection.getInputs().add(input);
		
		c1.getParameters().get(0).setValue(context, "Hello");
		engine.setWorkflow(composite);
		engine.run();
		assertThat((String) c2.getParameters().get(1).getValue(context), is(nullValue()));
	}

	/**
	 * That that a component with an error stops execution
	 * @throws WorkflowRuntimeException 
	 */
	@Test
	public void testExecuteError() throws WorkflowRuntimeException
	{
		WorkflowCompositeComponent composite = createComposite("Test", OrchestrationFactory.eINSTANCE.createWorkflowSerialOrchestrationStrategy());
		composite.setStateResolutionStrategy(RuntimeFactory.eINSTANCE.createWorkflowStateResolutionStrategy());

		UnitOfWorkTestHarness c1 = createComponent("First", 2, StateFactory.eINSTANCE.createWorkflowErrorState(), context);
		UnitOfWorkTestHarness c2 = createComponent("Second", 2, StateFactory.eINSTANCE.createWorkflowSuccessState(), context);		
		composite.getComponents().add(c1);
		composite.getComponents().add(c2);
		
		WorkflowParameter output = c1.getParameters().get(1);
		WorkflowParameter input = c2.getParameters().get(0);
		WorkflowParameterConnection connection = WorkflowFactory.eINSTANCE.createWorkflowParameterConnection();
		connection.setOutput(output);
		connection.getInputs().add(input);
		
		c1.getParameters().get(0).setValue(context, "Hello");
		engine.setWorkflow(composite);
		engine.run();
		
		assertThat((String) c2.getParameters().get(1).getValue(context), is(nullValue()));
	}
}
