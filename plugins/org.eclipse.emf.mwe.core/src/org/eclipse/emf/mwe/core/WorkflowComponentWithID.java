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
 *     Markus Voelter - initial
 *
 * </copyright>
 */
package org.eclipse.emf.mwe.core;

/**
 * This is a workflow component that has an ID, so that it can be output in the
 * logger.
 * 
 * @author Markus Voelter
 */
public interface WorkflowComponentWithID extends WorkflowComponent {

    public void setId(String id);

    public String getId();
    
    public String getLogMessage();

}
