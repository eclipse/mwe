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

package org.eclipse.emf.mwe.ui.internal.editor.elements;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.mwe.ui.internal.editor.logging.Log;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.16 $
 */

public class WorkflowAttribute implements IRangeCheck {

	private final IWorkflowElement element;

	private final String name;

	private final String value;

	public WorkflowAttribute(final IWorkflowElement element, final String name,
			final String value) {
		if (element == null || name == null || value == null
				|| name.length() == 0)
			throw new IllegalArgumentException();

		this.element = element;
		this.name = name;
		this.value = value;
	}

	/**
	 * Returns the position range of the whole attribute.
	 * 
	 * @return position range of attribute.
	 */
	public ElementPositionRange getAttributeRange() {
		final IDocument document = element.getDocument();
		final int start = element.getStartElementRange().getStartOffset();
		final int end = element.getStartElementRange().getEndOffset();
		final int length = end - start + 1;
		String text;
		try {
			text = document.get(start, length);
		} catch (final BadLocationException e) {
			Log.logError("Invalid document location", e);
			return null;
		}

		final String singleQuotepattern =
				name + "\\s*=\\s*\'" + quote(value) + "\'";
		final String doubleQuotepattern =
				name + "\\s*=\\s*\"" + quote(value) + "\"";
		final Pattern singleQuotePattern = Pattern.compile(singleQuotepattern);
		final Pattern doubleQuotePattern = Pattern.compile(doubleQuotepattern);
		final Matcher singleQuoteMatcher = singleQuotePattern.matcher(text);
		final Matcher doubleQuoteMatcher = doubleQuotePattern.matcher(text);
		ElementPositionRange range =
				getElementPositionRange(singleQuoteMatcher, document, start);
		if (range == null) {
			range =
					getElementPositionRange(doubleQuoteMatcher, document,
							start);
		}

		return range;
	}

	/**
	 * Returns the position range of the attribute value.
	 * 
	 * @return position range of attribute value.
	 */
	public ElementPositionRange getAttributeValueRange() {
		final IDocument document = element.getDocument();
		final ElementPositionRange range = getAttributeRange();
		if (range == null)
			return null;

		int start = range.getStartOffset();
		int end = range.getEndOffset();

		try {
			// Skip everything to the opening quote
			while (start <= end
					&& (document.getChar(start) != '"' && document
							.getChar(start) != '\'')) {
				start++;
			}
		} catch (final BadLocationException e) {
			e.printStackTrace();
			return null;
		}

		// Skip the opening quote as well
		start++;

		// Skip the closing quote
		end--;

		return new ElementPositionRange(document, start, end);

	}

	/**
	 * Returns the value of field <code>element</code>.
	 * 
	 * @return value of <code>element</code>.
	 */
	public IWorkflowElement getElement() {
		return element;
	}

	/**
	 * Returns the value of field <code>name</code>.
	 * 
	 * @return value of <code>name</code>.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the value of field <code>value</code>.
	 * 
	 * @return value of <code>value</code>.
	 */
	public String getValue() {
		return value;
	}

	/**
	 * This method overrides the implementation of <code>isInRange</code>
	 * inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IRangeCheck#isInRange(int)
	 */
	public boolean isInRange(final int offset) {
		return getAttributeValueRange().isInRange(offset);
	}

	private ElementPositionRange getElementPositionRange(
			final Matcher matcher, final IDocument document, final int start) {
		if (matcher.find()) {
			final int attrStart = start + matcher.start();
			final int attrEnd = start + matcher.end();
			return new ElementPositionRange(document, attrStart, attrEnd);
		}
		return null;
	}

	private String quote(final String value) {
		String res = new String();
		for (int i = 0; i < value.length(); i++) {
			final char ch = value.charAt(i);
			if (ch == '$' || ch == '{' || ch == '}') {
				res = res.concat("\\");
			}
			res = res + ch;
		}
		return res;
	}
}
