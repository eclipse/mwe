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

package org.eclipse.emf.mwe.ui.internal.editor.parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collection;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.elements.ElementPositionRange;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElementTypeInfo;
import org.eclipse.emf.mwe.ui.internal.editor.elements.impl.xml.Property;
import org.eclipse.emf.mwe.ui.internal.editor.factories.IWorkflowSyntaxFactory;
import org.eclipse.emf.mwe.ui.internal.editor.factories.WorkflowSyntaxFactory;
import org.eclipse.emf.mwe.ui.internal.editor.logging.Log;
import org.eclipse.emf.mwe.ui.internal.editor.marker.MarkerManager;
import org.eclipse.emf.mwe.ui.internal.editor.references.ReferenceInfo;
import org.eclipse.emf.mwe.ui.internal.editor.references.ReferenceInfoStore;
import org.eclipse.emf.mwe.ui.internal.editor.utils.DocumentParser;
import org.eclipse.emf.mwe.ui.internal.editor.utils.PropertyFileReader;
import org.eclipse.emf.mwe.ui.internal.editor.utils.TypeUtils;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.47 $
 */
public class WorkflowContentHandler extends DefaultHandler {

	public static final String TAG_NAME_PATTERN = "[a-zA-Z0-9\\.\\-]+";

	private static final String NO_VALID_CHILD_ELEMENT_MSG = "is no valid child element for element";

	private static final String ILLEGAL_TAG_NAME_MSG = "Illegal tag name:";

	protected Locator locator;

	protected WorkflowEditor editor;

	protected IProject project;

	private File file;

	private boolean isSubProcess;

	private boolean inheritAll;

	protected IPropertyContainer propertyContainer = WorkflowSyntaxFactory.getInstance().newPropertyContainer();

	protected IDocument document;

	private AbstractWorkflowElement rootElement;

	private AbstractWorkflowElement currentElement;

	private String positionCategory;

	private ElementPositionRange documentEnd;

	/**
	 * This method overrides the implementation of <code>endDocument</code>
	 * inherited from the superclass.
	 * 
	 * @see org.xml.sax.helpers.DefaultHandler#endDocument()
	 */
	@Override
	public void endDocument() throws SAXException {
		assert currentElement == rootElement;
		final Collection<ReferenceInfo> unresolved = rootElement.getUnresolvedReferences();
		for (final ReferenceInfo info : unresolved) {
			MarkerManager.createMarker(getFile(), document, info.getElement(), "Unresolved element '"
					+ info.getReferenceValue() + "'", true);
		}

		rootElement.setEndElementRange(createPositionRange());
	}

	/**
	 * This method overrides the implementation of <code>endElement</code>
	 * inherited from the superclass.
	 * 
	 * @see org.xml.sax.helpers.DefaultHandler#endElement(java.lang.String,
	 *      java.lang.String, java.lang.String)
	 */
	@Override
	public void endElement(final String uri, final String ln, final String qName) throws SAXException {
		if (isIllegalName(qName))
			throw new ValidationException(locator, ILLEGAL_TAG_NAME_MSG + qName, true);

		currentElement.setEndElementRange(createPositionRange());
		if (hasFileReference(currentElement)) {
			final boolean inherit = isInheritAllSet(currentElement);
			try {
				parseReferencedContent(currentElement, inherit);
			}
			catch (final ParserProblemException e) {
				MarkerManager.createMarker(getFile(), document, currentElement, e.getMessage(), true);
			}
		}
		else if (currentElement.isProperty()) {
			try {
				addProperty(currentElement);
			}
			catch (final ParserProblemException e) {
				handleParseException(e, currentElement);
			}
		}

		currentElement.addProperties(propertyContainer);

		if (currentElement.hasChildren()) {
			for (final AbstractWorkflowElement e : currentElement.getChildrenList()) {
				if (e.hasAttribute(IWorkflowAttribute.VALUE_ATTRIBUTE)
						&& currentElement.hasValueReferenceProperty(e.getName())) {
					addProperty(e);
				}
			}
		}

		if (currentElement.hasReferenceDefinition()) {
			final boolean res = rootElement.addReferenceDefinition(currentElement);
			if (!res) {
				MarkerManager.createMarker(getFile(), document, currentElement, "Duplicate element ID '"
						+ currentElement.getAttributeValue(IWorkflowAttribute.ID_ATTRIBUTE) + "'", true);
			}
		}
		else if (currentElement.hasReference()) {
			rootElement.addReference(currentElement);
		}

		if (currentElement.hasParent()) {
			currentElement = currentElement.getParent();
		}
	}

