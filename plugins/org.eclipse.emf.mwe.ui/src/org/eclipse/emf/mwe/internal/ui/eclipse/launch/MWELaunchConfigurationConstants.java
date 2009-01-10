/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.ui.eclipse.launch;

/**
 * Launch configuration constants that are used in addition to the <code>IJavaLaunchConfigurationConstants</code>
 * ones.
 * 
 */
public interface MWELaunchConfigurationConstants {

	public static final String ATTR_MWE_WORKFLOW_FILE = "startWorkflow";

	public static final String ATTR_MWE_JAVA_DEBUG_MODE = "java_debug";
	
	// must match with the launchConfigurationType id from plugin.xml
	public static final String WORKFLOW_LAUNCH_CONFIGURATION_TYPE_ID = "org.eclipse.emf.mwe.ui.MWELaunchConfigType";

}
