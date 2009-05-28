/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.core.ast.parser;

import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.internal.core.ast.AbstractASTBase;
import org.eclipse.emf.mwe.internal.core.ast.ComponentAST;
import org.eclipse.emf.mwe.internal.core.ast.DeclaredPropertyAST;
import org.eclipse.emf.mwe.internal.core.ast.DeclaredPropertyFileAST;
import org.eclipse.emf.mwe.internal.core.ast.InclusionAST;
import org.eclipse.emf.mwe.internal.core.ast.ReferenceAST;
import org.eclipse.emf.mwe.internal.core.ast.SimpleParamAST;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.helpers.DefaultHandler;

public class WorkflowParser extends DefaultHandler implements ContentHandler {
	private static final Log log = LogFactory.getLog(WorkflowParser.class);

	// reserved element names
	public final static String PROPERTY = "property";

	// reserver attribute names
	public final static String CLASS = "class"; // components

	public final static String FILE = "file"; // include

	public final static String ID = "id"; // components

	public final static String IDREF = "idRef"; // references

	public final static String VALUE = "value"; // property, simple params

	public final static String NAME = "name"; // property

	private static final String INHERITALL = "inheritAll";

	private final Stack<Object> eleStack = new Stack<Object>();

	private AbstractASTBase root = null;

	private org.xml.sax.Locator locator = null;

	private String resource = "unknown";

	private Issues issues = null;

	public WorkflowParser() {
	}

	public AbstractASTBase parse(final InputStream in, final String resourceName, final Issues issues) {
		resource = resourceName;
		this.issues = issues;

		try {
			final SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
			parser.parse(in, this);
		}
		catch (final Exception e) {
			root = null;
			log.error(e.getMessage(), e);
			issues.addError(e.getMessage(), resourceName);
		}

		return root;
	}

	@Override
	public void setDocumentLocator(final Locator locator) {
		this.locator = locator;
	}

	@Override
	public void startElement(final String uri, final String localName, final String qName, final Attributes attributes) {
		if (PROPERTY.equals(qName)) {
			final AbstractASTBase prop = handleProperty(qName, attributes);
			connectAndPush(prop);
		}
		else {
			final AbstractASTBase ele = handleComp(qName, attributes);
			connectAndPush(ele);
		}
	}

	private void connectAndPush(final AbstractASTBase prop) {
		if (eleStack.isEmpty()) {
			eleStack.push(prop);
		}
		else if (eleStack.peek() instanceof ComponentAST) {
			((ComponentAST) eleStack.peek()).getChildren().add(prop);
			eleStack.push(prop);
		}
		else {
			issues.addError("The element " + eleStack.peek() + " cannot contain any child elements!", prop);
			eleStack.push("DUMMY");
		}
	}

	protected AbstractASTBase handleComp(final String name, final Attributes attributes) {
		if (attributes.getValue(FILE) != null) {
			final boolean inheritAll = attributes.getValue(INHERITALL) != null;
			final InclusionAST c = new InclusionAST(getLocation(), name, attributes.getValue(FILE), attributes
					.getValue(ID), inheritAll);
			if (attributes.getValue(CLASS) != null) {
				issues.addError("Attribute 'class' not allowed for inclusions : " + PROPERTY, c);
			}
			for (int i = 0; i < attributes.getLength(); i++) {
				final String temp = attributes.getQName(i);
				if (!"".equals(temp) && !(FILE.equals(temp) || ID.equals(temp))) {
					c.addChild(new SimpleParamAST(getLocation(), temp, attributes.getValue(temp)));
				}
			}
			return c;
		}
		else if (attributes.getValue(IDREF) != null) {
			validateAttributes("reference " + name, attributes, new String[] { IDREF }, new String[0]);
			return new ReferenceAST(getLocation(), name, attributes.getValue(IDREF));
		}
		else if ((attributes.getValue(VALUE) != null) && (attributes.getValue(NAME) == null)) {
			validateAttributes("simpleparam " + name, attributes, new String[] { VALUE }, new String[] {});
			return new SimpleParamAST(getLocation(), name, attributes.getValue(VALUE));
		}
		else {
			final ComponentAST result = new ComponentAST(getLocation(), name, attributes.getValue(CLASS), attributes
					.getValue(ID));
			for (int i = 0; i < attributes.getLength(); i++) {
				final String temp = attributes.getQName(i);
				if (!"".equals(temp) && !(CLASS.equals(temp) || ID.equals(temp))) {
					result.addChild(new SimpleParamAST(getLocation(), temp, attributes.getValue(temp)));
				}
			}
			return result;
		}
	}

	protected AbstractASTBase handleProperty(final String localName, final Attributes attributes) {
		if (attributes.getValue(NAME) != null) {
			validateAttributes(localName, attributes, new String[] { NAME }, new String[] { VALUE });
			return new DeclaredPropertyAST(getLocation(), attributes.getValue(NAME), attributes.getValue(VALUE));
		}
		else if (attributes.getValue(FILE) != null) {
			validateAttributes(localName, attributes, new String[] { FILE }, new String[0]);
			return new DeclaredPropertyFileAST(getLocation(), attributes.getValue(FILE));
		}
		else {
			issues.addError("Either 'name' or 'file' attribute is mandatory for element " + PROPERTY, getLocation());
			return new DeclaredPropertyAST(getLocation(), "__UNKNOWN__");
		}
	}

	private void validateAttributes(final String eleName, final Attributes attributes, final String[] mandatory,
			final String[] optional) {
		final Set<String> mandatorySet = new HashSet<String>(Arrays.asList(mandatory));
		final Set<String> optionalSet = new HashSet<String>(Arrays.asList(optional));
		final Set<String> mandatoryFound = new HashSet<String>();
		for (int i = 0; i < attributes.getLength(); i++) {
			final String name = attributes.getQName(i);
			if ((name != null) && !name.trim().equals("")) {
				if (!(mandatorySet.contains(name) || optionalSet.contains(name))) {
					issues.addError("Unknown attribute " + name + " for element " + eleName, getLocation());
				}
			}
			if (mandatorySet.contains(name)) {
				mandatoryFound.add(name);
			}
		}
		mandatorySet.removeAll(mandatoryFound);
		if (!mandatorySet.isEmpty()) {
			for (final String name : mandatorySet) {
				issues.addError("Attribute " + name + " is mandatory for element " + eleName, getLocation());
			}
		}
	}

	private Location getLocation() {
		return new Location(locator.getLineNumber(), locator.getColumnNumber(), resource);
	}

	@Override
	public void endElement(final String uri, final String name, final String qName) {
		root = (AbstractASTBase) eleStack.pop();
	}
}
