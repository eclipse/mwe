/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.xml.conversion.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.di.xml.conversion.AbstractInjectorConverter;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.4 $
 */

public class PropertyConverter extends AbstractInjectorConverter {

	public PropertyConverter() {
		super();
	}

	public PropertyConverter(final EList<EObject> collection) {
		super(collection);
	}

	/**
	 * @see org.eclipse.emf.mwe.di.xml.conversion.AbstractConverter#setup()
	 */
	@Override
	protected void setup() {
		injectors.add(new LocalVariablePropertyInjector());
		injectors.add(new PropertyFileImportInjector());
		injectors.add(new DefaultPropertyInjector());
	}
}
