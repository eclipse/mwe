/*******************************************************************************
 * Copyright (c) 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.ui.debug.model.ui;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.mwe.internal.ui.debug.model.DebugVariable;

/**
 * Sorter for debug variables by it's name. It sorts upper case names at first and lower case afterwards.
 * 
 */
public class VariableSorter {

	static VarComparator inst;

	public static void sort(List<DebugVariable> variables) {
		if (inst == null)
			inst = new VariableSorter().new VarComparator();
		Collections.sort(variables, inst);
	}

	class VarComparator implements java.util.Comparator<DebugVariable> {

		// we assume names exist and are not empty, -> is not checked here (Problem?)
		@Override
		public int compare(DebugVariable o1, DebugVariable o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}

}
