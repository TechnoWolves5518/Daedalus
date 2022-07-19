// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.LeftIntake;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;


public class LeftJawToggle extends CommandBase {
 
  /** Creates a new LeftJawToggle. */
  public LeftJawToggle() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.m_leftIntakeSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

  Robot.m_leftIntakeSubsystem.toggleLeftJaw();
  //Robot.m_leftIntakeSubsystem.leftWingLift();

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}