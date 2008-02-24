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

package org.eclipse.emf.mwe.ui.neweditor.internal.model.builder;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.ui.neweditor.internal.images.EditorImages;
import org.eclipse.emf.mwe.ui.neweditor.model.builder.AbstractNodeBuilderStrategy;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */
public class AssignmentBuilderImpl extends AbstractNodeBuilderStrategy {

    /**
     * This automatically generated method overrides the implementation of
     * <code>createObject</code> inherited from the superclass.
     * 
     * @see org.eclipse.emf.mwe.ui.neweditor.model.builder.AbstractNodeBuilderStrategy#createObject()
     */
    @Override
    protected EObject createObject() {
        return FACTORY.createAssignment();
    }

    /**
     * This automatically generated method overrides the implementation of
     * <code>getImage</code> inherited from the superclass.
     * 
     * @see org.eclipse.emf.mwe.ui.neweditor.model.builder.AbstractNodeBuilderStrategy#getImage()
     */
    @Override
    protected String getImage() {
        return EditorImages.ASSIGNMENT;
    }

    /**
     * This automatically generated method overrides the implementation of
     * <code>requiredAttributes</code> inherited from the superclass.
     * 
     * @see org.eclipse.emf.mwe.ui.neweditor.model.builder.AbstractNodeBuilderStrategy#requiredAttributes()
     */
    @Override
    protected String[] requiredAttributes() {
        return new String[] {};
    }
}
