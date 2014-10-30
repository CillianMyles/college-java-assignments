/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Module: CT326
Assignment: 11
Program: Multithreaded Server class
Version: 1
Start date: 24/01/2014
Date of completion: 07/02/2014
*/

import java.io.*;
import java.net.*;

public class MultiThreadedServer {

	ServerSocket s;

	public MultiThreadedServer() {
		try {
			s = new ServerSocket(4444);
		} catch (IOException e) {
			System.out.println("Unable to create socket at 4444");
			System.exit(0);
		}

		int id = 0;
		while (true) {
			try {
				Socket clientSocket = s.accept();
				ClientServiceThread cliThread = new ClientServiceThread(clientSocket, id++);
				cliThread.start();
			} catch (IOException e) {
				System.out.println("Exception at accept()");
			}
		}
	}

	public static void main(String[] args) {
		new MultiThreadedServer();
	}

	class ClientServiceThread extends Thread {
		Socket cSock;
		File file;
		int ID = -1, blocksize;
		String filename, dir;
		byte[] buffer;
		Message ClientMsg;

		ClientServiceThread(Socket s, int clientID) {
			cSock = s;
			this.ID = clientID;
		}

		public void run() {
			while (true) {
				try {
					ObjectInputStream ois = new ObjectInputStream(
							cSock.getInputStream());
					ObjectOutputStream oos = new ObjectOutputStream(
							cSock.getOutputStream());

					ClientMsg = (Message) ois.readObject();
					oos.writeObject("Received HelloMsg");

					blocksize = ClientMsg.getBlocksize();
					filename = ClientMsg.getFilename();

					buffer = new byte[blocksize];
					dir = ClientMsg.getDir();
					oos.close();
					ois.close();

					if (dir.equalsIgnoreCase("UP")) {
						upload();
					} else if (dir.equalsIgnoreCase("DOWN")) {
						download();
					} else {
					}
				}

				catch (IOException e) {
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
		}

		private void download() {
			file = new File(filename);
			try {
				byte[] bytearray = new byte[(int) file.length()];
				@SuppressWarnings("resource")
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
				bis.read(bytearray, 0, bytearray.length);
				OutputStream os = cSock.getOutputStream();
				os.write(bytearray, 0, bytearray.length);
				os.flush();
				cSock.close();
			} catch (IOException e) {
			}
		}

		private void upload() {
			byte[] mybytearray = new byte[599999999];
			try {
				InputStream is = cSock.getInputStream();
				FileOutputStream fos = new FileOutputStream(filename);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				int bytesRead = is.read(mybytearray, 0, mybytearray.length);
				bos.write(mybytearray, 0, bytesRead);
				bos.close();
				cSock.close();
			} catch (IOException e) {
			}
		}
	}
}