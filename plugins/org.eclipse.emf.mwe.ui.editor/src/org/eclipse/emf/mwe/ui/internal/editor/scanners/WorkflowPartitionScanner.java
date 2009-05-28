/*
 * Copyright (c) 2008 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    committers of openArchitectureWare - initial API and implementation
 */

package org.eclipse.emf.mwe.ui.internal.editor.scanners;

import org.eclipse.emf.mwe.ui.internal.editor.rules.NonMatchingRule;
import org.eclipse.emf.mwe.ui.internal.editor.rules.StartTagRule;
import org.eclipse.emf.mwe.ui.internal.editor.rules.TextPredicateRule;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.MultiLineRule;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.Token;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 */
public class WorkflowPartitionScanner extends RuleBasedPartitionScanner {

	public static final String XML_START_TAG = "__xml_start_tag";

	public static final String XML_END_TAG = "__xml_end_tag";

	public static final String XML_PROCESSING_INSTRUCTION = "__xml_processing_instruction";

	public static final String XML_DOCTYPE = "__xml_doctype";

	public static final String XML_TEXT = "__xml_text";

	public static final String XML_COMMENT = "__xml_comment";

	public WorkflowPartitionScanner() {
		final IToken xmlComment = new Token(WorkflowPartitionScanner.XML_COMMENT);
		final IToken xmlProcessingInstruction = new Token(WorkflowPartitionScanner.XML_PROCESSING_INSTRUCTION);
		final IToken startTag = new Token(WorkflowPartitionScanner.XML_START_TAG);
		final IToken endTag = new Token(WorkflowPartitionScanner.XML_END_TAG);
		final IToken docType = new Token(WorkflowPartitionScanner.XML_DOCTYPE);
		final IToken text = new Token(WorkflowPartitionScanner.XML_TEXT);

		final IPredicateRule[] rules = new IPredicateRule[7];

		rules[0] = new NonMatchingRule();
		rules[1] = new MultiLineRule("<!--", "-->", xmlComment, (char) 0, true);
		rules[2] = new MultiLineRule("<?", "?>", xmlProcessingInstruction, (char) 0, true);
		rules[3] = new MultiLineRule("</", ">", endTag);
		rules[4] = new StartTagRule(startTag);
		rules[5] = new MultiLineRule("<!DOCTYPE", ">", docType, (char) 0, true);
		rules[6] = new TextPredicateRule(text);

		setPredicateRules(rules);
	}
}
