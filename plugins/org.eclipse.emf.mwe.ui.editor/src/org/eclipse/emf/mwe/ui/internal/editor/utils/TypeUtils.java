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

import org.eclipse.core.resources.IProject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.2 $
 */
public final class TypeUtils {

	/**
	 * Don't allow instantiation.
	 */
	private TypeUtils() {
		throw new UnsupportedOperationException();
	}

	public static IType classToType(final IProject project,
			final Class<?> clazz) {
		if (project == null || clazz == null)
			return null;

		final String className = clazz.getName();
		final IType type = findType(project, className);
		return type;
	}

	public static IType findType(final IProject project, final String typeName) {
		if (project == null || typeName == null) {
			throw new IllegalArgumentException();
		}

		try {
			final IJavaProject javaProject = JavaCore.create(project);
			final String resolvedTypeName =
					PackageShortcutResolver.resolve(typeName);
			final IType type = javaProject.findType(typeName);
			return type;
		} catch (final JavaModelException e) {
			return null;
		}
	}

	public static Class<?> typeToClass(final IProject project, final IType type) {
		if (project == null || type == null)
			return null;

		final String typeName = type.getFullyQualifiedName();
		final Class<?> clazz = ReflectionManager.getClass(project, typeName);
		return clazz;
	}
}
