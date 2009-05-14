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
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.ewm.workflow.junit.JunitFactory;
import org.eclipse.emf.mwe.ewm.workflow.junit.PredicateTestHarness;
import org.eclipse.emf.mwe.ewm.workflow.junit.UnitOfWorkTestHarness;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.OrchestrationFactory;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowPredicateAND;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowPredicateOR;
import org.eclipse.emf.mwe.ewm.workflow.orchestration.WorkflowRerunPredicate;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.StateFactory;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowRunningState;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowSkippedState;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowSuccessState;
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
		component = createComponent("Test", 1, StateFactory.eINSTANCE.createWorkflowSuccessState());
		getEngine().setWorkflow(component);
	}
	
	/**
	 * Test that the workflow component is in the running state during execution and the done state after execution
	 */
	@Test
	public void testExecutionStates()
	{
		getEngine().run();
		assertThat(component.getRunningState(), is(instanceOf(WorkflowRunningState.class)));
		assertThat(getContext().getStates().get(component), is(instanceOf(WorkflowSuccessState.class)));
	}
	
	/**
	 * Test that the start and end times are logged when the log level is set to INFO
	 */
	@Test
	public void testLog()
	{
		getEngine().run();
		WorkflowLog log = getContext().getLog().get(component);
		assertThat(log, is(notNullValue()));
		assertThat(log.getInfos().size(), is(2));
		assertThat(log.getInfos().get(0).getMessage(), is("Component " + component.getName() + " started"));
		assertThat(log.getInfos().get(1).getMessage(), is("Component " + component.getName() + " finished"));
	}
	
	/**
	 * Test that a workflow component will be executed with one condition set to true
	 */
	@Test
	public void testConditionalExecutionSingleConditionTrue()
	{
		PredicateTestHarness predicate = JunitFactory.eINSTANCE.createPredicateTestHarness();
		predicate.setExecutionAllowed(true);
		component.getComponentOrchestrationStrategy().setCondition(predicate);
		getEngine().run();
		assertThat(component.getRunningState(), is(notNullValue()));
		assertThat(component.getState(getContext()), is(instanceOf(WorkflowSuccessState.class)));
	}
	
	/**
	 * Test that a workflow component will NOT be executed with one condition set to false
	 */
	@Test
	public void testConditionalExecutionSingleConditionFalse()
	{
		PredicateTestHarness predicate = JunitFactory.eINSTANCE.createPredicateTestHarness();
		predicate.setExecutionAllowed(false);
		component.getComponentOrchestrationStrategy().setCondition(predicate);
		getEngine().run();
		assertThat(component.getRunningState(), is(nullValue()));
		assertThat(component.getState(getContext()), is(instanceOf(WorkflowSkippedState.class)));
	}

	/**
	 * Test that a workflow component will be executed with two condition set to true
	 */
	@Test
	public void testConditionalExecutionTwoConditionsTrue()
	{
		WorkflowPredicateAND and = OrchestrationFactory.eINSTANCE.createWorkflowPredicateAND();
		
		PredicateTestHarness predicate1 = JunitFactory.eINSTANCE.createPredicateTestHarness();
		predicate1.setExecutionAllowed(true);
		and.getConditions().add(predicate1);
		
		PredicateTestHarness predicate2 = JunitFactory.eINSTANCE.createPredicateTestHarness();
		predicate2.setExecutionAllowed(true);
		and.getConditions().add(predicate2);
		
		component.getComponentOrchestrationStrategy().setCondition(and);
		getEngine().run();
		assertThat(component.getRunningState(), is(notNullValue()));
		assertThat(component.getState(getContext()), is(instanceOf(WorkflowSuccessState.class)));
	}

	/**
	 * Test that a workflow component will NOT be executed with two condition set to false
	 */
	@Test
	public void testConditionalExecutionTwoConditionsFalse()
	{
		WorkflowPredicateOR or = OrchestrationFactory.eINSTANCE.createWorkflowPredicateOR();
		
		PredicateTestHarness predicate1 = JunitFactory.eINSTANCE.createPredicateTestHarness();
		predicate1.setExecutionAllowed(false);
		or.getConditions().add(predicate1);
		
		PredicateTestHarness predicate2 = JunitFactory.eINSTANCE.createPredicateTestHarness();
		predicate2.setExecutionAllowed(false);
		or.getConditions().add(predicate2);
		
		component.getComponentOrchestrationStrategy().setCondition(or);
		getEngine().run();
		assertThat(component.getRunningState(), is(nullValue()));
		assertThat(component.getState(getContext()), is(instanceOf(WorkflowSkippedState.class)));
	}

	/**
	 * Test that a workflow component will NOT be executed with one condition set to true and the other to false
	 */
	@Test
	public void testConditionalANDExecutionTwoConditionsMixed()
	{
		WorkflowPredicateAND and = OrchestrationFactory.eINSTANCE.createWorkflowPredicateAND();
		
		PredicateTestHarness predicate1 = JunitFactory.eINSTANCE.createPredicateTestHarness();
		predicate1.setExecutionAllowed(false);
		and.getConditions().add(predicate1);
		
		PredicateTestHarness predicate2 = JunitFactory.eINSTANCE.createPredicateTestHarness();
		predicate2.setExecutionAllowed(true);
		and.getConditions().add(predicate2);
		
		component.getComponentOrchestrationStrategy().setCondition(and);
		getEngine().run();
		assertThat(component.getRunningState(), is(nullValue()));
		
		predicate1.setExecutionAllowed(true);
		predicate2.setExecutionAllowed(false);
		
		getEngine().run();
		assertThat(component.getRunningState(), is(nullValue()));
		assertThat(component.getState(getContext()), is(instanceOf(WorkflowSkippedState.class)));
	}

	/**
	 * Test that a workflow component will be executed with one condition set to true and the other to false
	 */
	@Test
	public void testConditionalORExecutionTwoConditionsMixed()
	{
		WorkflowPredicateOR or = OrchestrationFactory.eINSTANCE.createWorkflowPredicateOR();
		
		PredicateTestHarness predicate1 = JunitFactory.eINSTANCE.createPredicateTestHarness();
		predicate1.setExecutionAllowed(false);
		or.getConditions().add(predicate1);
		
		PredicateTestHarness predicate2 = JunitFactory.eINSTANCE.createPredicateTestHarness();
		predicate2.setExecutionAllowed(true);
		or.getConditions().add(predicate2);
		
		component.getComponentOrchestrationStrategy().setCondition(or);
		getEngine().run();
		assertThat(component.getRunningState(), is(notNullValue()));
		assertThat(component.getState(getContext()), is(instanceOf(WorkflowSuccessState.class)));
		
		component.setEndState(StateFactory.eINSTANCE.createWorkflowSuccessState());
		component.setRunningState(null);
		predicate1.setExecutionAllowed(true);
		predicate2.setExecutionAllowed(false);
		
		getEngine().run();
		assertThat(component.getRunningState(), is(notNullValue()));
		assertThat(component.getState(getContext()), is(instanceOf(WorkflowSuccessState.class)));
	}

	/**
	 * Test that a workflow component will not re-run if first run is successful
	 */
	@Test
	public void testRerunExecutionPredicateWithSuccess()
	{
		WorkflowRerunPredicate predicate = OrchestrationFactory.eINSTANCE.createWorkflowRerunPredicate();
		component.getComponentOrchestrationStrategy().setCondition(predicate);
		getEngine().run();
		assertThat(component.getRunningState(), is(notNullValue()));
		assertThat(component.getState(getContext()), is(instanceOf(WorkflowSuccessState.class)));
		
		component.setRunningState(null);
		getEngine().run();
		assertThat(component.getRunningState(), is(nullValue()));
		assertThat(component.getState(getContext()), is(instanceOf(WorkflowSkippedState.class)));
	}
	
	/**
	 * Test that a workflow component will re-run if the first run fails
	 */
	@Test
	public void testRerunExecutionPredicateWithFailure()
	{
		WorkflowRerunPredicate predicate = OrchestrationFactory.eINSTANCE.createWorkflowRerunPredicate();
		component.getComponentOrchestrationStrategy().setCondition(predicate);
		component.setEndState(StateFactory.eINSTANCE.createWorkflowFailedState());
		getEngine().run();
		assertThat(component.getRunningState(), is(notNullValue()));
		
		component.setRunningState(null);
		getEngine().run();
		assertThat(component.getRunningState(), is(notNullValue()));
	}

	/**
	 * Test that a workflow component will re-run if the first run has an error
	 */
	@Test
	public void testRerunExecutionPredicateWithError()
	{
		WorkflowRerunPredicate predicate = OrchestrationFactory.eINSTANCE.createWorkflowRerunPredicate();
		component.getComponentOrchestrationStrategy().setCondition(predicate);
		component.setEndState(StateFactory.eINSTANCE.createWorkflowErrorState());
		getEngine().run();
		assertThat(component.getRunningState(), is(notNullValue()));
		
		component.setRunningState(null);
		getEngine().run();
		assertThat(component.getRunningState(), is(notNullValue()));
	}

	/**
	 * Test that all attributes are properly persisted with a component
	 * @throws IOException
	 */
	@Test
	public void testPersistence() throws IOException
	{
		WorkflowRerunPredicate predicate = OrchestrationFactory.eINSTANCE.createWorkflowRerunPredicate();
		component.getComponentOrchestrationStrategy().setCondition(predicate);

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
		assertThat(persistedTestHarness.getComponentOrchestrationStrategy().getCondition(), is(notNullValue()));
		assertThat(persistedTestHarness.getParameters().size(), is(1));
	}
	
	private UnitOfWorkTestHarness component;
}
