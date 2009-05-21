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
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowLog;

/**
 * @author bhunt
 *
 */
public class WorkflowLogDebugCommand extends WorkflowBaseLogCommand
{
	public WorkflowLogDebugCommand(WorkflowContext context, WorkflowComponent component, String message)
	{
		super(context, component);
		this.message = message;
	}
	
	public void doExecute()
	{
		WorkflowLog log = getLog();
		log.logDebug(message);
	}

	private String message;
}
