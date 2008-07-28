/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.ui.analyze.internal;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.MwePackage;

import base.AbstractAnalyzerTests;

public class EMFAnalyzerTest extends AbstractAnalyzerTests {

	public void testSimpleSetter1() {
		final String workflow = "import '" + MwePackage.eNS_URI + "'; QualifiedName {parts = 'foo'}";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(0, getMessageCount(diag));
	}

	public void testSimpleSetter2() {
		final String workflow = "import '" + MwePackage.eNS_URI + "'; QualifiedName {bar = 'foo'}";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(1, getMessageCount(diag));
		assertTrue(isError(diag, 0, NO_SETTER_MSG));
	}
}
