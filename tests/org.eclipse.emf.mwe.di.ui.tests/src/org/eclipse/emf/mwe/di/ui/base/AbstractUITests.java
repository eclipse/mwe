/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.ui.base;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.di.AbstractTests;
import org.eclipse.emf.mwe.di.MWEStandaloneSetup;
import org.eclipse.emf.mwe.di.ui.utils.ProjectCreator;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.5 $
 */

public class AbstractUITests extends AbstractTests {

	protected static final String WORKFLOW_NAME = "test/workflow.mwe";
	protected static final String PROJECT_NAME = "uitest";
	protected static final String DI_BUNDLE = "org.eclipse.emf.mwe.di";
	protected static final String DI_UI_BUNDLE = "org.eclipse.emf.mwe.di.ui";
	protected static final String DI_UI_TEST_BUNDLE = "org.eclipse.emf.mwe.di.ui.tests";

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

	protected File loadModelFile(final IFile file) {
		if (file == null || !file.exists())
			return null;

		try {
			final ResourceSet rs = new ResourceSetImpl();
			final Resource resource = rs.createResource(URI.createURI(file.getLocationURI().toString()));
			resource.load(file.getContents(), null);
			if (resource.getContents().isEmpty())
				return null;

			final EObject object = resource.getContents().iterator().next();
			return (File) object;
		}
		catch (final Exception e) {
			e.printStackTrace();
			return null;
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
}
