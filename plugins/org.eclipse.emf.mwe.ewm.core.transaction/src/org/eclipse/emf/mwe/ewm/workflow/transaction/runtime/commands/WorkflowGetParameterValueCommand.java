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
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowParameterValueProxy;
import org.eclipse.emf.transaction.RunnableWithResult;

/**
 * @author bhunt
 *
 */
public class WorkflowGetParameterValueCommand extends RunnableWithResult.Impl<EObject>
{
	public WorkflowGetParameterValueCommand(WorkflowContext context, WorkflowParameter parameter)
	{
		this.context = context;
		this.parameter = parameter;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	public void run()
	{
		EObject currentValue = context.getParameters().get(parameter);
		
		if(currentValue instanceof WorkflowParameterValueProxy)
		{
			WorkflowParameterValueProxy proxy = (WorkflowParameterValueProxy) currentValue;
			setResult(proxy.getTarget());
		}
		else
			setResult(currentValue);
	}

	private WorkflowContext context;
	private WorkflowParameter parameter;
}
