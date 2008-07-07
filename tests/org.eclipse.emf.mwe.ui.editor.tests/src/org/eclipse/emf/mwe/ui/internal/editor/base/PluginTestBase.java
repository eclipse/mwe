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

package org.eclipse.emf.mwe.ui.internal.editor.base;

import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.mwe.ui.internal.editor.utils.ProjectCreator;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.2 $
 */

public abstract class PluginTestBase extends TestCase {

	private static final String MWE_UTILS_PROJECT = "org.eclipse.emf.mwe.utils";

	private static final String XTEND_PROJECT = "org.eclipse.xtend";

	protected IProject project;

	protected abstract String getProjectName();

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		createProject(getProjectName());
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		if (project != null) {
			project.delete(true, true, new NullProgressMonitor());
		}
	}

	private void createProject(final String projectName) {
		final Set<String> requiredBundles = new HashSet<String>();
		requiredBundles.add(XTEND_PROJECT);
		requiredBundles.add(MWE_UTILS_PROJECT);

		project = ProjectCreator.createProject(projectName, requiredBundles);
	}

}
