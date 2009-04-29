/*******************************************************************************
 * Copyright (c) 2005 - 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.core;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.jar.Manifest;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderFactory;
import org.eclipse.emf.mwe.internal.core.Workflow;
import org.eclipse.emf.mwe.internal.core.ast.util.WorkflowFactory;
import org.eclipse.emf.mwe.internal.core.ast.util.converter.Converter;

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

	private WorkflowContextDefaultImpl wfContext = new WorkflowContextDefaultImpl();

	private ProgressMonitor monitor;

	private static final Log logger = LogFactory.getLog(WorkflowRunner.class);

	private Map<String, String> params;

	private Workflow workflow;

	/**
	 * Starts a workflow.
	 * 
	 * @param args
	 *            Program arguments. See class documentation.
	 */
	@SuppressWarnings("static-access")
	public static void main(final String[] args) {
		// workaround for MacOSX classloader issue
		// see https://bugs.eclipse.org/bugs/show_bug.cgi?id=211167
		// if omitted, "Run as oAW workflow" action immediately terminates when
		// SWT libraries are in the classpath
		new Object();
		// end workaround

		// // only for test: to be able to connect remote java debugger right
		// from the beginning
		// // VM args for remote debug: -Xdebug -Xnoagent
		// // -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=8888
		// try {
		// Thread.sleep(5000);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
		// System.out.println("starting");

		final Options options = new Options();

		options
				.addOption(OptionBuilder
						.hasArgs()
						.withArgName("className,moreArgs")
						.withDescription(
								"the name of a class that implements ProgressMonitor. More arguments can be appended that will be injected to the monitor,"
										+ " if it has a init(String[] args) method.")
						.withLongOpt("monitorClass").withValueSeparator(',')
						.create(MONITOR));

		options.addOption(OptionBuilder.withLongOpt("ant").withDescription(
				"must be set when using in Ant context").create(ANT));

		final Option paramOption = OptionBuilder
				.withArgName("key=value")
				.withDescription(
						"external property that is handled as workflow property")
				.hasArgs().create(PARAM);
		paramOption.setLongOpt("param");
		options.addOption(paramOption);

		options
				.addOption(OptionBuilder
						.hasArgs()
						.withArgName("className")
						.withDescription(
								"the name of a class that implements a public method 'public void processCmdLine(String[] cmdLineArgs, Map paramsToUseInWorkflow, WorkflowContext ctx)'.")
						.withLongOpt("cmdLineProcessor").create(CMDL));

		// create the parser
		final CommandLineParser parser = new PosixParser();
		CommandLine line = null;
		try {
			line = parser.parse(options, args);
		} catch (final ParseException exp) {
			System.err.println("Parsing arguments failed.  Reason: "
					+ exp.getMessage());
			wrongCall(options);
			return;
		}

		final WorkflowRunner runner = new WorkflowRunner();
		Map<String, String> params = new HashMap<String, String>();
		String wfFile = null;
		final String[] monitorOptValues = line.getOptionValues(MONITOR);

		if (line.hasOption(CMDL)) {
			try {
				// removed option --cmdLineProcessor
				final List<String> unprocessedArgs = new ArrayList<String>();
				for (int i = 0; i < args.length; i++) {
					final String arg = args[i];
					if (arg.equals("-" + CMDL)
							|| arg.equals("--cmdLineProcessor")) {
						i++; // ignore this and next element
					} else if (arg.equals("-" + MONITOR)
							|| arg.equals("--monitorClass")) {
						// i++; // ignore this and next element
						i = i + monitorOptValues.length;
					} else if (arg.endsWith(".oaw")) {
						if (wfFile != null) {
							System.err.println("Workflowfile already defined!");
							System.exit(1);
						}
						wfFile = arg;
						; // continue the loop (will be handled later)
					} else {
						unprocessedArgs.add(arg);
					}
				}

				final Class<?> cmdLineProcessor = ResourceLoaderFactory
						.createResourceLoader().loadClass(
								line.getOptionValue(CMDL));
				if (cmdLineProcessor == null) {
					System.err.println("cannot find class '"
							+ line.getOptionValue(CMDL)
							+ "' for command line processing.");
					System.exit(1);
				}
				final Method method = cmdLineProcessor.getMethod("processCmdLine",
						String[].class, Map.class, WorkflowContext.class);
				method.invoke(cmdLineProcessor.newInstance(), unprocessedArgs
						.toArray(new String[0]), params, runner.getContext());
			} catch (final Exception e) {
				e.printStackTrace();
				System.exit(1);
			}
		} else {
			params = resolveParams(line.getOptionValues(PARAM));
			wfFile = line.getArgs()[0];
		}

		if ((wfFile == null)
				|| !(wfFile.endsWith(".oaw") || wfFile.endsWith(".mwe"))) {
			wrongCall(options);
		}

		ProgressMonitor monitor = null;

		if (monitorOptValues != null) {
			try {
				final Class<?> clazz = ResourceLoaderFactory
						.createResourceLoader().loadClass(monitorOptValues[0]);
				if (clazz == null) {
					throw new ClassNotFoundException("Didn't find class "
							+ monitorOptValues[0]);
				}
				monitor = (ProgressMonitor) clazz.newInstance();
				final Method method = monitor.getClass().getMethod("init",
						new Class[] { String[].class });
				if (method != null) {
					method.invoke(monitor, new Object[] { monitorOptValues });
				}
			} catch (final Exception e) {
				logger.error(e.getMessage(), e);
				if (line.hasOption(ANT)) {
					System.exit(1);
				}
				return;
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
			runner.logger.error("can't find the workflow file '"
					+ line.getArgs()[0] + "' in the current class path");
			if (line.hasOption(ANT)) {
				System.exit(1);
			}
			return;
		}

		final boolean success = runner.run(wfFile, monitor, params, null);
		if (!success && line.hasOption(ANT)) {
			System.exit(1);
		}

	}

	/**
	 * Convert type line arguments into a hashmap. Each parameter is expected in
	 * format -pkey=value
	 * 
	 * @param args
	 *            Program arguments
	 * @return A map containing all identified parameters
	 */
	private static Map<String, String> resolveParams(final String[] args) {
		final Map<String, String> params = new HashMap<String, String>();
		if (args == null) {
			return params;
		}
		for (final String element : args) {
			final String[] string = element.split("=", 2);
			if (string.length != 2) {
				throw new IllegalArgumentException(
						"wrong param syntax (-pkey=value). was : " + element);
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
	private static void wrongCall(final Options options) {
		final HelpFormatter formatter = new HelpFormatter();
		formatter.printHelp("java " + WorkflowRunner.class.getName()
				+ " some_workflow_file.mwe [options]\nor\njava "
				+ WorkflowRunner.class.getName()
				+ " some_workflow_file.oaw [options]\n", options);
		System.exit(0);
	}

	/**
	 * @param workFlowFile
	 * @param monitor
	 * @param logger
	 * @param params
	 */
	public boolean run(final String workFlowFile,
			final ProgressMonitor theMonitor,
			final Map<String, String> theParams,
			final Map<String, ?> externalSlotContents) {
		final boolean configOK = prepare(workFlowFile, theMonitor, theParams);
		final Issues issues = new IssuesImpl();
		if (configOK) {
			return executeWorkflow(externalSlotContents, issues);
		}
		return false;
	}

	public boolean prepare(final String workFlowFile,
			final ProgressMonitor theMonitor,
			final Map<String, String> theParams) {
		if (workFlowFile == null) {
			throw new NullPointerException("workflowFile is null");
		}

		if (theMonitor == null) {
			monitor = new NullProgressMonitor();
		} else {
			monitor = theMonitor;
		}
		params = theParams;

		logger
				.info("--------------------------------------------------------------------------------------");
		logger.info("EMF Modeling Workflow Engine " + getVersion());
		logger.info("(c) 2005-2009 openarchitectureware.org and contributors");
		logger
				.info("--------------------------------------------------------------------------------------");
		logger.info("running workflow: " + workFlowFile);
		logger.info("");

		if (logger.isDebugEnabled() && !params.isEmpty()) {
			logger.debug("Params:" + params.toString());
		}
		final Issues issues = new IssuesImpl();

		try {
			final WorkflowFactory factory = new WorkflowFactory();

			// see Bug#155854: WorkflowFactory will throw an
			// IllegalArgumentException which indicates
			// a configuration problem.
			// Detect this very special case
			try {
				workflow = factory.parseInitAndCreate(workFlowFile, params,
						getConverters(), issues);
			} catch (final IllegalArgumentException illegalArg) {
				if (illegalArg.getMessage().startsWith("Couldn't load file")) {
					throw new ConfigurationException(illegalArg.getMessage());
				}
				throw illegalArg;
			}
			logIssues(logger, issues);
			if (issues.hasErrors()) {
				logger
						.error("Workflow interrupted because of configuration errors.");
				return false;
			}
			if (workflow != null) {
				workflow.checkConfiguration(issues);
			}
			logIssues(logger, issues);
			if (issues.hasErrors()) {
				logger
						.error("Workflow interrupted because of configuration errors.");
				return false;
			}
		} catch (final ConfigurationException ex) {
			logger.fatal(ex.getMessage(), ex);
			logIssues(logger, issues);
			return false;
		}

		return true;

	}

	/**
	 * This method delivers the Converter implementations currently used to
	 * inject values into the workflow components.
	 * 
	 * @return A map between injection types and converter implementations. Not
	 *         <code>null</code>.
	 */
	@SuppressWarnings("unchecked")
	private Map<Class<?>, Converter> getConverters() {
		Map<Class<?>, Converter> result = getCustomConverters();
		final Map<Class<?>, Converter> defaults = WorkflowFactory
				.getDefaultConverter();
		if (result == null) {
			// go with the default values
			result = defaults;
		} else {
			// add default Converter implementations if we don't have a custom
			// implementation yet
			for (final Map.Entry<Class<?>, Converter> record : defaults.entrySet()) {
				if (!result.containsKey(record.getKey())) {
					result.put(record.getKey(), record.getValue());
				}
			}
		}
		return result;
	}

	/**
	 * Returns a map of custom Converter implementations used for the injection
	 * process. If the result is <code>null</code> the default Converter
	 * implementations are used. It's not necessary to provide custom Converter
	 * implementations for the default types since they will be added if they're
	 * missing (f.e. it might be useful to support lists which are splitted
	 * using other characters than a comma).
	 * 
	 * @return A map of custom Converter implementations. Maybe
	 *         <code>null</code>.
	 */
	@SuppressWarnings("unchecked")
	protected Map<Class<?>, Converter> getCustomConverters() {
		return null;
	}

	public boolean executeWorkflow(final Map<?, ?> externalSlotContents,
			final Issues issues) {
		try {
			wfContext = new WorkflowContextDefaultImpl();
			addExternalSlotContents(externalSlotContents);
			final long time = System.currentTimeMillis();
			monitor.started(workflow, wfContext);
			workflow.invoke(wfContext, monitor, issues);
			monitor.finished(workflow, wfContext);
			final long duration = System.currentTimeMillis() - time;
			logger.info("workflow completed in " + duration + "ms!");
			if (issues.getErrors().length > 0) {
				return false;
			}
			return true;
		} catch (final Exception e) {
			if (e.getClass().getName().indexOf("Interrupt") > -1) {
				logger.error("Workflow interrupted. Reason: " + e.getMessage());
			} else {
				logger.error(e.getMessage(), e);
			}
		} finally {
			logIssues(logger, issues);
		}
		return false;
	}

	private void addExternalSlotContents(final Map<?, ?> slotContents) {
		if (slotContents == null) {
			return;
		}
		for (final Object name : slotContents.keySet()) {
			final String key = (String) name;
			wfContext.set(key, slotContents.get(key));
		}
	}

	private void logIssues(final Log logger, final Issues issues) {
		// log any configuration warning messages
		final Diagnostic[] issueArray = issues.getIssues();
		for (final Diagnostic issue : issueArray) {
			if (issue.getSeverity() == Diagnostic.ERROR) {
				logger.error(issue.toString());
			}
			if (issue.getSeverity() == Diagnostic.WARNING) {
				logger.warn(issue.toString());
			}
			if (issue.getSeverity() == Diagnostic.INFO) {
				logger.info(issue.toString());
			}
		}
	}

	public WorkflowContext getContext() {
		return wfContext;
	}

	/**
	 * Tries to read the exact build version from the Manifest of the
	 * core.workflow plugin. Therefore the Manifest file is located and the
	 * version is read from the attribute 'Bundle-Version'.
	 * 
	 * @return The build version string, format "4.1.1, Build 200609291913"
	 */
	private String getVersion() {

		String version = null;

		// get all META-INF/MANIFEST.MF found in the classpath
		try {
			final Manifest manifest = new Manifest(ResourceLoaderFactory
					.createResourceLoader().getResource("META-INF/MANIFEST.MF")
					.openStream());
			// identify the manifest from core.workflow plugin
			final String bundleName = manifest.getMainAttributes().getValue(
					"Bundle-SymbolicName");
			if (bundleName.startsWith("org.eclipse.emf.mwe.core")) {
				// Read bundle version an split it.
				// Original value : "4.1.1.200609291913"
				// Resulting value : "4.1.1, Build 200609291913"
				version = manifest.getMainAttributes().getValue(
						"Bundle-Version");
				final int lastPoint = version.lastIndexOf('.');
				version = version.substring(0, lastPoint) + ", Build "
						+ version.substring(lastPoint + 1);
				return version;
			}
		} catch (final IOException e) {
			logger
					.debug("Failed to read Manifest file. Unable to retrieve version");
		}
		// build version not detected from manifest, fallback
		// this will only occur in developer's workbench
		return "Development-Snapshot";
	}

}
