package org.eclipse.emf.mwe.ui.workflow.util;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

public class PluginConfigurationElementUtil {

	public static String getConfigAttribute(final String path) {
		 // "aaa/bbb[xx=yy]/ccc" or "aaa/bbb/ccc";
		Pattern p = Pattern.compile("(.+)/(.+?)(\\[(.+)=(.+)\\])?/(.+)");
		Matcher m = p.matcher(path);
		if (!m.find()) {
			return null;
		}

		String attribute = null;
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IConfigurationElement[] elems = reg.getConfigurationElementsFor(m.group(1));
		for (IConfigurationElement elem : elems) {
			if (elem.getName().equals(m.group(2)) && ((m.group(3) == null) || m.group(5).equals(elem.getAttribute(m.group(4))))) {
				attribute = elem.getAttribute(m.group(6));
				break;
			}
		}
		return attribute;
	}
	
	public static IConfigurationElement[] getConfigElements(final String path) {
		Pattern p = Pattern.compile("(.+)/(.+?)(\\[(.+)=(.+)\\])?/(.+)");
		Matcher m = p.matcher(path);
		if (!m.find()) {
			return null;
		}

		List<IConfigurationElement> elements = new ArrayList<IConfigurationElement>();
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IConfigurationElement[] elems = reg.getConfigurationElementsFor(m.group(1));
		for (IConfigurationElement elem : elems) {
			if (elem.getName().equals(m.group(2)) && ((m.group(3) == null) || m.group(5).equals(elem.getAttribute(m.group(4))))) {
				elements.add(elem);
			}
		}
		return elements.toArray(new IConfigurationElement[0]);
	}

}
