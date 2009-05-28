/*******************************************************************************
 * Copyright (c) 2005, 2006 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.core.ast;

import org.eclipse.emf.mwe.internal.core.ast.parser.Location;

public class SimpleParamAST extends AbstractASTBase implements NamedAST {

    private String name;

    private String value;

    public SimpleParamAST(final Location location, final String name, final String value) {
        super(location);
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return name + "='" + value + "' " + getLocation().toString();
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(final String string) {
        value = string;
    }

}
