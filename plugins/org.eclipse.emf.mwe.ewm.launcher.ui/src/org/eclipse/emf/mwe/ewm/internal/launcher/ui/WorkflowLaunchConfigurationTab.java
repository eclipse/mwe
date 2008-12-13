/*******************************************************************************
 * Copyright (c) 2008 Bryan Hunt.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bryan Hunt - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.ewm.internal.launcher.ui;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.emf.mwe.ewm.launcher.IWorkflowLauncherConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ResourceSelectionDialog;

public class WorkflowLaunchConfigurationTab extends AbstractLaunchConfigurationTab
{
	private Text workflowPath;
	private Text contextPath;

	public void createControl(Composite parent)
	{
		final Composite control = new Composite(parent, SWT.NONE);
		setControl(control);

		control.setLayout(new GridLayout(2, false));

		Label workflowLabel = new Label(control, SWT.NONE);
		workflowLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		workflowLabel.setText("Workflow:");
		
		workflowPath = new Text(control, SWT.SINGLE | SWT.LEAD | SWT.BORDER);
		workflowPath.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		
		Composite workflowButtons = new Composite(control, SWT.NONE);
		workflowButtons.setLayout(new GridLayout(2, false));
		GridData workflowButtonsLayoutData = new GridData(SWT.RIGHT, SWT.CENTER, true, false);
		workflowButtonsLayoutData.horizontalSpan = 2;
		workflowButtons.setLayoutData(workflowButtonsLayoutData);
		
		Button workflowFileBrowseButton = new Button(workflowButtons, SWT.PUSH);
		workflowFileBrowseButton.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false));
		workflowFileBrowseButton.setText("Browse File System...");

		Button workflowWorkspaceBrowseButton = new Button(workflowButtons, SWT.PUSH);
		workflowWorkspaceBrowseButton.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false));
		workflowWorkspaceBrowseButton.setText("Browse Workspace...");

		Label contextLabel = new Label(control, SWT.NONE);
		contextLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		contextLabel.setText("Context:");
		
		contextPath = new Text(control, SWT.SINGLE | SWT.LEAD | SWT.BORDER);
		contextPath.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		
		Composite contextButtons = new Composite(control, SWT.NONE);
		contextButtons.setLayout(new GridLayout(2, false));
		GridData contextButtonsLayoutData = new GridData(SWT.RIGHT, SWT.CENTER, true, false);
		contextButtonsLayoutData.horizontalSpan = 2;
		contextButtons.setLayoutData(contextButtonsLayoutData);

		Button contextFileBrowseButton = new Button(contextButtons, SWT.PUSH);
		contextFileBrowseButton.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false));
		contextFileBrowseButton.setText("Browse File System...");

		Button contextWorkspaceBrowseButton = new Button(contextButtons, SWT.PUSH);
		contextWorkspaceBrowseButton.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false));
		contextWorkspaceBrowseButton.setText("Browse Workspace...");

		workflowPath.addModifyListener(new ModifyListener()
		{
			public void modifyText(ModifyEvent e)
			{
				setDirty(true);
				updateLaunchConfigurationDialog();
			}
		});

		contextPath.addModifyListener(new ModifyListener()
		{
			public void modifyText(ModifyEvent e)
			{
				setDirty(true);
				updateLaunchConfigurationDialog();
			}
		});

		workflowWorkspaceBrowseButton.addSelectionListener(new SelectionAdapter()
		{
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				ResourceSelectionDialog dialog = new ResourceSelectionDialog(control.getShell(), ResourcesPlugin.getWorkspace().getRoot(), "Select Workflow");
				
				if(dialog.open() == ResourceSelectionDialog.OK)
				{
					Object[] results = dialog.getResult();
					
					if(results.length > 0 && results[0] instanceof IResource)
						workflowPath.setText("platform:/resource" + ((IResource) results[0]).getFullPath().toString());
				}
			}
		});
		
		workflowFileBrowseButton.addSelectionListener(new SelectionAdapter()
		{
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				FileDialog dialog = new FileDialog(getShell(), SWT.OPEN);
				String path = dialog.open();
				
				if(path != null)
					workflowPath.setText("file:/" + path);
			}
		});

		contextWorkspaceBrowseButton.addSelectionListener(new SelectionAdapter()
		{
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				ResourceSelectionDialog dialog = new ResourceSelectionDialog(control.getShell(), ResourcesPlugin.getWorkspace().getRoot(), "Select Context");
				
				if(dialog.open() == ResourceSelectionDialog.OK)
				{
					Object[] results = dialog.getResult();
					
					if(results.length > 0 && results[0] instanceof IResource)
						contextPath.setText("platform:/resource" + ((IResource) results[0]).getFullPath().toString());
				}
			}
		});

		contextFileBrowseButton.addSelectionListener(new SelectionAdapter()
		{
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				FileDialog dialog = new FileDialog(getShell(), SWT.OPEN);
				String path = dialog.open();
				
				if(path != null)
					contextPath.setText("file:/" + path);
			}
		});
	}

	public String getName()
	{
		return "Workflow";
	}

	public void initializeFrom(ILaunchConfiguration configuration)
	{
		try
		{
			workflowPath.setText(configuration.getAttribute(IWorkflowLauncherConstants.ATTR_WORKFLOW_URI, ""));
		}
		catch (CoreException e)
		{
			workflowPath.setText("");
		}

		try
		{
			contextPath.setText(configuration.getAttribute(IWorkflowLauncherConstants.ATTR_CONTEXT_URI, ""));
		}
		catch (CoreException e)
		{
			contextPath.setText("");
		}
	}

	public void performApply(ILaunchConfigurationWorkingCopy configuration)
	{
		configuration.setAttribute(IWorkflowLauncherConstants.ATTR_WORKFLOW_URI, workflowPath.getText());
		configuration.setAttribute(IWorkflowLauncherConstants.ATTR_CONTEXT_URI, contextPath.getText());
		setDirty(false);
	}

	public void setDefaults(ILaunchConfigurationWorkingCopy configuration)
	{}
}
