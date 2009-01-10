/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.emf.mwe.core.monitor;

import org.eclipse.emf.common.util.Monitor;

/**
 * The <code>IProgressMonitor</code> interface is implemented by objects that
 * monitor the progress of an activity; the methods in this interface are
 * invoked by code that performs the activity.
 * <p>
 * All activity is broken down into a linear sequence of tasks against which
 * progress is reported. When a task begins, a <code>beginTask(String, int)
 * </code> notification is reported,
 * followed by any number and mixture of progress reports (<code>worked()</code>
 * ) and subtask notifications (<code>subTask(String)</code>). When the task is
 * eventually completed, a <code>done()</code> notification is reported. After
 * the <code>done()</code> notification, the progress monitor cannot be reused;
 * i.e., <code>
 * beginTask(String, int)</code> cannot be called again after the call to
 * <code>done()</code>.
 * </p>
 * <p>
 * A request to cancel an operation can be signaled using the
 * <code>setCanceled</code> method. Operations taking a progress monitor are
 * expected to poll the monitor (using <code>isCanceled</code>) periodically and
 * abort at their earliest convenience. Operation can however choose to ignore
 * cancelation requests.
 * </p>
 * <p>
 * Since notification is synchronous with the activity itself, the listener
 * should provide a fast and robust implementation. If the handling of
 * notifications would involve blocking operations, or operations which might
 * throw uncaught exceptions, the notifications should be queued, and the actual
 * processing deferred (or perhaps delegated to a separate thread).
 * </p>
 * <p>
 * Clients may implement this interface.
 * </p>
 */
public interface ProgressMonitor extends Monitor {

	/**
	 * Notifies that a task will be started. Must be paired together with one
	 * <code>postTask()</code> call.
	 * 
	 * @param element
	 *            The element that fired that notification
	 * @param context
	 *            the context of execution
	 */
	public void preTask(Object element, Object context);

	/**
	 * Notifies that a task was finished. Must be paired together with one
	 * <code>preTask()</code> call.
	 * 
	 * @param element
	 *            The element that fired that notification
	 * @param context
	 *            the context of execution
	 */
	public void postTask(Object element, Object context);

	/**
	 * Notifies that overall process was started.
	 * 
	 * @param element
	 *            The element that fired that notification
	 * @param context
	 *            the context of execution
	 */
	public void started(Object element, Object context);

	/**
	 * Notifies that overall process was finished.
	 * 
	 * @param element
	 *            The element that fired that notification
	 * @param context
	 *            the context of execution
	 */
	public void finished(Object element, Object context);
}
