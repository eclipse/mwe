/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.emf.mwe.internal.core.debug.communication;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.mwe.internal.core.debug.communication.packages.AbstractPackage;

/**
 * This Runnable sends packages out asynchroniously as they arrive from customers.
 */
public class PackageSender implements Runnable {

	private final ArrayList<AbstractPackage> outgoingPackages;
	
	private static final Log logger = LogFactory.getLog(PackageSender.class);

	private final Connection connection;

	private boolean interrupt = false;

	/**
	 * create a new instance and starts the runnable in a new thread
	 * 
	 * @param connection the <code>Connection</code> that controls this data receiver.
	 * @return the instance
	 */
	public static PackageSender newPackageSender(final Connection connection) {
		PackageSender sender = new PackageSender(connection);
		Thread thread = new Thread(sender, "PackageSender");
		thread.setDaemon(true);
		thread.start();
		return sender;
	}

	private PackageSender(final Connection connection) {
		this.connection = connection;
		outgoingPackages = new ArrayList<AbstractPackage>();
	}

	/**
	 * Add a packet to be sent to the other side.
	 * 
	 * @param packet the packet
	 * @return the packet id after it was sent
	 * @throws InterruptedIOException
	 */
	public int sendPackage(final AbstractPackage packet) throws InterruptedIOException {
		if (!connection.isConnected()) {
			throw new InterruptedIOException();
		// log.debug("send: " + packet);
		}

		synchronized (outgoingPackages) {
			outgoingPackages.add(packet);
			outgoingPackages.notifyAll();
		}
		return packet.getId();
	}

	/**
	 * stop the sender thread.
	 */
	public void close() {
		interrupt = true;
		synchronized (outgoingPackages) {
			outgoingPackages.notifyAll();
		}
	}

	// ******************************************************** runnable methods

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		while (!interrupt && connection.isConnected()) {
			try {
				sendAvailablePackages();
			} catch (Exception e) {
				if (!(e instanceof IOException)) {
					logger.error(e.getMessage(), e);
				}
				interrupt = true;
			}
		}
		connection.close();
	}

	private void sendAvailablePackages() throws IOException {
		ArrayList<AbstractPackage> packagesToSend = new ArrayList<AbstractPackage>();
		synchronized (outgoingPackages) {
			while (!interrupt && outgoingPackages.isEmpty()) {
				try {
					outgoingPackages.wait();
				} catch (InterruptedException e) {
				}
			}
			packagesToSend.addAll(outgoingPackages);
			outgoingPackages.clear();
		}

		for (AbstractPackage packet : packagesToSend) {
			connection.writePackage(packet);
		}
	}

}
