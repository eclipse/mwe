/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.emf.mwe.tests.util;

import java.io.InputStream;
import java.net.URL;

import org.eclipse.emf.mwe.core.resources.ResourceLoader;

/**
 * Dummy implementation of {@link ResourceLoader}.
 * 
 */
public class DummyResourceLoader implements ResourceLoader {
    /** Empty */
    @Override
    public InputStream getResourceAsStream(final String uri) {
        return null;
    }

    /** Empty */
    @Override
    public Class<?> loadClass(final String clazzName) {
        return null;
    }

    @Override
    public URL getResource(final String uri) {
        return null;
    }

}
