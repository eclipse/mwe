package org.eclipse.emf.mwe.tests.lib;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

/**
 * Test for {@link AbstractWorkflowComponent}.
 */
public class AbstractWorkflowComponentTest extends TestCase {
	private final AbstractWorkflowComponent comp = new AbstractWorkflowComponent() {

		public void checkConfiguration(final Issues issues) {
		}

		@Override
		public void invokeInternal(final WorkflowContext ctx, final ProgressMonitor monitor, final Issues issues) {
		}
	};

	private Issues issues;

	@Override
	public void setUp() {
		issues = new IssuesImpl();
	}

	public void testCheckRequiredConfigProperty() {
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

	private boolean hasIssue(final String msg) {
		for (final Diagnostic issue : issues.getErrors()) {
			if (issue.getMessage().matches(msg))
				return true;
		}
		return false;
	}
}
