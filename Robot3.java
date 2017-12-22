package bra1nh4ck;
import robocode.*;
//import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * Robot3 - a robot by (your name here)
 */
public class Robot3 extends AdvancedRobot
{
	public void run() {
		setAdjustGunForRobotTurn(true);
		setAdjustRadarForGunTurn(true);
		
		setTurnRadarRightRadians(Double.POSITIVE_INFINITY);
		
		turnRight(180.0 - getHeading());
		
		while(true){
			if(getDistanceToWall() < 50){
				setTurnLeft(90);
				ahead(100);
			}
			else{
				ahead(getDistanceToWall() - 50);
			}
		}
	}

	public void onScannedRobot(ScannedRobotEvent e) {
		setTurnRadarLeftRadians(getRadarTurnRemainingRadians());
	}
	
	public double getDistanceToWall(){
		double angle = getHeading();
		
		if(angle < 45.0 || angle > 315.0){
			return getBattleFieldHeight() - getY();
		}
		else if(angle >= 45.0 && angle < 135.0){
			return getBattleFieldWidth() - getX();
		}
		else if(angle >= 135.0 && angle < 225.0){
			return getY();
		}
		else{
			return getX();
		}
	}
	
	public void onHitWall(ScannedRobotEvent e){
		back(10);
	}
}
								