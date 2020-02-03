/*******************************************************************************
 * Copyright (c) 2008 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.core;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.internal.core.Workflow;
import org.eclipse.emf.mwe.internal.core.ast.util.WorkflowFactory;

/**
 * @author Sven Efftinge - Initial contribution and API
 * 
 */
public class WorkflowFacade {

	protected final Workflow workflow;
	protected final Issues issues = new IssuesImpl();

	public Issues getIssues() {
		return issues;
	}

	public WorkflowFacade(String path, Map<String, String> params) {
		final WorkflowFactory factory = new WorkflowFactory();
		workflow = factory.parseInitAndCreate(path,
				(params == null) ? Collections.<String, String> emptyMap() : params, WorkflowFactory
						.getDefaultConverter(), issues);
		if (workflow == null)
			throw new IllegalStateException("Couldn't load workflow file from '" + path + "'. Problems: "
					+ issues.toString());
	}

	public WorkflowFacade(String string) {
		this(string, Collections.<String, String> emptyMap());
	}

	public Issues check() {
		workflow.checkConfiguration(issues);
		return issues;
	}

	public Issues run() {
		Issues issues2 = check();
		if (issues2.hasErrors())
			throw new IllegalStateException(issues2.toString());
		return run(new HashMap<String, Object>());
	}

	public Issues run(final Map<String, Object> slotContents) {
		return run(slotContents, new NullProgressMonitor());
	}
	
	public Issues run(final Map<String, Object> slotContents, ProgressMonitor monitor) {
		WorkflowContext ctx = new WorkflowContext() {
			
			@Override
			public Object get(String slotName) {
				return slotContents.get(slotName);
			}
			
			@Override
			public String[] getSlotNames() {
				return slotContents.keySet().toArray(new String[0]);
			}
			
			@Override
			public void set(String slotName, Object value) {
				slotContents.put(slotName, value);
			}
		};
		
		workflow.invoke(ctx, new NullProgressMonitor(), issues);
		return issues;
	}
}
