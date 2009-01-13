/*
Generated with Xtext
*/
package org.eclipse.emf.mwe.di.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MWEAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = MWEAntlrTokenFileProvider.class.getClassLoader();
    	return classLoader.getResourceAsStream("org/eclipse/emf/mwe/di/parser/antlr/internal/InternalMWE.tokens");
	}
}
