/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.xml.conversion;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.4 $
 */

public class AttributeTriggerChecker extends NameTriggerChecker implements
		IRequiredAttribute {

	private Integer requiredAttributeCount;

	public AttributeTriggerChecker(final String[] triggers) {
		super(triggers);
	}

	@Override
	public boolean isTriggered(final Node item) {
		if (item == null)
			return false;

		int count = 0;
		for (final String t : triggers) {
			if (hasAttribute(item, stripMarker(t))) {
				count++;
			}
		}
		return count >= requiredAttributes() && count <= triggers.length;
	}

	public int requiredAttributes() {
		if (requiredAttributeCount != null)
			return requiredAttributeCount;

		int count = 0;
		for (final String t : triggers) {
			if (t.endsWith(REQUIRED_MARKER)) {
				count++;
			}
		}

		if (count == 0) {
			count = triggers.length;
		}

		requiredAttributeCount = count;
		return requiredAttributeCount;
	}

	private boolean hasAttribute(final Node item, final String attrName) {
		if (item == null || attrName == null)
			return false;

		final NamedNodeMap attributes = item.getAttributes();
		for (int i = 0; i < attributes.getLength(); i++) {
			final Node attr = attributes.item(i);
			if (attrName.equals(attr.getNodeName()))
				return true;
		}
		return false;
	}

	private String stripMarker(final String string) {
		if (string == null)
			return null;

		return string.endsWith(REQUIRED_MARKER) ? string.substring(0, string
				.length()
				- REQUIRED_MARKER.length()) : string;
	}
}
