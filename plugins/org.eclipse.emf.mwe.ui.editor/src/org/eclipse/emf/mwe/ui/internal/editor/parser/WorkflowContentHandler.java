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
import java.util.regex.Pattern;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.elements.ElementPositionRange;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IPropertyContainer;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowAttribute;
import org.eclipse.emf.mwe.ui.internal.editor.elements.IWorkflowElementTypeInfo;
import org.eclipse.emf.mwe.ui.internal.editor.elements.Property;
import org.eclipse.emf.mwe.ui.internal.editor.factories.IWorkflowSyntaxFactory;
import org.eclipse.emf.mwe.ui.internal.editor.factories.WorkflowSyntaxFactory;
import org.eclipse.emf.mwe.ui.internal.editor.logging.Log;
import org.eclipse.emf.mwe.ui.internal.editor.marker.MarkerManager;
import org.eclipse.emf.mwe.ui.internal.editor.utils.DocumentParser;
import org.eclipse.emf.mwe.ui.internal.editor.utils.PropertyFileReader;
import org.eclipse.emf.mwe.ui.internal.editor.utils.TypeUtils;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.32 $
 */
public class WorkflowContentHandler extends DefaultHandler {

	private static final String NO_VALID_CHILD_ELEMENT_MSG = "is no valid child element for element";

	private static final String ILLEGAL_TAG_NAME_MSG = "Illegal tag name:";

	private static final String TAG_NAME_PATTERN = "[a-zA-Z0-9\\.\\-]+";

	protected Locator locator;

	protected WorkflowEditor editor;

	protected IProject project;

	private File file;

	protected IPropertyContainer propertyContainer;

	protected IDocument document;

	private AbstractWorkflowElement rootElement;

	private AbstractWorkflowElement currentElement;

	private String positionCategory;

