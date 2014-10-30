/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Module: CT326
Assignment: 11
Program: Client class 
Version: 1
Start date: 24/01/2014
Date of completion: 07/02/2014
*/

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ServerClient {

	static String dir, filename, reply;
	static int blocksize;
	static Message hello;
	static File file;
	static Socket socket;

	public static void main(String[] args) throws ClassNotFoundException {

		System.out.println("Please type 'UP' to upload, 'DOWN' to download data");
		Scanner scan = new Scanner(System.in);
		dir = scan.nextLine();
		if (dir.equalsIgnoreCase("UP") || dir.equalsIgnoreCase("DOWN")) {

			System.out.println("Enter filename");
			filename = scan.nextLine();
			System.out.println("Enter blocksize");
			blocksize = scan.nextInt();
			System.out.printf("Direction: %s%nFilename: %s%nBlocksize: %d%n",
					dir, filename, blocksize);
			scan.close(); 
		} else {
			System.exit(0);
		}

		hello = new Message(filename, blocksize, dir);

		try {
			socket = new Socket(InetAddress.getLocalHost(), 4444);
			ObjectInputStream ois = new ObjectInputStream(
					socket.getInputStream());
			ObjectOutputStream oos = new ObjectOutputStream(
					socket.getOutputStream());

			oos.writeObject(hello);

			reply = (String) ois.readObject();
			System.out.println(reply);

			oos.flush();
			oos.close();
			ois.close();

			if (dir.equalsIgnoreCase("UP")) {
				sendFile();
			} else
				receiveFile();
		} catch (IOException e) {
		}
	}

	private static void receiveFile() throws IOException {
		byte[] mybytearray = new byte[599999999];
		InputStream is = socket.getInputStream();
		FileOutputStream fos = new FileOutputStream(filename);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int bytesRead = is.read(mybytearray, 0, mybytearray.length);
		bos.write(mybytearray, 0, bytesRead);
		bos.close();
		socket.close();
	}

	private static void sendFile() {
		file = new File(filename);
		try {
			byte[] mybytearray = new byte[(int) file.length()];
			@SuppressWarnings("resource")
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
			bis.read(mybytearray, 0, mybytearray.length);
			OutputStream os = socket.getOutputStream();
			os.write(mybytearray, 0, mybytearray.length);
			os.flush();
			socket.close();
		} catch (IOException e) {
		}
	}
}