/*******************************************************************************
 * Copyright (c) 2005, 2006 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.tests.ast;

import junit.framework.TestCase;

import org.apache.tools.ant.filters.StringInputStream;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.internal.core.ast.ComponentAST;
import org.eclipse.emf.mwe.internal.core.ast.DeclaredPropertyAST;
import org.eclipse.emf.mwe.internal.core.ast.DeclaredPropertyFileAST;
import org.eclipse.emf.mwe.internal.core.ast.InclusionAST;
import org.eclipse.emf.mwe.internal.core.ast.ReferenceAST;
import org.eclipse.emf.mwe.internal.core.ast.SimpleParamAST;
import org.eclipse.emf.mwe.internal.core.ast.parser.WorkflowParser;

public class WorkflowParserTest extends TestCase {
    public final void testSimple() throws Exception {
        final String wf = "<workflow>" + "<property name='test' value='foo'/>" + "<property file='path/to/file.txt'/>"
                + "<component class='test.Comp' id='x' aParam='foo'>" + "  <aParam value='bar'/>"
                + "  <ref idRef='x'/>" + "</component>" + "<component file='test.file'/>" + "</workflow>";
        final Issues issues = new IssuesImpl();
        final WorkflowParser parser = new WorkflowParser();
        final ComponentAST wfast = (ComponentAST) parser.parse(new StringInputStream(wf), "dynamic", issues);
        System.out.println(issues);
        assertTrue(!issues.hasErrors());
        assertNotNull(wfast);
        assertEquals(4, wfast.getChildren().size());
        final DeclaredPropertyAST prop = ((DeclaredPropertyAST) wfast.getChildren().get(0));
        assertEquals("test", prop.getName());
        assertEquals("foo", prop.getValue());

        final DeclaredPropertyFileAST pFile = ((DeclaredPropertyFileAST) wfast.getChildren().get(1));
        assertEquals("path/to/file.txt", pFile.getFile());

        final ComponentAST comp = (ComponentAST) wfast.getChildren().get(2);
        assertEquals("test.Comp", comp.getClazz());
        assertEquals("x", comp.getId());
        assertEquals(3, comp.getChildren().size());

        SimpleParamAST p = (SimpleParamAST) comp.getChildren().get(0);
        assertEquals("aParam", p.getName());
        assertEquals("foo", p.getValue());

        p = (SimpleParamAST) comp.getChildren().get(1);
        assertEquals("aParam", p.getName());
        assertEquals("bar", p.getValue());

        final ReferenceAST ref = (ReferenceAST) comp.getChildren().get(2);
        assertEquals("x", ref.getIdRef());

        final InclusionAST i = (InclusionAST) wfast.getChildren().get(3);
        assertEquals("test.file", i.getFile());
        assertEquals(0, i.getChildren().size());
    }

}
