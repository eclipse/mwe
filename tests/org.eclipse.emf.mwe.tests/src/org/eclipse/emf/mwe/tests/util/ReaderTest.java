/*******************************************************************************
 * Copyright (c) 2009, 2019 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.emf.mwe.tests.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.utils.Reader;
import org.junit.Assert;
import org.junit.Test;

public class ReaderTest extends Assert {
	/**
	 * Will fail when executed as plain vanilla unit test. Tests are executed as plugin-unit-test on the server. Since
	 * they may not fail on the server, we decide to use a platform:/plugin..-uri.
	 */
	@Test
	public void testLoadSimpleModel() throws Exception {
		Reader r = new Reader();
		r.setFirstElementOnly(true);
		r.setModelSlot("x");
		r.setUri("platform:/plugin/org.eclipse.emf.mwe.tests/resources/test/res/test.ecore");

		WorkflowContext ctx = new WorkflowContextDefaultImpl();
		r.invoke(ctx, new NullProgressMonitor(), new IssuesImpl());
		EObject model1 = (EObject) ctx.get("x");
		assertNotNull(model1);

		r.invoke(ctx, new NullProgressMonitor(), new IssuesImpl());
		EObject model2 = (EObject) ctx.get("x");
		assertNotNull(model2);
		assertTrue(model1.eClass() == model2.eClass());
	}

	@Test
	public void testFaultTolerantLoad() throws Exception {
		Reader r = new Reader();
		r.setFirstElementOnly(true);
		r.setModelSlot("x");
		r.setIgnoreMissingModel(true);
		r.setUri("platform:/plugin/this/path/does/not/exist/test.ecore");

		WorkflowContext ctx = new WorkflowContextDefaultImpl();
		r.invoke(ctx, new NullProgressMonitor(), new IssuesImpl());
		EObject model = (EObject) ctx.get("x");
		assertNull(model);
	}

}
