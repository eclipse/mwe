/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.ui.workflow.debug;

import static org.eclipse.emf.mwe.internal.core.debug.mwe.WorkflowElementAdapter.TYPE;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.internal.core.ast.AbstractASTBase;
import org.eclipse.emf.mwe.internal.core.ast.ComponentAST;
import org.eclipse.emf.mwe.internal.core.ast.InclusionAST;
import org.eclipse.emf.mwe.internal.core.ast.parser.Location;
import org.eclipse.emf.mwe.internal.core.ast.parser.XmlLocationAnalyser;
import org.eclipse.emf.mwe.internal.core.ast.util.WorkflowFactory;
import org.eclipse.emf.mwe.internal.ui.workflow.Activator;
import org.eclipse.emf.mwe.ui.debug.model.MWEBreakpoint;
import org.eclipse.emf.mwe.ui.debug.processing.PluginAdapter;
import org.eclipse.emf.mwe.ui.workflow.util.PluginConfigurationElementUtil;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;

/**
 * The IPluginAdapter implementation for WorkflowComponents.
 * 
 */
public class MWEPluginAdapter implements PluginAdapter {

	private final XmlLocationAnalyser locationAnalyser;
	private static Set<String> extensions = new HashSet<String>();
	
	static {
		extensions.add("mwe");
		extensions.add("oaw");
	}

	// -------------------------------------------------------------------------

	public MWEPluginAdapter() {
		this.locationAnalyser = new XmlLocationAnalyser();
	}

	public boolean canHandleResourceExtension(final String ext) {
		return getRequiredExtension().contains(ext);
	}

	public boolean canHandleType(final String type) {
		return TYPE.equals(type);
	}

	private Set<String> getRequiredExtension() {
		return extensions;
	}

	public String getEditorId() {
		IConfigurationElement[] configElements = PluginConfigurationElementUtil.getConfigElements("org.eclipse.ui.editors/" + "editor[extensions=mwe, oaw]/id");
		for (IConfigurationElement element : configElements) {
			if (element.getAttribute("default").equalsIgnoreCase("true")) {
				return element.getAttribute("id");
			}
		}
		return configElements.length != 0?configElements[0].getAttribute("id"):null;
	}

	public boolean isToggleBpEnabled(final IResource resource, final int start, final int end, final int line) {
		return getComponentAstAtLine(resource, line) != null;
	}

	public MWEBreakpoint createBreakpoint(final IResource resource, final int start, final int end, final int line) throws CoreException {
		// TODO: ER: allow BP on file's end tag (e.g. </workflow> )
		ComponentAST comp = getComponentAstAtLine(resource, line);
		if (comp == null) {
			return null;
		}
		// get the correct start and end of the tag
		return new MWEBreakpoint(resource, getElementName(comp), comp.getLineNumber(), comp.getOffset(), comp.getLength());
	}

	public IBreakpoint checkBreakpoints(final IBreakpoint[] bps, final IResource resource, final int start, final int end, final int line) throws CoreException {
		ComponentAST comp = getComponentAstAtLine(resource, line);
		if (comp == null) {
			return null;
		}

		Location loc = locationAnalyser.adapt(comp.getLocation());
		for (IBreakpoint bp1 : bps) {
			MWEBreakpoint bp = (MWEBreakpoint) bp1;
			if (bp.getResource().equals(resource.getFullPath().toString()) && (bp.getLine() == loc.getLineNumber())
					&& (bp.getCharStart() == loc.getNameStart()) && (bp.getCharEnd() == loc.getNameEnd())) {
				return bp;
			}
		}
		return null;
	}

	// get the closest ComponentAst that surrounds the lineNumber
	private ComponentAST getComponentAstAtLine(final IResource resource, final int lineNumber) {
		IPath path = resource.getFullPath();
		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
		String wfFileName = file.getLocation().toString();

		final WorkflowFactory factory = new WorkflowFactory();
		final Issues issues = new IssuesImpl();
		final Map<String, String> params = new HashMap<String, String>();

		AbstractASTBase wfAST = factory.parseAndInitialize(wfFileName, issues, params);
		if ((wfAST != null) && (wfAST instanceof ComponentAST)) {
			List<AbstractASTBase> candidates = ((ComponentAST) wfAST).getChildren();

			AbstractASTBase candidate = null;
			Location loc = null;
			for (AbstractASTBase next : candidates) {
				loc = locationAnalyser.adapt(next.getLocation());
				next.setLocation(loc);
				if (loc.getLineNumber() > lineNumber) {
					if (candidate instanceof ComponentAST) {
						return (ComponentAST) candidate;
					}
				}
				candidate = next;
			}
			if (candidate instanceof ComponentAST) {
				return (ComponentAST) candidate;
			}
		}
		return null;
	}

	private String getElementName(final ComponentAST ast) {
		if (ast.getId() != null) {
			return ast.getId();
		}
		if (ast instanceof InclusionAST) {
			return ((InclusionAST) ast).getFile();
		}
		String clazz = new Path(ast.getClazz()).getFileExtension();
		if (clazz != null) {
			return clazz;
		}
		return ast.getClazz();
	}

	private Image icon = null;

	public Image getIcon() {
		if (icon != null) {
			return icon;
		}
		IPath path = new Path("/icons/workflowfile.gif");
		InputStream is = null;
		try {
			is = FileLocator.openStream(Activator.getDefault().getBundle(), path, false);
		} catch (IOException e) {
		}
		if (is != null) {
			final ImageData iData = new ImageData(is);
			icon = new Image(Display.getCurrent(), iData);
			return icon;
		}
		return null;
	}

}
