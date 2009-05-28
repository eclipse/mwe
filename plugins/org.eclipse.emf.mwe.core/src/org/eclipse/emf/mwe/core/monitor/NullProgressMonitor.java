/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.emf.mwe.core.monitor;

/**
 * Empty implementation of {@link ProgressMonitor}.
 * 
 * @author Sven Efftinge (http://www.efftinge.de)
 * @since 4.0
 */
public class NullProgressMonitor implements ProgressMonitor {

	/**
	 * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#beginTask(java.lang.String,
	 *      int)
	 */
	public void beginTask(final String name, final int totalWork) {
	}

	/**
	 * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#done()
	 */
	public void done() {
	}

	/**
	 * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#internalWorked(double)
	 */
	public void internalWorked(final double work) {
	}

	/**
	 * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#isCanceled()
	 */
	public boolean isCanceled() {
		return false;
	}

	/**
	 * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#setCanceled(boolean)
	 */
	public void setCanceled(final boolean value) {
	}

	/**
	 * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#setTaskName(java.lang.String)
	 */
	public void setTaskName(final String name) {
	}

	/**
	 * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#subTask(java.lang.String)
	 */
	public void subTask(final String name) {
	}

	/**
	 * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#worked(int)
	 */
	public void worked(final int work) {
	}

	/**
	 * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#started(java.lang.Object,
	 *      java.lang.Object)
	 */
	public void started(final Object element, final Object context) {
	}

	/**
	 * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#finished(java.lang.Object,
	 *      java.lang.Object)
	 */
	public void finished(final Object element, final Object context) {

	}

	/**
	 * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#postTask(java.lang.Object,
	 *      java.lang.Object)
	 */
	public void postTask(final Object element, final Object context) {
	}

	public void preTask(final Object element, final Object context) {
	}

}
