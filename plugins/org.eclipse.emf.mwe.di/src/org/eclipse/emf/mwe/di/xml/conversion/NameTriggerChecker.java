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

public class NameTriggerChecker {

	protected final String[] triggers;

	public NameTriggerChecker(final String[] triggers) {
		if (triggers == null) {
			throw new IllegalArgumentException();
		}

		this.triggers = triggers;
	}

	public boolean isTriggered(final Node item) {
		if (item == null)
			return false;

		for (final String t : triggers) {
			if (t.equals(item.getNodeName()))
				return true;
		}
		return false;
	}
}
