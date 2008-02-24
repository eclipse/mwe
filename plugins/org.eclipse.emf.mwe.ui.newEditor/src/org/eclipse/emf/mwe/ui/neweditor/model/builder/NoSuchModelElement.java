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

package org.eclipse.emf.mwe.ui.neweditor.model.builder;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */
public class NoSuchModelElement extends Exception {

    public NoSuchModelElement() {
        super();
    }

    public NoSuchModelElement(final String arg0) {
        super(arg0);
    }

    public NoSuchModelElement(final String arg0, final Throwable arg1) {
        super(arg0, arg1);
    }

    public NoSuchModelElement(final Throwable arg0) {
        super(arg0);
    }
}
