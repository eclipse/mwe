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

public class ReferenceAST extends AbstractASTBase {

    private String name;

    private String idRef;

    public ReferenceAST(final Location location, final String name, final String idRef) {
        super(location);
        this.name = name;
        this.idRef = idRef;
    }

    public String getIdRef() {
        return idRef;
    }

    public void setIdRef(final String idRef) {
        this.idRef = idRef;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "<" + name + " idRef='" + idRef + "'/> " + getLocation();
    }

    private ComponentAST reference = null;

    public void setReference(final ComponentAST reference) {
        this.reference = reference;
    }

    public ComponentAST getReference() {
        return reference;
    }
}
