/*******************************************************************************
 * Copyright (c) 2005 - 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.ui.debug.model;

import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.IDebugElement;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.emf.mwe.internal.ui.debug.processing.DebugModelManager;

/**
 * Common functions for all classes inheriting from this class, that represent the debug model.
 * 
 */
public abstract class DebugElement extends PlatformObject implements IDebugElement {
	protected DebugTarget target;

	public DebugElement(final DebugTarget target) {
		this.target = target;
	}

	public String getModelIdentifier() {
		return MWEBreakpoint.DEBUG_MODEL_ID;
	}

	public IDebugTarget getDebugTarget() {
		return target;
	}

	public DebugTarget getDebugTarget0() {
		return target;
	}

	public ILaunch getLaunch() {
		return getDebugTarget().getLaunch();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object getAdapter(final Class adapter) {
		if (adapter == IDebugElement.class) {
			return this;
		}
		if (adapter == IDebugTarget.class) {
			return getDebugTarget();
		}
		if (adapter == ILaunch.class) {
			return getLaunch();
		}
		if (adapter == IProcess.class) {
			return getDebugTarget().getProcess();
		}
		if (adapter == ILaunchConfiguration.class) {
			return getLaunch().getLaunchConfiguration();
		}

		return super.getAdapter(adapter);
	}

	public DebugModelManager getDebugModelManager() {
		return target.getDebugModelManager();
	}

}
