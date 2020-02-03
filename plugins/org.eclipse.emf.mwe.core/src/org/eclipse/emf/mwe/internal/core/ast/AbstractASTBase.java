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
package org.eclipse.emf.mwe.internal.core.ast;

import org.eclipse.emf.mwe.internal.core.ast.parser.Location;
import org.eclipse.emf.mwe.internal.core.ast.util.VisitorBase;

public abstract class AbstractASTBase {
    private Location location = null;

    public AbstractASTBase(final Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

	public void setLocation(Location location) {
		this.location = location;
	}

    public int getColumnNumber() {
        return location.getColumnNumber();
    }

    public int getLineNumber() {
        return location.getLineNumber();
    }

    public String getResource() {
        return location.getResource();
    }

    public final Object accept(final VisitorBase visitor) {
        return visitor.visit(this);
    }

    public int getLength() {
        return location.getNameEnd();
    }

    public int getOffset() {
        return location.getNameStart();
    }

}
