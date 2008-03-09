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

package org.eclipse.emf.mwe.ui.internal.editor.analyzer;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */
public class WorkflowAnalyzer extends DefaultAnalyzer {

    private static final String DEFAULT_NAME =
            "org.eclipse.emf.mwe.core.container.CompositeComponent";

    public WorkflowAnalyzer(final IFile file, final IDocument document) {
        super(file, document);
    }

    /**
     * This method overrides the implementation of <code>getDefaultName</code>
     * inherited from the superclass.
     * 
     * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.DefaultAnalyzer#getDefaultName()
     */
    @Override
    protected String getDefaultName() {
        return DEFAULT_NAME;
    }
}
