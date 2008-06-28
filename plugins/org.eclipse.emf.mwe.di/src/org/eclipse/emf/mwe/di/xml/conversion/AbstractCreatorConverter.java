/*
 * Copyright (c) 2008 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    committers of openArchitectureWare - initial API and implementation
 */

package org.eclipse.emf.mwe.di.xml.conversion;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.w3c.dom.Node;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.1 $
 */

public abstract class AbstractCreatorConverter extends AbstractConverter
		implements ICreator {

	protected List<AbstractModule> creators = new ArrayList<AbstractModule>();

	public AbstractCreatorConverter() {
		initialize();
	}

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>createValue</code> inherited from the superclass.
	 * 
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
	 * This automatically generated method overrides the implementation of
	 * <code>defaultCreatorsOk</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.di.xml.conversion.AbstractConverter#defaultCreatorsOk(int)
	 */
	@Override
	protected boolean defaultCreatorsOk(final int count) {
		return count == 1;
	}

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>getContainer</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.di.xml.conversion.AbstractConverter#getContainer()
	 */
	@Override
	protected List<? extends AbstractModule> getContainer() {
		return creators;
	}

}
