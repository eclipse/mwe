/*******************************************************************************
 * Copyright (c) 2005, 2006 committers of openArchitectureWare and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.core.ast.parser;

public class ParseException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1943730836608506785L;
	private final Location location;

    public ParseException(final String string, final Location location) {
        super(string);
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }
}
