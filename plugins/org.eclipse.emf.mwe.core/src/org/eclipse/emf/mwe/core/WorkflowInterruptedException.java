/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.emf.mwe.core;

public class WorkflowInterruptedException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 7995016626229631046L;

	public WorkflowInterruptedException() {
        super();
    }

    public WorkflowInterruptedException(final String message) {
        super(message);
    }

}
