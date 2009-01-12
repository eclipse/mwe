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

package org.eclipse.emf.mwe.ui.internal.editor.editor;

import org.eclipse.swt.graphics.RGB;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.7 $
 */
public final class WorkflowColorConstants {
	public static final RGB XML_COMMENT = new RGB(128, 0, 0);

	public static final RGB PROC_INSTR = new RGB(200, 20, 200);

	public static final RGB DOCTYPE = new RGB(0, 150, 150);

	public static final RGB STRING = new RGB(0, 128, 0);

	public static final RGB DEFAULT = new RGB(0, 0, 0);

	public static final RGB TAG = new RGB(0, 0, 128);

	public static final RGB ESCAPED_CHAR = new RGB(128, 128, 0);

	public static final RGB CDATA = new RGB(0, 128, 128);

	public static final RGB CDATA_TEXT = new RGB(255, 0, 0);

	/**
	 * Don't allow instantiation.
	 */
	private WorkflowColorConstants() {
		throw new UnsupportedOperationException();
	}
}
