/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.tests.container;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.emf.mwe2.language.tests.Mwe2InjectorProvider;
import org.eclipse.xtext.mwe.ContainersStateFactory;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.resource.containers.DelegatingIAllContainerAdapter;
import org.eclipse.xtext.resource.containers.IAllContainersState;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 */
@RunWith(XtextRunner.class)
@InjectWith(Mwe2InjectorProvider.class)
public class Mwe2ContainerTest {

	@Inject
	private ParseHelper<Module> parseHelper;

	@Inject
	private ContainersStateFactory stateFactory;

	@Inject
	private ValidationTestHelper validator;

	@Test
	public void testFileNotOnClasspath() throws Exception {
		ResourceSet rs = new XtextResourceSet();

		// create first file
		URI target = URI.createURI("platform:/resource/project/target.mwe2");
		parseHelper.parse("module target", target, rs);

		// configure container for this file
		final String CONTAINER = "mycontainer";
		Map<String, Set<URI>> mapped = Map.of(CONTAINER, Set.of(target));
		IAllContainersState containersState = stateFactory.getContainersState(List.of(CONTAINER), mapped);
		rs.eAdapters().add(new DelegatingIAllContainerAdapter(containersState));

		// assume we can link to the first file even though the new file is not contained in any container
		Module module = parseHelper.parse("module source Workflow { component = @target {} }", rs);
		validator.assertNoErrors(module);
	}
}
