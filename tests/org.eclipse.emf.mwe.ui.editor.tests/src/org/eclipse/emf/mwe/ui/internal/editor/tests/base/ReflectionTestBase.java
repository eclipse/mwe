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

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.mwe.ui.internal.editor.utils.ProjectCreator;
import org.eclipse.emf.mwe.ui.internal.editor.utils.ReflectionManager;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.3 $
 */

public class ReflectionTestBase extends TestCase {

	private static final String MWE_UTILS_PROJECT =
			"org.eclipse.emf.mwe.utils";

	private static final String XTEND_PROJECT = "org.eclipse.xtend";

	private static final String PROJECT_NAME = "reflection.testproject";

	protected IProject project;

	protected Class<?> getClass(final String className) {
		if (className == null)
			return null;

		final Class<?> clazz = ReflectionManager.getClass(project, className);
		return clazz;
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		createProject(PROJECT_NAME);
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		if (project != null) {
			project.delete(true, true, new NullProgressMonitor());
		}
	}

	private void createProject(final String projectName) throws CoreException,
	InvocationTargetException, InterruptedException {
		final Set<String> requiredBundles = new HashSet<String>();
		requiredBundles.add(XTEND_PROJECT);
		requiredBundles.add(MWE_UTILS_PROJECT);

		project = ProjectCreator.createProject(PROJECT_NAME, requiredBundles);
	}

	protected boolean checkForSubstring(Set<String> classNameSet, String substring) {
		if (classNameSet == null || substring == null)
			throw new IllegalArgumentException();
		
		for (String s : classNameSet) {
			if (s.contains(substring))
				return true;
		}
		return false;
	}
}
