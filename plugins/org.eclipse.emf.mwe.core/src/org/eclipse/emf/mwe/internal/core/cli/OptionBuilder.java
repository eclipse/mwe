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
 * <p>OptionBuilder allows the user to create Options using descriptive
 * methods.</p>
 * <p>Details on the Builder pattern can be found at 
 * <a href="http://c2.com/cgi-bin/wiki?BuilderPattern">http://c2.com/cgi-bin/wiki?BuilderPattern</a>.</p>
 *
 * @author John Keyes ( john at integralsource.com )
 * @since 1.0
 */
public class OptionBuilder {

    /** long option */
    private static String longopt;
    /** option description */
    private static String description;
    /** argument name */
    private static String argName;
    /** is required? */
    private static boolean required;
    /** the number of arguments */
    private static int numberOfArgs = Option.UNINITIALIZED;
    /** option type */
    private static Object type;
    /** option can have an optional argument value */
    private static boolean optionalArg;
    /** value separator for argument value */
    private static char valuesep;

    /** option builder instance */
    private static OptionBuilder instance = new OptionBuilder();

    // private constructor
    private OptionBuilder() {
    }

    /**
     * <p>Resets the member variables to their default values.</p>
     */
    private static void reset() {
        description = null;
        argName = null;
        longopt = null;
        type = null;
        required = false;
        numberOfArgs = Option.UNINITIALIZED;

        // PMM 9/6/02 - these were missing
        optionalArg = false;
        valuesep = (char) 0;
    }

    /**
     * <p>The next Option created will have the following long option value.</p>
     *
     * @param longopt the long option value
     * @return the OptionBuilder instance
     */
    public static OptionBuilder withLongOpt( String longopt ) {
        OptionBuilder.longopt = longopt;
        return instance;
    }

    /**
     * <p>The next Option created will require an argument value.</p>
     *
     * @return the OptionBuilder instance
     */
    public static OptionBuilder hasArg( ) {
    	OptionBuilder.numberOfArgs = 1;
        return instance;
    }

    /**
     * <p>The next Option created will require an argument value if
     * <code>hasArg</code> is true.</p>
     *
     * @param hasArg if true then the Option has an argument value
     * @return the OptionBuilder instance
     */
    public static OptionBuilder hasArg( boolean hasArg ) {
    	OptionBuilder.numberOfArgs = ( hasArg == true ) ? 1 : Option.UNINITIALIZED;
        return instance;
    }

    /**
     * <p>The next Option created will have the specified argument value 
     * name.</p>
     *
     * @param name the name for the argument value
     * @return the OptionBuilder instance
     */
    public static OptionBuilder withArgName( String name ) {
    	OptionBuilder.argName = name;
        return instance;
    }

    /**
     * <p>The next Option created will be required.</p>
     *
     * @return the OptionBuilder instance
     */
    public static OptionBuilder isRequired( ) {
    	OptionBuilder.required = true;
        return instance;
    }

    /**
     * <p>The next Option created uses <code>sep</code> as a means to
     * separate argument values.</p>
     *
     * <b>Example:</b>
     * <pre>
     * Option opt = OptionBuilder.withValueSeparator( ':' )
     *                           .create( 'D' );
     *
     * CommandLine line = parser.parse( args );
     * String propertyName = opt.getValue( 0 );
     * String propertyValue = opt.getValue( 1 );
     * </pre>
     *
     * @return the OptionBuilder instance
     */
    public static OptionBuilder withValueSeparator( char sep ) {
    	OptionBuilder.valuesep = sep;
        return instance;
    }

    /**
     * <p>The next Option created uses '<code>=</code>' as a means to
     * separate argument values.</p>
     *
     * <b>Example:</b>
     * <pre>
     * Option opt = OptionBuilder.withValueSeparator( )
     *                           .create( 'D' );
     *
     * CommandLine line = parser.parse( args );
     * String propertyName = opt.getValue( 0 );
     * String propertyValue = opt.getValue( 1 );
     * </pre>
     *
     * @return the OptionBuilder instance
     */
    public static OptionBuilder withValueSeparator( ) {
    	OptionBuilder.valuesep = '=';
        return instance;
    }

