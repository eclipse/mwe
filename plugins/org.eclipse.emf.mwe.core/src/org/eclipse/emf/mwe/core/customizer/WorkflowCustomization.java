package org.eclipse.emf.mwe.core.customizer;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class WorkflowCustomization {

	private static Map<String,Class<?>> keywordmapping = new HashMap<String,Class<?>>();

	private static final Log logger = LogFactory.getLog(WorkflowCustomization.class);

	public static void registerKeywordMapping( final String keyword, final Class<?> componentClass ) {
		keywordmapping .put( keyword, componentClass );
	}
	
	public static void registerKeywordMapping( final String keyword, final String componentClassName ) {
		try {
			keywordmapping .put( keyword, Class.forName(componentClassName) );
		} catch (ClassNotFoundException e) {
			logger.warn("Cannot resolve keyword class "+componentClassName);
		}
	}
	
	public static Class<?> getKeywordMapping( final String keyword ) {
		return keywordmapping.get(keyword);
	}
	
	
}
