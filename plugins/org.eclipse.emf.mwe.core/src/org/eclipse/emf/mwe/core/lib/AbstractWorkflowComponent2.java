/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.core.lib;

import org.eclipse.emf.mwe.core.issues.Issues;

public abstract class AbstractWorkflowComponent2 extends AbstractWorkflowComponent {

	/**
	 * @see org.eclipse.emf.mwe.core.WorkflowComponent#checkConfiguration(org.eclipse.emf.mwe.core.issues.Issues)
	 */
	@Override
	public final void checkConfiguration(final Issues issues) {
		checkConfigurationInternal(issues);
	}
	
	protected void checkConfigurationInternal(Issues issues) {}

}
