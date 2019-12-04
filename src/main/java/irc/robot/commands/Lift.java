package irc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import irc.robot.OI;
import irc.robot.subsystems.Arm;

public class Lift extends Command
{
    private OI oi;
    private Arm arm;
    public Lift()
    {
        oi = OI.getInstance();
        arm = Arm.getInstance();
        requires(arm);
    }

    public void execute()
    {
//        arm.setSpeed(/*value*/)
    }

    //Never end command
    @Override
    protected boolean isFinished()
    {
        return false;
    }
}
