/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
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

	public WorkflowInterruptedException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public WorkflowInterruptedException(Throwable arg0) {
		super(arg0);
	}

}
