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
 * <p>Exception thrown during parsing signalling an unrecognized
 * option was seen.<p>
 *
 * @author bob mcwhiter (bob @ werken.com)
 * @version $Revision: 1.2 $
 */
public class UnrecognizedOptionException extends ParseException {
    
    /** 
     * <p>Construct a new <code>UnrecognizedArgumentException</code> 
     * with the specified detail message.</p>
     *
     * @param message the detail message
     */
    public UnrecognizedOptionException( String message ) {
        super( message );
    }
}
