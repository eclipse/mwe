/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.emf.mwe.ui.internal.simpleEditor;

import org.eclipse.jface.text.rules.IWhitespaceDetector;

public class XMLWhitespaceDetector implements IWhitespaceDetector {

    public boolean isWhitespace(final char c) {
        return (c == ' ' || c == '\t' || c == '\n' || c == '\r');
    }
}
