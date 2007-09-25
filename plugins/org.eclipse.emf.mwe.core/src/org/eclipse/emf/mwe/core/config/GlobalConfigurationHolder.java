package org.eclipse.emf.mwe.core.config;

import org.eclipse.emf.mwe.core.issues.Issues;

public class GlobalConfigurationHolder {

	private static ConfigurationModel configModel = null;

	public static void setConfigurationModel( ConfigurationModel cm, Issues issues ) {
		if ( configModel != null ) {
			if ( !configModel.equals(cm)) {
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
