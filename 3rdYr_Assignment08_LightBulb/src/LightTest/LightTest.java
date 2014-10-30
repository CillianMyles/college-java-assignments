package LightTest;

import LightBulb.LightBulb;

public class LightTest {

	public static void main(String[] args) {

		LightBulb myLight = new LightBulb(false, 0, 0);
		System.out.println(myLight.checkStatus());
		
		LightBulb myLight1 = new LightBulb(true, 0, 0);
		System.out.println(myLight1.checkStatus());
		
		LightBulb myLight2 = new LightBulb(true, 1, 1);
		System.out.println(myLight2.checkStatus());
		
		LightBulb myLight3 = new LightBulb(true, 2, 2);
		System.out.println(myLight3.checkStatus());
	}
}
