/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Clemens Kadura - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.emf.mwe.tests.ast.parser;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import org.eclipse.emf.mwe.internal.core.ast.parser.Location;
import org.eclipse.emf.mwe.internal.core.ast.parser.XmlLocationAnalyser;
import org.eclipse.emf.mwe.internal.core.ast.parser.XmlLocationAnalyser.XmlFileEvaluator;
import org.junit.Assert;
import org.junit.Before;

public class XmlLocationAnalyserTest extends Assert {

	private XmlFileEvaluator e;

	// for Test
	private String[] check;

	private int checkPtr = 0;

	@Before
	public void setUp() throws Exception{
		e = new XmlLocationAnalyser().newEvaluator__TEST();
	}
	
	public final void testNameAndText() {
		evaluate("<xxx>", new String[] { "xxx", "" });
		evaluate("<xx?x>", new String[] { "xx?x", "" });
		evaluate("<xxx?>", new String[] { "xxx?", "" });
		evaluate("<xxx xxx>", new String[] { "xxx", " xxx" });
		evaluate("<xxx ?xxx>", new String[] { "xxx", " ?xxx" });
		evaluate("<xxx x?xx>", new String[] { "xxx", " x?xx" });
		evaluate("<xxx xxx?>", new String[] { "xxx", " xxx?" });
		evaluate("< xxx>", new String[] { "xxx", "" });
		evaluate("< xxx xx>", new String[] { "xxx", " xx" });
		evaluate("< xxx xx >", new String[] { "xxx", " xx " });
		evaluate("<xxx> ", new String[] { "xxx", "" });
		evaluate("<xxx> xx", new String[] { "xxx", "" });
	}

	public final void testExtraGtLt() {
		evaluate("<xx <x>", new String[] { "xx", " <x" });
		evaluate("<xx x> >", new String[] { "xx", " x" });
	}
	
	public final void testSlashEnd() {
		evaluate("<xxx/>", new String[] { "xxx", "" });
		evaluate("< x/>", new String[] { "x", "" });
		evaluate("<x x/>", new String[] { "x", " x" });
		evaluate("<x /x/>", new String[] { "x", " /x" });
		evaluate("<x/ /x/>", new String[] { "x", "/ /x" });
	}

	public final void testSlashBegin() {
		evaluate("</x x>", new String[] { "x", " x" });
		evaluate("</x x/>", new String[] { "x", " x" });
		evaluate("</x /x/>", new String[] { "x", " /x" });
		evaluate("</x /x x x=\"aaa\"/>",
				new String[] { "x", " /x x x=\"aaa\"" });
	}

	public final void testMultiTags() {
		evaluate("<xxx><xx>", new String[] { "xxx", "", "xx", "" });
		evaluate("<xxx xx><xx>", new String[] { "xxx", " xx", "xx", "" });
		evaluate("<xxx xx/><xx>", new String[] { "xxx", " xx", "xx", "" });
		evaluate("</xxx xx><xx>", new String[] { "xxx", " xx", "xx", "" });
		evaluate("</xxx xx/><xx>", new String[] { "xxx", " xx", "xx", "" });

		evaluate("<111 22><33 444>", new String[] { "111", " 22", "33", " 444" });
		evaluate("<111 22><33 444/>", new String[] { "111", " 22", "33", " 444" });
		evaluate("<111 22></33 444>", new String[] { "111", " 22", "33", " 444" });
		evaluate("<111 22></33 444/>", new String[] { "111", " 22", "33", " 444" });

		evaluate("<111 22><33 444>", new String[] { "111", " 22", "33", " 444" });
		evaluate("<111 22/><33 444/>", new String[] { "111", " 22", "33", " 444" });
		evaluate("</111 22/></33 444>", new String[] { "111", " 22", "33", " 444" });
		evaluate("</111 22/></33 444/>", new String[] { "111", " 22", "33", " 444" });
}

	public final void testInstruction() {
		evaluate("<?xxx?>", new String[] { });
		evaluate("<?111?><222>", new String[] { "222", "" });
		evaluate("<?11>1?></x x/>", new String[] { "x", " x" });
		evaluate("<?11<1?></x x/>", new String[] { "x", " x" });
		evaluate("<?11?1?></x x/>", new String[] { "x", " x" });
	}

