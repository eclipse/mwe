/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.ui.util;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.di.util.ModelUtils;

import base.AbstractUITests;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.1 $
 */

public class ModelUtilsTest extends AbstractUITests {

	private static final String CONTENT = "test.ObjectB {\n" + "	multiEle = { name=\"Foo\" }\n"
			+ "	multiEle = :x { name=\"Bar\" }\n" + "	singleEle = x;\n" + "}";

	public void testGetProject() {
		final IFile file = createFile(project, WORKFLOW_NAME1, CONTENT);
		final File model = loadModelFile(file);
		assertNotNull(model);
		final IProject project = ModelUtils.getProject(model);
		assertNotNull(project);
		assertEquals(PROJECT_NAME, project.getName());
	}
}
