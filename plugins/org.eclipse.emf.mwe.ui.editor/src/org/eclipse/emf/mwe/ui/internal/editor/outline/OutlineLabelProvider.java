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

package org.eclipse.emf.mwe.ui.internal.editor.outline;

import org.eclipse.emf.mwe.ui.internal.editor.elements.WorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.images.EditorImages;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.6 $
 */

public class OutlineLabelProvider implements ILabelProvider {

	private static final String PROPERTY_FILE_LABEL = "file:";

	public void addListener(final ILabelProviderListener listener) {
	}

	public void dispose() {
	}

	public Image getImage(final Object element) {
		if (!(element instanceof WorkflowElement))
			return null;

		final WorkflowElement workflowElement = (WorkflowElement) element;
		return EditorImages.getImage(workflowElement.getImage());
	}

	public String getText(final Object element) {
		if (!(element instanceof WorkflowElement))
			return null;

		final WorkflowElement workflowElement = (WorkflowElement) element;
		String text = null;

		if (workflowElement.isSimpleProperty()) {
			text =
					workflowElement
							.getAttributeValue(WorkflowElement.NAME_ATTRIBUTE);
			if (workflowElement
					.getAttributeValue(WorkflowElement.VALUE_ATTRIBUTE) != null) {
				text +=
						" = "
								+ workflowElement
										.getAttributeValue(WorkflowElement.VALUE_ATTRIBUTE);
			}
		} else if (workflowElement.isFileProperty()) {
			text =
					PROPERTY_FILE_LABEL
							+ " "
							+ workflowElement
									.getAttributeValue(WorkflowElement.FILE_ATTRIBUTE);
		} else if (workflowElement.isComponent()) {
			if (workflowElement.hasAttribute(WorkflowElement.CLASS_ATTRIBUTE)) {
				final String classFQN =
						workflowElement
								.getAttributeValue(WorkflowElement.CLASS_ATTRIBUTE);
				final int lastDot = classFQN.lastIndexOf('.');
				text = classFQN.substring(lastDot + 1);
			} else {
				text = workflowElement.getName();
			}
		} else {
			text = workflowElement.getName();
			if (workflowElement
					.getAttributeValue(WorkflowElement.VALUE_ATTRIBUTE) != null) {
				text +=
						" = "
								+ workflowElement
										.getAttributeValue(WorkflowElement.VALUE_ATTRIBUTE);
			}
		}
		return text;
	}

	public boolean isLabelProperty(final Object element, final String property) {
		return true;
	}

	public void removeListener(final ILabelProviderListener listener) {
	}
}
