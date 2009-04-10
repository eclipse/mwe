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

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.ewm.workflow.junit.UnitOfWorkTestHarness;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.StateFactory;
import org.junit.Before;
import org.junit.Test;

/**
 * Test the functionality of WorkflowCompositeComponent
 * @author bhunt
 *
 */
public class TestWorkflowCompositeComponent extends WorkflowTestHarness
{
	@Before
	public void setUp() throws Exception
	{
		UnitOfWorkTestHarness component = createComponent("Test", 1, StateFactory.eINSTANCE.createWorkflowSuccessState());
		composite = createSerialComposite("Composite");

		composite.getComponents().add(component);
		composite.getParameters().add(component.getParameters().get(0));
		composite.getConnections().add(WorkflowFactory.eINSTANCE.createWorkflowParameterConnection());
	}

	/**
	 * Test that the start and end times are logged when the log level is set to INFO
	 */
	@Test
	public void testLog()
	{
		getEngine().setWorkflow(composite);
		getEngine().run();
		WorkflowLog log = getContext().getLog().get(composite);
		assertThat(log, is(notNullValue()));
		assertThat(log.getInfos().size(), is(2));
		assertThat(log.getInfos().get(0).getMessage(), is("Component " + composite.getName() + " started"));
		assertThat(log.getInfos().get(1).getMessage(), is("Component " + composite.getName() + " finished"));
	}

	/**
	 * Test that a composite can be persisted.  This will make sure all containement references are good.
	 * @throws IOException
	 */
	@Test
	public void testPersistence() throws IOException
	{
		
		URI uri = URI.createFileURI(createTemporaryFile("composite").getAbsolutePath());
		
		ResourceSet outResourceSet = new ResourceSetImpl();
		Resource outResource = outResourceSet.createResource(uri);
		outResource.getContents().add(composite);
		outResource.save(null);
		
		ResourceSet inResourceSet = new ResourceSetImpl();
		Resource inResource = inResourceSet.getResource(uri, true);
		WorkflowCompositeComponent persistedComposite = (WorkflowCompositeComponent) inResource.getContents().get(0);

		assertThat(persistedComposite.getName(), is(composite.getName()));
		assertThat(persistedComposite.getComponentOrchestrationStrategy(), is(notNullValue()));
		assertThat(persistedComposite.getCompositeOrchestrationStrategy(), is(notNullValue()));
		assertThat(persistedComposite.getStateResolutionStrategy(), is(notNullValue()));
		assertThat(persistedComposite.getComponents().size(), is(1));
		assertThat(persistedComposite.getParameters().size(), is(1));
		assertThat(persistedComposite.getConnections().size(), is(1));
	}
	
	private WorkflowCompositeComponent composite;
}
