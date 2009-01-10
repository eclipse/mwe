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
 * <p>Base for Exceptions thrown during parsing of a command-line.</p>
 *
 * @author bob mcwhirter (bob @ werken.com)
 * @version $Revision: 1.2 $
 */
public class ParseException extends Exception 
{
    
    /** 
     * <p>Construct a new <code>ParseException</code> 
     * with the specified detail message.</p>
     *
     * @param message the detail message
     */
    public ParseException( String message ) {
        super( message );
    }
}
