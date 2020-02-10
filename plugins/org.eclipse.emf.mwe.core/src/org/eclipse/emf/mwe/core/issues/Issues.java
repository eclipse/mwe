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

package org.eclipse.emf.mwe.core.issues;

import java.util.List;

import org.eclipse.emf.mwe.core.WorkflowComponent;

/**
 * Collects information about workflow configuration.
 * 
 */
public interface Issues {

	/**
	 * Adds a {@link MWEDiagnostic}. Only {@link MWEDiagnostic} with a severity
	 * of {@link MWEDiagnostic#INFO}, {@link MWEDiagnostic#WARNING} and
	 * {@link MWEDiagnostic#ERROR} are allowed
	 * 
	 * @param issue
	 */
	public void add(MWEDiagnostic issue);

	/**
	 * Adds a info message.
	 * 
	 * @param msg
	 *            Message text.
	 */
	public void addInfo(String msg);

	/**
	 * Adds a info message.
	 * 
	 * @param msg
	 *            Message text.
	 */
	public void addInfo(String msg, Object obj);

	/**
	 * Adds a info message.
	 * 
	 * @param msg
	 *            Message text.
	 */
	public void addInfo(WorkflowComponent ctx, String msg, Object obj, Throwable t, List<Object> additionalData);

	/**
	 * @param ctx
	 * @param msg
	 * @param element
	 * @param featureName
	 * @param t
	 * @param additionalData
	 */
	public void addInfo(final WorkflowComponent ctx, final String msg, final Object element, final String featureName,
			final Throwable t, final List<Object> additionalData);

	/**
	 * Adds an info message
	 * 
	 * @param compnent
	 * @param msg
	 * @param obj
	 */
	public void addInfo(WorkflowComponent compnent, String msg, Object obj);

	/**
	 * Adds a info message.
	 * 
	 * @param msg
	 *            Message text.
	 */
	public void addInfo(WorkflowComponent ctx, String msg);

	/**
	 * @return true if has infos
	 */
	public boolean hasInfos();

	/**
	 * @return all infos in this container
	 */
	public MWEDiagnostic[] getInfos();

	/**
	 * Adds a warn message.
	 * 
	 * @param msg
	 *            Message text.
	 */
	public void addWarning(String msg);

	/**
	 * Adds a warn message.
	 * 
	 * @param msg
	 *            Message text.
	 */
	public void addWarning(String msg, Object obj);

	/**
	 * Adds a warn message.
	 * 
	 * @param msg
	 *            Message text.
	 */
	public void addWarning(WorkflowComponent ctx, String msg, Object obj, Throwable t, List<Object> additionalData);

	/**
	 * @param ctx
	 * @param msg
	 * @param obj
	 * @param featureName
	 * @param t
	 * @param additionalData
	 */
	public void addWarning(WorkflowComponent ctx, String msg, Object obj, String featureName, Throwable t,
			List<Object> additionalData);

	/**
	 * Adds an warn message
	 * 
	 * @param compnent
	 * @param msg
	 * @param obj
	 */
	public void addWarning(WorkflowComponent compnent, String msg, Object obj);

	/**
	 * Adds a warn message.
	 * 
	 * @param msg
	 *            Message text.
	 */
	public void addWarning(WorkflowComponent ctx, String msg);

	/**
	 * @return true if there are warnings
	 */
	public boolean hasWarnings();

	/**
	 * @return all warning in this container
	 */
	public MWEDiagnostic[] getWarnings();

	/**
	 * Adds an error message.
	 * 
	 * @param msg
	 *            Message text.
	 */
	public void addError(String msg);

	/**
	 * Adds an error message.
	 * 
	 * @param msg
	 *            Message text.
	 */
	public void addError(String msg, Object obj);

	/**
	 * Adds an error message.
	 * 
	 * @param msg
	 *            Message text.
	 */
	public void addError(WorkflowComponent ctx, String msg, Object obj, Throwable t, List<Object> additionalData);

	/**
	 * Adds an error message.
	 * 
	 * @param ctx
	 * @param msg
	 * @param obj
	 * @param featureName
	 * @param t
	 * @param additionalData
	 */
	public void addError(WorkflowComponent ctx, String msg, Object obj, String featureName, Throwable t,
			List<Object> additionalData);

	/**
	 * Adds an error message
	 * 
	 * @param compnent
	 * @param msg
	 * @param obj
	 */
	public void addError(WorkflowComponent compnent, String msg, Object obj);

	/**
	 * Adds an error message.
	 * 
	 * @param msg
	 *            Message text.
	 */
	public void addError(WorkflowComponent ctx, String msg);

	/**
	 * @return all errors in this container
	 */
	public MWEDiagnostic[] getErrors();

	/**
	 * @return true if has errors
	 */
	public boolean hasErrors();

	/**
	 * removes all warnings and errors
	 */
	public void clear();

	/**
	 * @return all {@link MWEDiagnostic}s reported here
	 */
	public MWEDiagnostic[] getIssues();

}
