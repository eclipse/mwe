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
import java.net.URL;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.logging.Log;
import org.eclipse.emf.mwe.ui.workflow.util.ProjectIncludingResourceLoader;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
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
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.9 $
 */
public final class TypeUtils {

	private static final String BUILTIN_BOOLEAN_TYPE = "boolean";

	private static class ClassNameComparator implements Comparator<String> {

		public int compare(final String className1, final String className2) {
			if (className1 == className2)
				return 0;
			else if (className1 == null)
				return -1;
			else if (className2 == null)
				return 1;

			final String simpleName1 = getSimpleClassName(className1);
			final String simpleName2 = getSimpleClassName(className2);
			if (simpleName1.equals(simpleName2))
				return className1.compareToIgnoreCase(className2);
			else
				return simpleName1.compareToIgnoreCase(simpleName2);
		}
	}

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

	private static final String OBJECT_CLASS_NAME = "java.lang.Object";

	public static final String COMPONENT_SUFFIX = "Component";

	public static final Pattern SIMPLE_CLASS_NAME_PATTERN = Pattern.compile("^(.+?\\.)*(.+?)$");

	public static final String WILDCARD = "*";

	private static final String ADDER_PREFIX = "add";

	private static Map<String, Set<String>> allClassesCache = new HashMap<String, Set<String>>();

	private static final int FIRST_PROPERTY_CHAR = 3;

	private static final String MWE_CONTAINER_PACKAGE = "org.eclipse.emf.mwe.core.container";

	private static final String OAW_CONTAINER_PACKAGE = "org.openarchitectureware.core.workflow.container";

	private static final String SETTER_PREFIX = "set";

	private static Map<String, Set<String>> subClassCache = new HashMap<String, Set<String>>();

	/**
	 * Don't allow instantiation.
	 */
	private TypeUtils() {
		throw new UnsupportedOperationException();
	}

	public static void clearCache() {
		subClassCache.clear();
		allClassesCache.clear();
	}

	public static IType findType(final IFile file, final String typeName) {
		if (file == null || typeName == null)
			throw new IllegalArgumentException();

		return findType(file.getProject(), typeName);
	}

	public static IType findType(final IProject project, final String typeName) {
		if (project == null || typeName == null)
			throw new IllegalArgumentException();

		try {
			final IJavaProject javaProject = JavaCore.create(project);
			final String resolvedTypeName = PackageShortcutResolver.resolve(typeName);
			final IType type = javaProject.findType(resolvedTypeName);
			return type;
		}
		catch (final JavaModelException e) {
			return null;
		}
	}

	public static Set<String> getAllClasses(final IFile file, final boolean onlyConcreteClasses) {
		return getAllClasses(getProject(file), onlyConcreteClasses);
	}

	public static Set<String> getAllClasses(final IProject project, final boolean onlyConcreteClasses) {
		if (project == null)
			throw new IllegalArgumentException();

		final Set<String> allClasses = queryAllClassesCache(project);
		if (!allClasses.isEmpty())
			return allClasses;

		try {
			final IJavaProject jp = JavaCore.create(project);
			final SearchEngine searchEngine = new SearchEngine();
			final IJavaSearchScope scope = SearchEngine.createJavaSearchScope(new IJavaElement[] { jp }, true);
			final TypeNameCollector collector = new TypeNameCollector(project);
			searchEngine
					.searchAllTypeNames(null, SearchPattern.R_EXACT_MATCH, null, SearchPattern.R_EXACT_MATCH,
							IJavaSearchConstants.CLASS, scope, collector,
							IJavaSearchConstants.WAIT_UNTIL_READY_TO_SEARCH, null);
			allClasses.addAll(collector.getClassNames());

			cacheAllClasses(project, allClasses);
			return allClasses;
		}
		catch (final JavaModelException e) {
			Log.logError("Java Model Exception", e);
			return allClasses;
		}
	}

	public static String getComponentName(final String name, final boolean old) {
		if (old)
			return OAW_CONTAINER_PACKAGE + "." + toUpperCaseFirst(name) + COMPONENT_SUFFIX;
		else
			return MWE_CONTAINER_PACKAGE + "." + toUpperCaseFirst(name) + COMPONENT_SUFFIX;
	}