	/**
	 * Returns the value of field <code>positionCategory</code>.
	 * 
	 * @return value of <code>positionCategory</code>.
	 */
	public String getPositionCategory() {
		return positionCategory;
	}

	/**
	 * Returns the value of field <code>rootElement</code>.
	 * 
	 * @return value of <code>rootElement</code>.
	 */
	public AbstractWorkflowElement getRootElement() {
		return rootElement;
	}

	/**
	 * Sets a new value for field <code>document</code>.
	 * 
	 * @param document
	 *            new value for <code>document</code>.
	 */
	public void setDocument(final IDocument document) {
		if (document != null) {
			try {
				final int lastLine = document.getNumberOfLines() - 1;
				final int startOffset = document.getLineOffset(lastLine);
				final int endOffset = document.getLength() - 1;
				documentEnd = new ElementPositionRange(document, startOffset, endOffset);
			}
			catch (final BadLocationException e) {
				Log.logError("", e);
			}
		}
		else {
			documentEnd = null;
		}
		this.document = document;
	}

	/**
	 * This method overrides the implementation of
	 * <code>setDocumentLocator</code> inherited from the superclass.
	 * 
	 * @see org.xml.sax.helpers.DefaultHandler#setDocumentLocator(org.xml.sax.Locator)
	 */
	@Override
	public void setDocumentLocator(final Locator locator) {
		this.locator = locator;
	}

	/**
	 * Sets a new value for field <code>editor</code>.
	 * 
	 * @param editor
	 *            new value for <code>editor</code>.
	 */
	public void setEditor(final WorkflowEditor editor) {
		this.editor = editor;
	}

	/**
	 * Sets a new value for field <code>file</code>.
	 * 
	 * @param file
	 *            new value for <code>file</code>.
	 */
	public void setFile(final File file) {
		this.file = file;
	}

	/**
	 * Sets a new value for field <code>inheritAll</code>.
	 * 
	 * @param inheritAll
	 *            new value for <code>inheritAll</code>.
	 */
	public void setInheritAll(final boolean inheritAll) {
		this.inheritAll = inheritAll;
	}

	/**
	 * Sets a new value for field <code>positionCategory</code>.
	 * 
	 * @param positionCategory
	 *            new value for <code>positionCategory</code>.
	 */
	public void setPositionCategory(final String positionCategory) {
		this.positionCategory = positionCategory;
	}

	/**
	 * Sets a new value for field <code>project</code>.
	 * 
	 * @param project
	 *            new value for <code>project</code>.
	 */
	public void setProject(final IProject project) {
		this.project = project;
	}

	/**
	 * Sets a new value for field <code>propertyContainer</code>.
	 * 
	 * @param propertyContainer
	 *            new value for <code>propertyContainer</code>.
	 */
	public void setPropertyContainer(final IPropertyContainer propertyContainer) {
		this.propertyContainer = propertyContainer;
	}

	/**
	 * Sets a new value for field <code>isSubProcess</code>.
	 * 
	 * @param isSubProcess
	 *            new value for <code>isSubProcess</code>.
	 */
	public void setSubProcess(final boolean isSubProcess) {
		this.isSubProcess = isSubProcess;
	}

	/**
	 * This method overrides the implementation of <code>startDocument</code>
	 * inherited from the superclass.
	 * 
	 * @see org.xml.sax.helpers.DefaultHandler#startDocument()
	 */
	@Override
	public void startDocument() throws SAXException {
		rootElement = newWorkflowElement(IWorkflowElementTypeInfo.WORKFLOWFILE_TAG);
		rootElement.setReferenceInfoStore(new ReferenceInfoStore(getFile()));
		currentElement = rootElement;
		rootElement.setStartElementRange(createPositionRange());
	}

