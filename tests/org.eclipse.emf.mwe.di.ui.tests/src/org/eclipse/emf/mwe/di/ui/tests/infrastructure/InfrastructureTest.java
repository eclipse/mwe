/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.ui.tests.infrastructure;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.di.ui.base.AbstractUITests;
import org.eclipse.emf.mwe.di.ui.utils.TypeUtils;
import org.eclipse.jdt.core.IType;

public class InfrastructureTest extends AbstractUITests {
	private static final String CONTENT = "test.ObjectB {\n" + "	multiEle = { name=\"Foo\" }\n"
			+ "	multiEle = :x { name=\"Bar\" }\n" + "	singleEle = x;\n" + "}";

	public void testInfrastructure() {
		final IFile file = createFile(project, WORKFLOW_NAME, CONTENT);
		final File model = loadModelFile(file);
		assertNotNull(model);
	}

	public void testStubAccess() {
		final IType type = TypeUtils.findType(project, "stubs.ObjectA");
		assertNotNull(type);
	}
}
