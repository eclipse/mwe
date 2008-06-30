/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.xml.conversion;

import org.w3c.dom.Node;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.2 $
 */

public class NameAttributeBasedSelector extends NameBasedSelector {

	protected AttributeTriggerChecker attributeChecker;

	public NameAttributeBasedSelector(final String[] triggerNames,
			final String[] triggerAttributes) {
		super(triggerNames);
		if (triggerAttributes == null) {
			throw new IllegalArgumentException();
		}

		attributeChecker = new AttributeTriggerChecker(triggerAttributes);
	}

	@Override
	public boolean isApplicable(final Node item) {
		return super.isApplicable(item) && attributeChecker.isTriggered(item);
	}
}
