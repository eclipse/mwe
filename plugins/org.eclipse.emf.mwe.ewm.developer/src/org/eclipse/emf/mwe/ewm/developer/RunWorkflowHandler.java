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
package org.eclipse.emf.mwe.ewm.developer;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.ResourceSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;

public class RunWorkflowHandler extends AbstractHandler
{
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException
	{
		DebugUITools.getSelectedResource();
		final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();
		ResourceSelectionDialog dialog = new ResourceSelectionDialog(window.getShell(), ResourcesPlugin.getWorkspace().getRoot(), "Select the workflow context");

		if (dialog.open() == Window.CANCEL)
			return null;

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);

		IFile workflowFile = (IFile) selection.getFirstElement();
		URI workflowURI = URI.createPlatformResourceURI(workflowFile.getFullPath().toString(), false);
		Resource workflowResource = resourceSet.getResource(workflowURI, true);
		final WorkflowComponent workflow = (WorkflowComponent) workflowResource.getContents().get(0);

		IFile contextFile = (IFile) dialog.getResult()[0];
		URI contextURI = URI.createPlatformResourceURI(contextFile.getFullPath().toString(), false);
		final Resource contextResource = resourceSet.getResource(contextURI, true);
		final WorkflowContext context = (WorkflowContext) contextResource.getContents().get(0);

		context.setWorkflow(workflow);

		final WorkspaceModifyOperation operation = new WorkspaceModifyOperation()
		{
			@Override
			protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException
			{
				try
				{
					HashMap<String, Object> options = new HashMap<String, Object>();
					options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
					contextResource.save(options);
				}
				catch (IOException e)
				{
					throw new InvocationTargetException(e);
				}
			}
		};

		Job job = new Job("Workflow: " + workflow.getName())
		{
			@Override
			protected IStatus run(IProgressMonitor monitor)
			{
				workflow.start(context);

				Display.getDefault().asyncExec(new Runnable()
				{
					public void run()
					{
						try
						{
							window.run(true, false, operation);
						}
						catch (InvocationTargetException e)
						{
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						catch (InterruptedException e)
						{
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				});

				return Status.OK_STATUS;
			}
		};

		job.setUser(true);
		job.schedule();

		return null;
	}
}
