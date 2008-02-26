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

package org.eclipse.emf.mwe.ui.editor.internal.model.nodebuilder;

import org.eclipse.emf.ecore.EObject;
import org.xml.sax.Attributes;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.2 $
 */
public class SimplePropertyBuilderImpl extends PropertyBuilderImpl {

    private static final String NAME_PROPERTY = "name";

    private static final String VALUE_PROPERTY = "value";

    /**
     * This method overrides the implementation of <code>createObject</code>
     * inherited from the superclass.
     * 
     * @see org.eclipse.emf.mwe.ui.editor.model.nodebuilder.AbstractNodeBuilderStrategy#createObject()
     */
    @Override
    protected EObject createObject() {
        return FACTORY.createSimpleProperty();
    }

    /**
     * This method overrides the implementation of
     * <code>internalIsProperty</code> inherited from the superclass.
     * 
     * @see org.eclipse.emf.mwe.ui.editor.model.nodebuilder.AbstractNodeBuilderStrategy#internalIsProperty(org.xml.sax.Attributes)
     */
    @Override
    protected boolean internalIsProperty(final Attributes attributes) {
        return hasAttribute(attributes, NAME_PROPERTY)
                && hasAttribute(attributes, VALUE_PROPERTY);
    }

    /**
     * This method overrides the implementation of
     * <code>requiredAttributes</code> inherited from the superclass.
     * 
     * @see org.eclipse.emf.mwe.ui.editor.model.nodebuilder.AbstractNodeBuilderStrategy#requiredAttributes()
     */
    @Override
    protected String[] requiredAttributes() {
        return new String[] { "name", "value" };
    }

}
