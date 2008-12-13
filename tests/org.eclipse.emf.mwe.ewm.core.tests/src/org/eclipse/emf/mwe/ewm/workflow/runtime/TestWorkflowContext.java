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

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.eclipse.emf.mwe.ewm.workflow.WorkflowCompositeComponent;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowTestHarness;
import org.eclipse.emf.mwe.ewm.workflow.junit.UnitOfWorkTestHarness;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.StateFactory;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowDoneState;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowIdleState;
import org.junit.Test;

/**
 * 
 * @author bhunt
 *
 */
public class TestWorkflowContext extends WorkflowTestHarness
{
	/**
	 * Test that reset of a component resets its state back to Idle
	 */
	@Test
	public void testResetOnComponent()
	{
		UnitOfWorkTestHarness component = createComponent("Component", 0, StateFactory.eINSTANCE.createWorkflowDoneState());
		getEngine().setWorkflow(component);
		getEngine().run();
		assertThat(getContext().getStates().get(component), is(instanceOf(WorkflowDoneState.class)));
		getContext().reset(component);
		assertThat(getContext().getStates().get(component), is(instanceOf(WorkflowIdleState.class)));
	}

	/**
	 * Test that a reset of a composite resets the states of all components back to Idle
	 */
	@Test
	public void testResetOnComposite()
	{
		UnitOfWorkTestHarness component = createComponent("Component", 0, StateFactory.eINSTANCE.createWorkflowDoneState());
		WorkflowCompositeComponent composite = createSerialComposite(null);
		composite.getComponents().add(component);
		getEngine().setWorkflow(composite);
		getEngine().run();
		assertThat(getContext().getStates().get(composite), is(instanceOf(WorkflowDoneState.class)));
		assertThat(getContext().getStates().get(component), is(instanceOf(WorkflowDoneState.class)));
		getContext().reset(composite);
		assertThat(getContext().getStates().get(composite), is(instanceOf(WorkflowIdleState.class)));
		assertThat(getContext().getStates().get(component), is(instanceOf(WorkflowIdleState.class)));		
	}
}
