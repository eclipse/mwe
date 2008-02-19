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

package org.eclipse.emf.mwe.ui.neweditor.editor;

import org.eclipse.swt.graphics.RGB;

public final class WorkflowColorConstants {
    public static final RGB XML_COMMENT = new RGB(128, 0, 0);

    public static final RGB PROC_INSTR = new RGB(128, 128, 128);

    public static final RGB STRING = new RGB(0, 128, 0);

    public static final RGB DEFAULT = new RGB(0, 0, 0);

    public static final RGB TAG = new RGB(0, 0, 128);

    /**
     * Hidden because of utility class
     */
    private WorkflowColorConstants() {
        throw new UnsupportedOperationException();
    }
}
