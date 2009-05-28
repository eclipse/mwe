/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Clemens Kadura (zAJKa) - Initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.ui.debug.sourcelookup;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant;
import org.eclipse.emf.mwe.internal.ui.debug.model.DebugStackFrame;

/**
 * The source lookup participant knows how to translate a stack frame into a source file name
 */
public class MWESourceLookupParticipant extends AbstractSourceLookupParticipant {

	public String getSourceName(final Object object) throws CoreException {
		if (object instanceof DebugStackFrame) {
			return ((DebugStackFrame) object).getResource();
		}
		return null;
	}
}
