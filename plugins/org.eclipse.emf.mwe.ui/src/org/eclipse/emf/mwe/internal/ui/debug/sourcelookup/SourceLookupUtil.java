/*******************************************************************************
 * Copyright (c) 2005, 2006 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Clemens Kadura (zAJKa) - Initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.ui.debug.sourcelookup;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.sourcelookup.ISourceContainer;
import org.eclipse.debug.core.sourcelookup.containers.DirectorySourceContainer;
import org.eclipse.debug.core.sourcelookup.containers.ExternalArchiveSourceContainer;
import org.eclipse.debug.core.sourcelookup.containers.FolderSourceContainer;
import org.eclipse.debug.core.sourcelookup.containers.ProjectSourceContainer;
import org.eclipse.emf.mwe.internal.ui.workflow.Activator;
import org.eclipse.jdt.core.IJavaModel;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.launching.IRuntimeClasspathEntry;

/**
 * adapted from org.eclipse.jdt.internal.launching.JavaSourceLookupUtil<br>
 * - doesn't look only for .java and .class files<br>
 * - no check for source lookups as MWE files are sources themselves
 */
public class SourceLookupUtil {

	private static IJavaModel model;

	/**
	 * Translates the given runtime classpath entries into associated source containers.
	 */
	public static ISourceContainer[] translate(final IRuntimeClasspathEntry[] entries) {
		List<ISourceContainer> containers = new ArrayList<ISourceContainer>(entries.length);
		for (IRuntimeClasspathEntry entry : entries) {
			ISourceContainer container = null;
			switch (entry.getType()) {
			case IRuntimeClasspathEntry.ARCHIVE:
				IPackageFragmentRoot root = getPackageFragmentRoot(entry);
				if (root == null) {
					String path = entry.getLocation();
					File file = new File(path);
					if (file.isDirectory()) {
						IResource resource = entry.getResource();
						if (resource instanceof IContainer) {
							container = new FolderSourceContainer((IContainer) resource, false);
						} else {
							container = new DirectorySourceContainer(file, false);
						}
					} else {
						container = new ExternalArchiveSourceContainer(path, true);
					}
				} else {
					container = new PackageFragmentRootContainer(root);
				}
				break;
			case IRuntimeClasspathEntry.PROJECT:
				IResource resource = entry.getResource();
				if ((resource != null) && (resource.getType() == IResource.PROJECT)) {
					IJavaProject javaProject = JavaCore.create((IProject) resource);
					if (javaProject.exists()) {
						container = new SourceFolderSourceContainer(javaProject);
					} else if (resource.exists()) {
						container = new ProjectSourceContainer((IProject) resource, false);
					}
				}
				break;
			default:
				// no other classpath types are valid in a resolved path
				break;
			}
			if ((container != null) && !containers.contains(container)) {
				containers.add(container);
			}
		}
		return containers.toArray(new ISourceContainer[containers.size()]);
	}

	private static IPackageFragmentRoot getPackageFragmentRoot(final IRuntimeClasspathEntry entry) {
		IResource resource = entry.getResource();

		if (resource != null) {
			// our own project jars...
			IProject project = resource.getProject();
			IJavaProject jp = JavaCore.create(project);
			if (project.isOpen() && jp.exists()) {
				IPackageFragmentRoot root = jp.getPackageFragmentRoot(resource);
				return root;
			}
		}

		if (model == null) {
			model = JavaCore.create(ResourcesPlugin.getWorkspace().getRoot());
		}

		// ... or external jars, that are registered in one of the open projects at runtime
		IPath reqPath = (resource == null ? new Path(entry.getLocation()) : entry.getPath());
		try {
			for (IJavaProject jp : model.getJavaProjects()) {
				if (jp.getProject().isOpen()) {
					for (IPackageFragmentRoot root : jp.getPackageFragmentRoots()) {
						if (root.isExternal() && root.getPath().equals(reqPath)) {
							return root;
						}
					}
				}
			}
		} catch (JavaModelException e) {
			Activator.logError(e); // should not occur
		}
		return null;
	}
}
