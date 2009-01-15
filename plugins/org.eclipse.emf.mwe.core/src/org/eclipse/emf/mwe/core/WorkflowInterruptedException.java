/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.emf.mwe.core;

/**
 * Exception that signals when a workflow execution should be interrupted due
 * to an error.
 */
public class WorkflowInterruptedException extends RuntimeException {

    /** The serial version. */
	private static final long serialVersionUID = 7995016626229631046L;

	/** Creates an instance. */
	public WorkflowInterruptedException() {
        super();
    }

	/**
	 * Creates an instance.
	 * @param message Error message.
	 */
    public WorkflowInterruptedException(final String message) {
        super(message);
    }

}
