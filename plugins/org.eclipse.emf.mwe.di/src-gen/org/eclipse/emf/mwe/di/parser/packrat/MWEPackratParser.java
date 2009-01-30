/*
Generated with Xtext
*/
package org.eclipse.emf.mwe.di.parser.packrat;

import org.eclipse.xtext.parser.packrat.AbstractPackratParser;
import org.eclipse.xtext.parser.packrat.AbstractParserConfiguration.IInternalParserConfiguration;

public class MWEPackratParser extends AbstractPackratParser {

	@Override
	protected MWEParserConfiguration createParserConfiguration(IInternalParserConfiguration configuration) {
		return new MWEParserConfiguration(configuration);
	}

}
