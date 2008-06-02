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
 * @version $Revision: 1.1 $
 */
public final class TypeUtils {

	/**
	 * Don't allow instantiation.
	 */
	private TypeUtils() {
		throw new UnsupportedOperationException();
	}

	public static IType findType(final IProject project, final String typeName) {
		if (project == null || typeName == null)
			throw new IllegalArgumentException();

		try {
			IJavaProject javaProject = JavaCore.create(project);
			IType type = javaProject.findType(typeName);
			if ((type == null) || typeName.startsWith("mwe")) {
				type =
						javaProject.findType(typeName.replaceFirst("mwe",
								"org.eclipse.emf.mwe"));
			} else if (typeName.startsWith("oaw")) {
				type =
						javaProject.findType(typeName.replaceFirst("oaw",
								"org.openarchitectureware"));
			}

			return type;
		} catch (final JavaModelException e) {
			return null;
		}
	}

	public static IType classToType(IProject project, Class<?> clazz) {
		if (project == null || clazz == null)
			return null;

		String className = clazz.getName();
		IType type = findType(project, className);
		return type;
	}

	public static Class<?> typeToClass(IProject project, IType type) {
		if (project == null || type == null)
			return null;

		String typeName = type.getFullyQualifiedName();
		Class<?> clazz = ReflectionManager.getClass(project, typeName);
		return clazz;
	}
}
