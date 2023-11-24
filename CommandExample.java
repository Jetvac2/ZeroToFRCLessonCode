// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.ArmPivotSubsystem;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class MoveArmPivotToPlaceLocaiton extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  // The desired CPR of 2000 and the exceptable error range should both be constents.
  private final ArmPivotSubsystem m_armPivotSubsystem;

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public MoveArmPivotToPlaceLocaiton(ArmPivotSubsystem m_armPivotSubsystem) {
    this.m_armPivotSubsystem = m_armPivotSubsystem;

    // Use addRequirements() here to declare subsystem dependencies.
    // To add extra dependencies simple add a , and then add the name of the next dependency 
    addRequirements(this.m_armPivotSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    // Nothing is needed here for this command
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    this.m_armPivotSubsystem.setPivotAngleCPR(2000);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    // Nothing is needed here for this command
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    double pivotPositionCPR = m_armPivotSubsystem.getPivotPositionCPR();
    return 2000+5 <= pivotPositionCPR && pivotPositionCPR >= 2000-5;
  }
}
