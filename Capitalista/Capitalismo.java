package Capitalista;


import robocode.AdvancedRobot;
import robocode.HitRobotEvent;
import robocode.ScannedRobotEvent;

import java.awt.*;


/**
 * SpinBot - a sample robot by Mathew Nelson.
 * <p>
 * Moves in a circle, firing hard when an enemy is detected.
 *
 * @author Mathew A. Nelson (original)
 * @author Flemming N. Larsen (contributor)
 */
public class Capitalismo extends AdvancedRobot {

	/**
	 * SpinBot's run method - Circle
	 */
//	private move;
	public void run() {
		// Set colors
		setBodyColor(Color.green);
		setGunColor(Color.white);
		setRadarColor(Color.blue);
		setScanColor(Color.yellow);

		// Loop forever
		while (true) {
			setTurnLeft(105);
			setMaxVelocity(10000);
			ahead(300);
			turnGunRight(360);
			back(75);
			
		}
	}

	/**
	 * onScannedRobot: Fire hard!
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		fire(3);
	}

	/**
	 * onHitRobot:  If it's our fault, we'll stop turning and moving,
	 * so we need to turn again to keep spinning.
	 */
	public void onHitRobot(HitRobotEvent e) {
		if (e.getBearing() > -10 && e.getBearing() < 10) {
			fire(3);
		}
		if (e.isMyFault()) {
			turnRight(10);
		}
	}
	

}
