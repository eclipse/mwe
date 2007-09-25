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
package org.eclipse.emf.mwe.core.issues;

import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.mwe.core.WorkflowComponent;

/**
 * Collects information about workflow configuration.
 * 
 * @author Sven Efftinge (http://www.efftinge.de)
 * @author Bernd Kolb
 * 
 */
public interface Issues {

	/**
	 * Adds a {@link Diagnostic}. Only {@link Diagnostic} with a severity of
	 * {@link Diagnostic#INFO}, {@link Diagnostic#WARNING} and
	 * {@link Diagnostic#ERROR} are allowed
	 * 
	 * @param issue
	 */
	public void add(Diagnostic issue);

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
	 * Adds a info message.
	 * 
	 * @param msg
	 *            Message text.
	 */
	public void addInfo(WorkflowComponent ctx, String msg);

	/**
	 * @return
	 */
	public boolean hasInfos();

	/**
	 * @return all infos in this container
	 */
	public Diagnostic[] getInfos();

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
	 * Adds a warn message.
	 * 
	 * @param msg
	 *            Message text.
	 */
	public void addWarning(WorkflowComponent ctx, String msg);

	/**
	 * @return
	 */
	public boolean hasWarnings();

	/**
	 * @return all warning in this container
	 */
	public Diagnostic[] getWarnings();

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
	 * @param msg
	 *            Message text.
	 */
	public void addError(WorkflowComponent ctx, String msg);

	/**
	 * @return all errors in this container
	 */
	public Diagnostic[] getErrors();

	/**
	 * @return
	 */
	public boolean hasErrors();

	/**
	 * removes all warnings and errors
	 */
	public void clear();
	
	/**
	 * @return all {@link Diagnostic}s reported here
	 */
	public Diagnostic[] getIssues();

}
