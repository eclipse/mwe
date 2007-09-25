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
package org.eclipse.emf.mwe.internal.core.debug.communication;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.mwe.internal.core.debug.communication.packets.AbstractPacket;

/**
 * This Runnable sends packets out asynchroniously as they arrive from customers.
 * 
 * @author Clemens Kadura (zAJKa)
 */
public class PacketSender implements Runnable {

	private ArrayList<AbstractPacket> outgoingPackets;
	
	private static final Log logger = LogFactory.getLog(PacketSender.class);

	private Connection connection;

	private boolean interrupt = false;

	/**
	 * create a new instance and starts the runnable in a new thread
	 * 
	 * @param connection the <code>Connection</code> that controls this data receiver.
	 * @return the instance
	 */
	public static PacketSender newPacketSender(Connection connection) {
		PacketSender sender = new PacketSender(connection);
		Thread thread = new Thread(sender, "PacketSender");
		thread.setDaemon(true);
		thread.start();
		return sender;
	}

	private PacketSender(Connection connection) {
		this.connection = connection;
		outgoingPackets = new ArrayList<AbstractPacket>();
	}

	/**
	 * Add a packet to be sent to the other side.
	 * 
	 * @param packet the packet
	 * @return the packet id after it was sent
	 * @throws InterruptedIOException
	 */
	public int sendPacket(AbstractPacket packet) throws InterruptedIOException {
		if (!connection.isConnected())
			throw new InterruptedIOException();
		// log.debug("send: " + packet);

		synchronized (outgoingPackets) {
			outgoingPackets.add(packet);
			outgoingPackets.notifyAll();
		}
		return packet.getId();
	}

	/**
	 * stop the sender thread.
	 */
	public void close() {
		interrupt = true;
		synchronized (outgoingPackets) {
			outgoingPackets.notifyAll();
		}
	}

	// ******************************************************** runnable methods

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		while (!interrupt && connection.isConnected())
			try {
				sendAvailablePackets();
			} catch (Exception e) {
				if (!(e instanceof IOException))
					logger.error(e.getMessage(), e);
				interrupt = true;
			}
		connection.close();
	}

	private void sendAvailablePackets() throws IOException {
		ArrayList<AbstractPacket> packetsToSend = new ArrayList<AbstractPacket>();
		synchronized (outgoingPackets) {
			while (!interrupt && outgoingPackets.isEmpty()) {
				try {
					outgoingPackets.wait();
				} catch (InterruptedException e) {
				}
			}
			packetsToSend.addAll(outgoingPackets);
			outgoingPackets.clear();
		}

		for (AbstractPacket packet : packetsToSend) {
			connection.writePacket(packet);
		}
	}

}
