/*
 * Copyright (c) 2008 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    committers of openArchitectureWare - initial API and implementation
 */

package org.eclipse.emf.mwe.ui.internal.editor.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.mwe.internal.ui.workflow.Activator;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.logging.Log;
import org.eclipse.emf.mwe.ui.workflow.util.ProjectIncludingResourceLoader;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.8 $
 */
public final class ReflectionManager {

	public static final String COMPONENT_SUFFIX = "Component";

	private static final int FIRST_PROPERTY_CHAR = 3;

	private static final String MWE_CONTAINER_PACKAGE =
		"org.eclipse.emf.mwe.core.container";

	private static final String OAW_CONTAINER_PACKAGE =
		"org.openarchitectureware.core.workflow.container";

	private static final String ADDER_PREFIX = "add";

	private static final String SETTER_PREFIX = "set";

	/**
	 * Don't allow instantiation.
	 */
	private ReflectionManager() {
		throw new UnsupportedOperationException();
	}

	public static Class<?> getClass(final IFile file, final String className) {
		Class<?> clazz = null;
		try {
			final ClassLoader loader = createClassLoader(file);
			if (loader != null) {
				clazz = loader.loadClass(className);
			}
		} catch (final CoreException e) {
			Log.logError("Could not create class loader", e);
		} catch (final ClassNotFoundException e) {
			// Do nothing
		}
		return clazz;
	}

	public static Class<?> getClass(final IProject project,
			final String className) {
		if (project == null || className == null)
			throw new IllegalArgumentException();

		Class<?> clazz = null;
		try {
			final ClassLoader loader = createClassLoader(project);
			if (loader != null) {
				clazz = loader.loadClass(className);
			}
		} catch (final CoreException e) {
			Log.logError("Could not create class loader", e);
		} catch (final ClassNotFoundException e) {
			// Do nothing
		}
		return clazz;
	}

	public static String getComponentName(final String name, final boolean old) {
		if (old)
			return OAW_CONTAINER_PACKAGE + "." + toUpperCaseFirst(name)
			+ COMPONENT_SUFFIX;
		else
			return MWE_CONTAINER_PACKAGE + "." + toUpperCaseFirst(name)
			+ COMPONENT_SUFFIX;
	}

	public static String getFileContent(final IFile file,
			final IDocument document, final WorkflowAttribute attribute) {
		final String filePath = attribute.getValue();
		final ClassLoader loader = getResourceLoader(file);

		if (loader == null)
			throw new RuntimeException("Could not obtain resource loader");

		BufferedReader reader = null;
		final URL fileURL = loader.getResource(filePath);
		try {
			if (fileURL != null) {
				final InputStream is = fileURL.openStream();
				if (is != null) {
					final InputStreamReader streamReader =
						new InputStreamReader(is);
					reader = new BufferedReader(streamReader);
				}
			} else {
				final IProject project = file.getProject();
				if (project != null) {
					final File projectPath = project.getLocation().toFile();
					final File foundFile = findFile(projectPath, filePath);
					if (foundFile != null) {
						final FileReader fileReader =
							new FileReader(foundFile);
						reader = new BufferedReader(fileReader);
					}
				}
			}
		} catch (final IOException e) {
			return null;
		}

		if (reader != null) {
			try {
				String content = new String();
				String line = reader.readLine();
				while (line != null) {
					content += line + "\n";
					line = reader.readLine();
				}
				reader.close();
				return content;
			} catch (final IOException e) {
				Log.logError("I/O error", e);
			}
		}
		return null;
	}

	public static ClassLoader getResourceLoader(final IFile file) {
		final IProject project = file.getProject();
		ClassLoader loader = null;
		try {
			final ProjectIncludingResourceLoader l =
				new ProjectIncludingResourceLoader(project);
			loader = l.createClassLoader(project);
		} catch (final CoreException e) {
			Log.logError("Could not create resource loader", e);
		}

		return loader;
	}

	public static Set<String> getSettableProperties(final Class<?> clazz) {
		if (clazz == null)
			return null;

		final Set<String> result = new HashSet<String>();
		final Method[] methods = clazz.getMethods();
		for (final Method m : methods) {
			final String methodName = m.getName();
			final int modifiers = m.getModifiers();
			if (methodName.length() > SETTER_PREFIX.length()
					&& Modifier.isPublic(modifiers)
					&& (methodName.startsWith(ADDER_PREFIX) || methodName
							.startsWith(SETTER_PREFIX))) {
				final String propertyName = getPropertyName(methodName);
				result.add(propertyName);
			}
		}
		return result;
	}

