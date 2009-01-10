/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.ewm.internal.launcher;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.mwe.ewm.launcher.IWorkflowLauncherConstants;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;

public class WorkflowLaunchConfigurationDelegate implements ILaunchConfigurationDelegate
{
	public void launch(final ILaunchConfiguration configuration, final String mode, final ILaunch launch, final IProgressMonitor monitor) throws CoreException
	{
		String workflowAttribute = configuration.getAttribute(IWorkflowLauncherConstants.ATTR_WORKFLOW_URI, "");
		String contextAttribute = configuration.getAttribute(IWorkflowLauncherConstants.ATTR_CONTEXT_URI, "");

		if (workflowAttribute.length() == 0)
			throw new CoreException(new Status(IStatus.ERROR, IWorkflowLauncherConstants.PLUGIN_ID, "Workflow model URI was not specified"));

		if (contextAttribute.length() == 0)
			throw new CoreException(new Status(IStatus.ERROR, IWorkflowLauncherConstants.PLUGIN_ID, "Workflow runtime context URI was not specified"));

		URI workflowURI = null;
		URI contextURI = null;
		
		try
		{
			workflowURI = URI.createURI(workflowAttribute);
			contextURI = URI.createURI(contextAttribute);
		}
		catch (Exception e)
		{
			if(workflowURI == null)
				throw new CoreException(new Status(IStatus.ERROR, IWorkflowLauncherConstants.PLUGIN_ID, "The workflow model URI is invalid", e));
			
			throw new CoreException(new Status(IStatus.ERROR, IWorkflowLauncherConstants.PLUGIN_ID, "The workflow runtime context URI is invalid", e));
		}

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		
		Resource workflowResource = null;
		Resource contextResource = null;
		
		try
		{
			workflowResource = resourceSet.getResource(workflowURI, true);
			contextResource = resourceSet.getResource(contextURI, true);
		}
		catch (Exception e)
		{
			if(workflowResource == null)
				throw new CoreException(new Status(IStatus.ERROR, IWorkflowLauncherConstants.PLUGIN_ID, "Failed to load the workflow model", e));
			
			throw new CoreException(new Status(IStatus.ERROR, IWorkflowLauncherConstants.PLUGIN_ID, "Failed to load the workflow runtime context", e));
		}

		WorkflowComponent workflow = null;
		WorkflowContext context = null;
		
		try
		{
			workflow = (WorkflowComponent) workflowResource.getContents().get(0);
			context = (WorkflowContext) contextResource.getContents().get(0);
		}
		catch (Exception e)
		{
			if(workflowResource == null)
				throw new CoreException(new Status(IStatus.ERROR, IWorkflowLauncherConstants.PLUGIN_ID, "The workflow model is invalid", e));

			throw new CoreException(new Status(IStatus.ERROR, IWorkflowLauncherConstants.PLUGIN_ID, "The workflow runtime context is invalid", e));
		}

		EcoreUtil.resolveAll(workflow);
		EcoreUtil.resolveAll(context);
		WorkflowProcess process = new WorkflowProcess(workflow, context, launch);
		launch.addProcess(process);
		process.start();
	}
}
