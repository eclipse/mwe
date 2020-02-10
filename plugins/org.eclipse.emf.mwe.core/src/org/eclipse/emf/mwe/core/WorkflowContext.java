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

package org.eclipse.emf.mwe.core;

/**
 * A WorkflowContext is a container for models and other objects.
 * 
 */
public interface WorkflowContext {
    /** Identifier of the default slot. */
    public final static String DEFAULT_SLOT = "default";

    /**
     * returns the object of the given slot name.
     * 
     * @param slotName
     *            The slot's name.
     * @return The object associated to the specified slot or <tt>null</tt> if
     *         no such slot exists.
     */
    Object get(String slotName);

    /**
     * Sets the passed Model the specified slot. Removes the model currently set
     * to the specified slot.
     * 
     * @param slotName
     *            The slot's name.
     * @param value
     *            object to store in the slot (set <code>null</code> to remove
     *            the slot)
     */
    void set(String slotName, Object value);

    public String[] getSlotNames();

}