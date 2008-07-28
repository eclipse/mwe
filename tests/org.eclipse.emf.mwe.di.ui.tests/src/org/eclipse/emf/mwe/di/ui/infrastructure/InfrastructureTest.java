/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.ui.infrastructure;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.di.ui.extensibility.StaticTypeSystemRegistry;

import base.AbstractUITests;

public class InfrastructureTest extends AbstractUITests {

	private static final String WORKFLOW_FILE = "stubs/Workflow.mwe";
	private static final String CONTENT = "test.ObjectB {\n" + "	multiEle = { name=\"Foo\" }\n"
			+ "	multiEle = :x { name=\"Bar\" }\n" + "	singleEle = x;\n" + "}";

	public void testLoadModel() {
		final IFile file = createFile(project, WORKFLOW_NAME1, CONTENT);
		final File model = loadModelFile(file);
		assertNotNull(model);
	}

	public void testLocalResourceAccess() {
		final IFile file = createFile(project, WORKFLOW_NAME1, CONTENT);
		final File model = loadModelFile(file);
		assertNotNull(model);
		assertNotNull(model.eResource());
	}

	public void testLoadExternalModel() {
		final File model = loadModelFile(project, WORKFLOW_FILE);
		assertNotNull(model);
	}

	public void testTypeSystemRegistry() {
		final StaticTypeSystemRegistry registry = StaticTypeSystemRegistry.getInstance();
		assertNotNull(registry);
		final List<String> names = registry.getTypeSystemNames();
		assertEquals(3, names.size());
		assertTrue(names.get(0).contains("Java"));
		assertTrue(names.get(1).contains("EMF"));
		assertTrue(names.get(2).contains("Dummy"));

	}
}
