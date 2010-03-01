package org.eclipse.emf.mwe2.language.ui.highlighting;

import java.io.InputStream;
import java.util.Map;

import org.eclipse.xtext.parser.antlr.AntlrTokenDefProvider;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;
import org.eclipse.xtext.parser.antlr.ITokenDefProvider;

import com.google.common.collect.ImmutableMap;

public class TokenDefProvider implements ITokenDefProvider, IAntlrTokenFileProvider {

	private ImmutableMap<Integer, String> map;

	public Map<Integer, String> getTokenDefMap() {
		if (map == null) {
			AntlrTokenDefProvider provider = new AntlrTokenDefProvider();
			provider.setAntlrTokenFileProvider(this);
			map = ImmutableMap.copyOf(provider.getTokenDefMap());
		}
		return map;
	}

	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	String resourcePath = getClass().getPackage().getName().replace('.', '/') + "/MweHighlighting.tokens";
		InputStream result = classLoader.getResourceAsStream(resourcePath);
		return result;
	}

}
