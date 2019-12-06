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
        System.out.print("Forward:"+oi.getForward());
        System.out.print("Left:"+oi.getForward()*(oi.getSideways()));
        System.out.print("Right: "+oi.getForward()*(oi.getComplementSideways()));
        System.out.print("Y val: : "+oi.getSideways());
        System.out.print("Point dir: : "+oi.getTrigger());
        System.out.print("Forward:"+oi.getForward());
        drivetrain.setSpeed(oi.getForward()*(oi.getSideways()), oi.getForward()*(oi.getComplementSideways()));
    }

    //Never end command
    @Override
    protected boolean isFinished()
    {
        return false;
    }
}
