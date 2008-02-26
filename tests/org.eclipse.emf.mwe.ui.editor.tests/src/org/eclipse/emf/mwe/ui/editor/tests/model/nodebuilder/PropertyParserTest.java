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

package org.eclipse.emf.mwe.ui.editor.tests.model.nodebuilder;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.ui.editor.internal.model.workflow.FileProperty;
import org.eclipse.emf.mwe.ui.editor.internal.model.workflow.Property;
import org.eclipse.emf.mwe.ui.editor.internal.model.workflow.SimpleProperty;
import org.eclipse.emf.mwe.ui.editor.internal.model.workflow.WorkflowFile;
import org.eclipse.emf.mwe.ui.editor.outline.WorkflowContentOutlineHandler;
import org.eclipse.emf.mwe.ui.editor.parser.XMLParser;
import org.eclipse.jface.text.Document;

public class PropertyParserTest extends TestCase {

    private static final String WORKFLOW1 =
            "<org.eclipse.emf.mwe.ui.editor.internal.model.workflow>\n"
                    + "</org.eclipse.emf.mwe.ui.editor.internal.model.workflow>";

    private static final String WORKFLOW2 =
            "<org.eclipse.emf.mwe.ui.editor.internal.model.workflow>\n"
                    + "    <property name=\"foo\" value=\"bar\"/>\n"
                    + "</org.eclipse.emf.mwe.ui.editor.internal.model.workflow>";

    private static final String WORKFLOW3 =
            "<org.eclipse.emf.mwe.ui.editor.internal.model.workflow>\n"
                    + "    <property file=\"foo\"/>\n"
                    + "</org.eclipse.emf.mwe.ui.editor.internal.model.workflow>";

    private XMLParser parser;

    private WorkflowContentOutlineHandler contentHandler;

    @Override
    protected void setUp() throws Exception {
        parser = new XMLParser();
        contentHandler = new WorkflowContentOutlineHandler();
        parser.setContentHandler(contentHandler);
    }

    public void testParserSetup() {
        assertNotNull(parser);
    }

    public void testEmptyWorkflow() {
        setUpDocument(WORKFLOW1);
        parser.parse(WORKFLOW1);
        final EObject root = parser.getRoot();
        assertEquals("WorkflowFile", root.eClass().getName());
    }

    public void testSimpleProperty() {
        setUpDocument(WORKFLOW2);
        parser.parse(WORKFLOW2);
        final WorkflowFile root = (WorkflowFile) parser.getRoot();
        final EList<Property> properties = root.getProperties();
        assertEquals(1, properties.size());
        final SimpleProperty property = (SimpleProperty) properties.get(0);
        assertNotNull(property);
        assertEquals("foo", property.getName());
        assertEquals("bar", property.getValue());

    }

    public void testFileProperty() {
        setUpDocument(WORKFLOW3);
        parser.parse(WORKFLOW3);
        final WorkflowFile root = (WorkflowFile) parser.getRoot();
        final EList<Property> properties = root.getProperties();
        assertEquals(1, properties.size());
        final FileProperty property = (FileProperty) properties.get(0);
        assertNotNull(property);
        assertEquals("foo", property.getFile());
    }

    // Helper methods

    private void setUpDocument(final String content) {
        final Document document = new Document(content);
        contentHandler.setDocument(document);
    }
}
