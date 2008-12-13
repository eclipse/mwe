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

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.ewm.workflow.junit.UnitOfWorkTestHarness;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.StateFactory;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowDoneState;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowRunningState;
import org.junit.Before;
import org.junit.Test;

/**
 * Test the functionality of WorkflowUnitOfWork
 * @author bhunt
 *
 */
public class TestWorkflowUnitOfWork extends WorkflowTestHarness
{
	@Before
	public void setUp() throws Exception
	{
		component = createComponent("Test", 1, StateFactory.eINSTANCE.createWorkflowDoneState());
	}
	
	/**
	 * Test that the workflow component is in the running state during execution and the done state after execution
	 */
	@Test
	public void testExecutionStates()
	{
		getEngine().setWorkflow(component);
		getEngine().run();
		assertThat(component.getRunningState(), is(instanceOf(WorkflowRunningState.class)));
		assertThat(getContext().getStates().get(component), is(instanceOf(WorkflowDoneState.class)));
	}
	
	/**
	 * Test that all attributes are properly persisted with a component
	 * @throws IOException
	 */
	@Test
	public void testPersistence() throws IOException
	{
		component.setEndState(null);
		URI uri = URI.createFileURI(createTemporaryFile("work").getAbsolutePath());
		
		ResourceSet outResourceSet = new ResourceSetImpl();
		Resource outResource = outResourceSet.createResource(uri);
		outResource.getContents().add(component);
		outResource.save(null);
		
		ResourceSet inResourceSet = new ResourceSetImpl();
		Resource inResource = inResourceSet.getResource(uri, true);
		UnitOfWorkTestHarness persistedTestHarness = (UnitOfWorkTestHarness) inResource.getContents().get(0);
		
		assertThat(persistedTestHarness.getName(), is(component.getName()));
		assertThat(persistedTestHarness.getComponentOrchestrationStrategy(), is(notNullValue()));
		assertThat(persistedTestHarness.getParameters().size(), is(1));
	}
	
	private UnitOfWorkTestHarness component;
}
