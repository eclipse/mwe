/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.di;

import org.eclipse.emf.mwe.MweFactory;
import org.eclipse.emf.mwe.QualifiedName;

public class MweUtil {
	public static String toString(QualifiedName className) {
		StringBuffer buff = new StringBuffer();
		for (String s : className.getParts()) {
			buff.append(s);
		}
		return buff.toString();
	}
	
	public static QualifiedName toQualifiedName(String value) {
		if (value==null || value.trim().length()==0)
			return null;
		String[] split = value.split("\\.");
		QualifiedName qn = MweFactory.eINSTANCE.createQualifiedName();
		for (int i = 0, x = split.length; i < x; i++) {
			qn.getParts().add(split[i]);
			if (i + 1 < x)
				qn.getParts().add(".");
		}
		return qn;
	}
}
