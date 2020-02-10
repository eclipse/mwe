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
package org.eclipse.emf.mwe.internal.core.debug.processing;

import static org.eclipse.emf.mwe.core.debug.processing.EventHandler.END_FRAME;
import static org.eclipse.emf.mwe.core.debug.processing.EventHandler.NORMAL_FRAME;
import static org.eclipse.emf.mwe.internal.core.debug.processing.ProcessHandler.INTERRUPT;
import static org.eclipse.emf.mwe.internal.core.debug.processing.ProcessHandler.POP;
import static org.eclipse.emf.mwe.internal.core.debug.processing.ProcessHandler.PUSH;
import static org.eclipse.emf.mwe.internal.core.debug.processing.ProcessHandler.SHALL_HANDLE;
import static org.eclipse.emf.mwe.internal.core.debug.processing.ProcessHandler.SUSPEND;

import java.io.IOException;
import java.net.ConnectException;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.mwe.core.debug.processing.ElementAdapter;
import org.eclipse.emf.mwe.core.debug.processing.EventHandler;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.internal.core.debug.communication.Connection;

/**
 * The heart of the debug process on the runtime side. It has callback methods that are called by the syntax element
 * implementations before and after a process step.<br>
 * It works closely together with handlers and adapters that must be registered at startup.
 */
public class DebugMonitor implements ProgressMonitor {

	private static final int STARTED = 1;

	private static final int PRE_TASK = 2;

	private static final int POST_TASK = 3;

	private static final int SUSPENDED = 4;

	private static final int RESUMED = 5;

	private static final int TERMINATED = 6;

	private final Connection connection = new Connection();

	private CommandListener commandListener;

	private final Set<ProcessHandler> processHandlers = new HashSet<ProcessHandler>();

	private final Set<EventHandler> eventHandlers = new HashSet<EventHandler>();

	private final Set<ElementAdapter> elementAdapters = new HashSet<ElementAdapter>();

	private boolean missingAdapterReported;

	private Object context;

	// -------------------------------------------------------------------------

	/**
	 * open the connection to a debug server framework (e.g. eclipse) and instantiate and start the
	 * RuntimeHandlerManager listener.
	 * 
	 * @param args
	 *            arg[1] must be the port to be connected with
	 * @throws IOException
	 */
	public void init(final String[] args) throws IOException {
		// args[0] is the class name
		final int port = findPort(args);
		init(port);
	}
	
	public void init(int port) throws IOException {
		try {
			connection.connect(port);
		}
		catch (final ConnectException e) {
			throw new IOException("Couldn't establish connection to Debugger on port " + port);
		}
		try {
			final RuntimeHandlerManager handler = new RuntimeHandlerManager(this);
			handler.setConnection(connection);
			handler.startListener();
		}
		catch (final Exception e) {
			connection.close();
			if (e instanceof RuntimeException) {
				throw (RuntimeException) e;
			}
			throw (IOException) e;
		}
	}
	
	/**
	 * Closes the connection. This releases the threads used for debugging and execution and releases memory.
	 */
	public void uninit() {
	  connection.close();
	}

	private int findPort(final String[] args) {
		for (final String string : args) {
			if (string.startsWith("port=")) {
				return Integer.parseInt(string.substring(5));
			}
		}
		return 0;
	}

	// -------------------------------------------------------------------------

	public void setCommandListener(final CommandListener commandListener) {
		this.commandListener = commandListener;
	}

	public void addProcessHandler(final ProcessHandler handler) {
		processHandlers.add(handler);
	}

	public void addEventHandler(final EventHandler handler) {
		eventHandlers.add(handler);
	}

	// -------------------------------------------------------------------------

	public void addAdapter(final ElementAdapter adapter) {
		elementAdapters.add(adapter);
	}

	public ElementAdapter getAdapter(final Object element) {
		for (final ElementAdapter adapter : elementAdapters) {
			if (adapter.canHandle(element)) {
				return adapter;
			}
		}
		if (!missingAdapterReported) {
			System.out.println("Warning: Element can't be debugged.\nDidn't find an adapter for element of type "
					+ element.getClass().getSimpleName());
			missingAdapterReported = true;
		}
		return null;
	}

	// ------------------------------------- methods called from the mwe process

