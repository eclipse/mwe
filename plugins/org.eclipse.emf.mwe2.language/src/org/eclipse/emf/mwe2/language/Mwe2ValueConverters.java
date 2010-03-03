package org.eclipse.emf.mwe2.language;

import java.util.Set;

import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.util.Strings;

import com.google.common.collect.ImmutableSet;

public class Mwe2ValueConverters extends DefaultTerminalConverters {

	public class FQNConverter extends AbstractNullSafeConverter<String> {
		
		private Set<String> allKeywords = ImmutableSet.copyOf(GrammarUtil.getAllKeywords(getGrammar()));
		
		@Override
		protected String internalToValue(String string, AbstractNode node) {
			return string.replaceAll("[\\^\\s]", "");
		}

		@Override
		protected String internalToString(String value) {
			String[] segments = value.split("\\.");
			StringBuilder builder = new StringBuilder(value.length());
			for(String segment: segments) {
				if (allKeywords.contains(segment)) {
					builder.append("^");
				}
				builder.append(segment);
			}
			return builder.toString();
		}
	};
	
	@ValueConverter(rule = "ImportedFQN")
	public IValueConverter<String> ImportedFQN() {
		return new FQNConverter();
	}
	
	@ValueConverter(rule = "FQN")
	public IValueConverter<String> FQN() {
		return new FQNConverter();
	}
	
	@ValueConverter(rule = "ConstantValue")
	public IValueConverter<String> ConstantValue() {
		return new AbstractNullSafeConverter<String>() {

			@Override
			protected String internalToValue(String string, AbstractNode node) {
				try {
					string = string.replace("\\${", "${");
					string = string.replace("\\//", "//");
					string = string.replace("\\/*", "/*");
					return Strings.convertFromJavaString(string, false);
				} catch(IllegalArgumentException e) {
					throw new ValueConverterException(e.getMessage(), node, e);
				}
			}

			@Override
			protected String internalToString(String value) {
				String result = Strings.convertToJavaString(value, false);
				result = result.replace("${", "\\${");
				result = result.replace("//", "\\//");
				result = result.replace("/*", "\\/*");
				return result;
			}
		};
	}
}
