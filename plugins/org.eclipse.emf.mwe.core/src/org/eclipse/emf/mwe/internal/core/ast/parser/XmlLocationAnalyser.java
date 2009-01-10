/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.emf.mwe.internal.core.ast.parser;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.mwe.core.resources.ResourceLoader;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderFactory;

public class XmlLocationAnalyser {
	private final Map<String, XmlFileEvaluator> repository = new HashMap<String, XmlFileEvaluator>();

	protected ResourceLoader loader;

	/**
	 * the SAX parser has no exact location handling. The offset and length
	 * information are updated here. <br>
	 * TODO: ER: add location of attributes (e.g. for error handling of not
	 * existing cartridge file)
	 * 
	 * @param loc
	 *            the (raw) location to be adapted
	 */
	public Location adapt(final Location loc) {
		String resource = loc.getResource();
		XmlFileEvaluator evaluator = evaluateResource(resource);
		return evaluator.adapt(loc);
	}

	public Location adaptEnd(final Location loc) {
		String resource = loc.getResource();
		XmlFileEvaluator evaluator = evaluateResource(resource);
		return evaluator.adaptEnd(loc);
	}

	public int findFirstLineOfTag(final String resource, final int lineNumber) {
		if (!repository.containsKey(resource)) {
			evaluateResource(resource);
		}
		return repository.get(resource).findFirstLineOfTag(lineNumber);
	}

	private XmlFileEvaluator evaluateResource(final String resource) {
		if (loader == null) {
			loader = ResourceLoaderFactory.createResourceLoader();
		}
		InputStream is = loader.getResourceAsStream(resource);
		XmlFileEvaluator evaluator = new XmlFileEvaluator();
		evaluator.evaluate(is);
		repository.put(resource, evaluator);
		return evaluator;
	}

	protected XmlFileEvaluator newEvaluator() {
		return new XmlFileEvaluator();
	}

	/**
	 * FOR TEST ONLY
	 */
	public XmlFileEvaluator newEvaluator__TEST() {
		return newEvaluator();
	}

	public class XmlFileEvaluator {

		private final List<XmlTagValues> values = new ArrayList<XmlTagValues>();

		// for test only
		private List<Object[]> result;

		protected StringBuffer otherText, name, specChar;

		protected boolean inTag, isClosingTag, inName, inInstruction, inComment = false;

		public void evaluate(final InputStream is) {
			if (is == null)
				return;
			int c;
			result = new ArrayList<Object[]>();
			int offset = 0, column = 0, nameStart = 0, nameEnd = 0, line = 0, tagLine = 0, firstColumn = 0;
			reset();
			try {
				while ((c = is.read()) != -1) {
					switch (c) {
						case '<':
							if (!(inTag || inInstruction || inComment)) {
								inTag = true;
								tagLine = line;
							}
							else {
								consume(c);
							}
							break;
						case '>':
							if (inTag) {
								if (nameEnd == 0) {
									nameEnd = offset - specChar.length();
								}
								if (line != tagLine) {
									firstColumn = 0;
								}
								XmlTagValues value = new XmlTagValues();
								value.firstLineOfTag = tagLine + 1;
								value.lastLineOfTag = line + 1;
								value.nameStart = nameStart;
								value.nameEnd = nameEnd;
								value.firstColumn = firstColumn - (isClosingTag ? 1 : 0);
								value.endColumn = column + 1;
								value.name = name.toString();
								value.isClosingTag = isClosingTag;
								values.add(value);

								result
										.add(new Object[] { new String[] { name.toString(), otherText.toString() },
												value });
								reset();
								nameEnd = 0;
							}
							else if (inInstruction && specChar.toString().endsWith("?")) {
								reset();
							}
							else if (inComment && specChar.toString().endsWith("--")) {
								reset();
							}
							else {
								consume(c);
							}
							break;
						case '/':
							if (inTag && !inInstruction && (name.length() == 0)) {
								isClosingTag = true;
							}
							specChar.append((char) c);
							break;
						case '!':
							if (inTag && !inInstruction && (name.length() == 0)) {
								specChar.append((char) c);
							}
							else {
								consume(c);
							}
							break;
						case '-':
							if ((inTag && (name.length() == 0)) || inComment) {
								specChar.append((char) c);
							}
							else {
								consume(c);
							}
							if (specChar.toString().endsWith("!--")) {
								inTag = false;
								inInstruction = false;
								inComment = true;

							}
							break;
						case '?':
							if (inTag && !inInstruction && (name.length() == 0)) {
								inTag = false;
								inInstruction = true;
							}
							else if (inInstruction) {
								specChar.append((char) c);
							}
							else {
								consume(c);
							}
							break;
						case ' ':
						case '\t':
							if (inName) {
								inName = false;
								nameEnd = offset - specChar.length();
							}
							consume(c);
							break;
						case '\r':
							specChar.append((char) c);
							line++;
							column = -1;
							break;
						case '\n':
							if (!specChar.toString().endsWith("\r")) {
								line++;
								column = -1;
							}
							if (inName) {
								inName = false;
								nameEnd = offset - specChar.length();
							}
							consume(c);
							break;
						default:
							if (inTag && !inName && (name.length() == 0)) {
								specChar = new StringBuffer();
								inName = true;
								nameStart = offset;
								firstColumn = column;
							}
							consume(c);
							break;
					}
					offset++;
					column++;
				}
			}
			catch (IOException e) {
				//
			}
		}

