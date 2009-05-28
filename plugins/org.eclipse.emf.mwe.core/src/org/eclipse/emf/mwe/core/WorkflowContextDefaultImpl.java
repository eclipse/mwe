/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.emf.mwe.core;

import java.util.HashMap;
import java.util.Map;


/**
 * Default {@link WorkflowContext} implementation.
 * 
 * @author Sven Efftinge (http://www.efftinge.de)
 * @since 4.0
 */
public class WorkflowContextDefaultImpl implements WorkflowContext {

    private final Map<String, Object> models = new HashMap<String, Object>();

    /**
     * @see WorkflowContext#get(String)
     */
    public Object get(final String modelName) {
        return models.get(modelName);
    }

    /**
     * @see WorkflowContext#set(String, Object)
     */
    public void set(final String slotName, final Object model) {
        if (slotName == null)
			throw new IllegalArgumentException("slotName must not be null!");
        if (!slotName.matches("[\\w_]+"))
			throw new IllegalArgumentException("slotName '" + slotName + "' contains invalid characters!");
        if (model == null) {
            models.remove(slotName);
        }
        models.put(slotName, model);
    }

    public String[] getSlotNames() {
        return models.keySet().toArray(new String[models.keySet().size()]);
    }
}
