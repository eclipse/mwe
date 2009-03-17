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

import org.eclipse.emf.mwe.ui.internal.editor.elements.AbstractWorkflowElement;
import org.eclipse.emf.mwe.ui.internal.editor.elements.impl.xml.XMLWorkflowElementImpl;
import org.eclipse.emf.mwe.ui.internal.editor.images.EditorImages;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 * @version $Revision: 1.12 $
 */

public class OutlineLabelProvider implements ILabelProvider {

	private static final String PROPERTY_FILE_LABEL = "file:";

	public void addListener(final ILabelProviderListener listener) {
	}

	public void dispose() {
	}

	public Image getImage(final Object element) {
		if (!(element instanceof XMLWorkflowElementImpl))
			return null;

		final AbstractWorkflowElement workflowElement = (AbstractWorkflowElement) element;
		return EditorImages.getImage(workflowElement.getImage());
	}

	public String getText(final Object element) {
		if (!(element instanceof XMLWorkflowElementImpl))
			return null;

		final AbstractWorkflowElement workflowElement = (AbstractWorkflowElement) element;
		String text = null;

		if (workflowElement.isSimpleProperty()) {
			text =
					workflowElement
							.getAttributeValue(AbstractWorkflowElement.NAME_ATTRIBUTE);
			if (workflowElement
					.getAttributeValue(AbstractWorkflowElement.VALUE_ATTRIBUTE) != null) {
				text +=
						" = "
								+ workflowElement
										.getAttributeValue(AbstractWorkflowElement.VALUE_ATTRIBUTE);
			}
		} else if (workflowElement.isFileProperty()) {
			text =
					PROPERTY_FILE_LABEL
							+ " "
							+ workflowElement
									.getAttributeValue(AbstractWorkflowElement.FILE_ATTRIBUTE);
		} else if (workflowElement.isComponent()) {
			if (workflowElement.hasAttribute(AbstractWorkflowElement.CLASS_ATTRIBUTE)) {
				final String classFQN =
						workflowElement
								.getAttributeValue(AbstractWorkflowElement.CLASS_ATTRIBUTE);
				final int lastDot = classFQN.lastIndexOf('.');
				text = classFQN.substring(lastDot + 1);
			} else {
				text = workflowElement.getName();
			}
		} else {
			text = workflowElement.getName();
			if (workflowElement
					.getAttributeValue(AbstractWorkflowElement.VALUE_ATTRIBUTE) != null) {
				text +=
						" = "
								+ workflowElement
										.getAttributeValue(AbstractWorkflowElement.VALUE_ATTRIBUTE);
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
