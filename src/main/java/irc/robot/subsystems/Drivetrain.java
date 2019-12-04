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
        leftMasterVictor=new VictorSP(8);
        rightMasterVictor=new VictorSP(9);
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
    protected void initDefaultCommand()
    {
        setDefaultCommand(new Drive());
    }
}