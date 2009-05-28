/*
 * Copyright (c) 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    committers of openArchitectureWare - initial API and implementation
 */

package org.eclipse.emf.mwe.ui.internal.editor.tests.typeutils;

import org.eclipse.emf.mwe.ui.internal.editor.base.PluginTestBase;
import org.eclipse.emf.mwe.ui.internal.editor.utils.TypeUtils;

public class TypeUtilsTests extends PluginTestBase {

	public void testGetJavaDoc() {
		final String javaDoc =
				TypeUtils.getJavaDoc(project, "java.lang.String");
		assertNotNull(javaDoc);
		assertTrue(javaDoc.length() > 0);
	}

	@Override
	protected String getProjectName() {
		return "typeutils.test";
	}
}
