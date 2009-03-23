/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.emf.mwe.ui.internal.editor.utils;

import java.io.File;
import java.net.URI;

import org.eclipse.core.resources.IFile;

public class FileUtils {

	/**
	 * Converts an <codeIFile</code> object to a <code>File</code> object.
	 * 
	 * @param file
	 *            the <code>IFile</code> object
	 * @return the converted <code>File</code> object
	 */
	public static File convertToFile(IFile file) {
		if (file == null)
			return null;

		URI uri = file.getLocationURI();
		if (uri != null)
			return new File(uri);

		return null;
	}
}
