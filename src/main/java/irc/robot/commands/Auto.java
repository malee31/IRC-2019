package irc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import irc.robot.subsystems.Arm;
import irc.robot.subsystems.Drivetrain;

public class Auto extends Command
{
    private Drivetrain drivetrain;
    private Arm arm;
    public Auto()
    {
        drivetrain = Drivetrain.getInstance();
        arm = Arm.getInstance();
        requires(drivetrain);
    }

    public void execute()
    {
//        drivetrain.setSpeed(oi.getLeftJoy(), oi.getRightJoy());
    }

    //Never end command
    @Override
    protected boolean isFinished()
    {
        return false;
    }
}