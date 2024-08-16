/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.runtime.workflow;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Workflow extends AbstractCompositeWorkflowComponent implements IWorkflow {

	private static final Logger logger = LoggerFactory.getLogger(Workflow.class);

	@Override
	public void run(IWorkflowContext context) {
		this.preInvoke();
		this.invoke(context);
		this.postInvoke();
		logger.info("Done.");
	}
	
	public void addBean(Object x) {
	}

}
