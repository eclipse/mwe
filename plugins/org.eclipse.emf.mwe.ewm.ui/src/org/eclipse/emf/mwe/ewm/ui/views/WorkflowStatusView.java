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

import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.part.ViewPart;

/**
 * @author bhunt
 * 
 */
public class WorkflowStatusView extends ViewPart
{
	public WorkflowStatusView()
	{}

	private TreeViewer statusViewer;
	private WorkflowStatusLabelProvider statusLabelProvider;
	private WorkflowLogContentProvider logContentProvider;
	private TableViewer logViewer;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent)
	{
		parent.setLayout(new FillLayout());
		SashForm sashForm = new SashForm(parent, SWT.HORIZONTAL);

		statusViewer = new TreeViewer(sashForm, SWT.V_SCROLL | SWT.H_SCROLL | SWT.FULL_SELECTION);
		Tree statusTree = statusViewer.getTree();
		statusTree.setHeaderVisible(true);
		statusTree.setLinesVisible(true);

		TreeColumn nameColumn = new TreeColumn(statusTree, SWT.NONE);
		nameColumn.setText("Stage");
		nameColumn.setWidth(150);

		TreeColumn status = new TreeColumn(statusTree, SWT.NONE);
		status.setText("Status");
		status.setWidth(150);

		TreeColumn startTime = new TreeColumn(statusTree, SWT.NONE);
		startTime.setText("Start");
		startTime.setWidth(250);

		TreeColumn endTime = new TreeColumn(statusTree, SWT.NONE);
		endTime.setText("End");
		endTime.setWidth(250);

		statusViewer.setContentProvider(new WorkflowStatusContentProvider());
		statusLabelProvider = new WorkflowStatusLabelProvider();
		statusViewer.setLabelProvider(statusLabelProvider);

		logViewer = new TableViewer(sashForm, SWT.V_SCROLL | SWT.H_SCROLL);
		Table logTable = logViewer.getTable();
		logTable.setHeaderVisible(true);
		logTable.setLinesVisible(true);

		TableColumn description = new TableColumn(logTable, SWT.NONE);
		description.setText("Description");
		description.setWidth(350);

		TableColumn timestamp = new TableColumn(logTable, SWT.NONE);
		timestamp.setText("Timestamp");
		timestamp.setWidth(200);

		logContentProvider = new WorkflowLogContentProvider();
		logViewer.setContentProvider(logContentProvider);
		logViewer.setLabelProvider(new WorkflowLogLabelProvider());
		sashForm.setWeights(new int[] {50, 50});

		statusViewer.addSelectionChangedListener(new ISelectionChangedListener()
		{
			public void selectionChanged(SelectionChangedEvent event)
			{
				IStructuredSelection selection = (IStructuredSelection) event.getSelection();
				logViewer.setInput(selection.getFirstElement());
			}
		});
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus()
	{
		statusViewer.getTree().setFocus();
	}

	public void setContext(WorkflowContext context)
	{
		statusLabelProvider.setContext(context);
		logContentProvider.setContext(context);
		statusViewer.setInput(context);
	}
}
