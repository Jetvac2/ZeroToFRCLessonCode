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
    // When nameing a motor in FRC always prefix the name with m_.
    // This is a motor that is connected to a SparkMax motor controler
    private CANSparkMax m_sparkMotor;

    // This is a motor that is connected to a TalonSRX motor controler
    private TalonSRX m_CTREMotor;

    public MotorExample() {
        // CANSparkMax(CAN ID, type)
        this.m_sparkMotor = new CANSparkMax(0, MotorType.kBrushless);

        // WPI_TalonSRX(CAN ID)
        this.m_CTREMotor = new WPI_TalonSRX(1);
        // Inverts the motor direction
        this.m_sparkMotor.setInverted(false);

        // Sets the idke mode to break, basicly makes the motor break when it is not being told to move.
        // You almost allways want it to be break

        // Sets the spark max to defult settings, always start by doing this
        m_sparkMotor.restoreFactoryDefaults();
        
        this.m_sparkMotor.setIdleMode(IdleMode.kBrake);
        
        // Sets the motor config to the settings selected above.
        this.m_sparkMotor.burnFlash();

        // Tells the motor how much current to pull, determents its speed, on a range from -1, 1.
        // Can be thought of as telling the motor to move at blank persent power. 
        // Negitives have the motor turn in reverse.
        // The motor will continue at this power untill it is changed
        this.m_sparkMotor.set(.5);
        
        // Creates a CTRE configeration
        TalonSRXConfiguration srxConfigs = new TalonSRXConfiguration();
        // Sets the minimum power both directions.
        srxConfigs.nominalOutputForward = 0;
        srxConfigs.nominalOutputReverse = 0;
         // Sets the max power for both directions.
        srxConfigs.peakOutputForward = .7;
        srxConfigs.peakOutputReverse = -.5;
        // Sets the motor configuration to the settings above.
        m_CTREMotor.configAllSettings(srxConfigs);
        
        // Sets wether the motor should be inverted
        m_CTREMotor.setInverted(false);

        // Sets the idke mode to break, basicly makes the motor break when it is not being told to move.
        // You almost allways want it to be break
        m_CTREMotor.setNeutralMode(NeutralMode.Brake);

        // Tells the motor how much current to pull, determents its speed, on a range from -1, 1.
        // Can be thought of as telling the motor to move at blank persent power. 
        // Negitives have the motor turn in reverse.
        // The motor will continue at this power untill it is changed
        // .set(Control type(will be relivent when we talk about PID loops, power)
        m_CTREMotor.set(ControlMode.PercentOutput, .5);
    }    
}