	/**
	 * This method overrides the implementation of <code>endDocument</code>
	 * inherited from the superclass.
	 * 
	 * @see org.xml.sax.helpers.DefaultHandler#endDocument()
	 */
	@Override
	public void endDocument() throws SAXException {
		assert currentElement == rootElement;
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
			boolean inherit = isInheritAllSet(currentElement);
			propertyContainer = parseReferencedContent(currentElement);
			if (inherit && propertyContainer != null) {
				currentElement.setPropertyContainer(propertyContainer);
			}

		}
		else if (currentElement.isProperty()) {
			try {
				addProperty(currentElement);
			}
			catch (ParserProblemException e) {
				handleParseException(e, currentElement);
			}
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
	public void setEditor(WorkflowEditor editor) {
		this.editor = editor;
	}

	/**
	 * Sets a new value for field <code>file</code>.
	 * 
	 * @param file
	 *            new value for <code>file</code>.
	 */
	public void setFile(File file) {
		this.file = file;
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
	public void setProject(IProject project) {
		this.project = project;
	}

	/**
	 * Sets a new value for field <code>propertyContainer</code>.
	 * 
	 * @param propertyContainer
	 *            new value for <code>propertyContainer</code>.
	 */
	public void setPropertyContainer(IPropertyContainer propertyContainer) {
		this.propertyContainer = propertyContainer;
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
		for (int i = 0; i < attributes.getLength(); i++) {
			final String attrName = attributes.getQName(i);
			final String attrValue = attributes.getValue(i);
			IWorkflowSyntaxFactory factory = WorkflowSyntaxFactory.getInstance();
			final IWorkflowAttribute attr = factory.newWorkflowAttribute(element, attrName, attrValue);
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

	private void addProperty(AbstractWorkflowElement element) {
		if (element == null)
			throw new IllegalArgumentException();

		Property property = new Property(element);
		if (propertyContainer != null) {
			property.setImported(true);
		}

		try {
			if (property.isSimple()) {
				propertyContainer.addProperty(property);
			}
			else if (property.isReference()) {
				try {
					IPropertyContainer fileContainer = PropertyFileReader.parse(getProject(), element);
					propertyContainer.addProperties(fileContainer);
				}
				catch (FileNotFoundException e) {
					throw new ParserProblemException(e.getMessage(), e);
				}
			}

		}
		catch (IllegalArgumentException e) {
			IFile file = getFile();
			String propName = property.getName();
			String propNameString = (propName != null && propName.length() > 0) ? " '" + propName + "'" : "";
			String msg = "Incompletely specified property" + propNameString;
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
		final int offset = getOffsetFromLine(line);
		final int startOffset = getCharStart(offset);
		final int endOffset = getCharEnd(offset);
		return new ElementPositionRange(document, startOffset, endOffset);
	}

	private Integer getCharEnd(final int offset) {
		try {
			final IRegion region = document.getLineInformationOfOffset(offset);
			final int endChar = region.getOffset() + region.getLength();
			return endChar;
		}
		catch (final BadLocationException e) {
			e.printStackTrace();
			return null;
		}
	}

	private Integer getCharStart(final int offset) {
		return searchChar(offset, '<', true);
	}

	private IFile getFile() {
		return (editor != null) ? editor.getInputFile() : null;
	}

	private File getFile(IProject project, IWorkflowAttribute attribute) {
		if (project == null || attribute == null || !IWorkflowAttribute.FILE_ATTRIBUTE.equals(attribute.getName()))
			return null;

		ClassLoader loader = TypeUtils.getResourceLoader(project);
		URL url = loader.getResource(attribute.getValue());
		if (url != null) {
			try {
				File file = new File(url.toURI());
				return (file.exists()) ? file : null;
			}
			catch (URISyntaxException e) {
				Log.logError("", e);
				return null;
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

	private IPropertyContainer handleParseException(ParserProblemException e, AbstractWorkflowElement element) {
		if (e == null || element == null)
			throw new IllegalArgumentException();

		e.addElement(element);
		if (isInTopMostFile(element)) {
			MarkerManager.createMarker(getFile(), document, element, e.getMessage(), true);
			Log.logError(e.getElementTrace(), e);
			return null;
		}
		else
			throw e;
	}

	private boolean hasFileReference(AbstractWorkflowElement element) {
		return (element != null) ? !element.isProperty() && element.hasAttribute(IWorkflowAttribute.FILE_ATTRIBUTE)
				: false;
	}

	private boolean isIllegalName(final String name) {
		return !Pattern.matches(TAG_NAME_PATTERN, name);
	}

	private boolean isInheritAllSet(AbstractWorkflowElement element) {
		if (!hasFileReference(element))
			return false;

		String inheritVal = element.getAttributeValue(IWorkflowAttribute.INHERIT_ALL_ATTRIBUTE);
		return Boolean.parseBoolean(inheritVal);
	}

	private boolean isInTopMostFile(AbstractWorkflowElement element) {
		return element != null && element.getFile() != null && element.getFile().equals(getFile());
	}

	private AbstractWorkflowElement newWorkflowElement(String name) {
		AbstractWorkflowElement element = WorkflowSyntaxFactory.getInstance().newWorkflowElement(editor, getProject(),
				document, name);
		element.setFile(file);
		return element;
	}

	private IPropertyContainer parseReferencedContent(AbstractWorkflowElement element) {
		if (element == null || !hasFileReference(element))
			throw new IllegalArgumentException();

		IWorkflowAttribute attribute = element.getAttribute(IWorkflowAttribute.FILE_ATTRIBUTE);
		String content = TypeUtils.getFileContent(getProject(), attribute);
		if (content == null) {
			if (isInTopMostFile(element)) {
				MarkerManager.createMarker(getFile(), document, attribute, "Resource '" + attribute.getValue()
						+ "' cannot be resolved", true, true);
				return null;
			}
			else
				throw new ParserProblemException("Resource '" + attribute.getValue() + "' cannot be resolved");
		}
		try {
			IDocument refDoc = new org.eclipse.jface.text.Document(content);
			WorkflowContentHandler contentHandler = new WorkflowContentHandler();
			IPropertyContainer propCont = (propertyContainer != null) ? propertyContainer : WorkflowSyntaxFactory
					.getInstance().newPropertyContainer();
			File refFile = getFile(getProject(), attribute);
			contentHandler.setPropertyContainer(propCont);
			contentHandler.setFile(refFile);
			DocumentParser.parse(refDoc, contentHandler, getProject());
			return propCont;
		}
		catch (ParserProblemException e) {
			return handleParseException(e, element);
		}
	}

	private Integer searchChar(int offset, char stopChar, boolean backwards) {
		try {
			int singleQuotes = 0;
			int doubleQuotes = 0;
			int i = offset;

			while (i >= 0 && i <= document.getLength() - 1) {
				char ch = document.getChar(i);
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
		catch (BadLocationException e) {
			Log.logError("", e);
			return -1;
		}
	}
}
