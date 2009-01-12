/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.xml.conversion;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.w3c.dom.Node;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.4 $
 */

public abstract class AbstractCreatorConverter extends AbstractConverter
		implements ICreator {

	protected List<AbstractModule> creators = new ArrayList<AbstractModule>();

	public AbstractCreatorConverter() {
		initialize();
	}

	/**
	 * @see org.eclipse.emf.mwe.di.xml.conversion.ICreator#create(Node)
	 */
	public EObject create(final Node item) {
		for (final AbstractModule c : creators) {
			final AbstractCreatorModule creator = (AbstractCreatorModule) c;
			if (creator.isApplicable(item)) {
				final EObject obj = creator.create(item);
				if (obj != null)
					return obj;
			}
		}
		throw new IllegalStateException("No applicable creator found");
	}

	/**
	 * @see org.eclipse.emf.mwe.di.xml.conversion.AbstractConverter#defaultCreatorsOk(int)
	 */
	@Override
	protected boolean defaultCreatorsOk(final int count) {
		return count == 1;
	}

	/**
	 * @see org.eclipse.emf.mwe.di.xml.conversion.AbstractConverter#getContainer()
	 */
	@Override
	protected List<? extends AbstractModule> getContainer() {
		return creators;
	}
}
