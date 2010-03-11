/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.runtime.workflow;

import org.apache.log4j.Logger;

public class Workflow extends AbstractCompositeWorkflowComponent implements IWorkflow {

	private static final Logger logger = Logger.getLogger(Workflow.class); 
	
	public void run(IWorkflowContext context) {
		this.preInvoke();
		this.invoke(context);
		this.postInvoke();
		logger.info("Done.");
	}
	
	public void addBean(Object x) {
	}

}
