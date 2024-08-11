/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.emf.mwe.tests.util;

import java.io.File;
import java.util.ArrayList;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.mwe.utils.ProjectMapping;
import org.eclipse.emf.mwe.utils.StandaloneSetup;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Holger Schill - Initial contribution and API
 */
public class Bug414169Test extends Assert {

	public static final String TESTPROJECT = "TestProject";

	@Test public void testWarningMessage() throws Exception {

		StandaloneSetup standaloneSetup = new StandaloneSetup();
		LogTester logTester = new LogTester(StandaloneSetup.class,standaloneSetup);
		File file = new File("./testfiles/bug414169");
		standaloneSetup.setPlatformUri(file.getCanonicalPath());
		System.out.println("Infos:");
		System.out.println(dump(logTester.infos));
		System.out.println("Warnings:");
		System.out.println(dump(logTester.warnings));
		assertEquals(1, logTester.getWarnings().size());
	}

	private String dump(ArrayList<String> strings) {
		StringBuilder sb = new StringBuilder();
		for (String string : strings) {
			sb.append(string);
		}
		return sb.toString();
	}

	@Test public void testNoWarningMessage() throws Exception {
		StandaloneSetup standaloneSetup = new StandaloneSetup();
		LogTester logTester = new LogTester(StandaloneSetup.class,standaloneSetup);
		File file = new File("./testfiles/bug414169_2");
		standaloneSetup.setPlatformUri(file.getCanonicalPath());
		assertEquals(0, logTester.getWarnings().size());
	}

	@Test public void testManualMapping() throws Exception {
		StandaloneSetup standaloneSetup = new StandaloneSetup();
		File file = new File("./testfiles/bug414169");
		standaloneSetup.setPlatformUri(file.getCanonicalPath());
		File rootOfProject = new File(file.getCanonicalFile(), TESTPROJECT);
		standaloneSetup.addProjectMapping(newProjectMapping(TESTPROJECT, rootOfProject.toString()));
		URI resolvedPath = EcorePlugin.resolvePlatformResourcePath("/" + TESTPROJECT + "/");
		assertEquals(rootOfProject.toURI().toString(), resolvedPath.toString());
	}

	protected ProjectMapping newProjectMapping(String projectName, String path) {
		ProjectMapping result = new ProjectMapping();
		result.setProjectName(projectName);
		result.setPath(path);
		return result;
	}

	@Test public void testManualMapping_mixed() throws Exception {
		StandaloneSetup standaloneSetup = new StandaloneSetup();
		File file = new File("./testfiles/bug414169_2");
		standaloneSetup.setPlatformUri(file.getCanonicalPath());
		File rootOfProject = new File(file.getCanonicalFile(), TESTPROJECT);
		standaloneSetup.addProjectMapping(newProjectMapping(TESTPROJECT, rootOfProject.toString()));
		URI resolvedPath = EcorePlugin.resolvePlatformResourcePath("/" + TESTPROJECT + "/");
		assertEquals(rootOfProject.toURI().toString(), resolvedPath.toString());
	}
}
