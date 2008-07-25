/*
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */

package org.eclipse.emf.mwe.di.ui.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.1 $
 */

public final class PropertyFileReader {

	private static final String CONTINUATOR = "\\";
	private static final Pattern PROPERTY_PATTERN = Pattern.compile("^\\s*(\\S+)\\s*=\\s*(.*)$");

	/**
	 * Don't allow instantiation.
	 */
	private PropertyFileReader() {
		throw new UnsupportedOperationException();
	}

	public static Map<String, String> parse(final String content) {
		final Map<String, String> map = new HashMap<String, String>();
		if (content != null) {
			final String[] items = itemize(content);
			for (final String i : items) {
				final Matcher m = PROPERTY_PATTERN.matcher(i);
				if (m.find()) {
					final String name = m.group(1);
					final String value = m.group(2);
					map.put(name, value);
				}
			}
		}
		return map;
	}

	private static String[] itemize(final String content) {
		final List<String> items = new ArrayList<String>();
		final String[] line = content.split("\n");
		trim(line);

		String item = "";
		boolean continued = false;
		for (int i = 0; i < line.length; i++) {
			String l = line[i];
			continued = l.endsWith(CONTINUATOR);

			if (continued) {
				l = stripContinuator(l);
			}

			item += l;
			if (!continued || i == line.length - 1) {
				items.add(item);
				item = "";
			}
		}
		return items.toArray(new String[items.size()]);
	}

	private static String stripContinuator(final String l) {
		if (l == null || !l.endsWith(CONTINUATOR))
			return l;

		final String result = l.substring(0, l.length() - 1) + " ";
		return result;
	}

	private static void trim(final String[] line) {
		if (line == null)
			return;

		for (int i = 0; i < line.length; i++) {
			line[i] = line[i].trim();
		}
	}
}
