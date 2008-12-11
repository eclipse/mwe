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

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.eclipse.emf.mwe.ewm.workflow.WorkflowCompositeComponent;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowTestHarness;
import org.eclipse.emf.mwe.ewm.workflow.junit.UnitOfWorkTestHarness;
import org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimeFactory;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.StateFactory;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowSuccessState;
import org.junit.Test;

/**
 * 
 * @author bhunt
 *
 */
public class TestWorkflowParallelOrchestrationStrategy extends WorkflowTestHarness
{
	/**
	 * Test that all components in a parallel workflow are executed
	 */
	@Test
	public void testExecution()
	{
		WorkflowCompositeComponent composite = createComposite("Test", OrchestrationFactory.eINSTANCE.createWorkflowParallelOrchestrationStrategy());
		composite.setStateResolutionStrategy(RuntimeFactory.eINSTANCE.createWorkflowStateResolutionStrategy());

		UnitOfWorkTestHarness c1 = createComponent("First", 0, StateFactory.eINSTANCE.createWorkflowSuccessState(), context);
		UnitOfWorkTestHarness c2 = createComponent("Second", 0, StateFactory.eINSTANCE.createWorkflowSuccessState(), context);		
		composite.getComponents().add(c1);
		composite.getComponents().add(c2);
		
		engine.setWorkflow(composite);
		engine.run();
		
		assertThat(context.getStates().get(composite), is(instanceOf(WorkflowSuccessState.class)));
		assertThat(context.getStates().get(c1), is(instanceOf(WorkflowSuccessState.class)));
		assertThat(context.getStates().get(c2), is(instanceOf(WorkflowSuccessState.class)));
	}
}
