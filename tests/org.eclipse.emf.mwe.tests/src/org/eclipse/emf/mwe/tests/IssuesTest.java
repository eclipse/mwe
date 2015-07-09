package org.eclipse.emf.mwe.tests;

import org.eclipse.emf.mwe.core.WorkflowComponent;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IssuesTest extends Assert {

	private Issues issues;

	@Before
	public void setUp() throws Exception {
		issues = new IssuesImpl();
	}

	@Test public void testAddErrorWorkflowComponentStringObjectThrowableListOfObject() {
		issues.addError(null, "Test", null, null, null);
		assertEquals(1, issues.getErrors().length);
	}

	@Test public void testAddErrorWorkflowComponentString() {
		issues.addError((WorkflowComponent) null, "Test");
		assertEquals(1, issues.getErrors().length);
	}

	@Test public void testAddErrorStringObject() {
		issues.addError("Test", null);
		assertEquals(1, issues.getErrors().length);
	}

	@Test public void testAddErrorString() {
		issues.addError("Test");
		assertEquals(1, issues.getErrors().length);
	}

	@Test public void testAddWarningWorkflowComponentString() {
		issues.addWarning((WorkflowComponent) null, "Test");
		assertEquals(1, issues.getWarnings().length);
	}

	@Test public void testAddWarningStringObject() {
		issues.addWarning("Test", null);
		assertEquals(1, issues.getWarnings().length);
	}

	@Test public void testAddWarningWorkflowComponentStringObjectThrowableListOfObject() {
		issues.addWarning(null, "Test", null, null, null);
		assertEquals(1, issues.getWarnings().length);
	}

	@Test public void testAddWarningString() {
		issues.addWarning("Test");
		assertEquals(1, issues.getWarnings().length);
	}

	@Test public void testAddInfoWorkflowComponentString() {
		issues.addInfo((WorkflowComponent) null, "Test");
		assertEquals(1, issues.getInfos().length);
	}

	@Test public void testAddInfoStringObject() {
		issues.addInfo("Test", null);
		assertEquals(1, issues.getInfos().length);
	}

	@Test public void testAddInfoWorkflowComponentStringObjectThrowableListOfObject() {
		issues.addInfo(null, "Test", null, null, null);
		assertEquals(1, issues.getInfos().length);
	}

	@Test public void testAddInfoString() {
		issues.addInfo("Test");
		assertEquals(1, issues.getInfos().length);
		assertEquals("Test", issues.getInfos()[0].getMessage());
	}

}
