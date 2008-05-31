/*
 * Copyright (c) 2008 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    committers of openArchitectureWare - initial API and implementation
 */

package org.eclipse.emf.mwe.ui.internal.editor.tests.reflection;

import java.util.Set;

import org.eclipse.emf.mwe.ui.internal.editor.tests.base.ReflectionTestBase;
import org.eclipse.emf.mwe.ui.internal.editor.utils.ReflectionManager;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.2 $
 */

public class PropertyNamesTest extends ReflectionTestBase {

	public void testSettablePropertyNames() {
		final Class<?> clazz =
			getClass("org.eclipse.xtend.XtendComponent");

		if (clazz == null) {
			fail();
		}

		final Set<String> propertyNames =
			ReflectionManager.getSettableProperties(clazz);
		assertTrue(propertyNames.size() >= 17);
		assertTrue(propertyNames.contains("extensionAdvice"));
		assertTrue(propertyNames.contains("invoke"));
		assertTrue(propertyNames.contains("outputSlot"));
	}
}
