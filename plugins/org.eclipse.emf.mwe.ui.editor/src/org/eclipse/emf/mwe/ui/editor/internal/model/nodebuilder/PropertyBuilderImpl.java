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
import org.eclipse.emf.mwe.ui.editor.internal.images.EditorImages;
import org.eclipse.emf.mwe.ui.editor.internal.model.workflow.Property;
import org.eclipse.emf.mwe.ui.editor.internal.model.workflow.WorkflowFile;
import org.eclipse.emf.mwe.ui.editor.model.nodebuilder.AbstractNodeBuilderStrategy;
import org.eclipse.emf.mwe.ui.editor.model.nodebuilder.ModelStructureViolation;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */
public abstract class PropertyBuilderImpl extends AbstractNodeBuilderStrategy {

    /**
     * This method overrides the implementation of <code>addChild</code>
     * inherited from the superclass.
     * 
     * @see org.eclipse.emf.mwe.ui.editor.model.nodebuilder.AbstractNodeBuilderStrategy#addAsChild(org.eclipse.emf.ecore.EObject,
     *      org.eclipse.emf.ecore.EObject)
     */
    @Override
    protected void addAsChild(final EObject ctx, final EObject object) {
        if (ctx instanceof WorkflowFile) {
            final WorkflowFile parent = (WorkflowFile) ctx;
            parent.getProperties().add((Property) object);
        } else
            throw new ModelStructureViolation(ctx, object);
    }

    /**
     * This method overrides the implementation of <code>getImage</code>
     * inherited from the superclass.
     * 
     * @see org.eclipse.emf.mwe.ui.editor.model.nodebuilder.AbstractNodeBuilderStrategy#getImage()
     */
    @Override
    protected String getImage() {
        return EditorImages.PROPERTY;
    }

}
