/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.emf.mwe.ui.internal.simpleEditor;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.TextPresentation;
import org.eclipse.jface.text.presentation.IPresentationDamager;
import org.eclipse.jface.text.presentation.IPresentationRepairer;
import org.eclipse.swt.custom.StyleRange;

public class NonRuleBasedDamagerRepairer implements IPresentationDamager, IPresentationRepairer {

	/** The document this object works on */
	protected IDocument fDocument;

	/**
	 * The default text attribute if non is returned as data by the current
	 * token
	 */
	protected TextAttribute fDefaultTextAttribute;

	/**
	 * Constructor for NonRuleBasedDamagerRepairer.
	 */
	public NonRuleBasedDamagerRepairer(final TextAttribute defaultTextAttribute) {
		Assert.isNotNull(defaultTextAttribute);

		fDefaultTextAttribute = defaultTextAttribute;
	}

	/**
	 * @see IPresentationRepairer#setDocument(IDocument)
	 */
	@Override
	public void setDocument(final IDocument document) {
		fDocument = document;
	}

	/**
	 * Returns the end offset of the line that contains the specified offset or
	 * if the offset is inside a line delimiter, the end offset of the next
	 * line.
	 * 
	 * @param offset
	 *            the offset whose line end offset must be computed
	 * @return the line end offset for the given offset
	 * @exception BadLocationException
	 *                if offset is invalid in the current document
	 */
	protected int endOfLineOf(final int offset) throws BadLocationException {

		IRegion info = fDocument.getLineInformationOfOffset(offset);
		if (offset <= info.getOffset() + info.getLength()) {
			return info.getOffset() + info.getLength();
		}

		final int line = fDocument.getLineOfOffset(offset);
		try {
			info = fDocument.getLineInformation(line + 1);
			return info.getOffset() + info.getLength();
		} catch (final BadLocationException x) {
			return fDocument.getLength();
		}
	}

	/**
	 * @see IPresentationDamager#getDamageRegion(ITypedRegion, DocumentEvent,
	 *      boolean)
	 */
	@Override
	public IRegion getDamageRegion(final ITypedRegion partition, final DocumentEvent event, final boolean documentPartitioningChanged) {
		if (!documentPartitioningChanged) {
			try {

				final IRegion info = fDocument.getLineInformationOfOffset(event.getOffset());
				final int start = Math.max(partition.getOffset(), info.getOffset());

				int end = event.getOffset() + (event.getText() == null ? event.getLength() : event.getText().length());

				if ((info.getOffset() <= end) && (end <= info.getOffset() + info.getLength())) {
					// optimize the case of the same line
					end = info.getOffset() + info.getLength();
				} else {
					end = endOfLineOf(end);
				}

				end = Math.min(partition.getOffset() + partition.getLength(), end);
				return new Region(start, end - start);

			} catch (final BadLocationException x) {
			}
		}

		return partition;
	}

	/**
	 * @see IPresentationRepairer#createPresentation(TextPresentation,
	 *      ITypedRegion)
	 */
	@Override
	public void createPresentation(final TextPresentation presentation, final ITypedRegion region) {
		addRange(presentation, region.getOffset(), region.getLength(), fDefaultTextAttribute);
	}

	/**
	 * Adds style information to the given text presentation.
	 * 
	 * @param presentation
	 *            the text presentation to be extended
	 * @param offset
	 *            the offset of the range to be styled
	 * @param length
	 *            the length of the range to be styled
	 * @param attr
	 *            the attribute describing the style of the range to be styled
	 */
	protected void addRange(final TextPresentation presentation, final int offset, final int length, final TextAttribute attr) {
		if (attr != null) {
			presentation.addStyleRange(new StyleRange(offset, length, attr.getForeground(), attr.getBackground(), attr.getStyle()));
		}
	}
}