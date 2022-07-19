// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.CompressorStart;
import frc.robot.commands.CompressorStop;
import frc.robot.commands.ShootTheBall1;
import frc.robot.commands.LeftIntake.LeftIntake;
import frc.robot.commands.LeftIntake.LeftJawToggle;
import frc.robot.commands.RightIntake.RightIntake;
import frc.robot.commands.RightIntake.RightJawToggle;
import frc.robot.commands.ServoCommands.SetServoUp;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a`
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {

  public double GetDriverRaeAxis(int axis){
    return driverController.getRawAxis(axis);
    }

public static XboxController driverController = new XboxController(Constants.driveTrainController);

JoystickButton lBButton = new JoystickButton(driverController, Constants.XBOX_LBUMPER);
JoystickButton rBButton = new JoystickButton(driverController, Constants.XBOX_RBUMPER);
JoystickButton xButton = new JoystickButton(driverController, Constants.XBOX_XBTN);
JoystickButton yButton = new JoystickButton(driverController, Constants.XBOX_YBTN);
JoystickButton startButton = new JoystickButton(driverController, Constants.XBOX_START);
JoystickButton backButton = new JoystickButton(driverController, Constants.XBOX_BACK);
JoystickButton aButton = new JoystickButton(driverController, Constants.XBOX_ABTN);
JoystickButton bButton = new JoystickButton(driverController, Constants.XBOX_BBTN);

double zLLtrigger = driverController.getRawAxis(Constants.XBOX_LTRIGGER);



  // The robot's subsystems and commands are defined here...

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();

    }

    
  

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {

      //  Want to make this a toggle on a button but failed  
   // lBButton.toggleWhenPressed(new ConditionalCommand(new LeftJawClose(), new LeftJawOpen(), lBButton));
    //lBButton.whenPressed(new LeftJawToggle());

    xButton.whenPressed(new LeftJawToggle());
    //////////Put this Back
    yButton.whenPressed(new ShootTheBall1());
    ///////////
    // yButton.whenPressed(new SetServoDown());

    startButton.whenPressed(new CompressorStart());
    backButton.whenPressed(new CompressorStop());
    //////////
  //  Want to make this a toggle on a button but failed  
  //  rBButton.toggleWhenPressed(new ConditionalCommand(new RightJawClose(), new RightJawOpen(), rBButton));
    aButton.whenPressed(new RightJawToggle());
    bButton.whenPressed(new SetServoUp());

    lBButton.whenPressed(new LeftIntake());
    rBButton.whenPressed(new RightIntake());

  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return null;

  }
}
