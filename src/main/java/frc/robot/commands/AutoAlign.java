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
import edu.wpi.first.math.util.Units;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.XboxController;

public class AutoAlign extends CommandBase {
  private PhotonCamera shootCamera = new PhotonCamera(Constants.shootCamera);
 
  final double CAMERA_HEIGHT_METERS = Units.inchesToMeters(24);
  final double TARGET_HEIGHT_METERS = Units.feetToMeters(5);
  final double CAMERA_PITCH_RADIANS = Units.degreesToRadians(0);
  final double GOAL_RANGE_METERS = Units.feetToMeters(3);
  final double LINEAR_P = 0.1;
  final double LINEAR_D = 0.0;
  PIDController forwardController = new PIDController(LINEAR_P, 0, LINEAR_D);

  final double ANGULAR_P = 0.1;
  final double ANGULAR_D = 0.0;
  PIDController turnController = new PIDController(ANGULAR_P, 0, ANGULAR_D);

  public double rotationSpeed = 0;
  private static XboxController driverController = new XboxController(Constants.driveTrainController);




  // PhotonPipelineResult resultLeft = leftSideCamera.getLatestResult();
  // boolean hasTargetLeft = resultLeft.hasTargets();
  // PhotonTrackedTarget targets = resultLeft.getBestTarget();
  


  /** Creates a new LeftWingLift. */
  public AutoAlign() {
    // Use addRequirements() here to declare subsystem dependencies.
   // addRequirements(Robot.m_pneaumaticSubsystem);
    addRequirements(Robot.m_driveTrainSub);
   // addRequirements(Robot.m_rightIntakeSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    //addRequirements(Robot.m_driveTrainSub);
    double leftTrigger = RobotContainer.driverController.getRawAxis(Constants.XBOX_LTRIGGER);
    

    //check if there are targets, if it exists, turn, if not, stay still
    var result = shootCamera.getLatestResult();
    if (leftTrigger >= 0.9){
      System.out.println("trigger enabled");
      if (result.hasTargets()) {
        rotationSpeed = -turnController.calculate(result.getBestTarget().getYaw(), 0);
        System.out.println("Turning");
      }
      else {
        rotationSpeed = 0;
        System.out.println("Not turning");
      }
      Robot.m_driveTrainSub.mecanumDrive1(0, 0,rotationSpeed * 0.15);
    } else {
      System.out.println("Trigger disabled");
    }
    }
  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    Robot.m_driveTrainSub.mecanumDrive1(0,0,0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
