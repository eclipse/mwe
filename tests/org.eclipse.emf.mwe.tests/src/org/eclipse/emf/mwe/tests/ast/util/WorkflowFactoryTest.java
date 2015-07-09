/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.emf.mwe.tests.ast.util;

import java.util.Collections;
import java.util.Map;

import org.apache.tools.ant.filters.StringInputStream;
import org.eclipse.emf.mwe.core.container.CompositeComponent;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.internal.core.Workflow;
import org.junit.Test;

import test.res.Component;
import test.res.SubComponent;

@SuppressWarnings("unchecked")
public class WorkflowFactoryTest extends AbstractWorkflowParsingTestBase {
	
    String simpleWorkflow1 = "<workflow>                                                                             "
            + "   <property name='property' value='true'/>                                    "
            + "   <component class='test.res.Component' booleanParam='true' booleanObjectParam='true'>"
            + "      <stringParam value='foo'/>                                                       "
            + "	     <stringArrayParam value='foo, bar'/>                                             "
            + "	     <intParam value='42'/>                                                           "
            + "	     <integerParam value='42'/>                                                       "
            + "	     <type class='test.res.SubComponent' prop='true' id='x'>                          "
            + "		    <prop value='${property}'/>                                                   "
            + "			<type intParam='1'/>                                                          "
            + "		 </type>                                                                          "
            + "	  </component>                                                                        "
            + "	  <component idRef='x'/>                                                              "
            + "</workflow>                                                                            ";

	@Test public void testSimpleWorkflow() {
		Component.INVOCATIONS = 0;
		Component.CHECKS = 0;
        final Workflow cont = parseWorkflow(new StringInputStream(simpleWorkflow1), Collections.EMPTY_MAP);
        assertNoIssues();
        assertNotNull(cont);
        final Issues issues = new IssuesImpl();
        cont.checkConfiguration(issues);
        cont.invoke(null, null, null);
        final Component comp = (Component) cont.getComponents().get(0);

        assertNotNull(comp.type);
        assertNotNull(comp.type.type);
        assertTrue(((SubComponent) comp.type).prop);
        assertNull(comp.type.type.type);
        assertNotNull(comp.stringParam);
        assertEquals("foo", comp.stringParam);
        assertEquals(" bar", comp.stringArrayParam[1]);

        assertEquals(1, comp.invocations);
        assertEquals(2, Component.INVOCATIONS);

        assertEquals(1, comp.checks);
        assertEquals(2, Component.CHECKS);
    }

    String conditional = "<workflow>                                                      "
            + "   <property name='prop' value='true'/>                                        "
            + "   <if cond='${prop}'>                                                                 "
            + "   <component class='test.res.Component'>                                              "
            + "	  </component>                                                                        "
            + "	  </if>                                                                               "
            + "	  <component class='test.res.Component'/>                                             "
            + "</workflow>                                                                            ";

    @Test public void testConditionalWorkflow1() {
        final Workflow cont = parseWorkflow(new StringInputStream(conditional), Collections.EMPTY_MAP);
        assertNoIssues();
        assertNotNull(cont);
        final Issues issues = new IssuesImpl();
        cont.checkConfiguration(issues);
        cont.invoke(null, null, null);
        final Component comp = (Component) ((CompositeComponent) cont.getComponents().get(0)).getComponents().get(0);
        assertEquals(1, comp.invocations);
        assertEquals(1, comp.checks);
    }

    @Test public void testConditionalWorkflow2() {
        final Workflow cont = parseWorkflow(new StringInputStream(conditional), Collections.singletonMap("prop", "false"));
        assertNoIssues();
        assertNotNull(cont);
        final Issues issues = new IssuesImpl();
        cont.checkConfiguration(issues);
        cont.invoke(null, null, null);
        final Component comp = (Component) ((CompositeComponent) cont.getComponents().get(0)).getComponents().get(0);
        assertEquals(0, comp.invocations);
        assertEquals(1, comp.checks);
    }

