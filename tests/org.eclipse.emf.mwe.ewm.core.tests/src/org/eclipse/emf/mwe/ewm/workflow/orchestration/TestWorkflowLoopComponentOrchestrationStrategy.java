/*******************************************************************************
 * Copyright (c) 2009 Bryan Hunt.
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

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowFactory;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowTestHarness;
import org.eclipse.emf.mwe.ewm.workflow.junit.UnitOfWorkTestHarness;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRuntimeException;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.StateFactory;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowSkippedState;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowSuccessState;
import org.junit.Before;
import org.junit.Test;

/**
 * @author bhunt
 *
 */
public class TestWorkflowLoopComponentOrchestrationStrategy extends WorkflowTestHarness
{
	@Before
	public void setUp() throws Exception
	{
		strategy = OrchestrationFactory.eINSTANCE.createWorkflowLoopComponentOrchestrationStrategy();
		component = createComponent("Test", 0, StateFactory.eINSTANCE.createWorkflowSuccessState());
		component.setComponentOrchestrationStrategy(strategy);
		getEngine().setWorkflow(component);
	}

	@Test
	public void testNoExecute() throws WorkflowRuntimeException
	{
		WorkflowParameterPredicate predicate = OrchestrationFactory.eINSTANCE.createWorkflowParameterPredicate();
		strategy.setLoopCondition(predicate);
		
		WorkflowParameter parameter = WorkflowFactory.eINSTANCE.createWorkflowParameter();
		parameter.setType(EcorePackage.Literals.EBOOLEAN);
		parameter.setValueStrategy(WorkflowFactory.eINSTANCE.createWorkflowParameterSimpleValueStrategy());
		component.getParameters().add(parameter);
		predicate.setParameter(parameter);

		parameter.setValue(getContext(), Boolean.FALSE);
		getEngine().run();
		assertThat(getContext().getState(component), is(instanceOf(WorkflowSkippedState.class)));
	}
	
	@Test
	public void testExecuteOnce() throws WorkflowRuntimeException
	{
		WorkflowParameterPredicate predicate = OrchestrationFactory.eINSTANCE.createWorkflowParameterPredicate();
		strategy.setLoopCondition(predicate);
		
		WorkflowParameter parameter = WorkflowFactory.eINSTANCE.createWorkflowParameter();
		parameter.setType(EcorePackage.Literals.EBOOLEAN);
		parameter.setValueStrategy(WorkflowFactory.eINSTANCE.createWorkflowParameterSimpleValueStrategy());
		component.getParameters().add(parameter);
		component.setConditionalLoopParameter(parameter);
		predicate.setParameter(parameter);

		parameter.setValue(getContext(), Boolean.TRUE);
		getEngine().run();
		assertThat(getContext().getState(component), is(instanceOf(WorkflowSuccessState.class)));
		assertThat(component.getExecutionCount(), is(1));
	}
	
	@Test
	public void testExecuteNTimes() throws WorkflowRuntimeException
	{
		WorkflowLoopCountPredicate predicate = OrchestrationFactory.eINSTANCE.createWorkflowLoopCountPredicate();
		strategy.setLoopCondition(predicate);
		
		WorkflowParameter currentCountParameter = WorkflowFactory.eINSTANCE.createWorkflowParameter();
		currentCountParameter.setType(EcorePackage.Literals.EINT);
		currentCountParameter.setValueStrategy(WorkflowFactory.eINSTANCE.createWorkflowParameterSimpleValueStrategy());
		predicate.setCurrentCount(currentCountParameter);
		
		WorkflowParameter loopCountParameter = WorkflowFactory.eINSTANCE.createWorkflowParameter();
		loopCountParameter.setType(EcorePackage.Literals.EINT);
		loopCountParameter.setValueStrategy(WorkflowFactory.eINSTANCE.createWorkflowParameterSimpleValueStrategy());
		predicate.setLoopCount(loopCountParameter);

		loopCountParameter.setValue(getContext(), 3);
		getEngine().run();
		assertThat(getContext().getState(component), is(instanceOf(WorkflowSuccessState.class)));
		assertThat(component.getExecutionCount(), is(3));
	}
	
	private WorkflowLoopComponentOrchestrationStrategy strategy;
	private UnitOfWorkTestHarness component;
}
