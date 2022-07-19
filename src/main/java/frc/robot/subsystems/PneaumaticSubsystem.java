// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.PneumaticsModuleType;





public class PneaumaticSubsystem extends SubsystemBase {

 // public DoubleSolenoid leftJaw = new DoubleSolenoid(PneumaticsModuleType.REVPH,Constants.leftCloseX,Constants.leftOpenX);
 // public DoubleSolenoid rightJaw = new DoubleSolenoid(PneumaticsModuleType.REVPH,Constants.rightCloseX,Constants.rightOpenX);
 // public DoubleSolenoid leftWing= new DoubleSolenoid(PneumaticsModuleType.REVPH,Constants.leftLiftX,Constants.leftDropX);
  //public DoubleSolenoid rightWing= new DoubleSolenoid(PneumaticsModuleType.REVPH,Constants.rightLiftX,Constants.rightDropX);
 // private DoubleSolenoid leftShoot = new DoubleSolenoid(PneumaticsModuleType.REVPH,Constants.shoot1,Constants.unShoot1);
 // private DoubleSolenoid rightShoot = new DoubleSolenoid(PneumaticsModuleType.REVPH,Constants.shoot2,Constants.unShoot2);
 
  private Compressor phCompressor = new Compressor(1,PneumaticsModuleType.REVPH);


  // Starts the Compressor
  public void compressorStart(){
    phCompressor.enableDigital();
  }

  // Stops the Compressor
  public void compressorStop(){
    phCompressor.disable();
  }

  /** Creates a new PneaumaticSubsystem. */
  public PneaumaticSubsystem() {
  /** Moved to LeftIntate Subsustem
   * 
   // leftJaw.set(Value.kReverse);
   // rightJaw.set(Value.kReverse);
   */
   // leftShoot.set(Value.kReverse);
   // rightShoot.set(Value.kReverse);
  }
  

/**  
  public void toggleShoot(){

      leftShoot.toggle();
      rightShoot.toggle();

  }
*/


  /**    moved to leftIntakeSubsystem
   * 
  public void toggleLeftJaw (){
    System.out.println(leftJaw.get().toString());
    leftJaw.toggle();
    // if (leftJaw.get().equals(Value.kForward)) {
    //   leftJaw.set(Value.kReverse);
    // } else {
    //   leftJaw.set(Value.kForward);
    // }
    }
     
    */

    /** moved to Right Intake System
    public void toggleRightJaw (){
      System.out.println(rightJaw.get().toString());
      rightJaw.toggle();
    

      // if (rightJaw.get().equals(Value.kForward)) {
      //   rightJaw.set(Value.kReverse);
      // } else {
      //   rightJaw.set(Value.kForward);
      // }
      }
    */


    /** Moved to leftIntakeSubsystem 
     * 
        // Closes Left Jaw
    public void leftJawOpen(){
      leftJaw.set(Value.kReverse);
    }

      //Open Left Jaw
    public void leftJawClose(){
      leftJaw.set(Value.kReverse);
    }

    public void liftLeftWing() {
      if (leftWing.get() != Value.kForward)
        leftWing.set(Value.kForward);
    }

    public void dropLeftWing() {
      if (leftWing.get() != Value.kReverse)
        leftWing.set(Value.kReverse);
    }
    */

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
   
   
   // moved to Left Intake Subsustem
   // setDefaultCommand(new WingCommand());
   //
  }
}
