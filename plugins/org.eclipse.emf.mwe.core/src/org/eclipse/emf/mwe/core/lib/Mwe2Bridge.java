/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.emf.mwe.core.lib;

import org.eclipse.emf.mwe.core.WorkflowComponentWithID;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.issues.MWEDiagnostic;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class Mwe2Bridge {

	private static final Logger log = LoggerFactory.getLogger(Mwe2Bridge.class);

	private final WorkflowComponentWithID delegate;

	public Mwe2Bridge(WorkflowComponentWithID delegate) {
		this.delegate = delegate;
	}
	
	public void invoke(final IWorkflowContext ctx) {
		IssuesImpl issuesImpl = new IssuesImpl();
		delegate.invoke(new WorkflowContext() {
			
			@Override
			public void set(String slotName, Object value) {
				ctx.put(slotName, value);
			}
			
			@Override
			public String[] getSlotNames() {
				return ctx.getSlotNames().toArray(new String[ctx.getSlotNames().size()]);
			}
			
			@Override
			public Object get(String slotName) {
				return ctx.get(slotName);
			}
		}, new NullProgressMonitor(), issuesImpl);
		handleIssues(issuesImpl);
	}
	
	protected void handleIssues(IssuesImpl issuesImpl) {
		for (MWEDiagnostic diag: issuesImpl.getWarnings()) {
			log.warn(diag.toString());
		}
		if (issuesImpl.hasErrors()) {
			throw new RuntimeException(issuesImpl.toString());
		}
	}
	
	public void postInvoke() {
	}
	
	public void preInvoke() {
		IssuesImpl issuesImpl = new IssuesImpl();
		delegate.checkConfiguration(issuesImpl);
		handleIssues(issuesImpl);
	}
	
}
