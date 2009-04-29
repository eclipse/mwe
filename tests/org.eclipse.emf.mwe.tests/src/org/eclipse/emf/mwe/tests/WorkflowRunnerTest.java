package org.eclipse.emf.mwe.tests;

import java.util.Collections;

import junit.framework.TestCase;

import org.eclipse.emf.mwe.core.WorkflowRunner;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;

public class WorkflowRunnerTest extends TestCase {
	public void testBug155854 () throws Exception {
		WorkflowRunner runner = new WorkflowRunner();
		try {
			boolean result = runner.prepare("invalidfile.mwe", new NullProgressMonitor(), Collections.<String,String>emptyMap());
			assertFalse ("prepare() should indicate an error", result);
		} catch (IllegalArgumentException exc) {
			assertFalse ("Should not get this error as an IllegalArgumentException", exc.getMessage().startsWith("Couldn't load"));
		} 
		
	}
	
	public void testSeveralParams() throws Exception {
		try {
			WorkflowRunner.main(new String[]{"test/res/complex/aCompWithSeveralParams.mwe", "-p", "s=hallo", "-p", "i=123"});
		} catch (Exception e) {
			e.printStackTrace();
			fail("no errors expected");
		}

	}

}
