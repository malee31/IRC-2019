package irc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import irc.robot.commands.Lift;

public class Arm extends Subsystem
{
    private static Arm instance;
    private VictorSP armMasterVictor;
    private Arm
    {
        //channel needs config
        armMasterVictor=new VictorSP(0);
    }
    public static Arm getInstance()
    {
        if(instance==null)
        {
            instance=new Arm();
        }
        return instance;
    }

    public void setSpeed (double value)
    {
        armMasterVictor.setSpeed(value);
    }

    @Override
    private void initDefaultCommand()
    {
        setDefaultCommand(new Lift());
    }
}
