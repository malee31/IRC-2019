package lib;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class VictorSP extends TalonSRX {
    public VictorSP(int id) {
        super(id);

        super.configFactoryDefault();
    }

    public void setSpeed(double speed) {
        super.set(ControlMode.PercentOutput, speed);
    }
}
