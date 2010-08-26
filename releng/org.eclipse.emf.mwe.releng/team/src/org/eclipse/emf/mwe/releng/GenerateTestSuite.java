/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.emf.mwe.releng;

import static org.eclipse.emf.mwe.releng.GenerateTestSuite.TestProjectDesc.testProject;
import static org.eclipse.emf.mwe.releng.util.Helper.ensureDirExists;
import static org.eclipse.emf.mwe.releng.util.Helper.getLastSegment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.emf.mwe.releng.util.Helper;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * @author Sven Efftinge - Initial contribution and API
 */
public class GenerateTestSuite {

	public static void main(String[] args) throws Exception {
		try {
			Properties properties = new Properties();
			File file = new File("./build.properties");
			System.out.println(file.getCanonicalPath());
			properties.load(new FileInputStream(file));
			GenerateTestSuite g = new GenerateTestSuite();
			String testFeature = properties.getProperty("testFeatureToBuildID") + "-feature";
			if (!new File("../"+testFeature).exists()) {
				String alternative = properties.getProperty("testFeatureToBuildID") + ".feature";
				System.out.println(testFeature+" not found trying "+alternative);
				testFeature = alternative;
			}
			g.generate(testFeature);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static class TestProjectDesc {
		private String projectName;
		private String[] sourceFolders = new String[]{"src","tests"};
		private String packageName;
		private String testSuiteName = "AllTests";

		public static TestProjectDesc testProject(String projectName) {
			TestProjectDesc desc = new TestProjectDesc();
			desc.projectName = projectName;
			return desc;
		}

		public TestProjectDesc src(String ... sourceFolders) {
			this.sourceFolders = sourceFolders;
			return this;
		}

		public TestProjectDesc pack(String packageName) {
			this.packageName = packageName;
			return this;
		}

		public TestProjectDesc suite(String testSuiteName) {
			this.testSuiteName = testSuiteName;
			return this;
		}
		
		public String getQualifiedTestSuiteName() {
			return getPackageName()+"."+getTestSuiteName();
		}

		public String getProjectName() {
			return projectName;
		}

		public String[] getSourceFolder() {
			return sourceFolders;
		}

		public String getPackageName() {
			if (packageName == null)
				return getProjectName();
			return packageName;
		}

		public String getTestSuiteName() {
			return testSuiteName;
		}

	}
	
	protected void generateLaunchConf(TestProjectDesc desc) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("junit-plugin.launch.template")));
		File file = new File("./team/launchconfig/AllTests - "+desc.getProjectName().substring(12)+".launch");
		System.out.println("Generating launch config : "+file);
		Helper.ensureDirExists(file.getParentFile());
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		String currentLine = null;
		while ((currentLine = reader.readLine())!=null) {
			writer.write(replace(currentLine,desc)+"\n");
		}
		reader.close();
		writer.close();
	}

	protected String replace(String s, TestProjectDesc desc) {
		s= s.replace("[[PROJECT_NAME]]", desc.getProjectName());
		s= s.replace("[[TEST_SUITE_PATH]]", desc.getQualifiedTestSuiteName().replace('.', '/'));
		s= s.replace("[[TEST_SUITE]]", desc.getQualifiedTestSuiteName());
		return s;
	}

	public void generate(String testFeature) throws Exception {
		generate(testFeature, new String[] { "org.eclipse.test", "org.eclipse.ant.optional.junit", "org.easymock" });
	}

	public void generate(String testFeature, String[] excludes) throws Exception {
		Set<TestProjectDesc> testProjDescs = collectTestProjectsFromFeature(testFeature, excludes);
		doGenerate(testProjDescs.toArray(new TestProjectDesc[testProjDescs.size()]));
	}

	private Set<TestProjectDesc> collectTestProjectsFromFeature(String testFeature, String... excludes)
			throws SAXException, IOException, ParserConfigurationException {
		File f = new File("../" + testFeature + "/feature.xml");
		List<String> excludesList = Arrays.asList(excludes);
		Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(f);
		NodeList nodeList = document.getElementsByTagName("plugin");
		Set<TestProjectDesc> testProjDescs = new LinkedHashSet<TestProjectDesc>();
		for (int i = 0, x = nodeList.getLength(); i < x; i++) {
			Node node = nodeList.item(i);
			NamedNodeMap attributes = node.getAttributes();
			Node namedItem = attributes.getNamedItem("id");
			String value = namedItem.getNodeValue();
			if (!excludesList.contains(value) && value.endsWith("tests"))
				testProjDescs.add(testProject(value));
		}
		return testProjDescs;
	}

	private void doGenerate(TestProjectDesc... descriptors) throws IOException {
		for (TestProjectDesc testProjectDesc : descriptors) {
			generateTestSuite(testProjectDesc);
			generateLaunchConf(testProjectDesc);
		}
		FileWriter writer = new FileWriter("./testing.properties");
		writer.append("#THIS FILE IS AUTO GENERATED FROM " + getClass().getName() + " - DON'T MODIFY!\n\n");
		writer.append("#csv list of test plugins to run\n");
		writer.append("testPluginsToRun=");
		for (int i = 0; i < descriptors.length; i++) {
			TestProjectDesc testProjectDesc = descriptors[i];
			writer.append(testProjectDesc.getProjectName());
			if (i + 1 < descriptors.length)
				writer.append(",");
		}
		writer.append("\n");
		writer.append("#map name of test plugin to testsuite class to run\n");
		for (TestProjectDesc desc : descriptors) {
			writer.append(desc.getProjectName() + ".suite=" + desc.getPackageName() + "." + desc.getTestSuiteName()
					+ "\n");
		}
		writer.append("\n");
		writer.append("extraVMargs=-Dorg.eclipse.swt.browser.XULRunnerPath=/shared/common/mozilla-xulrunner181-1.8.1.4-30.ppc -Dfile.encoding=iso-8859-1\n");
		writer.close();
		System.out.println("Overwriting ./testing.properties");
	}

	private void generateTestSuite(TestProjectDesc d) throws IOException {
		List<String> qualifiedNames = new ArrayList<String>();
		for (String srcFolder : d.getSourceFolder()) {
			String src = "../" + d.getProjectName() + "/" + srcFolder;
			qualifiedNames.addAll(collectTestClasses(src));
		}
		Collections.sort(qualifiedNames);

		File file = new File("../" + d.getProjectName() + "/" + d.getSourceFolder()[0] + "/" + d.getPackageName().replace('.', '/') + "/" + d.getTestSuiteName() + ".java");
		ensureDirExists(file.getParentFile());
		FileWriter writer = new FileWriter(file);
		if (d.getPackageName() != null) {
			writer.append("package " + d.getPackageName() + ";\n\n");
		}
		writer.append("import junit.framework.Test;\n");
		writer.append("import junit.framework.TestSuite;\n\n");
		writer.append("/*\n");
		writer.append(" * automatically generated by " + getClass().getName() + " \n");
		writer.append(" * \n");
		writer.append(" * @generated \n");
		writer.append(" */\n");
		writer.append("public class " + d.getTestSuiteName() + " {\n");
		writer.append("   public static Test suite() {\n");
		writer.append("      TestSuite suite = new TestSuite(\"Tests for " + d.getProjectName() + "\");\n");
		for (String qualifiedName : qualifiedNames) {
			writer.append("      suite.addTestSuite(" + qualifiedName + ".class);\n");
		}
		writer.append("      return suite;\n");
		writer.append("   }\n");
		writer.append("}\n");
		writer.close();
		System.out.println("Generated TestSuite to " + file.getPath() + ". Includes " + qualifiedNames.size()
				+ " test cases.");
	}

	private Set<String> collectTestClasses(String src) {
		return collectTestClasses(null, new File(src));
	}

	private Set<String> collectTestClasses(String prefix, File root) {
		if (!root.exists())
			return Collections.emptySet();
		if (!root.isDirectory())
			throw new IllegalArgumentException("Not a directory :" + root);

		File[] files = root.listFiles(new FileFilter() {

			public boolean accept(File pathname) {
				return pathname.isDirectory() || (pathname.getName().endsWith("Test.java") && pathname.getName().toLowerCase().indexOf("abstract")==-1);
			}
		});

		Set<String> result = new LinkedHashSet<String>();
		for (File file : files) {
			if (file.isDirectory()) {
				String newPrefix = getLastSegment(file.getName());
				if (prefix != null) {
					newPrefix = prefix + "." + newPrefix;
				}
				Set<String> collectTestClasses = collectTestClasses(newPrefix, file);
				result.addAll(collectTestClasses);
			}
			else {
				result.add(prefix + "." + remove(getLastSegment(file.getName()), ".java"));
			}
		}
		return result;
	}

	private String remove(String string, String suffix) {
		if (string.endsWith(suffix))
			return string.substring(0, string.length() - suffix.length());
		return string;
	}
}
