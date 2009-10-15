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

package org.eclipse.emf.mwe.ewm.workflow.runtime.util;

import org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowCompositeComponent;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowUnitOfWork;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;
import org.eclipse.emf.mwe.ewm.workflow.util.WorkflowSwitch;

/**
 * @author bhunt
 * 
 */
public class WorkflowLogResetter extends WorkflowSwitch<Boolean>
{
	public WorkflowLogResetter(WorkflowContext context)
	{
		this.context = context;
	}
	
	@Override
	public Boolean caseWorkflowCompositeComponent(WorkflowCompositeComponent object)
	{
		object.clearLog(context);

		for(WorkflowComponent component : object.getComponents())
			doSwitch(component);
		
		return Boolean.TRUE;
	}

	@Override
	public Boolean caseWorkflowUnitOfWork(WorkflowUnitOfWork object)
	{
		object.clearLog(context);
		return Boolean.TRUE;
	}

	private WorkflowContext context;
}
