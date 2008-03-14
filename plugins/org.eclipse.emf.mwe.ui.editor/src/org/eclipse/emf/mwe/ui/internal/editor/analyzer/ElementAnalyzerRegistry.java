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

import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElementType;
import org.eclipse.emf.mwe.ui.internal.editor.parser.ValidationException;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.4 $
 */
public class ElementAnalyzerRegistry extends DefaultAnalyzer {

    private static final String ERROR_MSG =
            "No analyzer registered for element type";

    private final HashMap<WorkflowElementType, IElementAnalyzer> map =
            new HashMap<WorkflowElementType, IElementAnalyzer>();

    public ElementAnalyzerRegistry(final IFile file, final IDocument document) {
        super(file, document);
        initRegistry();
    }

    /**
     * This method overrides the implementation of <code>checkValidity</code>
     * inherited from the superclass.
     * 
     * @see org.eclipse.emf.mwe.ui.internal.editor.analyzer.IElementAnalyzer#checkValidity(org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement)
     */
    @Override
    public void checkValidity(final WorkflowElement element) {
        if (element == null)
            return;

        final WorkflowElementType type = element.getElementType();
        final IElementAnalyzer analyzer = map.get(type);
        if (analyzer != null)
            analyzer.checkValidity(element);
        else
            throw new ValidationException(element.getStartElementRange()
                    .getStartLine(), element.getStartElementRange()
                    .getStartColumn(), ERROR_MSG + " '"
                    + element.getElementTypeString() + "'!", true);
    }

    private void initRegistry() {
        map.put(WorkflowElementType.WORKFLOWFILE, new WorkflowFileAnalyzer(
                file, document));
        map.put(WorkflowElementType.WORKFLOW, new WorkflowAnalyzer(file,
                document));
        map.put(WorkflowElementType.SIMPLE_PROPERTY, new PropertyAnalyzer(
                file, document));
        map.put(WorkflowElementType.FILE_PROPERTY, new PropertyAnalyzer(file,
                document));
        map.put(WorkflowElementType.COMPONENT, new ComponentAnalyzer(file,
                document));
        map.put(WorkflowElementType.ASSIGNMENT, new DefaultAnalyzer(file,
                document));
        map.put(WorkflowElementType.ASSIGNMENTPROPERTY, new DefaultAnalyzer(
                file, document));
    }
}
