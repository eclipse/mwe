/*******************************************************************************
 * Copyright (c) 2009, 2015 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.emf.mwe.tests.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.utils.FileCopy;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FileCopyTest extends Assert {
	private File sourceFile;
	private File targetFile;

	@Before
	public void setUp() throws Exception {
		sourceFile = Files.createTempFile("copier", "test").toFile();
		targetFile = Files.createTempFile("copier", "test").toFile();
		FileOutputStream output = new FileOutputStream(sourceFile);
		output.write(42);
		output.close();
	}

	@Test public void testCopy() throws Exception {
		FileCopy copy = new FileCopy();
		copy.setSourceFile(sourceFile.getAbsolutePath());
		copy.setTargetFile(targetFile.getAbsolutePath());
		WorkflowContext ctx = new WorkflowContextDefaultImpl();
		Issues issues = new IssuesImpl();
		copy.invoke(ctx, new NullProgressMonitor(), issues);
		assertFalse(issues.hasErrors());
		assertFalse(issues.hasWarnings());

		FileInputStream input = new FileInputStream(targetFile);
		assertEquals(1, input.available());
		assertEquals(42, input.read());
		input.close();
	}

	@Test public void testMissingSource() {
		FileCopy copy = new FileCopy();
		copy.setTargetFile(targetFile.getAbsolutePath());
		Issues issues = new IssuesImpl();
		copy.checkConfiguration(issues);
		assertTrue(issues.hasErrors());
		assertFalse(issues.hasWarnings());
	}

	@Test public void testMissingTarget() {
		FileCopy copy = new FileCopy();
		copy.setSourceFile(sourceFile.getAbsolutePath());
		Issues issues = new IssuesImpl();
		copy.checkConfiguration(issues);
		assertTrue(issues.hasErrors());
		assertFalse(issues.hasWarnings());
	}

	@Test public void testNonExistingSource() {
		FileCopy copy = new FileCopy();
		copy.setSourceFile("/path/does/not/exist");
		copy.setTargetFile(targetFile.getAbsolutePath());
		Issues issues = new IssuesImpl();
		copy.checkConfiguration(issues);
		assertFalse(issues.hasErrors());
		assertFalse(issues.hasWarnings());

		WorkflowContext ctx = new WorkflowContextDefaultImpl();
		copy.invoke(ctx, new NullProgressMonitor(), issues);
		assertFalse(issues.hasErrors());
		assertTrue(issues.hasWarnings());
	}

	@After
	public void tearDown() {
		sourceFile.delete();
		targetFile.delete();
	}
}
