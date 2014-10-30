import java.io.*;
import java.net.*;

public class Server {
	static DatagramPacket sendPacket;
	static DatagramPacket receivePacket;
	static DatagramSocket socket;
	static FTP recieveMsg;
	private static String filename;
	int clientID, blocksize;
	static String dir;

	public static void main(String args[]) throws ClassNotFoundException {
		try {
			DatagramSocket socket = new DatagramSocket(43210);
		} catch (SocketException socketException) {
			socketException.printStackTrace();
			System.exit(1);
		}
		while (true) {
			try {
				byte data[] = new byte[100];
				receivePacket = new DatagramPacket(data, data.length);
				// wait for packet
				socket.receive(receivePacket);
				recieveMsg = (FTP) toObject(receivePacket.getData());
				filename = recieveMsg.getFile();
				dir = recieveMsg.getDir();

				if (dir.equalsIgnoreCase("UP")) {
					uploadFromClient();
				} else
					downloadToClient();

			} catch (IOException ioException) {
				ioException.printStackTrace();
			}
		}
	}

	private static void sendPacketToClient() throws IOException {
		sendPacket = new DatagramPacket(receivePacket.getData(),
				receivePacket.getLength(), receivePacket.getAddress(),
				receivePacket.getPort());
		// send packet
		socket.send(sendPacket);
	}

	public static byte[] toByteArray(Object obj) {
		byte[] bytes = null;
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		try {
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(obj);
			oos.flush();
			oos.close();
			bos.close();
			bytes = bos.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bytes;
	}

	public static Object obj1(byte[] bytes) {
		Object obj = null;
		try {
			ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
			ObjectInputStream ois = new ObjectInputStream(bis);
			obj = ois.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return obj;
	}

	private static void downloadToClient() {

		File file = new File("server/" + filename);
		try {
			byte[] mybytearray = new byte[(int) file.length()];
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
			bis.read(mybytearray, 0, mybytearray.length);
			OutputStream os = ((Object) socket).getOutputStream();
			os.write(mybytearray, 0, mybytearray.length);
			os.flush();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void uploadFromClient() {
		byte[] mybytearray = new byte[2048];
		try {
			InputStream is = ((Object) socket).getInputStream();
			FileOutputStream fos = new FileOutputStream("server/" + filename);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			int bytesRead = is.read(mybytearray, 0, mybytearray.length);
			bos.write(mybytearray, 0, bytesRead);
			bos.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}