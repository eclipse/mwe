/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.di.types.java;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.JavaImport;
import org.eclipse.emf.mwe.di.MweUtil;
import org.eclipse.emf.mwe.di.types.StaticTypeSystem;
import org.eclipse.emf.mwe.di.types.Type;
import org.eclipse.emf.mwe.di.util.CoreLog;
import org.eclipse.emf.mwe.di.util.ModelUtils;
import org.eclipse.xtext.EcoreUtil2;

public class JavaTypeSystem extends StaticTypeSystem {

	@Override
	public String getName() {
		return "Java types";
	}

	public Type typeForName(final String name, final File file) {
		final IProject project = ModelUtils.getProject(file);
		if (name.indexOf('.') == -1) {
			for (final JavaImport imp : EcoreUtil2.typeSelect(file.getImports(), JavaImport.class)) {
				final String qn = MweUtil.toString(imp.getJavaImport());
				if (imp.isWildcard()) {
					final Type t = load(project, qn + "." + name);
					if (t != null)
						return t;
				}
				else {
					final String lastSegment = imp.getJavaImport().getParts().get(
							imp.getJavaImport().getParts().size() - 1);
					if (lastSegment.equals(name))
						return load(project, qn);
				}
			}
		}
		return load(project, name);
	}

	private Type load(final IProject project, final String string) {
		try {
			ClassLoader classLoader = null;
			if (project != null) {
				classLoader = ModelUtils.createClassLoader(project);
			}

			if (classLoader == null) {
				classLoader = Thread.currentThread().getContextClassLoader();
			}

			if (classLoader != null) {
				final Class<?> class1 = classLoader.loadClass(string);
				return new JavaType(class1);
			}
		}
		catch (final Exception e) {
			CoreLog.logError(e.getMessage(), e);
		}
		return null;
	}

}
