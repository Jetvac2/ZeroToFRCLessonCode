// Imports
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.TalonSRXConfiguration;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class MotorExample {
    private CANSparkMax m_sparkMotor;
  
    public MotorExample() {
        this.m_sparkMotor = new CANSparkMax(0, MotorType.kBrushless);
        m_sparkMotor.restoreFactoryDefaults();
        this.m_sparkMotor.setInverted(false);
        this.m_sparkMotor.setIdleMode(IdleMode.kBrake);

        // Sets the current limit to 20
        // Make sure to look at REV robotics or Anymark to see what the max voltage of
        //your motor is to make sure that you do not kill it.
        m_sparkMotor.setSmartCurrentLimit(20);
        this.m_sparkMotor.burnFlash();
    }    
}
