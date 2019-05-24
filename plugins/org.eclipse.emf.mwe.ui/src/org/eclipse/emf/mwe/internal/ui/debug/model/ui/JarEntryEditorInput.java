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
package org.eclipse.emf.mwe.internal.ui.debug.model.ui;

import org.eclipse.core.resources.IStorage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorRegistry;
import org.eclipse.ui.PlatformUI;

/**
 * An EditorInput for a JarEntryFile. copied from
 * org.eclipse.jdt.internal.ui.javaeditor.JarEntryEditorInput
 */
@SuppressWarnings("restriction")
public class JarEntryEditorInput extends org.eclipse.jdt.internal.ui.javaeditor.JarEntryEditorInput {

	private IStorage fJarEntryFile;

	public JarEntryEditorInput(final IStorage jarEntryFile) {
		super(jarEntryFile);
	}

	public String getFullPath() {
		return fJarEntryFile.getFullPath().toString();
	}

	@Override
	public String getToolTipText() {
		// TODO: ER: add corresponding plugin to the text
		// as it is for Files; This would be new, since it is also
		// not available in Java
		return fJarEntryFile.getFullPath().makeRelative().toString();
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		IEditorRegistry registry = PlatformUI.getWorkbench().getEditorRegistry();
		return registry.getImageDescriptor(fJarEntryFile.getFullPath().getFileExtension());
	}

	@Override
	public boolean exists() {
		// JAR entries can't be deleted
		return true;
	}

	@Override
	public <T> T getAdapter(Class<T> adapter) {
		if (adapter == IStorage.class)
			return adapter.cast(fJarEntryFile);
		return fJarEntryFile.getAdapter(adapter);
	}

	@Override
	public IStorage getStorage() {
		return fJarEntryFile;
	}

}
