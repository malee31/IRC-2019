package irc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem
{
    private static Drivetrain instance;
    private VictorSP leftMasterVictor, rightMasterVictor;
    public Drivetrain()
    {
        leftMasterVictor=new VictorSP(7);
        rightMasterVictor=new VictorSP(6);
    }
    private static Drivetrain getInstance()
    {
        if(instance==null)
        {
            instance=new Drivetrain();
        }
        return instance;
    }

    @Override
    private void initDefaultCommand
    {
        setDefaultCommand(new Drive());
    }
}