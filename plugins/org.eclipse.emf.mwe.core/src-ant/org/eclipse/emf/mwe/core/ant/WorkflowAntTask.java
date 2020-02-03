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

package org.eclipse.emf.mwe.core.ant;

import java.util.ArrayList;
import java.util.List;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.Java;
import org.eclipse.emf.mwe.core.WorkflowRunner;
import org.eclipse.emf.mwe.internal.core.ant.Parameter;

/**
 * Ant task that runs the Model Workflow Engine.
 * <p>
 * This task specializes Ant's <tt>Java</tt> task.
 * 
 * @see <a href="http://ant.apache.org/manual/CoreTasks/java.html">http://ant.apache.org/manual/CoreTasks/java.html</a>
 */
public class WorkflowAntTask extends Java {

	private String file;

	private final List<Parameter> params = new ArrayList<Parameter>();

	/**
	 * Property getter.
	 */
	public String getFile() {
		return file;
	}

	/**
	 * Sets the workflow file to execute.
	 * 
	 * @param file
	 *            Path of the workflow file.
	 */
	public void setFile(final String file) {
		this.file = file;
	}

	/**
	 * Executes the {@link org.eclipse.emf.mwe.core.WorkflowRunner}.
	 */
	@Override
	public void execute() throws BuildException {
		log("Adding param: " + getFile());
		super.createArg().setValue(getFile());
		for (Parameter param : params) {
			if (param != null) {
				final String paramString = "-p" + param.getName() + "=" + param.getValue();
				super.createArg().setValue(paramString);
				log("Adding param: " + paramString);
			}
		}
		log("Adding param: --ant");
		super.createArg().setValue("--ant");
		super.setFailonerror(true);
		super.setClassname(WorkflowRunner.class.getName());
		try {
			super.execute();
		}
		catch (BuildException ex) {
			if (ex.getCause() != null) {
				ex.getCause().printStackTrace();
			}

			String message = "workflow failed: " + String.valueOf(ex.getMessage());
			// exceptions do not always have a cause; only append if a cause
			// exists
			if (ex.getCause() != null) {
				message += " cause: " + String.valueOf(ex.getCause().getMessage());
			}
			throw new BuildException(message, ex);
		}
	}

	/**
	 * Creates a parameter. Invoked by ant for each
	 * <tt>&lt;param name="..." value="..."/&gt;</tt> statement in the Ant file.
	 * 
	 * @return New {@link Parameter} instance
	 */
	public Object createParam() {
		final Parameter param = new Parameter();
		params.add(param);
		return param;
	}

}
