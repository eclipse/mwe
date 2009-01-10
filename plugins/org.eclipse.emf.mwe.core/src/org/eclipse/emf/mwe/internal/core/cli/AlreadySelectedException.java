/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.core.cli;

/** 
 * <p>Thrown when more than one option in an option group
 * has been provided.</p>
 *
 * @author John Keyes ( john at integralsource.com )
 * @see ParseException
 */
public class AlreadySelectedException extends ParseException {

    /** 
     * <p>Construct a new <code>AlreadySelectedException</code> 
     * with the specified detail message.</p>
     *
     * @param message the detail message
     */
    public AlreadySelectedException( String message ) {
        super( message );
    }
}
