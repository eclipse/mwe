package org.eclipse.emf.mwe.tests;

import java.util.Collections;

import org.eclipse.emf.mwe.core.WorkflowEngine;
import org.eclipse.emf.mwe.core.WorkflowRunner;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.junit.Assert;
import org.junit.Test;

public class WorkflowRunnerTest extends Assert {
	@Test public void testBug155854 () throws Exception {
		WorkflowEngine runner = new WorkflowEngine();
		try {
			boolean result = runner.prepare("invalidfile.mwe", new NullProgressMonitor(), Collections.<String,String>emptyMap());
			assertFalse ("prepare() should indicate an error", result);
		} catch (IllegalArgumentException exc) {
			assertFalse ("Should not get this error as an IllegalArgumentException", exc.getMessage().startsWith("Couldn't load"));
		} 
		
	}
	
	@Test public void testSeveralParams() throws Exception {
		try {
			WorkflowRunner.main(new String[]{"test/res/complex/aCompWithSeveralParams.mwe", "-p", "s=hallo", "-p", "i=123"});
		} catch (Exception e) {
			e.printStackTrace();
			fail("no errors expected");
		}

	}

}
