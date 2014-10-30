/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Module: CT326
Assignment: 8
Program: GUI which allows user to edit power, intensity, and timer, of a light bulb
Version: 1
Start date: 29/10/2013
Date of completion: 14/10/2013
*/

package LightBulb;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LightBulbGUI extends JFrame {

	private static final long serialVersionUID = 3869878693074339292L;

	private ImageIcon light[] = {new ImageIcon("lightBulb0.jpg"), 
								new ImageIcon("lightBulb1.jpg"), 
								new ImageIcon("lightBulb2.jpg"), 			
								new ImageIcon("lightBulb3.jpg")};
	private Container container;
	private JLabel imageLabel;
	private JCheckBox power;
	private JComboBox schedule, intensity;
	private JButton status;
	private JPanel imagePanel, buttonPanel;
	private String scheduleOptions[] = {"Day", "Night", "Constant"};
	private String intensityOptions[] = {"20 Watts", "40 Watts", "60 Watts"};
	private LightBulb myLight = new LightBulb();

	LightBulbGUI() {
		
		super("Light Bulb Monitory Program");
		
		container = getContentPane();
		
		imageLabel = new JLabel(myLight.checkStatus(), light[0], SwingConstants.LEFT);
		imagePanel = new JPanel();
		imagePanel.add(imageLabel);
		imagePanel.setLayout(new GridLayout());
		container.add(imagePanel, BorderLayout.CENTER);
		
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(1, 4));
		
		power = new JCheckBox("On");
		power.setSelected(true);
		buttonPanel.add(power);
		
		schedule = new JComboBox(scheduleOptions); 
		schedule.addItemListener(
			new ItemListener() {
				
				public void itemStateChanged(ItemEvent event) {
					if (event.getStateChange() == ItemEvent.SELECTED) {
						myLight.setSchedule(schedule.getSelectedIndex());
						imageLabel.setText(myLight.checkStatus());
					}
				}		
			});
		buttonPanel.add(schedule);
		
		intensity = new JComboBox(intensityOptions);
		intensity.addItemListener(
				new ItemListener() {
					
					public void itemStateChanged(ItemEvent event) {
						if (event.getStateChange() == ItemEvent.SELECTED) {
							myLight.setIntensity(intensity.getSelectedIndex());
							imageLabel.setIcon(light[myLight.getIntensity()]);
							imageLabel.setText(myLight.checkStatus());
						}
					}		
				});
		buttonPanel.add(intensity);
		
		status = new JButton("Status"); 
		buttonPanel.add(status);
		
		container.add(buttonPanel, BorderLayout.SOUTH);
		
		CheckBoxHandler handler = new CheckBoxHandler();
		power.addItemListener(handler);
		
		ButtonHandler StatusHandler = new ButtonHandler();
		status.addActionListener(StatusHandler);
		
		setSize(500,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {

		LightBulbGUI application = new LightBulbGUI();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private class CheckBoxHandler implements ItemListener {

		public void itemStateChanged(ItemEvent event) {
			if (event.getStateChange() == ItemEvent.SELECTED) {
				myLight.setPower(true);
				schedule.setEnabled(true);
				intensity.setEnabled(true);
				imageLabel.setIcon(light[myLight.getIntensity()]);
				imageLabel.setText(myLight.checkStatus());
			}
			
			else {
				myLight.setPower(false);
				schedule.setEnabled(false);
				intensity.setEnabled(false);
				imageLabel.setIcon(light[3]);
				imageLabel.setText(myLight.checkStatus());
			}
		}	
	}
	
	private class ButtonHandler implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null, myLight.checkStatus(), "LIGHT BULB STATUS", JOptionPane.INFORMATION_MESSAGE);
		}	
	}
}