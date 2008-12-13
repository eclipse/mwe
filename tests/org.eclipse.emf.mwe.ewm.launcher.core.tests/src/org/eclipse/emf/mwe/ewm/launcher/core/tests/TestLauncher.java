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
package org.eclipse.emf.mwe.ewm.launcher.core.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.ewm.launcher.IWorkflowLauncherConstants;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowTestHarness;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.StateFactory;
import org.junit.Test;

/**
 * @author bhunt
 * 
 */
public class TestLauncher extends WorkflowTestHarness
{
	@Test
	public void testLaunch() throws CoreException, IOException
	{
		URI workflowURI = URI.createFileURI(createTemporaryFile("workflow").getAbsolutePath());
		URI contextURI = URI.createFileURI(createTemporaryFile("context").getAbsolutePath());

		ResourceSet resourceSet = new ResourceSetImpl();
		Resource workflowResource = resourceSet.createResource(workflowURI);
		Resource contextResource = resourceSet.createResource(contextURI);

		WorkflowComponent component = createComponent("test", 0, StateFactory.eINSTANCE.createWorkflowSuccessState());
		workflowResource.getContents().add(component);
		contextResource.getContents().add(getContext());

		workflowResource.save(null);
		contextResource.save(null);

		ILaunchManager launchManager = DebugPlugin.getDefault().getLaunchManager();
		ILaunchConfigurationType launchConfigurationType = launchManager.getLaunchConfigurationType(IWorkflowLauncherConstants.LAUNCH_CONFIGURATION);

		ILaunchConfigurationWorkingCopy workingCopy = launchConfigurationType.newInstance(null, "junit");
		workingCopy.setAttribute(IWorkflowLauncherConstants.ATTR_WORKFLOW_URI, workflowURI.toString());
		workingCopy.setAttribute(IWorkflowLauncherConstants.ATTR_CONTEXT_URI, contextURI.toString());

		ILaunch launch = workingCopy.launch("run", new NullProgressMonitor());

		while (!launch.isTerminated())
		{
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{}
		}

		assertThat(launch.getProcesses()[0].getExitValue(), is(0));
	}
}
