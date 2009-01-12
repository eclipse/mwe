/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.core.ant;

/**
 * Simple bean that holds a name/value pair.
 * 
 */
public class Parameter {
    private String name;

    private String value;

    /** Property getter */
    public String getName() {
        return name;
    }

    /** Property setter */
    public void setName(final String name) {
        this.name = name;
    }

    /** Property getter */
    public String getValue() {
        return value;
    }

    /** Property setter */
    public void setValue(final String value) {
        this.value = value;
    }

}
