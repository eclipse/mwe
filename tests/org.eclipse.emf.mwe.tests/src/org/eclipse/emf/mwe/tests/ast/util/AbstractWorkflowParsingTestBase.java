/*******************************************************************************
 * Copyright (c) 2005, 2006 committers of openArchitectureWare and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.tests.ast.util;

import java.util.Map;

import org.apache.tools.ant.filters.StringInputStream;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.internal.core.Workflow;
import org.eclipse.emf.mwe.internal.core.ast.util.WorkflowFactory;
import org.junit.Assert;
import org.junit.Before;

public abstract class AbstractWorkflowParsingTestBase extends Assert {
	protected Issues issues;

	@Before
	public void setUp() throws Exception {
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
