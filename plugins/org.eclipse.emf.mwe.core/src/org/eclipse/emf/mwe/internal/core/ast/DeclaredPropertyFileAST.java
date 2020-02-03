/*******************************************************************************
 * Copyright (c) 2005, 2006 committers of openArchitectureWare and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.core.ast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.mwe.core.resources.ResourceLoader;
import org.eclipse.emf.mwe.internal.core.ast.parser.Location;
import org.eclipse.emf.mwe.internal.core.ast.parser.WorkflowParser;

public class DeclaredPropertyFileAST extends AbstractASTBase {
	private final Log log = LogFactory.getLog(getClass());

	private String file;

	public DeclaredPropertyFileAST(final Location location, final String file) {
		super(location);
		this.file = file;
	}

	public String getFile() {
		return file;
	}

	@Override
	public String toString() {
		return "<" + WorkflowParser.PROPERTY + " file='" + file + "'/>";
	}

	private Properties properties = null;

	public Properties getProperties(final ResourceLoader loader) {
		if (properties == null) {
			final InputStream in = loader.getResourceAsStream(getFile());
			if (in == null)
				return null;
			try {
				properties = new Properties();
				properties.load(in);
				loadPropertyNames(loader.getResourceAsStream(getFile()));

			}
			catch (final IOException e) {
				log.error(e.getMessage(), e);
			}
			finally {
				try {
					in.close();
				}
				catch (final IOException e) {
					log.error(e.getMessage(), e);
				}
			}
		}
		return properties;
	}

	private List<String> propertyNames = null;

	public List<String> getPropertyNames(final ResourceLoader loader) {
		getProperties(loader);
		return propertyNames;
	}

	public void setFile(final String string) {
		file = string;
	}

	private synchronized void loadPropertyNames(final InputStream inStream) throws IOException {
		propertyNames = new ArrayList<String>();
		final BufferedReader in = new BufferedReader(new InputStreamReader(inStream, "8859_1"));
		while (true) {
			final String line = in.readLine();
			if (line == null)
				return;

			if (line.length() > 0) {
				final int sep = line.indexOf('=');
				if (sep != -1) {
					final String key = line.substring(0, sep).trim();
					if (key.length() > 0 && key.indexOf(' ') == -1 && key.indexOf('#') == -1 && key.indexOf('!') == -1) {
						propertyNames.add(key);
					}
				}
			}
		}
	}

}
