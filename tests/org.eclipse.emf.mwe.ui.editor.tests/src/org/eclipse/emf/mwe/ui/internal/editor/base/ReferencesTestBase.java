/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.emf.mwe.ui.internal.editor.base;

import java.lang.reflect.Field;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.mwe.ui.internal.editor.logging.Log;
import org.eclipse.emf.mwe.ui.internal.editor.utils.ProjectCreator;

public class ReferencesTestBase extends ParserTestBase {

	private static final String PROPERTY_EXTENSION = ".properties";

	private static final String PROPERTY_PREFIX = "prop";

	private static final String MWE_EXTENSION = ".mwe";

	private static final String RESOURCE_PREFIX = "RESOURCE_";

	private static final String RESOURCE_FOLDER = "res";

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.base.PluginTestBase#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		createResources();
	}

	@Override
	protected String getProjectName() {
		return "org.eclipse.emf.mwe.ui.editor.references";
	}

	private void createResources() {
		Class<?> clazz = getClass();
		IFolder folder = createFolder(RESOURCE_FOLDER);
		Field[] fields = clazz.getFields();
		for (Field f : fields) {
			try {
				String name = f.getName();
				Class<?> type = f.getType();
				if (name.startsWith(RESOURCE_PREFIX) && type.equals(String.class)) {
					String content = (String) f.get(this);
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
			catch (IllegalArgumentException e) {
				Log.logError("", e);
			}
			catch (IllegalAccessException e) {
				Log.logError("", e);
			}
		}
	}

	private IFolder createFolder(String folderName) {
		if (folderName == null)
			return null;

		try {
			IFolder folder = project.getFolder(folderName);
			if (!folder.exists()) {
				folder.create(true, true, new NullProgressMonitor());
			}

			return (folder.exists()) ? folder : null;
		}
		catch (CoreException e) {
			Log.logError("", e);
			return null;
		}
	}

	private String createName(Field field) {
		return field.getName().substring(RESOURCE_PREFIX.length()).toLowerCase();
	}

}
