/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.ui.tests.analyzer;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.di.ui.analyze.internal.InternalAnalyzer;
import org.eclipse.emf.mwe.di.ui.base.AbstractUITests;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.3 $
 */

public class AnalyzerTest extends AbstractUITests {

	public void testSimpleSetter1() {
		final String workflow = "stubs.ObjectA { name = 'test' }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME, workflow);
		final File file = loadModelFile(modelFile);
		final InternalAnalyzer analyzer = new InternalAnalyzer(modelFile);
		final BasicDiagnostic diag = new BasicDiagnostic();
		analyzer.validate(file, diag, null);
		assertEquals(0, diag.getChildren().size());
	}

	public void testSimpleSetter2() {
		final String workflow = "stubs.ObjectA { foo = 'test' }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME, workflow);
		final File file = loadModelFile(modelFile);
		final InternalAnalyzer analyzer = new InternalAnalyzer(modelFile);
		final BasicDiagnostic diag = new BasicDiagnostic();
		analyzer.validate(file, diag, null);
		final List<Diagnostic> children = diag.getChildren();
		assertEquals(1, children.size());
		assertTrue(children.get(0).getMessage().startsWith("No setter"));
	}

	public void testComplexSetter1() {
		final String workflow = "stubs.ObjectB { singleEle = stubs.ObjectA { name = 'test1' } multiEle += stubs.ObjectA { name = 'test2' } }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME, workflow);
		final File file = loadModelFile(modelFile);
		final InternalAnalyzer analyzer = new InternalAnalyzer(modelFile);
		final BasicDiagnostic diag = new BasicDiagnostic();
		analyzer.validate(file, diag, null);
		assertEquals(0, diag.getChildren().size());
	}

	public void testComplexSetter2() {
		final String workflow = "stubs.ObjectB { singleEle = stubs.ObjectA { foo = 'test1' } multiEle += stubs.ObjectA { foo = 'test2' } }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME, workflow);
		final File file = loadModelFile(modelFile);
		final InternalAnalyzer analyzer = new InternalAnalyzer(modelFile);
		final BasicDiagnostic diag = new BasicDiagnostic();
		analyzer.validate(file, diag, null);
		final List<Diagnostic> children = diag.getChildren();
		assertEquals(2, children.size());
		assertTrue(children.get(0).getMessage().startsWith("No setter"));
		assertTrue(children.get(1).getMessage().startsWith("No setter"));
	}
}
