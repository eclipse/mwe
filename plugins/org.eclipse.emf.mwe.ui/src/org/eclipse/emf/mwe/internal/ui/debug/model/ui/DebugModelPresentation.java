/*******************************************************************************
 * Copyright (c) 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.ui.debug.model.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IStorage;
import org.eclipse.debug.core.model.ILineBreakpoint;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.ui.IDebugModelPresentation;
import org.eclipse.debug.ui.IValueDetailListener;
import org.eclipse.emf.mwe.internal.ui.debug.model.DebugStackFrame;
import org.eclipse.emf.mwe.internal.ui.debug.model.DebugValue;
import org.eclipse.emf.mwe.ui.debug.model.MWEBreakpoint;
import org.eclipse.emf.mwe.ui.debug.processing.PluginAdapter;
import org.eclipse.emf.mwe.ui.debug.processing.PluginExtensionManager;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.part.FileEditorInput;

/**
 * Renders debug elements for display in several views; compare to
 * org.eclipse.jdt.internal.debug.ui.JDIModelPresentation
 * 
 */
public class DebugModelPresentation extends LabelProvider implements IDebugModelPresentation {

	@Override
	public void setAttribute(final String attribute, final Object value) {
		// we don't set attributes in our debug model
	}

	// provides the image in the several view for the debug element
	// if we don't cover it here, the DefaultLabelProvider uses the default
	// debug labels
	// Hint: for ILaunch and IProcess the method is not called, so we don't have
	// a chance to customize them
	@Override
	public Image getImage(final Object element) {
		if (element instanceof DebugStackFrame) {
			final DebugStackFrame frame = (DebugStackFrame) element;
			final PluginAdapter adapter = PluginExtensionManager.getDefault().getAdapterByType(frame.getType());
			if (adapter != null)
				return adapter.getIcon();
		}
		return null;
	}

	// provides the text in the several debug views
	// Hint: we return null by intension, so that the DefaultLabelProvider calls
	// getName() on the debug elements
	// For breakpoints the default is too Java related, so we implement our own
	// presentation.
	@Override
	public String getText(final Object element) {
		if (element instanceof MWEBreakpoint)
			return ((MWEBreakpoint) element).getName();
		return null;
	}

	@Override
	public void computeDetail(final IValue value, final IValueDetailListener listener) {
		final String detail = ((DebugValue) value).getDetailRep();
		listener.detailComputed(value, detail);
	}

	// called to get the right source editor input for a resource
	@Override
	public IEditorInput getEditorInput(final Object element) {
		if (element instanceof IFile)
			return new FileEditorInput((IFile) element);
		if (element instanceof ILineBreakpoint)
			return new FileEditorInput((IFile) ((ILineBreakpoint) element).getMarker().getResource());
		if (element instanceof IStorage)
			return new JarEntryEditorInput((IStorage) element);

		return null;
	}

	// called at source editor display to show the source in the right editor
	// type
	@Override
	@SuppressWarnings("restriction")
	public String getEditorId(final IEditorInput input, final Object element) {
		String ext = "";
		if ((element instanceof IFile || element instanceof ILineBreakpoint) && input instanceof IFileEditorInput) {
			ext = ((IFileEditorInput) input).getFile().getFileExtension();
		}
		else if (element instanceof IStorage && input instanceof JarEntryEditorInput) {
			ext = ((JarEntryEditorInput) input).getContentType();
		}
		final PluginAdapter adapter = PluginExtensionManager.getDefault().getAdapterByResourceExtension(ext);
		if (adapter != null)
			return adapter.getEditorId();
		return "org.eclipse.ui.DefaultTextEditor";
	}
}
