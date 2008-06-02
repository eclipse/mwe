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
 * @version $Revision: 1.1 $
 */

public class SubClassesTest extends ReflectionTestBase {

	public void testGetSubClasses() {
		final Class<?> baseClass =
			getClass("org.eclipse.emf.mwe.core.WorkflowComponent");
		assertNotNull(baseClass);
		final Set<Class<?>> subClasses =
			ReflectionManager.getSubClasses(project, baseClass, true);
		final Set<String> subClassNames =
			ReflectionManager.getFQNSet(subClasses);
		assertNotNull(subClasses);
		assertTrue(subClasses.size() >= 10);
		assertTrue(subClassNames.contains("org.eclipse.xtend.XtendComponent"));
	}
}
