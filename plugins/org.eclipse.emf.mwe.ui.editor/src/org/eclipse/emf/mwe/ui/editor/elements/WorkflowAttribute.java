/*
 * Copyright (c) 2008 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    committers of openArchitectureWare - initial API and implementation
 */

package org.eclipse.emf.mwe.ui.editor.elements;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */

public class WorkflowAttribute {

    private final String name;

    private final String value;

    public WorkflowAttribute(final String name) {
        this(name, null);
    }

    public WorkflowAttribute(final String name, final String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * Returns the value of field <code>name</code>.
     * 
     * @return value of <code>name</code>.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the value of field <code>value</code>.
     * 
     * @return value of <code>value</code>.
     */
    public String getValue() {
        return value;
    }
}
