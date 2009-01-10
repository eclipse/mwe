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
 * <p>Thrown when a required option has not been provided.</p>
 *
 * @author John Keyes ( john at integralsource.com )
 * @see ParseException
 */
public class MissingOptionException extends ParseException {
    
    /** 
     * <p>Construct a new <code>MissingSelectedException</code> 
     * with the specified detail message.</p>
     *
     * @param message the detail message
     */
    public MissingOptionException( String message ) {
        super( message );
    }
}
