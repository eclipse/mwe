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
package org.eclipse.emf.mwe.internal.core;

import org.eclipse.emf.mwe.core.container.CompositeComponent;

public class Workflow extends CompositeComponent {

    private boolean isAbstract;

	public Workflow() {
        super("workflow");
    }

    public void setAbstract( final boolean b ) {
    	isAbstract = b;
    }
    
    public boolean isAbstract() {
    	return isAbstract;
    }
    
}
