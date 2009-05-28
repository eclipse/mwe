/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.core.lib;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public abstract class AbstractWorkflowComponent2 extends AbstractWorkflowComponent {

	private final Log log = LogFactory.getLog(getClass());

	private boolean skipOnErrors = false;

	/**
	 * Sets if the execution of this component should be skipped if previously
	 * executed components contained some errors.
	 * 
	 * @param skip
	 *            if <code>true</code>, the execution of this component is
	 *            skipped if previous errors occurred, otherwise, the component
	 *            is executed as usual.
	 */
	@Override
	public void setSkipOnErrors(final boolean skip) {
		skipOnErrors = skip;
	}

	/**
	 * @see org.eclipse.emf.mwe.core.WorkflowComponent#checkConfiguration(org.eclipse.emf.mwe.core.issues.Issues)
	 */
	public final void checkConfiguration(final Issues issues) {
		checkConfigurationInternal(issues);
	}

	/**
	 * @see org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent#invokeInternal(org.eclipse.emf.mwe.core.WorkflowContext,
	 *      org.eclipse.emf.mwe.core.monitor.ProgressMonitor,
	 *      org.eclipse.emf.mwe.core.issues.Issues)
	 */
	@Override
	protected void invokeInternal(final WorkflowContext ctx, final ProgressMonitor monitor, final Issues issues) {
		if (monitor != null) {
			if (monitor.isCanceled())
				return;

			monitor.beginTask("Running " + getComponentName() + "...", ProgressMonitor.UNKNOWN);
		}
		if (skipOnErrors && issues.hasErrors()) {
			log.info("execution skipped, since there are errors and skipOnErrors is set.");
			return;
		}
		invokeInternal(ctx, monitor, issues);
		if (monitor != null) {
			monitor.done();
		}
	}

	protected abstract void checkConfigurationInternal(Issues issues);

}
