package org.eclipse.emf.mwe.core.ant;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.ant.core.AntRunner;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Test for {@link WorkflowAntTask}.
 * 
 * @author kthoms
 * @see http
 *      ://help.eclipse.org/stable/index.jsp?topic=/org.eclipse.platform.doc.isv/reference/api/org/eclipse/ant/core/
 *      package -summary.html
 */
public class NotReallyAbstractWorkflowAntTaskTest extends Assert{
	/**
	 * FIXME
	 * When adding more then one <tt>param</tt> tag the WorkflowAntTasks will fail with a Usage description. See
	 * https://bugs.eclipse.org/bugs/show_bug.cgi?id=212994
	 */
	@Test @Ignore public void testBug212994() throws Exception {
		AntRunner runner = new AntRunner();
		String resourceClassPath = "test/res/build.xml";
		File f = createTempFileFromClasspathResource(resourceClassPath);
		// Set up the Ant project with test workflow and use of WorkflowAntTask
		runner.setBuildFileLocation(f.getAbsolutePath());

		// WorkflowRunner will fail with System.exit if something would be wrong.
		// This would lead to failing unit test with stacktrace:
		// Caused by: .../org.eclipse.emf.mwe.tests/resources/test/res/build.xml:5: Java returned: 1
		//   at org.apache.tools.ant.taskdefs.Java.execute(Java.java:108)
		//   at org.eclipse.emf.mwe.core.ant.WorkflowAntTask.execute(WorkflowAntTask.java:71)
		runner.run();
		f.delete();
	}

	private File createTempFileFromClasspathResource(String resourceClassPath) throws IOException {
		InputStream istr = getClass().getClassLoader().getResourceAsStream(resourceClassPath);
		File f = File.createTempFile(getClass().getSimpleName(), null);
		FileWriter fileWriter = new FileWriter(f);
		try {
			int i = istr.read();
			while (i != -1) {
				fileWriter.write(i);
				i = istr.read();
			}
		}
		finally {
			fileWriter.close();
			istr.close();
		}
		return f;
	}
}
