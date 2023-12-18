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
package org.eclipse.emf.mwe.core.customizer;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorkflowCustomization {

	private static Map<String,Class<?>> keywordmapping = new HashMap<String,Class<?>>();

	private static final Logger logger = LoggerFactory.getLogger(WorkflowCustomization.class);

	public static void registerKeywordMapping( String keyword, Class<?> componentClass ) {
		keywordmapping .put( keyword, componentClass );
	}

	public static void registerKeywordMapping( String keyword, String componentClassName ) {
		try {
			keywordmapping .put( keyword, Class.forName(componentClassName) );
		} catch (ClassNotFoundException e) {
			logger.warn("Cannot resolve keyword class "+componentClassName);
		}
	}

	public static Class<?> getKeywordMapping( String keyword ) {
		return keywordmapping.get(keyword);
	}

	
}
