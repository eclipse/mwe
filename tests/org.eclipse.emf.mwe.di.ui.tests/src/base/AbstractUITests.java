/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package base;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.di.AbstractTests;
import org.eclipse.emf.mwe.di.MWEStandaloneSetup;
import org.eclipse.emf.mwe.di.ui.utils.ModelUtils;

import utils.ProjectCreator;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.5 $
 */

public class AbstractUITests extends AbstractTests {

	private static final String DI_BUNDLE = "org.eclipse.emf.mwe.di";
	private static final String DI_UI_BUNDLE = "org.eclipse.emf.mwe.di.ui";
	private static final String DI_UI_TEST_BUNDLE = "org.eclipse.emf.mwe.di.ui.tests";

	protected static final String PROJECT_NAME = "uitest";
	protected static final String WORKFLOW_NAME1 = "test/workflow1.mwe";
	protected static final String WORKFLOW_NAME2 = "test/workflow2.mwe";

	protected IProject project;

	/**
	 * @see org.eclipse.emf.mwe.di.AbstractTests#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		MWEStandaloneSetup.doSetup();
		project = createProject(PROJECT_NAME);
	}

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		if (project != null) {
			try {
				project.delete(true, new NullProgressMonitor());
			}
			catch (final Exception e) {
				// ignore
			}
		}
	}

	protected IFile createFile(final IProject project, final String fileName, final String content) {
		final String fullName = "src" + "/" + fileName;
		final IFile file = ProjectCreator.createFile(fullName, project, content, new NullProgressMonitor());
		return file;
	}

	protected IProject createProject(final String name) {
		if (name == null)
			return null;

		final Set<String> requiredBundles = new HashSet<String>();
		requiredBundles.add(DI_BUNDLE);
		requiredBundles.add(DI_UI_BUNDLE);
		requiredBundles.add(DI_UI_TEST_BUNDLE);
		final IProject project = ProjectCreator.createProject(name, requiredBundles);
		return project;
	}

	protected File loadModelFile(final IFile file) {
		return ModelUtils.loadModelFile(file);
	}
}
