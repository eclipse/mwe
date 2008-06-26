package org.eclipse.emf.mwe.di.xml;

import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.di.AbstractTests;

public class Xml2MweConverterTest extends AbstractTests {

	public void testSimple() throws Exception {
		final File file =
				fileFromXML("<?xml version=\"1.0\"?><workflow id='foo' foo='stuff'><nested value='x'/></workflow>");
		assertNotNull(file);
		assertWithXtend("2", "value.assignments.size", file);
		System.out.println(invokeWithXtend("value.assignments.feature", file));
		assertWithXtend("1",
				"value.assignments.select(e|e.feature=='nested').size", file);
	}

	public void testStandardWorkflow() {
		final File file =
				fileFromXML("<workflow>"
						+ "<property name='modelFile'/>"
						+ "<property name='targetDir' value='src-gen/'/>"
						+ "<component file='org/example/dsl/parser/Parser.oaw'>"
						+ "<modelFile value='${modelFile}'/>"
						+ "<outputSlot value='theModel'/>"
						+ "</component>"
						+ "<component class='oaw.workflow.common.DirectoryCleaner' directories='${targetDir}'/>"
						+ "<component class='oaw.xpand2.Generator'>"
						+ "<metaModel id='mm' class='org.eclipse.m2t.type.emf.EmfRegistryMetaModel'/>"
						+ "<expand value='org::example::dsl::Main::main FOR theModel'/>"
						+ "<genPath value='${targetDir}'/>" + "</component>"
						+ "</workflow>");
		assertNotNull(file);
		assertWithXtend("3", "value.assignments.size", file);
		System.out.println(invokeWithXtend("value.assignments.feature", file));
		assertWithXtend("3",
				"value.assignments.select(e|e.feature=='component').size",
				file);
	}

	public void testWhiteSpaceHandling() {
		final File file =
				fileFromXML("<workflow>\n"
						+ "     <component file='org/example/dsl/parser/Parser.oaw'>\n"
						+ "     <modelFile value='${modelFile}'/>\n"
						+ "     <outputSlot value='theModel'/>\n"
						+ "     </component>\n" + "</workflow>");
		assertNotNull(file);
		assertWithXtend("1", "value.assignments.size", file);
		System.out.println(invokeWithXtend("value.assignments.feature", file));
	}
}
