/*******************************************************************************
 * Copyright (c) 2005 - 2007 committers of openArchitectureWare and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.core.debug.mwe;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.mwe.core.WorkflowComponent;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.container.CompositeComponent;
import org.eclipse.emf.mwe.core.debug.model.NameValuePair;
import org.eclipse.emf.mwe.core.debug.model.SyntaxElement;
import org.eclipse.emf.mwe.core.debug.processing.ElementAdapter;
import org.eclipse.emf.mwe.internal.core.ast.parser.Location;
import org.eclipse.emf.mwe.internal.core.ast.parser.XmlLocationAnalyser;
import org.eclipse.emf.mwe.internal.core.util.ComponentPrinter;

/**
 * The IElementAdapter implementation for WorkflowComponents.
 */
public class WorkflowElementAdapter implements ElementAdapter {

	public static final String TYPE = "workflow";

	private Object context;

	private CompositeComponent root;

	private final XmlLocationAnalyser locationAnalyser;

	// -------------------------------------------------------------------------

	public WorkflowElementAdapter() {
		this.locationAnalyser = new XmlLocationAnalyser();
	}

	// -------------------------------------------------------------------------

	@Override
	public Object getContext() {
		return context;
	}

	@Override
	public void setContext(Object context) {
		this.context = context;
	}

	@Override
	public String getAdapterType() {
		return TYPE;
	}

	// -------------------------------------------------------------------------

	@Override
	public boolean canHandle(Object element) {
		if (element instanceof WorkflowComponent) {
			if (root == null) {
				root = ((WorkflowComponent) element).getContainer();
			}
			return true;
		}
		if (element instanceof SyntaxElement) {
			SyntaxElement se = (SyntaxElement) element;
			return se.resource.endsWith(".oaw");
		}
		return false;
	}

	@Override
	public boolean shallHandle(Object element) {
		// no special treatment for workflow components
		return true;
	}

	@Override
	public boolean shallSuspend(Object element, int flag) {
		// no special treatment for workflow components
		return true;
	}

	@Override
	public boolean shallAddToCallStack(Object element) {
	  return true;
	}
	
	@Override
	public boolean isSurroundingElement(Object element) {
		return CompositeComponent.class.isAssignableFrom(element.getClass());
	}

	@Override
	public SyntaxElement createElement(Object element) {
		WorkflowComponent comp = (WorkflowComponent) element;
		SyntaxElement se = new SyntaxElement();
		Location loc = comp.getLocation();
		loc = initialize(loc);

		se.containerName = ComponentPrinter.getContainerName(comp);
		se.elementName = ComponentPrinter.getElementName(comp);
		se.resource = loc.getResource();
		se.start = loc.getNameStart();
		se.end = loc.getNameEnd();
		se.line = loc.getLineNumber();
		return se;
	}

	@Override
	public SyntaxElement createEndElementTO(Object element) {
		CompositeComponent comp = (CompositeComponent) element;
		SyntaxElement se = new SyntaxElement();
		Location loc = comp.getOwnLocation();
		if (loc == null) {
			// for root
			loc = comp.getLocation();
		}
		loc = initializeEndLocation(loc);
		se.containerName = ComponentPrinter.getElementName(comp);
		se.elementName = "end of cartridge";
		if (loc != null) {
			se.resource = loc.getResource();
			se.start = loc.getNameStart();
			se.end = loc.getNameEnd();
			se.line = loc.getLineNumber();
		}
		return se;
	}

	@Override
	public List<NameValuePair> getVariables(Object element) {
		List<NameValuePair> list = new ArrayList<NameValuePair>();

		if (element instanceof WorkflowComponent) {
			// TODO: ER: show Variables, that are workflow properties
			// Note: only the available slot variables are shown
			// internal variables of the WfComponent are neither visible before
			// start nor after end of invocation
			// that's why we don't check the element itself
			WorkflowContext ctx = (WorkflowContext) context;
			for (String name : ctx.getSlotNames()) {
				list.add(new NameValuePair(name, ctx.get(name)));
			}
		}
		else {
			int i = 0;
			for (String name : ReflectionUtil.getFieldNames(element)) {
				Object childElement;
				// ReflectionUtil returns a name format "[" + i + "]" for
				// arrays, therefore we can't use name here
				if (element instanceof Object[]) {
					childElement = ((Object[]) element)[i++];
				}
				else {
					childElement = ReflectionUtil.getFieldValue(element, name);
				}
				list.add(new NameValuePair(name, childElement));
			}
		}
		return list;
	}

	@Override
	public String getVariableDetailRep(Object element) {
		return ReflectionUtil.getNameToString(element);
	}

	@Override
	public String getVariableSimpleRep(Object element) {
		return ReflectionUtil.getSimpleName(element);
	}

	@Override
	public boolean checkVariableHasMembers(Object element) {
		return ReflectionUtil.checkFields(element);
	}

	@Override
	public Object findElement(SyntaxElement se, Object actual, int flag) {
		if (root == null)
			return null;
		return findComponent(root, se.resource, se.line);
	}

	private Object findComponent(CompositeComponent parent, String resource, int lineNo) {
		Location loc = parent.getOwnLocation();
		if (loc == null) {
			loc = parent.getLocation();
		}
		if (resource.endsWith(loc.getResource())) {
			for (WorkflowComponent comp : parent.getComponents())
				if (comp.getLocation().getLineNumber() == lineNo)
					return comp;
		}
		for (WorkflowComponent comp : parent.getComponents())
			if (comp instanceof CompositeComponent) {
				CompositeComponent child = (CompositeComponent) comp;
				Object found = findComponent(child, resource, lineNo);
				if (found != null)
					return found;
			}
		return null;
	}

	private Location initialize(Location loc) {
		if (loc.getResource() == null)
			return null;
		return locationAnalyser.adapt(loc);
	}

	private Location initializeEndLocation(Location loc) {
		if (loc.getResource() == null)
			return null;
		return locationAnalyser.adaptEnd(loc);
	}

}
