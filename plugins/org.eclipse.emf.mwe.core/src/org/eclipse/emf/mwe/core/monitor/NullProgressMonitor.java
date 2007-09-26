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
package org.eclipse.emf.mwe.core.monitor;

import org.eclipse.emf.common.util.Diagnostic;

/**
 * Empty implementation of {@link ProgressMonitor}.
 * 
 */
public class NullProgressMonitor implements ProgressMonitor {

    /*
     * (non-Javadoc)
     * 
     * @see org.openarchitectureware.workflow.monitor.ProgressMonitor#beginTask(java.lang.String,
     *      int)
     */
    public void beginTask(final String name, final int totalWork) {
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.openarchitectureware.workflow.monitor.ProgressMonitor#done()
     */
    public void done() {
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.openarchitectureware.workflow.monitor.ProgressMonitor#internalWorked(double)
     */
    public void internalWorked(final double work) {
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.openarchitectureware.workflow.monitor.ProgressMonitor#isCanceled()
     */
    public boolean isCanceled() {
        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.openarchitectureware.workflow.monitor.ProgressMonitor#setCanceled(boolean)
     */
    public void setCanceled(final boolean value) {
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.openarchitectureware.workflow.monitor.ProgressMonitor#setTaskName(java.lang.String)
     */
    public void setTaskName(final String name) {
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.openarchitectureware.workflow.monitor.ProgressMonitor#subTask(java.lang.String)
     */
    public void subTask(final String name) {
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.openarchitectureware.workflow.monitor.ProgressMonitor#worked(int)
     */
    public void worked(final int work) {
    }

	public void started(final Object element, final Object context){
	}

	public void finished(final Object element, final Object context){
		
	}

	public void postTask(final Object element, final Object context) {
	}

	public void preTask(final Object element, final Object context) {
	}

	public void clearBlocked() {
	}

	public void setBlocked(final Diagnostic reason) {
	}

}
