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

package org.eclipse.emf.mwe.ui.internal.editor.base;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.mwe.ui.internal.editor.logging.Log;
import org.eclipse.emf.mwe.ui.internal.editor.utils.ProjectCreator;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.5 $
 */

public abstract class PluginTestBase extends TestCase {

	private static final String MWE_UTILS_PROJECT = "org.eclipse.emf.mwe.utils";

	private static final String XTEND_PROJECT = "org.eclipse.xtend";

	private static final String XTEXT_GENERATOR_PROJECT = "org.eclipse.xtext.generator";

	private static final String PROPERTY_EXTENSION = ".properties";

	private static final String PROPERTY_PREFIX = "prop";

	private static final String MWE_EXTENSION = ".mwe";

	private static final String RESOURCE_PREFIX = "RESOURCE_";

	private static final String RESOURCE_FOLDER = "res";

	protected IProject project;

	protected abstract String getProjectName();

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		createProject(getProjectName());
		createResources();
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
		requiredBundles.add(XTEXT_GENERATOR_PROJECT);
		requiredBundles.add(XTEND_PROJECT);
		requiredBundles.add(MWE_UTILS_PROJECT);

		project = ProjectCreator.createProject(projectName, requiredBundles);
	}

	private void createResources() {
		final Class<?> clazz = getClass();
		final IFolder folder = createFolder(RESOURCE_FOLDER);
		final Field[] fields = clazz.getFields();
		for (final Field f : fields) {
			try {
				final String name = f.getName();
				final Class<?> type = f.getType();
				if (name.startsWith(RESOURCE_PREFIX) && type.equals(String.class)) {
					final String content = (String) f.get(this);
					String fileName = createName(f);
					if (fileName.startsWith(PROPERTY_PREFIX)) {
						fileName += PROPERTY_EXTENSION;
					}
					else {
						fileName += MWE_EXTENSION;
					}

					ProjectCreator.createFile(fileName, folder, content, new NullProgressMonitor());
				}
			}
			catch (final IllegalArgumentException e) {
				Log.logError("", e);
			}
			catch (final IllegalAccessException e) {
				Log.logError("", e);
			}
		}
	}

	private IFolder createFolder(final String folderName) {
		if (folderName == null)
			return null;

		try {
			final IFolder folder = project.getFolder(folderName);
			if (!folder.exists()) {
				folder.create(true, true, new NullProgressMonitor());
			}

			return (folder.exists()) ? folder : null;
		}
		catch (final CoreException e) {
			Log.logError("", e);
			return null;
		}
	}

	private String createName(final Field field) {
		return field.getName().substring(RESOURCE_PREFIX.length()).toLowerCase();
	}
}
