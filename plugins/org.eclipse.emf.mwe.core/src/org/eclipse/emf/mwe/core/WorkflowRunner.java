/*******************************************************************************
 * Copyright (c) 2005 - 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.core;

import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor2;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderFactory;

/**
 * Main class to run a workflow.
 * <p>
 * Arguments:
 * <ul>
 * <li>Workflow configuration filename.
 * <li>an optional ProgressMonitor
 * <li>optional runtime properties that override those in workflow files
 * </ul>
 * 
 */
public class WorkflowRunner {

	private static final String PARAM = "p";

	private static final String MONITOR = "m";

	private static final String ANT = "a";

	private static final String CMDL = "c";

	private static final String ENGINE = "e";

	/**
	 * Starts a workflow.
	 * 
	 * @param args
	 *            Program arguments. See class documentation.
	 */
	public static void main(final String[] args) throws Exception {
		// workaround for MacOSX classloader issue
		// see https://bugs.eclipse.org/bugs/show_bug.cgi?id=211167
		// if omitted, "Run as MWE workflow" action immediately terminates when
		// SWT libraries are in the classpath
		new Object();
		// end workaround

		CommandLine line = getCommandLine(args);
		boolean success = new WorkflowRunner().doRun(line, args);

		if (!success && line.hasOption(ANT)) {
			System.exit(1);
		}
	}
	
	@Deprecated
	public boolean run(final String workFlowFile, final ProgressMonitor theMonitor,
			final Map<String, String> theParams, final Map<String, ?> externalSlotContents) {
		return new WorkflowEngine().run(workFlowFile, theMonitor, theParams, externalSlotContents);
	}
	
	public boolean doRun(CommandLine line, String[] args) throws Exception {
		WorkflowEngine runner = new WorkflowEngine();
		if (line.hasOption(ENGINE)) {
			try {
				runner = (WorkflowEngine) Class.forName(line.getOptionValue(ENGINE)).newInstance();
			}
			catch (Exception e) {
				throw new RuntimeException(e);
			}
		}

		Map<String, String> params = new HashMap<String, String>();
		String wfFile = null;
		final String[] monitorOptValues = line.getOptionValues(MONITOR);

		if (line.hasOption(CMDL)) {
			// removed option --cmdLineProcessor
			final List<String> unprocessedArgs = new ArrayList<String>();
			for (int i = 0; i < args.length; i++) {
				final String arg = args[i];
				if (arg.equals("-" + CMDL) || arg.equals("--cmdLineProcessor")) {
					i++; // ignore this and next element
				}
				else if (arg.equals("-" + MONITOR) || arg.equals("--monitorClass")) {
					// i++; // ignore this and next element
					i = i + monitorOptValues.length;
				}
				else if (arg.endsWith(".oaw") || arg.endsWith(".mwe")) {
					if (wfFile != null) {
						throw new IllegalStateException("Workflow file already defined as '" + wfFile + "'!");
					}
					wfFile = arg;
					// continue the loop (will be handled later)
				}
				else {
					unprocessedArgs.add(arg);
				}
			}

			final Class<?> cmdLineProcessor = ResourceLoaderFactory.createResourceLoader().loadClass(
					line.getOptionValue(CMDL));
			if (cmdLineProcessor == null) {
				throw new IllegalStateException("cannot find class '" + line.getOptionValue(CMDL)
						+ "' for command line processing.");
			}
			final Method method = cmdLineProcessor.getMethod("processCmdLine", String[].class, Map.class,
					WorkflowContext.class);
			method.invoke(cmdLineProcessor.newInstance(), unprocessedArgs.toArray(new String[0]), params,
					runner.getContext());
		} else {
			params = resolveParams(line.getOptionValues(PARAM));
			wfFile = line.getArgs()[0];
		}

		if ((wfFile == null) || !(wfFile.endsWith(".oaw") || wfFile.endsWith(".mwe"))) {
			wrongCall(line);
			return false;
		}

		ProgressMonitor monitor = null;

		if (monitorOptValues != null) {
				final Class<?> clazz = ResourceLoaderFactory.createResourceLoader().loadClass(monitorOptValues[0]);
				if (clazz == null) {
					throw new ClassNotFoundException("Didn't find class " + monitorOptValues[0]);
				}
				monitor = (ProgressMonitor) clazz.newInstance();
				if (monitor instanceof ProgressMonitor2) {
					((ProgressMonitor2)monitor).init(monitorOptValues);
				}
		}

		// normalize wfFile name so that it can be found in the class path
		// (necessary for debugger source lookup)
		URL wfUrl;
		int index = 0;
		do {
			wfUrl = ResourceLoaderFactory.createResourceLoader().getResource(wfFile);
			if (wfUrl == null) {
				index = wfFile.indexOf('/');
				if (index >= 0) {
					wfFile = wfFile.substring(index + 1);
				}
			}
		} while ((wfUrl == null) && (index >= 0));

		if (wfUrl == null) {
			String msg = "can't find the workflow file '" + line.getArgs()[0] + "' in the current class path";
				throw new IllegalStateException(msg);
		}

		return runner.run(wfFile, monitor, params, null);
	}

