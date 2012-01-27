/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.emf.mwe.core.monitor;

/**
 * @author thoms - Initial contribution and API
 */
public interface ProgressMonitor2 extends ProgressMonitor {
	/**
	 * Initializes the Monitor after instantiation with arguments passed to the workflow engine
	 */
	void init (String[] args);
}
