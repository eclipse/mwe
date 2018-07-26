/*******************************************************************************
 * Copyright (c) 2005 - 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.ui.debug.launching.ui;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaArgumentsTab;
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaClasspathTab;

/**
 * This class defines the available tabs of a workflow launch config dialog. Compared with the Java launch dialog
 * there is a special main tab.<br>
 * Carried over from Java are JavaArgumentsTab, JavaClasspathTab and CommonTab.<br>
 * There are no JavaJRETab, SourceLookupTab and EnvironmentTab.
 * 
 */
public class MWELaunchConfigTabGroup extends AbstractLaunchConfigurationTabGroup {

	@Override
	public void createTabs(final ILaunchConfigurationDialog dialog, final String mode) {
		setTabs(new ILaunchConfigurationTab[] { new MWELaunchConfigMainTab(), new JavaArgumentsTab(), new JavaClasspathTab(), new CommonTab() });
	}

}
