/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.utils;

import org.eclipse.emf.mwe.core.customizer.WorkflowCustomization;

public class StandardComponentMappingHelper {

	public StandardComponentMappingHelper() {
		WorkflowCustomization.registerKeywordMapping("cleanDir", DirectoryCleaner.class.getName());
		WorkflowCustomization.registerKeywordMapping("read", Reader.class.getName());
		WorkflowCustomization.registerKeywordMapping("write", Writer.class.getName());
	}

}
