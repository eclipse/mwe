/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.emf.mwe.di.xml.conversion;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.w3c.dom.Node;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.3 $
 */

public abstract class AbstractInjectorConverter extends AbstractConverter
		implements IInjector {

	private final EList<EObject> collection;

	protected List<AbstractModule> injectors = new ArrayList<AbstractModule>();

	public AbstractInjectorConverter() {
		this(null);
	}

	public AbstractInjectorConverter(final EList<EObject> collection) {
		this.collection = collection;
		initialize();
	}

	public void addToCollection(final EObject obj) {
		if (collection == null) {
			throw new IllegalStateException("No collection set");
		} else if (obj == null)
			throw new IllegalArgumentException();

		collection.add(obj);
	}

	/**
	 * @see org.eclipse.emf.mwe.di.xml.conversion.IInjector#inject(Node)
	 */
	public void inject(final Node item) {
		for (final AbstractModule c : injectors)
			if (c.isApplicable(item)) {
				final IInjector injector = (IInjector) c;
				injector.inject(item);
			}
	}

	/**
	 * @see org.eclipse.emf.mwe.di.xml.conversion.AbstractConverter#defaultCreatorsOk(int)
	 */
	@Override
	protected boolean defaultCreatorsOk(final int count) {
		return 0 <= count && count <= 1;
	}

	/**
	 * @see org.eclipse.emf.mwe.di.xml.conversion.AbstractConverter#getContainer()
	 */
	@Override
	protected List<? extends AbstractModule> getContainer() {
		return injectors;
	}
}
