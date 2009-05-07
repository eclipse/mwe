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

package org.eclipse.emf.mwe.ewm.ui.views;

import java.util.Calendar;

import org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowComponentExecutionInfo;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowState;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

/**
 * @author bhunt
 * 
 */
public class WorkflowStatusLabelProvider extends LabelProvider implements ITableLabelProvider
{

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnImage(java.lang.Object, int)
	 */
	public Image getColumnImage(Object element, int columnIndex)
	{
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnText(java.lang.Object, int)
	 */
	public String getColumnText(Object element, int columnIndex)
	{
		WorkflowComponent component = (WorkflowComponent) element;

		switch (columnIndex)
		{
			case 0:
				return component.getName();

			case 1:
				WorkflowState state = context.getStates().get(component);
				return state != null ? state.getDisplayName() : "Idle";

			case 2:
			{
				Calendar calendar = Calendar.getInstance();
				WorkflowComponentExecutionInfo info = context.getExecutionInfo().get(component);

				if (info != null)
				{
					long startTime = info.getStartTime();

					if (startTime != 0)
					{
						calendar.setTimeInMillis(startTime);
						return calendar.getTime().toString();
					}
				}
				return "";
			}

			case 3:
			{
				Calendar calendar = Calendar.getInstance();
				WorkflowComponentExecutionInfo info = context.getExecutionInfo().get(component);

				if (info != null)
				{
					long endTime = info.getEndTime();

					if (endTime != 0)
					{
						calendar.setTimeInMillis(endTime);
						return calendar.getTime().toString();
					}
				}
				return "";
			}
		}

		return null;
	}

	public void setContext(WorkflowContext context)
	{
		this.context = context;
	}

	private WorkflowContext context;
}
