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
 * @author Jan K&ouml;hnlein
 */
public class mwe {
	private static final String RUNTIME_PATH = ".";
	private static final String UI_PATH = "../org.eclipse.emf.mwe.di.ui";

	private String uiPath = UI_PATH;
	private String runtimePath = RUNTIME_PATH;

	private mwe(String... args) {
		if (args.length > 0) {
			runtimePath = args[0];
			uiPath = args[0] + "/" + UI_PATH;
		}
	}

	public void generate(String... args) throws IOException {

		XtextStandaloneSetup.doSetup();

		GeneratorFacade.cleanFolder(runtimePath + "/src-gen");

		String classpathUri = "classpath:/" + getClass().getName().replace('.', '/') + ".xtext";
		System.out.println("loading " + classpathUri);
		ResourceSet rs = new XtextResourceSet();
		Resource resource = rs.createResource(new ClassloaderClasspathUriResolver().resolve(null, URI
				.createURI(classpathUri)));
		resource.load(null);
		Grammar grammarModel = (Grammar) resource.getContents().get(0);

		GeneratorFacade.generate(grammarModel, runtimePath, uiPath, "mwe");
		System.out.println("Done.");
	}

	public static void main(String... args) throws IOException {
		mwe generator = new mwe(args);
		generator.generate();
	}

}
