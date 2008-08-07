/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.File;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.3 $
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
				try {
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
				catch (final Exception e) {
					return null;
				}
			}
		}
		return null;
	}

	public static File loadModelFile(final IFile file) {
		if (file == null)
			return null;

		try {
			final InputStream is = file.getContents();
			return loadResource(file, is);
		}
		catch (final Exception e) {
			CoreLog.logError("Could not load model file '" + file.getName() + "'", e);
			return null;
		}
	}

	public static File loadModelFile(final IProject project, final String filePath) {
		if (project == null || filePath == null)
			return null;

		final IFile file = project.getFile(filePath);
		try {
			final URL fileURL = getFile(project, filePath);
			final InputStream is = fileURL.openStream();
			return loadResource(file, is);
		}
		catch (final Exception e) {
			CoreLog.logError("Could not load model file '" + file.getName() + "'", e);
			return null;
		}
	}

	private static URL getFile(final IProject project, final String filePath) {
		if (project == null || filePath == null)
			return null;

		final IFile file = project.getFile(new Path(filePath));
		if (file == null)
			return null;

		ClassLoader loader = null;
		try {
			loader = createClassLoader(project);
		}
		catch (final CoreException e) {
			throw new RuntimeException("Could not obtain resource loader");
		}

		final URL fileURL = loader.getResource(file.getProjectRelativePath().toString());
		return fileURL;
	}

	private static File loadResource(final IFile file, final InputStream is) throws IOException {
		if (file == null || is == null)
			return null;

		final ResourceSet rs = new ResourceSetImpl();
		final Resource resource = rs.createResource(URI.createURI(file.getLocationURI().toString()));
		resource.load(is, null);
		if (resource.getContents().isEmpty())
			return null;

		final EObject object = resource.getContents().iterator().next();
		return (File) object;
	}

	/**
	 * Builds a classloader for a Java project from the workspace.
	 * 
	 * @param project
	 *            An Eclipse project
	 * @throws CoreException
	 */
	public static ClassLoader createClassLoader(final IProject project) throws CoreException {
		final IJavaProject jp = JavaCore.create(project);

		final IClasspathEntry[] javacp = jp.getResolvedClasspath(true);
		final URL[] url = new URL[javacp.length];

		for (int i = 0; i < javacp.length; i++) {
			try {
				url[i] = javacp[i].getPath().toFile().toURI().toURL();
			}
			catch (final MalformedURLException e) {
				e.printStackTrace();
			}
		}
		return new URLClassLoader(url);
	}

	public static String getFileContent(final IProject project, final String filePath) {
		final URL fileURL = getFile(project, filePath);
		return getFileContent(fileURL);
	}

	public static String getFileContent(final URL fileURL) {
		BufferedReader reader = null;
		try {
			if (fileURL != null) {
				final InputStream is = fileURL.openStream();
				if (is != null) {
					final InputStreamReader streamReader = new InputStreamReader(is);
					reader = new BufferedReader(streamReader);
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
				CoreLog.logError("I/O error", e);
			}
		}
		return null;
	}
}
