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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.mwe.internal.ui.workflow.Activator;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.logging.Log;
import org.eclipse.emf.mwe.ui.workflow.util.ProjectIncludingResourceLoader;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IRegion;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.core.search.SearchPattern;
import org.eclipse.jdt.core.search.TypeNameMatch;
import org.eclipse.jdt.core.search.TypeNameMatchRequestor;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.11 $
 */
public final class ReflectionManager {


	private static class TypeNameCollector extends TypeNameMatchRequestor {

		IProject project;

		Set<String> classNames = new HashSet<String>();

		public TypeNameCollector(final IProject project) {
			this.project = project;
		}

		@Override
		public void acceptTypeNameMatch(final TypeNameMatch match) {
			final String className = match.getFullyQualifiedName();
			classNames.add(className);
		}

		public Set<String> getClassNames() {
			return classNames;
		}

	}

	public static final String COMPONENT_SUFFIX = "Component";

	private static final int FIRST_PROPERTY_CHAR = 3;

	private static final String MWE_CONTAINER_PACKAGE =
		"org.eclipse.emf.mwe.core.container";

	private static final String OAW_CONTAINER_PACKAGE =
		"org.openarchitectureware.core.workflow.container";

	private static final String ADDER_PREFIX = "add";

	private static final String SETTER_PREFIX = "set";

	private static Map<String, Set<String>> subClassCache =
		new HashMap<String, Set<String>>();

	private static Map<String, Set<String>> allClassesCache =
		new HashMap<String, Set<String>>();

	/**
	 * Don't allow instantiation.
	 */
	private ReflectionManager() {
		throw new UnsupportedOperationException();
	}

	public static void clearCache() {
		subClassCache.clear();
		allClassesCache.clear();
	}

	public static Set<String> getAllClasses(final IFile file,
			final boolean onlyConcreteClasses) {
		return getAllClasses(getProject(file), onlyConcreteClasses);
	}

	public static Set<String> getAllClasses(final IProject project,
			final boolean onlyConcreteClasses) {
		if (project == null)
			throw new IllegalArgumentException();

		final Set<String> allClasses =
			queryAllClassesCache(project);
		if (!allClasses.isEmpty())
			return allClasses;

		try {
			final IJavaProject jp = JavaCore.create(project);
			final SearchEngine searchEngine = new SearchEngine();
			final IJavaSearchScope scope =
				SearchEngine.createJavaSearchScope(
						new IJavaElement[] { jp }, true);
			final TypeNameCollector collector = new TypeNameCollector(project);
			searchEngine.searchAllTypeNames(null, SearchPattern.R_EXACT_MATCH,
					null, SearchPattern.R_EXACT_MATCH,
					IJavaSearchConstants.CLASS, scope, collector,
					IJavaSearchConstants.WAIT_UNTIL_READY_TO_SEARCH, null);
			allClasses.addAll(collector.getClassNames());

			cacheAllClasses(project, allClasses);
			return allClasses;
		} catch (final JavaModelException e) {
			Log.logError("Java Model Exception", e);
			return allClasses;
		}
	}

	public static Class<?> getClass(final IFile file, final String className) {
		return getClass(getProject(file), className);
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
			// ignore
		} catch (final NoClassDefFoundError e) {
			// ignore
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

	public static Set<String> getSubClasses(final IFile file,
			final Class<?> baseClass, final boolean onlyConcreteClasses) {
		return getSubClasses(getProject(file), baseClass, onlyConcreteClasses);
	}

	public static Set<String> getSubClasses(final IProject project,
			final Class<?> baseClass, final boolean onlyConcreteClasses) {
		if (project == null || baseClass == null)
			throw new IllegalArgumentException();

		final Set<String> subClasses =
			querySubClassCache(project, baseClass);
		if (!subClasses.isEmpty())
			return subClasses;

		final IType type = TypeUtils.classToType(project, baseClass);
		final ITypeHierarchy hierarchy = createTypeHierarchy(project, type);
		if (hierarchy != null) {
			final IType[] subTypes = hierarchy.getAllSubtypes(type);
			addToClassSet(project, subClasses, subTypes,
					onlyConcreteClasses);
		}
		cacheSubClasses(project, baseClass, subClasses);
		return subClasses;
	}

	private static String adderName(final String name) {
		return ADDER_PREFIX + toUpperCaseFirst(name);
	}

	private static void addToClassSet(final IProject project,
			final Set<String> classSet, final IType[] type,
			final boolean onlyConcreteClasses) {
		for (final IType t : type) {
			final Class<?> subClass = TypeUtils.typeToClass(project, t);
			if (subClass != null) {
				final int modifiers = subClass.getModifiers();
				if (Modifier.isPublic(modifiers)
						&& (!onlyConcreteClasses || !Modifier
								.isAbstract(modifiers))) {
					classSet.add(subClass.getName());
				}
			}
		}
	}

	private static void cacheAllClasses(final IProject project,
			final Set<String> allClasses) {
		if (project == null || allClasses == null)
			throw new IllegalArgumentException();

		final String hashString = project.getName();
		allClassesCache.put(hashString, allClasses);
	}

	private static void cacheSubClasses(final IProject project,
			final Class<?> baseClass, final Set<String> subClasses) {
		if (project == null || baseClass == null || subClasses == null)
			throw new IllegalArgumentException();

		final String hashString = generateHashString(project, baseClass);
		subClassCache.put(hashString, subClasses);
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
		if (project == null) {
			throw new IllegalArgumentException();
		}


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

	private static ITypeHierarchy createTypeHierarchy(final IProject project, final IType type) {
		try {
			final IJavaProject jp = JavaCore.create(project);
			final IRegion region = JavaCore.newRegion();
			final IPackageFragmentRoot[] root =
				jp.getAllPackageFragmentRoots();
			for (final IPackageFragmentRoot r : root) {
				region.add(r);
			}
			final ITypeHierarchy hierarchy =
				jp.newTypeHierarchy(type, region,
						new NullProgressMonitor());
			return hierarchy;
		} catch (final JavaModelException e) {
			Log.logError("Java Model Exception", e);
			return null;
		}
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

	private static String generateHashString(final IProject project,
			final Class<?> baseClass) {
		if (project == null || baseClass == null) {
			throw new IllegalArgumentException();
		}

		return project.getName() + ":" + baseClass.getName();
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

	private static IProject getProject(final IFile file) {
		if (file == null)
			return null;

		return file.getProject();
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

	private static Set<String> queryAllClassesCache(final IProject project) {
		if (project == null)
			return null;

		final String hashString = project.getName();
		if (allClassesCache.containsKey(hashString))
			return allClassesCache.get(hashString);
		else
			return new HashSet<String>();
	}

	private static Set<String> querySubClassCache(final IProject project,
			final Class<?> baseClass) {
		if (project == null || baseClass == null)
			return null;

		final String hashString = generateHashString(project, baseClass);
		if (subClassCache.containsKey(hashString))
			return subClassCache.get(hashString);
		else
			return new HashSet<String>();
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
