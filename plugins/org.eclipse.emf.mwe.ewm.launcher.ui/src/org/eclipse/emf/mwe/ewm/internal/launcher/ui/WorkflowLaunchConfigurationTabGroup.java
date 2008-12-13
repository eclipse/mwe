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

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

public class WorkflowLaunchConfigurationTabGroup extends AbstractLaunchConfigurationTabGroup
{
	public void createTabs(ILaunchConfigurationDialog dialog, String mode)
	{
		ILaunchConfigurationTab[] tabs = {new WorkflowLaunchConfigurationTab(),  new CommonTab()};
		setTabs(tabs);
	}
}
