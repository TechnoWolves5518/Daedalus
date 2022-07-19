// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ShooterSubsystem extends SubsystemBase {
  private DoubleSolenoid leftShoot = new DoubleSolenoid(PneumaticsModuleType.REVPH,Constants.shoot1,Constants.unShoot1);
  private DoubleSolenoid rightShoot = new DoubleSolenoid(PneumaticsModuleType.REVPH,Constants.shoot2,Constants.unShoot2);
 


  /** Creates a new ShooterSubsystem. */
  public ShooterSubsystem() {
    leftShoot.set(Value.kReverse);
    rightShoot.set(Value.kReverse);
  }

  public void shootTheBall(){
    leftShoot.set(Value.kForward);
    rightShoot.set(Value.kForward);
  }

  public void unshootTheBall(){
    leftShoot.set(Value.kReverse);
    rightShoot.set(Value.kReverse);
  }

  public void turnOffShoot(){
    leftShoot.set(Value.kOff);
    rightShoot.set(Value.kOff);
  }



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
