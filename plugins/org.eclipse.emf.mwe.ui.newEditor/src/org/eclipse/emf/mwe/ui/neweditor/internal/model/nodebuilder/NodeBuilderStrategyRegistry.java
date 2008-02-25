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

package org.eclipse.emf.mwe.ui.neweditor.internal.model.nodebuilder;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.ui.neweditor.model.nodebuilder.INodeBuilderStrategy;
import org.eclipse.emf.mwe.ui.neweditor.model.nodebuilder.NoSuchModelElement;
import org.eclipse.jface.text.Position;
import org.xml.sax.Attributes;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */
public class NodeBuilderStrategyRegistry implements INodeBuilderStrategy {

    List<INodeBuilderStrategy> strategies;

    public NodeBuilderStrategyRegistry() {
        strategies = initializeStrategies();
    }

    /**
     * This automatically generated method overrides the implementation of
     * <code>create</code> inherited from the superclass.
     * 
     * @see org.eclipse.emf.mwe.ui.neweditor.model.nodebuilder.INodeBuilderStrategy#create(java.lang.String,
     *      org.xml.sax.Attributes, org.eclipse.emf.ecore.EObject, Position)
     */
    @Override
    public EObject create(final String localName, final Attributes attributes,
            final EObject ctx, final Position position)
            throws NoSuchModelElement {
        EObject object = null;

        for (final INodeBuilderStrategy str : strategies) {
            object = str.create(localName, attributes, ctx, position);
        }

        return object;
    }

    private List<INodeBuilderStrategy> initializeStrategies() {
        final List<INodeBuilderStrategy> l =
                new ArrayList<INodeBuilderStrategy>();
        l.add(new SimplePropertyBuilderImpl());
        l.add(new FilePropertyBuilderImpl());

        return l;
    }
}
