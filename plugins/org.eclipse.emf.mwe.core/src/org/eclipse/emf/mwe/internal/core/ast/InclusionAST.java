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

import java.util.Map;

import org.eclipse.emf.mwe.internal.core.ast.parser.Location;

public class InclusionAST extends ComponentAST {

    private String file;
    private boolean inheritAll = false;

    private InclusionAST(final Location location, final String name, final String file, final String id) {
        super(location, name);
        setId(id);
        this.file = file;
    }
    public InclusionAST(final Location location, final String name, final String file, final String id, final boolean inheritAll) {
        this(location, name, file,id);
        this.inheritAll = inheritAll;
    }

    public String getFile() {
        return file;
    }
    
    public boolean isInheritAll() {
        return inheritAll;
    }

    private AbstractASTBase referenced = null;

    public AbstractASTBase getImportedElement() {
        return referenced;
    }

    public void setImportedElement(final AbstractASTBase referenced) {
        this.referenced = referenced;
    }

    public void setFile(final String string) {
        file = string;
    }

    @Override
    public String toString() {
        return getName() + " file='" + file + "'" + (getId() != null ? " id='" + getId() + "'" : "") + " "
                + getLocation();
    }

    private Map<String, String> passedProperties = null;

    private Map<String, ComponentAST> passedBeans = null;

    public Map<String, ComponentAST> getPassedBeans() {
        return passedBeans;
    }

    public void setPassedBeans(final Map<String, ComponentAST> passedBeans) {
        this.passedBeans = passedBeans;
    }

    public Map<String, String> getPassedProperties() {
        return passedProperties;
    }

    public void setPassedProperties(final Map<String, String> passedProperties) {
        this.passedProperties = passedProperties;
    }

}
