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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.mwe.internal.core.ast.parser.Location;

public class ComponentAST extends AbstractASTBase implements NamedAST {

    private String clazz = null;

    private String id = null;

    public void setId(final String id) {
        this.id = id;
    }

    private final List<AbstractASTBase> children = new ArrayList<AbstractASTBase>();

    private String name = null;

    @Override
    public String getName() {
        return name;
    }

    public List<AbstractASTBase> getChildren() {
        return children;
    }

    public ComponentAST(final Location location, final String name, final String clazz, final String id) {
        super(location);
        this.name = name;
        this.clazz = clazz;
        this.id = id;
    }

    protected ComponentAST(final Location location, final String string) {
        super(location);
        name = string;
    }

    public String getId() {
        return id;
    }

    public String getClazz() {
        return clazz;
    }

    public void addChild(final AbstractASTBase ele) {
        children.add(ele);
    }

    @Override
    public String toString() {
        return "bean " + name + (clazz != null ? " class='" + clazz + "'" : "")
                + (id != null ? " id='" + id + "'" : "") + " " + getLocation();
    }

    public void setClazz(final String string) {
        clazz = string;
    }

    private Object analyzedType = null;

    public void setAnalyzedType(final Object analyzedType) {
        this.analyzedType = analyzedType;
    }

    public Object getAnalyzedType() {
        return analyzedType;
    }

}
