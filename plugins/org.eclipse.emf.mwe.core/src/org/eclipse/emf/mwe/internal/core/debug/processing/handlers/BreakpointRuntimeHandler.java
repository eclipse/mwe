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
import java.util.List;

import org.eclipse.emf.mwe.core.debug.model.SyntaxElement;
import org.eclipse.emf.mwe.core.debug.processing.ElementAdapter;
import org.eclipse.emf.mwe.internal.core.debug.communication.Connection;
import org.eclipse.emf.mwe.internal.core.debug.communication.packages.BreakpointPackage;
import org.eclipse.emf.mwe.internal.core.debug.processing.DebugMonitor;
import org.eclipse.emf.mwe.internal.core.debug.processing.ProcessHandler;
import org.eclipse.emf.mwe.internal.core.debug.processing.RuntimeHandler;

/**
 * This class handles the communication of Breakpoints on the runtime side. It
 * listens in an extra thread for set and removal of breakpoints. The
 * <code>DebugMonitor</code> uses this class to suspend the runtime process at
 * breakpoints.
 */
public class BreakpointRuntimeHandler implements RuntimeHandler, ProcessHandler, Runnable {

	public static final int SET = 1;

	public static final int REMOVE = 2;

	protected Connection connection;

	protected DebugMonitor monitor;

	private final List<Object> breakpoints = new ArrayList<Object>();

	private final List<SyntaxElement> breakpointTOs = new ArrayList<SyntaxElement>();

	private final List<SyntaxElement> toBeRemovedTOs = new ArrayList<SyntaxElement>();

	// -------------------------------------------------------------------------

	/**
	 * @see org.eclipse.emf.mwe.internal.core.debug.processing.RuntimeHandler#init(org.eclipse.emf.mwe.internal.core.debug.processing.DebugMonitor,
	 *      org.eclipse.emf.mwe.internal.core.debug.communication.Connection)
	 */
	@Override
	public void init(final DebugMonitor monitor, final Connection connection) {
		this.monitor = monitor;
		this.connection = connection;
		if (monitor != null) {
			monitor.addProcessHandler(this);
		}
	}

	/**
	 * @see org.eclipse.emf.mwe.internal.core.debug.processing.RuntimeHandler#startListener()
	 */
	@Override
	public void startListener() {
		Thread thread = new Thread(this, getClass().getSimpleName());
		thread.setDaemon(true);
		thread.start();
	}

	/**
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		try {
			while (true) {
				listenAndDispatchCommand();
			}
		}
		catch (IOException e) {
		}
	}

	private void listenAndDispatchCommand() throws IOException {
		handle((BreakpointPackage) connection.listenForPackage(BreakpointPackage.class));
	}

	private void handle(final BreakpointPackage packet) {
		switch (packet.type) {
			case SET:
				doSet(packet.se, null, 0);
				break;
			case REMOVE:
				doRemove(packet.se, null, 0);
				break;
			default:
				break;
		}
	}

	// -------------------------------------------------------------------------

	private void doSet(final SyntaxElement se, final Object actual, final int flag) {
		ElementAdapter adapter = monitor.getAdapter(se);
		if (adapter == null)
			return;
		Object element = adapter.findElement(se, actual, flag);
		// breakpoints may be set before the syntax element structure is
		// instantiated
		// in this case we store the SyntaxElement and try it again during
		// shallSuspend(...)
		if (element == null) {
			breakpointTOs.add(se);
			for (SyntaxElement cand : toBeRemovedTOs) {
				if (se.equalsBP(cand)) {
					toBeRemovedTOs.remove(cand);
					break;
				}
			}
		}
		else {
			breakpoints.add(element);
		}
	}

	private void doRemove(final SyntaxElement se, final Object actual, final int flag) {
		ElementAdapter adapter = monitor.getAdapter(se);
		if (adapter == null)
			return;
		Object element = adapter.findElement(se, actual, flag);
		if (element == null) {
			toBeRemovedTOs.add(se);
			for (SyntaxElement cand : breakpointTOs) {
				if (se.equalsBP(cand)) {
					breakpointTOs.remove(cand);
					break;
				}
			}
		}
		else {
			breakpoints.remove(element);
		}
	}

	// -------------------------------------------------------------------------
	// process listener implementation

	@Override
	public boolean isLastCall() {
		return false;
	}

	/**
	 * returns true if a breakpoint is rgeistered for that element
	 * 
	 * @see org.eclipse.emf.mwe.internal.core.debug.processing.ProcessHandler#shallSuspend(boolean,
	 *      java.lang.Object, int)
	 */
	@Override
	public boolean shallSuspend(final boolean lastState, final Object element, final int flag) {
		if (!toBeRemovedTOs.isEmpty()) {
			List<SyntaxElement> temp = new ArrayList<SyntaxElement>();
			temp.addAll(toBeRemovedTOs);
			toBeRemovedTOs.clear();
			for (SyntaxElement se : temp) {
				doRemove(se, element, flag);
			}
		}
		if (!breakpointTOs.isEmpty()) {
			List<SyntaxElement> temp = new ArrayList<SyntaxElement>();
			temp.addAll(breakpointTOs);
			breakpointTOs.clear();
			for (SyntaxElement se : temp) {
				doSet(se, element, flag);
			}
		}
		return lastState || breakpoints.contains(element);
	}

	/**
	 * no contribution here
	 * 
	 * @see org.eclipse.emf.mwe.internal.core.debug.processing.ProcessHandler#shallHandle(boolean,
	 *      java.lang.Object, int)
	 */
	@Override
	public boolean shallHandle(final boolean lastState, final Object element, final int flag) {
		return lastState;
	}

	/**
	 * no contribution here
	 * 
	 * @see org.eclipse.emf.mwe.internal.core.debug.processing.ProcessHandler#shallInterrupt(boolean)
	 */
	@Override
	public boolean shallInterrupt(final boolean lastState) {
		return lastState;
	}

}
