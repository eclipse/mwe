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
 * Thrown if the workflow configuration is invalid.
 */
public class ConfigurationException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 734514205644504349L;

	/**
     * 
     */
    public ConfigurationException() {
        super();
    }

    /**
     * @param message
     */
    public ConfigurationException(final String message) {
        super(message);
    }

    /**
     * @param message
     * @param cause
     */
    public ConfigurationException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * @param cause
     */
    public ConfigurationException(final Throwable cause) {
        super(cause);
    }
}
