package bra1nh4ck;

import robocode.*;
//import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * CRobot - a robot by Kazuma Wada
 */
public class CRobot extends Robot {
  public void run() {
    double width = getBattleFieldWidth();
    double height = getBattleFieldHeight();

    while (true) {
      moveToPoint(width / 2, 0);
      moveToPoint(width, height / 2);
      moveToPoint(width / 2, height);
      moveToPoint(0, height / 2);
    }
  }

  public void onScannedRobot(ScannedRobotEvent e) {
    fire(1);
  }

  public void onHitByBullet(HitByBulletEvent e) {
  }

  public void onHitWall(HitWallEvent e) {
  }

  private void moveToPoint(double x, double y) {
    double dx = x - getX();
    double dy = y - getY();
    double angle = Math.toDegrees(Math.atan2(dx, dy)) - getHeading();

    turnRight(angle);
    ahead(Math.sqrt(dx * dx + dy * dy));
  }
}
