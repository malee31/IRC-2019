package irc.robot;

//import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;

import javax.sql.XAConnectionBuilder;

public class OI
{
	private static OI instance;
//	private Joystick leftJoy, rightJoy;
	private XboxController xboxController;

	private OI()
	{
//		leftJoy = new Joystick(1);
//		rightJoy = new Joystick(2);
		xboxController = new XboxController(1); //port number
//		Joysticks have buttons too
	}

	public static OI getInstance()
	{
		if (instance == null)
		{
			instance = new OI();
		}
        return instance;
	}

//	public double getLeftJoy()
//	{
//		return leftJoy.getY();
//	}
//
//	public double getRightJoy()
//	{
//		return rightJoy.getY();
//	}

    public double getTrigger()
    {
        return (double)(xboxController.getTriggerAxis(GenericHID.Hand.kRight));
    }

	public double getForward()
	{
		return xboxController.getY();
	}

	public double getSideways()
	{
		return xboxController.getX();
	}

	public double getComplementSideways()
	{
	    if(getSideways()<0)
        {
            return (1-Math.abs(getSideways()))*-1;
        }
		return (1-Math.abs(getSideways()));
	}

	public double getArmSpeed()
    {
        double speed=0.0;
        if(xboxController.getBumper(GenericHID.Hand.kLeft))
        {
            speed+=1;
        }
        if(xboxController.getBumper(GenericHID.Hand.kRight))
        {
            speed-=1;
        }
        return speed;
    }
//	XBoxController also has getA() getB() getXButton() getYButton() getBumperButton() getBackButton()
//	every button's on Released and Pressed and some triggeraxis
//	https://first.wpi.edu/FRC/roborio/beta/docs/java/edu/wpi/first/wpilibj/XboxController.html
}