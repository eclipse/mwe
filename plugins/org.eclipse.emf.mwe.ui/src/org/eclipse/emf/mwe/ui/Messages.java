/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.emf.mwe.ui;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.emf.mwe.ui.messages"; //$NON-NLS-1$
	public static String EnableDisableBreakpointAction_Description;
	public static String EnableDisableBreakpointAction_DisableAction;
	public static String EnableDisableBreakpointAction_EnableAction;
	public static String MWELaunchConfigMainTab_Browse;
	public static String MWELaunchConfigMainTab_initialWorkflowFile;
	public static String MWELaunchConfigMainTab_JavaDebug;
	public static String MWELaunchConfigMainTab_Main;
	public static String MWELaunchConfigMainTab_NoSuchFile;
	public static String MWELaunchConfigMainTab_Project;
	public static String MWELaunchConfigMainTab_ProjectSelectDlgMessage;
	public static String MWELaunchConfigMainTab_ProjectSelectDlgTitle;
	public static String MWELaunchConfigMainTab_Search;
	public static String MWELaunchConfigMainTab_StopInMain;
	public static String MWELaunchConfigMainTab_WorkflowPrompt;
	public static String MWELaunchConfigMainTab_WorkflowSelectDlgMessage;
	public static String MWELaunchConfigMainTab_WorkflowSelectDlgTitle;
	public static String MWELaunchShortcut_ExecutionError;
	public static String MWELaunchShortcut_NeededonClasspath;
	public static String MWELaunchShortcut_NeededVMArguments;
	public static String ToggleBreakpointAction_Description;
	public static String ToggleBreakpointAction_Title;
	public static String NewWorkflowFileWizard_DefaultFileName;
	public static String NewWorkflowFileWizard_DialogTitle;
	public static String NewWorkflowFileWizard_Extension;
	public static String NewWorkflowFileWizard_WindowDescription;
	public static String NewWorkflowFileWizard_WindowTitle;
	public static String NewWorkflowFileWizard_WrongExtension;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
