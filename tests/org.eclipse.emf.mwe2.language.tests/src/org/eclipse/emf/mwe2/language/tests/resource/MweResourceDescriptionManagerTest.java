/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.tests.resource;

import static org.junit.Assert.*;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.mwe2.language.tests.Mwe2InjectorProvider;
import org.eclipse.emf.mwe2.language.mwe2.Module;
import org.eclipse.emf.mwe2.language.resource.MweResourceDescriptionStrategy;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.common.collect.Lists;
import com.google.inject.Inject;

@RunWith(XtextRunner.class)
@InjectWith(Mwe2InjectorProvider.class)
public class MweResourceDescriptionManagerTest {

	private static final QualifiedName ORG_FOO_BAR = QualifiedName.create("org","foo","Bar");
	private static final QualifiedName ORG_FOO_BAR_ZONK = QualifiedName.create("org","foo","Bar","zonk");

	@Inject
	private IResourceDescription.Manager manager;
	@Inject
	private ParseHelper<Module> parser;

	@Test public void testNoProperties() throws Exception {
		IResourceDescription description = getDescription("");
		List<IEObjectDescription> exported = Lists.newArrayList(description.getExportedObjects());
		assertEquals(1, exported.size());
		IEObjectDescription module = exported.get(0);
		assertEquals(ORG_FOO_BAR, module.getName());
		assertEquals(0, module.getUserDataKeys().length);
	}
	
	@Test public void testMandatoryExplicitString() throws Exception {
		IResourceDescription description = getDescription("var String zonk");
		List<IEObjectDescription> exported = Lists.newArrayList(description.getExportedObjects());
		assertEquals(2, exported.size());
		IEObjectDescription zonk = exported.get(1);
		assertEquals(ORG_FOO_BAR_ZONK, zonk.getName());
		assertEquals(MweResourceDescriptionStrategy.TYPE__STRING, zonk.getUserData(MweResourceDescriptionStrategy.DECLARED_PROPERTY__TYPE));
		assertEquals(MweResourceDescriptionStrategy.MANDATORY_TRUE, zonk.getUserData(MweResourceDescriptionStrategy.DECLARED_PROPERTY__MANDATORY));
	}
	
	@Test public void testMandatoryImplicitString() throws Exception {
		IResourceDescription description = getDescription("var zonk");
		List<IEObjectDescription> exported = Lists.newArrayList(description.getExportedObjects());
		assertEquals(2, exported.size());
		IEObjectDescription zonk = exported.get(1);
		assertEquals(ORG_FOO_BAR_ZONK, zonk.getName());
		assertEquals(MweResourceDescriptionStrategy.TYPE__STRING, zonk.getUserData(MweResourceDescriptionStrategy.DECLARED_PROPERTY__TYPE));
		assertEquals(MweResourceDescriptionStrategy.MANDATORY_TRUE, zonk.getUserData(MweResourceDescriptionStrategy.DECLARED_PROPERTY__MANDATORY));
	}
	
	@Test public void testExplicitString() throws Exception {
		IResourceDescription description = getDescription("var String zonk = ''");
		List<IEObjectDescription> exported = Lists.newArrayList(description.getExportedObjects());
		assertEquals(2, exported.size());
		IEObjectDescription zonk = exported.get(1);
		assertEquals(ORG_FOO_BAR_ZONK, zonk.getName());
		assertEquals(MweResourceDescriptionStrategy.TYPE__STRING, zonk.getUserData(MweResourceDescriptionStrategy.DECLARED_PROPERTY__TYPE));
		assertNull(zonk.getUserData(MweResourceDescriptionStrategy.DECLARED_PROPERTY__MANDATORY));
	}
	
	@Test public void testImplicitString() throws Exception {
		IResourceDescription description = getDescription("var zonk = ''");
		List<IEObjectDescription> exported = Lists.newArrayList(description.getExportedObjects());
		assertEquals(2, exported.size());
		IEObjectDescription zonk = exported.get(1);
		assertEquals(ORG_FOO_BAR_ZONK, zonk.getName());
		assertEquals(MweResourceDescriptionStrategy.TYPE__STRING, zonk.getUserData(MweResourceDescriptionStrategy.DECLARED_PROPERTY__TYPE));
		assertNull(zonk.getUserData(MweResourceDescriptionStrategy.DECLARED_PROPERTY__MANDATORY));
	} 
	
	@Test public void testMandatoryExplicitBoolean() throws Exception {
		IResourceDescription description = getDescription("var boolean zonk");
		List<IEObjectDescription> exported = Lists.newArrayList(description.getExportedObjects());
		assertEquals(2, exported.size());
		IEObjectDescription zonk = exported.get(1);
		assertEquals(ORG_FOO_BAR_ZONK, zonk.getName());
		assertEquals(MweResourceDescriptionStrategy.TYPE__BOOLEAN, zonk.getUserData(MweResourceDescriptionStrategy.DECLARED_PROPERTY__TYPE));
		assertEquals(MweResourceDescriptionStrategy.MANDATORY_TRUE, zonk.getUserData(MweResourceDescriptionStrategy.DECLARED_PROPERTY__MANDATORY));
	}
	
