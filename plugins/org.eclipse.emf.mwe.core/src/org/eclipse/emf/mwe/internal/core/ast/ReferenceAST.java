/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
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
