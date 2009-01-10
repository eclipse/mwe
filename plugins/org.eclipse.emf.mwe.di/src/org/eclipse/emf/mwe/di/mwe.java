/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.di;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.GeneratorFacade;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.XtextStandaloneSetup;
import org.eclipse.xtext.resource.ClassloaderClasspathUriResolver;
import org.eclipse.xtext.resource.XtextResourceSet;

/**
 * Run this class in order to generate the Reference grammar.
 * 
 * @author Sven Efftinge - Initial contribution and API
 * @author Peter Friese
 */
public class mwe {
    private static final String RUNTIME_PATH = ".";
    private static final String UI_PATH = "../org.eclipse.emf.mwe.di.ui";

    public void generate() throws IOException {
        XtextStandaloneSetup.doSetup();

        GeneratorFacade.cleanFolder(RUNTIME_PATH+"/src-gen");

        String classpathUri = "classpath:/"+getClass().getName().replace('.', '/') + ".xtext";
        System.out.println("loading " + classpathUri);
        ResourceSet rs = new XtextResourceSet();
        Resource resource = rs.createResource(new ClassloaderClasspathUriResolver().resolve(null, URI.createURI(classpathUri)));
        resource.load(null);
        Grammar grammarModel = (Grammar) resource.getContents().get(0);

        GeneratorFacade.generate(grammarModel, RUNTIME_PATH,UI_PATH, "mwe");
        System.out.println("Done.");
    }

    public static void main(String[] args) throws IOException {
        mwe generator = new mwe();
        generator.generate();
    }

}
