package org.eclipse.emf.mwe.tests.lib;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent2;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

/**
 * Test for {@link AbstractWorkflowComponent}.
 */
public class AbstractWorkflowComponentTest extends TestCase {
	/**
	 * @author Sven Efftinge - Initial contribution and API
	 *
	 */
	private static final class TestComponent extends AbstractWorkflowComponent2 {
		public boolean invoked = false;

		@Override
		protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
			invoked = true;
		}
	}



	public void testCheckRequiredConfigProperty() {
		IssuesImpl issues = new IssuesImpl();
		AbstractWorkflowComponent comp = new TestComponent();
		comp.checkRequiredConfigProperty("test", null, issues);
		assertTrue(hasIssue(issues,"'test' not specified."));

		issues = new IssuesImpl();
		comp.checkRequiredConfigProperty("test", "", issues);
		assertTrue(hasIssue(issues,"'test' not specified."));

		issues = new IssuesImpl();
		comp.checkRequiredConfigProperty("test", "   	", issues);
		assertTrue(hasIssue(issues,"'test' not specified."));

		issues = new IssuesImpl();
		comp.checkRequiredConfigProperty("test", "good :-)", issues);
		assertFalse(hasIssue(issues,"'test' not specified."));
	}

	private boolean hasIssue(Issues issues, final String msg) {
		for (final Diagnostic issue : issues.getErrors()) {
			if (issue.getMessage().matches(msg))
				return true;
		}
		return false;
	}
	
	public void testSkipOnErrors() throws Exception {
		Issues issues = new IssuesImpl();
		issues.addError("Foo!");
		
		TestComponent testComponent = new TestComponent();
		testComponent.setSkipOnErrors(true);
		testComponent.invoke(new WorkflowContextDefaultImpl(), null, issues);
		assertFalse(testComponent.invoked);

		testComponent.setSkipOnErrors(false);
		testComponent.invoke(new WorkflowContextDefaultImpl(), null, issues);
		assertTrue(testComponent.invoked);
		
		testComponent = new TestComponent();
		testComponent.setSkipOnErrors(true);
		testComponent.invoke(new WorkflowContextDefaultImpl(), null, new IssuesImpl());
		assertTrue(testComponent.invoked);
	}
}
