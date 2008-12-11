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
 * Test the functionality of WorkflowParameter
 * @author bhunt
 *
 */
public class TestWorkflowParameter
{
	/**
	 * Test that a parameter can get its value from a context
	 * @throws WorkflowRuntimeException
	 */
	@Test
	public void testGetValue() throws WorkflowRuntimeException
	{
		WorkflowParameter parameter = WorkflowFactory.eINSTANCE.createWorkflowParameter();
		parameter.setType(EcorePackage.eINSTANCE.getEString());
		parameter.setValueStrategy(WorkflowFactory.eINSTANCE.createWorkflowParameterSimpleValueStrategy());
		WorkflowContext context = RuntimeFactory.eINSTANCE.createWorkflowContext();
		parameter.setValue(context, "Hello");
		assertThat((String) parameter.getValue(context), is("Hello"));
	}
}
