/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.ui.utils;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.1 $
 */

public final class ModelUtils {

	/**
	 * Don't allow instantiation.
	 */
	private ModelUtils() {
		throw new UnsupportedOperationException();
	}

	public static IProject getProject(final EObject object) {
		if (object == null)
			return null;

		final Resource res = object.eResource();
		final URI uri = res.getURI();
		if (!uri.isHierarchical() || uri.segmentCount() < 1)
			return null;

		System.out.println(uri.toString());
		final String projectName = uri.segment(0);
		final IWorkspace ws = ResourcesPlugin.getWorkspace();
		final IWorkspaceRoot wsRoot = ws.getRoot();
		final IProject project = wsRoot.getProject(projectName);
		return project.exists() ? project : null;
	}
}
