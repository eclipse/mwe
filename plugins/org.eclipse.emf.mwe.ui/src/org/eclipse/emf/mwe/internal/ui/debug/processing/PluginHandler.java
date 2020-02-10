/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Clemens Kadura (zAJKa) - Initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.ui.debug.processing;

import org.eclipse.emf.mwe.internal.core.debug.communication.Connection;

/**
 * base interface for handlers that support the debugger on the eclipse side
 */
public interface PluginHandler {
	public void setConnection(Connection connection);

	public void setDebugModelManager(DebugModelManager dmm);
}
