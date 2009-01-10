/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.ui.debug.sourcelookup;

import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.debug.core.sourcelookup.ISourceContainerType;
import org.eclipse.debug.core.sourcelookup.containers.AbstractSourceContainer;
import org.eclipse.emf.mwe.internal.ui.workflow.Activator;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;

/**
 * adapted from
 * org.eclipse.jdt.launching.sourcelookup.containers.PackageFragmentRootSourceContainer
 * but doesn't look only for .java and .class files
 */
public class PackageFragmentRootContainer extends AbstractSourceContainer {

	private final IPackageFragmentRoot fRoot;

	public static final String TYPE_ID = Activator.PLUGIN_ID + ".packageFragmentRootContainer";

	public PackageFragmentRootContainer(final IPackageFragmentRoot root) {
		fRoot = root;
	}

	public Object[] findSourceElements(final String name) throws CoreException {
		int index = name.lastIndexOf('.');
		String typeName = name;
		String suffix = "";
		if (index >= 0) {
			suffix = name.substring(index);
			typeName = typeName.substring(0, index);
		}
		typeName = typeName.replace('/', '.');
		typeName = typeName.replace('\\', '.');
		index = typeName.lastIndexOf('.');
		String packageName = "";
		if (index >= 0) {
			packageName = typeName.substring(0, index);
			typeName = typeName.substring(index + 1);
		}
		
		IPackageFragment fragment = fRoot.getPackageFragment(packageName);
		if (fragment.exists()) {
			String elementName = typeName + suffix;
			Object[] resources = fragment.getNonJavaResources();
			for (Object resource : resources) {
				if (resource instanceof IStorage) {
					IStorage storage = (IStorage) resource;
					if (elementName.equals(storage.getName())) {
						return new Object[] { resource };
					}
				}
			}
		}
		return EMPTY;
	}

	public String getName() {
		return fRoot.getElementName();
	}

	public ISourceContainerType getType() {
		return getSourceContainerType(TYPE_ID);
	}

	@Override
	public boolean equals(final Object obj) {
		return (obj instanceof PackageFragmentRootContainer)
				&& ((PackageFragmentRootContainer) obj)
						.getPackageFragmentRoot().equals(
								getPackageFragmentRoot());
	}

	public IPackageFragmentRoot getPackageFragmentRoot() {
		return fRoot;
	}

	@Override
	public int hashCode() {
		return fRoot.hashCode();
	}

	public IPath getPath() {
		return getPackageFragmentRoot().getPath();
	}
}
