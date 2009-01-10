/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.ewm.internal.launcher;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IStreamsProxy;
import org.eclipse.emf.mwe.ewm.workflow.WorkflowComponent;
import org.eclipse.emf.mwe.ewm.workflow.runtime.RuntimeFactory;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowContext;
import org.eclipse.emf.mwe.ewm.workflow.runtime.WorkflowEngine;
import org.eclipse.emf.mwe.ewm.workflow.runtime.state.WorkflowSuccessState;

public class WorkflowProcess extends PlatformObject implements IProcess
{
	public WorkflowProcess(final WorkflowComponent workflow, final WorkflowContext context, final ILaunch launch)
	{
		engine = RuntimeFactory.eINSTANCE.createWorkflowEngine();
		engine.setWorkflow(workflow);
		engine.setContext(context);
		this.launch = launch;
		attributes = new HashMap<String, String>();
		workflowThread = new Thread(engine);
	}

	public WorkflowProcess(final WorkflowEngine engine, final ILaunch launch)
	{
		this.engine = engine;
		this.launch = launch;
		attributes = new HashMap<String, String>();
		workflowThread = new Thread(engine);
	}

	public String getAttribute(final String key)
	{
		return attributes.get(key);
	}

	public int getExitValue() throws DebugException
	{
		if(!isTerminated())
			throw new DebugException(new Status(IStatus.ERROR, "org.eclipse.emf.mwe.ewm.launcher.core", "Exit value is not available until the process has terminated"));
		
		return engine.getContext().getStates().get(engine.getWorkflow()) instanceof WorkflowSuccessState ? 0 : 1;
	}

	public String getLabel()
	{
		return engine.getWorkflow().getName();
	}

	public ILaunch getLaunch()
	{
		return launch;
	}

	public IStreamsProxy getStreamsProxy()
	{
		return null;
	}

	public void start()
	{
		workflowThread.start();
	}

	public void setAttribute(final String key, final String value)
	{
		attributes.put(key, value);
	}

	@SuppressWarnings("unchecked")
	public Object getAdapter(final Class adapter)
	{
		// This implementation was taken from org.eclipse.debug.core.model.RuntimeProcess
		
		if (adapter.equals(IProcess.class))
			return this;
		
		if (adapter.equals(IDebugTarget.class))
		{
			ILaunch launch = getLaunch();
			IDebugTarget[] targets = launch.getDebugTargets();
		
			for (int i = 0; i < targets.length; i++)
			{
				if (this.equals(targets[i].getProcess()))
					return targets[i];
			}
		
			return null;
		}

		if (adapter.equals(ILaunch.class))
			return getLaunch();
		
		if (adapter.equals(ILaunchConfiguration.class))
			return getLaunch().getLaunchConfiguration();

		return super.getAdapter(adapter);
	}

	public boolean canTerminate()
	{
		return true;
	}

	public boolean isTerminated()
	{
		return !workflowThread.isAlive();
	}

	public void terminate() throws DebugException
	{
		workflowThread.interrupt();
	}

	private final WorkflowEngine engine;
	private final ILaunch launch;
	private final Map<String, String> attributes;
	private final Thread workflowThread;
}
