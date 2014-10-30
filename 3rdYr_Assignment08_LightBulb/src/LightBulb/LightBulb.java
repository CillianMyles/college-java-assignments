/* 
Author: Cillian Myles
ID: 11424252
Course: 3BP1
Module: CT326
Assignment: 8
Program: Light bulb object class with constructor, accessor, and check status methods
Version: 1
Start date: 29/10/2013
Date of completion: 14/10/2013
*/

package LightBulb;

public class LightBulb {

	private boolean power;
	private int intensity;
	private int schedule;
	
	public LightBulb() {
		power = true;
		intensity = 0;
		schedule = 0;
	}
	
	public LightBulb(boolean on, int brightness, int timer) {
		power = on;
		intensity = brightness;
		schedule = timer;
	}
	
	public void setPower(boolean on) {
		power = on;
	}
	
	public void setIntensity(int brightness) {
		intensity = brightness;
	}
	
	public void setSchedule(int timer) {
		schedule = timer;
	}
	
	public boolean getPower() {
		return power;
	}

	public int getIntensity() {
		return intensity;
	}
	
	public int getSchedule() {
		return schedule;
	}
	
	public String checkStatus() {
		String title = "Power: ";
		
		if (power) {
			title += "ON";
		
			if (intensity == 0) title += "\nIntensity: 20 Watts";
			else if (intensity == 1) title += "\nIntensity: 40 Watts";
			else if (intensity == 2) title += "\nIntensity: 60 Watts";
			else title += "\nERROR: CANNOT IDENTIFY BRIGHTNESS";
			
			if (schedule == 0) title += "\nRunning: DAY TIMER\n";
			else if (schedule == 1) title += "\nRunning: NIGHT TIMER\n";
			else if (schedule == 2) title += "\nRunning: CONSTANT\n";
			else title += "\nERROR: CANNOT IDENTIFY TIMER\n";
		}
		else title += "OFF";
		
		return title;
	}
}
