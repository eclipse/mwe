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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.mwe.utils.StandaloneSetup;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Dennis Huebner
 */
public class Bug484372Test extends Assert {
	/**
	 * @author dhuebner - Initial contribution and API
	 */
	private final class TestableStandaloneSetup extends StandaloneSetup {

		@Override
		public void doRegisterResourceMapping(File file) {
			super.doRegisterResourceMapping(file);
		}

		@Override
		public String getBundleNameFromJarName(String jarFileName) {
			return super.getBundleNameFromJarName(jarFileName);
		}
	}

	private String TESTPROJECT_A = "project.a";
	private String TESTPROJECT_B = "project.b";
	private String TESTPROJECT_C = "project.c";
	private LogTester logTester;
	private TestableStandaloneSetup standaloneSetup;

	@Before
	public void setUp() {
		clearPlatformResourceMap();
		standaloneSetup = new TestableStandaloneSetup();
		logTester = new LogTester(StandaloneSetup.class, standaloneSetup);

	}

	@Test
	public void testWarningMessage() throws Exception {
		File file = new File("./testfiles/bug484372/");
		standaloneSetup.setPlatformUri(file.getCanonicalPath());
		standaloneSetup.doRegisterResourceMapping(new File(file, TESTPROJECT_C + "/target/classes/"));

		assertEquals(1, logTester.getWarnings().size());
		assertTrue(logTester.getWarnings().get(0).startsWith("No project file found for "));
	}

	@Test
	public void testNoWarningMessageBin() throws Exception {
		File file = new File("./testfiles/bug484372");
		standaloneSetup.setPlatformUri(file.getPath());
		standaloneSetup.doRegisterResourceMapping(new File(file, TESTPROJECT_A + "/bin/"));

		assertEquals(0, logTester.getWarnings().size());
		assertEquals(URI.createFileURI(new File(file, TESTPROJECT_A).getCanonicalPath() + "/"),
				EcorePlugin.getPlatformResourceMap().get(TESTPROJECT_A));

	}

	@Test
	public void testNoWarningMessageTargetClasses() throws Exception {
		File file = new File("./testfiles/bug484372");
		standaloneSetup.setPlatformUri(file.getPath());
		standaloneSetup.doRegisterResourceMapping(new File(file, TESTPROJECT_B + "/target/classes/"));

		assertEquals(0, logTester.getWarnings().size());
		assertEquals(URI.createFileURI(new File(file, TESTPROJECT_B).getCanonicalPath() + "/"),
				EcorePlugin.getPlatformResourceMap().get(TESTPROJECT_B));
	}

	@Test
	public void testRegisterFile() throws Exception {
		Registry registry = EPackage.Registry.INSTANCE;
		File file = new File("./testfiles/bug484372");
		assertTrue(file.exists());
		standaloneSetup.setPlatformUri(file.getCanonicalPath());
		// we work without scanning the classpath. need register by hand
		standaloneSetup.doRegisterResourceMapping(new File(file, TESTPROJECT_B + "/target/classes/"));
		standaloneSetup.addRegisterEcoreFile("platform:/resource/project.b/model/test.ecore");

		assertTrue(registry.containsKey("http://test.example.org"));
	}

	@Test
	public void testIntroducedJarNameRegex() throws Exception {
		assertEquals("org.eclipse.xtext", standaloneSetup.getBundleNameFromJarName("org.eclipse.xtext.jar"));
		assertEquals("org.eclipse.xtext",
				standaloneSetup.getBundleNameFromJarName("org.eclipse.xtext-1.12.23-SNAPSHOT.jar"));
		assertEquals("org.eclipse.xtext",
				standaloneSetup.getBundleNameFromJarName("org.eclipse.xtext-v2015252525.jar"));
		assertEquals("junit", standaloneSetup.getBundleNameFromJarName("junit.jar"));

		assertEquals("ant-antlr", standaloneSetup.getBundleNameFromJarName("ant-antlr.jar"));
		assertEquals("apache-commons-lang3", standaloneSetup.getBundleNameFromJarName("apache-commons-lang3.jar"));
		assertEquals("apache-commons-lang3", standaloneSetup.getBundleNameFromJarName("apache-commons-lang3-3.2.1.jar"));

	}

	private void clearPlatformResourceMap() {
		EcorePlugin.getPlatformResourceMap().clear();
	}
}
