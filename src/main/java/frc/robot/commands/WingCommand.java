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


public class WingCommand extends CommandBase {
  private PhotonCamera leftSideCamera = new PhotonCamera(Constants.leftSideCamera);
 


  // PhotonPipelineResult resultLeft = leftSideCamera.getLatestResult();
  // boolean hasTargetLeft = resultLeft.hasTargets();
  // PhotonTrackedTarget targets = resultLeft.getBestTarget();
  


  /** Creates a new LeftWingLift. */
  public WingCommand() {
    // Use addRequirements() here to declare subsystem dependencies.
   // addRequirements(Robot.m_pneaumaticSubsystem);
    addRequirements(Robot.m_leftIntakeSubsystem);
   // addRequirements(Robot.m_rightIntakeSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  
    boolean leftHasTargets = leftSideCamera.hasTargets();
    double leftTrigger = RobotContainer.driverController.getRawAxis(Constants.XBOX_LTRIGGER);
   //   double rightTrigger = RobotContainer.driverController.getRawAxis(Constants.XBOX_RTRIGGER);

    /** 
    if (leftTrigger == 0.0) {
      new WaitCommand(0.01);
    } 
    */

/* 
    if (leftTrigger >= 0.9){
    
      if (leftHasTargets){
      PhotonPipelineResult resultLeft = leftSideCamera.getLatestResult();
      boolean hasTargetLeft = resultLeft.hasTargets();
      PhotonTrackedTarget targetLeft = resultLeft.getBestTarget();
      double areaLeft = targetLeft.getArea();
    
  
        if (hasTargetLeft){
          if (areaLeft >= 60){
          Robot.m_leftIntakeSubsystem.leftJawClose(); 
          }
        }
      }
    }*/
    

    /** 
    if (rightTrigger == 0.0) {
      new WaitCommand(0.01);
    } 
    else if (rightTrigger >= 0.9){
      Robot.m_rightIntakeSubsystem.liftRightWing();  
    }
    else {
        Robot.m_rightIntakeSubsystem.dropRightWing();
    }
  
  */
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
