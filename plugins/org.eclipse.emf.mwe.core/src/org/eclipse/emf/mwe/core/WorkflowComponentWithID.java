/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.emf.mwe.core;

/**
 * This is a workflow component that has an Id, so that it can be output in the
 * logger.
 */
public interface WorkflowComponentWithID extends WorkflowComponent {

	/**
	 * Sets the Id of the component.
	 * @param id Component Id.
	 */
    public void setId(String id);

    /**
     * Retrieves the Id of the component.
     * @return Component Id.
     */
    public String getId();

    /**
     * Retrieves a log message that can be reported to the execution log.
     */
    public String getLogMessage();
}
