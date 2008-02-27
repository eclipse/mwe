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

import org.eclipse.emf.mwe.ui.editor.elements.WorkflowElement;

public class AssignmentTest extends ParserTest {

    private static String WORKFLOW1 =
            "<?xml  version=\"1.0\" encoding=\"ISO-8859-1\"?>\n"
                    + "<workflow>\n"
                    + "    \n"
                    + "    <property name=\"platformURI\" value=\"..\"/>\n"
                    + "    \n"
                    + "    <component class=\"org.openarchitectureware.xtext.parser.ParserComponent\">\n"
                    + "        <modelFile value=\"${modelFile}\"/>\n"
                    + "        <outputSlot value=\"${outputSlot}\"/>\n"
                    + "    </component>\n"
                    + "    \n"
                    + "    <component class=\"oaw.xtend.XtendComponent\">\n"
                    + "       <metaModel id=\"mm\" class=\"org.eclipse.m2t.type.emf.EmfRegistryMetaModel\"/>\n"
                    + "        <invoke value=\"org::openarchitectureware::xtext::XtextExtensions::fixTypes(${outputSlot})\"/>\n"
                    + "    </component>\n"
                    + "    \n"
                    + "    <component class=\"oaw.xtext.CheckComponent2\">\n"
                    + "        <metaModel idRef=\"mm\"/>\n"
                    + "       <expression value=\"${outputSlot}.eAllContents.union({${outputSlot}})\"/>\n"
                    + "       <checkFile value=\"org::openarchitectureware::xtext::Checks\"/>\n"
                    + "    </component>\n"
                    + "    \n"
                    + "    <component class=\"oaw.xtend.XtendComponent\">\n"
                    + "        <metaModel idRef=\"mm\"/>\n"
                    + "        <invoke value=\"org::openarchitectureware::xtext::XtextExtensions::complete(${outputSlot})\"/>\n"
                    + "    </component>\n" + "    \n" + "</workflow>\n";

    public void testCompleteWorkflow() {
        setUpDocument(WORKFLOW1);
        parser.parse(WORKFLOW1);
        final WorkflowElement root = parser.getRoot();
        assertEquals(5, root.getChildrenCount());
        int properties = 0;
        int assignments = 0;
        for (int i = 0; i < root.getChildrenCount(); i++) {
            final WorkflowElement element = root.getChild(i);
            if (element.isProperty())
                properties++;
            else if (element.isAssignment())
                assignments++;
        }
        assertEquals(1, properties);
        assertEquals(4, assignments);
    }
}
