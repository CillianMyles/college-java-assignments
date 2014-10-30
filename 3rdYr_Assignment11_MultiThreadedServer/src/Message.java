/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Module: CT326
Assignment: 11
Program: Test Message class 
Version: 1
Start date: 24/01/2014
Date of completion: 07/02/2014
 */

public class Message {
	
	public String filename;
	public int blocksize;
	public String direction;

	public Message() {
		filename = null;
		blocksize = 0;
		direction = null;
	}

	public Message(String file, int size, String dir) {
		filename = file;
		blocksize = size;
		direction = dir;
	}

	public int getBlocksize() {
		return blocksize;
	}

	public String getFilename() {
		return filename;
	}

	public String getDir() {
		return direction;
	}
}
