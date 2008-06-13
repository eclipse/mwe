package org.eclipse.emf.mwe.di.xml;

import org.eclipse.emf.mwe.File;
import org.eclipse.emf.mwe.di.AbstractTests;
import org.eclipse.xtext.util.StringInputStream;

public class Xml2MweConverterTest extends AbstractTests {
	
	public void testSimple() throws Exception {
		File file = new Xml2MweConverter().fromXML(new StringInputStream(
				"<?xml version=\"1.0\"?><workflow id='foo' foo='stuff'><nested value='x'/></workflow>"));
		
		assertWithXtend("2", "value.assignments.size", file);
		System.out.println(invokeWithXtend("value.assignments.feature", file));
		assertWithXtend("1", "value.assignments.select(e|e.feature=='nested').size", file);
		
	}
}
