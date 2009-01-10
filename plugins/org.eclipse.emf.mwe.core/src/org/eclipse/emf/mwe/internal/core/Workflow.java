/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
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
