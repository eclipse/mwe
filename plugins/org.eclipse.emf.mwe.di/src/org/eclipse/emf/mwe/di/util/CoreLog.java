/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.di.util;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.mwe.di.Activator;

/**
 * @author Peter Friese - Initial contribution and API
 * 
 */
public class CoreLog {

	public final static void logInfo(final String msg, final Throwable t) {
		log(IStatus.INFO, IStatus.OK, msg, t);
	}

	public final static void logInfo(final String msg) {
		log(IStatus.INFO, IStatus.OK, msg, null);
	}

	public final static void logWarning(final String msg) {
		log(IStatus.WARNING, IStatus.OK, msg, null);
	}

	public final static void logError(final Throwable t) {
		logError(t.getMessage(), t);
	}

	public final static void logError(final String msg, final Throwable t) {
		log(IStatus.ERROR, IStatus.OK, msg, t);
	}

	public final static void log(final IStatus status) {
		Activator.getDefault().getLog().log(status);
	}

	private final static void log(final int severity, final int code, final String message, final Throwable exception) {
		log(createStatus(severity, code, message, exception));
	}

	private final static IStatus createStatus(final int severity, final int code, final String message,
			final Throwable exception) {
		final String symbolicName = Activator.getDefault().getBundle().getSymbolicName();
		return new Status(severity, symbolicName, code, message != null ? message : "", exception);
	}

}
