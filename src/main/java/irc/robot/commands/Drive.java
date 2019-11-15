package irc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import irc.robot.Oi;
import irc.robot.subsystems.Drivetrain;

public class Drive extends Command
{
    private Oi oi;
    private Drivetrain drivetrain;
    public Drive()
    {
        oi = Oi.getInstance();
        drivetrain = Drivetrain.getInstance();
        requires(drivetrain);
    }

    public void execute()
    {
        
    }
}
