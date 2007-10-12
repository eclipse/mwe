package org.eclipse.emf.mwe.tests.util;

import java.io.File;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.internal.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.utils.Reader;
import org.eclipse.emf.mwe.utils.StandaloneSetup;

public class ReaderTest extends TestCase {
	public void testLoadSimpleModel() throws Exception {
		Reader r = new Reader();
		r.setFirstElementOnly(true);
		r.setModelSlot("x");
		r.setUri("platform:/resource/org.eclipse.emf.mwe.tests/testmodel.xmi");
		new StandaloneSetup().setPlatformUri(new File("..").getAbsolutePath());
		
		WorkflowContext ctx = new WorkflowContextDefaultImpl();
		r.invoke(ctx, new NullProgressMonitor(), new IssuesImpl());
		EObject model1 = (EObject) ctx.get("x");
		assertNotNull(model1);

		r.invoke(ctx, new NullProgressMonitor(), new IssuesImpl());
		EObject model2 = (EObject) ctx.get("x");
		assertNotNull(model2);
		assertTrue(model1.eClass()==model2.eClass());
	}
}
