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

package org.eclipse.emf.mwe.ui.editor.tests.reflection;

import java.util.Set;

import junit.framework.TestCase;

import org.eclipse.emf.mwe.ui.internal.editor.utils.ReflectionManager;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */

public class PropertyNamesTest extends TestCase {

	public void testSettablePropertyNames() {
		try {
			final Class<?> clazz =
					Class.forName("org.eclipse.xtend.XtendComponent");

			final Set<String> propertyNames =
					ReflectionManager.getSettableProperties(clazz);
			assertTrue(propertyNames.size() >= 17);
			assertTrue(propertyNames.contains("extensionAdvice"));
			assertTrue(propertyNames.contains("invoke"));
			assertTrue(propertyNames.contains("outputSlot"));
		} catch (final ClassNotFoundException e) {
			fail();
		}
	}
}
