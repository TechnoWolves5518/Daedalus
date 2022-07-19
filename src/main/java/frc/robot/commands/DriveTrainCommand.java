// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
//import java.lang.module.ModuleDescriptor.Requires;
//import javax.lang.model.element.ModuleElement.RequiresDirective;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.ADIS16448_IMU;
//import edu.wpi.first.wpilibj.AnalogGyro;
//import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.ADIS16470_IMU;
import edu.wpi.first.wpilibj.SPI;




public class DriveTrainCommand extends CommandBase {
  /** Creates a new DriveTrainCommand. */
  //private static final SPI.Port kGyroPort = SPI.Port.kOnboardCS0;
  //private ADIS16470_IMU m_IMUMG = new ADIS16470_IMU();
  
  
  public DriveTrainCommand() {
    // Use addRequirements() here to declare subsystem dependencies.
  
    addRequirements(Robot.m_driveTrainSub);
  }

  //private void Requires(DriveTrainSub driveTrainSub) {
  //}

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    double angle = Robot.m_IMUMG.getAngle();
    double strafe = Robot.m_robotContainer.GetDriverRaeAxis(Constants.XBOX_LSTICKX);
    double drive = Robot.m_robotContainer.GetDriverRaeAxis(Constants.XBOX_LSTICKY);
    double turn = Robot.m_robotContainer.GetDriverRaeAxis(Constants.XBOX_RSTICKX);  
   

    if (drive <=0.05){
      if(drive >= -0.05){
        drive = 0;
      }
    }
    if (strafe <=0.05){
      if(strafe >= -0.05){
        strafe = 0;
      }
    }
    if (turn <=0.05){
      if(turn >= -0.05){
        turn = 0;
      }
    }
   
  
    Robot.m_driveTrainSub.mecanumDrive1(drive,strafe,turn,angle);

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {

    Robot.m_driveTrainSub.mecanumDrive1(0,0,0,0);

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