	public static String getFileContent(final IFile file, final IDocument document, final IWorkflowAttribute attribute) {
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
					final InputStreamReader streamReader = new InputStreamReader(is);
					reader = new BufferedReader(streamReader);
				}
			}
			else {
				final IProject project = file.getProject();
				if (project != null) {
					final File projectPath = project.getLocation().toFile();
					final File foundFile = findFile(projectPath, filePath);
					if (foundFile != null) {
						final FileReader fileReader = new FileReader(foundFile);
						reader = new BufferedReader(fileReader);
					}
				}
			}
		}
		catch (final IOException e) {
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
			}
			catch (final IOException e) {
				Log.logError("I/O error", e);
			}
		}
		return null;
	}

	public static String getJavaDoc(final IFile file, final String className) {
		if (file == null || className == null)
			return null;

		return getJavaDoc(file.getProject(), className);
	}

	public static String getJavaDoc(final IProject project, final String className) {
		if (project == null || className == null)
			return null;

		try {
			final IType type = findType(project, className);
			if (type != null)
				return type.getAttachedJavadoc(new NullProgressMonitor());

			return null;
		}
		catch (final JavaModelException e) {
			Log.logError("Java Model Exception", e);
			return null;
		}
	}

	public static ClassLoader getResourceLoader(final IFile file) {
		final IProject project = file.getProject();
		ClassLoader loader = null;
		try {
			final ProjectIncludingResourceLoader l = new ProjectIncludingResourceLoader(project);
			loader = l.createClassLoader(project);
		}
		catch (final CoreException e) {
			Log.logError("Could not create resource loader", e);
		}

		return loader;
	}

	public static Set<String> getSettableProperties(final IType type) {
		if (type == null)
			return null;

		final Set<String> result = new HashSet<String>();
		try {
			final IMethod[] methods = type.getMethods();
			for (final IMethod m : methods) {
				final String methodName = m.getElementName();
				final int modifiers = m.getFlags();
				if (methodName.length() > SETTER_PREFIX.length() && Flags.isPublic(modifiers)
						&& (methodName.startsWith(ADDER_PREFIX) || methodName.startsWith(SETTER_PREFIX))) {
					final String propertyName = getPropertyName(methodName);
					result.add(propertyName);
				}
			}
		}
		catch (final JavaModelException e) {
			Log.logError("Java Model Exception", e);
		}
		return result;
	}

	public static IMethod getSetter(final IFile file, final IType type, final String name, final String argType) {
		if (file == null || type == null || name == null)
			throw new IllegalArgumentException();

		return getSetter(file.getProject(), type, name, argType);
	}

	public static IMethod getSetter(final IProject project, final IType type, final String name, final String argType) {
		if (project == null || type == null || name == null)
			throw new IllegalArgumentException();

		IMethod method = null;

		method = getMethod(project, type, setterName(name), argType);
		if (method == null) {
			method = getMethod(project, type, adderName(name), argType);
		}

		return method;
	}

	public static String getSimpleClassName(final String fqn) {
		if (fqn == null)
			return null;

		final Matcher m = SIMPLE_CLASS_NAME_PATTERN.matcher(fqn);
		if (m.find())
			return m.group(2);
		else
			return fqn;
	}

	public static Set<String> getSubClasses(final IFile file, final IType baseType, final boolean onlyConcreteClasses) {
		return getSubClasses(getProject(file), baseType, onlyConcreteClasses);
	}

	public static Set<String> getSubClasses(final IProject project, final IType baseType,
			final boolean onlyConcreteClasses) {
		if (project == null || baseType == null)
			throw new IllegalArgumentException();

		final Set<String> subClasses = querySubClassCache(project, baseType);
		if (!subClasses.isEmpty())
			return subClasses;

		final ITypeHierarchy hierarchy = createTypeHierarchy(project, baseType);
		if (hierarchy != null) {
			final IType[] subTypes = hierarchy.getAllSubtypes(baseType);
			createClassSet(project, subClasses, subTypes, onlyConcreteClasses);
		}

		cacheSubClasses(project, baseType, subClasses);
		return subClasses;
	}

	private static String adderName(final String name) {
		return ADDER_PREFIX + toUpperCaseFirst(name);
	}

	private static void cacheAllClasses(final IProject project, final Set<String> allClasses) {
		if (project == null || allClasses == null)
			throw new IllegalArgumentException();

		final String hashString = project.getName();
		allClassesCache.put(hashString, allClasses);
	}

	private static void cacheSubClasses(final IProject project, final IType baseType, final Set<String> subClasses) {
		if (project == null || baseType == null || subClasses == null)
			throw new IllegalArgumentException();

		final String hashString = generateHashString(project, baseType);
		subClassCache.put(hashString, subClasses);
	}

	private static String[] convertParameterTypes(final String[] paramType) {
		if (paramType == null)
			throw new IllegalArgumentException();

		final String[] result = new String[paramType.length];
		for (int i = 0; i < paramType.length; i++) {
			final String param = paramType[i];
			if (param.endsWith(BUILTIN_BOOLEAN_TYPE)) {
				result[i] = "Z";
			}
			else if (WILDCARD.equals(param)) {
				result[i] = param;
			}
			else {
				result[i] = "L" + param + ";";
			}
		}
		return result;
	}

	private static void createClassSet(final IProject project, final Set<String> classes, final IType[] type,
			final boolean onlyConcreteClasses) {
		try {
			for (final IType t : type) {
				final int modifiers = t.getFlags();
				if (Flags.isPublic(modifiers) && (!onlyConcreteClasses || !Flags.isAbstract(modifiers))) {
					classes.add(t.getFullyQualifiedName());
				}
			}
		}
		catch (final JavaModelException e) {
			Log.logError("Java Model Exception", e);
		}
	}

	private static ITypeHierarchy createTypeHierarchy(final IProject project, final IType type) {
		try {
			final IJavaProject jp = JavaCore.create(project);
			final IRegion region = JavaCore.newRegion();
			final IPackageFragmentRoot[] root = jp.getAllPackageFragmentRoots();
			for (final IPackageFragmentRoot r : root) {
				region.add(r);
			}
			final ITypeHierarchy hierarchy = jp.newTypeHierarchy(type, region, new NullProgressMonitor());
			return hierarchy;
		}
		catch (final JavaModelException e) {
			Log.logError("Java Model Exception", e);
			return null;
		}
	}

	private static File findFile(final File rootPath, final String filePath) {
		// FIXME Improve searching so that only source folders are considered.
		final String fileNameToTest = rootPath.getAbsoluteFile().getPath() + File.separator + filePath;
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

	private static String generateHashString(final IProject project, final IType baseType) {
		if (project == null || baseType == null)
			throw new IllegalArgumentException();

		return project.getName() + ":" + baseType.getFullyQualifiedName();
	}

	private static IMethod getMethod(final IProject project, final IType type, final String name, final String argType) {
		if (project == null || type == null || name == null)
			throw new IllegalArgumentException();

		IMethod method = null;

		try {
			IMethod m = null;
			if (argType != null) {
				final String[] param = new String[1];
				param[0] = argType;
				m = getMethod(type, name, param);
			}

			if (m == null) {
				final String[] objectParam = new String[1];
				objectParam[0] = OBJECT_CLASS_NAME;
				m = getMethod(type, name, objectParam);
			}

			if (m != null && m.exists()) {
				final int modifiers = m.getFlags();
				if (name.equals(m.getElementName()) && Flags.isPublic(modifiers) && !Flags.isAbstract(modifiers)) {
					method = m;
				}
			}
		}
		catch (final JavaModelException e) {
			Log.logError("", e);
		}
		return method;
	}

	private static IMethod getMethod(final IType type, final String name, final String[] paramTypes) {
		if (type == null || name == null)
			throw new IllegalArgumentException();

		final String[] parameterTypeSignature = convertParameterTypes(paramTypes);
		if (parameterTypeSignature.length == 1 && WILDCARD.equals(parameterTypeSignature[0])) {
			try {
				IMethod[] methods = type.getMethods();
				for (IMethod m : methods) {
					if (name.equals(m.getElementName()))
						return m;
				}
				return null;
			}
			catch (JavaModelException e) {
				Log.logError("", e);
				return null;
			}
		}
		return type.getMethod(name, parameterTypeSignature);
	}

	private static IProject getProject(final IFile file) {
		if (file == null)
			return null;

		return file.getProject();
	}

	private static String getPropertyName(final String methodName) {
		if (methodName == null || !methodName.startsWith(SETTER_PREFIX) && !methodName.startsWith(ADDER_PREFIX)
				&& methodName.length() <= SETTER_PREFIX.length())
			throw new IllegalArgumentException();

		String propertyName = methodName.substring(FIRST_PROPERTY_CHAR);
		propertyName = toLowerCaseFirst(propertyName);
		return propertyName;
	}

	private static Set<String> queryAllClassesCache(final IProject project) {
		if (project == null)
			return null;

		final String hashString = project.getName();
		if (allClassesCache.containsKey(hashString))
			return allClassesCache.get(hashString);
		else
			return new TreeSet<String>(new ClassNameComparator());
	}

	private static Set<String> querySubClassCache(final IProject project, final IType baseType) {
		if (project == null || baseType == null)
			return null;

		final String hashString = generateHashString(project, baseType);
		if (subClassCache.containsKey(hashString))
			return subClassCache.get(hashString);
		else
			return new TreeSet<String>(new ClassNameComparator());
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
