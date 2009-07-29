/*******************************************************************************
 * Copyright (c) 2005-2008 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.core.ast.util.converter;

import java.io.File;

public class FileConverter implements Converter<File> {

	public File convert(String s) {
		return new File(s);
	}

}
