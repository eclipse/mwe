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

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.logging.Log;
import org.eclipse.emf.mwe.ui.workflow.util.ProjectIncludingResourceLoader;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
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

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.32 $
 */
public final class TypeUtils {

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

		Set<String> classNames = new HashSet<String>(1000);

		@Override
		public void acceptTypeNameMatch(final TypeNameMatch match) {
			if (Flags.isPublic(match.getModifiers()) && !Flags.isAbstract(match.getModifiers())) {
				classNames.add(match.getFullyQualifiedName());
			}
		}

		public Set<String> getClassNames() {
			return classNames;
		}

	}

	private static final String STRING_SIGNATURE = "Ljava.lang.String;";

	private static final String BOOLEAN_SIGNATURE = "Z";

	private static final String VOID_SIGNATURE = "V";

	private static final String BUILTIN_BOOLEAN_TYPE = "boolean";

	private static final String OBJECT_CLASS_NAME = "java.lang.Object";

	public static final String COMPONENT_SUFFIX = "Component";

	public static final Pattern SIMPLE_CLASS_NAME_PATTERN = Pattern.compile("^(.+?\\.)*(.+?)$");

	public static final String WILDCARD = "*";

	public static final String FALSE_VALUE = "false";

	public static final String TRUE_VALUE = "true";

	private static final String ADDER_PREFIX = "add";

	private static Map<String, Set<String>> allClassesCache = new HashMap<String, Set<String>>();

	private static final int FIRST_PROPERTY_CHAR = 3;

	private static final String MWE_CONTAINER_PACKAGE = "org.eclipse.emf.mwe.core.container";

	private static final String OAW_CONTAINER_PACKAGE = "org.openarchitectureware.core.workflow.container";

	private static final String SETTER_PREFIX = "set";

	private static Map<String, ITypeHierarchy> classHierarchyCache = new HashMap<String, ITypeHierarchy>();

	/**
	 * Don't allow instantiation.
	 */
	private TypeUtils() {
		throw new UnsupportedOperationException();
	}

	public static void clearCache() {
		classHierarchyCache.clear();
		allClassesCache.clear();
	}

	public static String computeAttributeType(final IWorkflowAttribute attribute) {
		final String value = attribute.getValue();
		return getValueType(value);
	}

	public static Set<String> createClassNameSet(final Set<IType> classes) {
		if (classes == null)
			throw new IllegalArgumentException();

		final Set<String> result = new HashSet<String>();
		for (final IType t : classes) {
			final String fqn = t.getFullyQualifiedName();
			result.add(fqn);
		}
		return result;
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

	public static Set<String> getAllClasses(final IProject project, final IProgressMonitor monitor) {
		if (project == null)
			throw new IllegalArgumentException();

		final Set<String> allClasses = queryAllClassesCache(project);
		if (!allClasses.isEmpty())
			return allClasses;

		try {
			final IJavaProject jp = JavaCore.create(project);
			final SearchEngine searchEngine = new SearchEngine();
			final IJavaSearchScope scope = SearchEngine.createJavaSearchScope(new IJavaElement[] { jp }, true);
			final TypeNameCollector collector = new TypeNameCollector();
			searchEngine.searchAllTypeNames(null, SearchPattern.R_EXACT_MATCH, null, SearchPattern.R_EXACT_MATCH,
					IJavaSearchConstants.CLASS, scope, collector, IJavaSearchConstants.WAIT_UNTIL_READY_TO_SEARCH,
					monitor);
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

	public static String getFileContent(final IProject project, final IWorkflowAttribute attribute) {
		final String filePath = attribute.getValue();
		final ClassLoader loader = getResourceLoader(project);

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

	public static ClassLoader getResourceLoader(final IProject project) {
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

	public static Set<String> getSettableProperties(final IType type, final boolean simpleParametersOnly) {
		if (type == null)
			return null;

		final Set<String> result = new HashSet<String>();
		try {
			final IMethod[] methods = type.getMethods();
			for (final IMethod m : methods) {
				final String methodName = m.getElementName();
				final int modifiers = m.getFlags();
				if (methodName.length() > SETTER_PREFIX.length() && Flags.isPublic(modifiers)
						&& m.getNumberOfParameters() == 1 && VOID_SIGNATURE.equals(m.getReturnType())
						&& (methodName.startsWith(ADDER_PREFIX) || methodName.startsWith(SETTER_PREFIX))
						&& (!simpleParametersOnly || hasSimpleParameter(m))) {
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

	public static IMethod getSetter(final IProject project, final IType type, final String name, final String argType,
			final IProgressMonitor monitor) {
		if (project == null || type == null || name == null)
			throw new IllegalArgumentException();

		IMethod method = null;

		method = getMethod(project, type, setterName(name), argType, monitor);
		if (method == null) {
			method = getMethod(project, type, adderName(name), argType, monitor);
		}

		return method;
	}

	public static IType getSetterParameter(final IProject project, final AbstractWorkflowElement element,
			final IType mappedType, final IProgressMonitor monitor) {
		if (project == null)
			return null;

		IType mt = null;
		final IMethod method = TypeUtils.getSetter(project, mappedType, element.getName(), TypeUtils.WILDCARD, monitor);
		if (method != null) {
			final String[] params = method.getParameterTypes();
			if (params.length == 1) {
				String paramType = params[0];
				paramType = paramType.substring(1, paramType.length() - 1);
				mt = TypeUtils.findType(project, paramType);
			}
		}
		return mt;
	}

	public static Set<String> getSetters(final IProject project, final AbstractWorkflowElement element,
			final boolean simpleParametersOnly, final boolean includePropertyImports, final boolean wholeHierarchy,
			final IProgressMonitor monitor) {
		if (project == null || element == null)
			throw new IllegalArgumentException();

		final Set<String> result = new HashSet<String>();
		IType type = element.getMappedClassType();
		if (type != null) {
			result.addAll(internalGeSetters(project, type, simpleParametersOnly, wholeHierarchy, monitor));
		}
		else if (element.hasParent()) {
			type = getSetterParameter(project, element, element.getParent().getMappedClassType(), monitor);
			if (type != null) {
				result.addAll(internalGeSetters(project, type, simpleParametersOnly, wholeHierarchy, monitor));
			}
		}

		if (includePropertyImports) {
			final IPropertyContainer importedProperties = element.getImportedProperties();
			result.addAll(importedProperties.getPropertyNames());
		}
		return result;
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

	public static Set<IType> getSubTypes(final IProject project, final IType baseType, final IProgressMonitor monitor) {
		final Set<IType> classes = new HashSet<IType>();
		final ITypeHierarchy hierarchy = getClassHierarchy(project, baseType, monitor);

		if (hierarchy != null) {
			final IType[] types = hierarchy.getAllSubtypes(baseType);
			classes.addAll(createClassSet(types));

		}

		return classes;
	}

	public static Set<IType> getSuperTypes(final IProject project, final IType baseType, final IProgressMonitor monitor) {
		final Set<IType> classes = new HashSet<IType>();
		final ITypeHierarchy hierarchy = getClassHierarchy(project, baseType, monitor);

		if (hierarchy != null) {
			final IType[] types = hierarchy.getAllSupertypes(baseType);
			classes.addAll(createClassSet(types));
		}

		return classes;
	}

	public static String getValueType(final String value) {
		if (value == null)
			return null;

		String type = null;
		if (isBooleanValue(value)) {
			type = "boolean";
		}
		else {
			type = "java.lang.String";
		}
		return type;
	}

	public static boolean isBooleanValue(final String value) {
		return value.equalsIgnoreCase(TRUE_VALUE) ^ value.equalsIgnoreCase(FALSE_VALUE);
	}

	public static boolean isInstantiable(final IType type) {
		if (type == null)
			return false;

		try {
			final int modifiers = type.getFlags();
			if (Flags.isPublic(modifiers) && !Flags.isAbstract(modifiers)) {
				final String name = type.getElementName();
				final IMethod[] methods = type.getMethods();
				int count = 0;
				for (final IMethod m : methods) {
					if (name.equals(m.getElementName())) {
						count++;
						final String[] parameterTypes = m.getParameterTypes();
						if (parameterTypes.length == 0)
							return true;
					}
				}
				if (count == 0)
					return true;
			}
			return false;
		}
		catch (final JavaModelException e) {
			Log.logError("", e);
			return false;
		}
	}

	public static SettableCheckResult isSettable(final IProject project, final AbstractWorkflowElement element,
			final IType mappedType, final IProgressMonitor monitor) {
		final String type = TypeUtils.WILDCARD;
		final String name = element.getName();
		return internalIsSettable(project, element, mappedType, name, type, monitor);
	}

	public static SettableCheckResult isSettable(final IProject project, final IWorkflowAttribute attribute,
			final IType mappedType, final IProgressMonitor monitor) {
		final AbstractWorkflowElement element = attribute.getElement();
		final String type = TypeUtils.computeAttributeType(attribute);
		final String name = attribute.getName();
		return internalIsSettable(project, element, mappedType, name, type, monitor);
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

	private static void cacheClassHierarchy(final IProject project, final IType baseType, final ITypeHierarchy hierarchy) {
		if (project == null || baseType == null || hierarchy == null)
			throw new IllegalArgumentException();

		final String hashString = generateHashString(project, baseType);
		classHierarchyCache.put(hashString, hierarchy);
	}

	private static String[] convertParameterTypes(final String[] paramType) {
		if (paramType == null)
			throw new IllegalArgumentException();

		final String[] result = new String[paramType.length];
		for (int i = 0; i < paramType.length; i++) {
			final String param = paramType[i];
			if (param.endsWith(BUILTIN_BOOLEAN_TYPE)) {
				result[i] = BOOLEAN_SIGNATURE;
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

	private static Set<IType> createClassSet(final IType[] type) {
		final Set<IType> result = new HashSet<IType>();
		for (final IType t : type) {
			result.add(t);
		}
		return result;
	}

	private static ITypeHierarchy createTypeHierarchy(final IProject project, final IType type,
			final IProgressMonitor monitor) {
		try {
			final IJavaProject jp = JavaCore.create(project);
			return type.newTypeHierarchy(jp, monitor);
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

	private static ITypeHierarchy getClassHierarchy(final IProject project, final IType baseType,
			final IProgressMonitor monitor) {
		if (project == null || baseType == null)
			throw new IllegalArgumentException();

		ITypeHierarchy hierarchy = queryClassHierarchyCache(project, baseType);
		if (hierarchy == null) {
			hierarchy = createTypeHierarchy(project, baseType, monitor);
			if (hierarchy != null) {
				cacheClassHierarchy(project, baseType, hierarchy);
			}
		}
		return hierarchy;
	}

	private static IMethod getMethod(final IProject project, final IType type, final String name, final String argType,
			final IProgressMonitor monitor) {
		if (project == null || type == null || name == null)
			throw new IllegalArgumentException();

		IMethod method = null;

		try {
			IMethod m = null;
			if (argType != null) {
				final String[] param = new String[1];
				param[0] = argType;
				m = internalGetMethod(project, type, name, param, monitor);
			}

			if (m == null) {
				final String[] objectParam = new String[1];
				objectParam[0] = OBJECT_CLASS_NAME;
				m = internalGetMethod(project, type, name, objectParam, monitor);
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

	private static String getPropertyName(final String methodName) {
		if (methodName == null || !methodName.startsWith(SETTER_PREFIX) && !methodName.startsWith(ADDER_PREFIX)
				&& methodName.length() <= SETTER_PREFIX.length())
			throw new IllegalArgumentException();

		String propertyName = methodName.substring(FIRST_PROPERTY_CHAR);
		propertyName = toLowerCaseFirst(propertyName);
		return propertyName;
	}

	private static boolean hasSimpleParameter(final IMethod method) {
		if (method == null)
			throw new IllegalArgumentException();

		if (method.getNumberOfParameters() != 1)
			return false;

		final String signature = method.getParameterTypes()[0];
		return BOOLEAN_SIGNATURE.equals(signature) || STRING_SIGNATURE.equals(signature);
	}

	private static Set<String> internalGeSetters(final IProject project, final IType type,
			final boolean simpleParametersOnly, final boolean wholeHierarchy, final IProgressMonitor monitor) {
		final Set<String> result = new HashSet<String>();
		Set<String> setters = getSettableProperties(type, simpleParametersOnly);
		result.addAll(setters);

		if (wholeHierarchy) {
			final Set<IType> superTypes = getSuperTypes(project, type, monitor);
			for (final IType t : superTypes) {
				setters = getSettableProperties(t, simpleParametersOnly);
				result.addAll(setters);
			}
		}
		return result;
	}

	private static IMethod internalGetMethod(final IProject project, final IType type, final String name,
			final String[] paramTypes, final IProgressMonitor monitor) {
		if (project == null || type == null || name == null)
			throw new IllegalArgumentException();

		final String[] parameterTypeSignature = convertParameterTypes(paramTypes);
		if (parameterTypeSignature.length == 1 && WILDCARD.equals(parameterTypeSignature[0])) {
			try {
				final IMethod[] methods = type.getMethods();
				for (final IMethod m : methods) {
					if (name.equals(m.getElementName()))
						return m;
				}

			}
			catch (final JavaModelException e) {
				Log.logError("", e);
				return null;
			}
		}
		else {
			final IMethod method = type.getMethod(name, parameterTypeSignature);
			if (method != null)
				return method;
		}
		final Set<IType> superTypes = getSuperTypes(project, type, monitor);
		for (final IType t : superTypes) {
			final IMethod method = internalGetMethod(project, t, name, paramTypes, monitor);
			if (method != null)
				return method;
		}
		return null;
	}

	private static SettableCheckResult internalIsSettable(final IProject project,
			final AbstractWorkflowElement element, final IType mappedType, final String tagName, final String type,
			final IProgressMonitor monitor) {
		IMethod method = TypeUtils.getSetter(project, mappedType, tagName, type, monitor);
		IType mt = null;

		if (method == null) {
			mt = TypeUtils.getSetterParameter(project, element, mappedType, monitor);
			if (mt == null) {
				mt = mappedType;
			}
			else {
				method = TypeUtils.getSetter(project, mt, tagName, type, monitor);
			}
		}
		if (method == null && element.hasParent()) {
			mt = TypeUtils.getSetterParameter(project, element.getParent(), mappedType, monitor);
			if (mt != null) {
				final String name = element.getName();
				method = TypeUtils.getSetter(project, mt, name, type, monitor);
				if (method == null) {
					method = TypeUtils.getSetter(project, mt, name, TypeUtils.WILDCARD, monitor);
				}
			}
		}
		if (mt == null) {
			mt = mappedType;
		}

		final boolean hasProperty = (element.hasParent()) ? element.getParent().hasProperty(tagName) : false;
		final boolean result = (method != null) || hasProperty;
		return new SettableCheckResult(result, tagName, mt);
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

	private static ITypeHierarchy queryClassHierarchyCache(final IProject project, final IType baseType) {
		if (project == null || baseType == null)
			return null;

		final String hashString = generateHashString(project, baseType);
		if (classHierarchyCache.containsKey(hashString))
			return classHierarchyCache.get(hashString);
		else
			return null;
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
