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
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog;
import org.eclipse.emf.mwe.ewm.workflow.transaction.runtime.WorkflowTransactionalContext;

/**
 * @author bhunt
 *
 */
public class WorkflowLogErrorCommand extends WorkflowBaseLogCommand
{
	public WorkflowLogErrorCommand(WorkflowTransactionalContext context, WorkflowComponent component, String message)
	{
		super(context, component);
		this.message = message;
	}
	
	public void doExecute()
	{
		WorkflowLog log = getLog();
		log.logError(message);
	}

	private String message;
}
