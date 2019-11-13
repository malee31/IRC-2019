package irc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm extends Subsystem
{
    private static Arm instance;
    VictorSP armMasterVictor;
    public Arm
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
}