	/**
	 * This method overrides the implementation of <code>startElement</code>
	 * inherited from the superclass.
	 * 
	 * @see org.xml.sax.helpers.DefaultHandler#startElement(java.lang.String,
	 *      java.lang.String, java.lang.String, org.xml.sax.Attributes)
	 */
	@Override
	public void startElement(final String uri, final String ln, final String qName, final Attributes attributes)
			throws SAXException {
		final AbstractWorkflowElement element = newWorkflowElement(qName);
		if (isIllegalName(qName))
			throw new ValidationException(locator, ILLEGAL_TAG_NAME_MSG + " " + qName, true);

		element.setStartElementRange(createPositionRange());
		element.setEndElementRange(documentEnd);
		for (int i = 0; i < attributes.getLength(); i++) {
			final String attrName = attributes.getQName(i);
			final String attrValue = attributes.getValue(i);
			final IWorkflowSyntaxFactory factory = WorkflowSyntaxFactory.getInstance();
			final IWorkflowAttribute attr = factory.newWorkflowAttribute(attrName, attrValue);
			if (attr.hasPropertyReference()) {
				final Property p = new Property(attr.getPropertyReferenceName());
				p.setValueReference(true);
				p.setImported(isSubProcess);
				addProperty(element, p);

			}
			element.addAttribute(attr);
		}

		if (element.isValidChildFor(currentElement)) {
			currentElement.addChild(element);
		}
		else
			throw new ValidationException(locator, "'" + qName + "' " + NO_VALID_CHILD_ELEMENT_MSG + " '"
					+ currentElement.getName() + "'", true);
		currentElement = element;
	}

	/**
	 * Returns the value of field <code>propertyContainer</code>.
	 * 
	 * @return value of <code>propertyContainer</code>.
	 */
	protected IPropertyContainer getPropertyContainer() {
		return propertyContainer;
	}

	private void addProperty(final AbstractWorkflowElement element) {
		if (element == null)
			throw new IllegalArgumentException();

		final Property property = new Property(element);

		if (isSubProcess) {
			property.setImported(true);
		}

		addProperty(element, property);
	}

	private void addProperty(final AbstractWorkflowElement element, final Property property) {
		if (element == null || property == null)
			throw new IllegalArgumentException();

		try {
			if (property.isSimple() || property.isValueReference()) {
				if (!isSubProcess) {
					if (element.hasParent()) {
						element.getParent().addProperty(property);
					}
					else {
						if (inheritAll || property.isValueReference()) {
							propertyContainer.addProperty(property);
						}
					}
				}
				else {
					propertyContainer.addProperty(property);
				}
			}
			else if (property.isFileReference()) {
				try {
					final IPropertyContainer fileContainer = PropertyFileReader.parse(getProject(), property);
					if (!isSubProcess) {
						if (element.hasParent()) {
							element.getParent().addProperties(fileContainer);
						}
						else {
							propertyContainer.addProperties(fileContainer);
						}
					}
					else {
						if (inheritAll) {
							propertyContainer.addProperties(fileContainer);
						}
					}
				}
				catch (final FileNotFoundException e) {
					throw new ParserProblemException(e.getMessage(), e);
				}
			}
		}
		catch (final IllegalArgumentException e) {
			final IFile file = getFile();
			final String propName = property.getName();
			final String propNameString = (propName != null && propName.length() > 0) ? " '" + propName + "'" : "";
			final String msg = "Incompletely specified property" + propNameString;
			if (file != null && file.exists()) {
				MarkerManager.createMarker(file, document, element, msg, true);
			}
			else {
				Log.logError(msg, e);
			}
		}
	}

	private ElementPositionRange createPositionRange() {
		final int line = locator.getLineNumber() - 1;
		int endOffset = getOffsetFromLine(line) + locator.getColumnNumber() - 1;
		if (endOffset > 0) {
			endOffset--;
		}

		final int startOffset = searchChar(endOffset, '<', true);
		return new ElementPositionRange(document, startOffset, endOffset);
	}

	private IFile getFile() {
		return (editor != null) ? editor.getInputFile() : null;
	}

