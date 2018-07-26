/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.ui.workflow.util;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderDefaultImpl;
import org.eclipse.emf.mwe.internal.ui.workflow.Activator;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;

/**
 * This ResourceLoader is capable of loading resources from a specific Java project within the workspace.
 * Typical use is when invoking a workflow from within a plugin.
 * 
 * FIXME: Refactor this class to repect the EMFPlugin
 */
public class ProjectIncludingResourceLoader extends ResourceLoaderDefaultImpl {
    private final ClassLoader projectCL;
    

	public ProjectIncludingResourceLoader(final IProject project) throws CoreException {
		super();
		projectCL = createClassLoader(project);
	}

	/**
	 * Builds a classloader for a Java project from the workspace.
	 * @param project An Eclipse project
	 * @throws CoreException
	 */
	public ClassLoader createClassLoader (final IProject project) throws CoreException {
		IJavaProject jp = JavaCore.create(project);
		
//		IClasspathEntry[] javacp = jp.getResolvedClasspath(true);
		IPackageFragmentRoot[] roots = jp.getAllPackageFragmentRoots();
		URL[] urls = new URL[roots.length];

		IPath wsLocation = ResourcesPlugin.getWorkspace().getRoot().getLocation();
		for (int i=0; i<roots.length; i++) {
			try {
				IPath path = roots[i].getPath();
				File file = path.toFile();
				if (!file.exists()) {
					path = wsLocation.append(path);
					file = path.toFile();
				}
				URL url = file.toURI().toURL();
				urls[i] = url;
			} catch (MalformedURLException e) {
				Activator.logError(e);
			}
		}
		return new URLClassLoader(urls);
	}

	@Override
	protected URL loadFromContextClassLoader(final String path) {
		URL resource = projectCL.getResource(path);
		if ( resource == null ) {
			resource = super.loadFromContextClassLoader(path);
		}
		return resource;
	}

}