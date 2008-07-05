/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.ui.tests.analyzer;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.di.ui.analyze.internal.InternalAnalyzer;
import org.eclipse.emf.mwe.di.ui.base.AbstractUITests;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.4 $
 */

public class AnalyzerTest extends AbstractUITests {

	private static final String NO_SETTER_MSG = "No setter";

	public void testSimpleSetter1() {
		final String workflow = "stubs.ObjectA { name = 'test' }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME, workflow);
		final File file = loadModelFile(modelFile);
		final InternalAnalyzer analyzer = new InternalAnalyzer(modelFile);
		final BasicDiagnostic diag = new BasicDiagnostic();
		analyzer.validate(file, diag, null);
		assertEquals(0, getErrorCount(diag));
	}

	public void testSimpleSetter2() {
		final String workflow = "stubs.ObjectA { foo = 'test' }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME, workflow);
		final File file = loadModelFile(modelFile);
		final InternalAnalyzer analyzer = new InternalAnalyzer(modelFile);
		final BasicDiagnostic diag = new BasicDiagnostic();
		analyzer.validate(file, diag, null);
		assertEquals(1, getErrorCount(diag));
		assertTrue(isSetterError(diag, 0));
	}

	public void testComplexSetter1() {
		final String workflow = "stubs.ObjectB { singleEle = stubs.ObjectA { name = 'test1' } multiEle += stubs.ObjectA { name = 'test2' } }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME, workflow);
		final File file = loadModelFile(modelFile);
		final InternalAnalyzer analyzer = new InternalAnalyzer(modelFile);
		final BasicDiagnostic diag = new BasicDiagnostic();
		analyzer.validate(file, diag, null);
		assertEquals(0, getErrorCount(diag));
	}

	public void testComplexSetter2() {
		final String workflow = "stubs.ObjectB { singleEle = stubs.ObjectA { foo = 'test1' } multiEle += stubs.ObjectA { foo = 'test2' } }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME, workflow);
		final File file = loadModelFile(modelFile);
		final InternalAnalyzer analyzer = new InternalAnalyzer(modelFile);
		final BasicDiagnostic diag = new BasicDiagnostic();
		analyzer.validate(file, diag, null);
		assertEquals(2, getErrorCount(diag));
		assertTrue(isSetterError(diag, 0));
		assertTrue(isSetterError(diag, 1));
	}

	private int getErrorCount(final Diagnostic diagnostic) {
		return diagnostic.getChildren().size();
	}

	private boolean isSetterError(final Diagnostic diagnostic, final int index) {
		if (diagnostic == null || index < 0 || index >= getErrorCount(diagnostic)) {
			throw new IllegalArgumentException();
		}

		return diagnostic.getChildren().get(index).getMessage().startsWith(NO_SETTER_MSG);
	}
}