	public static Method getSetter(final Class<? extends Object> clazz,
			final String name, final Class<?> type) {
		Method method = null;

		method = getMethod(clazz, setterName(name), type);
		if (method == null) {
			method = getMethod(clazz, adderName(name), type);
		}

		return method;
	}

	private static String adderName(final String name) {
		return ADDER_PREFIX + toUpperCaseFirst(name);
	}

	/**
	 * Builds a classloader for a Java project from the workspace.
	 * 
	 * @param file
	 *            A file
	 * @throws CoreException
	 */
	private static ClassLoader createClassLoader(final IFile file)
	throws CoreException {
		if (file == null)
			throw new IllegalArgumentException();

		final IProject project = file.getProject();
		return createClassLoader(project);
	}

	/**
	 * Builds a classloader for a Java project from the workspace.
	 * 
	 * @param project
	 *            An Eclipse project
	 * @throws CoreException
	 */
	private static ClassLoader createClassLoader(final IProject project)
	throws CoreException {
		final IJavaProject jp = JavaCore.create(project);

		final IClasspathEntry[] javacp = jp.getResolvedClasspath(true);
		final URL[] url = new URL[javacp.length];

		for (int i = 0; i < javacp.length; i++) {
			try {
				url[i] = javacp[i].getPath().toFile().toURL();
			} catch (final MalformedURLException e) {
				Activator.logError(e);
			}
		}
		return new URLClassLoader(url);
	}

	private static File findFile(final File rootPath, final String filePath) {
		// FIXME Improve searching so that only source folders are considered.
		final String fileNameToTest =
			rootPath.getAbsoluteFile().getPath() + File.separator
			+ filePath;
		File testFile = new File(fileNameToTest);
		if (testFile.exists())
			return testFile;

		final File[] files = rootPath.listFiles();
		if (files != null) {
			for (final File f : files) {
				if (!f.isDirectory()) {
					continue;
				}

				testFile = findFile(f, filePath);
				if (testFile != null)
					return testFile;
			}
		}
		return null;
	}

	private static Method getMethod(final Class<?> clazz, final String name,
			final Class<?> type) {
		Method method = null;
		final Class<?>[] param = new Class<?>[1];
		param[0] = type;
		final Class<?>[] objectParam = new Class<?>[1];
		objectParam[0] = Object.class;

		Method m = null;
		if (type != null) {
			m = getMethod(clazz, name, param);
		}

		if (m == null) {
			m = getMethod(clazz, name, objectParam);
		}

		if (m != null) {
			final int modifiers = m.getModifiers();
			if (name.equals(m.getName()) && Modifier.isPublic(modifiers)
					&& !Modifier.isAbstract(modifiers)) {
				method = m;
			}
		}
		return method;
	}

	private static Method getMethod(final Class<?> clazz, final String name,
			final Class<?>[] param) {
		try {
			final Method m = clazz.getDeclaredMethod(name, param);
			return m;
		} catch (final SecurityException e) {
			Log.logError("Security error", e);
		} catch (final NoSuchMethodException e) {
			Log.logError("No such method", e);
		}
		return null;
	}

	private static String getPropertyName(final String methodName) {
		if (methodName == null || !methodName.startsWith(SETTER_PREFIX)
				&& !methodName.startsWith(ADDER_PREFIX)
				&& methodName.length() <= SETTER_PREFIX.length())
			throw new IllegalArgumentException();

		String propertyName = methodName.substring(FIRST_PROPERTY_CHAR);
		propertyName = toLowerCaseFirst(propertyName);
		return propertyName;
	}

	private static boolean isConcrete(final Class<?> clazz) {
		final int modifiers = clazz.getModifiers();
		final Class<?>[] parameters = new Class[0];
		Constructor<?> constructor = null;
		try {
			constructor = clazz.getConstructor(parameters);
		} catch (final SecurityException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} catch (final NoSuchMethodException e) {
			Log.logError("No such method", e);
		}
		return !Modifier.isAbstract(modifiers)
		&& !Modifier.isInterface(modifiers) && constructor != null;
	}

	private static String setterName(final String name) {
		return SETTER_PREFIX + toUpperCaseFirst(name);
	}

	private static String toLowerCaseFirst(final String name) {
		if (name == null || name.length() == 0)
			return name;
		else if (name.length() == 1)
			return name.toLowerCase();

		return name.substring(0, 1).toLowerCase() + name.substring(1);
	}

	private static String toUpperCaseFirst(final String name) {
		if (name == null || name.length() == 0)
			return name;
		else if (name.length() == 1)
			return name.toUpperCase();

		return name.substring(0, 1).toUpperCase() + name.substring(1);
	}

}
