/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.emf.mwe.ui.internal.editor.autoedit.impl.xml;

import org.eclipse.jface.text.IAutoEditStrategy;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.3 $
 */

public abstract class XMLAbstractAutoEditStrategy implements
		IAutoEditStrategy {

	protected static final String END_TAG_PREFIX = "</";

	protected static final String LEAF_TAG_SUFFIX = "/>";

	protected boolean isEndTag(final String fullTag) {
		return fullTag.length() >= 4 && fullTag.startsWith(END_TAG_PREFIX);
	}

	protected boolean isLeafTag(final String fullTag) {
		return fullTag.length() >= 4 && fullTag.endsWith(LEAF_TAG_SUFFIX);
	}

	protected boolean isStartTag(final String fullTag) {
		return !isEndTag(fullTag) && !isLeafTag(fullTag);
	}

	protected boolean isTag(final String fullTag) {
		return fullTag != null && fullTag.length() >= 3
				&& fullTag.charAt(0) == '<'
				&& fullTag.charAt(fullTag.length() - 1) == '>';
	}

	protected String trimTag(final String fullTag) {
		final String bareTag = fullTag.substring(1, fullTag.length() - 1);
		return "<" + bareTag.trim() + ">";
	}

}
