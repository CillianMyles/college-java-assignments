/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Module: CT326
Assignment: 9
Program: *Applet that takes string and displays it centred in an Applet 
		 *Flashing occurs by default, mouse click stops/starts the flashing
		 *Applet uses HTML parameters
Version: 1
Start date: 21/11/2013
Date of completion: 22/11/2013
*/

package Applet;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class FlashingLabel extends Applet implements Runnable, MouseListener {

	private static final long serialVersionUID = -1026559995895182179L;
	Thread flashingThread = null;
	String message;
	int xPos, yPos, sleepTime;
	Color color;
	boolean flashing = false;
	Font font1 = null;

	public void init() {
		
		xPos = (getSize().width)/2;
		yPos = (getSize().height)/2;

		setSize(575,200);

		String timeInStr = this.getParameter("TIME");
		if (timeInStr == null) timeInStr = "500";
		sleepTime = Integer.parseInt(timeInStr);

		message = this.getParameter("MESSAGE");
		if (message == null) message = "FLASHING LABEL";

		String fontString = this.getParameter("FONT");
		if (fontString == null) fontString = "Calibri";
		font1 = new Font(fontString, Font.BOLD, 50);

		addMouseListener(this);
	}

	public void start() {
				
		if (flashingThread == null) {
			flashingThread = new Thread(this);
			flashing = true;
			flashingThread.start();
		}
	}

	public void run() {
		
		while (true) {
			if (flashing) {
				color = new Color(050);
				repaint();
				
				try {
					Thread.sleep(sleepTime);
				} catch (InterruptedException e) {
				}

				color = new Color(511);
				repaint();
				
				try {
					Thread.sleep(sleepTime);
				} catch (InterruptedException e) {
				}
			} else {
				repaint();
			}
		}
	}

	public void paint(Graphics g) {
		g.setColor(color);
		g.setFont(font1);
		g.drawString(message, xPos, yPos);
	}
	
	public void mouseClicked(MouseEvent event) {
			flashing = !flashing;
	}
	
	public void mouseEntered(MouseEvent event) {}
	public void mouseExited(MouseEvent event) {}
	public void mousePressed(MouseEvent event) {}
	public void mouseReleased(MouseEvent event) {}
}