/*******************************************************************************
 * Copyright (c) 2019 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.tests.formatter;

import org.eclipse.emf.mwe2.language.Mwe2InjectorProvider;
import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.xtext.formatting.INodeModelFormatter;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;

/**
 * @author miklossy - Initial contribution and API
 */
@RunWith(XtextRunner.class)
@InjectWith(Mwe2InjectorProvider.class)
public class Mwe2FormatterTest {

	@Inject
	private ParseHelper<Module> parser;

	@Inject
	private INodeModelFormatter formatter;

	@Test
	public void formatting001() {
		String nl = System.lineSeparator();

		String actual = format("module A Workflow {}");

		String expected = 
				"module A" + nl +
				nl +
				"Workflow {}";
	
		Assert.assertEquals(expected, actual);
	}

	private String format(String unformattedText) {
		Module module;

		try {
			module = parser.parse(unformattedText);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		XtextResource resource = (XtextResource) module.eResource();
		ICompositeNode rootNode = resource.getParseResult().getRootNode();
		return formatter.format(rootNode, 0, unformattedText.length()).getFormattedText();
	}
}
