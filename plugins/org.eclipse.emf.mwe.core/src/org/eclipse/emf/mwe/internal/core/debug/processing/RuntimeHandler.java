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

import org.eclipse.emf.mwe.internal.core.debug.communication.Connection;

/**
 * base interface for handlers that support the debugger runtime process
 */
public interface RuntimeHandler {

	/**
	 * initiate the instantiated handler. It gets the <code>DebugMonitor</code> and <code>Connection</code>
	 * instances that may be needed for the handler to do it's work<br>
	 * the handler may be registered at the <code>DebugMonitor</code> dependent on the type of handler.
	 * 
	 * @param monitor the DebugMonitor
	 * @param connection the connection to the debugger framework
	 */
	public void init(DebugMonitor monitor, Connection connection);

	/**
	 * start the listening process in an extra thread, if required
	 */
	public void startListener();

}
