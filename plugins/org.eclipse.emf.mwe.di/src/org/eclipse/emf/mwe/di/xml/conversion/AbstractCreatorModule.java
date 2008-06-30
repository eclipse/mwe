/*
 * All rights reserved. This program and the accompanying materials
 * Copyright (c) 2008 itemis AG and others.
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.xml.conversion;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.2 $
 */

public abstract class AbstractCreatorModule extends AbstractModule implements
		ICreator {

	protected AbstractCreatorConverter converter;

	/**
	 * @see org.eclipse.emf.mwe.di.xml.conversion.AbstractModule#setConverter(org.eclipse.emf.mwe.di.xml.conversion.AbstractConverter)
	 */
	@Override
	public void setConverter(final AbstractConverter converter) {
		this.converter = (AbstractCreatorConverter) converter;
	}
}
