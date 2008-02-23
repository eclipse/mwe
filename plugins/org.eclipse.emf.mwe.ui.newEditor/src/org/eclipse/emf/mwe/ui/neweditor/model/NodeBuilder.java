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

package org.eclipse.emf.mwe.ui.neweditor.model;

import org.eclipse.emf.ecore.EObject;
import org.xml.sax.Attributes;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */
public class NodeBuilder {

    /**
     * Creates an in-memory model object from the passed in node.
     * 
     * @param localName
     *            local name of node.
     * @param attributes
     *            attributes of node.
     * @param ctx
     *            current context.
     * @return the created model object or <code>null</code> if there is no
     *         valid model object for the node within the given context.
     */
    public EObject create(final String localName, final Attributes attributes,
            final EObject ctx) {
        // TODO Automatically generated method stub. Review needed!
        return null;
    }

}
