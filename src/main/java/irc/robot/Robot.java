package irc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import irc.robot.commands.Auto;
import irc.robot.subsystems.Arm;
import irc.robot.subsystems.Drivetrain;

//https://wpilib.screenstepslive.com/s/currentCS/m/java/l/599745-scheduling-commands
//https://wpilib.screenstepslive.com/s/currentCS/m/cpp/l/241902-creating-simple-commands
//https://wpilib.screenstepslive.com/s/currentCS/m/java/l/599739-running-commands-on-joystick-input

public class Robot extends TimedRobot
{
    Drivetrain drivetrain;
    Arm arm;
    // Runs when the robot first turns on
    @Override
    public void robotInit()
    {
        drivetrain = Drivetrain.getInstance();
        arm = Arm.getInstance();
    }

//    Periodics run every 20ms at 500 times/s
    // Runs when the robot is on.
    @Override
    public void robotPeriodic()
    {

    }

    // Runs once when autonomous starts.
    Command auto = new Auto(6);
    @Override
    public void autonomousInit()
    {

    }

    // Runs during autonomous.
    @Override
    public void autonomousPeriodic()
    {
        Scheduler.getInstance().run();
    }

    // Runs once when teleoperated starts.
    @Override
    public void teleopInit()
    {

    }

    // Runs during teleoperated.
    @Override
    public void teleopPeriodic()
    {
        Scheduler.getInstance().run();
    }
}