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
package org.eclipse.emf.mwe.core.container;

import java.util.Iterator;

import org.eclipse.emf.mwe.core.ConfigurationException;
import org.eclipse.emf.mwe.core.WorkflowComponent;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowInterruptedException;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.internal.core.util.ComponentPrinter;

public abstract class ConditionalComponent extends CompositeComponent implements WorkflowConditional {

	private WorkflowComponent elseComp;

	public ConditionalComponent(String name) {
		super(name);
	}

	public void setElse(final CompositeComponent comp) {
		elseComp = comp;
	}

	/**
	 * Dispatches the invocation to all aggregated components.
	 */
	@Override
	public void invoke(final WorkflowContext ctx, final ProgressMonitor monitor, final Issues issues) {
		internalInvoke(ctx, monitor, issues);
	}

	private void internalInvoke(final WorkflowContext model, final ProgressMonitor monitor, final Issues issues) {
		try {
			if (evaluate()) {
				for (final Iterator<WorkflowComponent> iter = components.iterator(); iter.hasNext();) {
					final WorkflowComponent comp = iter.next();
					try {
						log.info(ComponentPrinter.getString(comp));
					}
					catch (final WorkflowInterruptedException wfi) {
						throw wfi;
					}
					catch (final Throwable t) {
						issues.addError(comp, "Error during execution: " + t.getMessage());
						log.error("Exception occured: ", t);
					}
					comp.invoke(model, monitor, issues);
				}
			}
			else if (elseComp != null) {
				elseComp.invoke(model, monitor, issues);
			}
		}
		catch (ConditionEvaluationException ex) {
			issues.addError(this, "cannot evaluate condition: " + ex.getMessage());
		}
	}

	@Override
	public void checkConfiguration(Issues issues) throws ConfigurationException {
		super.checkConfiguration(issues);

		// Do not forget to check the config on the elseComp
		if (elseComp != null) {
			elseComp.checkConfiguration(issues);
		}
	}
}
