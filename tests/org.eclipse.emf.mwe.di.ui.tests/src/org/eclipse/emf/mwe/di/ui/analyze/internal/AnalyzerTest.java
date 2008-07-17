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
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.mwe.File;

import base.AbstractUITests;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.8 $
 */

public class AnalyzerTest extends AbstractUITests {

	private static final String REFERENCED_MSG = "referenced";
	private static final String AMBIGUOUS_MSG = "ambiguous";
	private static final String NO_SETTER_MSG = "No setter";
	private static final String RESOLVE_MSG = "resolve";

	private BasicDiagnostic diag;
	private AbstractAnalyzer<Object> analyzer;

	public void testAmbiguousJavaClassImport() {
		final String workflow = "import stubs.ObjectA; import ambiguity.ObjectA; ObjectA { name = 'test' }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(1, getErrorCount(diag));
		assertTrue(messageContains(diag, 0, AMBIGUOUS_MSG));
	}

	public void testAmbiguousJavaPackageImport() {
		final String workflow = "import stubs.*; import ambiguity.*; ObjectA { name = 'test' }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(1, getErrorCount(diag));
		assertTrue(messageContains(diag, 0, AMBIGUOUS_MSG));
	}

	public void testBooleanSetter() {
		final String workflow = "stubs.ObjectC { flag = 'true' }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(0, getErrorCount(diag));
	}

	public void testComplexSetter1() {
		final String workflow = "stubs.ObjectB { singleEle = stubs.ObjectA { name = 'test1' } multiEle += stubs.ObjectA { name = 'test2' } }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(0, getErrorCount(diag));
	}

	public void testComplexSetter2() {
		final String workflow = "stubs.ObjectB { singleEle = stubs.ObjectA { foo = 'test1' } multiEle += stubs.ObjectA { foo = 'test2' } }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(2, getErrorCount(diag));
		assertTrue(isSetterError(diag, 0));
		assertTrue(isSetterError(diag, 1));
	}

	public void testComplexValueStorage1() {
		final String workflow = "stubs.ObjectB { singleEle = stubs.ObjectA :a { name = 'test' } multiEle += a }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(0, getErrorCount(diag));
	}

	public void testComplexValueStorage2() {
		final String workflow = "stubs.ObjectB { singleEle = stubs.ObjectA :a { name = 'test' } multiEle += foo }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(2, getErrorCount(diag));
		assertTrue(messageContains(diag, 0, RESOLVE_MSG));
		assertTrue(isWarning(diag, 1));
		assertTrue(messageContains(diag, 1, REFERENCED_MSG));
	}

	public void testIdRef1() {
		final String workflow = "var prop1 = 'foo'; var prop2 = prop1; stubs.ObjectA { name = prop2 }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(0, getErrorCount(diag));
	}

	public void testIdRef2() {
		final String workflow = "var prop = foo; stubs.ObjectA { name = foo }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(3, getErrorCount(diag));
		assertTrue(messageContains(diag, 0, RESOLVE_MSG));
		assertTrue(messageContains(diag, 1, RESOLVE_MSG));
		assertTrue(isWarning(diag, 2));
		assertTrue(messageContains(diag, 2, REFERENCED_MSG));
	}

	public void testJavaClassImport() {
		final String workflow = "import stubs.ObjectA; ObjectA { name = 'test' }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(0, getErrorCount(diag));
	}

	public void testJavaPackageImport() {
		final String workflow = "import stubs.*; ObjectA { name = 'test' }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(0, getErrorCount(diag));
	}

	public void testPolymorphicAssignment1() {
		final String workflow = "stubs.ObjectD { refE1 = stubs.ObjectE2 { name = 'test1' value = 'true' } refE2 = stubs.ObjectE2 { name = 'test2' value = 'false' } }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(0, getErrorCount(diag));
	}

	public void testProperty1() {
		final String workflow = "var prop1 = 'foo'; var prop2 = '${prop1}'; stubs.ObjectA { name = '${prop2}' }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(0, getErrorCount(diag));
	}

	public void testProperty2() {
		final String workflow = "var prop = '${foo}'; stubs.ObjectA { name = '${foo}' }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(3, getErrorCount(diag));
		assertTrue(messageContains(diag, 0, RESOLVE_MSG));
		assertTrue(messageContains(diag, 1, RESOLVE_MSG));
		assertTrue(isWarning(diag, 2));
		assertTrue(messageContains(diag, 2, REFERENCED_MSG));
	}

	public void testProperty3() {
		final String workflow = "var prop1 = '${prop2}'; var prop2 = 'foo'; stubs.ObjectA { name = '${prop2}' }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(2, getErrorCount(diag));
		assertTrue(messageContains(diag, 0, RESOLVE_MSG));
		assertTrue(isWarning(diag, 1));
		assertTrue(messageContains(diag, 1, REFERENCED_MSG));
	}

	public void testPropertyFile1() {
		final String workflow = "var file 'stubs/test.properties'; stubs.ObjectA { name = '${test1}' }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(0, getErrorCount(diag));
	}

	public void testPropertyFile2() {
		final String workflow = "var file 'stubs/test.properties'; stubs.ObjectA { name = '${test2}' }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(0, getErrorCount(diag));
	}

	public void testPropertyFile3() {
		final String workflow = "var file 'stubs/test.properties'; stubs.ObjectA { name = '${multi}' }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(0, getErrorCount(diag));
	}

	public void testPropertyFile4() {
		final String workflow = "var file 'stubs/test.properties'; stubs.ObjectA { name = '${test3}' }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(0, getErrorCount(diag));
	}

	public void testSimpleSetter1() {
		final String workflow = "stubs.ObjectA { name = 'test' }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(0, getErrorCount(diag));
	}

	public void testSimpleSetter2() {
		final String workflow = "stubs.ObjectA { foo = 'test' }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(1, getErrorCount(diag));
		assertTrue(isSetterError(diag, 0));
	}

	public void testUnrefererencedVariable() {
		final String workflow = "var test = 'foo'; stubs.ObjectA { name = 'test' }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(1, getErrorCount(diag));
		assertTrue(isWarning(diag, 0));
		assertTrue(messageContains(diag, 0, REFERENCED_MSG));
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		diag = new BasicDiagnostic();
		analyzer = new InternalAnalyzer(null, diag, null);
	}

	private int getErrorCount(final Diagnostic diagnostic) {
		return diagnostic.getChildren().size();
	}

	private boolean isInRange(final Diagnostic diagnostic, final int index) {
		return diagnostic != null && 0 <= index && index < getErrorCount(diagnostic);
	}

	private boolean isSetterError(final BasicDiagnostic diagnostic, final int index) {
		return messageContains(diagnostic, index, NO_SETTER_MSG);
	}

	private boolean isWarning(final Diagnostic diagnostic, final int index) {
		if (!isInRange(diagnostic, index))
			throw new IllegalArgumentException();

		return diagnostic.getChildren().get(index).getSeverity() == Diagnostic.WARNING;
	}

	private boolean messageContains(final Diagnostic diagnostic, final int index, final String text) {
		if (!isInRange(diagnostic, index) || text == null)
			throw new IllegalArgumentException();

		return diagnostic.getChildren().get(index).getMessage().contains(text);
	}
}
