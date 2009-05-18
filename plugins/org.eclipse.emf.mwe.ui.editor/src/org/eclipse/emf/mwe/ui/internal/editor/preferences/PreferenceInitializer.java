/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.emf.mwe.ui.internal.editor.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.emf.mwe.ui.internal.editor.WorkflowEditorPlugin;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @author Patrick Schoenbach - Initial API and implementation
 */

public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	@Override
	public void initializeDefaultPreferences() {
		final IPreferenceStore store = WorkflowEditorPlugin.getDefault().getPreferenceStore();
		store.setDefault(PreferenceConstants.SYNCHRONIZE_OUTLINE_VIEW, true);
		store.setDefault(PreferenceConstants.AUTO_CLOSE_QUOTES, true);
	}

}
