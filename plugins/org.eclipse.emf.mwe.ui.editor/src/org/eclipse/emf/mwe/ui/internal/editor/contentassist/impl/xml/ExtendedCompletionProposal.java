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

package org.eclipse.emf.mwe.ui.internal.editor.contentassist.impl.xml;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */

public class ExtendedCompletionProposal implements ICompletionProposal {

	private final CompletionProposal proposal;

	public ExtendedCompletionProposal(final String replacementString,
			final int replacementOffset, final int replacementLength,
			final int cursorPosition) {
		proposal =
			new CompletionProposal(replacementString, replacementOffset,
					replacementLength, cursorPosition);
	}

	public ExtendedCompletionProposal(final String replacementString,
			final int replacementOffset, final int replacementLength,
			final int cursorPosition, final Image image,
			final String displayString,
			final IContextInformation contextInformation,
			final String additionalProposalInfo) {
		proposal =
			new CompletionProposal(replacementString, replacementOffset,
						replacementLength, cursorPosition, image,
						displayString, contextInformation,
						additionalProposalInfo);
	}


	/**
	 * @param document
	 * @see org.eclipse.jface.text.contentassist.CompletionProposal#apply(org.eclipse.jface.text.IDocument)
	 */
	public void apply(final IDocument document) {
		proposal.apply(document);
	}

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>equals</code> inherited from the superclass.
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof ExtendedCompletionProposal))
			return false;
		final ExtendedCompletionProposal other =
			(ExtendedCompletionProposal) obj;
		if (proposal == null) {
			if (other.proposal != null)
				return false;
		} else if (!getDisplayString().equals(other.getDisplayString()))
			return false;
		return true;
	}

	/**
	 * @return
	 * @see org.eclipse.jface.text.contentassist.CompletionProposal#getAdditionalProposalInfo()
	 */
	public String getAdditionalProposalInfo() {
		return proposal.getAdditionalProposalInfo();
	}

	/**
	 * @return
	 * @see org.eclipse.jface.text.contentassist.CompletionProposal#getContextInformation()
	 */
	public IContextInformation getContextInformation() {
		return proposal.getContextInformation();
	}

	/**
	 * @return
	 * @see org.eclipse.jface.text.contentassist.CompletionProposal#getDisplayString()
	 */
	public String getDisplayString() {
		return proposal.getDisplayString();
	}

	/**
	 * @return
	 * @see org.eclipse.jface.text.contentassist.CompletionProposal#getImage()
	 */
	public Image getImage() {
		return proposal.getImage();
	}

	/**
	 * @param document
	 * @return
	 * @see org.eclipse.jface.text.contentassist.CompletionProposal#getSelection(org.eclipse.jface.text.IDocument)
	 */
	public Point getSelection(final IDocument document) {
		return proposal.getSelection(document);
	}

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>hashCode</code> inherited from the superclass.
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result =
			prime
			* result
			+ (proposal == null ? 0 : getDisplayString()
					.hashCode());
		return result;
	}
}
