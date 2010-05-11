/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.emf.mwe.core.lib;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.mwe.core.WorkflowComponentWithID;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.issues.MWEDiagnostic;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class Mwe2Bridge {

	private static final Log log = LogFactory.getLog(Mwe2Bridge.class); 
	
	private final WorkflowComponentWithID delegate;

	public Mwe2Bridge(WorkflowComponentWithID delegate) {
		this.delegate = delegate;
	}
	
	public void invoke(final IWorkflowContext ctx) {
		IssuesImpl issuesImpl = new IssuesImpl();
		delegate.invoke(new WorkflowContext() {
			
			public void set(String slotName, Object value) {
				ctx.put(slotName, value);
			}
			
			public String[] getSlotNames() {
				return ctx.getSlotNames().toArray(new String[ctx.getSlotNames().size()]);
			}
			
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