	private File getFile(final IProject project, final IWorkflowAttribute attribute) {
		if (project == null || attribute == null || !IWorkflowAttribute.FILE_ATTRIBUTE.equals(attribute.getName()))
			return null;

		final ClassLoader loader = TypeUtils.getResourceLoader(project);
		final URL url = loader.getResource(attribute.getValue());
		if (url != null) {
			try {
				final File file = new File(url.toURI());
				return (file.exists()) ? file : null;
			}
			catch (final URISyntaxException e) {
				Log.logError("", e);
				return null;
			}
			catch (final IllegalArgumentException e) {
				throw new ParserProblemException(e.getMessage(), e);
			}
		}
		return null;
	}

	private int getOffsetFromLine(final int lineNumber) {
		int offset = 0;
		try {
			offset = document.getLineOffset(lineNumber);
		}
		catch (final BadLocationException e) {
			try {
				offset = document.getLineOffset(lineNumber - 1);
			}
			catch (final BadLocationException e1) {
			}
		}
		return offset;
	}

	private IProject getProject() {
		if (editor != null && editor.getInputFile() != null)
			return editor.getInputFile().getProject();

		return project;
	}

	private void handleParseException(final ParserProblemException e, final AbstractWorkflowElement element) {
		if (e == null || element == null)
			throw new IllegalArgumentException();

		e.addElement(element);
		if (!isSubProcess) {
			MarkerManager.createMarker(getFile(), document, element, e.getMessage(), true);
			Log.logError(e.getElementTrace(), e);
		}
		else
			throw e;
	}

	private boolean hasFileReference(final AbstractWorkflowElement element) {
		return (element != null) ? !element.isProperty() && element.hasAttribute(IWorkflowAttribute.FILE_ATTRIBUTE)
				: false;
	}

	private boolean isIllegalName(final String name) {
		return !Pattern.matches(TAG_NAME_PATTERN, name);
	}

	private boolean isInheritAllSet(final AbstractWorkflowElement element) {
		if (!hasFileReference(element))
			return false;

		final String inheritVal = element.getAttributeValue(IWorkflowAttribute.INHERIT_ALL_ATTRIBUTE);
		return Boolean.parseBoolean(inheritVal);
	}

	private AbstractWorkflowElement newWorkflowElement(final String name) {
		final AbstractWorkflowElement element = WorkflowSyntaxFactory.getInstance().newWorkflowElement(editor,
				getProject(), document, name);
		element.setFile(file);
		return element;
	}

	private void parseReferencedContent(final AbstractWorkflowElement element, final boolean inherit) {
		if (element == null || !hasFileReference(element))
			throw new IllegalArgumentException();

		final IWorkflowAttribute attribute = element.getAttribute(IWorkflowAttribute.FILE_ATTRIBUTE);
		final String content = TypeUtils.getFileContent(getProject(), attribute.getValue());
		if (content == null) {
			if (!isSubProcess) {
				MarkerManager.createMarker(getFile(), document, attribute, "Resource '" + attribute.getValue()
						+ "' cannot be resolved", true, true);
				return;
			}
			else
				throw new ParserProblemException("Resource '" + attribute.getValue() + "' cannot be resolved");
		}
		try {
			final IDocument refDoc = new org.eclipse.jface.text.Document(content);
			final WorkflowContentHandler contentHandler = new WorkflowContentHandler();
			final File refFile = getFile(getProject(), attribute);
			contentHandler.setPropertyContainer(propertyContainer);
			contentHandler.setFile(refFile);
			contentHandler.setSubProcess(true);
			contentHandler.setInheritAll(inherit);
			DocumentParser.parse(refDoc, contentHandler, getProject());
		}
		catch (final ParserProblemException e) {
			handleParseException(e, element);
		}
	}

	private Integer searchChar(final int offset, final char stopChar, final boolean backwards) {
		try {
			int singleQuotes = 0;
			int doubleQuotes = 0;
			int i = offset;

			while (i >= 0 && i <= document.getLength() - 1) {
				final char ch = document.getChar(i);
				if (ch == '"') {
					doubleQuotes++;
				}
				else if (ch == '\'') {
					singleQuotes++;
				}

				if (ch == stopChar && (singleQuotes % 2 == 0) && (doubleQuotes % 2 == 0)) {
					break;
				}

				if (backwards) {
					i--;
				}
				else {
					i++;
				}
			}
			return i;
		}
		catch (final BadLocationException e) {
			Log.logError("", e);
			return -1;
		}
	}
}