	/**
	 * fire the STARTED event to the registered event handlers
	 * 
	 * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#started(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void started(final Object element, final Object context) {
		fireEvent(STARTED);
	}

	/**
	 * the main method to manipulate the runtime process for debugging.<br>
	 * In case a suspension is requested it stops the process and waits for the next user command.
	 * 
	 * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#preTask(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void preTask(final Object element, final Object context) {
		this.context = context;
		final ElementAdapter adapter = getAdapter(element);
		if (adapter == null) {
			return;
		}
		adapter.setContext(context);

		if (!ask(SHALL_HANDLE, element, PUSH)) {
			return;
		}

		fireEvent(PRE_TASK, element, NORMAL_FRAME);
		checkInterrupt();

		try {
			if (ask(SUSPEND, element, NORMAL_FRAME)) {
				fireEvent(SUSPENDED);
				commandListener.listenCommand();
				checkInterrupt();
				fireEvent(RESUMED);
			}
		}
		catch (final IOException e) {
			throw new DebuggerInterruptedException("User interrupt");
		}
	}

	/**
	 * inform the handlers about the finalization of a process step.<br>
	 * In case the process may suspend at the end of a syntax element it does so if requested.
	 * 
	 * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#postTask(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void postTask(final Object element, final Object context) {
		this.context = context;
		final ElementAdapter adapter = getAdapter(element);
		if (adapter == null) {
			return;
		}
		adapter.setContext(context);

		if (!ask(SHALL_HANDLE, element, POP)) {
			return;
		}

		try {
			if (adapter.isSurroundingElement(element)) {
				if (ask(SUSPEND, element, END_FRAME)) {
					// if we are at the end of a "subroutine" and going to stop at the next lower level task
					// anyway
					// we add another "frame" here to stop again at the closing syntax element
					// this enables us to check variable values before closing the frame
					fireEvent(PRE_TASK, element, END_FRAME);
					fireEvent(SUSPENDED);
					commandListener.listenCommand();
					fireEvent(RESUMED);
					fireEvent(POST_TASK);
				}
			}
			fireEvent(POST_TASK);
		}
		catch (final IOException e) {
			throw new DebuggerInterruptedException(e);
		}
	}

	/**
	 * fire the finish events to the registered event handlers
	 * 
	 * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#finished(java.lang.Object, java.lang.Object)
	 */
	@Override
	public void finished(final Object element, final Object context) {
		getAdapter(element).setContext(context);
		fireEvent(PRE_TASK, element, END_FRAME);
		fireEvent(SUSPENDED);
		fireEvent(POST_TASK);
		fireEvent(TERMINATED);
	}

	// -------------------------------------------------------------------------

	private void checkInterrupt() {
		if (ask(INTERRUPT, null, 0)) {
			// we throw an exception since the preTask() method is called
			// iteratively and we want to come back to the most outer loop
			throw new DebuggerInterruptedException("User interrupt");
		}
	}

	// -------------------------------------------------------------------------

	private void fireEvent(final int event) {
		fireEvent(event, null, 0);
	}

	private void fireEvent(final int event, final Object element, final int state) {
		for (final EventHandler handler : eventHandlers) {
			try {
				if (event == PRE_TASK) {
					handler.preTask(element, context, state);
				}
				else if (event == POST_TASK) {
					handler.postTask(context);
				}
				else if (event == STARTED) {
					handler.started();
				}
				else if (event == SUSPENDED) {
					handler.suspended();
				}
				else if (event == RESUMED) {
					handler.resumed();
				}
				else if (event == TERMINATED) {
					handler.terminated();
				}
			}
			catch (final IOException e) {
				throw new DebuggerInterruptedException(e);
			}
		}
	}

	private boolean ask(final int event, final Object element, final int state) {
		boolean result = false;
		ProcessHandler lastHandler = null;

		for (final ProcessHandler handler : processHandlers) {
			if (handler.isLastCall()) {
				lastHandler = handler;
			}
			else {
				result = ask(event, element, state, result, handler);
			}
		}
		if (lastHandler != null) {
			result = ask(event, element, state, result, lastHandler);
		}
		return result;
	}

	private boolean ask(final int event, final Object element, final int state, final boolean lastState,
			final ProcessHandler handler) {
		boolean result = lastState;
		if (event == SHALL_HANDLE) {
			result = handler.shallHandle(result, element, state);
		}
		else if (event == SUSPEND) {
			result = handler.shallSuspend(result, element, state);
		}
		else if (event == INTERRUPT) {
			result = handler.shallInterrupt(result);
		}
		return result;
	}

	// ************************** unused Progress Monitor implementation methods

	@Override
	public void beginTask(final String name, final int totalWork) {
		//
	}

	@Override
	public void done() {
		//
	}

	@Override
	public void internalWorked(final double work) {
		//
	}

	@Override
	public boolean isCanceled() {
		return false;
	}

	@Override
	public void setCanceled(final boolean value) {
		//
	}

	@Override
	public void setTaskName(final String name) {
		//
	}

	@Override
	public void subTask(final String name) {
		//
	}

	@Override
	public void worked(final int work) {
		//
	}

	public void clearBlocked() {
		//
	}

	public void setBlocked(final Diagnostic reason) {
		//
	}

}
