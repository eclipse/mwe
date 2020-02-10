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
	@Override
	public void beginTask(final String name, final int totalWork) {
	}

	/**
	 * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#done()
	 */
	@Override
	public void done() {
	}

	/**
	 * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#internalWorked(double)
	 */
	@Override
	public void internalWorked(final double work) {
	}

	/**
	 * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#isCanceled()
	 */
	@Override
	public boolean isCanceled() {
		return false;
	}

	/**
	 * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#setCanceled(boolean)
	 */
	@Override
	public void setCanceled(final boolean value) {
	}

	/**
	 * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#setTaskName(java.lang.String)
	 */
	@Override
	public void setTaskName(final String name) {
	}

	/**
	 * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#subTask(java.lang.String)
	 */
	@Override
	public void subTask(final String name) {
	}

	/**
	 * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#worked(int)
	 */
	@Override
	public void worked(final int work) {
	}

	/**
	 * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#started(java.lang.Object,
	 *      java.lang.Object)
	 */
	@Override
	public void started(final Object element, final Object context) {
	}

	/**
	 * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#finished(java.lang.Object,
	 *      java.lang.Object)
	 */
	@Override
	public void finished(final Object element, final Object context) {

	}

	/**
	 * @see org.eclipse.emf.mwe.core.monitor.ProgressMonitor#postTask(java.lang.Object,
	 *      java.lang.Object)
	 */
	@Override
	public void postTask(final Object element, final Object context) {
	}

	@Override
	public void preTask(final Object element, final Object context) {
	}

}
