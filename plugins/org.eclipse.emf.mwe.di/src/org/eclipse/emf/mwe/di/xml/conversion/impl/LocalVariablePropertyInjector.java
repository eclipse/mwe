/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.xml.conversion.impl;

import org.eclipse.emf.mwe.LocalVariable;
import org.eclipse.emf.mwe.SimpleValue;
import org.eclipse.emf.mwe.di.xml.Xml2MweConverter;
import org.eclipse.emf.mwe.di.xml.conversion.NameAttributeBasedSelector;
import org.w3c.dom.Node;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.4 $
 */

public class LocalVariablePropertyInjector extends
		AbstractElementInjectorModule {

	private static final String[] NAMES = { Xml2MweConverter.PROPERTY };

	private static final String[] ATTRIBUTES =
			{ required(Xml2MweConverter.NAME), Xml2MweConverter.VALUE };

	public LocalVariablePropertyInjector() {
		super();
		selector = new NameAttributeBasedSelector(NAMES, ATTRIBUTES);
	}

	/**
	 * @see org.eclipse.emf.mwe.di.xml.conversion.IInjector#inject(Node)
	 */
	public void inject(final Node item) {
		final LocalVariable var = FACTORY.createLocalVariable();
		final SimpleValue val = FACTORY.createSimpleValue();
		val.setValue(getAttribute(item, Xml2MweConverter.VALUE));
		var.setName(getAttribute(item, Xml2MweConverter.NAME));
		var.setValue(val);
		converter.addToCollection(var);
	}
}
