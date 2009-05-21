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
import org.eclipse.emf.transaction.RecordingCommand;

/**
 * @author bhunt
 *
 */
public abstract class WorkflowBaseLogCommand extends RecordingCommand
{
	public WorkflowBaseLogCommand(WorkflowContext context, WorkflowComponent component)
	{
		super(context.getEditingDomain());
		this.context = context;
		this.component = component;
	}
	
	public WorkflowLog getLog()
	{
		WorkflowLog log = context.getLog().get(component);
		
		if(log == null)
		{
			log = RuntimeFactory.eINSTANCE.createWorkflowLog();
			log.setLogLevel(context.getLogLevel());
			context.getLog().put(component, log);
		}
		
		return log;
	}

	private WorkflowContext context;
	private WorkflowComponent component;
}
