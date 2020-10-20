/*******************************************************************************
 * Copyright (c) 2005 - 2009 committers of openArchitectureWare and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
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
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor2;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderFactory;
import org.eclipse.emf.mwe.internal.core.debug.processing.DebugMonitor;

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
	
	public boolean doRun(String[] progArgs, boolean debugMode, int port) throws Exception {
		WorkflowEngine runner = new WorkflowEngine();
		ProgressMonitor monitor = null;
		if (debugMode) {
			monitor = new DebugMonitor();
			((DebugMonitor) monitor).init(port);
		}

		Map<String, String> params = new HashMap<String, String>();
		return runner.run(progArgs[0], monitor, params, null);
	}

	public boolean doRun(CommandLine line, String[] args) throws Exception {
		WorkflowEngine runner = new WorkflowEngine();
		if (line.hasOption(ENGINE)) {
			try {
				runner = (WorkflowEngine) Class.forName(line.getOptionValue(ENGINE)).getDeclaredConstructor().newInstance();
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
			method.invoke(cmdLineProcessor.getDeclaredConstructor().newInstance(), unprocessedArgs.toArray(new String[0]), params,
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
				monitor = (ProgressMonitor) clazz.getDeclaredConstructor().newInstance();
				if (monitor instanceof ProgressMonitor2) {
					((ProgressMonitor2)monitor).init(monitorOptValues);
				} else if(monitor instanceof DebugMonitor) {
					// this complication is because of an API problem.
					// debug monitor throws an IOException and is not 
					// compatible with ProgressMonitor2 interface.
					((DebugMonitor)monitor).init(monitorOptValues);
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

	protected static CommandLine getCommandLine(String[] args) throws ParseException {
		final Options options = new Options();

		options.addOption(Option.builder(MONITOR)
				.hasArgs()
				.argName("className,moreArgs")
				.desc(
						"the name of a class that implements ProgressMonitor. More arguments can be appended that will be injected to the monitor,"
								+ " if it has a init(String[] args) method.").longOpt("monitorClass")
				.valueSeparator(',').build());

		options.addOption(Option.builder(ANT).longOpt("ant").desc("must be set when using in Ant context")
				.build());

		final Option paramOption = Option.builder(PARAM).argName("key=value")
				.desc("external property that is handled as workflow property").hasArgs().build();
		paramOption.setLongOpt("param");
		options.addOption(paramOption);

		options.addOption(Option.builder(CMDL)
				.hasArgs()
				.argName("className")
				.desc(
						"the name of a class that implements a public method 'public void processCmdLine(String[] cmdLineArgs, Map paramsToUseInWorkflow, WorkflowContext ctx)'.")
				.longOpt("cmdLineProcessor").build());

		final Option runnerOption = Option.builder(ENGINE).argName("className")
				.desc("WorkflowRunnerEngine class").hasArgs().build();
		runnerOption.setLongOpt("engine");
		options.addOption(runnerOption);

		// create the parser
		final CommandLineParser parser = new DefaultParser();
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
	 * @param line
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
