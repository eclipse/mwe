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

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.ServerSocket;
import java.net.Socket;

import org.eclipse.emf.mwe.internal.core.debug.communication.packets.AbstractPacket;
import org.eclipse.emf.mwe.internal.core.debug.communication.packets.HandshakePacket;

/**
 * This class implements a socket connection model. "Packets" (units of information) can be transfered between two
 * different virtual machines. During the initialisation of a socket connection a reader and a writer thread are
 * established. This class can be used both on the sender and receiver side.
 */
public class Connection {

	private ServerSocket ssocket;

	private Socket socket;

	private DataOutputStream out;

	private DataInputStream in;

	private PacketSender sender;

	private PacketReceiver receiver;

	// -------------------------------------------------------------------------
	// *the* main operation methods

	public AbstractPacket listenForPacket(final Class<? extends AbstractPacket> type) throws InterruptedIOException {
		return receiver.getPacket(type, -1);
	}

	public AbstractPacket listenForPacket(final Class<? extends AbstractPacket> type, final int refId) throws InterruptedIOException {
		return receiver.getPacket(type, refId, -1);
	}

	public int sendPacket(final AbstractPacket packet) throws IOException {
		if (sender == null) {
			return -1;
		}
		return sender.sendPacket(packet);
	}

	// -------------------------------------------------------------------------
	// socket communication handling

	/**
	 * create a new <code>ServerSocket</code>.
	 * 
	 * @param port the communication port
	 * @throws IOException
	 */
	public void startListeningSocket(final int port) throws IOException {
		ssocket = new ServerSocket(port);
	}

	/**
	 * the server listens for a client to connect, creates new reader and writer threads and sends a first
	 * handshake packet to test the communication
	 * 
	 * @param timeout
	 * @throws IOException
	 */
	public void accept(final int timeout) throws IOException {
		ssocket.setSoTimeout(timeout);
		// will throw SocketTimeoutException, if nobody connects
		socket = ssocket.accept();
		establishReaderAndWriter();
		if (!writeHandshake()) {
			throw new IOException("handshake failed");
		}
	}

	/**
	 * the client establishes the connection here, creates new reader and writer threads and waits for a handshake
	 * packet to be received from the server
	 * 
	 * @param port
	 * @throws IOException
	 */
	public void connect(final int port) throws IOException {
		socket = new Socket("localhost", port);
		establishReaderAndWriter();
		replyHandshake();
	}

	/**
	 * @return if the socket connection is still active
	 */
	public boolean isConnected() {
		return (socket != null) && !socket.isClosed();
	}

	/**
	 * close and dispose the socket and the (possibly waiting) sender thread
	 */
	public void close() {
		try {
			if (sender != null) {
				sender.close();
			}
			if (socket != null) {
				out.close();
				in.close();
				socket.close();
				out = null;
				in = null;
			}
			sender = null;
			socket = null;
			ssocket.close();
			ssocket = null;
		} catch (Exception e) {
			// IOExceptions and NullPointerExceptions may occur
		}
	}

	// -------------------------------------------------------------------------
	// the real sending and receiving of packets to be called from PacketReceiver and PacketSender only

	protected AbstractPacket readPacket() throws IOException {
		String className = in.readUTF();
		AbstractPacket packet = instantiatePacket(className);
		packet.readContent(in);
		// System.out.println(Thread.currentThread().getName() + "-RECEIVED-: " + packet);
		return packet;
	}

	@SuppressWarnings("unchecked")
	private AbstractPacket instantiatePacket(final String className) throws IOException {
		Class<? extends AbstractPacket> packetClass = null;
		AbstractPacket packet = null;
		String msg = null;
		try {
			packetClass = (Class<? extends AbstractPacket>) Class.forName(className);
		} catch (ClassNotFoundException e) {
			msg = "Couldn't find " + className + " in the classpath.";
		}

		if (msg == null) {
			Constructor c = packetClass.getConstructors()[0];
			Class[] parmTypes = c.getParameterTypes();
			Object[] initargs = new Object[parmTypes.length];
			for (int i = 0; i < parmTypes.length; i++) {
				if (parmTypes[i] == int.class) {
					initargs[i] = 0;
				}
			}
			try {
				packet = (AbstractPacket) c.newInstance(initargs);
			} catch (IllegalArgumentException e) {
				msg = "Couldn't instantiate " + c + " : " + e;
			} catch (InstantiationException e) {
				msg = "Couldn't instantiate " + c + " : " + e;
			} catch (IllegalAccessException e) {
				msg = "Couldn't instantiate " + c + " : " + e;
			} catch (InvocationTargetException e) {
				msg = "Problem during instantiation of " + c + " : " + e.getTargetException();
			}
		}

		if (msg != null) {
			System.err.println(msg);
			throw new IOException(msg);
		}
		return packet;
	}

	protected void writePacket(final AbstractPacket packet) throws IOException {
		out.writeUTF(packet.getClass().getName());
		packet.writeContent(out);
		// System.out.println(Thread.currentThread().getName() + "-SENT-----: " + packet);
	}

	// ********************************************************* private methods

	private void establishReaderAndWriter() throws IOException {
		out = new DataOutputStream(socket.getOutputStream());
		in = new DataInputStream(socket.getInputStream());

		// start receiver and sender in extra threads
		receiver = PacketReceiver.newPacketReceiver(this);
		sender = PacketSender.newPacketSender(this);

	}

	private boolean writeHandshake() throws IOException {
		AbstractPacket packet = new HandshakePacket();
		sendPacket(packet);
		return listenForPacket(HandshakePacket.class).getClass().equals(HandshakePacket.class);
	}

	private void replyHandshake() throws IOException {
		if (listenForPacket(HandshakePacket.class).getClass().equals(HandshakePacket.class)) {
			sendPacket(new HandshakePacket());
		} else {
			throw new IOException("handshake failed");
		}
	}

}