		private void consume(final int c) {
			if (inName) {
				name.append(specChar.toString() + (char) c);
			}
			else if (name.length() > 0) {
				otherText.append(specChar.toString() + (char) c);
			}
			if (specChar.length() > 0) {
				specChar = new StringBuffer();
			}
		}

		private void reset() {
			otherText = new StringBuffer();
			name = new StringBuffer();
			specChar = new StringBuffer();
			inTag = false;
			isClosingTag = false;
			inName = false;
			inInstruction = false;
			inComment = false;
		}

		protected int findFirstLineOfTag(final int lineNumber) {
			for (XmlTagValues value : values) {
				if ((lineNumber >= value.firstLineOfTag) && (lineNumber <= value.lastLineOfTag))
					return value.firstLineOfTag;
			}
			return -1;
		}

		public Location adapt(final Location rawLoc) {
			XmlTagValues value = findLine(rawLoc);
			if (value == null)
				return null;
			Location loc = new Location(value.firstLineOfTag, 0, rawLoc.getResource());
			loc.setNameStart(value.nameStart);
			loc.setNameEnd(value.nameEnd);
			return loc;
		}

		protected Location adaptEnd(final Location rawLoc) {
			int line = rawLoc.getLineNumber();
			int col = rawLoc.getColumnNumber();
			String name1 = null;
			XmlTagValues potentialValue = null;
			for (XmlTagValues value : values) {
				if ((name1 == null) && (line == value.firstLineOfTag) && (col >= value.firstColumn)
						&& (col <= value.endColumn)) {
					name1 = value.name;
				}
				if ((name1 == null) && (line < value.firstLineOfTag)) {
					name1 = potentialValue.name;
				}
				else if (value.name.equals(name1) && value.isClosingTag) {
					Location loc = new Location(value.firstLineOfTag, 0, rawLoc.getResource());
					loc.setNameStart(value.nameStart);
					loc.setNameEnd(value.nameEnd);
					return loc;
				}
				potentialValue = value;
			}
			return null; // no end tag found; can that occur?
		}

		protected XmlTagValues findLine(final Location loc) {
			if (values.isEmpty())
				return null;
			int line = loc.getRawLineNumber();
			int col = loc.getColumnNumber();
			List<XmlTagValues> potentialValues = new ArrayList<XmlTagValues>();
			XmlTagValues value = null;
			for (XmlTagValues nextValue : values) {
				if (value == null) {
					value = nextValue;
					if (line < value.firstLineOfTag) {
						potentialValues.add(value);
						break;
					}
					continue;
				}
				if (((line >= value.firstLineOfTag) && (line < nextValue.firstLineOfTag))
						|| (value.firstLineOfTag == nextValue.firstLineOfTag)) {
					potentialValues.add(value);
				}
				value = nextValue; // TODO: CK: low: check when we can break
			}
			// last tag
			if (potentialValues.isEmpty() || (line == value.firstLineOfTag)) {
				potentialValues.add(value);
			}
			value = handleColumns(col, potentialValues);
			return value;
		}

		protected XmlTagValues handleColumns(final int col, final List<XmlTagValues> values) {
			if (values.size() == 1)
				return values.get(0);
			XmlTagValues value = null;
			for (XmlTagValues nextValue : values) {
				if (value == null) {
					value = nextValue;
					if (col < value.firstColumn)
						return value;
					continue;
				}
				if ((col >= value.firstColumn) && (col < nextValue.firstColumn))
					return value;
				value = nextValue;
			}
			return value;
		}

		public List<Object[]> getResult() {
			return result;

		}
	}

	protected class XmlTagValues {
		public int firstLineOfTag;

		int lastLineOfTag;

		public int nameStart;

		public int nameEnd;

		int firstColumn;

		int endColumn;

		boolean isClosingTag;

		String name;
	}
}
