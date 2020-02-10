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
import org.eclipse.emf.mwe.internal.core.ast.parser.WorkflowParser;

public class DeclaredPropertyAST extends AbstractASTBase {

    private String name;

    private String value;

    public DeclaredPropertyAST(final Location location, final String name) {
        super(location);
        this.name = name;
    }

    public DeclaredPropertyAST(final Location location, final String name, final String value) {
        this(location, name);
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public boolean isAbstract() {
        return value == null;
    }

    @Override
    public String toString() {
        return "<" + WorkflowParser.PROPERTY + " name='" + name + "'" + (!isAbstract() ? " value='" + value + "'" : "")
                + "/>";
    }

}
