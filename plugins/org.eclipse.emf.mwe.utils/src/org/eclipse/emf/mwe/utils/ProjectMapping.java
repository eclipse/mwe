/*******************************************************************************
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.emf.mwe.utils;

import org.eclipse.emf.mwe2.runtime.Mandatory;

/**
 * @author Holger Schill - Initial contribution and API
 */
public class ProjectMapping {
	private String projectName;

    private String path;

    public String getProjectName() {
        return projectName;
    }

    @Mandatory
    public void setProjectName(final String projectName) {
        this.projectName = projectName;
    }

    public String getPath() {
        return path;
    }

    @Mandatory
    public void setPath(final String path) {
        this.path = path;
    }
}
