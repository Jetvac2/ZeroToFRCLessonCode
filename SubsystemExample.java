package frc.robot.subsystems;
import com.revrobotics.CANSparkMax;
import com.revrobotics.SparkMaxPIDController;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArmPivotSubsystem extends SubsystemBase{
    // The CAN IDs and PID values should all be constants
    private CANSparkMax m_pivot;
    private SparkMaxPIDController pivotPID;

    public ArmPivotSubsystem() {
        this.m_pivot = new CANSparkMax(0, MotorType.kBrushless);

        this.m_pivot.restoreFactoryDefaults();
        this.m_pivot.setInverted(false);
        this.m_pivot.setIdleMode(IdleMode.kBrake);

        this.pivotPID = this.m_pivot.getPIDController();
        this.pivotPID.setP(0.0004);
        this.pivotPID.setI(0);
        this.pivotPID.setD(0);
        this.pivotPID.setIZone(.1);

        this.m_pivot.burnFlash();
    }

    // CPR is short for counts per rev, or encoder pulses
    public void setPivotAngleCPR(double angleInCPR) {
        this.pivotPID.setReference(angleInCPR, CANSparkMax.ControlType.kPosition);
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run   
    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run during simulation
    }
}
