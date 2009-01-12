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

package org.eclipse.emf.mwe.ui.internal.editor.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.5 $
 */
public final class PackageShortcutResolver {

	private static Map<String, String> dictionary;

	static {
		dictionary = new HashMap<String, String>();
		initDictionary();
	}

	/**
	 * Don't allow instantiation.
	 */
	private PackageShortcutResolver() {
		throw new UnsupportedOperationException();
	}

	public static String resolve(final String name) {
		final int dotPos = name.indexOf('.');
		String resolvedString = name;
		String lookupString;

		if (dotPos >= 0) {
			lookupString = name.substring(0, dotPos);
		} else
			return resolvedString;

		if (dictionary.containsKey(lookupString)) {
			resolvedString =
					dictionary.get(lookupString) + name.substring(dotPos);
		}
		return resolvedString;
	}

	private static void initDictionary() {
		dictionary.put("oaw", "org.openarchitectureware");
		dictionary.put("mwe", "org.eclipse.emf.mwe");
	}
}
