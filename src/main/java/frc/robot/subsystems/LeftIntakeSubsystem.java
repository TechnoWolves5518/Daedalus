// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.commands.WingCommand;



public class LeftIntakeSubsystem extends SubsystemBase {

  private DoubleSolenoid leftJaw = new DoubleSolenoid(PneumaticsModuleType.REVPH,Constants.leftCloseX,Constants.leftOpenX);
  private DoubleSolenoid leftWing= new DoubleSolenoid(PneumaticsModuleType.REVPH,Constants.leftLiftX,Constants.leftDropX);







   /** Creates a new LeftIntakeSubsystem. */
  public LeftIntakeSubsystem() {
    leftJaw.set(Value.kReverse);
    leftWing.set(Value.kReverse);  
  }

  public void toggleLeftJaw (){
    //System.out.println(leftJaw.get().toString());
    leftJaw.toggle();
    }

        // Closes Left Jaw
    public void leftJawOpen(){
      leftJaw.set(Value.kReverse);
    }

      //Open Left Jaw
    public void leftJawClose(){
      leftJaw.set(Value.kForward);
    }

      //Drop Left Wing
    public void leftWingDrop(){
      leftWing.set(Value.kReverse);
    }
      //Lift Left Wing
    public void leftWingLift(){
      leftWing.set(Value.kForward);
      
    }


      //lifts left wing if it is already dropped
    public void liftLeftWing() {
      if (leftWing.get() != Value.kForward)
        leftWing.set(Value.kForward);
    }
    //drops left wing if it is already liften
    public void dropLeftWing() {
      if (leftWing.get() != Value.kReverse)
        leftWing.set(Value.kReverse);
    }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    setDefaultCommand(new WingCommand());
  }
}
