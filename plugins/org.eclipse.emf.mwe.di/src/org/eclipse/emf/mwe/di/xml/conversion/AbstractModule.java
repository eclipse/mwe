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

import org.w3c.dom.Node;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.1 $
 */

public abstract class AbstractModule implements IApplicable,
		IRequiredAttribute {

	protected TypeBasedSelector selector;

	private boolean bypassSelector;

	protected static final String required(final String string) {
		if (string == null)
			return null;
		return string + REQUIRED_MARKER;
	}

	public boolean isAlwaysApplicable() {
		return bypassSelector;
	}

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>isApplicable</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.di.xml.conversion.IApplicable#isApplicable(Node)
	 */
	public boolean isApplicable(final Node item) {
		if (bypassSelector)
			return true;

		if (selector == null) {
			throw new IllegalStateException("Selector not initialized");
		}

		return selector.isApplicable(item);
	}

	public boolean isRelevantNode(final Node item) {
		if (item == null)
			return false;

		for (final short type : relevantNodeTypes()) {
			if (type == item.getNodeType())
				return true;
		}
		return false;
	}

	public abstract short[] relevantNodeTypes();

	public abstract void setConverter(AbstractConverter converter);

	protected void alwaysApplicable() {
		bypassSelector = true;
	}

	protected String getAttribute(final Node item, final String attrName) {
		if (item == null || attrName == null)
			return null;

		final Node attr = item.getAttributes().getNamedItem(attrName);
		return attr != null ? attr.getNodeName() : null;
	}
}
