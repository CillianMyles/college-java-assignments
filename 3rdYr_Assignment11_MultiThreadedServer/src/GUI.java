/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Module: CT326
Assignment: 11
Program: GUI 
Version: 1
Start date: 24/01/2014
Date of completion: 07/02/2014
*/

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

import javax.swing.*;

public class GUI extends JFrame {

	private static final long serialVersionUID = -7299385698667373845L;
	private static JTextField textField1;
	private static JTextField textField2;
	private Container container;
	private JButton uploadButton, downloadButton;
	private GridLayout grid;
	static String dir, filename, reply;
	static int blocksize;
	static Message hello;
	static File file;
	static Socket socket;

	GUI() {

		super("Multithreaded Server Application");

		container = getContentPane();
		grid = new GridLayout(2, 3, 5, 5);
		container.setLayout(grid);

		textField1 = new JTextField("File name");
		container.add(textField1);

		textField2 = new JTextField("Block size");
		container.add(textField2);

		uploadButton = new JButton("Upload");
		container.add(uploadButton);

		downloadButton = new JButton("Download");
		container.add(downloadButton);

		ButtonHandler handler = new ButtonHandler();
		uploadButton.addActionListener(handler);
		downloadButton.addActionListener(handler);

		setSize(500, 300);
		setVisible(true);
	}

	public static void main(String[] args) throws ClassNotFoundException {
		GUI application = new GUI();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private static class ButtonHandler implements ActionListener  {

		public void actionPerformed(ActionEvent event) {
			filename = textField1.getText();
			String block = Integer.toString(blocksize);
			block = textField2.getText();

			if (event.getActionCommand() == "Upload") {
				dir = "UP";
			}

			else if (event.getActionCommand() == "Download") {
				dir = "DOWN";
			}

			System.out.printf("Direction: %s%nFilename: %s%nBlocksize: %d%n",
					dir, filename, block);
			
			hello = new Message(filename, blocksize, dir);
		}
	}
}
