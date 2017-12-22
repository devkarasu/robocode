package bra1nh4ck;

import robocode.*;
//import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * RCycleRobot - a robot by Kazuma Wada
 */
public class RCycleRobot extends AdvancedRobot {
  public void run() {
    moveToPoint(10.0, 10.0);
    turnRight(90.0 + 360.0 - getHeading());
  }

  public void onScannedRobot(ScannedRobotEvent e) {
    fire(1);
  }

  private void moveToPoint(double x, double y) {
    double dx = x - getX();
    double dy = y - getY();
    double angle = Math.toDegrees(Math.atan2(dx, dy)) - getHeading();

    if(angle > 180.0){
      turnLeft(angle - 180.0);
    } else {
      turnRight(angle);
    }
    ahead(Math.sqrt(dx * dx + dy * dy));
  }
}
