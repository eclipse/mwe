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
 * Allows Options to be created from a single String.
 *
 *
 * @author Henri Yandell (bayard @ generationjava.com)
 * @version $Revision: 1.3 $
 */
public class PatternOptionBuilder {

    /// TODO: These need to break out to OptionType and also to be pluggable.

    /** String class */
    public static final Class STRING_VALUE        = java.lang.String.class;
    /** Object class */
    public static final Class OBJECT_VALUE        = java.lang.Object.class;
    /** Number class */
    public static final Class NUMBER_VALUE        = java.lang.Number.class;
    /** Date class */
    public static final Class DATE_VALUE          = java.util.Date.class;
    /** Class class */
    public static final Class CLASS_VALUE         = java.lang.Class.class;

/// can we do this one?? 
// is meant to check that the file exists, else it errors.
// ie) it's for reading not writing.
    /** FileInputStream class */
    public static final Class EXISTING_FILE_VALUE = java.io.FileInputStream.class;
    /** File class */
    public static final Class FILE_VALUE          = java.io.File.class;
    /** File array class */
    public static final Class FILES_VALUE         = java.io.File[].class;
    /** URL class */
    public static final Class URL_VALUE           = java.net.URL.class;

    /**
     * <p>Retrieve the class that <code>ch</code> represents.</p>
     *
     * @param ch the specified character
     * @return The class that <code>ch</code> represents
     */
    public static Object getValueClass(char ch) {
        if (ch == '@') {
            return PatternOptionBuilder.OBJECT_VALUE;
        } else if (ch == ':') {
            return PatternOptionBuilder.STRING_VALUE;
        } else if (ch == '%') {
            return PatternOptionBuilder.NUMBER_VALUE;
        } else if (ch == '+') {
            return PatternOptionBuilder.CLASS_VALUE;
        } else if (ch == '#') {
            return PatternOptionBuilder.DATE_VALUE;
        } else if (ch == '<') {
            return PatternOptionBuilder.EXISTING_FILE_VALUE;
        } else if (ch == '>') {
            return PatternOptionBuilder.FILE_VALUE;
        } else if (ch == '*') {
            return PatternOptionBuilder.FILES_VALUE;
        } else if (ch == '/') {
            return PatternOptionBuilder.URL_VALUE;
        }
        return null;
    }
 
    /**
     * <p>Returns whether <code>ch</code> is a value code, i.e.
     * whether it represents a class in a pattern.</p>
     * 
     * @param ch the specified character
     * @return true if <code>ch</code> is a value code, otherwise false.
     */
    public static boolean isValueCode(char ch) {
        if( (ch != '@') &&
            (ch != ':') &&
            (ch != '%') &&
            (ch != '+') &&
            (ch != '#') &&
            (ch != '<') &&
            (ch != '>') &&
            (ch != '*') &&
            (ch != '/')
          )
        {
            return false;
        }
        return true;
    }       
 
    /**
     * <p>Returns the {@link Options} instance represented by 
     * <code>pattern</code>.</p>
     *
     * @param pattern the pattern string
     * @return The {@link Options} instance
     */
    @SuppressWarnings("static-access")
	public static Options parsePattern(String pattern) {
        int sz = pattern.length();

        char opt = ' ';
        char ch = ' ';
        boolean required = false;
        Object type = null;

        Options options = new Options();
        
        for(int i=0; i<sz; i++) {
            ch = pattern.charAt(i);

            // a value code comes after an option and specifies 
            // details about it
            if(!isValueCode(ch)) {
                if(opt != ' ') {
                    // we have a previous one to deal with
                    options.addOption( OptionBuilder.hasArg( type != null )
                                                    .isRequired( required )
                                                    .withType( type )
                                                    .create( opt ) );
                    required = false;
                    type = null;
                    opt = ' ';
                }
                opt = ch;
            } else
            if(ch == '!') {
                required = true;
            } else {
                type = getValueClass(ch);
            }
        }

        if(opt != ' ') {
            // we have a final one to deal with
            options.addOption( OptionBuilder.hasArg( type != null )
                                            .isRequired( required )
                                            .withType( type )
                                            .create( opt ) );
        }

        return options;
    }

}
