/*******************************************************************************
 * Copyright (c) 2009, 2019 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.emf.mwe.core.monitor;

import org.eclipse.core.runtime.IProgressMonitor;

/**
 * An adapter between Eclipse's {@link IProgressMonitor} interface and oAW's {@link ProgressMonitor} interface.
 * The adapter delegates all calls to the wrapped <tt>IProgressMonitor</tt> instance.
 * @author Karsten Thoms
 * @since 4.1.2
 */
public class ProgressMonitorAdapter implements ProgressMonitor {
	private IProgressMonitor monitor;
	
	/**
	 * Constructor.
	 * @param monitor The monitor implementation where all calls are delegated to.
	 */
	public ProgressMonitorAdapter (IProgressMonitor monitor) {
		this.monitor = monitor;
	}
	
	/**
	 * @see ProgressMonitor#beginTask(String, int) }
	 */
	@Override
	public void beginTask(String name, int totalWork) {
		monitor.beginTask(name, totalWork);
	}

	/**
	 * @see ProgressMonitor#done() }
	 */
	@Override
	public void done() {
		monitor.done();
	}

	/**
	 * @see ProgressMonitor#internalWorked(double) }
	 */
	@Override
	public void internalWorked(double work) {
		monitor.internalWorked(work);
	}

	/**
	 * @see ProgressMonitor#isCanceled() }
	 */
	@Override
	public boolean isCanceled() {
		return monitor.isCanceled();
	}

	@Override
	public void started(Object element, Object context){
	}

	@Override
	public void finished(Object element, Object context){
		
	}

	/**
	 * @see ProgressMonitor#postTask(Object, Object) }
	 */
	@Override
	public void postTask(Object element, Object context) {
	}

	/**
	 * @see ProgressMonitor#preTask(Object, Object) }
	 */
	@Override
	public void preTask(Object element, Object context) {
	}

	/**
	 * @see ProgressMonitor#setCanceled(boolean) }
	 */
	@Override
	public void setCanceled(boolean value) {
		monitor.setCanceled(value);
	}

	/**
	 * @see ProgressMonitor#setTaskName(String) }
	 */
	@Override
	public void setTaskName(String name) {
		monitor.setTaskName(name);
	}

	/**
	 * @see ProgressMonitor#subTask(String) }
	 */
	@Override
	public void subTask(String name) {
		monitor.subTask(name);
	}

	/**
	 * @see ProgressMonitor#worked(int) }
	 */
	@Override
	public void worked(int work) {
		monitor.worked(work);
	}
}
