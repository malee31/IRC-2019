package irc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import irc.robot.OI;
import irc.robot.subsystems.Drivetrain;

public class Drive extends Command
{
    private OI oi;
    private Drivetrain drivetrain;
    public Drive()
    {
        oi = OI.getInstance();
        drivetrain = Drivetrain.getInstance();
        requires(drivetrain);
    }

    public void execute()
    {
        drivetrain.setSpeed(oi.getLeftJoy(), oi.getRightJoy());
    }

    //Never end command
    @Override
    protected boolean isFinished()
    {
        return false;
    }
}
