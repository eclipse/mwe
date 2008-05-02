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

package org.eclipse.emf.mwe.ui.internal.editor.contentassist;

import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.eclipse.ui.editors.text.TextEditor;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */
public class TagContentAssistProcessor implements IContentAssistProcessor {

    private final TextEditor editor;

    public TagContentAssistProcessor(final TextEditor editor) {
        this.editor = editor;
    }

    /**
     * This method overrides the implementation of
     * <code>computeCompletionProposals</code> inherited from the superclass.
     * 
     * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#computeCompletionProposals(org.eclipse.jface.text.ITextViewer,
     *      int)
     */
    public ICompletionProposal[] computeCompletionProposals(
            final ITextViewer viewer, final int offset) {
        final ICompletionProposal[] proposals = new CompletionProposal[1];
        proposals[0] = new CompletionProposal("test", 0, 0, 0);
        return proposals;
    }

    /**
     * This method overrides the implementation of
     * <code>computeContextInformation</code> inherited from the superclass.
     * 
     * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#computeContextInformation(org.eclipse.jface.text.ITextViewer,
     *      int)
     */
    public IContextInformation[] computeContextInformation(
            final ITextViewer viewer, final int offset) {
        // TODO Automatically generated method stub. Review needed!
        return null;
    }

    /**
     * This method overrides the implementation of
     * <code>getCompletionProposalAutoActivationCharacters</code> inherited
     * from the superclass.
     * 
     * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#getCompletionProposalAutoActivationCharacters()
     */
    public char[] getCompletionProposalAutoActivationCharacters() {
        // TODO Automatically generated method stub. Review needed!
        return null;
    }

    /**
     * This method overrides the implementation of
     * <code>getContextInformationAutoActivationCharacters</code> inherited
     * from the superclass.
     * 
     * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#getContextInformationAutoActivationCharacters()
     */
    public char[] getContextInformationAutoActivationCharacters() {
        // TODO Automatically generated method stub. Review needed!
        return null;
    }

    /**
     * This method overrides the implementation of
     * <code>getContextInformationValidator</code> inherited from the
     * superclass.
     * 
     * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#getContextInformationValidator()
     */
    public IContextInformationValidator getContextInformationValidator() {
        // TODO Automatically generated method stub. Review needed!
        return null;
    }

    /**
     * This method overrides the implementation of <code>getErrorMessage</code>
     * inherited from the superclass.
     * 
     * @see org.eclipse.jface.text.contentassist.IContentAssistProcessor#getErrorMessage()
     */
    public String getErrorMessage() {
        // TODO Automatically generated method stub. Review needed!
        return null;
    }
}
