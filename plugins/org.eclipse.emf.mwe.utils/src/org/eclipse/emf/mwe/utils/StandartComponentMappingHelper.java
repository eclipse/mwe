package org.eclipse.emf.mwe.utils;

import org.eclipse.emf.mwe.core.customizer.WorkflowCustomization;

public class StandartComponentMappingHelper {

	public StandartComponentMappingHelper() {
		WorkflowCustomization.registerKeywordMapping("cleanDir",
				DirectoryCleaner.class.getName());
		WorkflowCustomization.registerKeywordMapping("read", Reader.class
				.getName());
		WorkflowCustomization.registerKeywordMapping("write", Writer.class
				.getName());
	}

}
