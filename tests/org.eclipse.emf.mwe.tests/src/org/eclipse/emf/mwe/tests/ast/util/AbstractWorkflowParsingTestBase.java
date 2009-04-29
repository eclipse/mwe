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
package org.eclipse.emf.mwe.tests.ast.util;

import java.util.Map;

import junit.framework.TestCase;

import org.apache.tools.ant.filters.StringInputStream;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.internal.core.Workflow;
import org.eclipse.emf.mwe.internal.core.ast.util.WorkflowFactory;

public abstract class AbstractWorkflowParsingTestBase extends TestCase {
	protected Issues issues;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		issues = new IssuesImpl();
	}

	protected void assertNoIssues() {
		if (issues.hasErrors()) {
			fail(issues.toString());
		}
	}

	protected Workflow parseWorkflow(final String fileName, final Map<String, String> params) {
		String fqn = new String(fileName);
		if (fqn.indexOf('/') == -1) {
			fqn = qualify(fqn);
		}
		return new WorkflowFactory()
				.parseInitAndCreate(fqn, params, WorkflowFactory.getDefaultConverter(), issues);
	}

	protected Workflow parseWorkflow(final StringInputStream stream, final Map<String, String> params) {
		return new WorkflowFactory().parseInitAndCreate(stream, "unknown", params, WorkflowFactory
				.getDefaultConverter(), issues);
	}

	protected String qualify(final String name) {
		return getClass().getPackage().getName().replace('.', '/') + "/" + name;
	}
}
