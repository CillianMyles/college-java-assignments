import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
	static DatagramPacket sendPacket;
	static DatagramPacket receivePacket;
	static DatagramSocket socket;
	static String dir, filename, reply;
	static int blocksize;
	static FTP myFTP;
	static File file;
	private static int nextID = 0;
	private static long ID;

	public static void main(String[] args) throws ClassNotFoundException {

		System.out.println("Enter UP to upload data, Enter DOWN to download data");
		Scanner s = new Scanner(System.in);
		dir = s.nextLine();
		if (dir.equalsIgnoreCase("UP") || dir.equalsIgnoreCase("DOWN")) {
		} else {
		}

		System.out.println("Please enter the filename");
		filename = s.nextLine();
		System.out.println("Please enter the blocksize");
		blocksize = s.nextInt();
		System.out.printf("Direction: %s%nFilename: %s%nBlocksize: %d%n", dir,
				filename, blocksize);
		s.close();

		myFTP = new FTP(ID = nextID++, filename, dir);
		try {

			byte data[] = toByteArray(myFTP);
			// create sendPacket
			sendPacket = new DatagramPacket(data, data.length,
					InetAddress.getLocalHost(), 43210);
			// send packet
			socket.send(sendPacket);

		} catch (SocketException socketException) {
			socketException.printStackTrace();
			System.exit(1);
		} catch (IOException e) {
			e.printStackTrace();
		}

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
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return bytes;
	}

	public static Object toObject(byte[] bytes) {
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

	private static void receiveFile() throws IOException {
		byte[] mybytearray = new byte[2048];
		InputStream is = ((Object) socket).getInputStream();
		FileOutputStream fos = new FileOutputStream("client/" + filename);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int bytesRead = is.read(mybytearray, 0, mybytearray.length);
		bos.write(mybytearray, 0, bytesRead);
		bos.close();
		socket.close();
	}

	private static void sendFile() {
		file = new File("client/" + filename);
		try {
			byte[] myByteArray = new byte[(int) file.length()];
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
			bis.read(myByteArray, 0, myByteArray.length);
			OutputStream os = ((Object) socket).getOutputStream();
			os.write(myByteArray, 0, myByteArray.length);
			os.flush();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}