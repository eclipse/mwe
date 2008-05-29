/*******************************************************************************
 * Copyright (c) 2007 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare
 *******************************************************************************/
package org.eclipse.emf.mwe.ui.internal.editor.marker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.ITextHoverExtension2;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationHover;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.texteditor.MarkerAnnotation;

public class ProblemHover implements IAnnotationHover, ITextHover,
ITextHoverExtension2 {

	private final ISourceViewer sourceViewer;

	private StringBuffer buffer;

	public ProblemHover(final ISourceViewer sourceViewer) {
		this.sourceViewer = sourceViewer;
	}

	// for AnnotationHover
	public String getHoverInfo(final ISourceViewer sourceViewer,
			final int lineNumber) {
		return getHoverInfoInternal(lineNumber, -1);
	}

	@SuppressWarnings("deprecation")
	public String getHoverInfo(final ITextViewer textViewer,
			final IRegion hoverRegion) {
		return getHoverInfo2(textViewer, hoverRegion);
	}

	// for TextHover
	public String getHoverInfo2(final ITextViewer textViewer,
			final IRegion hoverRegion) {
		int lineNumber;
		try {
			lineNumber =
				sourceViewer.getDocument().getLineOfOffset(
						hoverRegion.getOffset());
		} catch (final BadLocationException e) {
			return null;
		}
		return getHoverInfoInternal(lineNumber, hoverRegion.getOffset());
	}

	public IRegion getHoverRegion(final ITextViewer textViewer,
			final int offset) {
		final Point selection = textViewer.getSelectedRange();
		if (selection.x <= offset && offset < selection.x + selection.y)
			return new Region(selection.x, selection.y);
		return new Region(offset, 0);
	}

	private String formatInfo(final List<String> messages) {
		buffer = new StringBuffer();
		if (messages.size() > 1) {
			buffer.append("Multiple markers at this line\n");
			final Iterator<String> e = messages.iterator();
			while (e.hasNext()) {
				splitInfo("- " + e.next() + "\n");
			}
		} else if (messages.size() == 1) {
			splitInfo(messages.get(0));
		}
		return buffer.toString();
	}

	private String getHoverInfoInternal(final int lineNumber, final int offset) {
		final IAnnotationModel model = sourceViewer.getAnnotationModel();
		final List<String> messages = new ArrayList<String>();

		final Iterator<?> iterator = model.getAnnotationIterator();
		while (iterator.hasNext()) {
			final Annotation annotation = (Annotation) iterator.next();
			if (!(annotation instanceof MarkerAnnotation)) {
				continue;
			}
			final MarkerAnnotation mAnno = (MarkerAnnotation) annotation;
			final int start = model.getPosition(mAnno).getOffset();
			final int end = start + model.getPosition(mAnno).getLength();

			if (offset > 0 && !(start <= offset && offset <= end)) {
				continue;
			}
			try {
				if (lineNumber != sourceViewer.getDocument().getLineOfOffset(
						start)) {
					continue;
				}
			} catch (final Exception x) {
				continue;
			}
			messages.add(mAnno.getText().trim());
		}
		return formatInfo(messages);
	}

	private String splitInfo(final String message) {
		String msg = message;
		String prefix = "";
		int pos;
		do {
			pos = msg.indexOf(" ", 60);
			if (pos > -1) {
				buffer.append(prefix + msg.substring(0, pos) + "\n");
				msg = msg.substring(pos);
				prefix = "  ";
			} else {
				buffer.append(prefix + msg);
			}
		} while (pos > -1);
		return buffer.toString();
	}
}
