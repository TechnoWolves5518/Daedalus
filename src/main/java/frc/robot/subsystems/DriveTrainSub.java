// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
//import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import frc.robot.Constants;
import frc.robot.commands.DriveTrainCommand;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import frc.robot.commands.AutoAlign;



public class DriveTrainSub extends SubsystemBase {

 
  private CANSparkMax moterFrontLeft = new CANSparkMax(Constants.frontLeft, MotorType.kBrushless);
  private CANSparkMax moterRearLeft = new CANSparkMax(Constants.rearLeft, MotorType.kBrushless);
  private CANSparkMax moterFrontRight = new CANSparkMax(Constants.frontRight, MotorType.kBrushless);
  private CANSparkMax moterRearRight= new CANSparkMax(Constants.rearRight, MotorType.kBrushless);

 // private VictorSP moterFrontLeft = new VictorSP(Constants.frontLeft);
  //private VictorSP moterRearLeft = new VictorSP(Constants.rearLeft);
 // private VictorSP moterFrontRight = new VictorSP(Constants.frontRight);
 // private VictorSP moterRearRight = new VictorSP(Constants.rearRight);

 





  MecanumDrive drive1 = new MecanumDrive(moterFrontLeft,moterRearLeft,moterFrontRight,moterRearRight);

  public void mecanumDrive1(double drive, double strafe, double turn) {


    moterFrontLeft.setInverted(true);
    moterRearLeft.setInverted(true);
    
    drive1.driveCartesian(drive, -strafe, -turn);
    

    //drive1.driveCartesian(ySpeed, xSpeed, zRotation);
  } 



  /** Creates a new Drivetrain. */
  public DriveTrainSub() {
  }
  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    setDefaultCommand(new AutoAlign());
  }



}

