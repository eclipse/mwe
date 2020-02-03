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
package org.eclipse.emf.mwe.core.debug.processing;

import java.io.IOException;

/**
 * Interface to handle events from the <code>DebugMonitor</code>.<br>
 * See DebugMonitor to understand when an event is fired.
 */
public interface EventHandler {

	public static final int NORMAL_FRAME = 1;

	public static final int END_FRAME = 2;

	public void started() throws IOException;

	public void preTask(Object element, Object context, int state) throws IOException;

	public void postTask(Object context) throws IOException;

	public void suspended() throws IOException;

	public void resumed() throws IOException;

	public void terminated() throws IOException;

}
