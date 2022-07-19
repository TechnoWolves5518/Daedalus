// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Robot;
import frc.robot.RobotContainer;
import org.photonvision.PhotonCamera;
import org.photonvision.targeting.PhotonPipelineResult;
import org.photonvision.targeting.PhotonTrackedTarget;

public class WingCommandRight extends CommandBase {
  private PhotonCamera rightSideCamera = new PhotonCamera(Constants.rightSideCamera);


  /** Creates a new WingCommandRight. */
  public WingCommandRight() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.m_rightIntakeSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double rightTrigger = RobotContainer.driverController.getRawAxis(Constants.XBOX_RTRIGGER);
    boolean rightHasTargets = rightSideCamera.hasTargets();

    if (rightTrigger >= 0.9){
      if (rightHasTargets){
        PhotonPipelineResult resultRight = rightSideCamera.getLatestResult();
        boolean hasTargetRight = resultRight.hasTargets();
        PhotonTrackedTarget targetRight = resultRight.getBestTarget();
        double areaRight = targetRight.getArea();
    
          if (hasTargetRight){
            if (areaRight >= 60){
            Robot.m_rightIntakeSubsystem.rightJawClose(); 
            }
          }
        }
    }

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
