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
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.StateFactory;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowErrorState;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowFailedState;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowSuccessState;
import org.junit.Test;

/**
 * 
 * @author bhunt
 *
 */
public class TestWorkflowStateResolutionStrategy extends WorkflowTestHarness
{
	/**
	 * Test that successful components result in a successful composite
	 */
	@Test
	public void testSuccess()
	{
		WorkflowCompositeComponent composite = createSerialComposite("Composite");
		composite.getComponents().add(createComponent("C1", 0, StateFactory.eINSTANCE.createWorkflowSuccessState()));
		composite.getComponents().add(createComponent("C2", 0, StateFactory.eINSTANCE.createWorkflowSuccessState()));
		getEngine().setWorkflow(composite);
		getEngine().run();
		assertThat(getContext().getStates().get(composite), is(instanceOf(WorkflowSuccessState.class)));
	}
	
	/**
	 * Test that a failed component results in a failed composite
	 */
	@Test
	public void testFailed()
	{
		WorkflowCompositeComponent composite = createSerialComposite("Composite");
		composite.getComponents().add(createComponent("C1", 0, StateFactory.eINSTANCE.createWorkflowSuccessState()));
		composite.getComponents().add(createComponent("C2", 0, StateFactory.eINSTANCE.createWorkflowFailedState()));
		getEngine().setWorkflow(composite);
		getEngine().run();
		assertThat(getContext().getStates().get(composite), is(instanceOf(WorkflowFailedState.class)));		
	}
	
	/**
	 * Test that a component error results in a composite with an error
	 */
	@Test
	public void testError()
	{
		WorkflowCompositeComponent composite = createSerialComposite("Composite");
		composite.getComponents().add(createComponent("C1", 0, StateFactory.eINSTANCE.createWorkflowSuccessState()));
		composite.getComponents().add(createComponent("C2", 0, StateFactory.eINSTANCE.createWorkflowErrorState()));
		getEngine().setWorkflow(composite);
		getEngine().run();
		assertThat(getContext().getStates().get(composite), is(instanceOf(WorkflowErrorState.class)));		
	}
}
