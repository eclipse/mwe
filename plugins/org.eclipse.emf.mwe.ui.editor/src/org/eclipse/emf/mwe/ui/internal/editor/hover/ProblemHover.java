/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.ui.internal.editor.hover;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.texteditor.MarkerAnnotation;

public class ProblemHover extends AbstractHover {

	public ProblemHover(final ISourceViewer sourceViewer) {
		super(sourceViewer);
	}

	@Override
	protected String getHoverInfoInternal(final int lineNumber,
			final int offset) {
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
}