	@SuppressWarnings("static-access")
	protected static CommandLine getCommandLine(String[] args) throws ParseException {
		final Options options = new Options();

		options.addOption(OptionBuilder
				.hasArgs()
				.withArgName("className,moreArgs")
				.withDescription(
						"the name of a class that implements ProgressMonitor. More arguments can be appended that will be injected to the monitor,"
								+ " if it has a init(String[] args) method.").withLongOpt("monitorClass")
				.withValueSeparator(',').create(MONITOR));

		options.addOption(OptionBuilder.withLongOpt("ant").withDescription("must be set when using in Ant context")
				.create(ANT));

		final Option paramOption = OptionBuilder.withArgName("key=value")
				.withDescription("external property that is handled as workflow property").hasArgs().create(PARAM);
		paramOption.setLongOpt("param");
		options.addOption(paramOption);

		options.addOption(OptionBuilder
				.hasArgs()
				.withArgName("className")
				.withDescription(
						"the name of a class that implements a public method 'public void processCmdLine(String[] cmdLineArgs, Map paramsToUseInWorkflow, WorkflowContext ctx)'.")
				.withLongOpt("cmdLineProcessor").create(CMDL));

		final Option runnerOption = OptionBuilder.withArgName("className")
				.withDescription("WorkflowRunnerEngine class").hasArgs().create(ENGINE);
		runnerOption.setLongOpt("engine");
		options.addOption(runnerOption);

		// create the parser
		final CommandLineParser parser = new PosixParser();
		CommandLine line = parser.parse(options, args);
		return line;
	}

	/**
	 * Convert type line arguments into a hashmap. Each parameter is expected in format -pkey=value
	 * 
	 * @param args
	 *            Program arguments
	 * @return A map containing all identified parameters
	 */
	protected Map<String, String> resolveParams(final String[] args) {
		final Map<String, String> params = new HashMap<String, String>();
		if (args == null) {
			return params;
		}
		for (final String element : args) {
			final String[] string = element.split("=", 2);
			if (string.length != 2) {
				throw new IllegalArgumentException("wrong param syntax (-pkey=value). was : " + element);
			}
			params.put(string[0], string[1]);
		}
		return params;
	}

	/**
	 * Print usage information and terminate the program.
	 * 
	 * @param options
	 */
	protected void wrongCall(final CommandLine line) {
		Options options = new Options();
		for (Option o : line.getOptions()) 
			options.addOption(o);
		final HelpFormatter formatter = new HelpFormatter();
		formatter.printHelp("java " + WorkflowRunner.class.getName() + " some_workflow_file.mwe [options]\nor\njava "
				+ WorkflowRunner.class.getName() + " some_workflow_file.oaw [options]\n", options);
		System.exit(0);
	}

}
