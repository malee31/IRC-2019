package irc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

public class Robot extends TimedRobot {

    // Runs when the robot is on.
    @Override
    public void robotPeriodic() {
    }

    // Runs once when autonomous starts.
    @Override
    public void autonomousInit() {
    }

    // Runs during autonomous.
    @Override
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    // Runs once when teleoperated starts.
    @Override
    public void teleopInit(){
    }

    // Runs during teleoperated.
    @Override
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
}