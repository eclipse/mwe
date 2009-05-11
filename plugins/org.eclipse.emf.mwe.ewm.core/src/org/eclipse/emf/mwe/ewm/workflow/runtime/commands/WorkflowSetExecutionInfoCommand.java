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
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowComponentExecutionInfo;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;
import org.eclipse.emf.transaction.RecordingCommand;

/**
 * @author bhunt
 *
 */
public class WorkflowSetExecutionInfoCommand extends RecordingCommand
{

	/**
	 * @param domain
	 * @param label
	 */
	public WorkflowSetExecutionInfoCommand(WorkflowContext context, WorkflowComponent component, WorkflowComponentExecutionInfo info)
	{
		super(context.getEditingDomain());
		this.context = context;
		this.component = component;
		this.info = info;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.transaction.RecordingCommand#doExecute()
	 */
	@Override
	protected void doExecute()
	{
		context.getExecutionInfo().put(component, info);
	}

	private WorkflowContext context;
	private WorkflowComponent component;
	private WorkflowComponentExecutionInfo info;
}
