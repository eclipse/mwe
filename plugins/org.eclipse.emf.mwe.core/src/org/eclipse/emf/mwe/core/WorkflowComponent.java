/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.emf.mwe.core;

import org.eclipse.emf.mwe.core.container.CompositeComponent;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.internal.core.ast.parser.Location;

/**
 * WorkflowComponents are components that can be executed by the
 * openArchitectureWare Workflow Engine.
 * <p>
 * The Workflow Engine will call the
 * {@link #invoke(WorkflowContext, ProgressMonitor)} method at the appropriate
 * time to execute the component's service.
 * 
 * @author Sven Efftinge (http://www.efftinge.de)
 */
public interface WorkflowComponent {

    /**
     * @param ctx
     *            current workflow context
     * @param monitor
     *            implementors should provide some feedback about the progress
     *            using this monitor
     * @param issues
     */
    public void invoke(WorkflowContext ctx, ProgressMonitor monitor, Issues issues);

    /**
     * Is called by the container after configuration so the component can
     * validate the configuration before invocation.
     * 
     * @param issues -
     *            implementors should report configuration issues to this.
     */
    public void checkConfiguration(Issues issues);
    
    /**
     * returns the containing component, if there is one
     * @return
     */
    public CompositeComponent getContainer();
    
    /**
     * set the containing component
     * @return
     */
    public void setContainer( CompositeComponent container );
    
    /**
     * set the location in the source file that invokes the current component.
     */
    public void setLocation( Location location);
    
    /**
     * return the location
     * @return the location
     */
    public Location getLocation();
}
