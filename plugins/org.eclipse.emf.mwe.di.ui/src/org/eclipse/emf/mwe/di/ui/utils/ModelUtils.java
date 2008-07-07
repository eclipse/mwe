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
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.2 $
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
			throw new IllegalArgumentException();

		final Resource res = object.eResource();
		if (res != null) {
			final URI uri = res.getURI();
			if (uri != null && uri.hasPath()) {
				final IWorkspace ws = ResourcesPlugin.getWorkspace();
				final IWorkspaceRoot wsRoot = ws.getRoot();
				final IPath wsPath = wsRoot.getLocation();
				final String[] wsPathSegments = wsPath.segments();
				final String[] uriSegments = uri.segments();
				int segmentNumber = 0;
				for (int i = 0; i < wsPathSegments.length; i++) {
					if (wsPathSegments[i].equals(uriSegments[i])) {
						segmentNumber = i;
					}
					else {
						break;
					}
				}
				if (segmentNumber > 0) {
					segmentNumber++;
					if (segmentNumber < uri.segmentCount()) {
						final String projectName = uri.segment(segmentNumber);
						final IProject project = wsRoot.getProject(projectName);
						return project.exists() ? project : null;
					}
				}
			}
		}
		return null;
	}
}
