/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.emf.mwe.core.config;

import org.eclipse.emf.mwe.core.issues.Issues;

public class GlobalConfigurationHolder {

	private static ConfigurationModel configModel = null;

	public static void setConfigurationModel(final ConfigurationModel cm, final Issues issues) {
		if (configModel != null) {
			if (!configModel.equals(cm)) {
				issues.addError("configuration model already set!");
			}
		}
		else {
			configModel = cm;
		}
	}

	public static ConfigurationModel getConfiguration() {
		return configModel;
	}

}
