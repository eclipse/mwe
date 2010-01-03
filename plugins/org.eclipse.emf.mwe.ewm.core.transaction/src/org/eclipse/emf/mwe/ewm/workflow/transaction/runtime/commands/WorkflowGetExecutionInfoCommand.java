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

package org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.commands;

import org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowComponentExecutionInfo;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;
import org.eclipse.emf.transaction.RunnableWithResult;

/**
 * @author bhunt
 *
 */
public class WorkflowGetExecutionInfoCommand extends RunnableWithResult.Impl<WorkflowComponentExecutionInfo>
{
	public WorkflowGetExecutionInfoCommand(WorkflowContext context, WorkflowComponent component)
	{
		this.context = context;
		this.component = component;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	public void run()
	{
		setResult(context.getExecutionInfo().get(component));
	}

	private WorkflowContext context;
	private WorkflowComponent component;
}
