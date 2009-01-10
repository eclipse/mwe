/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.ewm.launcher;

/**
 * This interface provides the constants used by the workflow launcher.  The launch
 * configuration attributes should be specified by clients using the ATTR constants
 * defined in this interface.
 * 
 * @author bhunt
 *
 */
public interface IWorkflowLauncherConstants
{
	String PLUGIN_ID = "org.eclipse.emf.mwe.ewm.launcher.core";
	
	/**
	 * The ID of the launch configuration extension.
	 */
	String LAUNCH_CONFIGURATION = PLUGIN_ID + ".workflowLaunchConfigurationType";
	
	/**
	 * Launch configuration attribute specifying the URI of the workflow model to run.
	 * This attribute is required.
	 */
	String ATTR_WORKFLOW_URI = PLUGIN_ID + ".WorkflowURI";
	
	/**
	 * Launch configuration attribute specifying the URI of the workflow runtime context.
	 * This attribute is required.
	 */
	String ATTR_CONTEXT_URI = PLUGIN_ID + ".ContextURI";
}
