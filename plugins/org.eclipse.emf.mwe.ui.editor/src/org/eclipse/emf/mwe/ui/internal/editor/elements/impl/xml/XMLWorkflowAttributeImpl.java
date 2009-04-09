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

package org.eclipse.emf.mwe.ui.internal.editor.elements.impl.xml;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.elements.ElementPositionRange;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IRangeCheck;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.logging.Log;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.9 $
 */

public class XMLWorkflowAttributeImpl implements IRangeCheck, IWorkflowAttribute {

	private static final Pattern PROPERTY_REFERENCE_PATTERN = Pattern.compile("\\$\\{([a-zA-Z0-9._\\-]+)\\}");

	private AbstractWorkflowElement element;

	private final String name;

	private final String value;

	public XMLWorkflowAttributeImpl(final String name, final String value) {
		if (name == null || value == null || name.length() == 0)
			throw new IllegalArgumentException();

		this.name = name;
		this.value = value;
	}

	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof XMLWorkflowAttributeImpl))
			return false;
		final XMLWorkflowAttributeImpl other = (XMLWorkflowAttributeImpl) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		}
		else if (!name.equals(other.name))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		}
		else if (!value.equals(other.value))
			return false;
		return true;
	}

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>getAttributeRange</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute#getAttributeRange()
	 */
	public ElementPositionRange getAttributeRange() {
		final IDocument document = element.getDocument();
		final int start = element.getStartElementRange().getStartOffset();
		final int end = element.getStartElementRange().getEndOffset();
		final int length = end - start + 1;
		String text;
		try {
			text = document.get(start, length);
		}
		catch (final BadLocationException e) {
			Log.logError("Invalid document location", e);
			return null;
		}

		final String singleQuotepattern = name + "\\s*=\\s*\'" + quote(value) + "\'";
		final String doubleQuotepattern = name + "\\s*=\\s*\"" + quote(value) + "\"";
		final Pattern singleQuotePattern = Pattern.compile(singleQuotepattern);
		final Pattern doubleQuotePattern = Pattern.compile(doubleQuotepattern);
		final Matcher singleQuoteMatcher = singleQuotePattern.matcher(text);
		final Matcher doubleQuoteMatcher = doubleQuotePattern.matcher(text);
		ElementPositionRange range = getElementPositionRange(singleQuoteMatcher, document, start);
		if (range == null) {
			range = getElementPositionRange(doubleQuoteMatcher, document, start);
		}

		return range;
	}

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>getAttributeValueRange</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute#getAttributeValueRange()
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
			while (start <= end && (document.getChar(start) != '"' && document.getChar(start) != '\'')) {
				start++;
			}
		}
		catch (final BadLocationException e) {
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
	 * This automatically generated method overrides the implementation of
	 * <code>getElement</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute#getElement()
	 */
	public AbstractWorkflowElement getElement() {
		return element;
	}

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>getName</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute#getName()
	 */
	public String getName() {
		return name;
	}

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>getValue</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute#getValue()
	 */
	public String getValue() {
		if (hasPropertyReference()) {
			if (hasResolvedPropertyReference())
				return getPropertyReferenceValue();

			return "";
		}
		return value;
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute#hasPropertyReference()
	 */
	public boolean hasPropertyReference() {
		return getPropertyReferenceName() != null;
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute#hasResolvedPropertyReference()
	 */
	public boolean hasResolvedPropertyReference() {
		final String propName = getPropertyReferenceName();
		if (propName != null && getElement() != null)
			return getElement().hasProperty(propName);

		return false;
	}

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>isInRange</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute#isInRange(int)
	 */
	public boolean isInRange(final int offset) {
		return getAttributeValueRange().isInRange(offset);
	}

	/**
	 * @see org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute#setElement(org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement)
	 */
	public void setElement(final AbstractWorkflowElement element) {
		this.element = element;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getName() + " = " + getValue();
	}

	private ElementPositionRange getElementPositionRange(final Matcher matcher, final IDocument document,
			final int start) {
		if (matcher.find()) {
			final int attrStart = start + matcher.start();
			final int attrEnd = start + matcher.end();
			return new ElementPositionRange(document, attrStart, attrEnd);
		}
		return null;
	}

	private String getPropertyReferenceName() {
		final Matcher m = PROPERTY_REFERENCE_PATTERN.matcher(value);
		if (m.find())
			return m.group(1);

		return null;
	}

	private String getPropertyReferenceValue() {
		if (hasResolvedPropertyReference()) {
			final String propName = getPropertyReferenceName();
			if (propName != null && getElement() != null) {
				final Property p = getElement().getProperty(propName);
				if (p.isSimple())
					return p.getValue();
			}
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
