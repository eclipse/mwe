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
 * A class that implements the <code>CommandLineParser</code> interface 
 * can parse a String array according to the {@link Options} specified
 * and return a {@link CommandLine}.
 *
 * @author John Keyes (john at integralsource.com)
 */
public interface CommandLineParser {
    
    /**
     * Parse the arguments according to the specified options.
     *
     * @param options the specified Options
     * @param arguments the command line arguments
     * @return the list of atomic option and value tokens
     * @throws ParseException if there are any problems encountered
     * while parsing the command line tokens.
     */
    public CommandLine parse( Options options, String[] arguments )
    throws ParseException;

    /**
     * Parse the arguments according to the specified options.
     *
     * @param options the specified Options
     * @param arguments the command line arguments
     * @param stopAtNonOption specifies whether to continue parsing the
     * arguments if a non option is encountered.
     * @return the list of atomic option and value tokens
     * @throws ParseException if there are any problems encountered
     * while parsing the command line tokens.
     */
    public CommandLine parse( Options options, String[] arguments, boolean stopAtNonOption )
    throws ParseException;
}