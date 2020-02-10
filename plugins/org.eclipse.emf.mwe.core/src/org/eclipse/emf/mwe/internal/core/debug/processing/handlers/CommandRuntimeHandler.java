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
import java.util.Stack;

import org.eclipse.emf.mwe.core.debug.processing.EventHandler;
import org.eclipse.emf.mwe.internal.core.debug.communication.Connection;
import org.eclipse.emf.mwe.internal.core.debug.communication.packages.CommandPackage;
import org.eclipse.emf.mwe.internal.core.debug.processing.CommandListener;
import org.eclipse.emf.mwe.internal.core.debug.processing.DebugMonitor;
import org.eclipse.emf.mwe.internal.core.debug.processing.ProcessHandler;
import org.eclipse.emf.mwe.internal.core.debug.processing.RuntimeHandler;

/**
 * This class handles the communication of debug commands on the runtime side.<br>
 * It listens in an extra thread for commands and sets state values accordingly.<br>
 * <br>
 * The <code>DebugMonitor</code> uses this class to react according to the
 * process state settings when it needs to.<br>
 * The <code>ICommandListener</code> and <code>IProcessHandler</code> methods
 * are the active ones that communicate with the debug server.<br>
 * The <code>IEventHandler</code> methods react only internally on events.
 */
public class CommandRuntimeHandler implements RuntimeHandler, CommandListener, ProcessHandler, EventHandler, Runnable {

	public static final int STEP_INTO = 1;

	public static final int STEP_OVER = 2;

	public static final int STEP_RETURN = 3;

	public static final int RESUME = 4;

	public static final int SUSPEND = 5;

	public static final int TERMINATE = 6;

	private Connection connection;

	private DebugMonitor monitor;

	// -------------------------------------------------------------------------

	private boolean stepping = false;

	private boolean forceSuspend = false;

	private boolean interrupt = false;

	private final Stack<Boolean> stackFrames = new Stack<Boolean>();

	private int iterationLevel = 0;

	private int suspendBaseLevel = 1;

	private boolean continueOperation = false;

	private final Object[] syncObject = new Object[0];

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
			monitor.setCommandListener(this);
			monitor.addProcessHandler(this);
			monitor.addEventHandler(this);
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
			doTerminate();
		}
	}

	private void listenAndDispatchCommand() throws IOException {
		dispatch(((CommandPackage) connection.listenForPackage(CommandPackage.class)).command);
	}

	private void dispatch(final int cmd) {
		switch (cmd) {
			case STEP_INTO:
			case STEP_OVER:
			case STEP_RETURN:
				doStep(cmd);
				break;
			case RESUME:
				doResume();
				break;
			case TERMINATE:
				doTerminate();
				break;
			case SUSPEND:
				doSuspend();
				break;
			default:
				break;
		}
	}

	// -------------------------------------------------------------------------

	private void doStep(final int cmd) {
		stepping = true;
		switch (cmd) {
			case STEP_INTO:
				suspendBaseLevel = iterationLevel + 1;
				break;
			case STEP_OVER:
				suspendBaseLevel = iterationLevel;
				break;
			case STEP_RETURN:
				suspendBaseLevel = iterationLevel - 1;
				break;
		}
		continueDebugger();
	}

	private void doResume() {
		stepping = false;
		continueDebugger();
	}

	private void doSuspend() {
		forceSuspend = true;
	}

	private void doTerminate() {
		interrupt = true;
		continueDebugger();
	}

	// -------------------------------------------------------------------------
	// IProcessHandler implementation

	/**
	 * the CommandRuntimeHandler shall have the last call
	 * 
	 * @see org.eclipse.emf.mwe.internal.core.debug.processing.ProcessHandler#isLastCall()
	 */
	@Override
	public boolean isLastCall() {
		return true;
	}

	/**
	 * ask the suitable element adapter if the element shall be handled.
	 * Remember that information for the pop call.
	 * 
	 * @see org.eclipse.emf.mwe.internal.core.debug.processing.ProcessHandler#shallHandle(boolean,
	 *      java.lang.Object, int)
	 */
	@Override
	public boolean shallHandle(final boolean lastState, final Object element, final int flag) {
		boolean result;
		if (flag == PUSH) {
			result = monitor.getAdapter(element).shallHandle(element);
			stackFrames.push(result);
		}
		else {
			// POP
			result = stackFrames.pop();
		}
		return lastState || result;
	}

	/**
	 * return true in case of a user's suspend request or dependend on the
	 * current iteration level.
	 * 
	 * @see org.eclipse.emf.mwe.internal.core.debug.processing.ProcessHandler#shallSuspend(boolean,
	 *      java.lang.Object, int)
	 */
	@Override
	public boolean shallSuspend(final boolean lastState, final Object element, final int flag) {
		boolean shallSuspend = lastState || forceSuspend
				|| (stepping && (suspendBaseLevel - (flag == NORMAL_FRAME ? 0 : 1) >= iterationLevel));
		if (!monitor.getAdapter(element).shallSuspend(element, flag) && shallSuspend) {
			suspendBaseLevel++;
			return false;
		}
		return shallSuspend;
	}

	/**
	 * return true in case of a user's terminate event or if the socket
	 * connection is no longer open
	 * 
	 * @see org.eclipse.emf.mwe.internal.core.debug.processing.ProcessHandler#shallInterrupt(boolean)
	 */
	@Override
	public boolean shallInterrupt(final boolean lastState) {
		return lastState || interrupt || !connection.isConnected();
	}

	// -------------------------------------------------------------------------
	// IEventHandler implementation

	/**
	 * no contribution here
	 * 
	 * @see org.eclipse.emf.mwe.core.debug.processing.EventHandler#started()
	 */
	@Override
	public void started() {
	}

	/**
	 * increment the iteration level
	 * 
	 * @see org.eclipse.emf.mwe.core.debug.processing.EventHandler#preTask(java.lang.Object,java.lang.Object,
	 *      int)
	 */
	@Override
	public void preTask(final Object element, final Object context, final int state) {
		iterationLevel++;
	}

	/**
	 * decrement the iteration level
	 * 
	 * @see org.eclipse.emf.mwe.core.debug.processing.EventHandler#postTask(java.lang.Object)
	 */
	@Override
	public void postTask(final Object context) {
		iterationLevel--;
	}

	/**
	 * reset a potential forceSuspend request
	 * 
	 * @see org.eclipse.emf.mwe.core.debug.processing.EventHandler#suspended()
	 */
	@Override
	public void suspended() {
		forceSuspend = false;
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
	 * @see org.eclipse.emf.mwe.core.debug.processing.EventHandler#terminated()
	 */
	@Override
	public void terminated() {
	}

	// -------------------------------------------------------------------------
	// ICommandListener implementation

	@Override
	public void listenCommand() {
		if (!continueOperation) {
			synchronized (syncObject) {
				try {
					syncObject.wait();
				}
				catch (InterruptedException e) {
					//
				}
			}
		}
		continueOperation = false;
	}

	// set the continue flag so that the debugMonitor doesn't need to stop if
	// the next command is already there
	private void continueDebugger() {
		continueOperation = true;
		synchronized (syncObject) {
			syncObject.notifyAll();
		}
	}

}
