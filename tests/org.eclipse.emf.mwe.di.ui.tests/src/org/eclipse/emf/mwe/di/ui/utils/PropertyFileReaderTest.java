/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.ui.utils;

import java.util.Map;

import base.AbstractUITests;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.1 $
 */

public class PropertyFileReaderTest extends AbstractUITests {

	private static final String FILE_NAME = "stubs/test.properties";

	public void testFileAccess() {
		final String content = TypeUtils.getFileContent(project, FILE_NAME);
		assertNotNull(content);
	}

	public void testReader() {
		final String content = TypeUtils.getFileContent(project, FILE_NAME);
		assertNotNull(content);
		final Map<String, String> map = PropertyFileReader.parse(content);
		assertEquals(4, map.size());
		assertEquals("foo", map.get("test1"));
		assertEquals("bar", map.get("test2"));
		assertEquals("foo, bar, baz", map.get("multi"));
		assertEquals("baz", map.get("test3"));
	}
}
