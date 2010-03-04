package org.eclipse.emf.mwe2.launch;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;
import org.eclipse.emf.mwe2.language.ExtendedMwe2StandaloneSetup;

import com.google.inject.Injector;

public class MweLauncher {
	private static final String PARAM = "p";

	public static void main(String[] args) {
		new MweLauncher().run(args);
	}

	public void run(String[] args) {
		Options options = getOptions();
		final CommandLineParser parser = new PosixParser();
		CommandLine line = null;
		try {
			line = parser.parse(options, args);
			if (line.getArgs().length == 0)
				throw new ParseException("No module name specified.");
			if (line.getArgs().length > 1)
				throw new ParseException("Only one module name expected. But " + line.getArgs().length
						+ " were passed (" + line.getArgList() + ")");

			String moduleName = line.getArgs()[0];
			Map<String, String> params = new HashMap<String, String>();
			String[] optionValues = line.getOptionValues(PARAM);
			if (optionValues != null) {
				for (String string : optionValues) {
					int index = string.indexOf('=');
					if (index == -1) {
						throw new ParseException("Incorrect parameter syntax '" + string
								+ "'. It should be 'name=value'");
					}
					String name = string.substring(0, index);
					String value = string.substring(index + 1);
					if (params.put(name, value) != null) {
						throw new ParseException("Duplicate parameter '" + name + "'.");
					}
				}
			}
			Injector injector = new ExtendedMwe2StandaloneSetup().createInjectorAndDoEMFRegistration();
			MweRunner mweRunner = injector.getInstance(MweRunner.class);
			mweRunner.run(moduleName, params);
		} catch (final ParseException exp) {
			final HelpFormatter formatter = new HelpFormatter();
			System.err.println("Parsing arguments failed.  Reason: " + exp.getMessage());
			formatter.printHelp("java " + MweLauncher.class.getName() + " some.mwe2.Module [options]\n", options);
			return;
		}
	}

	@SuppressWarnings("static-access")
	public Options getOptions() {
		final Options options = new Options();
		final Option paramOption = OptionBuilder.withArgName("key=value").withDescription(
				"external property that is handled as workflow property").hasArgs().create(PARAM);
		paramOption.setLongOpt("param");
		options.addOption(paramOption);
		return options;
	}
}
