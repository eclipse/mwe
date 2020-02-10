/*******************************************************************************
 * Copyright (c) 2005 - 2009 committers of openArchitectureWare and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.core;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

/**
 * Eclipse Application wrapper for MWE {@link WorkflowRunner}. Application arguments are passed as-is
 * to the workflow engine. 
 * 
 * @author Karsten Thoms - Initial contribution and API
 * @since 1.0.0-M4
 */
public class WorkflowRunnerApplication implements IApplication {
	public static final String KEY_APPL_ARGS = "application.args";

	@Override
	public Object start(IApplicationContext context) throws Exception {
		String[] args = (String[]) context.getArguments().get(KEY_APPL_ARGS);
		org.eclipse.emf.mwe.core.WorkflowRunner.main(args);
		return null;
	}

	@Override
	public void stop() {
	}

}
