/*******************************************************************************
 * Copyright (c) 2005, 2006 committers of openArchitectureWare and others.
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
import org.eclipse.emf.mwe.core.WorkflowComponentWithID;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.container.CompositeComponent;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.internal.core.ast.parser.Location;

/**
 * Base class useful for implementing custom WorkflowComponents.
 * 
 */
public abstract class AbstractWorkflowComponent implements WorkflowComponentWithID {
	
	private static final Log log = LogFactory.getLog(AbstractWorkflowComponent.class);
	
	/** The component's id */
	private String componentID;
	
	private boolean skipOnErrors = false;

	/** Container component */
	private CompositeComponent container;

	private Location location;

	/**
	 * @return The component's id
	 */
	public String getId() {
		return componentID;
	}

	/**
	 * @param id
	 *            The component's id
	 */
	public void setId(final String id) {
		componentID = id;
	}
	
	public void setSkipOnErrors(final boolean b) {
        skipOnErrors = b;
    }
	
	/**
	 * @return The containing component if any
	 */
	public CompositeComponent getContainer() {
		return container;
	}

	/**
	 * @param container
	 *            The containing component
	 */
	public void setContainer(final CompositeComponent container) {
		this.container = container;
	}

	public String getLogMessage() {
		return null;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(final Location location) {
		this.location = location;
	}
	
	public final void invoke(final WorkflowContext ctx, final ProgressMonitor monitor, final Issues issues) {
        if (skipOnErrors && issues.hasErrors()) {
            log.info("execution skipped, since there are errors and skipOnErrors is set.");
            return;
        }
        invokeInternal(ctx, monitor, issues);
    }

    protected abstract void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues);

	/**
	 * Utility method that can be used in method <code>checkConfiguration</code>
	 * to check required properties. If <code>configPropertyValue</code> is
	 * <code>null</code> or a blank string then this method will add an error
	 * issue.
	 * 
	 * @param configPropertyName
	 *            Name of the checked config property.
	 * @param configPropertyValue
	 *            The config property value.
	 * @param issues
	 *            The Issues instance.
	 */
	public void checkRequiredConfigProperty(final String configPropertyName, final Object configPropertyValue, final Issues issues) {
		boolean isError = false;
		if (configPropertyValue == null) {
			isError = true;
		} else if ((configPropertyValue instanceof String) && isBlank(configPropertyValue.toString())) {
			isError = true;
		}

		if (isError) {
			issues.addError("'" + configPropertyName + "' not specified.");
		}
	}

	private boolean isBlank(final String string) {
		if ((string == null) || string.trim().equals("")) {
			return true;
		}
		return false;
	}
}
