/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.emf.mwe.internal.core.cli;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.*;

/** <p>Main entry-point into the library.</p>
 *
 * <p>Options represents a collection of {@link Option} objects, which
 * describe the possible options for a command-line.<p>
 *
 * <p>It may flexibly parse long and short options, with or without
 * values.  Additionally, it may parse only a portion of a commandline,
 * allowing for flexible multi-stage parsing.<p>
 *
 * @see org.apache.commons.cli.CommandLine
 *
 * @author bob mcwhirter (bob @ werken.com)
 * @author <a href="mailto:jstrachan@apache.org">James Strachan</a>
 * @version $Revision: 1.2 $
 */
public class Options {

    /** a map of the options with the character key */
    private Map  shortOpts    = new HashMap();

    /** a map of the options with the long key */
    private Map  longOpts     = new HashMap();

    /** a map of the required options */
    private List requiredOpts = new ArrayList();
    
    /** a map of the option groups */
    private Map optionGroups  = new HashMap();

    /** <p>Construct a new Options descriptor</p>
     */
    public Options() {        
    }

    /**
     * <p>Add the specified option group.</p>
     *
     * @param group the OptionGroup that is to be added
     * @return the resulting Options instance
     */
    public Options addOptionGroup( OptionGroup group ) {
        Iterator options = group.getOptions().iterator();

        if( group.isRequired() ) {
            requiredOpts.add( group );
        }

        while( options.hasNext() ) {
            Option option = (Option)options.next();
            // an Option cannot be required if it is in an
            // OptionGroup, either the group is required or
            // nothing is required
            option.setRequired( false );
            addOption( option );

            optionGroups.put( option.getOpt(), group );
        }

        return this;
    }

    /** <p>Add an option that only contains a short-name</p>
     * <p>It may be specified as requiring an argument.</p>
     *
     * @param opt Short single-character name of the option.
     * @param hasArg flag signally if an argument is required after this option
     * @param description Self-documenting description
     * @return the resulting Options instance
     */
    public Options addOption(String opt, boolean hasArg, String description) {
        addOption( opt, null, hasArg, description );
        return this;
    }
    
    /** <p>Add an option that contains a short-name and a long-name</p>
     * <p>It may be specified as requiring an argument.</p>
     *
     * @param opt Short single-character name of the option.
     * @param longOpt Long multi-character name of the option.
     * @param hasArg flag signally if an argument is required after this option
     * @param description Self-documenting description
     * @return the resulting Options instance
     */
    public Options addOption(String opt, String longOpt, boolean hasArg, String description) {
        addOption( new Option( opt, longOpt, hasArg, description ) );        
        return this;
    }

    /**
     * <p>Adds an option instance</p>
     *
     * @param opt the option that is to be added 
     * @return the resulting Options instance
     */
    public Options addOption(Option opt)  {
        String shortOpt = "-" + opt.getOpt();
        
        // add it to the long option list
        if ( opt.hasLongOpt() ) {
            longOpts.put( "--" + opt.getLongOpt(), opt );
        }
        
        // if the option is required add it to the required list
        if ( opt.isRequired() ) {
            requiredOpts.add( shortOpt );
        }

        shortOpts.put( shortOpt, opt );
        
        return this;
    }
    
    /** <p>Retrieve a read-only list of options in this set</p>
     *
     * @return read-only Collection of {@link Option} objects in this descriptor
     */
    public Collection getOptions() {
        List opts = new ArrayList( shortOpts.values() );

        // now look through the long opts to see if there are any Long-opt
        // only options
        Iterator iter = longOpts.values().iterator();
        while (iter.hasNext())
        {
            Object item = iter.next();
            if (!opts.contains(item))
            {
                opts.add(item);
            }
        }
        return Collections.unmodifiableCollection( opts );
    }

    /**
     * <p>Returns the Options for use by the HelpFormatter.</p>
     *
     * @return the List of Options
     */
    List helpOptions() {
        return new ArrayList( shortOpts.values() );
    }

    /** <p>Returns the required options as a 
     * <code>java.util.Collection</code>.</p>
     *
     * @return Collection of required options
     */
    public List getRequiredOptions() {
        return requiredOpts;
    }
    
    /** <p>Retrieve the named {@link Option}</p>
     *
     * @param opt short or long name of the {@link Option}
     * @return the option represented by opt
     */
    public Option getOption( String opt ) {

        Option option = null;

        // short option
        if( opt.length() == 1 ) {
            option = (Option)shortOpts.get( "-" + opt );
        }
        // long option
        else if( opt.startsWith( "--" ) ) {
            option = (Option)longOpts.get( opt );
        }
        // a just-in-case
        else {
            option = (Option)shortOpts.get( opt );
        }

        return (option == null) ? null : (Option)option.clone();
    }

    /** 
     * <p>Returns whether the named {@link Option} is a member
     * of this {@link Options}</p>
     *
     * @param opt short or long name of the {@link Option}
     * @return true if the named {@link Option} is a member
     * of this {@link Options}
     */
    public boolean hasOption( String opt ) {

        // short option
        if( opt.length() == 1 ) {
            return shortOpts.containsKey( "-" + opt );
        }
        // long option
        else if( opt.startsWith( "--" ) ) {
            return longOpts.containsKey( opt );
        }
        // a just-in-case
        else {
            return shortOpts.containsKey( opt );
        }
    }

    /** <p>Returns the OptionGroup the <code>opt</code>
     * belongs to.</p>
     * @param opt the option whose OptionGroup is being queried.
     *
     * @return the OptionGroup if <code>opt</code> is part
     * of an OptionGroup, otherwise return null
     */
    public OptionGroup getOptionGroup( Option opt ) {
        return (OptionGroup)optionGroups.get( opt.getOpt() );
    }
    
    /** <p>Dump state, suitable for debugging.</p>
     *
     * @return Stringified form of this object
     */
    public String toString() {
        StringBuffer buf = new StringBuffer();
        
        buf.append("[ Options: [ short ");
        buf.append( shortOpts.toString() );
        buf.append( " ] [ long " );
        buf.append( longOpts );
        buf.append( " ]");
        
        return buf.toString();
    }
}
