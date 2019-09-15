package irc.robot;
import edu.wpi.first.wpilibj.RobotBase;

/**
 * Unless you know what you are doing, do not modify this file.
 */

public class Main {
    private Main() {
    }

    public static void main(String... args) {
        RobotBase.startRobot(Robot::new);
    }
}
