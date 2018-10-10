/*******************************************************************************
 * Copyright (c) 2018 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.emf.mwe2.language.tests;

import static org.junit.Assert.*;

import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe2.language.services.Mwe2GrammarAccess;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.diagnostics.ExceptionDiagnostic;
import org.eclipse.xtext.linking.lazy.LazyLinkingResource;
import org.eclipse.xtext.nodemodel.impl.InvariantChecker;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.testing.GlobalRegistries;
import org.eclipse.xtext.testing.GlobalRegistries.GlobalStateMemento;
import org.eclipse.xtext.testing.serializer.SerializerTestHelper;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.StringInputStream;
import org.junit.After;
import org.junit.Before;

import com.google.common.base.Joiner;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Module;
import com.google.inject.name.Names;

/**
 * @author dietrich - Initial contribution and API
 */
public class AbstractMwe2Tests /*extends AbstractXtextTests*/ {
	
	protected InvariantChecker getInvariantChecker(){
		return getInjector().getInstance(InvariantChecker.class);
	}

	private Injector injector;
	private boolean canCreateInjector;
	private boolean isSerializerTestDisabled = false;
	private GlobalStateMemento globalStateMemento;
	
	static {
		GlobalRegistries.initializeDefaults();
	}
	
	protected Mwe2GrammarAccess getGrammarAccess() {
		return (Mwe2GrammarAccess) get(IGrammarAccess.class);
	}

	@Before
	public void setUp() throws Exception {
		canCreateInjector = true;
		isSerializerTestDisabled = false;
		globalStateMemento = GlobalRegistries.makeCopyOfGlobalState();
	}

	@After
	public void tearDown() throws Exception {
		injector = null;
		isSerializerTestDisabled = false;
		globalStateMemento.restoreGlobalState();
	}
	
	protected String getCurrentFileExtension() {
		String instance = getInjector().getInstance(Key.get(String.class,Names.named(Constants.FILE_EXTENSIONS)));
		if (instance.indexOf(',')==-1)
			return instance;
		return instance.split(",")[0];
	}
	
	public EObject getModel(String model) throws Exception {
		return getModel(getAsStream(model));
	}
	
	public final EObject getModel(InputStream model) throws Exception {
		XtextResource resource = getResource(model);
		return getModel(resource);
	}
	
	protected InputStream getAsStream(String model) {
		return new StringInputStream(model);
	}
	
	public final XtextResource getResource(InputStream in) throws Exception {
		return getResource(in, URI.createURI("mytestmodel."+getCurrentFileExtension()));
	}
	
	public final XtextResource getResource(InputStream in, URI uri) throws Exception {
		return getResourceAndExpect(in, uri, 0);
	}
	
	protected EObject getModel(XtextResource resource) {
		return resource.getParseResult().getRootASTElement();
	}
	
	public final EObject getModelAndExpect(String model, int errors) throws Exception {
		return getModelAndExpect(getAsStream(model), errors);
	}
	
	public final EObject getModelAndExpect(InputStream model, int errors) throws Exception {
		XtextResource resource = getResourceAndExpect(model, errors);
		return getModel(resource);
	}
	
	public final XtextResource getResourceAndExpect(InputStream in, int errors) throws Exception {
		return getResourceAndExpect(in, getTestModelURI(), errors);
	}
	
	protected final XtextResource getResourceFromString(String model) throws Exception {
		return getResource(getAsStream(model));
	}

	/**
	 * @since 2.8
	 */
	protected URI getTestModelURI() {
		return URI.createURI("mytestmodel."+getCurrentFileExtension());
	}
	
	public static final int EXPECT_ERRORS = -2;
	public static final int UNKNOWN_EXPECTATION = Integer.MIN_VALUE;
	
	public final XtextResource getResourceAndExpect(InputStream in, URI uri, int expectedErrors) throws Exception {
		XtextResource resource = doGetResource(in, uri);
		checkNodeModel(resource);
		if (expectedErrors != UNKNOWN_EXPECTATION) {
			if (expectedErrors == EXPECT_ERRORS)
				assertFalse(Joiner.on('\n').join(resource.getErrors()), resource.getErrors().isEmpty());
			else
				assertEquals(Joiner.on('\n').join(resource.getErrors()), expectedErrors, resource.getErrors().size());
		}
		for(Diagnostic d: resource.getErrors()) {
			if (d instanceof ExceptionDiagnostic)
				fail(d.getMessage());
		}
		if (expectedErrors == 0 && resource.getContents().size() > 0 && shouldTestSerializer(resource)) {
			EObject obj = resource.getContents().get(0);
			SerializerTestHelper tester = get(SerializerTestHelper.class);
			tester.assertSerializeWithNodeModel(obj);
			tester.assertSerializeWithoutNodeModel(obj);
		}
		return resource;
	}
	
	protected void checkNodeModel(XtextResource resource) {
		IParseResult parseResult = resource.getParseResult();
		if(parseResult != null)
			getInvariantChecker().checkInvariant(parseResult.getRootNode());
	}
	
	protected IResourceFactory getResourceFactory()  {
		return getInjector().getInstance(IResourceFactory.class);
	}
	
	protected XtextResource doGetResource(InputStream in, URI uri) throws Exception {
		XtextResourceSet rs = get(XtextResourceSet.class);
		rs.setClasspathURIContext(getClass());
		XtextResource resource = (XtextResource) getResourceFactory().createResource(uri);
		rs.getResources().add(resource);
		resource.load(in, null);
		if (resource instanceof LazyLinkingResource) {
			((LazyLinkingResource) resource).resolveLazyCrossReferences(CancelIndicator.NullImpl);
		} else {
			EcoreUtil.resolveAll(resource);
		}
		return resource;
	}
	
	protected boolean shouldTestSerializer(XtextResource resource) {
		return !isSerializerTestDisabled && !("org.eclipse.xtext.Xtext".equals(resource.getLanguageName()) 
				// TODO: fix serializer issues in refactoring tests
				|| "org.eclipse.xtext.ui.tests.refactoring.RefactoringTestLanguage".equals(resource.getLanguageName()));
	}
	
	protected void disableSerializerTest() {
		isSerializerTestDisabled = true;
	}
	
	/**
	 * call this to set the language class to be used in the current test.
	 */
	protected void with(Module ... modules) throws Exception {
		assertTrue("super.setUp() has to be called before any injector is instantiated", canCreateInjector);
		setInjector(Guice.createInjector(modules));
	}

	protected void with(Class<? extends ISetup> setupClazz) throws Exception {
		assertTrue("super.setUp() has to be called before any injector is instantiated", canCreateInjector);
		ISetup instance = setupClazz.newInstance();
		setInjector(instance.createInjectorAndDoEMFRegistration());
	}

	public void with(ISetup setup) throws Exception {
		assertTrue("super.setUp() has to be called before any injector is instantiated", canCreateInjector);
		setInjector(setup.createInjectorAndDoEMFRegistration());
	}
	
	protected void setInjector(Injector injector) {
		this.injector = injector;
	}
	
	final public Injector getInjector() {
		if (injector==null)
			throw new IllegalStateException("No injector set. Did you forget to call something like 'with(new YourStadaloneSetup())'?");
		return injector;
	}

	public<T> T get(Class<T> clazz) {
		if (injector == null)
			injector = Guice.createInjector();
		return injector.getInstance(clazz);
	}

	public<T> T get(Key<T> key) {
		if (injector == null)
			injector = Guice.createInjector();
		return injector.getInstance(key);
	}
	
	public void injectMembers(Object object) {
		if (injector == null)
			injector = Guice.createInjector();
		injector.injectMembers(object);
	}

}
