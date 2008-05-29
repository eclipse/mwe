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
 
package org.eclipse.emf.mwe.ui.internal.editor.tests.reflection;

import java.net.URL;

import junit.framework.TestCase;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.mwe.ui.internal.editor.tests.TestActivator;
import org.eclipse.emf.mwe.ui.internal.editor.utils.ReflectionManager;
import org.osgi.framework.Bundle;


/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */

public class ReflectionTestBase extends TestCase {

	protected Class<?> getClass(final String className) {
		if (className == null)
			return null;
	
		final IPath path = new Path("build.properties");
		final Bundle bundle =
			TestActivator.getDefault().getBundle();
		final URL url = FileLocator.find(bundle, path, null);
		final IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		final IPath filePath = new Path(url.getPath());
		final IFile file = root.getFileForLocation(filePath);
		final Class<?> clazz = ReflectionManager.getClass(file, className);
		return clazz;
	}
}
