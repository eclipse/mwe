/*******************************************************************************
 * Copyright (c) 2018 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.emf.mwe.tests.util;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.mwe.utils.StandaloneSetup;
import org.junit.Test;

/**
 * @author dietrich - Initial contribution and API
 */
public class GradleProjectLayoutTest {
	
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
	
	@Test
	public void testNoWarningMessageBinMain() throws Exception {
		TestableStandaloneSetup standaloneSetup = new TestableStandaloneSetup();
		LogTester logTester = new LogTester(StandaloneSetup.class, standaloneSetup);
		File file = new File("./testfiles/gradleLayout");
		standaloneSetup.setPlatformUri(file.getPath());
		standaloneSetup.doRegisterResourceMapping(new File(file, "TestProject3/bin/main/"));
		assertEquals(""+logTester.getWarnings(), 0, logTester.getWarnings().size());
		assertEquals(URI.createFileURI(new File(file, "TestProject3").getCanonicalPath() + "/"),
				EcorePlugin.getPlatformResourceMap().get("TestProject3"));
	}

}
