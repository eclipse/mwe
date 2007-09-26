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
package org.eclipse.emf.mwe.core.ant;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.Java;
import org.eclipse.emf.mwe.core.WorkflowRunner;

/**
 * Ant task that runs the openArchitectureWare Workflow Engine.
 * <p>
 * This task specializes the <tt>Java</tt> task.
 * 
 */
public class WorkflowAntTask extends Java {
    private String file;

    private final List<Parameter> params = new ArrayList<Parameter>();

    public String getFile() {
        return file;
    }

    public void setFile(final String file) {
        this.file = file;
    }

    /**
     * Executes the {@link org.eclipse.emf.mwe.core.WorkflowRunner}.
     */
    @Override
    public void execute() throws BuildException {
        for (final Iterator<Parameter> iter = params.iterator(); iter.hasNext();) {
            final Parameter param = iter.next();
            if (param != null) {
                final String paramString = "-p" + param.getName() + "=" + param.getValue();
                super.createArg().setValue(paramString);
                log("Adding param: " + paramString);
            }
        }
        log("Adding param: " + getFile());
        super.createArg().setValue(getFile());
        log("Adding param: --ant");
        super.createArg().setValue("--ant");
        super.setFailonerror(true);
        super.setClassname(WorkflowRunner.class.getName());
        try {
            super.execute();
        } catch (BuildException ex) {
            if (ex.getCause() != null) {
                ex.getCause().printStackTrace();
            }

            String message = "workflow failed: " + String.valueOf(ex.getMessage());
            // exceptions do not always have a cause; only append if a cause exists 
            if (ex.getCause() != null) {
                message += " cause: " + String.valueOf(ex.getCause().getMessage());
            }
            throw new BuildException(message, ex);
        }
    }

    /**
     * Creates a parameter. Invoked by ant for each
     * <tt>&lt;param name="..." value="..."/&gt;</tt> statement in the Ant
     * file.
     * 
     * @return New {@link Parameter} instance
     */
    public Object createParam() {
        final Parameter param = new Parameter();
        params.add(param);
        return param;
    }

}
