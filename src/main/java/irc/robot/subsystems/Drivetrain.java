package irc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import irc.robot.commands.Drive;

public class Drivetrain extends Subsystem
{
    private static Drivetrain instance;
    private static VictorSP leftMasterVictor, rightMasterVictor;
    private Drivetrain()
    {
        leftMasterVictor=new VictorSP(7);
        rightMasterVictor=new VictorSP(6);
    }
    public static Drivetrain getInstance()
    {
        if(instance==null)
        {
            instance=new Drivetrain();
        }
        return instance;
    }

    public void setSpeed (double left, double right)
    {
        leftMasterVictor.setSpeed(left);
        rightMasterVictor.setSpeed(right);
    }

    @Override
    private void initDefaultCommand
    {
        setDefaultCommand(new Drive());
    }
}