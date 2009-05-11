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

package org.eclipse.emf.mwe.ewm.workflow.runtime.commands;

import org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent;
import org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimeFactory;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog;
import org.eclipse.emf.transaction.RunnableWithResult;

/**
 * @author bhunt
 *
 */
public class WorkflowGetLogCommand extends RunnableWithResult.Impl<WorkflowLog>
{
	public WorkflowGetLogCommand(WorkflowContext context, WorkflowComponent component)
	{
		this.context = context;
		this.component = component;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	public void run()
	{
		WorkflowLog log = context.getLog().get(component);
		
		if(log == null)
		{
			log = RuntimeFactory.eINSTANCE.createWorkflowLog();
			log.setLogLevel(context.getLogLevel());
			context.getLog().put(component, log);
		}
		
		setResult(log);
	}

	private WorkflowContext context;
	private WorkflowComponent component;
}
