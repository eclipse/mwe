/*******************************************************************************
 * Copyright (c) 2008 Bryan Hunt.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bryan Hunt - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.ewm.workflow.runtime;

/**
 * @author bhunt
 *
 */
public class WorkflowRuntimeException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2069105609917754824L;

	/**
	 * 
	 */
	public WorkflowRuntimeException()
	{
	// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public WorkflowRuntimeException(String arg0)
	{
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public WorkflowRuntimeException(Throwable arg0)
	{
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public WorkflowRuntimeException(String arg0, Throwable arg1)
	{
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}
}
