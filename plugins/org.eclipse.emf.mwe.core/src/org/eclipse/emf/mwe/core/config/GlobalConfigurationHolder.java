/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.core.config;

import org.eclipse.emf.mwe.core.issues.Issues;

public class GlobalConfigurationHolder {

	private static ConfigurationModel configModel = null;

	/**
	 * Sets the configuration model. This method won't allow to overwrite the existing configuration.
	 * @param cm The configuration
	 * @param issues The Issues object to report errors to
	 */
	public static void setConfigurationModel( ConfigurationModel cm, Issues issues ) {
		setConfigurationModel(cm, issues, false);
	}

	/**
	 * Sets the configuration model
	 * @param cm The configuration
	 * @param issues The Issues object to report errors to
	 * @param overwrite Allow replacement of the configuration model when it was already set
	 */
	public static void setConfigurationModel( ConfigurationModel cm, Issues issues, boolean overwrite ) {
		if ( configModel != null ) {
			if ( !configModel.equals(cm) && !overwrite) {
				issues.addError("configuration model already set!");
			}
		} else {
			configModel = cm;
		}
	}
	
	public static ConfigurationModel getConfiguration() {
		return configModel;
	}

	
}
