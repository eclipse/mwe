/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.emf.mwe.ui.internal.editor.editor;

import org.eclipse.jface.text.rules.IWhitespaceDetector;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.4 $
 */
public class WorkflowWhitespaceDetector implements IWhitespaceDetector {

	public boolean isWhitespace(final char c) {
		return (c == ' ' || c == '\t' || c == '\n' || c == '\r');
	}
}
