/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.core.debug.processing;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.mwe.core.debug.processing.ElementAdapter;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderFactory;
import org.eclipse.emf.mwe.internal.core.debug.communication.Connection;
import org.eclipse.emf.mwe.internal.core.debug.communication.packages.RegisterPackage;

/**
 * This manager class listens for requests from the debug server to instantiate handlers or adapters.<br>
 * It initiates the handlers and registers adapters at the <code>DebugMonitor</code> instance.
 */
public class RuntimeHandlerManager implements Runnable {

	private Connection connection;

	private final DebugMonitor monitor;
	
	private static final Log logger = LogFactory.getLog(RuntimeHandlerManager.class);

	// -------------------------------------------------------------------------

	public RuntimeHandlerManager(final DebugMonitor monitor) {
		this.monitor = monitor;
	}

	// -------------------------------------------------------------------------

	public void setConnection(final Connection connection) {
		this.connection = connection;
	}

	/**
	 * start listener thread.
	 */
	public void startListener() {
		Thread thread = new Thread(this, getClass().getSimpleName());
		thread.setDaemon(true);
		thread.start();
	}

	// -------------------------------------------------------------------------

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		try {
			while (true) {
				listenAndRegisterClasses();
			}
		} catch (Exception e) {
			if (!(e instanceof IOException)) {
				logger.error(e.getMessage(), e);
			}
		}
	}

	private void listenAndRegisterClasses() throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {

		RegisterPackage packet = (RegisterPackage) connection.listenForPackage(RegisterPackage.class);

		String msg = null;

		if (packet.type == RegisterPackage.HANDLERS) {
			RuntimeHandler handler = null;
			for (String className : packet.classNames) {
				final Class<?> clazz = ResourceLoaderFactory.createResourceLoader().loadClass(className);
				if (clazz == null) {
					msg = "Couldn't find " + className + " in the class path.";
					System.err.println(msg);
					throw new ClassNotFoundException(msg);
				}
				handler = (RuntimeHandler) clazz.newInstance();
				handler.init(monitor, connection);
				handler.startListener();
			}
		} else {
			ElementAdapter adapter = null;
			for (String className : packet.classNames) {
				final Class<?> clazz = ResourceLoaderFactory.createResourceLoader().loadClass(className);
				if (clazz == null) {
					msg = "Couldn't find " + className + " in the class path.";
					System.err.println(msg);
					throw new ClassNotFoundException(msg);
				}
				adapter = (ElementAdapter) clazz.newInstance();
				monitor.addAdapter(adapter);
			}
		}
	}

}