	@Test public void testImplicitBoolean() throws Exception {
		IResourceDescription description = getDescription("var zonk = true");
		List<IEObjectDescription> exported = Lists.newArrayList(description.getExportedObjects());
		assertEquals(2, exported.size());
		IEObjectDescription zonk = exported.get(1);
		assertEquals(ORG_FOO_BAR_ZONK, zonk.getName());
		assertEquals(MweResourceDescriptionStrategy.TYPE__BOOLEAN, zonk.getUserData(MweResourceDescriptionStrategy.DECLARED_PROPERTY__TYPE));
		assertNull(zonk.getUserData(MweResourceDescriptionStrategy.DECLARED_PROPERTY__MANDATORY));
	}
	
	@Test public void testExplicitBoolean() throws Exception {
		IResourceDescription description = getDescription("var boolean zonk = true");
		List<IEObjectDescription> exported = Lists.newArrayList(description.getExportedObjects());
		assertEquals(2, exported.size());
		IEObjectDescription zonk = exported.get(1);
		assertEquals(ORG_FOO_BAR_ZONK, zonk.getName());
		assertEquals(MweResourceDescriptionStrategy.TYPE__BOOLEAN, zonk.getUserData(MweResourceDescriptionStrategy.DECLARED_PROPERTY__TYPE));
		assertNull(zonk.getUserData(MweResourceDescriptionStrategy.DECLARED_PROPERTY__MANDATORY));
	}
	
	@Test public void testImplicitComponent() throws Exception {
		IResourceDescription description = getDescription("var zonk = @ /* comment */ org . foo . Bar {}");
		List<IEObjectDescription> exported = Lists.newArrayList(description.getExportedObjects());
		assertEquals(2, exported.size());
		IEObjectDescription zonk = exported.get(1);
		assertEquals(ORG_FOO_BAR_ZONK, zonk.getName());
		assertEquals("org.foo.Bar", zonk.getUserData(MweResourceDescriptionStrategy.DECLARED_PROPERTY__TYPE));
		assertNull(zonk.getUserData(MweResourceDescriptionStrategy.DECLARED_PROPERTY__MANDATORY));
	}
	
	@Test public void testImplicitClass() throws Exception {
		IResourceDescription description = getDescription("var zonk = java.util.ArrayList {}");
		List<IEObjectDescription> exported = Lists.newArrayList(description.getExportedObjects());
		assertEquals(2, exported.size());
		IEObjectDescription zonk = exported.get(1);
		assertEquals(ORG_FOO_BAR_ZONK, zonk.getName());
		assertEquals("java.util.ArrayList", zonk.getUserData(MweResourceDescriptionStrategy.DECLARED_PROPERTY__TYPE));
		assertNull(zonk.getUserData(MweResourceDescriptionStrategy.DECLARED_PROPERTY__MANDATORY));
	}
	
	@Test public void testExplicitClass() throws Exception {
		IResourceDescription description = getDescription("var java.util.List zonk = java.util. /* comment */ ArrayList {}");
		List<IEObjectDescription> exported = Lists.newArrayList(description.getExportedObjects());
		assertEquals(2, exported.size());
		IEObjectDescription zonk = exported.get(1);
		assertEquals(ORG_FOO_BAR_ZONK, zonk.getName());
		assertEquals("java.util.List", zonk.getUserData(MweResourceDescriptionStrategy.DECLARED_PROPERTY__TYPE));
		assertNull(zonk.getUserData(MweResourceDescriptionStrategy.DECLARED_PROPERTY__MANDATORY));
	}
	
	@Test public void testMandatoryExplicitClass() throws Exception {
		IResourceDescription description = getDescription("var java.util.List zonk");
		List<IEObjectDescription> exported = Lists.newArrayList(description.getExportedObjects());
		assertEquals(2, exported.size());
		IEObjectDescription zonk = exported.get(1);
		assertEquals(ORG_FOO_BAR_ZONK, zonk.getName());
		assertEquals("java.util.List", zonk.getUserData(MweResourceDescriptionStrategy.DECLARED_PROPERTY__TYPE));
		assertEquals(MweResourceDescriptionStrategy.MANDATORY_TRUE, zonk.getUserData(MweResourceDescriptionStrategy.DECLARED_PROPERTY__MANDATORY));
	}
	
	@Test public void testPropertyReference() throws Exception {
		IResourceDescription description = getDescription("var mandatory var zonk = mandatory");
		List<IEObjectDescription> exported = Lists.newArrayList(description.getExportedObjects());
		assertEquals(3, exported.size());
		IEObjectDescription zonk = exported.get(2);
		assertEquals(ORG_FOO_BAR_ZONK, zonk.getName());
		assertEquals("mandatory", zonk.getUserData(MweResourceDescriptionStrategy.DECLARED_PROPERTY__TYPE));
		assertNull(zonk.getUserData(MweResourceDescriptionStrategy.DECLARED_PROPERTY__MANDATORY));
	}
	
	public IResourceDescription getDescription(String properties) throws Exception {
		String model = "module org.foo.Bar\n" + properties + "\nString {}";
		Resource resource = getResourceFromString(model);
		IResourceDescription description = manager.getResourceDescription(resource);
		return description;
	}

	private Resource getResourceFromString(String model) throws Exception {
		return parser.parse(model).eResource();
	}
	
}
