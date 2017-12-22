package bra1nh4ck;

import robocode.*;
import bra1nh4ck.Territory;
//import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * Kaguya - a robot by Wada
 */
public class Kaguya extends AdvancedRobot {
	public void run() {
		Territory myTerritory = new Territory();
	}

	public moveToPoint(Point2D.Double p){
		double dx = p.getX() - getX();
		double dy = p.getY() - getY();
		double angle = Math.toDegrees(Math.atan2(dx, dy)) - getHeading();

		turnRight(angle);
		ahead(Math.sqrt(dx * dx + dy * dy));
	}
}
