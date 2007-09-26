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
package org.eclipse.emf.mwe.internal.ui.debug.processing;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.debug.core.DebugException;
import org.eclipse.emf.mwe.internal.core.debug.communication.Connection;
import org.eclipse.emf.mwe.internal.core.debug.communication.packets.RegisterPacket;
import org.eclipse.emf.mwe.internal.core.debug.processing.handlers.CommandRuntimeHandler;
import org.eclipse.emf.mwe.internal.core.debug.processing.handlers.EventRuntimeHandler;
import org.eclipse.emf.mwe.internal.ui.debug.processing.handlers.BreakpointPluginHandler;
import org.eclipse.emf.mwe.internal.ui.debug.processing.handlers.CommandPluginHandler;
import org.eclipse.emf.mwe.internal.ui.debug.processing.handlers.EventPluginHandler;
import org.eclipse.emf.mwe.internal.ui.debug.processing.handlers.VariablesPluginHandler;
import org.eclipse.emf.mwe.internal.ui.workflow.Activator;

/**
 * This class handles all handler and adapter extensions provided by other eclipse plugins.<br>
 * It is implemented as a singleton, that is instantiated at first usage, what could be breakpoint toggling or
 * debugger run.<br>
 * The plugin adapters are collected at instantiation time, all handlers and runtime adapters will be collected
 * during init, since they depend on the existence of a DebugModelManager.<br>
 * Since there is a new DebugModelManager for every debugger run, the init method will be called multiple times.
 * 
 */
public class PluginExtensionManager {

	private static PluginExtensionManager singleton;

	private final Set<PluginAdapter> pluginAdapters = new HashSet<PluginAdapter>();

	private boolean missingAdapterReported;

	private Connection connection;

	private DebugModelManager dmm;

	// -------------------------------------------------------------------------

	public static PluginExtensionManager getDefault() {
		if (singleton == null) {
			singleton = new PluginExtensionManager();
		}
		return singleton;
	}

	private PluginExtensionManager() {
		collectPluginAdaptersFromExtensions();
	}

	// -------------------------------------------------------------------------

	public void init(final DebugModelManager dmm, final Connection connection) throws DebugException {
		this.dmm = dmm;
		this.connection = connection;
		try {
			collectInitialCommunicationHandlers();
			collectHandlersFromExtensions();
			collectRuntimeAdaptersFromExtensions();
		} catch (IOException e) {
			dmm.handleIOProblem(e);
		}
	}

	// -------------------------------------------------------------------------

	public PluginAdapter getAdapterByResourceExtension(final String ext) {
		for (PluginAdapter adapter : pluginAdapters) {
			if (adapter.canHandleResourceExtension(ext)) {
				return adapter;
			}
		}
		if (!missingAdapterReported) {
			String msg = "Warning: Debug system initialization problem.\nDidn't find a plugin adapter for the file extension: '"
					+ ext + "'";
			Activator.logError(msg, null);
			Activator.showError(msg);
			missingAdapterReported = true;
		}
		return null;
	}

	public PluginAdapter getAdapterByType(final String type) {
		for (PluginAdapter adapter : pluginAdapters) {
			if (adapter.canHandleType(type)) {
				return adapter;
			}
		}
		if (!missingAdapterReported) {
			String msg = "Warning: Debug system initialization problem.\nDidn't find a plugin adapter for type: '"
					+ type + "'";
			Activator.logError(msg, null);
			Activator.showError(msg);
			missingAdapterReported = true;
		}
		return null;
	}

	// -------------------------------------------------------------------------

	private void collectInitialCommunicationHandlers() throws IOException {
		RegisterPacket packet = new RegisterPacket();
		packet.type = RegisterPacket.HANDLERS;

		CommandPluginHandler cHandler = new CommandPluginHandler();
		cHandler.setConnection(connection);
		dmm.setCmdHandler(cHandler);
		packet.classNames.add(CommandRuntimeHandler.class.getName());

		EventPluginHandler eHandler = new EventPluginHandler();
		eHandler.setConnection(connection);
		eHandler.startListener();
		eHandler.setDmm(dmm);
		packet.classNames.add(EventRuntimeHandler.class.getName());

		connection.sendPacket(packet);
	}

	private void collectHandlersFromExtensions() throws IOException {
		RegisterPacket packet = new RegisterPacket();
		packet.type = RegisterPacket.HANDLERS;
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IConfigurationElement[] elems = reg
				.getConfigurationElementsFor("org.eclipse.emf.mwe.ui.debugHandlers");
		for (IConfigurationElement elem : elems) {
			if (elem.getName().equals("handler")) {

				String className = elem.getAttribute("runtimeClass");
				if (className != null) {
					packet.classNames.add(className);
				}

				PluginHandler handler = null;
				className = elem.getAttribute("pluginClass");
				if (className != null) {
					try {
						handler = (PluginHandler) elem.createExecutableExtension("pluginClass");
					} catch (CoreException e) {
						Activator.logError("Internal configuration error.\nCouldn't instantiate "
								+ elem.getAttribute("pluginClass"), e);
					}
				}
				if (handler != null) {
					handler.setConnection(connection);
					if ("variablesHandler".equals(elem.getAttribute("type"))) {
						dmm.setVariablesHandler((VariablesPluginHandler) handler);
					} else if ("breakpointHandler".equals(elem.getAttribute("type"))) {
						dmm.setBreakpointHandler((BreakpointPluginHandler) handler);
					} else {
						handler.setDebugModelManager(dmm);
					}
				}
			}
		}
		if (!dmm.hasRequiredHandlers()) {
			String msg = "Debug system initialization problem.\nSome required debugger handlers are not assigned.";
			Activator.showError(msg);
			Activator.logError(msg, null);
		}
		// TODO: CK: test: what happens when a handler is not there? Exception? to be tested and corrected if necessary

		connection.sendPacket(packet);
	}

	private void collectRuntimeAdaptersFromExtensions() throws IOException {
		RegisterPacket packet = new RegisterPacket();
		packet.type = RegisterPacket.ADAPTERS;
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IConfigurationElement[] elems = reg
				.getConfigurationElementsFor("org.eclipse.emf.mwe.ui.debugAdapters");
		for (IConfigurationElement elem : elems) {
			if (elem.getName().equals("adapter")) {
				String className = elem.getAttribute("runtimeClass");
				if (className != null) {
					packet.classNames.add(className);
				}
			}
		}
		connection.sendPacket(packet);

	}

	private void collectPluginAdaptersFromExtensions() {
		IExtensionRegistry reg = Platform.getExtensionRegistry();
		IConfigurationElement[] elems = reg
				.getConfigurationElementsFor("org.eclipse.emf.mwe.ui.debugAdapters");
		for (IConfigurationElement elem : elems) {
			if (elem.getName().equals("adapter")) {
				PluginAdapter adapter = null;
				String className = elem.getAttribute("pluginClass");
				if (className != null) {
					try {
						adapter = (PluginAdapter) elem.createExecutableExtension("pluginClass");
					} catch (CoreException e) {
						Activator.logError("Internal configuration error.\nCouldn't instantiate "
								+ elem.getAttribute("pluginClass"), e);
					}
				}
				if (adapter != null) {
					pluginAdapters.add(adapter);
				}
			}
		}
	}

}
