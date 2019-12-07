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

    double maxVal=0;
    double minVal=0;
    public void execute()
    {
        oi.inverter();
        drivetrain.setSpeed(oi.getLeft(), oi.getRight());
        double[] driveTriggers=oi.postDriveTriggers();
        if(driveTriggers.length>=2)
        {
            drivetrain.setSpeed(driveTriggers[0], driveTriggers[1]);
        }
//        drivetrain.setSpeed(oi.getForward()*(oi.getSideways()), oi.getForward()*(oi.getComplementSideways()));
    }

    //Never end command
    @Override
    protected boolean isFinished()
    {
        return false;
    }
}
