/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Clemens Kadura (zAJKa) - Initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.ui.debug.sourcelookup;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.debug.core.sourcelookup.ISourceContainer;
import org.eclipse.debug.core.sourcelookup.ISourceContainerType;
import org.eclipse.debug.core.sourcelookup.containers.CompositeSourceContainer;
import org.eclipse.debug.core.sourcelookup.containers.FolderSourceContainer;
import org.eclipse.emf.mwe.internal.ui.workflow.Activator;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.launching.sourcelookup.containers.JavaProjectSourceContainer;

/**
 * Source container that captures all declared source folders of an underlying java project.
 * 
 * Adapted from JavaProjectSourceContainer but searches for all kinds of names, not only for java-like named resources
 */
public class SourceFolderSourceContainer extends CompositeSourceContainer {

	// Java project
	private IJavaProject fProject;

	// Source folders
	private ISourceContainer[] fSourceFolders;

	public static final String TYPE_ID = Activator.PLUGIN_ID + ".sourceFolderSourceContainer";

	public SourceFolderSourceContainer(IJavaProject project) {
		if (project == null)
			throw new IllegalArgumentException();
		fProject = project;
	}

	public String getName() {
		return fProject.getElementName();
	}

	public ISourceContainerType getType() {
		return getSourceContainerType(TYPE_ID);
	}

	/**
	 * create a FolderSourceContainer for each declared source folder of the java project
	 */
	@Override
	protected ISourceContainer[] createSourceContainers() throws CoreException {
		if (fSourceFolders == null) {
			List<ISourceContainer> containers = new ArrayList<ISourceContainer>();
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			if (fProject.getProject().isOpen()) {
				IClasspathEntry[] entries = fProject.getRawClasspath();
				for (int i = 0; i < entries.length; i++) {
					IClasspathEntry entry = entries[i];
					switch (entry.getEntryKind()) {
					case IClasspathEntry.CPE_SOURCE:
						IPath path = entry.getPath();
						IResource resource = root.findMember(path);
						if (resource instanceof IContainer) {
							containers.add(new FolderSourceContainer((IContainer) resource, false));
						}
						break;
					}
				}
			}
			fSourceFolders = containers.toArray(new ISourceContainer[containers.size()]);
		}
		return fSourceFolders;
	}

	@Override
	public boolean equals(final Object obj) {
		if (obj instanceof JavaProjectSourceContainer) {
			return fProject.equals(obj);
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return fProject.hashCode();
	}

	@Override
	public Object[] findSourceElements(String name) throws CoreException {
		// force container initialization
		getSourceContainers();
		return findSourceElements(name, fSourceFolders);
	}

	@Override
	public void dispose() {
		fSourceFolders = null;
		super.dispose();
	}

}
