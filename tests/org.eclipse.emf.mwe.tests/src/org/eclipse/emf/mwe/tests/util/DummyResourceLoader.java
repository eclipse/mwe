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
    public InputStream getResourceAsStream(final String uri) {
        return null;
    }

    /** Empty */
    public Class<?> loadClass(final String clazzName) {
        return null;
    }

    public URL getResource(final String uri) {
        return null;
    }

}
