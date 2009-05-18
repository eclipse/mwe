/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * C
 * ontributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.emf.mwe.ui.internal.editor.preferences;

import org.eclipse.emf.mwe.ui.internal.editor.WorkflowEditorPlugin;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 */

public class MWEEditorPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public void init(final IWorkbench workbench) {
	}

	/**
	 * @see org.eclipse.jface.preference.PreferencePage#doGetPreferenceStore()
	 */
	@Override
	protected IPreferenceStore doGetPreferenceStore() {
		return WorkflowEditorPlugin.getDefault().getPreferenceStore();
	}

	/**
	 * @see org.eclipse.jface.preference.FieldEditorPreferencePage#createFieldEditors()
	 */
	@Override
	protected void createFieldEditors() {
		final BooleanFieldEditor outlineSync = new BooleanFieldEditor(PreferenceConstants.SYNCHRONIZE_OUTLINE_VIEW,
				"Automatically synchronize the outline view with the editor", getFieldEditorParent());
		outlineSync.setPreferenceStore(doGetPreferenceStore());
		addField(outlineSync);
		final BooleanFieldEditor autoCloseQuotes = new BooleanFieldEditor(PreferenceConstants.AUTO_CLOSE_QUOTES,
				"Automatically close quotes", getFieldEditorParent());
		autoCloseQuotes.setPreferenceStore(doGetPreferenceStore());
		addField(autoCloseQuotes);

	}

}
