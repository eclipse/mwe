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

import base.AbstractAnalyzerTests;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.1 $
 */

public class JavaAnalyzerTest extends AbstractAnalyzerTests {

	public void testSimpleSetter1() {
		final String workflow = "stubs.ObjectA { name = 'test' }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(0, getMessageCount(diag));
	}

	public void testSimpleSetter2() {
		final String workflow = "stubs.ObjectA { foo = 'test' }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(1, getMessageCount(diag));
		assertTrue(isError(diag, 0, NO_SETTER_MSG));
	}

	public void testBooleanSetter() {
		final String workflow = "stubs.ObjectC { flag = 'true' }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(0, getMessageCount(diag));
	}

	public void testComplexSetter1() {
		final String workflow = "stubs.ObjectB { singleEle = stubs.ObjectA { name = 'test1' } multiEle += stubs.ObjectA { name = 'test2' } }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(0, getMessageCount(diag));
	}

	public void testComplexSetter2() {
		final String workflow = "stubs.ObjectB { singleEle = stubs.ObjectA { foo = 'test1' } multiEle += stubs.ObjectA { foo = 'test2' } }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(2, getMessageCount(diag));
		assertTrue(isError(diag, 0, NO_SETTER_MSG));
		assertTrue(isError(diag, 1, NO_SETTER_MSG));
	}

	public void testComplexValueStorage1() {
		final String workflow = "stubs.ObjectB { singleEle = stubs.ObjectA :a { name = 'test' } multiEle += a }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(0, getMessageCount(diag));
	}

	public void testComplexValueStorage2() {
		final String workflow = "stubs.ObjectB { singleEle = stubs.ObjectA :a { name = 'test' } multiEle += foo }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(2, getMessageCount(diag));
		assertTrue(isError(diag, 0, RESOLVE_MSG));
		assertTrue(isWarning(diag, 1, REFERENCED_MSG));
	}

	public void testJavaClassImport() {
		final String workflow = "import stubs.ObjectA; ObjectA { name = 'test' }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(0, getMessageCount(diag));
	}

	public void testJavaPackageImport() {
		final String workflow = "import stubs.*; ObjectA { name = 'test' }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(0, getMessageCount(diag));
	}

	public void testVariable1() {
		final String workflow = "var prop1 = 'foo'; var prop2 = '${prop1}'; stubs.ObjectA { name = '${prop2}' }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(0, getMessageCount(diag));
	}

	public void testVariable2() {
		final String workflow = "var prop = '${foo}'; stubs.ObjectA { name = '${foo}' }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(3, getMessageCount(diag));
		assertTrue(isError(diag, 0, RESOLVE_MSG));
		assertTrue(isError(diag, 1, RESOLVE_MSG));
		assertTrue(isWarning(diag, 2, REFERENCED_MSG));
	}

	public void testVariable3() {
		final String workflow = "var prop1 = '${prop2}'; var prop2 = 'foo'; stubs.ObjectA { name = '${prop2}' }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(2, getMessageCount(diag));
		assertTrue(isError(diag, 0, RESOLVE_MSG));
		assertTrue(isWarning(diag, 1, REFERENCED_MSG));
	}

	public void testIdRef1() {
		final String workflow = "var prop1 = 'foo'; var prop2 = prop1; stubs.ObjectA { name = prop2 }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(0, getMessageCount(diag));
	}

	public void testIdRef2() {
		final String workflow = "var prop = foo; stubs.ObjectA { name = foo }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(3, getMessageCount(diag));
		assertTrue(isError(diag, 0, RESOLVE_MSG));
		assertTrue(isError(diag, 1, RESOLVE_MSG));
		assertTrue(isWarning(diag, 2, REFERENCED_MSG));
	}

	public void testDuplicateVariable() {
		final String workflow = "var prop = 'foo'; var prop = 'bar'; stubs.ObjectA { name = '${prop}' }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(1, getMessageCount(diag));
		assertTrue(isError(diag, 0, DUPLICATE_MSG));
	}

	public void testPolymorphicAssignment() {
		final String workflow = "stubs.ObjectD { refE1 = stubs.ObjectE2 { name = 'test1' value = 'true' } refE2 = stubs.ObjectE2 { name = 'test2' value = 'false' } }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(0, getMessageCount(diag));
	}

	public void testPropertyFile1() {
		final String workflow = "var file 'stubs/test.properties'; stubs.ObjectA { name = '${test1}' }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(0, getMessageCount(diag));
	}

	public void testPropertyFile2() {
		final String workflow = "var file 'stubs/test.properties'; stubs.ObjectA { name = '${test2}' }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(0, getMessageCount(diag));
	}

	public void testPropertyFile3() {
		final String workflow = "var file 'stubs/test.properties'; stubs.ObjectA { name = '${multi}' }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(0, getMessageCount(diag));
	}

	public void testPropertyFile4() {
		final String workflow = "var file 'stubs/test.properties'; stubs.ObjectA { name = '${test3}' }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(0, getMessageCount(diag));
	}

	public void testUnrefererencedVariable() {
		final String workflow = "var test = 'foo'; stubs.ObjectA { name = 'test' }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(1, getMessageCount(diag));
		assertTrue(isWarning(diag, 0, REFERENCED_MSG));
	}

	public void testWorkflowRef1() {
		final String workflow = "var test = 'foo'; stubs.ObjectB { multiEle = file 'stubs/Workflow.mwe' { singleName = test multiName = test }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(0, getMessageCount(diag));
	}

	public void testWorkflowRef2() {
		final String workflow = "var test = 'foo'; stubs.ObjectB { multiEle = file 'stubs/Workflow.mwe' { singleName = test }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(1, getMessageCount(diag));
		assertTrue(isError(diag, 0, VAR_NOT_SET_MSG));
	}

	public void testWorkflowRef3() {
		final String workflow = "var test = 'foo'; stubs.ObjectB { multiEle = file 'stubs/Workflow.mwe' { singleName = test foo = test }";
		final IFile modelFile = createFile(project, WORKFLOW_NAME1, workflow);
		final File file = loadModelFile(modelFile);
		analyzer.validate(file);
		assertEquals(2, getMessageCount(diag));
		assertTrue(isError(diag, 0, NO_VARIABLE_MSG));
		assertTrue(isError(diag, 1, VAR_NOT_SET_MSG));
	}
}
