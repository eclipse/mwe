package org.eclipse.emf.mwe.tests;

import org.eclipse.emf.mwe.core.WorkflowComponent;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;

import junit.framework.TestCase;

public class IssuesTest extends TestCase {

	private Issues issues;

	@Override
	protected void setUp() throws Exception {
		issues = new IssuesImpl();
	}

	public void testAddErrorWorkflowComponentStringObjectThrowableListOfObject() {
		issues.addError(null, "Test", null, null, null);
		assertEquals(1, issues.getErrors().length);
	}

	public void testAddErrorWorkflowComponentString() {
		issues.addError((WorkflowComponent) null, "Test");
		assertEquals(1, issues.getErrors().length);
	}

	public void testAddErrorStringObject() {
		issues.addError("Test", null);
		assertEquals(1, issues.getErrors().length);
	}

	public void testAddErrorString() {
		issues.addError("Test");
		assertEquals(1, issues.getErrors().length);
	}

	public void testAddWarningWorkflowComponentString() {
		issues.addWarning((WorkflowComponent) null, "Test");
		assertEquals(1, issues.getWarnings().length);
	}

	public void testAddWarningStringObject() {
		issues.addWarning("Test", null);
		assertEquals(1, issues.getWarnings().length);
	}

	public void testAddWarningWorkflowComponentStringObjectThrowableListOfObject() {
		issues.addWarning(null, "Test", null, null, null);
		assertEquals(1, issues.getWarnings().length);
	}

	public void testAddWarningString() {
		issues.addWarning("Test");
		assertEquals(1, issues.getWarnings().length);
	}

	public void testAddInfoWorkflowComponentString() {
		issues.addInfo((WorkflowComponent) null, "Test");
		assertEquals(1, issues.getInfos().length);
	}

	public void testAddInfoStringObject() {
		issues.addInfo("Test", null);
		assertEquals(1, issues.getInfos().length);
	}

	public void testAddInfoWorkflowComponentStringObjectThrowableListOfObject() {
		issues.addInfo(null, "Test", null, null, null);
		assertEquals(1, issues.getInfos().length);
	}

	public void testAddInfoString() {
		issues.addInfo("Test");
		assertEquals(1, issues.getInfos().length);
		assertEquals("Test", issues.getInfos()[0].getMessage());
	}

}
