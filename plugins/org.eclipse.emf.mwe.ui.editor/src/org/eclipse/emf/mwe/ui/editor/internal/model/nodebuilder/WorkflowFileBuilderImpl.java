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
import org.eclipse.emf.mwe.ui.editor.model.nodebuilder.AbstractNodeBuilderStrategy;
import org.xml.sax.Attributes;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.3 $
 */
public class WorkflowFileBuilderImpl extends AbstractNodeBuilderStrategy {

    private static final String WORKFLOW_TAG = "workflow";

    /**
     * This method overrides the implementation of <code>addChild</code>
     * inherited from the superclass.
     * 
     * @see org.eclipse.emf.mwe.ui.editor.model.nodebuilder.AbstractNodeBuilderStrategy#addAsChild(org.eclipse.emf.ecore.EObject,
     *      org.eclipse.emf.ecore.EObject)
     */
    @Override
    protected void addAsChild(final EObject ctx, final EObject object) {

    }

    /**
     * This method overrides the implementation of <code>createObject</code>
     * inherited from the superclass.
     * 
     * @see org.eclipse.emf.mwe.ui.editor.model.nodebuilder.AbstractNodeBuilderStrategy#createObject()
     */
    @Override
    protected EObject createObject() {
        return FACTORY.createWorkflowFile();
    }

    /**
     * This method overrides the implementation of <code>getImage</code>
     * inherited from the superclass.
     * 
     * @see org.eclipse.emf.mwe.ui.editor.model.nodebuilder.AbstractNodeBuilderStrategy#getImage()
     */
    @Override
    protected String getImage() {
        return null;
    }

    /**
     * This method overrides the implementation of
     * <code>internalIsProperty</code> inherited from the superclass.
     * 
     * @see org.eclipse.emf.mwe.ui.editor.model.nodebuilder.AbstractNodeBuilderStrategy#internalIsProperty(org.xml.sax.Attributes)
     */
    @Override
    protected boolean internalIsProperty(final Attributes attributes) {
        return false;
    }

    /**
     * This method overrides the implementation of <code>isFeatureMatch</code>
     * inherited from the superclass.
     * 
     * @see org.eclipse.emf.mwe.ui.editor.model.nodebuilder.AbstractNodeBuilderStrategy#isFeatureMatch(java.lang.String,
     *      org.xml.sax.Attributes)
     */
    @Override
    protected boolean isFeatureMatch(final String localName,
            final Attributes attributes) {
        return localName.equals(WORKFLOW_TAG);
    }

    /**
     * This method overrides the implementation of <code>isRootElement</code>
     * inherited from the superclass.
     * 
     * @see org.eclipse.emf.mwe.ui.editor.model.nodebuilder.AbstractNodeBuilderStrategy#isRootElement()
     */
    @Override
    protected boolean isRootElement() {
        return true;
    }

    /**
     * This method overrides the implementation of
     * <code>requiredAttributes</code> inherited from the superclass.
     * 
     * @see org.eclipse.emf.mwe.ui.editor.model.nodebuilder.AbstractNodeBuilderStrategy#requiredAttributes()
     */
    @Override
    protected String[] requiredAttributes() {
        return new String[] {};
    }
}
