package bra1nh4ck;
import robocode.*;
import robocode.util.Utils;
//import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * Robot24November - a robot by (your name here)
 */
public class Robot24November extends AdvancedRobot
{ 
public void run() {
    // ...
 
    turnRadarRightRadians(Double.POSITIVE_INFINITY);
    do {
        // Check for new targets.
        // Only necessary for Narrow Lock because sometimes our radar is already
        // pointed at the enemy and our onScannedRobot code doesn't end up telling
        // it to turn, so the system doesn't automatically call scan() for us
        // [see the javadocs for scan()].
        scan();
    } while (true);
}
 
public void onScannedRobot(ScannedRobotEvent e) {
    double radarTurn =
        // Absolute bearing to target
        getHeadingRadians() + e.getBearingRadians()
        // Subtract current radar heading to get turn required
        - getRadarHeadingRadians();
 
    setTurnRadarRightRadians(Utils.normalRelativeAngle(radarTurn));
 
    // ...
}
}
								