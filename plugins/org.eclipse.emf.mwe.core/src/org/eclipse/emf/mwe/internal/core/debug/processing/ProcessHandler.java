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

/**
 * Interface that is used by the DebugMonitor to decide several operational steps.
 */
public interface ProcessHandler {
	public static final int SHALL_HANDLE = 1;

	public static final int INTERRUPT = 2;

	public static final int SUSPEND = 3;

	public static final int PUSH = 1;

	public static final int POP = 2;

	/**
	 * define if an element shall be considered or completely ignored for suspension in a debug process.<br>
	 * It should be implemented as a filter. The result shall be AND or OR related with <code>lastState</code>.
	 * 
	 * @param lastState the consolidated decisions of previously asked listeners
	 * @param element the element that is questioned
	 * @param flag one of the values <code>IProcessHandler.PUSH</code> or <code>IProcessHandler.POP</code>
	 * @return true if element shall be handled
	 */
	public boolean shallHandle(boolean lastState, Object element, int flag);

	/**
	 * define if a debug process shall be suspended for a given element.<br>
	 * It should be implemented as a filter. The result shall be AND or OR related with <code>lastState</code>.
	 * 
	 * @param lastState the consolidated decisions of previously asked listeners
	 * @param element the element that is questioned
	 * @param flag one of the values <code>IEventHandler.NORMAL_FRAME</code> or
	 *            <code>IEventHandler.END_FRAME</code>
	 * @return if the process shall suspend based on the last state and the evaluation of the current element
	 */
	public boolean shallSuspend(boolean lastState, Object element, int flag);

	/**
	 * define if the debugger runtime process shall be interrupted
	 * 
	 * @param lastState the consolidated decisions of previously asked listeners
	 * @return if the process shall be interrupted based on the last state and the evaluation of the current
	 *         element
	 */
	public boolean shallInterrupt(boolean lastState);

	/**
	 * if true, the handler has the last call and will be processed at the last handler
	 * 
	 * @return whether or not
	 */
	public boolean isLastCall();

}
