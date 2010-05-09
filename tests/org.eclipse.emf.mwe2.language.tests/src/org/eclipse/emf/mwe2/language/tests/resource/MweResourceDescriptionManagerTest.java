/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.tests.resource;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.mwe2.language.resource.MweResourceDescription;
import org.eclipse.emf.mwe2.language.tests.TestSetup;
import org.eclipse.xtext.junit.AbstractXtextTests;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;

import com.google.common.collect.Lists;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class MweResourceDescriptionManagerTest extends AbstractXtextTests {

	private IResourceDescription.Manager manager;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		with(TestSetup.class);
		manager = get(IResourceDescription.Manager.class);
	}
	
	public void testNoProperties() throws Exception {
		IResourceDescription description = getDescription("");
		List<IEObjectDescription> exported = Lists.newArrayList(description.getExportedObjects());
		assertEquals(1, exported.size());
		IEObjectDescription module = exported.get(0);
		assertEquals("org.foo.Bar", module.getName());
		assertEquals(0, module.getUserDataKeys().length);
	}
	
	public void testMandatoryExplicitString() throws Exception {
		IResourceDescription description = getDescription("var String zonk");
		List<IEObjectDescription> exported = Lists.newArrayList(description.getExportedObjects());
		assertEquals(2, exported.size());
		IEObjectDescription zonk = exported.get(1);
		assertEquals("org.foo.Bar.zonk", zonk.getName());
		assertEquals(MweResourceDescription.TYPE__STRING, zonk.getUserData(MweResourceDescription.DECLARED_PROPERTY__TYPE));
		assertEquals(MweResourceDescription.MANDATORY_TRUE, zonk.getUserData(MweResourceDescription.DECLARED_PROPERTY__MANDATORY));
	}
	
	public void testMandatoryImplicitString() throws Exception {
		IResourceDescription description = getDescription("var zonk");
		List<IEObjectDescription> exported = Lists.newArrayList(description.getExportedObjects());
		assertEquals(2, exported.size());
		IEObjectDescription zonk = exported.get(1);
		assertEquals("org.foo.Bar.zonk", zonk.getName());
		assertEquals(MweResourceDescription.TYPE__STRING, zonk.getUserData(MweResourceDescription.DECLARED_PROPERTY__TYPE));
		assertEquals(MweResourceDescription.MANDATORY_TRUE, zonk.getUserData(MweResourceDescription.DECLARED_PROPERTY__MANDATORY));
	}
	
	public void testExplicitString() throws Exception {
		IResourceDescription description = getDescription("var String zonk = ''");
		List<IEObjectDescription> exported = Lists.newArrayList(description.getExportedObjects());
		assertEquals(2, exported.size());
		IEObjectDescription zonk = exported.get(1);
		assertEquals("org.foo.Bar.zonk", zonk.getName());
		assertEquals(MweResourceDescription.TYPE__STRING, zonk.getUserData(MweResourceDescription.DECLARED_PROPERTY__TYPE));
		assertNull(zonk.getUserData(MweResourceDescription.DECLARED_PROPERTY__MANDATORY));
	}
	
	public void testImplicitString() throws Exception {
		IResourceDescription description = getDescription("var zonk = ''");
		List<IEObjectDescription> exported = Lists.newArrayList(description.getExportedObjects());
		assertEquals(2, exported.size());
		IEObjectDescription zonk = exported.get(1);
		assertEquals("org.foo.Bar.zonk", zonk.getName());
		assertEquals(MweResourceDescription.TYPE__STRING, zonk.getUserData(MweResourceDescription.DECLARED_PROPERTY__TYPE));
		assertNull(zonk.getUserData(MweResourceDescription.DECLARED_PROPERTY__MANDATORY));
	} 
	
	public void testMandatoryExplicitBoolean() throws Exception {
		IResourceDescription description = getDescription("var boolean zonk");
		List<IEObjectDescription> exported = Lists.newArrayList(description.getExportedObjects());
		assertEquals(2, exported.size());
		IEObjectDescription zonk = exported.get(1);
		assertEquals("org.foo.Bar.zonk", zonk.getName());
		assertEquals(MweResourceDescription.TYPE__BOOLEAN, zonk.getUserData(MweResourceDescription.DECLARED_PROPERTY__TYPE));
		assertEquals(MweResourceDescription.MANDATORY_TRUE, zonk.getUserData(MweResourceDescription.DECLARED_PROPERTY__MANDATORY));
	}
	
	public void testImplicitBoolean() throws Exception {
		IResourceDescription description = getDescription("var zonk = true");
		List<IEObjectDescription> exported = Lists.newArrayList(description.getExportedObjects());
		assertEquals(2, exported.size());
		IEObjectDescription zonk = exported.get(1);
		assertEquals("org.foo.Bar.zonk", zonk.getName());
		assertEquals(MweResourceDescription.TYPE__BOOLEAN, zonk.getUserData(MweResourceDescription.DECLARED_PROPERTY__TYPE));
		assertNull(zonk.getUserData(MweResourceDescription.DECLARED_PROPERTY__MANDATORY));
	}
	
	public void testExplicitBoolean() throws Exception {
		IResourceDescription description = getDescription("var boolean zonk = true");
		List<IEObjectDescription> exported = Lists.newArrayList(description.getExportedObjects());
		assertEquals(2, exported.size());
		IEObjectDescription zonk = exported.get(1);
		assertEquals("org.foo.Bar.zonk", zonk.getName());
		assertEquals(MweResourceDescription.TYPE__BOOLEAN, zonk.getUserData(MweResourceDescription.DECLARED_PROPERTY__TYPE));
		assertNull(zonk.getUserData(MweResourceDescription.DECLARED_PROPERTY__MANDATORY));
	}
	
	public void testImplicitComponent() throws Exception {
		IResourceDescription description = getDescription("var zonk = @ /* comment */ org . foo . Bar {}");
		List<IEObjectDescription> exported = Lists.newArrayList(description.getExportedObjects());
		assertEquals(2, exported.size());
		IEObjectDescription zonk = exported.get(1);
		assertEquals("org.foo.Bar.zonk", zonk.getName());
		assertEquals("org.foo.Bar", zonk.getUserData(MweResourceDescription.DECLARED_PROPERTY__TYPE));
		assertNull(zonk.getUserData(MweResourceDescription.DECLARED_PROPERTY__MANDATORY));
	}
	
	public void testImplicitClass() throws Exception {
		IResourceDescription description = getDescription("var zonk = java.util.ArrayList {}");
		List<IEObjectDescription> exported = Lists.newArrayList(description.getExportedObjects());
		assertEquals(2, exported.size());
		IEObjectDescription zonk = exported.get(1);
		assertEquals("org.foo.Bar.zonk", zonk.getName());
		assertEquals("java.util.ArrayList", zonk.getUserData(MweResourceDescription.DECLARED_PROPERTY__TYPE));
		assertNull(zonk.getUserData(MweResourceDescription.DECLARED_PROPERTY__MANDATORY));
	}
	
	public void testExplicitClass() throws Exception {
		IResourceDescription description = getDescription("var java.util.List zonk = java.util. /* comment */ ArrayList {}");
		List<IEObjectDescription> exported = Lists.newArrayList(description.getExportedObjects());
		assertEquals(2, exported.size());
		IEObjectDescription zonk = exported.get(1);
		assertEquals("org.foo.Bar.zonk", zonk.getName());
		assertEquals("java.util.List", zonk.getUserData(MweResourceDescription.DECLARED_PROPERTY__TYPE));
		assertNull(zonk.getUserData(MweResourceDescription.DECLARED_PROPERTY__MANDATORY));
	}
	
	public void testMandatoryExplicitClass() throws Exception {
		IResourceDescription description = getDescription("var java.util.List zonk");
		List<IEObjectDescription> exported = Lists.newArrayList(description.getExportedObjects());
		assertEquals(2, exported.size());
		IEObjectDescription zonk = exported.get(1);
		assertEquals("org.foo.Bar.zonk", zonk.getName());
		assertEquals("java.util.List", zonk.getUserData(MweResourceDescription.DECLARED_PROPERTY__TYPE));
		assertEquals(MweResourceDescription.MANDATORY_TRUE, zonk.getUserData(MweResourceDescription.DECLARED_PROPERTY__MANDATORY));
	}
	
	public void testPropertyReference() throws Exception {
		IResourceDescription description = getDescription("var mandatory var zonk = mandatory");
		List<IEObjectDescription> exported = Lists.newArrayList(description.getExportedObjects());
		assertEquals(3, exported.size());
		IEObjectDescription zonk = exported.get(2);
		assertEquals("org.foo.Bar.zonk", zonk.getName());
		assertEquals("mandatory", zonk.getUserData(MweResourceDescription.DECLARED_PROPERTY__TYPE));
		assertNull(zonk.getUserData(MweResourceDescription.DECLARED_PROPERTY__MANDATORY));
	}
	
	public IResourceDescription getDescription(String properties) throws Exception {
		String model = "module org.foo.Bar\n" + properties + "\nString {}";
		Resource resource = getResourceFromString(model);
		IResourceDescription description = manager.getResourceDescription(resource);
		return description;
	}
	
}
