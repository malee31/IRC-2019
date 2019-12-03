package irc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;

public class OI
{
	private static OI instance;
	private Joystick leftJoy, rightJoy;
//	private XboxController xboxController;

	private OI()
	{
		leftJoy = new Joystick(1);
		rightJoy = new Joystick(2);
//		xboxController = new XboxController(1) //port number
	}

	public static OI getInstance()
	{
		if (instance == null)
		{
			instance = new OI();
		}
        return instance;
	}

	public double getLeftJoy()
	{
		return leftJoy.getY();
	}

	public double getRightJoy()
	{
		return rightJoy.getY();
	}

	// 20 millisecond loop or 500 times a second lol
	public void execute()
	{
		// Drivetrain.setSpeeduses OI values from Joysticks/controllers
		drivetrain.setSpeed(oi.getLeftJoy(), oi.getRightJoy());
	}

//	public double getX()
//	{
//		return xboxController.getX();
//	}
//
//	public double getY()
//	{
//		return xboxController.getY();
//	}
//	XBoxController also has getA() getB() getXButton() getYButton() getBumperButton() getBackButton()
//	every button's on Released and Pressed and some triggeraxis
//	https://first.wpi.edu/FRC/roborio/beta/docs/java/edu/wpi/first/wpilibj/XboxController.html
}