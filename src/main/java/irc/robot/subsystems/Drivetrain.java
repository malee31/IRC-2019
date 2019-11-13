package irc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem
{
    private static Drivetrain instance;
    public Drivetrain()
    {
        
    }
    public Drivetrain getInstance()
    {
        if(instance==null)
        {
            instance=new Drivetrain();
        }
        return instance;
    }
}
