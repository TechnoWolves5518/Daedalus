// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ServoSubsystem extends SubsystemBase {

private Servo leftServo = new Servo(Constants.leftServoPWM);
private Servo rightServo = new Servo(Constants.rightServoPWM);


  /** Creates a new ServoSubsystem. */
  public ServoSubsystem() {
    leftServo.set(Constants.leftServoUp);
    rightServo.set(Constants.rightServoUp);
  }

  public void servoUpCommand(){
    leftServo.set(Constants.leftServoUp);
    rightServo.set(Constants.rightServoUp); 
  }

  public void servoDownCommand(){
    leftServo.set(Constants.leftServoDown);
    rightServo.set(Constants.rightServoDown); 
  }

  public void servoLeftUpCommand(){
    leftServo.set(Constants.leftServoUp);
  }

  public void servoLeftDownCommand(){
    leftServo.set(Constants.leftServoDown);
  }

  public void servoRightUpCommand(){
    rightServo.set(Constants.rightServoUp);
  }

  public void servoRightDownCommand(){
    rightServo.set(Constants.rightServoDown);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