	public final void testComment() {
		evaluate("<!--xxx-->", new String[] { });
		evaluate("<!---->", new String[] { });
		evaluate("<!--xx  x-->", new String[] { });
		evaluate("<!--xx< nn > x-->", new String[] { });
		evaluate("<!--xx--x-->", new String[] { });
		evaluate("<!--111--><222>", new String[] { "222", "" });
		evaluate("<!--11>1--></x x/>", new String[] { "x", " x" });
		evaluate("<!--11<1--></x x/>", new String[] { "x", " x" });
		evaluate("<!--11?1--></x x/>", new String[] { "x", " x" });
		evaluate("<xxx-->", new String[] { "xxx--", "" });
		evaluate("<xxx!-->", new String[] { "xxx!--", "" });
		evaluate("<!--xx><22>", new String[] { });
	}

	public final void testNL() {
		evaluate("<111 22>\n<33 444>", new String[] { "111", " 22", "33", " 444" });
		evaluate("<111 22>\r\n<33 444>", new String[] { "111", " 22", "33", " 444" });
		evaluate("<111 \n22>", new String[] { "111", " \n22" });
		evaluate("<111\n22>", new String[] { "111", "\n22" });
		evaluate("<aaa\r\nbb>\n<!-- -->\n<ccc>", new String[] { "aaa", "\r\nbb", "ccc", "" });
	}
	
	public final void testFindLineTag() {
		String txt = "<111 22=\"aaa\">\n<33/>\n</444>";

		InputStream is = new ByteArrayInputStream(txt.getBytes());
		e.evaluate(is);

		Location loc = e.adapt(new Location(0, 2, "xxx"));
		assertEquals("wrong tag name", "111", txt.substring(loc.getNameStart(), loc.getNameEnd()));
		loc = e.adapt(new Location(1, 2, "xxx"));
		assertEquals("wrong tag name", "111", txt.substring(loc.getNameStart(), loc.getNameEnd()));
		loc = e.adapt(new Location(2, 2, "xxx"));
		assertEquals("wrong tag name", "33", txt.substring(loc.getNameStart(), loc.getNameEnd()));
		loc = e.adapt(new Location(3, 2, "xxx"));
		assertEquals("wrong tag name", "444", txt.substring(loc.getNameStart(), loc.getNameEnd()));
		loc = e.adapt(new Location(20, 2, "xxx"));
		assertEquals("wrong tag name", "444", txt.substring(loc.getNameStart(), loc.getNameEnd()));
	}
	
	public final void testFindColumnTag() {
		String txt = "<111 22=\"aaa\">\n<33/><44/></555>";

		InputStream is = new ByteArrayInputStream(txt.getBytes());
		e.evaluate(is);

		Location loc = e.adapt(new Location(2, -5, "xxx"));
		String result = txt.substring(loc.getNameStart(), loc.getNameEnd());
		assertEquals("wrong tag name", "33", result);
		
		loc = e.adapt(new Location(2, 2, "xxx"));
		result = txt.substring(loc.getNameStart(), loc.getNameEnd());
		assertEquals("wrong tag name", "33", txt.substring(loc.getNameStart(), loc.getNameEnd()));
		
		loc = e.adapt(new Location(2, 5, "xxx"));
		result = txt.substring(loc.getNameStart(), loc.getNameEnd());
		assertEquals("wrong tag name", "33", txt.substring(loc.getNameStart(), loc.getNameEnd()));
		
		loc = e.adapt(new Location(2, 8, "xxx"));
		result = txt.substring(loc.getNameStart(), loc.getNameEnd());
		assertEquals("wrong tag name", "44", txt.substring(loc.getNameStart(), loc.getNameEnd()));
		
		loc = e.adapt(new Location(2, 14, "xxx"));
		result = txt.substring(loc.getNameStart(), loc.getNameEnd());
		assertEquals("wrong tag name", "555", txt.substring(loc.getNameStart(), loc.getNameEnd()));

		loc = e.adapt(new Location(2, 140, "xxx"));
		result = txt.substring(loc.getNameStart(), loc.getNameEnd());
		assertEquals("wrong tag name", "555", txt.substring(loc.getNameStart(), loc.getNameEnd()));
	}
	
	private void evaluate(final String txt, final String[] check) {
		this.check = check;
		checkPtr = 0;

		InputStream is = new ByteArrayInputStream(txt.getBytes());
		e.evaluate(is);
		List<Object[]> results = e.getResult();
		for (int i = 0; i < check.length/2; i++) {
			Object[] result = results.get(i);
			String name = ((String[])result[0])[0];
			String text = ((String[])result[0])[1];
			check(name, text);
		}
		if(results.size() != check.length/2)
			fail("" + results.size() + " results found, but " + check.length/2 + " expected");
	}

	protected void check(String name, String text) {
		String expected = check[checkPtr++];
		assertEquals("wrong name", expected, name);
		expected = check[checkPtr++];
		assertEquals("wrong text", expected, text);
	}
}
