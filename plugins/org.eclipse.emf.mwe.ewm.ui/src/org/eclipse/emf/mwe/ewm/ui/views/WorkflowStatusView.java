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
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.part.ViewPart;

/**
 * @author bhunt
 *
 */
public class WorkflowStatusView extends ViewPart
{
	private TreeViewer viewer;
	private WorkflowStatusLabelProvider labelProvider;

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent)
	{
		parent.setLayout(new FillLayout());
		
		viewer = new TreeViewer(parent, SWT.V_SCROLL | SWT.H_SCROLL);
		Tree tree = viewer.getTree();
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		tree.setHeaderVisible(true);
		tree.setLinesVisible(true);
		
		TreeColumn nameColumn = new TreeColumn(tree, SWT.NONE);
		nameColumn.setText("Stage");
		nameColumn.setWidth(150);
		
		TreeColumn startTime = new TreeColumn(tree, SWT.NONE);
		startTime.setText("Start");
		startTime.setWidth(250);
		
		TreeColumn endTime = new TreeColumn(tree, SWT.NONE);
		endTime.setText("End");
		endTime.setWidth(250);
		
		TreeColumn status = new TreeColumn(tree, SWT.NONE);
		status.setText("Status");
		status.setWidth(150);
		
		viewer.setContentProvider(new WorkflowStatusContentProvider());
		labelProvider = new WorkflowStatusLabelProvider();
		viewer.setLabelProvider(labelProvider);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus()
	{
		viewer.getTree().setFocus();
	}

	public void setContext(WorkflowContext context)
	{
		labelProvider.setContext(context);
		viewer.setInput(context);
	}
}