    @Test public void testComplex() {
        final Workflow cont = parseWorkflow("test/res/complex/importingWorkflow.mwe", Collections.singletonMap("prop", "false"));
        assertNoIssues();
        assertNotNull(cont);

        final Component c1 = (Component) cont.getComponents().get(0);
        assertNotNull(c1.type);
        assertEquals("foobar", c1.type.stringParam);

        final CompositeComponent c2 = (CompositeComponent) cont.getComponents().get(1);
        final Component c3 = (Component) c2.getComponents().get(0);

        assertNotNull(c3.type);
        assertEquals("barfoo", c3.type.stringParam);
        assertNotNull(c3.bean);
        final Map<?, ?> b = (Map<?, ?>) c3.bean;
        assertEquals("foo", b.get("name"));

        final Map<?, ?> m1 = (Map<?, ?>) b.get("b1");
        assertEquals("foo_bar", m1.get("name"));
        final Map<?, ?> m2 = (Map<?, ?>) b.get("b2");
        assertEquals("bar_foo", m2.get("name"));

    }

    public final void testPropertyResolution() throws Exception {
        final Workflow cont = parseWorkflow("test/res/testPropertyResolution.mwe", Collections.singletonMap("path", "test/res/"));
        assertNoIssues();
        assertNotNull(cont);

        final Component c1 = (Component) cont.getComponents().get(0);
        assertEquals("foobar", c1.stringParam);

        final Component c2 = (Component) cont.getComponents().get(1);

        assertEquals("foobarfoo", c2.stringParam);
        assertEquals("foobarfoobar", c2.type.stringParam);

        final Component c3 = (Component) cont.getComponents().get(2);
        assertEquals("foobar", c3.stringParam);
    }

    String recProp = "<workflow><property name='prop' value='${prop}'/></workflow>";

    @Test public void testRecProps() {
        parseWorkflow(new StringInputStream(recProp), Collections.EMPTY_MAP);
        assertEquals(1, issues.getErrors().length);
    }

    String recProp2 = "<workflow><property name='prop' value='${test}${prop}'/></workflow>";

    @Test public void testRecProps2() {
        parseWorkflow(new StringInputStream(recProp2), Collections.singletonMap("test", "test"));
        assertEquals(1, issues.getErrors().length);
    }

    public final void testInheritAll() {
        final Workflow cont = parseWorkflow("test/res/complex/inheritAll1.mwe", Collections.singletonMap("param", "Hallo Test"));
        assertNoIssues();
        assertNotNull(cont);

        final CompositeComponent c1 = (CompositeComponent) cont.getComponents().get(0);
        
        final Component c2 = (Component) c1.getComponents().get(0);

        assertEquals("Hallo Test", c2.stringParam);
        Component bean = (Component) c2.bean;
        assertEquals("Hallo Welt", bean.stringParam);

        
    }
    
    String propertyOverwriting = "<workflow>"
        + "   <component file='test/res/complex/importingWorkflow2.mwe' inheritAll='true'>"
        + "   <property name='string' value='value1' />"
        + "	  </component>"
        + "   <component file='test/res/complex/importingWorkflow2.mwe' inheritAll='true'>"
        + "   <property name='string' value='value2' />"
        + "	  </component>"
        + "   <component file='test/res/complex/importingWorkflow2.mwe' inheritAll='true'>"
        + "   <string value='value3' />"
        + "	  </component>"
        + "</workflow>";

    public final void testPropertyOverwriting() {
        final Workflow cont = parseWorkflow(new StringInputStream(propertyOverwriting), Collections.EMPTY_MAP);
        assertNoIssues();
        assertNotNull(cont);
        final IssuesImpl issues = new IssuesImpl();
        cont.checkConfiguration(issues);
        cont.invoke(null, null, null);
        
        Workflow workflow1 = (Workflow) cont.getComponents().get(0);
        Workflow workflow2 = (Workflow) cont.getComponents().get(1);
        Workflow workflow3 = (Workflow) cont.getComponents().get(2);

        Component comp1 = (Component) workflow1.getComponents().get(0);
        Component comp2 = (Component) workflow2.getComponents().get(0);
        Component comp3 = (Component) workflow3.getComponents().get(0);
        
        assertEquals("value1", comp1.stringParam);
        assertEquals("value2", comp2.stringParam);
        assertEquals("value3", comp3.stringParam);
    }

}
