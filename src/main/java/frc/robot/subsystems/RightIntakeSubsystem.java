// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.commands.WingCommandRight;
import org.photonvision.PhotonCamera;

public class RightIntakeSubsystem extends SubsystemBase {

  private DoubleSolenoid rightJaw = new DoubleSolenoid(PneumaticsModuleType.REVPH,Constants.rightCloseX,Constants.rightOpenX);
  private DoubleSolenoid rightWing= new DoubleSolenoid(PneumaticsModuleType.REVPH,Constants.rightLiftX,Constants.rightDropX);

  public PhotonCamera RightSideCamera = new PhotonCamera(Constants.rightSideCamera);


  /** Creates a new RightIntakeSubsystem. */
  public RightIntakeSubsystem() {
    rightJaw.set(Value.kReverse);
    rightWing.set(Value.kReverse); 
  }

  public void toggleRightJaw (){
    //System.out.println(rightJaw.get().toString());
    rightJaw.toggle();
    }

        // Closes right Jaw
    public void rightJawOpen(){
      rightJaw.set(Value.kReverse);
    }

      //Open right Jaw
    public void rightJawClose(){
      rightJaw.set(Value.kForward);
    }

      //Drop right Wing
    public void rightWingDrop(){
      rightWing.set(Value.kReverse);
    }
      //Lift right Wing
    public void rightWingLift(){
      rightWing.set(Value.kForward);
    }


      //lifts right wing if it is already dropped
    public void liftRightWing() {
      if (rightWing.get() != Value.kForward)
        rightWing.set(Value.kForward);
    }
    //drops right wing if it is already liften
    public void dropRightWing() {
      if (rightWing.get() != Value.kReverse)
        rightWing.set(Value.kReverse);
    }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    setDefaultCommand(new WingCommandRight());
  }
}
