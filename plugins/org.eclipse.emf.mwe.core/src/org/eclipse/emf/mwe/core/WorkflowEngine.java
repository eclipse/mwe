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

import java.net.URL;
import java.util.Map;
import java.util.jar.Manifest;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.internal.core.MWEPlugin;
import org.eclipse.emf.mwe.internal.core.Workflow;
import org.eclipse.emf.mwe.internal.core.ast.util.WorkflowFactory;
import org.eclipse.emf.mwe.internal.core.ast.util.converter.Converter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class WorkflowEngine {

	private WorkflowContextDefaultImpl wfContext = new WorkflowContextDefaultImpl();

	private ProgressMonitor monitor;

	private static final Logger logger = LoggerFactory.getLogger(WorkflowEngine.class);

	private Map<String, String> params;

	private Workflow workflow;

	/**
	 * @param workFlowFile
	 * @param theMonitor
	 * @param externalSlotContents
	 * @param theParams
	 */
	public boolean run(final String workFlowFile, final ProgressMonitor theMonitor,
			final Map<String, String> theParams, final Map<String, ?> externalSlotContents) {
		final boolean configOK = prepare(workFlowFile, theMonitor, theParams);
		final Issues issues = new IssuesImpl();
		if (configOK) {
			return executeWorkflow(externalSlotContents, issues);
		}
		return false;
	}

	public boolean prepare(final String workFlowFile, final ProgressMonitor theMonitor,
			final Map<String, String> theParams) {
		if (workFlowFile == null) {
			throw new NullPointerException("workflowFile is null");
		}

		if (theMonitor == null) {
			monitor = new NullProgressMonitor();
		}
		else {
			monitor = theMonitor;
		}
		params = theParams;

		logger.info("--------------------------------------------------------------------------------------");
		logger.info("EMF Modeling Workflow Engine " + getVersion());
		logger.info("(c) 2005-2009 openarchitectureware.org and contributors");
		logger.info("--------------------------------------------------------------------------------------");
		logger.info("running workflow: " + workFlowFile);
		logger.info("");

		if (logger.isDebugEnabled() && !params.isEmpty()) {
			logger.debug("Params:" + params.toString());
		}
		final Issues issues = new IssuesImpl();

		try {
			final WorkflowFactory factory = getWorkflowFactory();

			// see Bug#155854: WorkflowFactory will throw an
			// IllegalArgumentException which indicates
			// a configuration problem.
			// Detect this very special case
			try {
				workflow = factory.parseInitAndCreate(workFlowFile, params, getConverters(), issues);
			}
			catch (final IllegalArgumentException illegalArg) {
				if (illegalArg.getMessage().startsWith("Couldn't load file")) {
					throw new ConfigurationException(illegalArg.getMessage());
				}
				throw illegalArg;
			}
			logIssues(logger, issues);
			if (issues.hasErrors()) {
				logger.error("Workflow interrupted because of configuration errors.");
				return false;
			}
			if (workflow != null) {
				workflow.checkConfiguration(issues);
			}
			logIssues(logger, issues);
			if (issues.hasErrors()) {
				logger.error("Workflow interrupted because of configuration errors.");
				return false;
			}
		}
		catch (final ConfigurationException ex) {
			logger.error(ex.getMessage(), ex);
			logIssues(logger, issues);
			return false;
		}

		return true;

	}

	/**
	 * Creates a new workflow factory
	 * 
	 */
	protected WorkflowFactory getWorkflowFactory() {
		return new WorkflowFactory();
	}

	/**
	 * This method delivers the Converter implementations currently used to inject values into the workflow components.
	 * 
	 * @return A map between injection types and converter implementations. Not <code>null</code>.
	 */
	private Map<Class<?>, Converter<?>> getConverters() {
		Map<Class<?>, Converter<?>> result = getCustomConverters();
		final Map<Class<?>, Converter<?>> defaults = WorkflowFactory.getDefaultConverter();
		if (result == null) {
			// go with the default values
			result = defaults;
		}
		else {
			// add default Converter implementations if we don't have a custom
			// implementation yet
			for (final Map.Entry<Class<?>, Converter<?>> record : defaults.entrySet()) {
				if (!result.containsKey(record.getKey())) {
					result.put(record.getKey(), record.getValue());
				}
			}
		}
		return result;
	}

	/**
	 * Returns a map of custom Converter implementations used for the injection process. If the result is
	 * <code>null</code> the default Converter implementations are used. It's not necessary to provide custom Converter
	 * implementations for the default types since they will be added if they're missing (f.e. it might be useful to
	 * support lists which are splitted using other characters than a comma).
	 * 
	 * @return A map of custom Converter implementations. Maybe <code>null</code>.
	 */
	protected Map<Class<?>, Converter<?>> getCustomConverters() {
		return null;
	}

	public boolean executeWorkflow(final Map<?, ?> externalSlotContents, final Issues issues) {
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
		}
		catch (final Exception e) {
			if (e.getClass().getName().indexOf("Interrupt") > -1) {
				logger.error("Workflow interrupted. Reason: " + e.getMessage());
			}
			else {
				logger.error(e.getMessage(), e);
			}
		}
		finally {
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

	private void logIssues(final Logger logger, final Issues issues) {
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
	 * Tries to read the exact build version from the Manifest of the core.workflow plugin. Therefore the Manifest file
	 * is located and the version is read from the attribute 'Bundle-Version'.
	 * 
	 * @return The build version string, format "4.1.1, Build 200609291913"
	 */
	private String getVersion() {
		try {
			URL url = new URL(MWEPlugin.INSTANCE.getBaseURL() + "META-INF/MANIFEST.MF");
			final Manifest manifest = new Manifest(url.openStream());
			// Original value : "4.1.1.200609291913"
			// Resulting value : "4.1.1, Build 200609291913"
			String version = manifest.getMainAttributes().getValue("Bundle-Version");
			final int lastPoint = version.lastIndexOf('.');
			return version.substring(0, lastPoint) + ", Build " + version.substring(lastPoint + 1);
		}
		catch (Exception e) {
			logger.warn("Couldn't compute version of mwe.core bundle.", e);
			return "unkown version";
		}
	}

}