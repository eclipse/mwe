/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.ui.internal.editor.logging;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.mwe.ui.internal.editor.WorkflowEditorPlugin;
import org.eclipse.jdt.core.JavaModelException;

public final class Log {
	private static ILog log;

	/**
	 * Hide constructor because of utility class.
	 */
	private Log() {

	}

	public static void logError(final String msg, final Throwable t) {
		if (t != null) {
			t.printStackTrace();
		}
		log(IStatus.ERROR, IStatus.OK, msg, t);
	}

	public static void logError(final Throwable t) {
		logError(t.getMessage(), t);
	}

	public static void logInfo(final JavaModelException e1) {
		logInfo(e1.getClass().getName() + " - " + e1.getMessage() + " in "
				+ e1.getStackTrace()[0]);
	}

	public static void logInfo(final String msg) {
		log(IStatus.INFO, IStatus.OK, msg, null);
	}

	private static IStatus createStatus(final int severity, final int code,
			final String message, final Throwable exception) {
		return new Status(severity, WorkflowEditorPlugin.PLUGIN_ID, code, message != null
				? message : "", exception);
	}

	private static void log(final int severity, final int code,
			final String message, final Throwable exception) {
		log(createStatus(severity, code, message, exception));
	}

	private static void log(final IStatus status) {
		if (log == null) {
			log = WorkflowEditorPlugin.getDefault().getLog();
		}
		log.log(status);
	}

}
