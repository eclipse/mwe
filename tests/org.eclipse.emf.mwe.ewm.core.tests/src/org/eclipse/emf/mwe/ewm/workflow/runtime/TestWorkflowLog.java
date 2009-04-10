/*******************************************************************************
 * Copyright (c) 2009 Bryan Hunt.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bryan Hunt - initial API and implementation
 *******************************************************************************/

package org.eclipse.emf.mwe.ewm.workflow.runtime;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

/**
 * @author bhunt
 *
 */
public class TestWorkflowLog
{
	@Before
	public void setUp()
	{
		log = RuntimeFactory.eINSTANCE.createWorkflowLog();
	}
	
	@Test
	public void testErrors()
	{
		log.logError("error");
		assertThat(log.getEntries().size(), is(1));
		assertThat(log.getErrors().size(), is(1));
		assertThat(log.getWarnings().size(), is(0));
		assertThat(log.getInfos().size(), is(0));
		assertThat(log.getDebugs().size(), is(0));
	}
	
	@Test
	public void testWarnings()
	{
		log.setLogLevel(WorkflowLogEntryType.WARNING);
		log.logWarning("warning");
		assertThat(log.getEntries().size(), is(1));
		assertThat(log.getErrors().size(), is(0));
		assertThat(log.getWarnings().size(), is(1));
		assertThat(log.getInfos().size(), is(0));
		assertThat(log.getDebugs().size(), is(0));
	}
	
	@Test
	public void testInfos()
	{
		log.setLogLevel(WorkflowLogEntryType.INFO);
		log.logInfo("info");
		assertThat(log.getEntries().size(), is(1));
		assertThat(log.getErrors().size(), is(0));
		assertThat(log.getWarnings().size(), is(0));
		assertThat(log.getInfos().size(), is(1));
		assertThat(log.getDebugs().size(), is(0));
	}

	@Test
	public void testDebugs()
	{
		log.setLogLevel(WorkflowLogEntryType.DEBUG);
		log.logDebug("debug");
		assertThat(log.getEntries().size(), is(1));
		assertThat(log.getErrors().size(), is(0));
		assertThat(log.getWarnings().size(), is(0));
		assertThat(log.getInfos().size(), is(0));
		assertThat(log.getDebugs().size(), is(1));
	}

	@Test
	public void testAll()
	{
		log.setLogLevel(WorkflowLogEntryType.DEBUG);
		log.logError("error");
		log.logWarning("warning");
		log.logInfo("info");
		log.logDebug("debug");
		assertThat(log.getEntries().size(), is(4));
		assertThat(log.getErrors().size(), is(1));
		assertThat(log.getWarnings().size(), is(1));
		assertThat(log.getInfos().size(), is(1));
		assertThat(log.getDebugs().size(), is(1));
		
		assertThat(((WorkflowLogEntry) log.getEntries().getValue(0)).getType(), is(WorkflowLogEntryType.ERROR));
		assertThat(((WorkflowLogEntry) log.getEntries().getValue(1)).getType(), is(WorkflowLogEntryType.WARNING));
		assertThat(((WorkflowLogEntry) log.getEntries().getValue(2)).getType(), is(WorkflowLogEntryType.INFO));
		assertThat(((WorkflowLogEntry) log.getEntries().getValue(3)).getType(), is(WorkflowLogEntryType.DEBUG));
	}

	private WorkflowLog log;
}
