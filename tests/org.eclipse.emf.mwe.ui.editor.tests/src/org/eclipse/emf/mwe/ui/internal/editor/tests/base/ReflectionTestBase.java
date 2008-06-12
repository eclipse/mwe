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

package org.eclipse.emf.mwe.ui.internal.editor.tests.base;

import java.util.Set;

import org.eclipse.emf.mwe.ui.internal.editor.utils.ReflectionManager;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.4 $
 */

public class ReflectionTestBase extends PluginTestBase {

	protected boolean checkForSubstring(final Set<String> classNameSet,
			final String substring) {
		if (classNameSet == null || substring == null) {
			throw new IllegalArgumentException();
		}

		for (final String s : classNameSet) {
			if (s.contains(substring))
				return true;
		}
		return false;
	}

	protected Class<?> getClass(final String className) {
		if (className == null)
			return null;

		final Class<?> clazz = ReflectionManager.getClass(project, className);
		return clazz;
	}

	@Override
	protected String getProjectName() {
		return "reflection.test";
	}
}
