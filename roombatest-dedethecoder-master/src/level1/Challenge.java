package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		
	    
		
	}
	/**
	 * Without touching the wall reach the endZone
	 * use sleep an 
	 */
	public void initialize() {
		//write code here!
		
		driveDirect(1000,1000);
		sleep(1500);
		driveDirect(0,1000);
		sleep(550);
		driveDirect(1000,1000);
		sleep(5000);
		driveDirect(0,1000);
		sleep(500);
		driveDirect(1000,1000);
		
		
	}

	public void loop() {
	
	}
}
