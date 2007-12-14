/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
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
