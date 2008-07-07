/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.ui.analyze.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.JavaImport;
import org.eclipse.emf.mwe.QualifiedName;
import org.eclipse.emf.mwe.di.MweUtil;
import org.eclipse.emf.mwe.di.ui.utils.TypeUtils;
import org.eclipse.jdt.core.IType;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.1 $
 */

public class JavaImportRegistry {

	private final List<String> classImports = new ArrayList<String>();
	private final List<String> packageImports = new ArrayList<String>();

	public void addImport(final JavaImport imp) {
		if (imp == null) {
			throw new IllegalArgumentException();
		}

		final QualifiedName fqn = imp.getJavaImport();
		final String fqnString = MweUtil.toString(fqn);
		if (imp.isWildcard()) {
			packageImports.add(fqnString);
		}
		else {
			classImports.add(fqnString);
		}
	}

	public IType resolve(final IProject project, final EObject context, final String className) {
		if (project == null || context == null || className == null)
			throw new IllegalArgumentException();

		if (!isQualified(className)) {
			IType type = lookupType(project, context, className);
			if (type == null) {
				type = browsePackages(project, context, className);
			}
			if (type != null)
				return type;
		}
		return TypeUtils.findType(project, className);
	}

	private IType browsePackages(final IProject project, final EObject context, final String className) {
		IType type = null;
		int count = 0;
		for (final String name : packageImports) {
			final String resolvedName = name + "." + className;
			type = TypeUtils.findType(project, resolvedName);
			if (type != null) {
				count++;
			}

			if (count > 1) {
				throw new AmbiguousTypeException("The class name '" + className + "' is ambiguous", context);
			}
		}
		return type;
	}

	private IType lookupType(final IProject project, final EObject context, final String className) {
		IType type = null;
		int count = 0;
		for (final String name : classImports) {
			if (name.endsWith(className)) {
				type = TypeUtils.findType(project, name);
				if (type != null) {
					count++;
				}
			}
			if (count > 1) {
				throw new AmbiguousTypeException("The class name '" + className + "' is ambiguous", context);
			}
		}
		return type;
	}

	private boolean isQualified(final String className) {
		if (className == null)
			return false;

		return className.contains(".");
	}
}
