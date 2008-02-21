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

package org.eclipse.emf.mwe.ui.neweditor.elements;

import org.eclipse.swt.graphics.Image;

/**
 * This class defines the elements used in the outline view of the workflow
 * editor.
 * 
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */

public class WorkflowElement {

    private String label;

    private int start, length;

    private Image image;

    public WorkflowElement(final String label, final int start, final int length) {
        this(label, start, length, null);
    }

    public WorkflowElement(final String label, final int start,
            final int length, final Image image) {
        this.label = label;
        this.start = start;
        this.length = length;
        this.image = image;
    }

    /**
     * Returns the value of field <code>image</code>.
     * 
     * @return value of <code>image</code>.
     */
    public Image getImage() {
        return image;
    }

    /**
     * Returns the value of field <code>label</code>.
     * 
     * @return value of <code>label</code>.
     */
    public String getLabel() {
        return label;
    }

    /**
     * Returns the value of field <code>length</code>.
     * 
     * @return value of <code>length</code>.
     */
    public int getLength() {
        return length;
    }

    /**
     * Returns the value of field <code>start</code>.
     * 
     * @return value of <code>start</code>.
     */
    public int getStart() {
        return start;
    }
}
