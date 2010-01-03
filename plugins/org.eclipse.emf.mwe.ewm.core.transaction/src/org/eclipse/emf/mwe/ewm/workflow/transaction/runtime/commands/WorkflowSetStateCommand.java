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
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowState;
import org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.WorkflowTransactionalContext;
import org.eclipse.emf.transaction.RecordingCommand;

/**
 * @author bhunt
 *
 */
public class WorkflowSetStateCommand extends RecordingCommand
{

	/**
	 * @param domain
	 * @param label
	 */
	public WorkflowSetStateCommand(WorkflowTransactionalContext context, WorkflowComponent component, WorkflowState state)
	{
		super(context.getEditingDomain());
		this.context = context;
		this.component = component;
		this.state = state;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.transaction.RecordingCommand#doExecute()
	 */
	@Override
	protected void doExecute()
	{
		context.getStates().put(component, state);
	}

	private WorkflowContext context;
	private WorkflowComponent component;
	private WorkflowState state;
}
