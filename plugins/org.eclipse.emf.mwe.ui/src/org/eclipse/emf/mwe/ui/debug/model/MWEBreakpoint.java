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
package org.eclipse.emf.mwe.ui.debug.model;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.LineBreakpoint;
import org.eclipse.emf.mwe.core.debug.model.SyntaxElement;
import org.eclipse.emf.mwe.internal.ui.workflow.util.PluginConfigurationElementUtil;

/**
 * A line- and in-text breakpoint that supports the MWE debug model
 * 
 */
public class MWEBreakpoint extends LineBreakpoint {

	public static final String DEBUG_MODEL_ID = "org.eclipse.emf.mwe.debug.model";

	public static final String RESOURCE = "resource";

	public static final String NAME = "name";

	public static final String ELEMENT_NAME = "element";

	public MWEBreakpoint() {
		super();
	}

	public MWEBreakpoint(final IResource resource, final String elementName, final int lineNumber,
			final int start, final int end) throws CoreException {

		IWorkspaceRunnable runnable = new IWorkspaceRunnable() {
			public void run(IProgressMonitor monitor) throws CoreException {
				IMarker marker = resource.createMarker(getMarkerId());
				setMarker(marker);
				marker.setAttribute(IBreakpoint.ENABLED, Boolean.TRUE);
				marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
				marker.setAttribute(IMarker.CHAR_START, start);
				marker.setAttribute(IMarker.CHAR_END, end);
				marker.setAttribute(IBreakpoint.ID, getModelIdentifier());
				marker.setAttribute(RESOURCE, resource.getFullPath().toString());
				marker.setAttribute(NAME, resource.getName());
				marker.setAttribute(ELEMENT_NAME, elementName);
				marker.setAttribute(IMarker.MESSAGE, getName());
				
			}

		};
		run(getMarkerRule(resource), runnable);
	}

	public String getModelIdentifier() {
		return DEBUG_MODEL_ID;
	}

	public String getName() {
		return getMarker().getAttribute(NAME, "") + " [line: " + getMarker().getAttribute(IMarker.LINE_NUMBER, 0)
				+ "] - " + getMarker().getAttribute(ELEMENT_NAME, "");
	}

	public int getLine() {
		return getMarker().getAttribute(IMarker.LINE_NUMBER, 0);
	}

	public int getOffset() {
		return getMarker().getAttribute(IMarker.CHAR_START, 0);
	}

	public String getResource() {
		return getMarker().getAttribute(RESOURCE, "");
	}

	public SyntaxElement createTO() {
		SyntaxElement se = new SyntaxElement();
		se.resource = getResource();
		se.line = getLine();
		se.start = getOffset();
		return se;
	}

	public boolean equals(final int start, final String resource) {
		return (getOffset() == start) && getResource().endsWith(resource);
	}

	private String getMarkerId() {
		return PluginConfigurationElementUtil.getConfigAttribute("org.eclipse.debug.core.breakpoints/"
				+ "breakpoint[class=" + getClass().getName() + "]/markerType");
	}
}
