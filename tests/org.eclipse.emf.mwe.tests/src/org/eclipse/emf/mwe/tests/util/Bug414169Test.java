/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.emf.mwe.tests.util;

import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;

import org.apache.commons.logging.Log;
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
		assertEquals(1, logTester.getWarnings().size());
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
		String rootOfProject = file.getCanonicalPath() + "/" + TESTPROJECT + "/";
		standaloneSetup.addProjectMapping(newProjectMapping(TESTPROJECT, rootOfProject));
		URI resolvedPath = EcorePlugin.resolvePlatformResourcePath("/" + TESTPROJECT + "/");
		assertEquals("file:" + rootOfProject, resolvedPath.toString());
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
		String rootOfProject = file.getCanonicalPath() + "/" + TESTPROJECT + "/";
		standaloneSetup.addProjectMapping(newProjectMapping(TESTPROJECT, rootOfProject));
		URI resolvedPath = EcorePlugin.resolvePlatformResourcePath("/" + TESTPROJECT + "/");
		assertEquals("file:" + rootOfProject, resolvedPath.toString());
	}

	private class LogTester implements Log {
		
		public LogTester(Class<?> clazz, Object object){
			super();
			setLog(clazz, object);
		}
		private void setLog(Class<?> clazz, Object object) {
			for (Field f : clazz.getDeclaredFields()) {
				if (f.getType().isAssignableFrom(Log.class))
					try {
						f.setAccessible(true);
						f.set(object, this);
						return;
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
			}
			throw new IllegalArgumentException("The class " + clazz.getName() + " does not declare field of type org.apache.commons.logging.Log.");
		}
		
		
		public ArrayList<String> getWarnings() {
			return warnings;
		}

		ArrayList<String> warnings = new ArrayList<String>();
		ArrayList<String> infos = new ArrayList<String>();

		public boolean isDebugEnabled() {
			return true;
		}

		public boolean isErrorEnabled() {
			return true;
		}

		public boolean isFatalEnabled() {
			return true;
		}

		public boolean isInfoEnabled() {
			return false;
		}

		public boolean isTraceEnabled() {
			return true;
		}

		public boolean isWarnEnabled() {
			return true;
		}

		public void trace(Object message) {

		}

		public void trace(Object message, Throwable t) {

		}

		public void debug(Object message) {

		}

		public void debug(Object message, Throwable t) {

		}

		public void info(Object message) {
			infos.add((String) message);
		}

		public void info(Object message, Throwable t) {

		}

		public void warn(Object message) {
			warnings.add((String) message);
		}

		public void warn(Object message, Throwable t) {

		}

		public void error(Object message) {

		}

		public void error(Object message, Throwable t) {

		}

		public void fatal(Object message) {

		}

		public void fatal(Object message, Throwable t) {

		}

	}
}
