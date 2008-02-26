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

package org.eclipse.emf.mwe.ui.editor.model.nodebuilder;

import org.eclipse.emf.ecore.EObject;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */
public class ModelStructureViolation extends RuntimeException {

    private final EObject parent;

    private final EObject child;

    public ModelStructureViolation(final EObject parent, final EObject child) {
        super(errorMessage(parent, child));
        this.parent = parent;
        this.child = child;
    }

    private static String errorMessage(final EObject parent,
            final EObject child) {
        final String parentType = parent.eClass().getName();
        final String childType = child.eClass().getName();
        return "Objects of type '" + parentType
                + "do not accept child objects of type '" + childType + "'!";

    }

    /**
     * Returns the value of field <code>child</code>.
     * 
     * @return value of <code>child</code>.
     */
    public EObject getChild() {
        return child;
    }

    /**
     * Returns the value of field <code>parent</code>.
     * 
     * @return value of <code>parent</code>.
     */
    public EObject getParent() {
        return parent;
    }
}
