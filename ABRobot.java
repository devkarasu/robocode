package bra1nh4ck;

import robocode.*;
//import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * ABRobot - a robot by Kazuma Wada
 */
public class ABRobot extends Robot {
  public void run() {
	moveToFarthestCorner();
  }

  public void onScannedRobot(ScannedRobotEvent e) {
    fire(1);
  }

  public void onHitByBullet(HitByBulletEvent e) {
  }

  public void onHitWall(HitWallEvent e) {
    turnRight(90);
  }

  private void moveToFarthestCorner() {
    double x = getX();
    double y = getY();
    double width = getBattleFieldWidth();
    double height = getBattleFieldHeight();

    double cornerX, cornerY;
    if (width - x > width / 2) {
      cornerX = width;
    } else {
      cornerX = 0;
    }

    if (height - y > height / 2) {
      cornerY = height;
    } else {
      cornerY = 0;
    }

    moveToPoint(cornerX, cornerY);
  }

  private void moveToPoint(double x, double y) {
    double dx = x - getX();
    double dy = y - getY();
    double angle = Math.toDegrees(Math.atan2(dx, dy)) - getHeading();

    turnRight(angle);
    ahead(Math.sqrt(dx * dx + dy * dy));
  }
}
