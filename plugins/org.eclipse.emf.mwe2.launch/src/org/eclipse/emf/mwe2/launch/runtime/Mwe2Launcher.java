/*******************************************************************************
 * Copyright (c) 2008,2010 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *******************************************************************************/
package org.eclipse.emf.mwe2.launch.runtime;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.mwe2.language.Mwe2StandaloneSetup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Injector;

public class Mwe2Launcher {
	private static final String PARAM = "p";
	
	private static final Logger logger = LoggerFactory.getLogger(Mwe2Launcher.class);

	public static void main(String[] args) {
		try {
			new Mwe2Launcher().run(args);
		} catch(Throwable throwable) {
			logger.error(throwable.getMessage(), throwable);
			System.exit(1);
		}
	}

	public void run(String[] args) {
		Options options = getOptions();
		final CommandLineParser parser = new DefaultParser();
		CommandLine line = null;
		try {
			line = parser.parse(options, args);
			if (line.getArgs().length == 0)
				throw new ParseException("No module name specified.");
			if (line.getArgs().length > 1)
				throw new ParseException("Only one module name expected. But " + line.getArgs().length
						+ " were passed (" + line.getArgList() + ")");

			String moduleName = line.getArgs()[0];
			Map<String, String> params = new HashMap<String, String>();
			String[] optionValues = line.getOptionValues(PARAM);
			if (optionValues != null) {
				for (String string : optionValues) {
					int index = string.indexOf('=');
					if (index == -1) {
						throw new ParseException("Incorrect parameter syntax '" + string
								+ "'. It should be 'name=value'");
					}
					String name = string.substring(0, index);
					String value = string.substring(index + 1);
					if (params.put(name, value) != null) {
						throw new ParseException("Duplicate parameter '" + name + "'.");
					}
				}
			}
			// check  OperationCanceledException is accessible
			OperationCanceledException.class.getName();
			
			Injector injector = new Mwe2StandaloneSetup().createInjectorAndDoEMFRegistration();
			Mwe2Runner mweRunner = injector.getInstance(Mwe2Runner.class);
			if (moduleName.contains("/")) {
				mweRunner.run(URI.createURI(moduleName), params);
			} else {
				mweRunner.run(moduleName, params);
			}
		} catch(NoClassDefFoundError e) {
			if ("org/eclipse/core/runtime/OperationCanceledException".equals(e.getMessage())){
				System.err.println("Could not load class: org.eclipse.core.runtime.OperationCanceledException");
				System.err.println("Add org.eclipse.equinox.common to the class path.");
			} else {
				throw e;
			}
		} catch (final ParseException exp) {
			final HelpFormatter formatter = new HelpFormatter();
			System.err.println("Parsing arguments failed.  Reason: " + exp.getMessage());
			formatter.printHelp("java " + Mwe2Launcher.class.getName() + " some.mwe2.Module [options]\n", options);
			return;
		}
	}

	public Options getOptions() {
		final Options options = new Options();
		final Option paramOption = Option.builder(PARAM).argName("key=value").desc(
				"external property that is handled as workflow property").hasArgs().build();
		paramOption.setLongOpt("param");
		options.addOption(paramOption);
		return options;
	}
}
