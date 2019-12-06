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
        System.out.print(" Forward:"+oi.getForward());
        System.out.print(" Left:"+oi.getForward()*(oi.getSideways()));
        System.out.print(" Right: "+oi.getForward()*(oi.getComplementSideways()));
        System.out.print(" Y val: : "+oi.getSideways());
        System.out.println(" Forward:"+oi.getForward());

        drivetrain.setSpeed(oi.getLeft(), oi.getRight());
//        drivetrain.setSpeed(oi.getForward()*(oi.getSideways()), oi.getForward()*(oi.getComplementSideways()));
    }

    //Never end command
    @Override
    protected boolean isFinished()
    {
        return false;
    }
}
