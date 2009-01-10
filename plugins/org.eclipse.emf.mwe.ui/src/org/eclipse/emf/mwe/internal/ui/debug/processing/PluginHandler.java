/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
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
