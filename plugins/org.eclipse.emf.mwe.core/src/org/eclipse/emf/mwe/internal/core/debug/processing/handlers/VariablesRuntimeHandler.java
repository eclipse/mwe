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
package org.eclipse.emf.mwe.internal.core.debug.processing.handlers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import org.eclipse.emf.mwe.core.debug.model.NameValuePair;
import org.eclipse.emf.mwe.core.debug.processing.ElementAdapter;
import org.eclipse.emf.mwe.core.debug.processing.EventHandler;
import org.eclipse.emf.mwe.internal.core.debug.communication.Connection;
import org.eclipse.emf.mwe.internal.core.debug.communication.packages.RequireVarPackage;
import org.eclipse.emf.mwe.internal.core.debug.communication.packages.VarDataPackage;
import org.eclipse.emf.mwe.internal.core.debug.model.VarValue;
import org.eclipse.emf.mwe.internal.core.debug.model.VarValueTO;
import org.eclipse.emf.mwe.internal.core.debug.processing.DebugMonitor;
import org.eclipse.emf.mwe.internal.core.debug.processing.RuntimeHandler;

/**
 * This class handles the communication of variable names and values with the debug server.<br>
 * It caches variable values with it's id and handles also cleanup of this cache if values are no longer used.
 */
public class VariablesRuntimeHandler implements RuntimeHandler, EventHandler, Runnable {

	private Connection connection;

	private DebugMonitor monitor;

	private final Stack<Frame> filteredStackFrames = new Stack<Frame>();
	private final Stack<Frame> stackFrames = new Stack<Frame>();

	private final List<VarValue> frameCache = new ArrayList<VarValue>();

	private final List<VarValue> varCache = new ArrayList<VarValue>();

	private int nextId = 0;

	// -------------------------------------------------------------------------

	@Override
	public void init(final DebugMonitor monitor, final Connection connection) {
		this.monitor = monitor;
		this.connection = connection;
		if (monitor != null) {
			monitor.addEventHandler(this);
		}
	}

	// -------------------------------------------------------------------------

	@Override
	public void startListener() {
		Thread thread = new Thread(this, getClass().getSimpleName());
		thread.setDaemon(true);
		thread.start();
	}

	@Override
	public void run() {
		try {
			while (true) {
				handle((RequireVarPackage) connection.listenForPackage(RequireVarPackage.class));
			}
		} catch (IOException e) {
		}
	}

	private void handle(final RequireVarPackage packet) throws IOException {
		List<VarValueTO> values;
		if (packet.varId == 0) {
			values = getFrameVariables(packet.frameId);
		} else {
			values = getSubVariables(packet.frameId, packet.varId);
		}
		VarDataPackage varPackage = new VarDataPackage();
		if (values != null) {
			varPackage.valueList = values;
		}
		varPackage.refId = packet.getId();
		connection.sendPackage(varPackage);
	}

	// In case there is no varId in the request the top level variables will be collected.
	// It depends on the element adapter, which variables will be reported.
	// The syntaxElement is also registered in the frameCache to find out later if variable values are still in
	// use.
	private List<VarValueTO> getFrameVariables(final int frameId) {
		if (frameId >= filteredStackFrames.size()) {
			return null;
		}
		Frame frame = filteredStackFrames.get(frameId);
		ElementAdapter adapter = monitor.getAdapter(frame.element);
		adapter.setContext(frame.context);
		cleanFramesCache();

		VarValue hostValue = new VarValue(frame.element, 0);
		frameCache.add(hostValue);

		List<VarValueTO> vars = getVariableTOs(frame.element, hostValue, adapter);
		return vars;
	}

	// In case both frameId and varId are delivered the sub variables of to var with the varId will be collected.
	// The adapter that suits for the element will be used. That means that there can be different variables
	// delivered because of different adapters for two frames although the underlying java elements are the same.
	private List<VarValueTO> getSubVariables(final int frameId, final int varId) {
		if (filteredStackFrames.size() <= frameId) {
			return null;
		}
		Frame frame = filteredStackFrames.get(frameId);
		ElementAdapter adapter = monitor.getAdapter(frame.element);
		adapter.setContext(frame.context);
		VarValue value = findVarValueById(varId);
		if (value == null) {
			return null;
		}
		return getVariableTOs(value.element, value, adapter);
	}

