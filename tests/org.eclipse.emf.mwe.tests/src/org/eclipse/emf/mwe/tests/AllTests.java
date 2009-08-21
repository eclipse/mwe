package org.eclipse.emf.mwe.tests;

import org.eclipse.emf.mwe.core.ant.WorkflowAntTaskTest;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.emf.mwe.core.tests");
		//$JUnit-BEGIN$
		suite.addTestSuite(WorkflowRunnerTest.class);
		suite.addTestSuite(IssuesTest.class);
		suite.addTestSuite(WorkflowAntTaskTest.class);
		//$JUnit-END$
		return suite;
	}

}
