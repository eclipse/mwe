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

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElementTypeInfo;
import org.eclipse.emf.mwe.ui.internal.editor.factories.WorkflowSyntaxFactory;
import org.eclipse.emf.mwe.ui.internal.editor.logging.Log;
import org.eclipse.emf.mwe.ui.internal.editor.parser.WorkflowContentHandler;
import org.eclipse.emf.mwe.ui.internal.editor.scanners.WorkflowTagScanner;
import org.eclipse.emf.mwe.ui.internal.editor.utils.SettableCheckResult;
import org.eclipse.emf.mwe.ui.internal.editor.utils.TypeUtils;
import org.eclipse.emf.mwe.ui.internal.editor.utils.WorkflowElementSearcher;
import org.eclipse.jdt.core.IType;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.7 $
 */

public class AttributeContentProposalComputer extends AbstractContentProposalComputer {

	private static final String TAG_NAME_PATTERN = WorkflowContentHandler.TAG_NAME_PATTERN;

	private static final Pattern TAG_PATTERN = Pattern.compile("<\\s*(" + TAG_NAME_PATTERN + ")\\s+(.*)",
			Pattern.MULTILINE);

	private static final Pattern SINGLE_QUOTE_ATTRIBUTE_PATTERN = Pattern.compile("\\s*(" + TAG_NAME_PATTERN
			+ ")\\s*=\\s*'(.*?)'", Pattern.MULTILINE);

	private static final Pattern DOUBLE_QUOTE_ATTRIBUTE_PATTERN = Pattern.compile("\\s*(" + TAG_NAME_PATTERN
			+ ")\\s*=\\s*\"(.*?)\"", Pattern.MULTILINE);

	public AttributeContentProposalComputer(final IFile file, final WorkflowEditor editor, final IDocument document,
			final WorkflowTagScanner tagScanner) {
		super(file, editor, document, tagScanner);
	}

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>isApplicable</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.contentassist.IContentProposalComputer#isApplicable(int)
	 */
	public boolean isApplicable(final int offset) {
		return isAttribute();
	}

	@Override
	protected String createProposalText(final String name, final int offset) {
		String text = null;
		text = " " + name;
		return text;
	}

	@Override
	protected Set<String> getProposalSet(final int offset) {
		final Set<String> result = new HashSet<String>();
		AbstractWorkflowElement element = WorkflowElementSearcher.searchCompleteParentElement(editor.getRootElement(),
				document, offset);
		AbstractWorkflowElement tempElement = createTemporaryElement(offset);

		if (element != null && tempElement != null) {
			boolean tempInserted = false;
			if (!isElementParsed(element, tempElement)) {
				tempInserted = true;
				element.addChild(tempElement);
			}
			else {
				tempElement = element;
				element = (tempElement.hasParent()) ? tempElement.getParent() : null;
			}

			if (element != null) {
				final IType type = element.getMappedClassType();
				if (type != null) {
					final SettableCheckResult settableCheck = TypeUtils
							.isSettable(file.getProject(), tempElement, type);
					if (settableCheck.isSettableFound()) {
						result.addAll(TypeUtils.getSettableProperties(tempElement.getMappedClassType(), true));
					}
				}
			}
			if (tempInserted) {
				tempElement.remove();
			}
		}
		if (result.isEmpty()) {
			result.addAll(addDefaults(tempElement));
		}

		return result;
	}

	private Set<String> addDefaults(final AbstractWorkflowElement element) {
		final Set<String> result = new HashSet<String>();
		if (IWorkflowElementTypeInfo.PROPERTY_TAG.equals(element.getName())) {
			if (!element.hasAttributes()) {
				addDefault(result, element, IWorkflowAttribute.NAME_ATTRIBUTE, IWorkflowAttribute.FILE_ATTRIBUTE);
			}
			else if (element.hasAttribute(IWorkflowAttribute.NAME_ATTRIBUTE)) {
				addDefault(result, element, IWorkflowAttribute.VALUE_ATTRIBUTE);
			}
		}
		else if (element.isCompose() || element.isFragment()) {
			if (!element.hasAttributes()) {
				addDefault(result, element, IWorkflowAttribute.CLASS_ATTRIBUTE, IWorkflowAttribute.FILE_ATTRIBUTE);
			}
			else if (element.hasAttribute(IWorkflowAttribute.FILE_ATTRIBUTE)) {
				addDefault(result, element, IWorkflowAttribute.INHERIT_ALL_ATTRIBUTE);
			}
		}
		return result;
	}

	private void addDefault(final Set<String> result, final AbstractWorkflowElement element, final String option1,
			final String option2) {
		if (!element.hasAttribute(option1)) {
			addDefault(result, element, option2);
		}

		if (!element.hasAttribute(option2)) {
			addDefault(result, element, option1);
		}

	}

	private void addDefault(final Set<String> result, final AbstractWorkflowElement element, final String attributeName) {
		if (!element.hasAttribute(attributeName)) {
			result.add(attributeName);
		}

	}

	private void addMatchedAttributes(final AbstractWorkflowElement element, final Matcher matcher) {
		while (matcher.find()) {
			final String name = matcher.group(1);
			final String value = matcher.group(2);
			final IWorkflowAttribute attribute = WorkflowSyntaxFactory.getInstance().newWorkflowAttribute(name, value);
			element.addAttribute(attribute);
		}
	}

	private AbstractWorkflowElement createTemporaryElement(final int offset) {
		AbstractWorkflowElement element = null;
		String wholeText = null;
		try {
			wholeText = document.get(0, offset);
		}
		catch (final BadLocationException e) {
			Log.logError("", e);
			return null;
		}

		final int lastTagIndex = wholeText.lastIndexOf('<');
		final String currentText = wholeText.substring(lastTagIndex);
		final Matcher tagMatcher = TAG_PATTERN.matcher(currentText);
		String tag = null;
		String attributes = null;
		if (tagMatcher.find()) {
			tag = tagMatcher.group(1);
			attributes = tagMatcher.group(2);
			element = WorkflowSyntaxFactory.getInstance().newWorkflowElement(editor, file.getProject(), document, tag);
		}

		if (element != null && attributes != null) {
			Matcher attrMatcher = SINGLE_QUOTE_ATTRIBUTE_PATTERN.matcher(attributes);
			addMatchedAttributes(element, attrMatcher);
			attrMatcher = DOUBLE_QUOTE_ATTRIBUTE_PATTERN.matcher(attributes);
			addMatchedAttributes(element, attrMatcher);
		}
		return element;
	}

	private boolean isElementParsed(final AbstractWorkflowElement element1, final AbstractWorkflowElement element2) {
		if ((element1 != null && element2 != null) && element1.getName().equals(element2.getName())
				&& element1.getAttributeCount() >= element2.getAttributeCount()) {
			final List<IWorkflowAttribute> attrs1 = element1.getAttributeList();
			for (final IWorkflowAttribute attr : attrs1) {
				if (!element2.hasAttribute(attr.getName()))
					return false;
			}
			return true;
		}

		return false;
	}
}
