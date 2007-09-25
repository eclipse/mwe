package org.eclipse.emf.mwe.core.tests.lib;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

/**
 * Test for {@link AbstractWorkflowComponent}.
 * @author kthoms
 */
public class AbstractWorkflowComponentTest extends TestCase {
	private AbstractWorkflowComponent comp = new AbstractWorkflowComponent() {

		public void checkConfiguration(Issues issues) {
		}

		public void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		}
	};
	
	private Issues issues;
	
	public void setUp () {
		issues = new IssuesImpl();
	}
	
	public void testCheckRequiredConfigProperty () {
		issues = new IssuesImpl();
		comp.checkRequiredConfigProperty("test", null, issues);
		assertTrue(hasIssue("'test' not specified."));
		
		issues = new IssuesImpl();
		comp.checkRequiredConfigProperty("test", "", issues);
		assertTrue(hasIssue("'test' not specified."));
		
		issues = new IssuesImpl();
		comp.checkRequiredConfigProperty("test", "   	", issues);
		assertTrue(hasIssue("'test' not specified."));
		
		issues = new IssuesImpl();
		comp.checkRequiredConfigProperty("test", "good :-)", issues);
		assertFalse(hasIssue("'test' not specified."));
	}
	
	private boolean hasIssue (String msg) {
		for (Diagnostic issue : issues.getErrors()) {
			if (issue.getMessage().matches(msg)) {
				return true;
			}
		}
		return false;
	}
}
