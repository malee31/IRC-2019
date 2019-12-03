package irc.robot.commands;

import irc.robot.OI;
import irc.robot.subsystems.Arm;

public class Lift
{
    private OI oi;
    private Arm arm;
    public Drive()
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