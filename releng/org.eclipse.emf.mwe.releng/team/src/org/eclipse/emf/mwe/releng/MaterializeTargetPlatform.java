/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.emf.mwe.releng;

import static org.eclipse.emf.mwe.releng.util.Helper.downloadFile;
import static org.eclipse.emf.mwe.releng.util.Helper.ensureDirExists;
import static org.eclipse.emf.mwe.releng.util.Helper.extract;
import static org.eclipse.emf.mwe.releng.util.Helper.getLastSegment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Sven Efftinge - Initial contribution and API
 * @author Peter Friese
 */
public class MaterializeTargetPlatform {
	private static final String ORBIT_URL = "http://download.eclipse.org/tools/orbit/downloads/drops/R20100519200754/orbit-R20100519200754.zip";

	public static void main(String[] args) throws IOException {
		new MaterializeTargetPlatform().doMaterialize("./team/targetplatform/");
	}

	public void doMaterialize(String targetDir) {
		try {
			Properties properties = new Properties();
			properties.load(new FileInputStream("./build.properties"));
			String downloadURLs = resolve(properties.getProperty("dependencyURLs"), properties);
			materializeTargetPlatform(downloadURLs, targetDir);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	private String resolve(String value, Properties properties) {
		Pattern p = Pattern.compile("\\$\\{(.+?)\\}");
		Matcher m = p.matcher(value);
		StringBuffer result = new StringBuffer();
		while (m.find()) {
			String string = m.group(1);
			String val = resolve(properties.getProperty(string), properties);
			m.appendReplacement(result, val);
		}
		m.appendTail(result);
		return result.toString();
	}

	private void materializeTargetPlatform(String downloadURLs, String targetDir) throws Exception {
		ensureDirExists(targetDir);

		cleanUp(targetDir);
		// download all zips
		List<String> splittedURLs = new ArrayList<String>(Arrays.asList(downloadURLs.split(",")));

		// Add Orbit zip if not already exists
		if (!splittedURLs.contains(ORBIT_URL)) {
			splittedURLs.add(ORBIT_URL);
		}
		for (String downloadURL : splittedURLs) {
			downloadFile(targetDir, downloadURL);
		}

		String eclipseDir = targetDir;
		ensureDirExists(eclipseDir);
		for (String downloadURL : splittedURLs) {
			String fileName = targetDir + getLastSegment(downloadURL);
			extract(fileName, eclipseDir);
		}

		System.out
				.println("------------------------------------------------------------------------------------------------");
		System.out.println("-- Targetplatform has been materialized to '" + targetDir + "eclipse'");
		System.out
				.println("-- Please point your PDE tooling to this directory using the 'target platform' preference page");
		System.out
				.println("------------------------------------------------------------------------------------------------");
	}

	private void cleanUp(String targetDir) {
		File[] list = new File(targetDir).listFiles();
		for (File file : list) {
			if (file.getName().contains("SNAPSHOT") || file.getName().equals("eclipse")) {
				System.out.println("Deleting " + file.getName());
				file.delete();
			}
		}
	}

}
