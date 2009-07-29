package org.eclipse.emf.mwe.core.ant;

import org.apache.tools.ant.Main;

import junit.framework.TestCase;

/**
 * This test cannot be executed as plugin test!
 * @author thoms
 *
 */
public class WorkflowAntTaskTest extends TestCase {
	/**
	 * When adding more then one <tt>param</tt> tag the WorkflowAntTasks will fail with a Usage description. 
	 * See https://bugs.eclipse.org/bugs/show_bug.cgi?id=212994
	 */
	public void testBug212994 () {
		Main.start(new String[]{"-f","resources/test/res/build.xml"}, null, WorkflowAntTaskTest.class.getClassLoader());
	}
}
