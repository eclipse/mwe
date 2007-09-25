package org.eclipse.emf.mwe.core.tests;

import java.util.Collections;

import junit.framework.TestCase;

import org.eclipse.emf.mwe.core.WorkflowRunner;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;

public class WorkflowRunnerTest extends TestCase {
	public void testBug155854 () throws Exception {
		WorkflowRunner runner = new WorkflowRunner();
		try {
			boolean result = runner.prepare("invalidfile.oaw", new NullProgressMonitor(), Collections.<String,String>emptyMap());
			assertFalse ("prepare() should indicate an error", result);
		} catch (IllegalArgumentException exc) {
			assertFalse ("Should not get this error as an IllegalArgumentException", exc.getMessage().startsWith("Couldn't load"));
		} 
		
	}
}
