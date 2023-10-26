import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.StatusFrame;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.TalonSRXConfiguration;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.SparkMaxPIDController;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class PIDExample{
    // When nameing a motor in FRC always prefix the name with m_.
    // This is a motor that is connected to a SparkMax motor controler
    private CANSparkMax m_sparkMotor;
    
    // This is a PID controller object
    private SparkMaxPIDController sparkMaxPID;

    // This is a motor that is connected to a TalonSRX motor controler
    private TalonSRX m_CTREMotor;

    public PIDExample() {
        this.m_sparkMotor = new CANSparkMax(0, MotorType.kBrushless);
        this.m_CTREMotor = new WPI_TalonSRX(1);

        m_sparkMotor.restoreFactoryDefaults();
        this.m_sparkMotor.setInverted(false);
        this.m_sparkMotor.setIdleMode(IdleMode.kBrake);
        
        // Setting the PID controller to the m_SparkMotor built in PID
        // Neos will automaticly make use of there built in encoders
        this.sparkMaxPID = this.m_sparkMotor.getPIDController();
        // Setting the P, I and D values
        // As you can see they are small values, this is a example value for a velocity PID
        this.sparkMaxPID.setP(0.0006000000142492354);
        this.sparkMaxPID.setI(0);
        this.sparkMaxPID.setD(0);
        // This is the Integrator zone, this can be set to 0 most times.
        this.sparkMaxPID.setIZone(0);

        this.m_sparkMotor.burnFlash();

        //Example of setting the motor to move at a set velocity, velocity is in encoder pulses per second
        // This desired velocity will stay untill you change it, the same is true with positonal control
        this.sparkMaxPID.setReference(13000, CANSparkMax.ControlType.kVelocity);

        // Creates a CTRE configeration
        TalonSRXConfiguration srxConfigs = new TalonSRXConfiguration();
        srxConfigs.nominalOutputForward = 0;
        srxConfigs.nominalOutputReverse = 0;
        srxConfigs.peakOutputForward = .7;
        srxConfigs.peakOutputReverse = -.5;

        // Sets the type of encoder that the control is conected to
        // Analog is another name for a absolute encoder
        // A full list of types can be found in Pheonix tuner, we will cover how to find this in a later lesson
        srxConfigs.primaryPID.selectedFeedbackSensor = FeedbackDevice.Analog;
        // Sets wether you are using a continuos control system, this should be false
        srxConfigs.feedbackNotContinuous = false;
        // Speed the motor will take to go from nuetral to max speed
        srxConfigs.closedloopRamp = 0;
        // Status frame, or the control mode, Status frame 2 is positnal, status frame 1 is velocity
        m_CTREMotor.setStatusFramePeriod(StatusFrame.Status_2_Feedback0, 20);

        // Argument 1, PID loop ID. Argument 2, the amount of velocity or positinal error that it will not try to fix, Argument 3, time out time in millaseconds.
        m_CTREMotor.configAllowableClosedloopError(0, .25, 10); 

        // Wether or not to invert the encoder output
        m_CTREMotor.setSensorPhase(false);

        m_CTREMotor.configAllSettings(srxConfigs);
        m_CTREMotor.setInverted(false);
        m_CTREMotor.setNeutralMode(NeutralMode.Brake);
        
        // Sets the P, I and D values
        // The first argument is the PID id, the ctre motors can save more than one set of PID values.
        // The second argument is the value of the P, I or D
        // The third argument is the timeout in millaseconds, this does not really matter. I just generly set it to 10. 

        // These are example values for a positional PID
        m_CTREMotor.config_kP(0, 12, 10);
        m_CTREMotor.config_kI(0, 12, 10);
        m_CTREMotor.config_kD(0, 12, 10);
        
        // The Control mode, in this case positon, the second
        // argument is the encoder pulses to go to. So the motor in this case will move till 1024 encoder pulses. 
        m_CTREMotor.set(ControlMode.Position, 1024);
    }    
}
