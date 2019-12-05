package irc.robot.commands;

import edu.wpi.first.wpilibj.command.TimedCommand;
import irc.robot.subsystems.Drivetrain;

public class Auto extends TimedCommand
{
    Drivetrain drivetrain;
    public Auto(int time)
    {
        super(time);
        drivetrain = Drivetrain.getInstance();
        requires(drivetrain);
    }

    protected void execute()
    {
        drivetrain.setSpeed(1, 1);
    }

    protected void end()
    {
        drivetrain.setSpeed(0, 0);
    }

    protected void interrupted()
    {
        end();
    }
}
