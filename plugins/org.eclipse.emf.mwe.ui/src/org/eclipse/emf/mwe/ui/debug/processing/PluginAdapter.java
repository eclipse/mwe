/*******************************************************************************
 * Copyright (c) 2005 - 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.ui.debug.processing;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.emf.mwe.ui.debug.model.MWEBreakpoint;
import org.eclipse.swt.graphics.Image;

/**
 * An adapter to the MWE debug model that handle all element type specific activities on the Eclipse side.<br>
 * That is breakpoint handling and assignment of the right editor for source lookup.
 * 
 */
public interface PluginAdapter {

	public boolean canHandleResourceExtension(String ext);

	public boolean canHandleType(String type);

	public String getEditorId();

	public Image getIcon();

	public MWEBreakpoint createBreakpoint(IResource resource, int start, int end, int line) throws CoreException;

	public IBreakpoint checkBreakpoints(IBreakpoint[] bps, IResource resource, int start, int end, int line) throws CoreException;

	public boolean isToggleBpEnabled(IResource resource, int start, int end, int line);

}
