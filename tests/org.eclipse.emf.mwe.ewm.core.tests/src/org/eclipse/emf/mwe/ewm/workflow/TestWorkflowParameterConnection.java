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
import static org.junit.Assert.assertThat;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimeFactory;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowRuntimeException;
import org.junit.Test;

/**
 * Test functionality of WorkflowParameterConnection
 * @author bhunt
 *
 */
public class TestWorkflowParameterConnection
{
	/**
	 * Test that the value from an output parameter is the value of a connected input parameter
	 * @throws WorkflowRuntimeException
	 */
	@Test
	public void testConnectedParameters() throws WorkflowRuntimeException
	{
		WorkflowParameter out = WorkflowFactory.eINSTANCE.createWorkflowParameter();
		out.setType(EcorePackage.eINSTANCE.getEString());
		out.setValueStrategy(WorkflowFactory.eINSTANCE.createWorkflowParameterSimpleValueStrategy());
		WorkflowParameter in = WorkflowFactory.eINSTANCE.createWorkflowParameter();
		in.setType(EcorePackage.eINSTANCE.getEString());
		in.setValueStrategy(WorkflowFactory.eINSTANCE.createWorkflowParameterSimpleValueStrategy());
		
		WorkflowParameterConnection connection = WorkflowFactory.eINSTANCE.createWorkflowParameterConnection();
		connection.setOutput(out);
		connection.getInputs().add(in);
		
		WorkflowContext context = RuntimeFactory.eINSTANCE.createWorkflowContext();
		out.setValue(context, "Hello");
		assertThat((String) in.getValue(context), is("Hello"));
	}
}
