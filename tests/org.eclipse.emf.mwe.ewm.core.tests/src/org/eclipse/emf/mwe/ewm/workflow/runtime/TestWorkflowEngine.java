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
public class TestWorkflowEngine extends WorkflowTestHarness
{
	/**
	 * Test that a reset of the workflow engine resets the workflow state back to Idle
	 */
	@Test
	public void testReset()
	{
		UnitOfWorkTestHarness component = createComponent("Component", 0, StateFactory.eINSTANCE.createWorkflowDoneState());
		getEngine().setWorkflow(component);
		getEngine().run();
		assertThat(getContext().getStates().get(component), is(instanceOf(WorkflowDoneState.class)));
		getEngine().reset();
		assertThat(getContext().getStates().get(component), is(instanceOf(WorkflowIdleState.class)));
	}
}