    /**
     * <p>The next Option created will be required if <code>required</code>
     * is true.</p>
     *
     * @param required if true then the Option is required
     * @return the OptionBuilder instance
     */
    public static OptionBuilder isRequired( boolean required ) {
    	OptionBuilder.required = required;
        return instance;
    }

    /**
     * <p>The next Option created can have unlimited argument values.</p>
     *
     * @return the OptionBuilder instance
     */
    public static OptionBuilder hasArgs( ) {
    	OptionBuilder.numberOfArgs = Option.UNLIMITED_VALUES;
        return instance;
    }

    /**
     * <p>The next Option created can have <code>num</code> 
     * argument values.</p>
     *
     * @param num the number of args that the option can have
     * @return the OptionBuilder instance
     */
    public static OptionBuilder hasArgs( int num ) {
    	OptionBuilder.numberOfArgs = num;
        return instance;
    }

    /**
     * <p>The next Option can have an optional argument.</p>
     *
     * @return the OptionBuilder instance
     */
    public static OptionBuilder hasOptionalArg( ) {
    	OptionBuilder.numberOfArgs = 1;
    	OptionBuilder.optionalArg = true;
        return instance;
    }

    /**
     * <p>The next Option can have an unlimited number of
     * optional arguments.</p>
     *
     * @return the OptionBuilder instance
     */
    public static OptionBuilder hasOptionalArgs( ) {
    	OptionBuilder.numberOfArgs = Option.UNLIMITED_VALUES;
    	OptionBuilder.optionalArg = true;
        return instance;
    }

    /**
     * <p>The next Option can have the specified number of 
     * optional arguments.</p>
     *
     * @param numArgs - the maximum number of optional arguments
     * the next Option created can have.
     * @return the OptionBuilder instance
     */
    public static OptionBuilder hasOptionalArgs( int numArgs ) {
    	OptionBuilder.numberOfArgs = numArgs;
    	OptionBuilder.optionalArg = true;
        return instance;
    }

    /**
     * <p>The next Option created will have a value that will be an instance 
     * of <code>type</code>.</p>
     *
     * @param type the type of the Options argument value
     * @return the OptionBuilder instance
     */
    public static OptionBuilder withType( Object type ) {
    	OptionBuilder.type = type;
        return instance;
    }

    /**
     * <p>The next Option created will have the specified description</p>
     *
     * @param description a description of the Option's purpose
     * @return the OptionBuilder instance
     */
    public static OptionBuilder withDescription( String description ) {
    	OptionBuilder.description = description;
        return instance;
    }

    /**
     * <p>Create an Option using the current settings and with 
     * the specified Option <code>char</code>.</p>
     *
     * @param opt the character representation of the Option
     * @return the Option instance
     * @throws IllegalArgumentException if <code>opt</code> is not
     * a valid character.  See Option.
     */
    public static Option create( char opt )
    throws IllegalArgumentException
    {
        return create( String.valueOf( opt ) );
    }

    /**
     * <p>Create an Option using the current settings</p>
     *
     * @return the Option instance
     * @throws IllegalArgumentException if <code>longOpt</code> has
     * not been set.  
     */
    public static Option create() 
    throws IllegalArgumentException
    {
        if( longopt == null ) {
            throw new IllegalArgumentException( "must specify longopt" );
        }

        return create( " " );
    }

    /**
     * <p>Create an Option using the current settings and with 
     * the specified Option <code>char</code>.</p>
     *
     * @param opt the <code>java.lang.String</code> representation 
     * of the Option
     * @return the Option instance
     * @throws IllegalArgumentException if <code>opt</code> is not
     * a valid character.  See Option.
     */
    public static Option create( String opt ) 
    throws IllegalArgumentException
    {
        // create the option
        Option option = new Option( opt, description );

        // set the option properties
        option.setLongOpt( longopt );
        option.setRequired( required );
        option.setOptionalArg( optionalArg );
        option.setArgs( numberOfArgs );
        option.setType( type );
        option.setValueSeparator( valuesep );
        option.setArgName( argName );
        // reset the OptionBuilder properties
        OptionBuilder.reset();

        // return the Option instance
        return option;
    }
}