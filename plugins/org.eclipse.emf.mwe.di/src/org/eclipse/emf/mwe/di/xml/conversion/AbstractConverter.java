/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.emf.mwe.di.xml.conversion;

import java.util.List;

import org.w3c.dom.Node;

public abstract class AbstractConverter {

	public static final short[] RELEVANT_TYPES =
			{ Node.ATTRIBUTE_NODE, Node.ELEMENT_NODE };

	protected abstract boolean defaultCreatorsOk(final int count);

	protected abstract List<? extends AbstractModule> getContainer();

	protected void initialize() {
		setup();
		if (!isConsistent())
			throw new InconsistentRegistryException();

		setRegistryReference();
	}

	protected abstract void setup();

	private boolean isConsistent() {
		int defaultCreatorCount = 0;
		for (final AbstractModule a : getContainer())
			if (a.isAlwaysApplicable()) {
				defaultCreatorCount++;
			}
		return defaultCreatorsOk(defaultCreatorCount);
	}

	private void setRegistryReference() {
		for (final IApplicable i : getContainer()) {
			if (i instanceof AbstractModule) {
				final AbstractModule c = (AbstractModule) i;
				c.setConverter(this);
			}
		}
	}

}