	// this method handles both the creation and update of variables
	// The host element is the syntax element if called from getFrameVariables() or an arbitrary java object when
	// called from getSubVariables(). It is task of the adapter to handle this correctly.
	// After all new variable values are collected there is a check for old elements that are no longer members
	// of the current host element.
	// If such a "removed" element is no longer used in any other element, it will be also removed from the
	// cache and can be garbage collected.
	// 
	private List<VarValueTO> getVariableTOs(final Object hostElement, final VarValue hostValue, final ElementAdapter adapter) {
		List<VarValueTO> list = new ArrayList<VarValueTO>();

		Set<VarValue> oldMembers = new HashSet<VarValue>();
		oldMembers.addAll(hostValue.members);
		hostValue.members.clear();

		for (NameValuePair entry : adapter.getVariables(hostElement)) {
			String name = entry.name;
			Object element = entry.value;

			VarValueTO varTO = new VarValueTO(name);

			if (element == null) {
				varTO.stringRep = "null";
				varTO.simpleRep = "null";
			} else if (element instanceof String) {
				varTO.stringRep = (String) element;
				varTO.simpleRep = "\"" + element + "\"";
			} else {
				VarValue value = findOrCreateVarValue(element);
				value.usedIn.add(hostValue);
				hostValue.members.add(value);
				oldMembers.remove(value);
				varTO.stringRep = adapter.getVariableDetailRep(element);
				varTO.simpleRep = adapter.getVariableSimpleRep(element);

				varTO.hasMembers = adapter.checkVariableHasMembers(element);
				varTO.valueId = value.id;
			}
			list.add(varTO);
		}
		for (VarValue value : oldMembers) {
			value.usedIn.remove(hostValue);
			if (value.usedIn.isEmpty()) {
				varCache.remove(value);
			}
		}
		return list;
	}

	private VarValue findOrCreateVarValue(final Object element) {
		VarValue value = findVarValueByElement(element);
		if (value == null) {
			value = new VarValue(element, ++nextId);
			varCache.add(value);
		}
		return value;
	}

	private VarValue findVarValueByElement(final Object element) {
		for (VarValue cacheEntry : varCache) {
			if (element == cacheEntry.element) {
				return cacheEntry;
			}
		}
		return null;
	}

	private VarValue findVarValueById(final int id) {
		for (VarValue cacheEntry : varCache) {
			if (id == cacheEntry.id) {
				return cacheEntry;
			}
		}
		return null;
	}

	// remove all obsolete syntax elements from the frameCache.
	// This could be more than one element in case there were many elements on the stack at the last suspend, but
	// after a RESUME and a later SUSPEND there could be a complete different variable situation on the stack.
	// Obsolete variable values are also removed from the varCache if they are nowhere else used.
	private void cleanFramesCache() {
		Set<VarValue> oldFrameValues = new HashSet<VarValue>();
		oldFrameValues.addAll(frameCache);

		for (VarValue value : oldFrameValues) {
			if (!filteredStackFrames.contains(value.element)) {
				frameCache.remove(value);
				for (VarValue member : value.members) {
					member.usedIn.remove(value);
					if (member.usedIn.isEmpty()) {
						varCache.remove(member);
					}
				}
			}
		}
	}

	// -------------------------------------------------------------------------
	// IEventHandler implementation

	/**
	 * push the syntax element onto the stack
	 * 
	 * @see org.eclipse.emf.mwe.core.debug.processing.EventHandler#preTask(java.lang.Object, java.lang.Object, int)
	 */
	@Override
	public void preTask(final Object element, final Object context, final int state) {
	    Frame frame = new Frame(element, context);
	    ElementAdapter adapter = monitor.getAdapter(element);
	    if(adapter != null)
	      if( adapter.shallAddToCallStack(element) )
	        filteredStackFrames.push(frame);
	    
		stackFrames.push(frame);
	}

	/**
	 * pop the peek element from the stack
	 * 
	 * @see org.eclipse.emf.mwe.core.debug.processing.EventHandler#postTask(Object)
	 */
	@Override
	public void postTask(final Object context) {
	    if(stackFrames.isEmpty()) return;
	    
	    Frame frame = stackFrames.peek();
	  	
	    ElementAdapter adapter = monitor.getAdapter(frame.element);
	  	if(adapter != null)
	  	  if( adapter.shallAddToCallStack(frame.element))
	  	    filteredStackFrames.pop();
	  	
	  	stackFrames.pop();
	}

	/**
	 * no contribution here
	 * 
	 * @see org.eclipse.emf.mwe.core.debug.processing.EventHandler#resumed()
	 */
	@Override
	public void resumed() {
	}

	/**
	 * no contribution here
	 * 
	 * @see org.eclipse.emf.mwe.core.debug.processing.EventHandler#suspended()
	 */
	@Override
	public void suspended() {
	}

	/**
	 * no contribution here
	 * 
	 * @see org.eclipse.emf.mwe.core.debug.processing.EventHandler#started()
	 */
	@Override
	public void started() {
	}

	/**
	 * no contribution here
	 * 
	 * @see org.eclipse.emf.mwe.core.debug.processing.EventHandler#terminated()
	 */
	@Override
	public void terminated() {
	}

	// -------------------------------------------------------------------------
	private class Frame {
		final Object element;

		final Object context;

		private Frame(final Object element, final Object context) {
			this.element = element;
			this.context = context;
		}
	}


}
