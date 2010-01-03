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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowParameter;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;
import org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.WorkflowTransactionalContext;
import org.eclipse.emf.transaction.RecordingCommand;

/**
 * @author bhunt
 *
 */
public class WorkflowSetParameterValueCommand extends RecordingCommand
{

	/**
	 * @param domain
	 * @param label
	 */
	public WorkflowSetParameterValueCommand(WorkflowTransactionalContext context, WorkflowParameter parameter, EObject value)
	{
		super(context.getEditingDomain());
		this.context = context;
		this.parameter = parameter;
		this.value = value;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.transaction.RecordingCommand#doExecute()
	 */
	@Override
	protected void doExecute()
	{
		context.getParameters().put(parameter, value);
	}

	private WorkflowContext context;
	private WorkflowParameter parameter;
	private EObject value;
}
