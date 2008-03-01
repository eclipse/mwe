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

package org.eclipse.emf.mwe.ui.editor.tests.parser;

import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement;

public class PropertyTest extends ParserTest {

    private static final String WORKFLOW1 = "<workflow>\n" + "</workflow>";

    private static final String WORKFLOW2 =
            "<workflow>\n" + "    <property name=\"foo\" value=\"bar\"/>\n"
                    + "</workflow>";

    private static final String WORKFLOW3 =
            "<workflow>\n" + "    <property file=\"foo\"/>\n" + "</workflow>";

    public void testParserSetup() {
        assertNotNull(parser);
    }

    public void testEmptyWorkflow() {
        setUpDocument(WORKFLOW1);
        parser.parse(WORKFLOW1);
        final WorkflowElement root = parser.getRootElement();
        assertTrue(root.isWorkflow());
    }

    public void testSimpleProperty() {
        setUpDocument(WORKFLOW2);
        parser.parse(WORKFLOW2);
        final WorkflowElement root = parser.getRootElement();
        assertEquals(1, root.getChildrenCount());
        final WorkflowElement property = root.getChild(0);
        assertEquals(2, property.getAttributeCount());
        assertEquals("foo", property.getAttributeValue("name"));
        assertEquals("bar", property.getAttributeValue("value"));
    }

    public void testFileProperty() {
        setUpDocument(WORKFLOW3);
        parser.parse(WORKFLOW3);
        final WorkflowElement root = parser.getRootElement();
        assertEquals(1, root.getChildrenCount());
        final WorkflowElement property = root.getChild(0);
        assertEquals(1, property.getAttributeCount());
        assertEquals("foo", property.getAttributeValue("file"));
    }
}
