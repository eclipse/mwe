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

package org.eclipse.emf.mwe.core;

import org.eclipse.emf.mwe.core.container.CompositeComponent;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.internal.core.ast.parser.Location;

/**
 * WorkflowComponents are components that can be executed by the
 * Model Workflow Engine.
 * <p>
 * The Workflow Engine will call the
 * {@link #invoke(WorkflowContext, ProgressMonitor, Issues)} method at the appropriate
 * time to execute the component's service.
 * 
 * @author Sven Efftinge (http://www.efftinge.de)
 */
public interface WorkflowComponent {

    /**
	 * Invokes the component.
	 * 
     * @param ctx
     *            current workflow context
     * @param monitor
     *            implementors should provide some feedback about the progress
     *            using this monitor
     * @param issues
     */
    public void invoke(WorkflowContext ctx, ProgressMonitor monitor, Issues issues);

    /**
	 * Called by the container after configuration so the component can validate
	 * the configuration before invocation.
     * 
	 * @param issues
     *            implementors should report configuration issues to this.
     */
    public void checkConfiguration(Issues issues);
    
    /**
	 * Returns the containing component if there is one.
	 * 
	 * @return the containing component
     */
    public CompositeComponent getContainer();
    
    /**
	 * Sets the containing component.
	 * 
	 * @param container
	 *            the containing component
     */
	public void setContainer(CompositeComponent container);
    
    /**
	 * Sets the location in the source file that invokes the current component.
	 * 
	 * @param location
	 *            the location
     */
	public void setLocation(Location location);
    
    /**
	 * Returns the location in the source file that invokes the current
	 * component.
	 * 
     * @return the location
     */
    public Location getLocation();

	/**
	 * Returns the name of the component.
	 * 
	 * @return the component name
	 * @since 4.3.1
	 */
	public String getComponentName();

}
